// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupClientsResponse} extends {@link TeaModel}
 *
 * <p>DescribeBackupClientsResponse</p>
 */
public class DescribeBackupClientsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBackupClientsResponseBody body;

    private DescribeBackupClientsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBackupClientsResponse create() {
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
    public DescribeBackupClientsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBackupClientsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBackupClientsResponseBody body);

        @Override
        DescribeBackupClientsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBackupClientsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBackupClientsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBackupClientsResponse response) {
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
        public Builder body(DescribeBackupClientsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBackupClientsResponse build() {
            return new DescribeBackupClientsResponse(this);
        } 

    } 

}
