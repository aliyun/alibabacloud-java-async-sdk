// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPasswordHistoryConfigurationRequest} extends {@link RequestModel}
 *
 * <p>SetPasswordHistoryConfigurationRequest</p>
 */
public class SetPasswordHistoryConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordHistoryMaxRetention")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private Integer passwordHistoryMaxRetention;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordHistoryStatus")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32)
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
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The maximum number of recent passwords that can be retained. This parameter must be specified when PasswordHistoryStatus is set to enabled.
         */
        public Builder passwordHistoryMaxRetention(Integer passwordHistoryMaxRetention) {
            this.putQueryParameter("PasswordHistoryMaxRetention", passwordHistoryMaxRetention);
            this.passwordHistoryMaxRetention = passwordHistoryMaxRetention;
            return this;
        }

        /**
         * Specifies whether to enable the password history feature. Valid values:
         * <p>
         * 
         * *   enabled
         * *   disabled
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
