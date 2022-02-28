// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVersionConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeVersionConfigResponse</p>
 */
public class DescribeVersionConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVersionConfigResponseBody body;

    private DescribeVersionConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVersionConfigResponse create() {
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
    public DescribeVersionConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVersionConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVersionConfigResponseBody body);

        @Override
        DescribeVersionConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVersionConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVersionConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVersionConfigResponse response) {
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
        public Builder body(DescribeVersionConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVersionConfigResponse build() {
            return new DescribeVersionConfigResponse(this);
        } 

    } 

}
