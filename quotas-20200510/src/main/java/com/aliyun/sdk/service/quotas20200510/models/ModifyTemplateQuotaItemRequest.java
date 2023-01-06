// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTemplateQuotaItemRequest} extends {@link RequestModel}
 *
 * <p>ModifyTemplateQuotaItemRequest</p>
 */
public class ModifyTemplateQuotaItemRequest extends Request {
    @Body
    @NameInMap("DesireValue")
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
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Body
    @NameInMap("NoticeType")
    private Long noticeType;

    @Body
    @NameInMap("ProductCode")
    private String productCode;

    @Body
    @NameInMap("QuotaActionCode")
    private String quotaActionCode;

    @Query
    @NameInMap("QuotaCategory")
    private String quotaCategory;

    private ModifyTemplateQuotaItemRequest(Builder builder) {
        super(builder);
        this.desireValue = builder.desireValue;
        this.dimensions = builder.dimensions;
        this.effectiveTime = builder.effectiveTime;
        this.envLanguage = builder.envLanguage;
        this.expireTime = builder.expireTime;
        this.id = builder.id;
        this.noticeType = builder.noticeType;
        this.productCode = builder.productCode;
        this.quotaActionCode = builder.quotaActionCode;
        this.quotaCategory = builder.quotaCategory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTemplateQuotaItemRequest create() {
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
     * @return id
     */
    public String getId() {
        return this.id;
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

    public static final class Builder extends Request.Builder<ModifyTemplateQuotaItemRequest, Builder> {
        private Float desireValue; 
        private java.util.List < Dimensions> dimensions; 
        private String effectiveTime; 
        private String envLanguage; 
        private String expireTime; 
        private String id; 
        private Long noticeType; 
        private String productCode; 
        private String quotaActionCode; 
        private String quotaCategory; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTemplateQuotaItemRequest request) {
            super(request);
            this.desireValue = request.desireValue;
            this.dimensions = request.dimensions;
            this.effectiveTime = request.effectiveTime;
            this.envLanguage = request.envLanguage;
            this.expireTime = request.expireTime;
            this.id = request.id;
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
         * > If you do not specify this parameter, the quota takes effect immediately.
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
         * > If the value of this parameter is empty, no end time is specified.
         */
        public Builder expireTime(String expireTime) {
            this.putBodyParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * The ID of the quota template. For more information about how to obtain the ID of a quota template, see [ListQuotaApplicationTemplates](~~450403~~).
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
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
         * The type of the quota. Valid values:
         * <p>
         * 
         * *   CommonQuota: general quota
         * *   WhiteListLabel: whitelist quota
         */
        public Builder quotaCategory(String quotaCategory) {
            this.putQueryParameter("QuotaCategory", quotaCategory);
            this.quotaCategory = quotaCategory;
            return this;
        }

        @Override
        public ModifyTemplateQuotaItemRequest build() {
            return new ModifyTemplateQuotaItemRequest(this);
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
             * The dimension keys.
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
             * The dimension values.
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
