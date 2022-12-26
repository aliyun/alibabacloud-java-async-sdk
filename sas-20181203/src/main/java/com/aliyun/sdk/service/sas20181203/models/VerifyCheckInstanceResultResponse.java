// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyCheckInstanceResultResponse} extends {@link TeaModel}
 *
 * <p>VerifyCheckInstanceResultResponse</p>
 */
public class VerifyCheckInstanceResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private VerifyCheckInstanceResultResponseBody body;

    private VerifyCheckInstanceResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static VerifyCheckInstanceResultResponse create() {
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
    public VerifyCheckInstanceResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VerifyCheckInstanceResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(VerifyCheckInstanceResultResponseBody body);

        @Override
        VerifyCheckInstanceResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VerifyCheckInstanceResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private VerifyCheckInstanceResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VerifyCheckInstanceResultResponse response) {
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
        public Builder body(VerifyCheckInstanceResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VerifyCheckInstanceResultResponse build() {
            return new VerifyCheckInstanceResultResponse(this);
        } 

    } 

}
