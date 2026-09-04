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
 * {@link ResetAndroidInstancesInGroupRequest} extends {@link RequestModel}
 *
 * <p>ResetAndroidInstancesInGroupRequest</p>
 */
public class ResetAndroidInstancesInGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceIds")
    private java.util.List<String> androidInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IgnoreParamValidation")
    private Boolean ignoreParamValidation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaleMode")
    private String saleMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SettingResetType")
    private Integer settingResetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetDataDiskSize")
    private Integer targetDataDiskSize;

    private ResetAndroidInstancesInGroupRequest(Builder builder) {
        super(builder);
        this.androidInstanceIds = builder.androidInstanceIds;
        this.autoPay = builder.autoPay;
        this.ignoreParamValidation = builder.ignoreParamValidation;
        this.promotionId = builder.promotionId;
        this.saleMode = builder.saleMode;
        this.settingResetType = builder.settingResetType;
        this.targetDataDiskSize = builder.targetDataDiskSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetAndroidInstancesInGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return androidInstanceIds
     */
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return ignoreParamValidation
     */
    public Boolean getIgnoreParamValidation() {
        return this.ignoreParamValidation;
    }

    /**
     * @return promotionId
     */
    public String getPromotionId() {
        return this.promotionId;
    }

    /**
     * @return saleMode
     */
    public String getSaleMode() {
        return this.saleMode;
    }

    /**
     * @return settingResetType
     */
    public Integer getSettingResetType() {
        return this.settingResetType;
    }

    /**
     * @return targetDataDiskSize
     */
    public Integer getTargetDataDiskSize() {
        return this.targetDataDiskSize;
    }

    public static final class Builder extends Request.Builder<ResetAndroidInstancesInGroupRequest, Builder> {
        private java.util.List<String> androidInstanceIds; 
        private Boolean autoPay; 
        private Boolean ignoreParamValidation; 
        private String promotionId; 
        private String saleMode; 
        private Integer settingResetType; 
        private Integer targetDataDiskSize; 

        private Builder() {
            super();
        } 

        private Builder(ResetAndroidInstancesInGroupRequest request) {
            super(request);
            this.androidInstanceIds = request.androidInstanceIds;
            this.autoPay = request.autoPay;
            this.ignoreParamValidation = request.ignoreParamValidation;
            this.promotionId = request.promotionId;
            this.saleMode = request.saleMode;
            this.settingResetType = request.settingResetType;
            this.targetDataDiskSize = request.targetDataDiskSize;
        } 

        /**
         * <p>The IDs of the cloud phone instances.</p>
         */
        public Builder androidInstanceIds(java.util.List<String> androidInstanceIds) {
            this.putQueryParameter("AndroidInstanceIds", androidInstanceIds);
            this.androidInstanceIds = androidInstanceIds;
            return this;
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
         * IgnoreParamValidation.
         */
        public Builder ignoreParamValidation(Boolean ignoreParamValidation) {
            this.putQueryParameter("IgnoreParamValidation", ignoreParamValidation);
            this.ignoreParamValidation = ignoreParamValidation;
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

        /**
         * SaleMode.
         */
        public Builder saleMode(String saleMode) {
            this.putQueryParameter("SaleMode", saleMode);
            this.saleMode = saleMode;
            return this;
        }

        /**
         * SettingResetType.
         */
        public Builder settingResetType(Integer settingResetType) {
            this.putQueryParameter("SettingResetType", settingResetType);
            this.settingResetType = settingResetType;
            return this;
        }

        /**
         * TargetDataDiskSize.
         */
        public Builder targetDataDiskSize(Integer targetDataDiskSize) {
            this.putQueryParameter("TargetDataDiskSize", targetDataDiskSize);
            this.targetDataDiskSize = targetDataDiskSize;
            return this;
        }

        @Override
        public ResetAndroidInstancesInGroupRequest build() {
            return new ResetAndroidInstancesInGroupRequest(this);
        } 

    } 

}
