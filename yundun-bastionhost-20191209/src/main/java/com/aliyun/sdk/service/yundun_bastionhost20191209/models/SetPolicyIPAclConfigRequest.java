// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetPolicyIPAclConfigRequest} extends {@link RequestModel}
 *
 * <p>SetPolicyIPAclConfigRequest</p>
 */
public class SetPolicyIPAclConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IPAclConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private IPAclConfig IPAclConfig;

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

    private SetPolicyIPAclConfigRequest(Builder builder) {
        super(builder);
        this.IPAclConfig = builder.IPAclConfig;
        this.instanceId = builder.instanceId;
        this.policyId = builder.policyId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetPolicyIPAclConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return IPAclConfig
     */
    public IPAclConfig getIPAclConfig() {
        return this.IPAclConfig;
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

    public static final class Builder extends Request.Builder<SetPolicyIPAclConfigRequest, Builder> {
        private IPAclConfig IPAclConfig; 
        private String instanceId; 
        private String policyId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SetPolicyIPAclConfigRequest request) {
            super(request);
            this.IPAclConfig = request.IPAclConfig;
            this.instanceId = request.instanceId;
            this.policyId = request.policyId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The access control settings for source IP addresses.</p>
         * <p>This parameter is required.</p>
         */
        public Builder IPAclConfig(IPAclConfig IPAclConfig) {
            String IPAclConfigShrink = shrink(IPAclConfig, "IPAclConfig", "json");
            this.putQueryParameter("IPAclConfig", IPAclConfigShrink);
            this.IPAclConfig = IPAclConfig;
            return this;
        }

        /**
         * <p>The bastion host ID.</p>
         * <blockquote>
         * <p>You can call the DescribeInstances operation to query the bastion host ID.<a href="~~153281~~"></a></p>
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
         * <p>3</p>
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
         * <blockquote>
         * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
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
        public SetPolicyIPAclConfigRequest build() {
            return new SetPolicyIPAclConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link SetPolicyIPAclConfigRequest} extends {@link TeaModel}
     *
     * <p>SetPolicyIPAclConfigRequest</p>
     */
    public static class IPAclConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String aclType;

        @com.aliyun.core.annotation.NameInMap("IPs")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> iPs;

        private IPAclConfig(Builder builder) {
            this.aclType = builder.aclType;
            this.iPs = builder.iPs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IPAclConfig create() {
            return builder().build();
        }

        /**
         * @return aclType
         */
        public String getAclType() {
            return this.aclType;
        }

        /**
         * @return iPs
         */
        public java.util.List<String> getIPs() {
            return this.iPs;
        }

        public static final class Builder {
            private String aclType; 
            private java.util.List<String> iPs; 

            private Builder() {
            } 

            private Builder(IPAclConfig model) {
                this.aclType = model.aclType;
                this.iPs = model.iPs;
            } 

            /**
             * <p>The mode of access control on source IP addresses. Valid values:</p>
             * <ul>
             * <li><strong>black</strong>: blacklist mode.</li>
             * <li><strong>white</strong>: whitelist mode.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>white</p>
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            /**
             * <p>The source IP addresses in the blacklist or whitelist.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>This parameter is required if AclType is set to white.</p>
             * </li>
             * <li><p>If AclType is set to black but you do not want to add IP addresses to the blacklist, you can leave IPs empty.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             */
            public Builder iPs(java.util.List<String> iPs) {
                this.iPs = iPs;
                return this;
            }

            public IPAclConfig build() {
                return new IPAclConfig(this);
            } 

        } 

    }
}
