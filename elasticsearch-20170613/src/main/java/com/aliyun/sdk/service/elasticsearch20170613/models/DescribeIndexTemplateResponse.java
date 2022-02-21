// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIndexTemplateResponse} extends {@link TeaModel}
 *
 * <p>DescribeIndexTemplateResponse</p>
 */
public class DescribeIndexTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeIndexTemplateResponseBody body;

    private DescribeIndexTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeIndexTemplateResponse create() {
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
    public DescribeIndexTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeIndexTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeIndexTemplateResponseBody body);

        @Override
        DescribeIndexTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeIndexTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeIndexTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeIndexTemplateResponse response) {
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
        public Builder body(DescribeIndexTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeIndexTemplateResponse build() {
            return new DescribeIndexTemplateResponse(this);
        } 

    } 

}
