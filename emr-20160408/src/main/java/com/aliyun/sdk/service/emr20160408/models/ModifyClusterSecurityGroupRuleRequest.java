// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterSecurityGroupRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyClusterSecurityGroupRuleRequest</p>
 */
public class ModifyClusterSecurityGroupRuleRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("IpProtocol")
    @Validation(required = true)
    private String ipProtocol;

    @Query
    @NameInMap("ModifyType")
    @Validation(required = true)
    private String modifyType;

    @Query
    @NameInMap("NicType")
    @Validation(required = true)
    private String nicType;

    @Query
    @NameInMap("PortRange")
    @Validation(required = true)
    private String portRange;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("WhiteIp")
    @Validation(required = true)
    private String whiteIp;

    private ModifyClusterSecurityGroupRuleRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.ipProtocol = builder.ipProtocol;
        this.modifyType = builder.modifyType;
        this.nicType = builder.nicType;
        this.portRange = builder.portRange;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.whiteIp = builder.whiteIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClusterSecurityGroupRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return ipProtocol
     */
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * @return modifyType
     */
    public String getModifyType() {
        return this.modifyType;
    }

    /**
     * @return nicType
     */
    public String getNicType() {
        return this.nicType;
    }

    /**
     * @return portRange
     */
    public String getPortRange() {
        return this.portRange;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return whiteIp
     */
    public String getWhiteIp() {
        return this.whiteIp;
    }

    public static final class Builder extends Request.Builder<ModifyClusterSecurityGroupRuleRequest, Builder> {
        private String clusterId; 
        private String ipProtocol; 
        private String modifyType; 
        private String nicType; 
        private String portRange; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String whiteIp; 

        private Builder() {
            super();
        } 

        private Builder(ModifyClusterSecurityGroupRuleRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.ipProtocol = response.ipProtocol;
            this.modifyType = response.modifyType;
            this.nicType = response.nicType;
            this.portRange = response.portRange;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.whiteIp = response.whiteIp;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * IpProtocol.
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * ModifyType.
         */
        public Builder modifyType(String modifyType) {
            this.putQueryParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
            return this;
        }

        /**
         * NicType.
         */
        public Builder nicType(String nicType) {
            this.putQueryParameter("NicType", nicType);
            this.nicType = nicType;
            return this;
        }

        /**
         * PortRange.
         */
        public Builder portRange(String portRange) {
            this.putQueryParameter("PortRange", portRange);
            this.portRange = portRange;
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

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * WhiteIp.
         */
        public Builder whiteIp(String whiteIp) {
            this.putQueryParameter("WhiteIp", whiteIp);
            this.whiteIp = whiteIp;
            return this;
        }

        @Override
        public ModifyClusterSecurityGroupRuleRequest build() {
            return new ModifyClusterSecurityGroupRuleRequest(this);
        } 

    } 

}
