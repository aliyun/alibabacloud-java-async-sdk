// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeprecatedTemplateResponse} extends {@link TeaModel}
 *
 * <p>DescribeDeprecatedTemplateResponse</p>
 */
public class DescribeDeprecatedTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDeprecatedTemplateResponseBody body;

    private DescribeDeprecatedTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDeprecatedTemplateResponse create() {
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
    public DescribeDeprecatedTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDeprecatedTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDeprecatedTemplateResponseBody body);

        @Override
        DescribeDeprecatedTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDeprecatedTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDeprecatedTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDeprecatedTemplateResponse response) {
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
        public Builder body(DescribeDeprecatedTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDeprecatedTemplateResponse build() {
            return new DescribeDeprecatedTemplateResponse(this);
        } 

    } 

}
