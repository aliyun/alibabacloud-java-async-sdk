// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

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
    @com.aliyun.core.annotation.NameInMap("OriginalContext")
    private String originalContext;

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
    private java.util.List<QuotaDimensions> quotaDimensions;

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
        this.originalContext = builder.originalContext;
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
     * @return originalContext
     */
    public String getOriginalContext() {
        return this.originalContext;
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
    public java.util.List<QuotaDimensions> getQuotaDimensions() {
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
        private String originalContext; 
        private String productCode; 
        private String quotaActionCode; 
        private java.util.List<QuotaDimensions> quotaDimensions; 
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
            this.originalContext = request.originalContext;
            this.productCode = request.productCode;
            this.quotaActionCode = request.quotaActionCode;
            this.quotaDimensions = request.quotaDimensions;
            this.threshold = request.threshold;
            this.thresholdPercent = request.thresholdPercent;
            this.thresholdType = request.thresholdType;
            this.webHook = request.webHook;
        } 

        /**
         * <p>The name of the quota alert rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>q_hvnoqv alarm</p>
         */
        public Builder alarmName(String alarmName) {
            this.putBodyParameter("AlarmName", alarmName);
            this.alarmName = alarmName;
            return this;
        }

        /**
         * <p>The original context information.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder originalContext(String originalContext) {
            this.putBodyParameter("OriginalContext", originalContext);
            this.originalContext = originalContext;
            return this;
        }

        /**
         * <p>The abbreviation of the cloud service.</p>
         * <blockquote>
         * <p>For more information about how to obtain the abbreviation of a cloud service, see ProductCode in <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>config</p>
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The quota ID.</p>
         * <blockquote>
         * <p>For more information about how to obtain the quota ID of a cloud service, see QuotaActionCode in <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>q_hvnoqv</p>
         */
        public Builder quotaActionCode(String quotaActionCode) {
            this.putBodyParameter("QuotaActionCode", quotaActionCode);
            this.quotaActionCode = quotaActionCode;
            return this;
        }

        /**
         * <p>The quota dimensions.
         * The dimensions are properties of a quota item. A quota item is uniquely identified by Dimensions and QuotaActionCode.</p>
         * <blockquote>
         * <p>Some dimensions are required for specific cloud services. You can call the <a href="https://help.aliyun.com/document_detail/440553.html">ListProductQuotaDimensions</a> operation to query the supported quota dimensions of a cloud service. The Requisite response parameter indicates whether a dimension is required.</p>
         * </blockquote>
         */
        public Builder quotaDimensions(java.util.List<QuotaDimensions> quotaDimensions) {
            this.putBodyParameter("QuotaDimensions", quotaDimensions);
            this.quotaDimensions = quotaDimensions;
            return this;
        }

        /**
         * <p>The numeric value of the quota alert threshold. Valid values:</p>
         * <ul>
         * <li><p>If ThresholdType is set to used, you receive an alert notification when the used quota is greater than or equal to the specified value. The quota alert threshold must be greater than the used quota.</p>
         * </li>
         * <li><p>If ThresholdType is set to usable, you receive an alert notification when the available quota is less than or equal to the specified value. The quota alert threshold must be less than the available quota.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You must specify either this parameter or ThresholdPercent.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
        public Builder threshold(Float threshold) {
            this.putBodyParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        /**
         * <p>The percentage of the quota alert threshold. Valid values:</p>
         * <ul>
         * <li><p>If ThresholdType is set to used, you receive an alert notification when the used quota is greater than or equal to the specified percentage. Valid values: (50%, 100%].</p>
         * </li>
         * <li><p>If ThresholdType is set to usable, you receive an alert notification when the available quota is less than or equal to the specified percentage. Valid values: (0%, 50%].</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You must specify either this parameter or Threshold.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder thresholdPercent(Float thresholdPercent) {
            this.putBodyParameter("ThresholdPercent", thresholdPercent);
            this.thresholdPercent = thresholdPercent;
            return this;
        }

        /**
         * <p>The quota alert type. Valid values:</p>
         * <ul>
         * <li>used: alerts on the used quota. This is the default value.</li>
         * <li>usable: alerts on the remaining available quota.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>used</p>
         */
        public Builder thresholdType(String thresholdType) {
            this.putBodyParameter("ThresholdType", thresholdType);
            this.thresholdType = thresholdType;
            return this;
        }

        /**
         * <p>The public URL to which Quota Center sends alert notifications by using HTTP POST requests.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://alert.aliyun.com/callback">https://alert.aliyun.com/callback</a></p>
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

    /**
     * 
     * {@link CreateQuotaAlarmRequest} extends {@link TeaModel}
     *
     * <p>CreateQuotaAlarmRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(QuotaDimensions model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the quota dimension.</p>
             * <blockquote>
             * <p>You must specify both Dimensions.N.Key and Dimensions.N.Value. The value range of N depends on the number of dimensions supported by the cloud service. You can call the <a href="https://help.aliyun.com/document_detail/440553.html">ListProductQuotaDimensions</a> operation to query the supported quota dimensions. The length of the returned array is the maximum value of N.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>regionId</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the quota dimension.</p>
             * <blockquote>
             * <p>You must specify both Dimensions.N.Key and Dimensions.N.Value. The value range of N depends on the number of dimensions supported by the cloud service. You can call the <a href="https://help.aliyun.com/document_detail/440553.html">ListProductQuotaDimensions</a> operation to query the supported quota dimensions. The length of the returned array is the maximum value of N.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
