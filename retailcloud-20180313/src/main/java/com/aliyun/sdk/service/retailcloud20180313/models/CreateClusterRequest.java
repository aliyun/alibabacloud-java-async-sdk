// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterRequest</p>
 */
public class CreateClusterRequest extends Request {
    @Query
    @NameInMap("BusinessCode")
    @Validation(required = true)
    private String businessCode;

    @Query
    @NameInMap("CloudMonitorFlags")
    private Integer cloudMonitorFlags;

    @Query
    @NameInMap("ClusterEnvType")
    @Validation(required = true)
    private String clusterEnvType;

    @Query
    @NameInMap("ClusterId")
    private Long clusterId;

    @Query
    @NameInMap("ClusterTitle")
    @Validation(required = true)
    private String clusterTitle;

    @Query
    @NameInMap("ClusterType")
    @Validation(required = true)
    private String clusterType;

    @Query
    @NameInMap("CreateWithArmsIntegration")
    private Boolean createWithArmsIntegration;

    @Query
    @NameInMap("CreateWithLogIntegration")
    private Boolean createWithLogIntegration;

    @Query
    @NameInMap("KeyPair")
    private String keyPair;

    @Query
    @NameInMap("NetPlug")
    private String netPlug;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("PodCIDR")
    private String podCIDR;

    @Query
    @NameInMap("PrivateZone")
    private Boolean privateZone;

    @Query
    @NameInMap("PublicSlb")
    private Integer publicSlb;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RegionName")
    private String regionName;

    @Query
    @NameInMap("ServiceCIDR")
    private String serviceCIDR;

    @Query
    @NameInMap("SnatEntry")
    private Integer snatEntry;

    @Query
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    @Query
    @NameInMap("Vswitchids")
    @Validation(required = true)
    private java.util.List < String > vswitchids;

    private CreateClusterRequest(Builder builder) {
        super(builder);
        this.businessCode = builder.businessCode;
        this.cloudMonitorFlags = builder.cloudMonitorFlags;
        this.clusterEnvType = builder.clusterEnvType;
        this.clusterId = builder.clusterId;
        this.clusterTitle = builder.clusterTitle;
        this.clusterType = builder.clusterType;
        this.createWithArmsIntegration = builder.createWithArmsIntegration;
        this.createWithLogIntegration = builder.createWithLogIntegration;
        this.keyPair = builder.keyPair;
        this.netPlug = builder.netPlug;
        this.password = builder.password;
        this.podCIDR = builder.podCIDR;
        this.privateZone = builder.privateZone;
        this.publicSlb = builder.publicSlb;
        this.regionId = builder.regionId;
        this.regionName = builder.regionName;
        this.serviceCIDR = builder.serviceCIDR;
        this.snatEntry = builder.snatEntry;
        this.vpcId = builder.vpcId;
        this.vswitchids = builder.vswitchids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessCode
     */
    public String getBusinessCode() {
        return this.businessCode;
    }

    /**
     * @return cloudMonitorFlags
     */
    public Integer getCloudMonitorFlags() {
        return this.cloudMonitorFlags;
    }

    /**
     * @return clusterEnvType
     */
    public String getClusterEnvType() {
        return this.clusterEnvType;
    }

    /**
     * @return clusterId
     */
    public Long getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterTitle
     */
    public String getClusterTitle() {
        return this.clusterTitle;
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return createWithArmsIntegration
     */
    public Boolean getCreateWithArmsIntegration() {
        return this.createWithArmsIntegration;
    }

    /**
     * @return createWithLogIntegration
     */
    public Boolean getCreateWithLogIntegration() {
        return this.createWithLogIntegration;
    }

    /**
     * @return keyPair
     */
    public String getKeyPair() {
        return this.keyPair;
    }

    /**
     * @return netPlug
     */
    public String getNetPlug() {
        return this.netPlug;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return podCIDR
     */
    public String getPodCIDR() {
        return this.podCIDR;
    }

    /**
     * @return privateZone
     */
    public Boolean getPrivateZone() {
        return this.privateZone;
    }

    /**
     * @return publicSlb
     */
    public Integer getPublicSlb() {
        return this.publicSlb;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return regionName
     */
    public String getRegionName() {
        return this.regionName;
    }

    /**
     * @return serviceCIDR
     */
    public String getServiceCIDR() {
        return this.serviceCIDR;
    }

    /**
     * @return snatEntry
     */
    public Integer getSnatEntry() {
        return this.snatEntry;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vswitchids
     */
    public java.util.List < String > getVswitchids() {
        return this.vswitchids;
    }

    public static final class Builder extends Request.Builder<CreateClusterRequest, Builder> {
        private String businessCode; 
        private Integer cloudMonitorFlags; 
        private String clusterEnvType; 
        private Long clusterId; 
        private String clusterTitle; 
        private String clusterType; 
        private Boolean createWithArmsIntegration; 
        private Boolean createWithLogIntegration; 
        private String keyPair; 
        private String netPlug; 
        private String password; 
        private String podCIDR; 
        private Boolean privateZone; 
        private Integer publicSlb; 
        private String regionId; 
        private String regionName; 
        private String serviceCIDR; 
        private Integer snatEntry; 
        private String vpcId; 
        private java.util.List < String > vswitchids; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterRequest request) {
            super(request);
            this.businessCode = request.businessCode;
            this.cloudMonitorFlags = request.cloudMonitorFlags;
            this.clusterEnvType = request.clusterEnvType;
            this.clusterId = request.clusterId;
            this.clusterTitle = request.clusterTitle;
            this.clusterType = request.clusterType;
            this.createWithArmsIntegration = request.createWithArmsIntegration;
            this.createWithLogIntegration = request.createWithLogIntegration;
            this.keyPair = request.keyPair;
            this.netPlug = request.netPlug;
            this.password = request.password;
            this.podCIDR = request.podCIDR;
            this.privateZone = request.privateZone;
            this.publicSlb = request.publicSlb;
            this.regionId = request.regionId;
            this.regionName = request.regionName;
            this.serviceCIDR = request.serviceCIDR;
            this.snatEntry = request.snatEntry;
            this.vpcId = request.vpcId;
            this.vswitchids = request.vswitchids;
        } 

        /**
         * BusinessCode.
         */
        public Builder businessCode(String businessCode) {
            this.putQueryParameter("BusinessCode", businessCode);
            this.businessCode = businessCode;
            return this;
        }

        /**
         * CloudMonitorFlags.
         */
        public Builder cloudMonitorFlags(Integer cloudMonitorFlags) {
            this.putQueryParameter("CloudMonitorFlags", cloudMonitorFlags);
            this.cloudMonitorFlags = cloudMonitorFlags;
            return this;
        }

        /**
         * ClusterEnvType.
         */
        public Builder clusterEnvType(String clusterEnvType) {
            this.putQueryParameter("ClusterEnvType", clusterEnvType);
            this.clusterEnvType = clusterEnvType;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(Long clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ClusterTitle.
         */
        public Builder clusterTitle(String clusterTitle) {
            this.putQueryParameter("ClusterTitle", clusterTitle);
            this.clusterTitle = clusterTitle;
            return this;
        }

        /**
         * ClusterType.
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * CreateWithArmsIntegration.
         */
        public Builder createWithArmsIntegration(Boolean createWithArmsIntegration) {
            this.putQueryParameter("CreateWithArmsIntegration", createWithArmsIntegration);
            this.createWithArmsIntegration = createWithArmsIntegration;
            return this;
        }

        /**
         * CreateWithLogIntegration.
         */
        public Builder createWithLogIntegration(Boolean createWithLogIntegration) {
            this.putQueryParameter("CreateWithLogIntegration", createWithLogIntegration);
            this.createWithLogIntegration = createWithLogIntegration;
            return this;
        }

        /**
         * KeyPair.
         */
        public Builder keyPair(String keyPair) {
            this.putQueryParameter("KeyPair", keyPair);
            this.keyPair = keyPair;
            return this;
        }

        /**
         * NetPlug.
         */
        public Builder netPlug(String netPlug) {
            this.putQueryParameter("NetPlug", netPlug);
            this.netPlug = netPlug;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * PodCIDR.
         */
        public Builder podCIDR(String podCIDR) {
            this.putQueryParameter("PodCIDR", podCIDR);
            this.podCIDR = podCIDR;
            return this;
        }

        /**
         * PrivateZone.
         */
        public Builder privateZone(Boolean privateZone) {
            this.putQueryParameter("PrivateZone", privateZone);
            this.privateZone = privateZone;
            return this;
        }

        /**
         * PublicSlb.
         */
        public Builder publicSlb(Integer publicSlb) {
            this.putQueryParameter("PublicSlb", publicSlb);
            this.publicSlb = publicSlb;
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
         * RegionName.
         */
        public Builder regionName(String regionName) {
            this.putQueryParameter("RegionName", regionName);
            this.regionName = regionName;
            return this;
        }

        /**
         * ServiceCIDR.
         */
        public Builder serviceCIDR(String serviceCIDR) {
            this.putQueryParameter("ServiceCIDR", serviceCIDR);
            this.serviceCIDR = serviceCIDR;
            return this;
        }

        /**
         * SnatEntry.
         */
        public Builder snatEntry(Integer snatEntry) {
            this.putQueryParameter("SnatEntry", snatEntry);
            this.snatEntry = snatEntry;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * Vswitchids.
         */
        public Builder vswitchids(java.util.List < String > vswitchids) {
            this.putQueryParameter("Vswitchids", vswitchids);
            this.vswitchids = vswitchids;
            return this;
        }

        @Override
        public CreateClusterRequest build() {
            return new CreateClusterRequest(this);
        } 

    } 

}
