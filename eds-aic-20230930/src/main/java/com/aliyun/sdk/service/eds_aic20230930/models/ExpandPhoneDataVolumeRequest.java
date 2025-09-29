// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link ExpandPhoneDataVolumeRequest} extends {@link RequestModel}
 *
 * <p>ExpandPhoneDataVolumeRequest</p>
 */
public class ExpandPhoneDataVolumeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneDataVolume")
    private Integer phoneDataVolume;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    private ExpandPhoneDataVolumeRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.bizRegionId = builder.bizRegionId;
        this.instanceIds = builder.instanceIds;
        this.phoneDataVolume = builder.phoneDataVolume;
        this.promotionId = builder.promotionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExpandPhoneDataVolumeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return phoneDataVolume
     */
    public Integer getPhoneDataVolume() {
        return this.phoneDataVolume;
    }

    /**
     * @return promotionId
     */
    public String getPromotionId() {
        return this.promotionId;
    }

    public static final class Builder extends Request.Builder<ExpandPhoneDataVolumeRequest, Builder> {
        private Boolean autoPay; 
        private String bizRegionId; 
        private java.util.List<String> instanceIds; 
        private Integer phoneDataVolume; 
        private String promotionId; 

        private Builder() {
            super();
        } 

        private Builder(ExpandPhoneDataVolumeRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.bizRegionId = request.bizRegionId;
            this.instanceIds = request.instanceIds;
            this.phoneDataVolume = request.phoneDataVolume;
            this.promotionId = request.promotionId;
        } 

        /**
         * AutoPay.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * BizRegionId.
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * PhoneDataVolume.
         */
        public Builder phoneDataVolume(Integer phoneDataVolume) {
            this.putQueryParameter("PhoneDataVolume", phoneDataVolume);
            this.phoneDataVolume = phoneDataVolume;
            return this;
        }

        /**
         * PromotionId.
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        @Override
        public ExpandPhoneDataVolumeRequest build() {
            return new ExpandPhoneDataVolumeRequest(this);
        } 

    } 

}
