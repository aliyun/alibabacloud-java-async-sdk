// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePackResponse} extends {@link TeaModel}
 *
 * <p>DescribePackResponse</p>
 */
public class DescribePackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePackResponseBody body;

    private DescribePackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePackResponse create() {
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
    public DescribePackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePackResponseBody body);

        @Override
        DescribePackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePackResponse response) {
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
        public Builder body(DescribePackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePackResponse build() {
            return new DescribePackResponse(this);
        } 

    } 

}
