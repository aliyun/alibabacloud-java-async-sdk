// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeFaceGuardRiskRequest} extends {@link RequestModel}
 *
 * <p>DescribeFaceGuardRiskRequest</p>
 */
public class DescribeFaceGuardRiskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceToken")
    private String deviceToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OuterOrderNo")
    private String outerOrderNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    private DescribeFaceGuardRiskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.deviceToken = builder.deviceToken;
        this.outerOrderNo = builder.outerOrderNo;
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFaceGuardRiskRequest create() {
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
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return deviceToken
     */
    public String getDeviceToken() {
        return this.deviceToken;
    }

    /**
     * @return outerOrderNo
     */
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    public static final class Builder extends Request.Builder<DescribeFaceGuardRiskRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String deviceToken; 
        private String outerOrderNo; 
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFaceGuardRiskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.deviceToken = request.deviceToken;
            this.outerOrderNo = request.outerOrderNo;
            this.productCode = request.productCode;
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
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * DeviceToken.
         */
        public Builder deviceToken(String deviceToken) {
            this.putQueryParameter("DeviceToken", deviceToken);
            this.deviceToken = deviceToken;
            return this;
        }

        /**
         * OuterOrderNo.
         */
        public Builder outerOrderNo(String outerOrderNo) {
            this.putQueryParameter("OuterOrderNo", outerOrderNo);
            this.outerOrderNo = outerOrderNo;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        @Override
        public DescribeFaceGuardRiskRequest build() {
            return new DescribeFaceGuardRiskRequest(this);
        } 

    } 

}
