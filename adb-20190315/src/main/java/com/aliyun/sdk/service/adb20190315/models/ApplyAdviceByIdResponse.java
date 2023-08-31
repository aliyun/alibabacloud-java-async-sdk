// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyAdviceByIdResponse} extends {@link TeaModel}
 *
 * <p>ApplyAdviceByIdResponse</p>
 */
public class ApplyAdviceByIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApplyAdviceByIdResponseBody body;

    private ApplyAdviceByIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApplyAdviceByIdResponse create() {
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
    public ApplyAdviceByIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApplyAdviceByIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApplyAdviceByIdResponseBody body);

        @Override
        ApplyAdviceByIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApplyAdviceByIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApplyAdviceByIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApplyAdviceByIdResponse response) {
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
        public Builder body(ApplyAdviceByIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApplyAdviceByIdResponse build() {
            return new ApplyAdviceByIdResponse(this);
        } 

    } 

}
