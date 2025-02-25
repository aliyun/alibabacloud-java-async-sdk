// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetPolicyApprovalConfigRequest} extends {@link RequestModel}
 *
 * <p>SetPolicyApprovalConfigRequest</p>
 */
public class SetPolicyApprovalConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApprovalConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private ApprovalConfig approvalConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
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
         * <p>The O&amp;M approval setting in the control policy.</p>
         * <p>This parameter is required.</p>
         */
        public Builder approvalConfig(ApprovalConfig approvalConfig) {
            String approvalConfigShrink = shrink(approvalConfig, "ApprovalConfig", "json");
            this.putQueryParameter("ApprovalConfig", approvalConfigShrink);
            this.approvalConfig = approvalConfig;
            return this;
        }

        /**
         * <p>The bastion host ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-st220aw****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the control policy that you want to modify.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2758876.html">ListPolicies</a> operation to query the control policy ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
         * <blockquote>
         * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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

    /**
     * 
     * {@link SetPolicyApprovalConfigRequest} extends {@link TeaModel}
     *
     * <p>SetPolicyApprovalConfigRequest</p>
     */
    public static class ApprovalConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SwitchStatus")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>Specifies whether to enable O&amp;M approval in the control policy. Valid values:</p>
             * <ul>
             * <li><strong>On</strong>: enables O&amp;M approval.</li>
             * <li><strong>Off</strong>: disables O&amp;M approval.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>On</p>
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
