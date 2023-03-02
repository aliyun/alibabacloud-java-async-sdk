// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyDataModelConfigInfoResponse} extends {@link TeaModel}
 *
 * <p>ApplyDataModelConfigInfoResponse</p>
 */
public class ApplyDataModelConfigInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApplyDataModelConfigInfoResponseBody body;

    private ApplyDataModelConfigInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApplyDataModelConfigInfoResponse create() {
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
    public ApplyDataModelConfigInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApplyDataModelConfigInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApplyDataModelConfigInfoResponseBody body);

        @Override
        ApplyDataModelConfigInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApplyDataModelConfigInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApplyDataModelConfigInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApplyDataModelConfigInfoResponse response) {
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
        public Builder body(ApplyDataModelConfigInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApplyDataModelConfigInfoResponse build() {
            return new ApplyDataModelConfigInfoResponse(this);
        } 

    } 

}
