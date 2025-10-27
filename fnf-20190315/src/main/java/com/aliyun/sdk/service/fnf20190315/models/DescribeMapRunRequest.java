// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMapRunRequest} extends {@link RequestModel}
 *
 * <p>DescribeMapRunRequest</p>
 */
public class DescribeMapRunRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String executionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MapRunName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mapRunName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeMapRunRequest(Builder builder) {
        super(builder);
        this.executionName = builder.executionName;
        this.flowName = builder.flowName;
        this.mapRunName = builder.mapRunName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMapRunRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return executionName
     */
    public String getExecutionName() {
        return this.executionName;
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return mapRunName
     */
    public String getMapRunName() {
        return this.mapRunName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder extends Request.Builder<DescribeMapRunRequest, Builder> {
        private String executionName; 
        private String flowName; 
        private String mapRunName; 
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMapRunRequest request) {
            super(request);
            this.executionName = request.executionName;
            this.flowName = request.flowName;
            this.mapRunName = request.mapRunName;
            this.requestId = request.requestId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_exec_name</p>
         */
        public Builder executionName(String executionName) {
            this.putQueryParameter("ExecutionName", executionName);
            this.executionName = executionName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_flow_name</p>
         */
        public Builder flowName(String flowName) {
            this.putQueryParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c39142f1345b196d678333c41f113200</p>
         */
        public Builder mapRunName(String mapRunName) {
            this.putQueryParameter("MapRunName", mapRunName);
            this.mapRunName = mapRunName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        @Override
        public DescribeMapRunRequest build() {
            return new DescribeMapRunRequest(this);
        } 

    } 

}
