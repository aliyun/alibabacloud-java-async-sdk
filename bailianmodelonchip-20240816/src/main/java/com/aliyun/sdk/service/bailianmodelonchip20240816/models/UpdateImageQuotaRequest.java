// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816.models;

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
 * {@link UpdateImageQuotaRequest} extends {@link RequestModel}
 *
 * <p>UpdateImageQuotaRequest</p>
 */
public class UpdateImageQuotaRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("duration")
    private Integer duration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("durationType")
    private Integer durationType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("imageCount")
    private Integer imageCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("licenseCount")
    private Long licenseCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("packageType")
    private Integer packageType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("purchaseType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer purchaseType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("recordId")
    private Integer recordId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("settlementAmount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Double settlementAmount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("unitPrice")
    @com.aliyun.core.annotation.Validation(required = true)
    private Double unitPrice;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private UpdateImageQuotaRequest(Builder builder) {
        super(builder);
        this.duration = builder.duration;
        this.durationType = builder.durationType;
        this.imageCount = builder.imageCount;
        this.licenseCount = builder.licenseCount;
        this.packageType = builder.packageType;
        this.productKey = builder.productKey;
        this.purchaseType = builder.purchaseType;
        this.recordId = builder.recordId;
        this.settlementAmount = builder.settlementAmount;
        this.tenantId = builder.tenantId;
        this.unitPrice = builder.unitPrice;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateImageQuotaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return durationType
     */
    public Integer getDurationType() {
        return this.durationType;
    }

    /**
     * @return imageCount
     */
    public Integer getImageCount() {
        return this.imageCount;
    }

    /**
     * @return licenseCount
     */
    public Long getLicenseCount() {
        return this.licenseCount;
    }

    /**
     * @return packageType
     */
    public Integer getPackageType() {
        return this.packageType;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return purchaseType
     */
    public Integer getPurchaseType() {
        return this.purchaseType;
    }

    /**
     * @return recordId
     */
    public Integer getRecordId() {
        return this.recordId;
    }

    /**
     * @return settlementAmount
     */
    public Double getSettlementAmount() {
        return this.settlementAmount;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return unitPrice
     */
    public Double getUnitPrice() {
        return this.unitPrice;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<UpdateImageQuotaRequest, Builder> {
        private Integer duration; 
        private Integer durationType; 
        private Integer imageCount; 
        private Long licenseCount; 
        private Integer packageType; 
        private String productKey; 
        private Integer purchaseType; 
        private Integer recordId; 
        private Double settlementAmount; 
        private String tenantId; 
        private Double unitPrice; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateImageQuotaRequest request) {
            super(request);
            this.duration = request.duration;
            this.durationType = request.durationType;
            this.imageCount = request.imageCount;
            this.licenseCount = request.licenseCount;
            this.packageType = request.packageType;
            this.productKey = request.productKey;
            this.purchaseType = request.purchaseType;
            this.recordId = request.recordId;
            this.settlementAmount = request.settlementAmount;
            this.tenantId = request.tenantId;
            this.unitPrice = request.unitPrice;
            this.userId = request.userId;
        } 

        /**
         * duration.
         */
        public Builder duration(Integer duration) {
            this.putBodyParameter("duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * durationType.
         */
        public Builder durationType(Integer durationType) {
            this.putBodyParameter("durationType", durationType);
            this.durationType = durationType;
            return this;
        }

        /**
         * imageCount.
         */
        public Builder imageCount(Integer imageCount) {
            this.putBodyParameter("imageCount", imageCount);
            this.imageCount = imageCount;
            return this;
        }

        /**
         * licenseCount.
         */
        public Builder licenseCount(Long licenseCount) {
            this.putBodyParameter("licenseCount", licenseCount);
            this.licenseCount = licenseCount;
            return this;
        }

        /**
         * packageType.
         */
        public Builder packageType(Integer packageType) {
            this.putBodyParameter("packageType", packageType);
            this.packageType = packageType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2oImhCz4f8XCviiM</p>
         */
        public Builder productKey(String productKey) {
            this.putBodyParameter("productKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder purchaseType(Integer purchaseType) {
            this.putBodyParameter("purchaseType", purchaseType);
            this.purchaseType = purchaseType;
            return this;
        }

        /**
         * recordId.
         */
        public Builder recordId(Integer recordId) {
            this.putBodyParameter("recordId", recordId);
            this.recordId = recordId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0</p>
         */
        public Builder settlementAmount(Double settlementAmount) {
            this.putBodyParameter("settlementAmount", settlementAmount);
            this.settlementAmount = settlementAmount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>520539530998273</p>
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder unitPrice(Double unitPrice) {
            this.putBodyParameter("unitPrice", unitPrice);
            this.unitPrice = unitPrice;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public UpdateImageQuotaRequest build() {
            return new UpdateImageQuotaRequest(this);
        } 

    } 

}
