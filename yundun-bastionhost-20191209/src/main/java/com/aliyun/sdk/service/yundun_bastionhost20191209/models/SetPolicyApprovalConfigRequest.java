// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPolicyApprovalConfigRequest} extends {@link RequestModel}
 *
 * <p>SetPolicyApprovalConfigRequest</p>
 */
public class SetPolicyApprovalConfigRequest extends Request {
    @Query
    @NameInMap("ApprovalConfig")
    @Validation(required = true)
    private ApprovalConfig approvalConfig;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PolicyId")
    @Validation(required = true)
    private String policyId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private SetPolicyApprovalConfigRequest(Builder builder) {
        super(builder);
        this.approvalConfig = builder.approvalConfig;
        this.instanceId = builder.instanceId;
        this.policyId = builder.policyId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetPolicyApprovalConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return approvalConfig
     */
    public ApprovalConfig getApprovalConfig() {
        return this.approvalConfig;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SetPolicyApprovalConfigRequest, Builder> {
        private ApprovalConfig approvalConfig; 
        private String instanceId; 
        private String policyId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SetPolicyApprovalConfigRequest request) {
            super(request);
            this.approvalConfig = request.approvalConfig;
            this.instanceId = request.instanceId;
            this.policyId = request.policyId;
            this.regionId = request.regionId;
        } 

        /**
         * ApprovalConfig.
         */
        public Builder approvalConfig(ApprovalConfig approvalConfig) {
            String approvalConfigShrink = shrink(approvalConfig, "ApprovalConfig", "json");
            this.putQueryParameter("ApprovalConfig", approvalConfigShrink);
            this.approvalConfig = approvalConfig;
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
         * PolicyId.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SetPolicyApprovalConfigRequest build() {
            return new SetPolicyApprovalConfigRequest(this);
        } 

    } 

    public static class ApprovalConfig extends TeaModel {
        @NameInMap("SwitchStatus")
        @Validation(required = true)
        private String switchStatus;

        private ApprovalConfig(Builder builder) {
            this.switchStatus = builder.switchStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApprovalConfig create() {
            return builder().build();
        }

        /**
         * @return switchStatus
         */
        public String getSwitchStatus() {
            return this.switchStatus;
        }

        public static final class Builder {
            private String switchStatus; 

            /**
             * SwitchStatus.
             */
            public Builder switchStatus(String switchStatus) {
                this.switchStatus = switchStatus;
                return this;
            }

            public ApprovalConfig build() {
                return new ApprovalConfig(this);
            } 

        } 

    }
}
