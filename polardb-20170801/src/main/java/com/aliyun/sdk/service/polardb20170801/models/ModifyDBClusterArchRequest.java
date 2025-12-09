// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyDBClusterArchRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterArchRequest</p>
 */
public class ModifyDBClusterArchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoUseCoupon")
    private Boolean autoUseCoupon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HotStandbyCluster")
    private String hotStandbyCluster;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionCode")
    private String promotionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandbyAZ")
    private String standbyAZ;

    private ModifyDBClusterArchRequest(Builder builder) {
        super(builder);
        this.autoUseCoupon = builder.autoUseCoupon;
        this.DBClusterId = builder.DBClusterId;
        this.hotStandbyCluster = builder.hotStandbyCluster;
        this.promotionCode = builder.promotionCode;
        this.regionId = builder.regionId;
        this.standbyAZ = builder.standbyAZ;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterArchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoUseCoupon
     */
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return hotStandbyCluster
     */
    public String getHotStandbyCluster() {
        return this.hotStandbyCluster;
    }

    /**
     * @return promotionCode
     */
    public String getPromotionCode() {
        return this.promotionCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return standbyAZ
     */
    public String getStandbyAZ() {
        return this.standbyAZ;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterArchRequest, Builder> {
        private Boolean autoUseCoupon; 
        private String DBClusterId; 
        private String hotStandbyCluster; 
        private String promotionCode; 
        private String regionId; 
        private String standbyAZ; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterArchRequest request) {
            super(request);
            this.autoUseCoupon = request.autoUseCoupon;
            this.DBClusterId = request.DBClusterId;
            this.hotStandbyCluster = request.hotStandbyCluster;
            this.promotionCode = request.promotionCode;
            this.regionId = request.regionId;
            this.standbyAZ = request.standbyAZ;
        } 

        /**
         * AutoUseCoupon.
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-****************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the hot standby storage cluster feature. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enables hot standby storage cluster.</li>
         * <li><strong>equal</strong>: Enable a peer-to-peer cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder hotStandbyCluster(String hotStandbyCluster) {
            this.putQueryParameter("HotStandbyCluster", hotStandbyCluster);
            this.hotStandbyCluster = hotStandbyCluster;
            return this;
        }

        /**
         * PromotionCode.
         */
        public Builder promotionCode(String promotionCode) {
            this.putQueryParameter("PromotionCode", promotionCode);
            this.promotionCode = promotionCode;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query information about regions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The zone of the hot standby storage cluster. Valid values:</p>
         * <ul>
         * <li><strong>auto</strong> (default): The zone is automatically selected.</li>
         * </ul>
         * <blockquote>
         * <p> You can use the default value when HotStandbyCluster is set to on. If HotStandbyCluster is set to equal, specify the zone of the hot standby storage cluster. You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeZones</a> operation to query information about zones.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-i</p>
         */
        public Builder standbyAZ(String standbyAZ) {
            this.putQueryParameter("StandbyAZ", standbyAZ);
            this.standbyAZ = standbyAZ;
            return this;
        }

        @Override
        public ModifyDBClusterArchRequest build() {
            return new ModifyDBClusterArchRequest(this);
        } 

    } 

}
