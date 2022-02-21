// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiHistoriesResponse} extends {@link TeaModel}
 *
 * <p>DescribeApiHistoriesResponse</p>
 */
public class DescribeApiHistoriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeApiHistoriesResponseBody body;

    private DescribeApiHistoriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeApiHistoriesResponse create() {
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
    public DescribeApiHistoriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeApiHistoriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeApiHistoriesResponseBody body);

        @Override
        DescribeApiHistoriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeApiHistoriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeApiHistoriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeApiHistoriesResponse response) {
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
        public Builder body(DescribeApiHistoriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeApiHistoriesResponse build() {
            return new DescribeApiHistoriesResponse(this);
        } 

    } 

}
