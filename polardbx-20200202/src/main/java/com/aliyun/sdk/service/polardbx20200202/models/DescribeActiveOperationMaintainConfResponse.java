// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeActiveOperationMaintainConfResponse} extends {@link TeaModel}
 *
 * <p>DescribeActiveOperationMaintainConfResponse</p>
 */
public class DescribeActiveOperationMaintainConfResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeActiveOperationMaintainConfResponseBody body;

    private DescribeActiveOperationMaintainConfResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeActiveOperationMaintainConfResponse create() {
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
    public DescribeActiveOperationMaintainConfResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeActiveOperationMaintainConfResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeActiveOperationMaintainConfResponseBody body);

        @Override
        DescribeActiveOperationMaintainConfResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeActiveOperationMaintainConfResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeActiveOperationMaintainConfResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeActiveOperationMaintainConfResponse response) {
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
        public Builder body(DescribeActiveOperationMaintainConfResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeActiveOperationMaintainConfResponse build() {
            return new DescribeActiveOperationMaintainConfResponse(this);
        } 

    } 

}
