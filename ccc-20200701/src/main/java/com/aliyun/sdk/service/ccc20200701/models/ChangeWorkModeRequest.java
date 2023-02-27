// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeWorkModeRequest} extends {@link RequestModel}
 *
 * <p>ChangeWorkModeRequest</p>
 */
public class ChangeWorkModeRequest extends Request {
    @Query
    @NameInMap("DeviceId")
    private String deviceId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Mobile")
    private String mobile;

    @Query
    @NameInMap("SignedSkillGroupIdList")
    private String signedSkillGroupIdList;

    @Query
    @NameInMap("UserId")
    private String userId;

    @Query
    @NameInMap("WorkMode")
    @Validation(required = true)
    private String workMode;

    private ChangeWorkModeRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.instanceId = builder.instanceId;
        this.mobile = builder.mobile;
        this.signedSkillGroupIdList = builder.signedSkillGroupIdList;
        this.userId = builder.userId;
        this.workMode = builder.workMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeWorkModeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return signedSkillGroupIdList
     */
    public String getSignedSkillGroupIdList() {
        return this.signedSkillGroupIdList;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workMode
     */
    public String getWorkMode() {
        return this.workMode;
    }

    public static final class Builder extends Request.Builder<ChangeWorkModeRequest, Builder> {
        private String deviceId; 
        private String instanceId; 
        private String mobile; 
        private String signedSkillGroupIdList; 
        private String userId; 
        private String workMode; 

        private Builder() {
            super();
        } 

        private Builder(ChangeWorkModeRequest request) {
            super(request);
            this.deviceId = request.deviceId;
            this.instanceId = request.instanceId;
            this.mobile = request.mobile;
            this.signedSkillGroupIdList = request.signedSkillGroupIdList;
            this.userId = request.userId;
            this.workMode = request.workMode;
        } 

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Mobile.
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * SignedSkillGroupIdList.
         */
        public Builder signedSkillGroupIdList(String signedSkillGroupIdList) {
            this.putQueryParameter("SignedSkillGroupIdList", signedSkillGroupIdList);
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * WorkMode.
         */
        public Builder workMode(String workMode) {
            this.putQueryParameter("WorkMode", workMode);
            this.workMode = workMode;
            return this;
        }

        @Override
        public ChangeWorkModeRequest build() {
            return new ChangeWorkModeRequest(this);
        } 

    } 

}
