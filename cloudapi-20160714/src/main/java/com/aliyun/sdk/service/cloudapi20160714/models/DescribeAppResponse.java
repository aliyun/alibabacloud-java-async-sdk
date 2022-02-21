// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppResponse} extends {@link TeaModel}
 *
 * <p>DescribeAppResponse</p>
 */
public class DescribeAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAppResponseBody body;

    private DescribeAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAppResponse create() {
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
    public DescribeAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAppResponseBody body);

        @Override
        DescribeAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAppResponse response) {
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
        public Builder body(DescribeAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAppResponse build() {
            return new DescribeAppResponse(this);
        } 

    } 

}
