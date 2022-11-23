// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogMetaResponse} extends {@link TeaModel}
 *
 * <p>DescribeLogMetaResponse</p>
 */
public class DescribeLogMetaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLogMetaResponseBody body;

    private DescribeLogMetaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLogMetaResponse create() {
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
    public DescribeLogMetaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLogMetaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLogMetaResponseBody body);

        @Override
        DescribeLogMetaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLogMetaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLogMetaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLogMetaResponse response) {
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
        public Builder body(DescribeLogMetaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLogMetaResponse build() {
            return new DescribeLogMetaResponse(this);
        } 

    } 

}
