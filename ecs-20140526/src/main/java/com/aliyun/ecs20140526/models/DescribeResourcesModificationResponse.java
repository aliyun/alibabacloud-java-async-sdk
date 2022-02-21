// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourcesModificationResponse} extends {@link TeaModel}
 *
 * <p>DescribeResourcesModificationResponse</p>
 */
public class DescribeResourcesModificationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeResourcesModificationResponseBody body;

    private DescribeResourcesModificationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeResourcesModificationResponse create() {
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
    public DescribeResourcesModificationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeResourcesModificationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeResourcesModificationResponseBody body);

        @Override
        DescribeResourcesModificationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeResourcesModificationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeResourcesModificationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeResourcesModificationResponse response) {
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
        public Builder body(DescribeResourcesModificationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeResourcesModificationResponse build() {
            return new DescribeResourcesModificationResponse(this);
        } 

    } 

}
