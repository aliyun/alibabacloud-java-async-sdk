// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogHubAttributeResponse} extends {@link TeaModel}
 *
 * <p>DescribeLogHubAttributeResponse</p>
 */
public class DescribeLogHubAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLogHubAttributeResponseBody body;

    private DescribeLogHubAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLogHubAttributeResponse create() {
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
    public DescribeLogHubAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLogHubAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLogHubAttributeResponseBody body);

        @Override
        DescribeLogHubAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLogHubAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLogHubAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLogHubAttributeResponse response) {
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
        public Builder body(DescribeLogHubAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLogHubAttributeResponse build() {
            return new DescribeLogHubAttributeResponse(this);
        } 

    } 

}
