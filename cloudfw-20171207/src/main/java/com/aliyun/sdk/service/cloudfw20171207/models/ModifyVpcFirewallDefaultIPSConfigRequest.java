// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVpcFirewallDefaultIPSConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyVpcFirewallDefaultIPSConfigRequest</p>
 */
public class ModifyVpcFirewallDefaultIPSConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BasicRules")
    @com.aliyun.core.annotation.Validation(required = true)
    private String basicRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAllPatch")
    @com.aliyun.core.annotation.Validation(required = true)
    private String enableAllPatch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private String memberUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleClass")
    private String ruleClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    @Deprecated
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcFirewallId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcFirewallId;

    private ModifyVpcFirewallDefaultIPSConfigRequest(Builder builder) {
        super(builder);
        this.basicRules = builder.basicRules;
        this.enableAllPatch = builder.enableAllPatch;
        this.lang = builder.lang;
        this.memberUid = builder.memberUid;
        this.ruleClass = builder.ruleClass;
        this.runMode = builder.runMode;
        this.sourceIp = builder.sourceIp;
        this.vpcFirewallId = builder.vpcFirewallId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVpcFirewallDefaultIPSConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return basicRules
     */
    public String getBasicRules() {
        return this.basicRules;
    }

    /**
     * @return enableAllPatch
     */
    public String getEnableAllPatch() {
        return this.enableAllPatch;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return memberUid
     */
    public String getMemberUid() {
        return this.memberUid;
    }

    /**
     * @return ruleClass
     */
    public String getRuleClass() {
        return this.ruleClass;
    }

    /**
     * @return runMode
     */
    public String getRunMode() {
        return this.runMode;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return vpcFirewallId
     */
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    public static final class Builder extends Request.Builder<ModifyVpcFirewallDefaultIPSConfigRequest, Builder> {
        private String basicRules; 
        private String enableAllPatch; 
        private String lang; 
        private String memberUid; 
        private String ruleClass; 
        private String runMode; 
        private String sourceIp; 
        private String vpcFirewallId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVpcFirewallDefaultIPSConfigRequest request) {
            super(request);
            this.basicRules = request.basicRules;
            this.enableAllPatch = request.enableAllPatch;
            this.lang = request.lang;
            this.memberUid = request.memberUid;
            this.ruleClass = request.ruleClass;
            this.runMode = request.runMode;
            this.sourceIp = request.sourceIp;
            this.vpcFirewallId = request.vpcFirewallId;
        } 

        /**
         * Specifies whether to enable basic protection. Valid values:
         * <p>
         * 
         * *   **1**: yes
         * *   **0**: no
         */
        public Builder basicRules(String basicRules) {
            this.putQueryParameter("BasicRules", basicRules);
            this.basicRules = basicRules;
            return this;
        }

        /**
         * Specifies whether to enable virtual patching. Valid values:
         * <p>
         * 
         * *   **1**: yes
         * *   **0**: no
         */
        public Builder enableAllPatch(String enableAllPatch) {
            this.putQueryParameter("EnableAllPatch", enableAllPatch);
            this.enableAllPatch = enableAllPatch;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The UID of the member that is managed by your Alibaba Cloud account.
         */
        public Builder memberUid(String memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * RuleClass.
         */
        public Builder ruleClass(String ruleClass) {
            this.putQueryParameter("RuleClass", ruleClass);
            this.ruleClass = ruleClass;
            return this;
        }

        /**
         * The mode of the intrusion prevention system (IPS). Valid values:
         * <p>
         * 
         * *   **1**: block mode
         * *   **0**: monitor mode
         */
        public Builder runMode(String runMode) {
            this.putQueryParameter("RunMode", runMode);
            this.runMode = runMode;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The instance ID of the VPC firewall. Valid values:
         * <p>
         * 
         * *   If the VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a Cloud Enterprise Network (CEN) instance, the value of this parameter is the ID of the CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance. You can call the [DescribeVpcFirewallCenList](~~345777~~) operation to query the IDs of CEN instances.
         * *   If the VPC firewall protects mutual access traffic between two VPCs that are connected by using an Express Connect circuit, the value of this parameter is the ID of the VPC firewall. You can call the [DescribeVpcFirewallList](~~342932~~) operation to query the instance IDs of VPC firewalls.
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            this.putQueryParameter("VpcFirewallId", vpcFirewallId);
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }

        @Override
        public ModifyVpcFirewallDefaultIPSConfigRequest build() {
            return new ModifyVpcFirewallDefaultIPSConfigRequest(this);
        } 

    } 

}
