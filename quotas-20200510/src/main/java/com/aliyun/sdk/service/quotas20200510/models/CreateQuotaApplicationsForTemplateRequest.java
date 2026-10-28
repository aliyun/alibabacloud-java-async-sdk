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
 * {@link CreateQuotaApplicationsForTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateQuotaApplicationsForTemplateRequest</p>
 */
public class CreateQuotaApplicationsForTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AliyunUids")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> aliyunUids;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DesireValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private Double desireValue;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String quotaCategory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Reason")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reason;

    private CreateQuotaApplicationsForTemplateRequest(Builder builder) {
        super(builder);
        this.aliyunUids = builder.aliyunUids;
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

    public static CreateQuotaApplicationsForTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunUids
     */
    public java.util.List<String> getAliyunUids() {
        return this.aliyunUids;
    }

    /**
     * @return desireValue
     */
    public Double getDesireValue() {
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

    public static final class Builder extends Request.Builder<CreateQuotaApplicationsForTemplateRequest, Builder> {
        private java.util.List<String> aliyunUids; 
        private Double desireValue; 
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

        private Builder(CreateQuotaApplicationsForTemplateRequest request) {
            super(request);
            this.aliyunUids = request.aliyunUids;
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
         * <p>The list of Alibaba Cloud accounts that belong to the resource directory members for which you want to apply for quotas.</p>
         * <blockquote>
         * <p>You can apply for quota increases for a maximum of 50 members at a time. For more information about the members of a resource directory, see <a href="https://help.aliyun.com/document_detail/604207.html">ListAccounts</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder aliyunUids(java.util.List<String> aliyunUids) {
            this.putBodyParameter("AliyunUids", aliyunUids);
            this.aliyunUids = aliyunUids;
            return this;
        }

        /**
         * <p>The requested quota value.</p>
         * <blockquote>
         * <ul>
         * <li>Set the requested quota value based on the <code>TotalUsage</code> (quota usage) and <code>ApplicableRange</code> (applicable range for quota application) of the target quota in <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a>.</li>
         * <li>Quota applications are reviewed and approved by the technical support team of each cloud service. To increase the approval rate, specify a reasonable requested value and provide a detailed reason when you submit a quota application.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder desireValue(Double desireValue) {
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
         * <p>The UTC time when the quota takes effect. This parameter applies only to privileges (WhiteListLabel).</p>
         * <blockquote>
         * <p>If you do not specify an effective period for the current account, the commit time is used by default.</p>
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
         * <p>The language of the notification for the quota application result. Valid values:</p>
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
         * <p>The UTC time when the quota expires. This parameter applies only to privileges (WhiteListLabel). </p>
         * <blockquote>
         * <p>If you do not specify an expiration time for the current account, the expiration time is set to 99 years after the effective period of the current quota.</p>
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
         * <p>Specifies whether to send notifications for quota application results. Valid values:</p>
         * <ul>
         * <li>0 (default): no.</li>
         * <li>3: yes.</li>
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
         * <p>The abbreviated name of the cloud service.</p>
         * <blockquote>
         * <p>For more information about how to obtain the abbreviated name of a cloud service, see <code>ProductCode</code> in <a href="https://help.aliyun.com/document_detail/440555.html">ListProducts</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs-spec</p>
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The quota ID.</p>
         * <blockquote>
         * <p>For more information about how to obtain the quota ID of a cloud service, see <code>QuotaActionCode</code> in <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g5.2xlarge</p>
         */
        public Builder quotaActionCode(String quotaActionCode) {
            this.putBodyParameter("QuotaActionCode", quotaActionCode);
            this.quotaActionCode = quotaActionCode;
            return this;
        }

        /**
         * <p>The quota type. Valid values:</p>
         * <ul>
         * <li>CommonQuota: general quota.</li>
         * <li>FlowControl: API rate limit.</li>
         * <li>WhiteListLabel: privilege.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The reason for the quota application.</p>
         * <blockquote>
         * <p>Quota applications are reviewed and approved by the technical support team of each cloud service. To increase the approval rate, specify a reasonable requested value and provide a detailed reason when you submit a quota application.</p>
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
        public CreateQuotaApplicationsForTemplateRequest build() {
            return new CreateQuotaApplicationsForTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateQuotaApplicationsForTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateQuotaApplicationsForTemplateRequest</p>
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
             * <li>When <code>ProductCode</code> is set to <code>ecs</code>, <code>ecs-spec</code>, <code>actiontrail</code>, or <code>ess</code>, you must specify both the key and the value of the quota dimension.</li>
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
             * <li>When <code>ProductCode</code> is set to <code>ecs</code>, <code>ecs-spec</code>, <code>actiontrail</code>, or <code>ess</code>, you must specify both the key and the value of the quota dimension.</li>
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
