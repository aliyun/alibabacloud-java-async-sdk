// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHtmlResourceResponse} extends {@link TeaModel}
 *
 * <p>DescribeHtmlResourceResponse</p>
 */
public class DescribeHtmlResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeHtmlResourceResponseBody body;

    private DescribeHtmlResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeHtmlResourceResponse create() {
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
    public DescribeHtmlResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeHtmlResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeHtmlResourceResponseBody body);

        @Override
        DescribeHtmlResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeHtmlResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeHtmlResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeHtmlResourceResponse response) {
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
        public Builder body(DescribeHtmlResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeHtmlResourceResponse build() {
            return new DescribeHtmlResourceResponse(this);
        } 

    } 

}
