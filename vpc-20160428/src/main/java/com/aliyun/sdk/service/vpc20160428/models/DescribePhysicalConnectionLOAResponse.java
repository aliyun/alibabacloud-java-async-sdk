// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePhysicalConnectionLOAResponse} extends {@link TeaModel}
 *
 * <p>DescribePhysicalConnectionLOAResponse</p>
 */
public class DescribePhysicalConnectionLOAResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePhysicalConnectionLOAResponseBody body;

    private DescribePhysicalConnectionLOAResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePhysicalConnectionLOAResponse create() {
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
    public DescribePhysicalConnectionLOAResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePhysicalConnectionLOAResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePhysicalConnectionLOAResponseBody body);

        @Override
        DescribePhysicalConnectionLOAResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePhysicalConnectionLOAResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePhysicalConnectionLOAResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePhysicalConnectionLOAResponse response) {
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
        public Builder body(DescribePhysicalConnectionLOAResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePhysicalConnectionLOAResponse build() {
            return new DescribePhysicalConnectionLOAResponse(this);
        } 

    } 

}
