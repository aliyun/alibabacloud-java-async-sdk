// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsNetLevelResponse} extends {@link TeaModel}
 *
 * <p>DescribeEnsNetLevelResponse</p>
 */
public class DescribeEnsNetLevelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEnsNetLevelResponseBody body;

    private DescribeEnsNetLevelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEnsNetLevelResponse create() {
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
    public DescribeEnsNetLevelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEnsNetLevelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEnsNetLevelResponseBody body);

        @Override
        DescribeEnsNetLevelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEnsNetLevelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEnsNetLevelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEnsNetLevelResponse response) {
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
        public Builder body(DescribeEnsNetLevelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEnsNetLevelResponse build() {
            return new DescribeEnsNetLevelResponse(this);
        } 

    } 

}
