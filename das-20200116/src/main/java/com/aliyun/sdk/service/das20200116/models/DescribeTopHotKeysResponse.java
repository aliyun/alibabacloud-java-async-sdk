// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTopHotKeysResponse} extends {@link TeaModel}
 *
 * <p>DescribeTopHotKeysResponse</p>
 */
public class DescribeTopHotKeysResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTopHotKeysResponseBody body;

    private DescribeTopHotKeysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTopHotKeysResponse create() {
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
    public DescribeTopHotKeysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTopHotKeysResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTopHotKeysResponseBody body);

        @Override
        DescribeTopHotKeysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTopHotKeysResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTopHotKeysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTopHotKeysResponse response) {
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
        public Builder body(DescribeTopHotKeysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTopHotKeysResponse build() {
            return new DescribeTopHotKeysResponse(this);
        } 

    } 

}
