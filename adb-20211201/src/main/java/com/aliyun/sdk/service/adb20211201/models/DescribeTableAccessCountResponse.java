// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTableAccessCountResponse} extends {@link TeaModel}
 *
 * <p>DescribeTableAccessCountResponse</p>
 */
public class DescribeTableAccessCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTableAccessCountResponseBody body;

    private DescribeTableAccessCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTableAccessCountResponse create() {
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
    public DescribeTableAccessCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTableAccessCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTableAccessCountResponseBody body);

        @Override
        DescribeTableAccessCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTableAccessCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTableAccessCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTableAccessCountResponse response) {
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
        public Builder body(DescribeTableAccessCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTableAccessCountResponse build() {
            return new DescribeTableAccessCountResponse(this);
        } 

    } 

}
