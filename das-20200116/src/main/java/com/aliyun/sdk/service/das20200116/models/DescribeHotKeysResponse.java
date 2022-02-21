// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHotKeysResponse} extends {@link TeaModel}
 *
 * <p>DescribeHotKeysResponse</p>
 */
public class DescribeHotKeysResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeHotKeysResponseBody body;

    private DescribeHotKeysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeHotKeysResponse create() {
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
    public DescribeHotKeysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeHotKeysResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeHotKeysResponseBody body);

        @Override
        DescribeHotKeysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeHotKeysResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeHotKeysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeHotKeysResponse response) {
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
        public Builder body(DescribeHotKeysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeHotKeysResponse build() {
            return new DescribeHotKeysResponse(this);
        } 

    } 

}
