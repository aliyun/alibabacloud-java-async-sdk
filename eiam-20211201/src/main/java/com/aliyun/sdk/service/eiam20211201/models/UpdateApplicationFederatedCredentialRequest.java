// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link UpdateApplicationFederatedCredentialRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationFederatedCredentialRequest</p>
 */
public class UpdateApplicationFederatedCredentialRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationFederatedCredentialId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationFederatedCredentialId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttributeMappings")
    private java.util.List<AttributeMappings> attributeMappings;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerificationCondition")
    private String verificationCondition;

    private UpdateApplicationFederatedCredentialRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationFederatedCredentialId = builder.applicationFederatedCredentialId;
        this.applicationId = builder.applicationId;
        this.attributeMappings = builder.attributeMappings;
        this.instanceId = builder.instanceId;
        this.verificationCondition = builder.verificationCondition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationFederatedCredentialRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return applicationFederatedCredentialId
     */
    public String getApplicationFederatedCredentialId() {
        return this.applicationFederatedCredentialId;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return attributeMappings
     */
    public java.util.List<AttributeMappings> getAttributeMappings() {
        return this.attributeMappings;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return verificationCondition
     */
    public String getVerificationCondition() {
        return this.verificationCondition;
    }

    public static final class Builder extends Request.Builder<UpdateApplicationFederatedCredentialRequest, Builder> {
        private String regionId; 
        private String applicationFederatedCredentialId; 
        private String applicationId; 
        private java.util.List<AttributeMappings> attributeMappings; 
        private String instanceId; 
        private String verificationCondition; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationFederatedCredentialRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationFederatedCredentialId = request.applicationFederatedCredentialId;
            this.applicationId = request.applicationId;
            this.attributeMappings = request.attributeMappings;
            this.instanceId = request.instanceId;
            this.verificationCondition = request.verificationCondition;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>应用联邦凭证Id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>afc_aaaaa1111</p>
         */
        public Builder applicationFederatedCredentialId(String applicationFederatedCredentialId) {
            this.putQueryParameter("ApplicationFederatedCredentialId", applicationFederatedCredentialId);
            this.applicationFederatedCredentialId = applicationFederatedCredentialId;
            return this;
        }

        /**
         * <p>IDaaS的应用资源ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>属性映射</p>
         */
        public Builder attributeMappings(java.util.List<AttributeMappings> attributeMappings) {
            this.putQueryParameter("AttributeMappings", attributeMappings);
            this.attributeMappings = attributeMappings;
            return this;
        }

        /**
         * <p>IDaaS EIAM实例的ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>校验条件</p>
         * 
         * <strong>example:</strong>
         * <p>IsNullOrEmpty(&quot;&quot;)</p>
         */
        public Builder verificationCondition(String verificationCondition) {
            this.putQueryParameter("VerificationCondition", verificationCondition);
            this.verificationCondition = verificationCondition;
            return this;
        }

        @Override
        public UpdateApplicationFederatedCredentialRequest build() {
            return new UpdateApplicationFederatedCredentialRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateApplicationFederatedCredentialRequest} extends {@link TeaModel}
     *
     * <p>UpdateApplicationFederatedCredentialRequest</p>
     */
    public static class AttributeMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceValueExpression")
        private String sourceValueExpression;

        @com.aliyun.core.annotation.NameInMap("TargetField")
        private String targetField;

        private AttributeMappings(Builder builder) {
            this.sourceValueExpression = builder.sourceValueExpression;
            this.targetField = builder.targetField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributeMappings create() {
            return builder().build();
        }

        /**
         * @return sourceValueExpression
         */
        public String getSourceValueExpression() {
            return this.sourceValueExpression;
        }

        /**
         * @return targetField
         */
        public String getTargetField() {
            return this.targetField;
        }

        public static final class Builder {
            private String sourceValueExpression; 
            private String targetField; 

            private Builder() {
            } 

            private Builder(AttributeMappings model) {
                this.sourceValueExpression = model.sourceValueExpression;
                this.targetField = model.targetField;
            } 

            /**
             * <p>源值表达式</p>
             * 
             * <strong>example:</strong>
             * <p>Append(client.applicationFederatedCredentialId, &quot;:&quot;, cert.subject.CN, &quot;:&quot;, cert.serialNumber)</p>
             */
            public Builder sourceValueExpression(String sourceValueExpression) {
                this.sourceValueExpression = sourceValueExpression;
                return this;
            }

            /**
             * <p>目标字段</p>
             * 
             * <strong>example:</strong>
             * <p>client.activeSubjectUrn</p>
             */
            public Builder targetField(String targetField) {
                this.targetField = targetField;
                return this;
            }

            public AttributeMappings build() {
                return new AttributeMappings(this);
            } 

        } 

    }
}
