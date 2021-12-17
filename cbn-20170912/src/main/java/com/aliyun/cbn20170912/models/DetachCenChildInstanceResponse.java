// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DetachCenChildInstanceResponse} extends {@link TeaModel}
 *
 * <p>DetachCenChildInstanceResponse</p>
 */
public class DetachCenChildInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachCenChildInstanceResponseBody body;


    private DetachCenChildInstanceResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachCenChildInstanceResponse create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public DetachCenChildInstanceResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private DetachCenChildInstanceResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(DetachCenChildInstanceResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * <p>headers.</p>
         */
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>body.</p>
         */
        public Builder body(DetachCenChildInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        public DetachCenChildInstanceResponse build() {
            return new DetachCenChildInstanceResponse(this);
        } 

    } 

}
