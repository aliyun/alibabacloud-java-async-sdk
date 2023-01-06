// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateQuotaAlarmRequest} extends {@link RequestModel}
 *
 * <p>CreateQuotaAlarmRequest</p>
 */
public class CreateQuotaAlarmRequest extends Request {
    @Body
    @NameInMap("AlarmName")
    @Validation(required = true)
    private String alarmName;

    @Body
    @NameInMap("ProductCode")
    @Validation(required = true)
    private String productCode;

    @Body
    @NameInMap("QuotaActionCode")
    @Validation(required = true)
    private String quotaActionCode;

    @Body
    @NameInMap("QuotaDimensions")
    private java.util.List < QuotaDimensions> quotaDimensions;

    @Body
    @NameInMap("Threshold")
    private Float threshold;

    @Body
    @NameInMap("ThresholdPercent")
    @Validation(maximum = 100, minimum = 50)
    private Float thresholdPercent;

    @Body
    @NameInMap("ThresholdType")
    private String thresholdType;

    @Body
    @NameInMap("WebHook")
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
         * The name of the quota alert.
         */
        public Builder alarmName(String alarmName) {
            this.putBodyParameter("AlarmName", alarmName);
            this.alarmName = alarmName;
            return this;
        }

        /**
         * The abbreviation of the cloud service name.
         * <p>
         * 
         * >  For more information, see [Alibaba Cloud services that support Quota Center](~~182368~~).
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * The ID of the quota.
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
         * The numeric value of the alert threshold. The value must meet the following requirements:
         * <p>
         * 
         * *   If the `ThresholdType` parameter is set to `used` and the used quota is greater than or equal to a specified value, you receive an alert. The alert threshold must be greater than the current used quota.
         * *   If the `ThresholdType` parameter is set to `usable` and the available quota is less than or equal to a specified value, you received an alert. The alert threshold must be less than the current available quota.
         * 
         * >  You must set one of the Threshold and ThresholdPercent parameters.
         */
        public Builder threshold(Float threshold) {
            this.putBodyParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        /**
         * The percentage of the alert threshold. Valid values:
         * <p>
         * 
         * *   If the `ThresholdType` parameter is set to `used` and the percentage of the used quota in the total quota is greater than or equal to a specified value, you receive an alert. Value range: (50%, 100%].
         * *   If the `ThresholdType` parameter is set to `usable` and the percentage of the available quota in the total quota is less than or equal to a specified value, you receive an alert. Value range: (0%, 50%].
         * 
         * >  You must set one of the Threshold and ThresholdPercent parameters.
         */
        public Builder thresholdPercent(Float thresholdPercent) {
            this.putBodyParameter("ThresholdPercent", thresholdPercent);
            this.thresholdPercent = thresholdPercent;
            return this;
        }

        /**
         * The type of the quota alert. Valid values:
         * <p>
         * 
         * *   used: The alert is created for the used quota.
         * *   usable: The alert is created for the available quota.
         */
        public Builder thresholdType(String thresholdType) {
            this.putBodyParameter("ThresholdType", thresholdType);
            this.thresholdType = thresholdType;
            return this;
        }

        /**
         * The webhook URL. Quota Center sends the alert notification to a specified URL by using an HTTP POST request.
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
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * The dimension keys.
             * <p>
             * 
             * The value range of N changes based on the number of dimensions that are supported by the related cloud service.
             * 
             * >  If you set the ProductCode parameter to ecs, ecs-spec, actiontrail, or ess, this parameter is required.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The dimension values.
             * <p>
             * 
             * The value range of N changes based on the number of dimensions that are supported by the related cloud service.
             * 
             * >  If you set the ProductCode parameter to ecs, ecs-spec, actiontrail, or ess, this parameter is required.
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
