// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddRuleCategoryResponse} extends {@link TeaModel}
 *
 * <p>AddRuleCategoryResponse</p>
 */
public class AddRuleCategoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddRuleCategoryResponseBody body;

    private AddRuleCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddRuleCategoryResponse create() {
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
    public AddRuleCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddRuleCategoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddRuleCategoryResponseBody body);

        @Override
        AddRuleCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddRuleCategoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddRuleCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddRuleCategoryResponse response) {
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
        public Builder body(AddRuleCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddRuleCategoryResponse build() {
            return new AddRuleCategoryResponse(this);
        } 

    } 

}
