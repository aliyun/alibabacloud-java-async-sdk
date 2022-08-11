// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateQualityFollowerRequest} extends {@link RequestModel}
 *
 * <p>UpdateQualityFollowerRequest</p>
 */
public class UpdateQualityFollowerRequest extends Request {
    @Body
    @NameInMap("AlarmMode")
    @Validation(required = true, maximum = 99)
    private Integer alarmMode;

    @Body
    @NameInMap("Follower")
    @Validation(required = true)
    private String follower;

    @Body
    @NameInMap("FollowerId")
    @Validation(required = true)
    private Long followerId;

    @Body
    @NameInMap("ProjectName")
    @Validation(required = true)
    private String projectName;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private UpdateQualityFollowerRequest(Builder builder) {
        super(builder);
        this.alarmMode = builder.alarmMode;
        this.follower = builder.follower;
        this.followerId = builder.followerId;
        this.projectName = builder.projectName;
        this.regionId = builder.regionId;
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
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateQualityFollowerRequest, Builder> {
        private Integer alarmMode; 
        private String follower; 
        private Long followerId; 
        private String projectName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateQualityFollowerRequest request) {
            super(request);
            this.alarmMode = request.alarmMode;
            this.follower = request.follower;
            this.followerId = request.followerId;
            this.projectName = request.projectName;
            this.regionId = request.regionId;
        } 

        /**
         * AlarmMode.
         */
        public Builder alarmMode(Integer alarmMode) {
            this.putBodyParameter("AlarmMode", alarmMode);
            this.alarmMode = alarmMode;
            return this;
        }

        /**
         * Follower.
         */
        public Builder follower(String follower) {
            this.putBodyParameter("Follower", follower);
            this.follower = follower;
            return this;
        }

        /**
         * FollowerId.
         */
        public Builder followerId(Long followerId) {
            this.putBodyParameter("FollowerId", followerId);
            this.followerId = followerId;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateQualityFollowerRequest build() {
            return new UpdateQualityFollowerRequest(this);
        } 

    } 

}
