// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link EnableCenVbrHealthCheckResponse} extends {@link TeaModel}
 *
 * <p>EnableCenVbrHealthCheckResponse</p>
 */
public class EnableCenVbrHealthCheckResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableCenVbrHealthCheckResponseBody body;


    private EnableCenVbrHealthCheckResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableCenVbrHealthCheckResponse create() {
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
    public EnableCenVbrHealthCheckResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private EnableCenVbrHealthCheckResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(EnableCenVbrHealthCheckResponse response) {
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
        public Builder body(EnableCenVbrHealthCheckResponseBody body) {
            this.body = body;
            return this;
        }

        public EnableCenVbrHealthCheckResponse build() {
            return new EnableCenVbrHealthCheckResponse(this);
        } 

    } 

}
