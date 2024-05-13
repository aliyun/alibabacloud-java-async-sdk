// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BuyPayAsYouGoOrderRequest} extends {@link RequestModel}
 *
 * <p>BuyPayAsYouGoOrderRequest</p>
 */
public class BuyPayAsYouGoOrderRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommodityType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commodityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InsNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer insNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionType")
    private String versionType;

    private BuyPayAsYouGoOrderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.commodityType = builder.commodityType;
        this.insNum = builder.insNum;
        this.tid = builder.tid;
        this.versionType = builder.versionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BuyPayAsYouGoOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return commodityType
     */
    public String getCommodityType() {
        return this.commodityType;
    }

    /**
     * @return insNum
     */
    public Integer getInsNum() {
        return this.insNum;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return versionType
     */
    public String getVersionType() {
        return this.versionType;
    }

    public static final class Builder extends Request.Builder<BuyPayAsYouGoOrderRequest, Builder> {
        private String regionId; 
        private String commodityType; 
        private Integer insNum; 
        private Long tid; 
        private String versionType; 

        private Builder() {
            super();
        } 

        private Builder(BuyPayAsYouGoOrderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.commodityType = request.commodityType;
            this.insNum = request.insNum;
            this.tid = request.tid;
            this.versionType = request.versionType;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The type of the resource that you want to purchase.
         * <p>
         * 
         * *   **VersionType**: DMS that supports control modes
         * *   **SensitiveDataProtection**: DMS that supports sensitive data protection
         */
        public Builder commodityType(String commodityType) {
            this.putQueryParameter("CommodityType", commodityType);
            this.commodityType = commodityType;
            return this;
        }

        /**
         * The number of database instances that you want to use DMS to manage.
         * <p>
         * 
         * > A quota can be used for only one database instance.
         */
        public Builder insNum(Integer insNum) {
            this.putQueryParameter("InsNum", insNum);
            this.insNum = insNum;
            return this;
        }

        /**
         * The ID of the tenant.
         * <p>
         * 
         * > To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * The control mode of DMS. Valid values:
         * <p>
         * 
         * *   **stand**: Stable Change
         * *   **safety**: Security Collaboration
         */
        public Builder versionType(String versionType) {
            this.putQueryParameter("VersionType", versionType);
            this.versionType = versionType;
            return this;
        }

        @Override
        public BuyPayAsYouGoOrderRequest build() {
            return new BuyPayAsYouGoOrderRequest(this);
        } 

    } 

}
