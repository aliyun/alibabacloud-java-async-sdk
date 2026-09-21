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
         * <p>The list of instance IDs.</p>
         */
        public Builder androidInstanceIds(java.util.List<String> androidInstanceIds) {
            this.putQueryParameter("AndroidInstanceIds", androidInstanceIds);
            this.androidInstanceIds = androidInstanceIds;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic payment. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>The promotion ID.</p>
         * 
         * <strong>example:</strong>
         * <p>50003308011****</p>
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The sales mode. This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        public Builder saleMode(String saleMode) {
            this.putQueryParameter("SaleMode", saleMode);
            this.saleMode = saleMode;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;Specifies whether to retain attribute settings during the reset. If this parameter is not specified, attribute configurations are not retained by default. This parameter takes effect only for cloud phone matrix instances. Run the wya dump config command to view the details of retained attributes.
         * &lt;props=&quot;intl&quot;&gt;This parameter is not supported on the international site.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder settingResetType(Integer settingResetType) {
            this.putQueryParameter("SettingResetType", settingResetType);
            this.settingResetType = settingResetType;
            return this;
        }

        /**
         * <p>Specify this parameter when you need to reduce storage while resetting instances in a cloud phone matrix. This feature is currently available through a whitelist. This parameter applies only to instances in a cloud phone matrix.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
