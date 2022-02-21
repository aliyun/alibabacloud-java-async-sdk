// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCategoryResponse} extends {@link TeaModel}
 *
 * <p>DescribeCategoryResponse</p>
 */
public class DescribeCategoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCategoryResponseBody body;

    private DescribeCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCategoryResponse create() {
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
    public DescribeCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCategoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCategoryResponseBody body);

        @Override
        DescribeCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCategoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCategoryResponse response) {
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
        public Builder body(DescribeCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCategoryResponse build() {
            return new DescribeCategoryResponse(this);
        } 

    } 

}
