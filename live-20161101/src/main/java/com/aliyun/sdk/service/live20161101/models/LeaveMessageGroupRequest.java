// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LeaveMessageGroupRequest} extends {@link RequestModel}
 *
 * <p>LeaveMessageGroupRequest</p>
 */
public class LeaveMessageGroupRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("BroadCastStatistics")
    private Boolean broadCastStatistics;

    @Body
    @NameInMap("BroadCastType")
    private Integer broadCastType;

    @Body
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Body
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private LeaveMessageGroupRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.broadCastStatistics = builder.broadCastStatistics;
        this.broadCastType = builder.broadCastType;
        this.groupId = builder.groupId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LeaveMessageGroupRequest create() {
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
     * @return broadCastStatistics
     */
    public Boolean getBroadCastStatistics() {
        return this.broadCastStatistics;
    }

    /**
     * @return broadCastType
     */
    public Integer getBroadCastType() {
        return this.broadCastType;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<LeaveMessageGroupRequest, Builder> {
        private String regionId; 
        private String appId; 
        private Boolean broadCastStatistics; 
        private Integer broadCastType; 
        private String groupId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(LeaveMessageGroupRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.broadCastStatistics = request.broadCastStatistics;
            this.broadCastType = request.broadCastType;
            this.groupId = request.groupId;
            this.userId = request.userId;
        } 

        /**
         * cn-shanghai
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
         * BroadCastStatistics.
         */
        public Builder broadCastStatistics(Boolean broadCastStatistics) {
            this.putBodyParameter("BroadCastStatistics", broadCastStatistics);
            this.broadCastStatistics = broadCastStatistics;
            return this;
        }

        /**
         * BroadCastType.
         */
        public Builder broadCastType(Integer broadCastType) {
            this.putBodyParameter("BroadCastType", broadCastType);
            this.broadCastType = broadCastType;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public LeaveMessageGroupRequest build() {
            return new LeaveMessageGroupRequest(this);
        } 

    } 

}
