// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrafficControlsByApiResponse} extends {@link TeaModel}
 *
 * <p>DescribeTrafficControlsByApiResponse</p>
 */
public class DescribeTrafficControlsByApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTrafficControlsByApiResponseBody body;

    private DescribeTrafficControlsByApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTrafficControlsByApiResponse create() {
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
    public DescribeTrafficControlsByApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTrafficControlsByApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTrafficControlsByApiResponseBody body);

        @Override
        DescribeTrafficControlsByApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTrafficControlsByApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTrafficControlsByApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTrafficControlsByApiResponse response) {
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
        public Builder body(DescribeTrafficControlsByApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTrafficControlsByApiResponse build() {
            return new DescribeTrafficControlsByApiResponse(this);
        } 

    } 

}
