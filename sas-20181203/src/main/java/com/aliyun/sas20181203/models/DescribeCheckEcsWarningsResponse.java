// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCheckEcsWarningsResponse} extends {@link TeaModel}
 *
 * <p>DescribeCheckEcsWarningsResponse</p>
 */
public class DescribeCheckEcsWarningsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCheckEcsWarningsResponseBody body;

    private DescribeCheckEcsWarningsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCheckEcsWarningsResponse create() {
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
    public DescribeCheckEcsWarningsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCheckEcsWarningsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCheckEcsWarningsResponseBody body);

        @Override
        DescribeCheckEcsWarningsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCheckEcsWarningsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCheckEcsWarningsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCheckEcsWarningsResponse response) {
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
        public Builder body(DescribeCheckEcsWarningsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCheckEcsWarningsResponse build() {
            return new DescribeCheckEcsWarningsResponse(this);
        } 

    } 

}
