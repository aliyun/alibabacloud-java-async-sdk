// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOasSQLPlansResponse} extends {@link TeaModel}
 *
 * <p>DescribeOasSQLPlansResponse</p>
 */
public class DescribeOasSQLPlansResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeOasSQLPlansResponseBody body;

    private DescribeOasSQLPlansResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeOasSQLPlansResponse create() {
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
    public DescribeOasSQLPlansResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeOasSQLPlansResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeOasSQLPlansResponseBody body);

        @Override
        DescribeOasSQLPlansResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeOasSQLPlansResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeOasSQLPlansResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeOasSQLPlansResponse response) {
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
        public Builder body(DescribeOasSQLPlansResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeOasSQLPlansResponse build() {
            return new DescribeOasSQLPlansResponse(this);
        } 

    } 

}
