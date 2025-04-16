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
 * {@link GetEnterpriseVocAnalysisTaskRequest} extends {@link RequestModel}
 *
 * <p>GetEnterpriseVocAnalysisTaskRequest</p>
 */
public class GetEnterpriseVocAnalysisTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    private GetEnterpriseVocAnalysisTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEnterpriseVocAnalysisTaskRequest create() {
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetEnterpriseVocAnalysisTaskRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetEnterpriseVocAnalysisTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.taskId = request.taskId;
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
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetEnterpriseVocAnalysisTaskRequest build() {
            return new GetEnterpriseVocAnalysisTaskRequest(this);
        } 

    } 

}
