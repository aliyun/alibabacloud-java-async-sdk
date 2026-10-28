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
 * {@link CreateTemplateQuotaItemRequest} extends {@link RequestModel}
 *
 * <p>CreateTemplateQuotaItemRequest</p>
 */
public class CreateTemplateQuotaItemRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DesireValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private Float desireValue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Dimensions")
    private java.util.List<Dimensions> dimensions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EffectiveTime")
    private String effectiveTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnvLanguage")
    private String envLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NoticeType")
    private Long noticeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QuotaActionCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String quotaActionCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QuotaCategory")
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
    public java.util.List<Dimensions> getDimensions() {
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
        private java.util.List<Dimensions> dimensions; 
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
         * <p>The requested quota value.</p>
         * <blockquote>
         * <ul>
         * <li>Set the requested quota value based on the <code>TotalUsage</code> (quota usage) and <code>ApplicableRange</code> (applicable range for the quota item) of the target quota in <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a>.</li>
         * <li>Quota applications are reviewed by the technical support team of each cloud service. To increase the approval rate, specify a reasonable requested value and provide a detailed reason when you apply for a quota increase.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>804</p>
         */
        public Builder desireValue(Float desireValue) {
            this.putBodyParameter("DesireValue", desireValue);
            this.desireValue = desireValue;
            return this;
        }

        /**
         * <p>The quota dimensions.</p>
         */
        public Builder dimensions(java.util.List<Dimensions> dimensions) {
            this.putBodyParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * <p>The UTC time when the quota takes effect.
         * This parameter applies only to privileges (WhiteListLabel). </p>
         * <blockquote>
         * <p>An empty value indicates that the quota takes effect immediately.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-01-19T09:25:56Z</p>
         */
        public Builder effectiveTime(String effectiveTime) {
            this.putBodyParameter("EffectiveTime", effectiveTime);
            this.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * <p>The language of the quota alert notification. Valid values:</p>
         * <ul>
         * <li>zh (default): Chinese.</li>
         * <li>en: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder envLanguage(String envLanguage) {
            this.putBodyParameter("EnvLanguage", envLanguage);
            this.envLanguage = envLanguage;
            return this;
        }

        /**
         * <p>The UTC time when the quota expires.
         * This parameter applies only to privileges (WhiteListLabel). </p>
         * <blockquote>
         * <p>An empty value indicates that no UTC expiration time is specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-01-20T09:25:56Z</p>
         */
        public Builder expireTime(String expireTime) {
            this.putBodyParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>Specifies whether to send a notification for the quota application result. Valid values:</p>
         * <ul>
         * <li>0 (default): No.</li>
         * <li>3: Yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder noticeType(Long noticeType) {
            this.putBodyParameter("NoticeType", noticeType);
            this.noticeType = noticeType;
            return this;
        }

        /**
         * <p>The abbreviation of the cloud service.</p>
         * <blockquote>
         * <p>For information about how to obtain the abbreviation of a cloud service, see <code>ProductCode</code> in <a href="https://help.aliyun.com/document_detail/440555.html">ListProducts</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The quota ID.</p>
         * <blockquote>
         * <p>For information about how to obtain the quota ID of a cloud service, see <code>QuotaActionCode</code> in <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>q_security-groups</p>
         */
        public Builder quotaActionCode(String quotaActionCode) {
            this.putBodyParameter("QuotaActionCode", quotaActionCode);
            this.quotaActionCode = quotaActionCode;
            return this;
        }

        /**
         * <p>The quota category. Valid values:</p>
         * <ul>
         * <li>CommonQuota: general quota.</li>
         * <li>WhiteListLabel: privilege.</li>
         * <li>FlowControl: API rate limit.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CommonQuota</p>
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

    /**
     * 
     * {@link CreateTemplateQuotaItemRequest} extends {@link TeaModel}
     *
     * <p>CreateTemplateQuotaItemRequest</p>
     */
    public static class Dimensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Dimensions model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the quota dimension.</p>
             * <blockquote>
             * <ul>
             * <li>The value range of N depends on the number of dimensions supported by the cloud service.</li>
             * <li>If <code>ProductCode</code> is <code>ecs</code>, <code>ecs-spec</code>, <code>actiontrail</code>, or <code>ess</code>, you must specify both the key and the value of the quota dimension.</li>
             * </ul>
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
             * <ul>
             * <li>The value range of N depends on the number of dimensions supported by the cloud service.</li>
             * <li>If <code>ProductCode</code> is <code>ecs</code>, <code>ecs-spec</code>, <code>actiontrail</code>, or <code>ess</code>, you must specify both the key and the value of the quota dimension.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
