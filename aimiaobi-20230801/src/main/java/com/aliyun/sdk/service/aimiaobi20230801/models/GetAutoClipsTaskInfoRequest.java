// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link GetAutoClipsTaskInfoRequest} extends {@link RequestModel}
 *
 * <p>GetAutoClipsTaskInfoRequest</p>
 */
public class GetAutoClipsTaskInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShowAnalysisResults")
    private Boolean showAnalysisResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShowResourceInfo")
    private Boolean showResourceInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private GetAutoClipsTaskInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.showAnalysisResults = builder.showAnalysisResults;
        this.showResourceInfo = builder.showResourceInfo;
        this.taskId = builder.taskId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutoClipsTaskInfoRequest create() {
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
     * @return showAnalysisResults
     */
    public Boolean getShowAnalysisResults() {
        return this.showAnalysisResults;
    }

    /**
     * @return showResourceInfo
     */
    public Boolean getShowResourceInfo() {
        return this.showResourceInfo;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GetAutoClipsTaskInfoRequest, Builder> {
        private String regionId; 
        private Boolean showAnalysisResults; 
        private Boolean showResourceInfo; 
        private String taskId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetAutoClipsTaskInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.showAnalysisResults = request.showAnalysisResults;
            this.showResourceInfo = request.showResourceInfo;
            this.taskId = request.taskId;
            this.workspaceId = request.workspaceId;
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
         * ShowAnalysisResults.
         */
        public Builder showAnalysisResults(Boolean showAnalysisResults) {
            this.putBodyParameter("ShowAnalysisResults", showAnalysisResults);
            this.showAnalysisResults = showAnalysisResults;
            return this;
        }

        /**
         * ShowResourceInfo.
         */
        public Builder showResourceInfo(Boolean showResourceInfo) {
            this.putBodyParameter("ShowResourceInfo", showResourceInfo);
            this.showResourceInfo = showResourceInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0dbf1055f8a2475d99904c3b76a0ffba</p>
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GetAutoClipsTaskInfoRequest build() {
            return new GetAutoClipsTaskInfoRequest(this);
        } 

    } 

}
