// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTemplateQuotaItemRequest} extends {@link RequestModel}
 *
 * <p>CreateTemplateQuotaItemRequest</p>
 */
public class CreateTemplateQuotaItemRequest extends Request {
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
    private Long noticeType;

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

    private CreateTemplateQuotaItemRequest(Builder builder) {
        super(builder);
        this.desireValue = builder.desireValue;
        this.dimensions = builder.dimensions;
        this.effectiveTime = builder.effectiveTime;
        this.envLanguage = builder.envLanguage;
        this.expireTime = builder.expireTime;
        this.noticeType = builder.noticeType;
        this.productCode = builder.productCode;
        this.quotaActionCode = builder.quotaActionCode;
        this.quotaCategory = builder.quotaCategory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateQuotaItemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public Long getNoticeType() {
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

    public static final class Builder extends Request.Builder<CreateTemplateQuotaItemRequest, Builder> {
        private Float desireValue; 
        private java.util.List < Dimensions> dimensions; 
        private String effectiveTime; 
        private String envLanguage; 
        private String expireTime; 
        private Long noticeType; 
        private String productCode; 
        private String quotaActionCode; 
        private String quotaCategory; 

        private Builder() {
            super();
        } 

        private Builder(CreateTemplateQuotaItemRequest request) {
            super(request);
            this.desireValue = request.desireValue;
            this.dimensions = request.dimensions;
            this.effectiveTime = request.effectiveTime;
            this.envLanguage = request.envLanguage;
            this.expireTime = request.expireTime;
            this.noticeType = request.noticeType;
            this.productCode = request.productCode;
            this.quotaActionCode = request.quotaActionCode;
            this.quotaCategory = request.quotaCategory;
        } 

        /**
         * The requested value of the quota.
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
         * The start time of the validity period of the quota. Specify the value in UTC. This parameter is valid only if you set the QuotaCategory parameter to WhiteListLabel.
         * <p>
         * 
         * > If you leave this parameter empty, the quota takes effect immediately.
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
         * The end time of the validity period of the quota. Specify the value in UTC. This parameter is valid only if you set the QuotaCategory parameter to WhiteListLabel.
         * <p>
         * 
         * > If you leave this parameter empty, no end time is specified.
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
         * *   0 (default value): no
         * *   3: yes
         */
        public Builder noticeType(Long noticeType) {
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
         * The quota type. Valid values:
         * <p>
         * 
         * *   CommonQuota: general quota
         * *   WhiteListLabel: privilege
         * *   FlowControl: API rate limit
         */
        public Builder quotaCategory(String quotaCategory) {
            this.putBodyParameter("QuotaCategory", quotaCategory);
            this.quotaCategory = quotaCategory;
            return this;
        }

        @Override
        public CreateTemplateQuotaItemRequest build() {
            return new CreateTemplateQuotaItemRequest(this);
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
