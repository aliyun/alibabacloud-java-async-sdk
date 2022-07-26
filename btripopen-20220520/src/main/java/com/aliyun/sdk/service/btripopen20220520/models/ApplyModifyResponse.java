// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyModifyResponse} extends {@link TeaModel}
 *
 * <p>ApplyModifyResponse</p>
 */
public class ApplyModifyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApplyModifyResponseBody body;

    private ApplyModifyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApplyModifyResponse create() {
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
    public ApplyModifyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApplyModifyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApplyModifyResponseBody body);

        @Override
        ApplyModifyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApplyModifyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApplyModifyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApplyModifyResponse response) {
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
        public Builder body(ApplyModifyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApplyModifyResponse build() {
            return new ApplyModifyResponse(this);
        } 

    } 

}
