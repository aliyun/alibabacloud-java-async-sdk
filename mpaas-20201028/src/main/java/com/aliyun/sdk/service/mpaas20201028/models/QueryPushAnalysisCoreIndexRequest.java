// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPushAnalysisCoreIndexRequest} extends {@link RequestModel}
 *
 * <p>QueryPushAnalysisCoreIndexRequest</p>
 */
public class QueryPushAnalysisCoreIndexRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("Channel")
    private String channel;

    @Body
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Body
    @NameInMap("Platform")
    private String platform;

    @Body
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    @Body
    @NameInMap("TaskId")
    private String taskId;

    @Body
    @NameInMap("Type")
    private String type;

    @Body
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    private QueryPushAnalysisCoreIndexRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.channel = builder.channel;
        this.endTime = builder.endTime;
        this.platform = builder.platform;
        this.startTime = builder.startTime;
        this.taskId = builder.taskId;
        this.type = builder.type;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPushAnalysisCoreIndexRequest create() {
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
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<QueryPushAnalysisCoreIndexRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String channel; 
        private Long endTime; 
        private String platform; 
        private Long startTime; 
        private String taskId; 
        private String type; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryPushAnalysisCoreIndexRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.channel = request.channel;
            this.endTime = request.endTime;
            this.platform = request.platform;
            this.startTime = request.startTime;
            this.taskId = request.taskId;
            this.type = request.type;
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
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Channel.
         */
        public Builder channel(String channel) {
            this.putBodyParameter("Channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Platform.
         */
        public Builder platform(String platform) {
            this.putBodyParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public QueryPushAnalysisCoreIndexRequest build() {
            return new QueryPushAnalysisCoreIndexRequest(this);
        } 

    } 

}
