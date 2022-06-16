// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppResourceAllocResponse} extends {@link TeaModel}
 *
 * <p>DescribeAppResourceAllocResponse</p>
 */
public class DescribeAppResourceAllocResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAppResourceAllocResponseBody body;

    private DescribeAppResourceAllocResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAppResourceAllocResponse create() {
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
    public DescribeAppResourceAllocResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAppResourceAllocResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAppResourceAllocResponseBody body);

        @Override
        DescribeAppResourceAllocResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAppResourceAllocResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAppResourceAllocResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAppResourceAllocResponse response) {
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
        public Builder body(DescribeAppResourceAllocResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAppResourceAllocResponse build() {
            return new DescribeAppResourceAllocResponse(this);
        } 

    } 

}
