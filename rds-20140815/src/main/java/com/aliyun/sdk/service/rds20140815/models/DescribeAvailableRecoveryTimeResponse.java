// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableRecoveryTimeResponse} extends {@link TeaModel}
 *
 * <p>DescribeAvailableRecoveryTimeResponse</p>
 */
public class DescribeAvailableRecoveryTimeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAvailableRecoveryTimeResponseBody body;

    private DescribeAvailableRecoveryTimeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAvailableRecoveryTimeResponse create() {
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
    public DescribeAvailableRecoveryTimeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAvailableRecoveryTimeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAvailableRecoveryTimeResponseBody body);

        @Override
        DescribeAvailableRecoveryTimeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAvailableRecoveryTimeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAvailableRecoveryTimeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAvailableRecoveryTimeResponse response) {
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
        public Builder body(DescribeAvailableRecoveryTimeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAvailableRecoveryTimeResponse build() {
            return new DescribeAvailableRecoveryTimeResponse(this);
        } 

    } 

}
