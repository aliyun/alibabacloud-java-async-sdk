// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserBackupMachinesResponse} extends {@link TeaModel}
 *
 * <p>DescribeUserBackupMachinesResponse</p>
 */
public class DescribeUserBackupMachinesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUserBackupMachinesResponseBody body;

    private DescribeUserBackupMachinesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUserBackupMachinesResponse create() {
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
    public DescribeUserBackupMachinesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUserBackupMachinesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUserBackupMachinesResponseBody body);

        @Override
        DescribeUserBackupMachinesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUserBackupMachinesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUserBackupMachinesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUserBackupMachinesResponse response) {
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
        public Builder body(DescribeUserBackupMachinesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUserBackupMachinesResponse build() {
            return new DescribeUserBackupMachinesResponse(this);
        } 

    } 

}
