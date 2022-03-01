// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCheckWarningsResponse} extends {@link TeaModel}
 *
 * <p>DescribeCheckWarningsResponse</p>
 */
public class DescribeCheckWarningsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCheckWarningsResponseBody body;

    private DescribeCheckWarningsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCheckWarningsResponse create() {
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
    public DescribeCheckWarningsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCheckWarningsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCheckWarningsResponseBody body);

        @Override
        DescribeCheckWarningsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCheckWarningsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCheckWarningsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCheckWarningsResponse response) {
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
        public Builder body(DescribeCheckWarningsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCheckWarningsResponse build() {
            return new DescribeCheckWarningsResponse(this);
        } 

    } 

}
