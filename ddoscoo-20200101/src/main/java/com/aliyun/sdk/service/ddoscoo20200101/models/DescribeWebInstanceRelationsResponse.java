// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebInstanceRelationsResponse} extends {@link TeaModel}
 *
 * <p>DescribeWebInstanceRelationsResponse</p>
 */
public class DescribeWebInstanceRelationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeWebInstanceRelationsResponseBody body;

    private DescribeWebInstanceRelationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeWebInstanceRelationsResponse create() {
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
    public DescribeWebInstanceRelationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeWebInstanceRelationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeWebInstanceRelationsResponseBody body);

        @Override
        DescribeWebInstanceRelationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeWebInstanceRelationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeWebInstanceRelationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeWebInstanceRelationsResponse response) {
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
        public Builder body(DescribeWebInstanceRelationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeWebInstanceRelationsResponse build() {
            return new DescribeWebInstanceRelationsResponse(this);
        } 

    } 

}
