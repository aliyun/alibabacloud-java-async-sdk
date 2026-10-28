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
 * {@link CreateQuotaApplicationRequest} extends {@link RequestModel}
 *
 * <p>CreateQuotaApplicationRequest</p>
 */
public class CreateQuotaApplicationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuditMode")
    private String auditMode;

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
    private Integer noticeType;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Reason")
    @com.aliyun.core.annotation.Validation(required = true)
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
        private java.util.List<Dimensions> dimensions; 
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
         * <blockquote>
         * <p>Notice: This parameter is deprecated and is not recommended.</p>
         * </blockquote>
         * <p>The quota review mode.</p>
         * 
         * <strong>example:</strong>
         * <p>Sync</p>
         */
        public Builder auditMode(String auditMode) {
            this.putBodyParameter("AuditMode", auditMode);
            this.auditMode = auditMode;
            return this;
        }

        /**
         * <p>The requested quota value.</p>
         * <blockquote>
         * <ul>
         * <li>Set the requested quota value based on the <code>TotalUsage</code> (quota usage) and <code>ApplicableRange</code> (applicable range of the quota) of the target quota in <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a>.</li>
         * <li>Quota increase requests are reviewed by the technical support of each cloud service. To increase the chances of approval, provide a reasonable requested value and a detailed reason when you submit the request.</li>
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
         * <p>The quota dimensions.
         * The dimensions are attributes of the quota. The combination of dimensions (Dimensions) and quota ID (QuotaActionCode) uniquely identifies a quota.</p>
         * <blockquote>
         * <p>Some cloud services require dimensions. You can call <a href="~~ListProductQuotaDimensions~~">ListProductQuotaDimensions</a> to query the quota dimensions supported by a cloud service. The <code>Requisite</code> response parameter indicates whether a dimension is required.</p>
         * </blockquote>
         */
        public Builder dimensions(java.util.List<Dimensions> dimensions) {
            this.putBodyParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * <p>The UTC time when the quota takes effect.
         * This parameter is applicable only to privileges (WhiteListLabel). </p>
         * <blockquote>
         * <p>If you do not specify an effective period, the default value is 99 years from the start time of the current quota.</p>
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
         * <p>The language of the quota alert notification.</p>
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
         * This parameter is applicable only to privileges (WhiteListLabel). </p>
         * <blockquote>
         * <p>If you do not specify an expiration time, the default value is the submission time.</p>
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
         * <p>Specifies whether to send a notification about the request result. Valid values:</p>
         * <ul>
         * <li>0 (default): does not send a notification.</li>
         * <li>3: sends a notification.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder noticeType(Integer noticeType) {
            this.putBodyParameter("NoticeType", noticeType);
            this.noticeType = noticeType;
            return this;
        }

        /**
         * <p>The abbreviation of the cloud service name.</p>
         * <blockquote>
         * <p>For information about how to obtain the abbreviation of a cloud service name, see <code>ProductCode</code> in <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a>.</p>
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
         * <p>The quota type.</p>
         * <p>Default value: CommonQuota.</p>
         * 
         * <strong>example:</strong>
         * <p>CommonQuota</p>
         */
        public Builder quotaCategory(String quotaCategory) {
            this.putBodyParameter("QuotaCategory", quotaCategory);
            this.quotaCategory = quotaCategory;
            return this;
        }

        /**
         * <p>The reason for the quota increase request.</p>
         * <blockquote>
         * <p>Quota increase requests are reviewed by the technical support of each cloud service. To increase the chances of approval, provide a reasonable requested value and a detailed reason when you submit the request.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Scale Out</p>
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

    /**
     * 
     * {@link CreateQuotaApplicationRequest} extends {@link TeaModel}
     *
     * <p>CreateQuotaApplicationRequest</p>
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
             * <p><code>Dimensions.N.Key</code> and <code>Dimensions.N.Value</code> must be specified together. The valid values of N depend on the number of dimensions supported by the cloud service. You can call <a href="~~ListProductQuotaDimensions~~">ListProductQuotaDimensions</a> to query the quota dimensions supported by a cloud service. The length of the returned array is the value of N.</p>
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
             * <p><code>Dimensions.N.Key</code> and <code>Dimensions.N.Value</code> must be specified together. The valid values of N depend on the number of dimensions supported by the cloud service. You can call <a href="~~ListProductQuotaDimensions~~">ListProductQuotaDimensions</a> to query the quota dimensions supported by a cloud service. The length of the returned array is the value of N.</p>
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
