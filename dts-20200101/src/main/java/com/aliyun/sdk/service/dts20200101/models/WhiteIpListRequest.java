// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link WhiteIpListRequest} extends {@link RequestModel}
 *
 * <p>WhiteIpListRequest</p>
 */
public class WhiteIpListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestAliyunUid")
    private String destAliyunUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestPrimaryVswId")
    private String destPrimaryVswId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestRoleName")
    private String destRoleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestSecondaryVswId")
    private String destSecondaryVswId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestVpcId")
    private String destVpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationRegion")
    private String destinationRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcAliyunUid")
    private String srcAliyunUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcPrimaryVswId")
    private String srcPrimaryVswId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcRoleName")
    private String srcRoleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcSecondaryVswId")
    private String srcSecondaryVswId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcVpcId")
    private String srcVpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZeroEtlJob")
    private Boolean zeroEtlJob;

    private WhiteIpListRequest(Builder builder) {
        super(builder);
        this.destAliyunUid = builder.destAliyunUid;
        this.destPrimaryVswId = builder.destPrimaryVswId;
        this.destRoleName = builder.destRoleName;
        this.destSecondaryVswId = builder.destSecondaryVswId;
        this.destVpcId = builder.destVpcId;
        this.destinationRegion = builder.destinationRegion;
        this.region = builder.region;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.srcAliyunUid = builder.srcAliyunUid;
        this.srcPrimaryVswId = builder.srcPrimaryVswId;
        this.srcRoleName = builder.srcRoleName;
        this.srcSecondaryVswId = builder.srcSecondaryVswId;
        this.srcVpcId = builder.srcVpcId;
        this.type = builder.type;
        this.zeroEtlJob = builder.zeroEtlJob;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WhiteIpListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destAliyunUid
     */
    public String getDestAliyunUid() {
        return this.destAliyunUid;
    }

    /**
     * @return destPrimaryVswId
     */
    public String getDestPrimaryVswId() {
        return this.destPrimaryVswId;
    }

    /**
     * @return destRoleName
     */
    public String getDestRoleName() {
        return this.destRoleName;
    }

    /**
     * @return destSecondaryVswId
     */
    public String getDestSecondaryVswId() {
        return this.destSecondaryVswId;
    }

    /**
     * @return destVpcId
     */
    public String getDestVpcId() {
        return this.destVpcId;
    }

    /**
     * @return destinationRegion
     */
    public String getDestinationRegion() {
        return this.destinationRegion;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return srcAliyunUid
     */
    public String getSrcAliyunUid() {
        return this.srcAliyunUid;
    }

    /**
     * @return srcPrimaryVswId
     */
    public String getSrcPrimaryVswId() {
        return this.srcPrimaryVswId;
    }

    /**
     * @return srcRoleName
     */
    public String getSrcRoleName() {
        return this.srcRoleName;
    }

    /**
     * @return srcSecondaryVswId
     */
    public String getSrcSecondaryVswId() {
        return this.srcSecondaryVswId;
    }

    /**
     * @return srcVpcId
     */
    public String getSrcVpcId() {
        return this.srcVpcId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return zeroEtlJob
     */
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

    public static final class Builder extends Request.Builder<WhiteIpListRequest, Builder> {
        private String destAliyunUid; 
        private String destPrimaryVswId; 
        private String destRoleName; 
        private String destSecondaryVswId; 
        private String destVpcId; 
        private String destinationRegion; 
        private String region; 
        private String regionId; 
        private String resourceGroupId; 
        private String srcAliyunUid; 
        private String srcPrimaryVswId; 
        private String srcRoleName; 
        private String srcSecondaryVswId; 
        private String srcVpcId; 
        private String type; 
        private Boolean zeroEtlJob; 

        private Builder() {
            super();
        } 

        private Builder(WhiteIpListRequest request) {
            super(request);
            this.destAliyunUid = request.destAliyunUid;
            this.destPrimaryVswId = request.destPrimaryVswId;
            this.destRoleName = request.destRoleName;
            this.destSecondaryVswId = request.destSecondaryVswId;
            this.destVpcId = request.destVpcId;
            this.destinationRegion = request.destinationRegion;
            this.region = request.region;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.srcAliyunUid = request.srcAliyunUid;
            this.srcPrimaryVswId = request.srcPrimaryVswId;
            this.srcRoleName = request.srcRoleName;
            this.srcSecondaryVswId = request.srcSecondaryVswId;
            this.srcVpcId = request.srcVpcId;
            this.type = request.type;
            this.zeroEtlJob = request.zeroEtlJob;
        } 

        /**
         * <p>The Alibaba Cloud account ID of the destination.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder destAliyunUid(String destAliyunUid) {
            this.putQueryParameter("DestAliyunUid", destAliyunUid);
            this.destAliyunUid = destAliyunUid;
            return this;
        }

        /**
         * <p>The ID of the primary vSwitch for the destination VPC NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder destPrimaryVswId(String destPrimaryVswId) {
            this.putQueryParameter("DestPrimaryVswId", destPrimaryVswId);
            this.destPrimaryVswId = destPrimaryVswId;
            return this;
        }

        /**
         * <p>The name of the destination role.</p>
         * 
         * <strong>example:</strong>
         * <p>ram-for-dts-sq</p>
         */
        public Builder destRoleName(String destRoleName) {
            this.putQueryParameter("DestRoleName", destRoleName);
            this.destRoleName = destRoleName;
            return this;
        }

        /**
         * <p>The ID of the secondary vSwitch for the destination VPC NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder destSecondaryVswId(String destSecondaryVswId) {
            this.putQueryParameter("DestSecondaryVswId", destSecondaryVswId);
            this.destSecondaryVswId = destSecondaryVswId;
            return this;
        }

        /**
         * <p>The ID of the destination VPC.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder destVpcId(String destVpcId) {
            this.putQueryParameter("DestVpcId", destVpcId);
            this.destVpcId = destVpcId;
            return this;
        }

        /**
         * <p>The region ID of the destination instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
         * <blockquote>
         * <ul>
         * <li>If the destination instance is a self-managed database or a third-party cloud database that has a public IP address, you can specify <strong>cn-hangzhou</strong> or the ID of the region that is geographically closest to the database.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>This parameter is required when the DTS task is a data migration or data synchronization task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder destinationRegion(String destinationRegion) {
            this.putQueryParameter("DestinationRegion", destinationRegion);
            this.destinationRegion = destinationRegion;
            return this;
        }

        /**
         * <p>The region ID of the source instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
         * <blockquote>
         * <p>If the source instance is a self-managed database or a third-party cloud database that has a public IP address, you can specify <strong>cn-hangzhou</strong> or the ID of the region that is geographically closest to the database.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The region ID of the DTS instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek26mat2ldb4oy</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the source.</p>
         * 
         * <strong>example:</strong>
         * <p>1971721963139419</p>
         */
        public Builder srcAliyunUid(String srcAliyunUid) {
            this.putQueryParameter("SrcAliyunUid", srcAliyunUid);
            this.srcAliyunUid = srcAliyunUid;
            return this;
        }

        /**
         * <p>The ID of the primary vSwitch for the source VPC NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder srcPrimaryVswId(String srcPrimaryVswId) {
            this.putQueryParameter("SrcPrimaryVswId", srcPrimaryVswId);
            this.srcPrimaryVswId = srcPrimaryVswId;
            return this;
        }

        /**
         * <p>The name of the source role.</p>
         * 
         * <strong>example:</strong>
         * <p>ram-for-dts</p>
         */
        public Builder srcRoleName(String srcRoleName) {
            this.putQueryParameter("SrcRoleName", srcRoleName);
            this.srcRoleName = srcRoleName;
            return this;
        }

        /**
         * <p>The ID of the secondary vSwitch for the source VPC NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder srcSecondaryVswId(String srcSecondaryVswId) {
            this.putQueryParameter("SrcSecondaryVswId", srcSecondaryVswId);
            this.srcSecondaryVswId = srcSecondaryVswId;
            return this;
        }

        /**
         * <p>The ID of the source VPC.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder srcVpcId(String srcVpcId) {
            this.putQueryParameter("SrcVpcId", srcVpcId);
            this.srcVpcId = srcVpcId;
            return this;
        }

        /**
         * <p>The connection method of the self-managed database or third-party cloud database. Valid values:</p>
         * <ul>
         * <li><strong>internet</strong>: connected over the Internet.</li>
         * <li><strong>vpc</strong>: connected over an Express Connect circuit, a VPN gateway, or a Smart Access Gateway (SAG).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>Specifies whether the task is a zero-ETL task. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes.</li>
         * <li><strong>false</strong>: no.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder zeroEtlJob(Boolean zeroEtlJob) {
            this.putQueryParameter("ZeroEtlJob", zeroEtlJob);
            this.zeroEtlJob = zeroEtlJob;
            return this;
        }

        @Override
        public WhiteIpListRequest build() {
            return new WhiteIpListRequest(this);
        } 

    } 

}
