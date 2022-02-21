// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoCcListCountResponse} extends {@link TeaModel}
 *
 * <p>DescribeAutoCcListCountResponse</p>
 */
public class DescribeAutoCcListCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAutoCcListCountResponseBody body;

    private DescribeAutoCcListCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAutoCcListCountResponse create() {
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
    public DescribeAutoCcListCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAutoCcListCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAutoCcListCountResponseBody body);

        @Override
        DescribeAutoCcListCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAutoCcListCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAutoCcListCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAutoCcListCountResponse response) {
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
        public Builder body(DescribeAutoCcListCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAutoCcListCountResponse build() {
            return new DescribeAutoCcListCountResponse(this);
        } 

    } 

}
