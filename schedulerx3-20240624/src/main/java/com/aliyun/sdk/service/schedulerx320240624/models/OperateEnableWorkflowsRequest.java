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
 * {@link OperateEnableWorkflowsRequest} extends {@link RequestModel}
 *
 * <p>OperateEnableWorkflowsRequest</p>
 */
public class OperateEnableWorkflowsRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("WorkflowIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> workflowIds;

    private OperateEnableWorkflowsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.clusterId = builder.clusterId;
        this.workflowIds = builder.workflowIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateEnableWorkflowsRequest create() {
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
     * @return workflowIds
     */
    public java.util.List<Long> getWorkflowIds() {
        return this.workflowIds;
    }

    public static final class Builder extends Request.Builder<OperateEnableWorkflowsRequest, Builder> {
        private String regionId; 
        private String appName; 
        private String clusterId; 
        private java.util.List<Long> workflowIds; 

        private Builder() {
            super();
        } 

        private Builder(OperateEnableWorkflowsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.clusterId = request.clusterId;
            this.workflowIds = request.workflowIds;
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
         * <p>xxl-job-executor-sample</p>
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
         */
        public Builder workflowIds(java.util.List<Long> workflowIds) {
            String workflowIdsShrink = shrink(workflowIds, "WorkflowIds", "json");
            this.putBodyParameter("WorkflowIds", workflowIdsShrink);
            this.workflowIds = workflowIds;
            return this;
        }

        @Override
        public OperateEnableWorkflowsRequest build() {
            return new OperateEnableWorkflowsRequest(this);
        } 

    } 

}
