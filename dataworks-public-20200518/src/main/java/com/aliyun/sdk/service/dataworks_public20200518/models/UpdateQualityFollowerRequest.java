// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateQualityFollowerRequest} extends {@link RequestModel}
 *
 * <p>UpdateQualityFollowerRequest</p>
 */
public class UpdateQualityFollowerRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlarmMode")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 99)
    private Integer alarmMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Follower")
    @com.aliyun.core.annotation.Validation(required = true)
    private String follower;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FollowerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long followerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    private UpdateQualityFollowerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alarmMode = builder.alarmMode;
        this.follower = builder.follower;
        this.followerId = builder.followerId;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateQualityFollowerRequest create() {
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
     * @return alarmMode
     */
    public Integer getAlarmMode() {
        return this.alarmMode;
    }

    /**
     * @return follower
     */
    public String getFollower() {
        return this.follower;
    }

    /**
     * @return followerId
     */
    public Long getFollowerId() {
        return this.followerId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    public static final class Builder extends Request.Builder<UpdateQualityFollowerRequest, Builder> {
        private String regionId; 
        private Integer alarmMode; 
        private String follower; 
        private Long followerId; 
        private Long projectId; 
        private String projectName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateQualityFollowerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alarmMode = request.alarmMode;
            this.follower = request.follower;
            this.followerId = request.followerId;
            this.projectId = request.projectId;
            this.projectName = request.projectName;
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
         * The notification method. Valid values: 1, 2, 4, 5, 6, 7, 8, and 9. The value 1 indicates that the notification is sent by email. The value 2 indicates that the notification is sent by email and text message. The value 4 indicates that the notification is sent by a DingTalk chatbot. The value 5 indicates that the notification is sent by a DingTalk chatbot to all members in a DingTalk group. The value 6 indicates that the notification is sent by Lark. The value 7 indicates that the notification is sent by WeCom. The value 8 indicates that the notification is sent by webhook. The value 9 indicates that the notification is sent by phone call.
         */
        public Builder alarmMode(Integer alarmMode) {
            this.putBodyParameter("AlarmMode", alarmMode);
            this.alarmMode = alarmMode;
            return this;
        }

        /**
         * The name of the subscriber.
         */
        public Builder follower(String follower) {
            this.putBodyParameter("Follower", follower);
            this.follower = follower;
            return this;
        }

        /**
         * The ID of the subscription relationship.
         */
        public Builder followerId(Long followerId) {
            this.putBodyParameter("FollowerId", followerId);
            this.followerId = followerId;
            return this;
        }

        /**
         * The DataWorks workspace ID. You can log on to the DataWorks console to obtain the workspace ID.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The name of the compute engine or data source.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        @Override
        public UpdateQualityFollowerRequest build() {
            return new UpdateQualityFollowerRequest(this);
        } 

    } 

}
