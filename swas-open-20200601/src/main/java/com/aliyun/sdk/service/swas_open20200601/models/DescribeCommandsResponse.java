// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCommandsResponse} extends {@link TeaModel}
 *
 * <p>DescribeCommandsResponse</p>
 */
public class DescribeCommandsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCommandsResponseBody body;

    private DescribeCommandsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCommandsResponse create() {
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
    public DescribeCommandsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCommandsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCommandsResponseBody body);

        @Override
        DescribeCommandsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCommandsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCommandsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCommandsResponse response) {
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
        public Builder body(DescribeCommandsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCommandsResponse build() {
            return new DescribeCommandsResponse(this);
        } 

    } 

}
