// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRestoreJobs2Response} extends {@link TeaModel}
 *
 * <p>DescribeRestoreJobs2Response</p>
 */
public class DescribeRestoreJobs2Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRestoreJobs2ResponseBody body;

    private DescribeRestoreJobs2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRestoreJobs2Response create() {
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
    public DescribeRestoreJobs2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRestoreJobs2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRestoreJobs2ResponseBody body);

        @Override
        DescribeRestoreJobs2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRestoreJobs2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRestoreJobs2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRestoreJobs2Response response) {
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
        public Builder body(DescribeRestoreJobs2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRestoreJobs2Response build() {
            return new DescribeRestoreJobs2Response(this);
        } 

    } 

}
