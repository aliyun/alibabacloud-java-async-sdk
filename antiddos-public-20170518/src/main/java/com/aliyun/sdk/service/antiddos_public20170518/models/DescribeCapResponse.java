// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCapResponse} extends {@link TeaModel}
 *
 * <p>DescribeCapResponse</p>
 */
public class DescribeCapResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCapResponseBody body;

    private DescribeCapResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCapResponse create() {
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
    public DescribeCapResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCapResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCapResponseBody body);

        @Override
        DescribeCapResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCapResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCapResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCapResponse response) {
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
        public Builder body(DescribeCapResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCapResponse build() {
            return new DescribeCapResponse(this);
        } 

    } 

}
