// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCasterHtmlResourceResponse} extends {@link TeaModel}
 *
 * <p>DescribeCasterHtmlResourceResponse</p>
 */
public class DescribeCasterHtmlResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCasterHtmlResourceResponseBody body;

    private DescribeCasterHtmlResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCasterHtmlResourceResponse create() {
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
    public DescribeCasterHtmlResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCasterHtmlResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCasterHtmlResourceResponseBody body);

        @Override
        DescribeCasterHtmlResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCasterHtmlResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCasterHtmlResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCasterHtmlResourceResponse response) {
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
        public Builder body(DescribeCasterHtmlResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCasterHtmlResourceResponse build() {
            return new DescribeCasterHtmlResourceResponse(this);
        } 

    } 

}
