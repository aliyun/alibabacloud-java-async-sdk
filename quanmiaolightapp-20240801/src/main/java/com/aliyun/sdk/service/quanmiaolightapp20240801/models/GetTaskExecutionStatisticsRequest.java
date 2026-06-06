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
 * {@link GetTaskExecutionStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetTaskExecutionStatisticsRequest</p>
 */
public class GetTaskExecutionStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskCode;

    private GetTaskExecutionStatisticsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.taskCode = builder.taskCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskExecutionStatisticsRequest create() {
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

    public static final class Builder extends Request.Builder<GetTaskExecutionStatisticsRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private String taskCode; 

        private Builder() {
            super();
        } 

        private Builder(GetTaskExecutionStatisticsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.taskCode = request.taskCode;
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
            this.putQueryParameter("taskCode", taskCode);
            this.taskCode = taskCode;
            return this;
        }

        @Override
        public GetTaskExecutionStatisticsRequest build() {
            return new GetTaskExecutionStatisticsRequest(this);
        } 

    } 

}
