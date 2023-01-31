// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScriptResponse} extends {@link TeaModel}
 *
 * <p>DescribeScriptResponse</p>
 */
public class DescribeScriptResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeScriptResponseBody body;

    private DescribeScriptResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeScriptResponse create() {
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
    public DescribeScriptResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeScriptResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeScriptResponseBody body);

        @Override
        DescribeScriptResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeScriptResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeScriptResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeScriptResponse response) {
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
        public Builder body(DescribeScriptResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeScriptResponse build() {
            return new DescribeScriptResponse(this);
        } 

    } 

}
