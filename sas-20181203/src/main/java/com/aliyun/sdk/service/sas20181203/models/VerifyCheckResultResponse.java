// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyCheckResultResponse} extends {@link TeaModel}
 *
 * <p>VerifyCheckResultResponse</p>
 */
public class VerifyCheckResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private VerifyCheckResultResponseBody body;

    private VerifyCheckResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static VerifyCheckResultResponse create() {
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
    public VerifyCheckResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VerifyCheckResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(VerifyCheckResultResponseBody body);

        @Override
        VerifyCheckResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VerifyCheckResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private VerifyCheckResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VerifyCheckResultResponse response) {
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
        public Builder body(VerifyCheckResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VerifyCheckResultResponse build() {
            return new VerifyCheckResultResponse(this);
        } 

    } 

}
