// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRuleCategoryResponse} extends {@link TeaModel}
 *
 * <p>GetRuleCategoryResponse</p>
 */
public class GetRuleCategoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRuleCategoryResponseBody body;

    private GetRuleCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRuleCategoryResponse create() {
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
    public GetRuleCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRuleCategoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRuleCategoryResponseBody body);

        @Override
        GetRuleCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRuleCategoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRuleCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRuleCategoryResponse response) {
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
        public Builder body(GetRuleCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRuleCategoryResponse build() {
            return new GetRuleCategoryResponse(this);
        } 

    } 

}
