// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateQuotaAlarmRequest} extends {@link RequestModel}
 *
 * <p>CreateQuotaAlarmRequest</p>
 */
public class CreateQuotaAlarmRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlarmName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alarmName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QuotaActionCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String quotaActionCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QuotaDimensions")
    private java.util.List < QuotaDimensions> quotaDimensions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Threshold")
    private Float threshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThresholdPercent")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 50)
    private Float thresholdPercent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThresholdType")
    private String thresholdType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WebHook")
    private String webHook;

    private CreateQuotaAlarmRequest(Builder builder) {
        super(builder);
        this.alarmName = builder.alarmName;
        this.productCode = builder.productCode;
        this.quotaActionCode = builder.quotaActionCode;
        this.quotaDimensions = builder.quotaDimensions;
        this.threshold = builder.threshold;
        this.thresholdPercent = builder.thresholdPercent;
        this.thresholdType = builder.thresholdType;
        this.webHook = builder.webHook;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQuotaAlarmRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmName
     */
    public String getAlarmName() {
        return this.alarmName;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return quotaActionCode
     */
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

    /**
     * @return quotaDimensions
     */
    public java.util.List < QuotaDimensions> getQuotaDimensions() {
        return this.quotaDimensions;
    }

    /**
     * @return threshold
     */
    public Float getThreshold() {
        return this.threshold;
    }

    /**
     * @return thresholdPercent
     */
    public Float getThresholdPercent() {
        return this.thresholdPercent;
    }

    /**
     * @return thresholdType
     */
    public String getThresholdType() {
        return this.thresholdType;
    }

    /**
     * @return webHook
     */
    public String getWebHook() {
        return this.webHook;
    }

    public static final class Builder extends Request.Builder<CreateQuotaAlarmRequest, Builder> {
        private String alarmName; 
        private String productCode; 
        private String quotaActionCode; 
        private java.util.List < QuotaDimensions> quotaDimensions; 
        private Float threshold; 
        private Float thresholdPercent; 
        private String thresholdType; 
        private String webHook; 

        private Builder() {
            super();
        } 

        private Builder(CreateQuotaAlarmRequest request) {
            super(request);
            this.alarmName = request.alarmName;
            this.productCode = request.productCode;
            this.quotaActionCode = request.quotaActionCode;
            this.quotaDimensions = request.quotaDimensions;
            this.threshold = request.threshold;
            this.thresholdPercent = request.thresholdPercent;
            this.thresholdType = request.thresholdType;
            this.webHook = request.webHook;
        } 

        /**
         * AlarmName.
         */
        public Builder alarmName(String alarmName) {
            this.putBodyParameter("AlarmName", alarmName);
            this.alarmName = alarmName;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * QuotaActionCode.
         */
        public Builder quotaActionCode(String quotaActionCode) {
            this.putBodyParameter("QuotaActionCode", quotaActionCode);
            this.quotaActionCode = quotaActionCode;
            return this;
        }

        /**
         * QuotaDimensions.
         */
        public Builder quotaDimensions(java.util.List < QuotaDimensions> quotaDimensions) {
            this.putBodyParameter("QuotaDimensions", quotaDimensions);
            this.quotaDimensions = quotaDimensions;
            return this;
        }

        /**
         * Threshold.
         */
        public Builder threshold(Float threshold) {
            this.putBodyParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        /**
         * ThresholdPercent.
         */
        public Builder thresholdPercent(Float thresholdPercent) {
            this.putBodyParameter("ThresholdPercent", thresholdPercent);
            this.thresholdPercent = thresholdPercent;
            return this;
        }

        /**
         * ThresholdType.
         */
        public Builder thresholdType(String thresholdType) {
            this.putBodyParameter("ThresholdType", thresholdType);
            this.thresholdType = thresholdType;
            return this;
        }

        /**
         * WebHook.
         */
        public Builder webHook(String webHook) {
            this.putBodyParameter("WebHook", webHook);
            this.webHook = webHook;
            return this;
        }

        @Override
        public CreateQuotaAlarmRequest build() {
            return new CreateQuotaAlarmRequest(this);
        } 

    } 

    public static class QuotaDimensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private QuotaDimensions(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaDimensions create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public QuotaDimensions build() {
                return new QuotaDimensions(this);
            } 

        } 

    }
}
