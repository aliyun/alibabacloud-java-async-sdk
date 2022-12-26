// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupMachineStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeBackupMachineStatusResponse</p>
 */
public class DescribeBackupMachineStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBackupMachineStatusResponseBody body;

    private DescribeBackupMachineStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBackupMachineStatusResponse create() {
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
    public DescribeBackupMachineStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBackupMachineStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBackupMachineStatusResponseBody body);

        @Override
        DescribeBackupMachineStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBackupMachineStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBackupMachineStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBackupMachineStatusResponse response) {
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
        public Builder body(DescribeBackupMachineStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBackupMachineStatusResponse build() {
            return new DescribeBackupMachineStatusResponse(this);
        } 

    } 

}
