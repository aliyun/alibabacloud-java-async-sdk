// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPasswordHistoryConfigurationRequest} extends {@link RequestModel}
 *
 * <p>SetPasswordHistoryConfigurationRequest</p>
 */
public class SetPasswordHistoryConfigurationRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true, maxLength = 64)
    private String instanceId;

    @Query
    @NameInMap("PasswordHistoryMaxRetention")
    @Validation(maxLength = 32)
    private Integer passwordHistoryMaxRetention;

    @Query
    @NameInMap("PasswordHistoryStatus")
    @Validation(required = true, maxLength = 32)
    private String passwordHistoryStatus;

    private SetPasswordHistoryConfigurationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.passwordHistoryMaxRetention = builder.passwordHistoryMaxRetention;
        this.passwordHistoryStatus = builder.passwordHistoryStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetPasswordHistoryConfigurationRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return passwordHistoryMaxRetention
     */
    public Integer getPasswordHistoryMaxRetention() {
        return this.passwordHistoryMaxRetention;
    }

    /**
     * @return passwordHistoryStatus
     */
    public String getPasswordHistoryStatus() {
        return this.passwordHistoryStatus;
    }

    public static final class Builder extends Request.Builder<SetPasswordHistoryConfigurationRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private Integer passwordHistoryMaxRetention; 
        private String passwordHistoryStatus; 

        private Builder() {
            super();
        } 

        private Builder(SetPasswordHistoryConfigurationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.passwordHistoryMaxRetention = request.passwordHistoryMaxRetention;
            this.passwordHistoryStatus = request.passwordHistoryStatus;
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
         * IDaaS EIAM实例的ID。
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 保留最近密码记录数。当passwordHistoryStatus取值为enabled时必传。
         */
        public Builder passwordHistoryMaxRetention(Integer passwordHistoryMaxRetention) {
            this.putQueryParameter("PasswordHistoryMaxRetention", passwordHistoryMaxRetention);
            this.passwordHistoryMaxRetention = passwordHistoryMaxRetention;
            return this;
        }

        /**
         * 密码历史配置状态。枚举取值:enabled(开启)、disabled(禁用)
         */
        public Builder passwordHistoryStatus(String passwordHistoryStatus) {
            this.putQueryParameter("PasswordHistoryStatus", passwordHistoryStatus);
            this.passwordHistoryStatus = passwordHistoryStatus;
            return this;
        }

        @Override
        public SetPasswordHistoryConfigurationRequest build() {
            return new SetPasswordHistoryConfigurationRequest(this);
        } 

    } 

}
