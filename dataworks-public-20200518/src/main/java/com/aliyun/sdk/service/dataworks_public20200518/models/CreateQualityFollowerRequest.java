// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateQualityFollowerRequest} extends {@link RequestModel}
 *
 * <p>CreateQualityFollowerRequest</p>
 */
public class CreateQualityFollowerRequest extends Request {
    @Body
    @NameInMap("AlarmMode")
    @Validation(required = true)
    private Integer alarmMode;

    @Body
    @NameInMap("EntityId")
    @Validation(required = true)
    private Long entityId;

    @Body
    @NameInMap("Follower")
    @Validation(required = true)
    private String follower;

    @Body
    @NameInMap("ProjectName")
    @Validation(required = true)
    private String projectName;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CreateQualityFollowerRequest(Builder builder) {
        super(builder);
        this.alarmMode = builder.alarmMode;
        this.entityId = builder.entityId;
        this.follower = builder.follower;
        this.projectName = builder.projectName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQualityFollowerRequest create() {
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
     * @return entityId
     */
    public Long getEntityId() {
        return this.entityId;
    }

    /**
     * @return follower
     */
    public String getFollower() {
        return this.follower;
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

    public static final class Builder extends Request.Builder<CreateQualityFollowerRequest, Builder> {
        private Integer alarmMode; 
        private Long entityId; 
        private String follower; 
        private String projectName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateQualityFollowerRequest request) {
            super(request);
            this.alarmMode = request.alarmMode;
            this.entityId = request.entityId;
            this.follower = request.follower;
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
         * EntityId.
         */
        public Builder entityId(Long entityId) {
            this.putBodyParameter("EntityId", entityId);
            this.entityId = entityId;
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
        public CreateQualityFollowerRequest build() {
            return new CreateQualityFollowerRequest(this);
        } 

    } 

}
