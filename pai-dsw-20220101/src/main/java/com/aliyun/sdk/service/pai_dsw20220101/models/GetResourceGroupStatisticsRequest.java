// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceGroupStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetResourceGroupStatisticsRequest</p>
 */
public class GetResourceGroupStatisticsRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("WorkspaceIds")
    @Validation(required = true)
    private String workspaceIds;

    private GetResourceGroupStatisticsRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.resourceId = builder.resourceId;
        this.startTime = builder.startTime;
        this.workspaceIds = builder.workspaceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceGroupStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return workspaceIds
     */
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

    public static final class Builder extends Request.Builder<GetResourceGroupStatisticsRequest, Builder> {
        private String endTime; 
        private String resourceId; 
        private String startTime; 
        private String workspaceIds; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceGroupStatisticsRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.resourceId = request.resourceId;
            this.startTime = request.startTime;
            this.workspaceIds = request.workspaceIds;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * WorkspaceIds.
         */
        public Builder workspaceIds(String workspaceIds) {
            this.putQueryParameter("WorkspaceIds", workspaceIds);
            this.workspaceIds = workspaceIds;
            return this;
        }

        @Override
        public GetResourceGroupStatisticsRequest build() {
            return new GetResourceGroupStatisticsRequest(this);
        } 

    } 

}
