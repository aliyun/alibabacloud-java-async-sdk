// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupTimesResponse} extends {@link TeaModel}
 *
 * <p>DescribeBackupTimesResponse</p>
 */
public class DescribeBackupTimesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBackupTimesResponseBody body;

    private DescribeBackupTimesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBackupTimesResponse create() {
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
    public DescribeBackupTimesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBackupTimesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBackupTimesResponseBody body);

        @Override
        DescribeBackupTimesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBackupTimesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBackupTimesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBackupTimesResponse response) {
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
        public Builder body(DescribeBackupTimesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBackupTimesResponse build() {
            return new DescribeBackupTimesResponse(this);
        } 

    } 

}
