// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BuyPayAsYouGoOrderRequest} extends {@link RequestModel}
 *
 * <p>BuyPayAsYouGoOrderRequest</p>
 */
public class BuyPayAsYouGoOrderRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CommodityType")
    @Validation(required = true)
    private String commodityType;

    @Query
    @NameInMap("InsNum")
    @Validation(required = true)
    private Integer insNum;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    @Query
    @NameInMap("VersionType")
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
         * 商品类型
         * <p>
         * - versionType：管控模式
         * - SensitiveDataProtection：敏感数据保护
         */
        public Builder commodityType(String commodityType) {
            this.putQueryParameter("CommodityType", commodityType);
            this.commodityType = commodityType;
            return this;
        }

        /**
         * 购买额度（一个额度可用于一个数据库实例）
         */
        public Builder insNum(Integer insNum) {
            this.putQueryParameter("InsNum", insNum);
            this.insNum = insNum;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * 购买管控模式时（CommodityType = versionType ），区分管控模式的类型：
         * <p>
         * - stand：稳定变更
         * - safety：安全协同
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
