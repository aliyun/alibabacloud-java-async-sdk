// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHotBigKeysResponse} extends {@link TeaModel}
 *
 * <p>DescribeHotBigKeysResponse</p>
 */
public class DescribeHotBigKeysResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeHotBigKeysResponseBody body;

    private DescribeHotBigKeysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeHotBigKeysResponse create() {
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
    public DescribeHotBigKeysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeHotBigKeysResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeHotBigKeysResponseBody body);

        @Override
        DescribeHotBigKeysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeHotBigKeysResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeHotBigKeysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeHotBigKeysResponse response) {
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
        public Builder body(DescribeHotBigKeysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeHotBigKeysResponse build() {
            return new DescribeHotBigKeysResponse(this);
        } 

    } 

}
