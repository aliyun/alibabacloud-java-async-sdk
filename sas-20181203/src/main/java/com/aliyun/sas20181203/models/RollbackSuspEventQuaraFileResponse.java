// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link RollbackSuspEventQuaraFileResponse} extends {@link TeaModel}
 *
 * <p>RollbackSuspEventQuaraFileResponse</p>
 */
public class RollbackSuspEventQuaraFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RollbackSuspEventQuaraFileResponseBody body;


    private RollbackSuspEventQuaraFileResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RollbackSuspEventQuaraFileResponse create() {
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
    public RollbackSuspEventQuaraFileResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private RollbackSuspEventQuaraFileResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(RollbackSuspEventQuaraFileResponse response) {
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
        public Builder body(RollbackSuspEventQuaraFileResponseBody body) {
            this.body = body;
            return this;
        }

        public RollbackSuspEventQuaraFileResponse build() {
            return new RollbackSuspEventQuaraFileResponse(this);
        } 

    } 

}
