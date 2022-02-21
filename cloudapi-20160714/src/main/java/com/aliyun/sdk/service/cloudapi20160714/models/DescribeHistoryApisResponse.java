// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHistoryApisResponse} extends {@link TeaModel}
 *
 * <p>DescribeHistoryApisResponse</p>
 */
public class DescribeHistoryApisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeHistoryApisResponseBody body;

    private DescribeHistoryApisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeHistoryApisResponse create() {
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
    public DescribeHistoryApisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeHistoryApisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeHistoryApisResponseBody body);

        @Override
        DescribeHistoryApisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeHistoryApisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeHistoryApisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeHistoryApisResponse response) {
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
        public Builder body(DescribeHistoryApisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeHistoryApisResponse build() {
            return new DescribeHistoryApisResponse(this);
        } 

    } 

}
