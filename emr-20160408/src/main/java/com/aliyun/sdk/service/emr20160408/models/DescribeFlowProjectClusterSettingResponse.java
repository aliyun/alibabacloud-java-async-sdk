// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowProjectClusterSettingResponse} extends {@link TeaModel}
 *
 * <p>DescribeFlowProjectClusterSettingResponse</p>
 */
public class DescribeFlowProjectClusterSettingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFlowProjectClusterSettingResponseBody body;

    private DescribeFlowProjectClusterSettingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFlowProjectClusterSettingResponse create() {
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
    public DescribeFlowProjectClusterSettingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFlowProjectClusterSettingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFlowProjectClusterSettingResponseBody body);

        @Override
        DescribeFlowProjectClusterSettingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFlowProjectClusterSettingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFlowProjectClusterSettingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFlowProjectClusterSettingResponse response) {
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
        public Builder body(DescribeFlowProjectClusterSettingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFlowProjectClusterSettingResponse build() {
            return new DescribeFlowProjectClusterSettingResponse(this);
        } 

    } 

}
