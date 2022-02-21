// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReadDBInstanceDelayResponse} extends {@link TeaModel}
 *
 * <p>DescribeReadDBInstanceDelayResponse</p>
 */
public class DescribeReadDBInstanceDelayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeReadDBInstanceDelayResponseBody body;

    private DescribeReadDBInstanceDelayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeReadDBInstanceDelayResponse create() {
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
    public DescribeReadDBInstanceDelayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeReadDBInstanceDelayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeReadDBInstanceDelayResponseBody body);

        @Override
        DescribeReadDBInstanceDelayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeReadDBInstanceDelayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeReadDBInstanceDelayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeReadDBInstanceDelayResponse response) {
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
        public Builder body(DescribeReadDBInstanceDelayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeReadDBInstanceDelayResponse build() {
            return new DescribeReadDBInstanceDelayResponse(this);
        } 

    } 

}
