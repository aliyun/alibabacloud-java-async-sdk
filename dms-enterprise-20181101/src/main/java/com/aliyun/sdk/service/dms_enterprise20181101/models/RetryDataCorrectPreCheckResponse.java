// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RetryDataCorrectPreCheckResponse} extends {@link TeaModel}
 *
 * <p>RetryDataCorrectPreCheckResponse</p>
 */
public class RetryDataCorrectPreCheckResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RetryDataCorrectPreCheckResponseBody body;

    private RetryDataCorrectPreCheckResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RetryDataCorrectPreCheckResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
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
    public RetryDataCorrectPreCheckResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RetryDataCorrectPreCheckResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RetryDataCorrectPreCheckResponseBody body);

        @Override
        RetryDataCorrectPreCheckResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RetryDataCorrectPreCheckResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RetryDataCorrectPreCheckResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RetryDataCorrectPreCheckResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(RetryDataCorrectPreCheckResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RetryDataCorrectPreCheckResponse build() {
            return new RetryDataCorrectPreCheckResponse(this);
        } 

    } 

}
