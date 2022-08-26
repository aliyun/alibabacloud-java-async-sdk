// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyApproveResponse} extends {@link TeaModel}
 *
 * <p>ApplyApproveResponse</p>
 */
public class ApplyApproveResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApplyApproveResponseBody body;

    private ApplyApproveResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApplyApproveResponse create() {
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
    public ApplyApproveResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApplyApproveResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApplyApproveResponseBody body);

        @Override
        ApplyApproveResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApplyApproveResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApplyApproveResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApplyApproveResponse response) {
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
        public Builder body(ApplyApproveResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApplyApproveResponse build() {
            return new ApplyApproveResponse(this);
        } 

    } 

}
