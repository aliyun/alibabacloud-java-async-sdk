// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataCollctionResponse} extends {@link TeaModel}
 *
 * <p>DescribeDataCollctionResponse</p>
 */
public class DescribeDataCollctionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDataCollctionResponseBody body;

    private DescribeDataCollctionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDataCollctionResponse create() {
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
    public DescribeDataCollctionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDataCollctionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDataCollctionResponseBody body);

        @Override
        DescribeDataCollctionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDataCollctionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDataCollctionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDataCollctionResponse response) {
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
        public Builder body(DescribeDataCollctionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDataCollctionResponse build() {
            return new DescribeDataCollctionResponse(this);
        } 

    } 

}
