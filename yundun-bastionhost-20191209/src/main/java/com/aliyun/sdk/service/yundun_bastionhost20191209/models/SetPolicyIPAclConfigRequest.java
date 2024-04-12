// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPolicyIPAclConfigRequest} extends {@link RequestModel}
 *
 * <p>SetPolicyIPAclConfigRequest</p>
 */
public class SetPolicyIPAclConfigRequest extends Request {
    @Query
    @NameInMap("IPAclConfig")
    @Validation(required = true)
    private IPAclConfig IPAclConfig;

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
         * IPAclConfig.
         */
        public Builder IPAclConfig(IPAclConfig IPAclConfig) {
            String IPAclConfigShrink = shrink(IPAclConfig, "IPAclConfig", "json");
            this.putQueryParameter("IPAclConfig", IPAclConfigShrink);
            this.IPAclConfig = IPAclConfig;
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
        public SetPolicyIPAclConfigRequest build() {
            return new SetPolicyIPAclConfigRequest(this);
        } 

    } 

    public static class IPAclConfig extends TeaModel {
        @NameInMap("AclType")
        @Validation(required = true)
        private String aclType;

        @NameInMap("IPs")
        @Validation(required = true)
        private java.util.List < String > iPs;

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
        public java.util.List < String > getIPs() {
            return this.iPs;
        }

        public static final class Builder {
            private String aclType; 
            private java.util.List < String > iPs; 

            /**
             * AclType.
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            /**
             * IPs.
             */
            public Builder iPs(java.util.List < String > iPs) {
                this.iPs = iPs;
                return this;
            }

            public IPAclConfig build() {
                return new IPAclConfig(this);
            } 

        } 

    }
}
