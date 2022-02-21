// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppEnvsResponse} extends {@link TeaModel}
 *
 * <p>DescribeAppEnvsResponse</p>
 */
public class DescribeAppEnvsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAppEnvsResponseBody body;

    private DescribeAppEnvsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAppEnvsResponse create() {
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
    public DescribeAppEnvsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAppEnvsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAppEnvsResponseBody body);

        @Override
        DescribeAppEnvsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAppEnvsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAppEnvsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAppEnvsResponse response) {
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
        public Builder body(DescribeAppEnvsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAppEnvsResponse build() {
            return new DescribeAppEnvsResponse(this);
        } 

    } 

}
