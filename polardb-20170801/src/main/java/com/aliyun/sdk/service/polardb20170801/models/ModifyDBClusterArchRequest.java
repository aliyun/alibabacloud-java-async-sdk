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
         * <p>Specifies whether to automatically use coupons. Valid values:</p>
         * <ul>
         * <li>true (default): Uses coupons.</li>
         * <li>false: Does not use coupons.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
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
         * <p>Specifies whether to enable the hot standby cluster. Valid values:</p>
         * <ul>
         * <li>on: Enables the hot standby cluster.
         * The equal (peer cluster) feature has been retired and is unavailable. Clusters with HotStandbyCluster set to StandbyClusterON do not support switching the high-availability mode by using this operation.</li>
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
         * <p>The coupon code. If you do not specify this parameter, the default coupon is used.</p>
         * 
         * <strong>example:</strong>
         * <p>727xxxxxx934</p>
         */
        public Builder promotionCode(String promotionCode) {
            this.putQueryParameter("PromotionCode", promotionCode);
            this.promotionCode = promotionCode;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to view region details.</p>
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
         * <li><strong>auto</strong> (default): Automatically selects the zone.<blockquote>
         * <p>You can use the default value when the HotStandbyCluster parameter is set to on. When the HotStandbyCluster parameter is set to equal, you must specify a zone. You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeZones</a> operation to view zone details.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <blockquote>
         * <p>When you specify a zone, you must not allocate a zone that is already in use by the cluster. You can query the currently active zones through the ZoneIds parameter of DescribeDBClusterAttribute.</p>
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
