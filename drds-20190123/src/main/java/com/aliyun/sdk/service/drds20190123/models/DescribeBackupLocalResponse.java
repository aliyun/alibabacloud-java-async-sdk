// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupLocalResponse} extends {@link TeaModel}
 *
 * <p>DescribeBackupLocalResponse</p>
 */
public class DescribeBackupLocalResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBackupLocalResponseBody body;

    private DescribeBackupLocalResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBackupLocalResponse create() {
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
    public DescribeBackupLocalResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBackupLocalResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBackupLocalResponseBody body);

        @Override
        DescribeBackupLocalResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBackupLocalResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBackupLocalResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBackupLocalResponse response) {
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
        public Builder body(DescribeBackupLocalResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBackupLocalResponse build() {
            return new DescribeBackupLocalResponse(this);
        } 

    } 

}
