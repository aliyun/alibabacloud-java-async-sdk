// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetastoreCrawlerResponse} extends {@link TeaModel}
 *
 * <p>DescribeMetastoreCrawlerResponse</p>
 */
public class DescribeMetastoreCrawlerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMetastoreCrawlerResponseBody body;

    private DescribeMetastoreCrawlerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMetastoreCrawlerResponse create() {
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
    public DescribeMetastoreCrawlerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMetastoreCrawlerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMetastoreCrawlerResponseBody body);

        @Override
        DescribeMetastoreCrawlerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMetastoreCrawlerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMetastoreCrawlerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMetastoreCrawlerResponse response) {
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
        public Builder body(DescribeMetastoreCrawlerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMetastoreCrawlerResponse build() {
            return new DescribeMetastoreCrawlerResponse(this);
        } 

    } 

}
