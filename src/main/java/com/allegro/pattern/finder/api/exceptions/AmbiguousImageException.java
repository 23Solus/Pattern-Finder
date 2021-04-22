package com.allegro.pattern.finder.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Bad Request response when provided image has more than 1 pattern and they're conflicting
 */
@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Image has conflicting patterns.")
public class AmbiguousImageException extends RuntimeException { }