// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupDbsResponse} extends {@link TeaModel}
 *
 * <p>DescribeBackupDbsResponse</p>
 */
public class DescribeBackupDbsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBackupDbsResponseBody body;

    private DescribeBackupDbsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBackupDbsResponse create() {
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
    public DescribeBackupDbsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBackupDbsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBackupDbsResponseBody body);

        @Override
        DescribeBackupDbsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBackupDbsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBackupDbsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBackupDbsResponse response) {
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
        public Builder body(DescribeBackupDbsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBackupDbsResponse build() {
            return new DescribeBackupDbsResponse(this);
        } 

    } 

}
