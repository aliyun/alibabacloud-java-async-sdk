// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link UpdateKnowledgeBaseSmartIndexConfigurationRequest} extends {@link RequestModel}
 *
 * <p>UpdateKnowledgeBaseSmartIndexConfigurationRequest</p>
 */
public class UpdateKnowledgeBaseSmartIndexConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appToken")
    private String appToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cronExpression")
    @com.aliyun.core.annotation.Validation(maxLength = 100)
    private String cronExpression;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String directoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enabled")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expectedRevision")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long expectedRevision;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserCode")
    private String opsUserCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserId")
    private String opsUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("timezone")
    @com.aliyun.core.annotation.Validation(maxLength = 64, minLength = 1)
    private String timezone;

    private UpdateKnowledgeBaseSmartIndexConfigurationRequest(Builder builder) {
        super(builder);
        this.appToken = builder.appToken;
        this.cronExpression = builder.cronExpression;
        this.directoryId = builder.directoryId;
        this.enabled = builder.enabled;
        this.expectedRevision = builder.expectedRevision;
        this.opsUserCode = builder.opsUserCode;
        this.opsUserId = builder.opsUserId;
        this.tenantId = builder.tenantId;
        this.timezone = builder.timezone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKnowledgeBaseSmartIndexConfigurationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appToken
     */
    public String getAppToken() {
        return this.appToken;
    }

    /**
     * @return cronExpression
     */
    public String getCronExpression() {
        return this.cronExpression;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return expectedRevision
     */
    public Long getExpectedRevision() {
        return this.expectedRevision;
    }

    /**
     * @return opsUserCode
     */
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    /**
     * @return opsUserId
     */
    public String getOpsUserId() {
        return this.opsUserId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return timezone
     */
    public String getTimezone() {
        return this.timezone;
    }

    public static final class Builder extends Request.Builder<UpdateKnowledgeBaseSmartIndexConfigurationRequest, Builder> {
        private String appToken; 
        private String cronExpression; 
        private String directoryId; 
        private Boolean enabled; 
        private Long expectedRevision; 
        private String opsUserCode; 
        private String opsUserId; 
        private String tenantId; 
        private String timezone; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKnowledgeBaseSmartIndexConfigurationRequest request) {
            super(request);
            this.appToken = request.appToken;
            this.cronExpression = request.cronExpression;
            this.directoryId = request.directoryId;
            this.enabled = request.enabled;
            this.expectedRevision = request.expectedRevision;
            this.opsUserCode = request.opsUserCode;
            this.opsUserId = request.opsUserId;
            this.tenantId = request.tenantId;
            this.timezone = request.timezone;
        } 

        /**
         * <p>The platform application credential. Pass this parameter when using the application proxy mode, and specify the operator by using opsUserId or opsUserCode based on the application configuration. Do not use real credentials in logs or public examples.</p>
         * 
         * <strong>example:</strong>
         * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder appToken(String appToken) {
            this.putQueryParameter("appToken", appToken);
            this.appToken = appToken;
            return this;
        }

        /**
         * <p>The automatic execution schedule. Use a five-part cron expression where the minute field must be 0. For example, 0 2 * * * indicates execution at 02:00 every day based on the timezone. Omitting this parameter, setting it to null, or using a blank string indicates manual execution and clears the old automatic schedule, but does not disable the smart index. Maximum length: 100 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>0 2 * * *</p>
         */
        public Builder cronExpression(String cronExpression) {
            this.putBodyParameter("cronExpression", cronExpression);
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * <p>The business ID of the root directory for the standard enterprise knowledge base of the current tenant. You can obtain this ID from the response of the CreateTenantDirectory operation. You cannot use the internal primary key of the directory, or the IDs of personal spaces, group knowledge bases, subdirectories, or special knowledge bases.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-example</p>
         */
        public Builder directoryId(String directoryId) {
            this.putBodyParameter("directoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the LLM Wiki smart index. Valid values:</p>
         * <ul>
         * <li>true: Enabled. Switching from disabled to enabled creates an asynchronous full build task and a bill.</li>
         * <li>false: Disabled. If artifacts exist, asynchronous cleanup is initiated.
         * You cannot toggle the switch during task execution, and you cannot re-enable it until cleanup is complete.</li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putBodyParameter("enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The revision obtained from the most recent configuration read. This value must be a non-negative integer. The value is 0 when not configured, and increments by 1 after a successful save. If the version does not match, ERR.SmartIndex.Conflict is returned. You must read the configuration again before saving. This field is not an idempotency key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder expectedRevision(Long expectedRevision) {
            this.putBodyParameter("expectedRevision", expectedRevision);
            this.expectedRevision = expectedRevision;
            return this;
        }

        /**
         * <p>The unique code of the proxied user within the tenant. This parameter is used only when the identity mapping mode of the application credential is source_uid. You cannot use this parameter to bypass tenant or knowledge base permission verification.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder opsUserCode(String opsUserCode) {
            this.putQueryParameter("opsUserCode", opsUserCode);
            this.opsUserCode = opsUserCode;
            return this;
        }

        /**
         * <p>The ID of the proxied WINNEXO platform user. This parameter is used only when the identity mapping mode of the application credential is winnexo_uid. You cannot use this parameter to bypass tenant or knowledge base permission verification.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder opsUserId(String opsUserId) {
            this.putQueryParameter("opsUserId", opsUserId);
            this.opsUserId = opsUserId;
            return this;
        }

        /**
         * <p>The ID of the target tenant. This parameter is used for tenant routing in public requests. The server-side authentication chain verifies access permissions based on this parameter. You cannot use this parameter to access unauthorized tenants.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The IANA time zone name used for the execution schedule. Default value: Asia/Shanghai. If this parameter is omitted, set to null, or left as a blank string, the default value is used. The length of a non-empty value must be 1 to 64 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        public Builder timezone(String timezone) {
            this.putBodyParameter("timezone", timezone);
            this.timezone = timezone;
            return this;
        }

        @Override
        public UpdateKnowledgeBaseSmartIndexConfigurationRequest build() {
            return new UpdateKnowledgeBaseSmartIndexConfigurationRequest(this);
        } 

    } 

}
