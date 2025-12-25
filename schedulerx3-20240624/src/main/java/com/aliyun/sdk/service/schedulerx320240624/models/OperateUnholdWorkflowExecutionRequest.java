// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link OperateUnholdWorkflowExecutionRequest} extends {@link RequestModel}
 *
 * <p>OperateUnholdWorkflowExecutionRequest</p>
 */
public class OperateUnholdWorkflowExecutionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkflowExecutionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long workflowExecutionId;

    private OperateUnholdWorkflowExecutionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.clusterId = builder.clusterId;
        this.workflowExecutionId = builder.workflowExecutionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateUnholdWorkflowExecutionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return workflowExecutionId
     */
    public Long getWorkflowExecutionId() {
        return this.workflowExecutionId;
    }

    public static final class Builder extends Request.Builder<OperateUnholdWorkflowExecutionRequest, Builder> {
        private String regionId; 
        private String appName; 
        private String clusterId; 
        private Long workflowExecutionId; 

        private Builder() {
            super();
        } 

        private Builder(OperateUnholdWorkflowExecutionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.clusterId = request.clusterId;
            this.workflowExecutionId = request.workflowExecutionId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob-b6ec1xxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder workflowExecutionId(Long workflowExecutionId) {
            this.putBodyParameter("WorkflowExecutionId", workflowExecutionId);
            this.workflowExecutionId = workflowExecutionId;
            return this;
        }

        @Override
        public OperateUnholdWorkflowExecutionRequest build() {
            return new OperateUnholdWorkflowExecutionRequest(this);
        } 

    } 

}
