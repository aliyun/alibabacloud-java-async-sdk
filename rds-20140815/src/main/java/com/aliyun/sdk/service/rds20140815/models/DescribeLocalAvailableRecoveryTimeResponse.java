// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLocalAvailableRecoveryTimeResponse} extends {@link TeaModel}
 *
 * <p>DescribeLocalAvailableRecoveryTimeResponse</p>
 */
public class DescribeLocalAvailableRecoveryTimeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLocalAvailableRecoveryTimeResponseBody body;

    private DescribeLocalAvailableRecoveryTimeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLocalAvailableRecoveryTimeResponse create() {
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
    public DescribeLocalAvailableRecoveryTimeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLocalAvailableRecoveryTimeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLocalAvailableRecoveryTimeResponseBody body);

        @Override
        DescribeLocalAvailableRecoveryTimeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLocalAvailableRecoveryTimeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLocalAvailableRecoveryTimeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLocalAvailableRecoveryTimeResponse response) {
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
        public Builder body(DescribeLocalAvailableRecoveryTimeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLocalAvailableRecoveryTimeResponse build() {
            return new DescribeLocalAvailableRecoveryTimeResponse(this);
        } 

    } 

}
