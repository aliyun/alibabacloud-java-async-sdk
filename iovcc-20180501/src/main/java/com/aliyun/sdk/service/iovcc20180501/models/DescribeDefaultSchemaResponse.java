// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefaultSchemaResponse} extends {@link TeaModel}
 *
 * <p>DescribeDefaultSchemaResponse</p>
 */
public class DescribeDefaultSchemaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDefaultSchemaResponseBody body;

    private DescribeDefaultSchemaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDefaultSchemaResponse create() {
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
    public DescribeDefaultSchemaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDefaultSchemaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDefaultSchemaResponseBody body);

        @Override
        DescribeDefaultSchemaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDefaultSchemaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDefaultSchemaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDefaultSchemaResponse response) {
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
        public Builder body(DescribeDefaultSchemaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDefaultSchemaResponse build() {
            return new DescribeDefaultSchemaResponse(this);
        } 

    } 

}
