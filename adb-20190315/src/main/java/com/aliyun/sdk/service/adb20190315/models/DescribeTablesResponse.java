// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTablesResponse} extends {@link TeaModel}
 *
 * <p>DescribeTablesResponse</p>
 */
public class DescribeTablesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTablesResponseBody body;

    private DescribeTablesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTablesResponse create() {
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
    public DescribeTablesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTablesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTablesResponseBody body);

        @Override
        DescribeTablesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTablesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTablesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTablesResponse response) {
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
        public Builder body(DescribeTablesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTablesResponse build() {
            return new DescribeTablesResponse(this);
        } 

    } 

}
