// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTagKeysResponse} extends {@link TeaModel}
 *
 * <p>DescribeTagKeysResponse</p>
 */
public class DescribeTagKeysResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTagKeysResponseBody body;

    private DescribeTagKeysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTagKeysResponse create() {
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
    public DescribeTagKeysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTagKeysResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTagKeysResponseBody body);

        @Override
        DescribeTagKeysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTagKeysResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTagKeysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTagKeysResponse response) {
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
        public Builder body(DescribeTagKeysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTagKeysResponse build() {
            return new DescribeTagKeysResponse(this);
        } 

    } 

}
