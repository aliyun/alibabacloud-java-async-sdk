// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

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
 * {@link BatchQueryTaskStatusRequest} extends {@link RequestModel}
 *
 * <p>BatchQueryTaskStatusRequest</p>
 */
public class BatchQueryTaskStatusRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskIds")
    private java.util.List<String> taskIds;

    private BatchQueryTaskStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.taskCode = builder.taskCode;
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchQueryTaskStatusRequest create() {
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return taskCode
     */
    public String getTaskCode() {
        return this.taskCode;
    }

    /**
     * @return taskIds
     */
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    public static final class Builder extends Request.Builder<BatchQueryTaskStatusRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private String taskCode; 
        private java.util.List<String> taskIds; 

        private Builder() {
            super();
        } 

        private Builder(BatchQueryTaskStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.taskCode = request.taskCode;
            this.taskIds = request.taskIds;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EssayCorrectionTask</p>
         */
        public Builder taskCode(String taskCode) {
            this.putBodyParameter("taskCode", taskCode);
            this.taskCode = taskCode;
            return this;
        }

        /**
         * taskIds.
         */
        public Builder taskIds(java.util.List<String> taskIds) {
            String taskIdsShrink = shrink(taskIds, "taskIds", "json");
            this.putBodyParameter("taskIds", taskIdsShrink);
            this.taskIds = taskIds;
            return this;
        }

        @Override
        public BatchQueryTaskStatusRequest build() {
            return new BatchQueryTaskStatusRequest(this);
        } 

    } 

}
