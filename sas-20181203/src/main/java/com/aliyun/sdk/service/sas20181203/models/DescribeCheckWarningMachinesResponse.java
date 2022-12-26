// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCheckWarningMachinesResponse} extends {@link TeaModel}
 *
 * <p>DescribeCheckWarningMachinesResponse</p>
 */
public class DescribeCheckWarningMachinesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCheckWarningMachinesResponseBody body;

    private DescribeCheckWarningMachinesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCheckWarningMachinesResponse create() {
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
    public DescribeCheckWarningMachinesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCheckWarningMachinesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCheckWarningMachinesResponseBody body);

        @Override
        DescribeCheckWarningMachinesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCheckWarningMachinesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCheckWarningMachinesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCheckWarningMachinesResponse response) {
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
        public Builder body(DescribeCheckWarningMachinesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCheckWarningMachinesResponse build() {
            return new DescribeCheckWarningMachinesResponse(this);
        } 

    } 

}
