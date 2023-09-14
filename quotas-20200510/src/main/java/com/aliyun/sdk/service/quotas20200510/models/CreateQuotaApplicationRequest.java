// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateQuotaApplicationRequest} extends {@link RequestModel}
 *
 * <p>CreateQuotaApplicationRequest</p>
 */
public class CreateQuotaApplicationRequest extends Request {
    @Body
    @NameInMap("AuditMode")
    private String auditMode;

    @Body
    @NameInMap("DesireValue")
    @Validation(required = true)
    private Float desireValue;

    @Body
    @NameInMap("Dimensions")
    private java.util.List < Dimensions> dimensions;

    @Body
    @NameInMap("EffectiveTime")
    private String effectiveTime;

    @Body
    @NameInMap("EnvLanguage")
    private String envLanguage;

    @Body
    @NameInMap("ExpireTime")
    private String expireTime;

    @Body
    @NameInMap("NoticeType")
    private Integer noticeType;

    @Body
    @NameInMap("ProductCode")
    @Validation(required = true)
    private String productCode;

    @Body
    @NameInMap("QuotaActionCode")
    @Validation(required = true)
    private String quotaActionCode;

    @Body
    @NameInMap("QuotaCategory")
    private String quotaCategory;

    @Body
    @NameInMap("Reason")
    @Validation(required = true)
    private String reason;

    private CreateQuotaApplicationRequest(Builder builder) {
        super(builder);
        this.auditMode = builder.auditMode;
        this.desireValue = builder.desireValue;
        this.dimensions = builder.dimensions;
        this.effectiveTime = builder.effectiveTime;
        this.envLanguage = builder.envLanguage;
        this.expireTime = builder.expireTime;
        this.noticeType = builder.noticeType;
        this.productCode = builder.productCode;
        this.quotaActionCode = builder.quotaActionCode;
        this.quotaCategory = builder.quotaCategory;
        this.reason = builder.reason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQuotaApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditMode
     */
    public String getAuditMode() {
        return this.auditMode;
    }

    /**
     * @return desireValue
     */
    public Float getDesireValue() {
        return this.desireValue;
    }

    /**
     * @return dimensions
     */
    public java.util.List < Dimensions> getDimensions() {
        return this.dimensions;
    }

    /**
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     * @return envLanguage
     */
    public String getEnvLanguage() {
        return this.envLanguage;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return noticeType
     */
    public Integer getNoticeType() {
        return this.noticeType;
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
     * @return quotaCategory
     */
    public String getQuotaCategory() {
        return this.quotaCategory;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    public static final class Builder extends Request.Builder<CreateQuotaApplicationRequest, Builder> {
        private String auditMode; 
        private Float desireValue; 
        private java.util.List < Dimensions> dimensions; 
        private String effectiveTime; 
        private String envLanguage; 
        private String expireTime; 
        private Integer noticeType; 
        private String productCode; 
        private String quotaActionCode; 
        private String quotaCategory; 
        private String reason; 

        private Builder() {
            super();
        } 

        private Builder(CreateQuotaApplicationRequest request) {
            super(request);
            this.auditMode = request.auditMode;
            this.desireValue = request.desireValue;
            this.dimensions = request.dimensions;
            this.effectiveTime = request.effectiveTime;
            this.envLanguage = request.envLanguage;
            this.expireTime = request.expireTime;
            this.noticeType = request.noticeType;
            this.productCode = request.productCode;
            this.quotaActionCode = request.quotaActionCode;
            this.quotaCategory = request.quotaCategory;
            this.reason = request.reason;
        } 

        /**
         * The mode in which you want the application to be reviewed. Valid values:
         * <p>
         * 
         * *   Sync: The application is reviewed in a synchronous manner. Quota Center automatically reviews the application. The result is returned immediately after you submit the application. However, the chance of an approval for an application that is reviewed in Sync mode is lower than the chance of an approval for an application that is reviewed in Async mode. The validity period of the new quota value is 1 hour.
         * *   Async: The application is reviewed in an asynchronous manner. An Alibaba Cloud support engineer reviews the application. The chance of an approval for an application that is reviewed in Async mode is higher than the chance of an approval for an application that is reviewed in Sync mode. The validity period of the new quota value is one month.
         * 
         * > This parameter is available only for ECS Quotas by Instance Type.
         */
        public Builder auditMode(String auditMode) {
            this.putBodyParameter("AuditMode", auditMode);
            this.auditMode = auditMode;
            return this;
        }

        /**
         * The requested value of the quota.
         * <p>
         * 
         * > Applications are reviewed by the technical support team of each Alibaba Cloud service. To increase the success rate of your application, you must specify a reasonable quota value and detailed reasons when you submit an application to increase the value of the quota.
         */
        public Builder desireValue(Float desireValue) {
            this.putBodyParameter("DesireValue", desireValue);
            this.desireValue = desireValue;
            return this;
        }

        /**
         * The quota dimensions.
         */
        public Builder dimensions(java.util.List < Dimensions> dimensions) {
            this.putBodyParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * The end time of the validity period of the quota. Specify the value in UTC. This parameter is valid only if you set the QuotaCategory parameter to WhiteListLabel.
         * <p>
         * 
         * > If you do not specify an end time, the default end time is 99 years after the quota application is submitted.
         */
        public Builder effectiveTime(String effectiveTime) {
            this.putBodyParameter("EffectiveTime", effectiveTime);
            this.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * The language of the quota alert notification. Valid values:
         * <p>
         * 
         * *   zh (default value): Chinese
         * *   en: English
         */
        public Builder envLanguage(String envLanguage) {
            this.putBodyParameter("EnvLanguage", envLanguage);
            this.envLanguage = envLanguage;
            return this;
        }

        /**
         * The start time of the validity period of the quota. Specify the value in UTC. This parameter is valid only if you set the QuotaCategory parameter to WhiteListLabel.
         * <p>
         * 
         * > If you do not specify a start time, the default start time is the time when the quota application is submitted.
         */
        public Builder expireTime(String expireTime) {
            this.putBodyParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * Specifies whether to send a notification about the application result. Valid values:
         * <p>
         * 
         * *   0 (default value): sends a notification about the application result.
         * *   3: A notification about the application result is sent.
         */
        public Builder noticeType(Integer noticeType) {
            this.putBodyParameter("NoticeType", noticeType);
            this.noticeType = noticeType;
            return this;
        }

        /**
         * The abbreviation of the Alibaba Cloud service name.
         * <p>
         * 
         * > For more information, see [Alibaba Cloud services that support Quota Center](~~182368~~).
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
         * The type of the quota.
         * <p>
         * 
         * *   CommonQuota (default value): general quota
         * *   FlowControl: API rate limit
         * *   WhiteListLabel: whitelist quota
         */
        public Builder quotaCategory(String quotaCategory) {
            this.putBodyParameter("QuotaCategory", quotaCategory);
            this.quotaCategory = quotaCategory;
            return this;
        }

        /**
         * The reason for the application.
         * <p>
         * 
         * > Applications are reviewed by the technical support team of each Alibaba Cloud service. To increase the success rate of your application, you must specify a reasonable quota value and detailed reasons when you submit an application to increase the value of the quota.
         */
        public Builder reason(String reason) {
            this.putBodyParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        @Override
        public CreateQuotaApplicationRequest build() {
            return new CreateQuotaApplicationRequest(this);
        } 

    } 

    public static class Dimensions extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Dimensions(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dimensions create() {
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
             * The key of the dimension.
             * <p>
             * 
             * The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.
             * 
             * > This parameter is required if you set the ProductCode parameter to ecs, ecs-spec, actiontrail, or ess.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the dimension.
             * <p>
             * 
             * The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.
             * 
             * > This parameter is required if you set the ProductCode parameter to ecs, ecs-spec, actiontrail, or ess.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Dimensions build() {
                return new Dimensions(this);
            } 

        } 

    }
}
