// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccountAttributesResponse} extends {@link TeaModel}
 *
 * <p>DescribeAccountAttributesResponse</p>
 */
public class DescribeAccountAttributesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAccountAttributesResponseBody body;

    private DescribeAccountAttributesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAccountAttributesResponse create() {
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
    public DescribeAccountAttributesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAccountAttributesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAccountAttributesResponseBody body);

        @Override
        DescribeAccountAttributesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAccountAttributesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAccountAttributesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAccountAttributesResponse response) {
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
        public Builder body(DescribeAccountAttributesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAccountAttributesResponse build() {
            return new DescribeAccountAttributesResponse(this);
        } 

    } 

}
