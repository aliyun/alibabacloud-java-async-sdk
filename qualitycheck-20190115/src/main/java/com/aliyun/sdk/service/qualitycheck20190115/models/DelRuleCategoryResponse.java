// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DelRuleCategoryResponse} extends {@link TeaModel}
 *
 * <p>DelRuleCategoryResponse</p>
 */
public class DelRuleCategoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DelRuleCategoryResponseBody body;

    private DelRuleCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DelRuleCategoryResponse create() {
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
    public DelRuleCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DelRuleCategoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DelRuleCategoryResponseBody body);

        @Override
        DelRuleCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DelRuleCategoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DelRuleCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DelRuleCategoryResponse response) {
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
        public Builder body(DelRuleCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DelRuleCategoryResponse build() {
            return new DelRuleCategoryResponse(this);
        } 

    } 

}
