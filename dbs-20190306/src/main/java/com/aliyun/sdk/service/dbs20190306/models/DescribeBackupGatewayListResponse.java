// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupGatewayListResponse} extends {@link TeaModel}
 *
 * <p>DescribeBackupGatewayListResponse</p>
 */
public class DescribeBackupGatewayListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBackupGatewayListResponseBody body;

    private DescribeBackupGatewayListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBackupGatewayListResponse create() {
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
    public DescribeBackupGatewayListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBackupGatewayListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBackupGatewayListResponseBody body);

        @Override
        DescribeBackupGatewayListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBackupGatewayListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBackupGatewayListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBackupGatewayListResponse response) {
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
        public Builder body(DescribeBackupGatewayListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBackupGatewayListResponse build() {
            return new DescribeBackupGatewayListResponse(this);
        } 

    } 

}
