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
 * {@link GetApplicationFederatedCredentialResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationFederatedCredentialResponseBody</p>
 */
public class GetApplicationFederatedCredentialResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationFederatedCredential")
    private ApplicationFederatedCredential applicationFederatedCredential;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetApplicationFederatedCredentialResponseBody(Builder builder) {
        this.applicationFederatedCredential = builder.applicationFederatedCredential;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationFederatedCredentialResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationFederatedCredential
     */
    public ApplicationFederatedCredential getApplicationFederatedCredential() {
        return this.applicationFederatedCredential;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApplicationFederatedCredential applicationFederatedCredential; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetApplicationFederatedCredentialResponseBody model) {
            this.applicationFederatedCredential = model.applicationFederatedCredential;
            this.requestId = model.requestId;
        } 

        /**
         * ApplicationFederatedCredential.
         */
        public Builder applicationFederatedCredential(ApplicationFederatedCredential applicationFederatedCredential) {
            this.applicationFederatedCredential = applicationFederatedCredential;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApplicationFederatedCredentialResponseBody build() {
            return new GetApplicationFederatedCredentialResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApplicationFederatedCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationFederatedCredentialResponseBody</p>
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
    /**
     * 
     * {@link GetApplicationFederatedCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationFederatedCredentialResponseBody</p>
     */
    public static class AzureVmConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrincipalId")
        private String principalId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        private String resourceGroupName;

        @com.aliyun.core.annotation.NameInMap("SubscriptionId")
        private String subscriptionId;

        @com.aliyun.core.annotation.NameInMap("VmNames")
        private java.util.List<String> vmNames;

        private AzureVmConfig(Builder builder) {
            this.principalId = builder.principalId;
            this.resourceGroupName = builder.resourceGroupName;
            this.subscriptionId = builder.subscriptionId;
            this.vmNames = builder.vmNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AzureVmConfig create() {
            return builder().build();
        }

        /**
         * @return principalId
         */
        public String getPrincipalId() {
            return this.principalId;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        /**
         * @return subscriptionId
         */
        public String getSubscriptionId() {
            return this.subscriptionId;
        }

        /**
         * @return vmNames
         */
        public java.util.List<String> getVmNames() {
            return this.vmNames;
        }

        public static final class Builder {
            private String principalId; 
            private String resourceGroupName; 
            private String subscriptionId; 
            private java.util.List<String> vmNames; 

            private Builder() {
            } 

            private Builder(AzureVmConfig model) {
                this.principalId = model.principalId;
                this.resourceGroupName = model.resourceGroupName;
                this.subscriptionId = model.subscriptionId;
                this.vmNames = model.vmNames;
            } 

            /**
             * PrincipalId.
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * ResourceGroupName.
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * SubscriptionId.
             */
            public Builder subscriptionId(String subscriptionId) {
                this.subscriptionId = subscriptionId;
                return this;
            }

            /**
             * VmNames.
             */
            public Builder vmNames(java.util.List<String> vmNames) {
                this.vmNames = vmNames;
                return this;
            }

            public AzureVmConfig build() {
                return new AzureVmConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationFederatedCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationFederatedCredentialResponseBody</p>
     */
    public static class GcpVmConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceIds")
        private java.util.List<String> instanceIds;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ServiceAccountId")
        private String serviceAccountId;

        private GcpVmConfig(Builder builder) {
            this.instanceIds = builder.instanceIds;
            this.projectId = builder.projectId;
            this.serviceAccountId = builder.serviceAccountId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GcpVmConfig create() {
            return builder().build();
        }

        /**
         * @return instanceIds
         */
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return serviceAccountId
         */
        public String getServiceAccountId() {
            return this.serviceAccountId;
        }

        public static final class Builder {
            private java.util.List<String> instanceIds; 
            private String projectId; 
            private String serviceAccountId; 

            private Builder() {
            } 

            private Builder(GcpVmConfig model) {
                this.instanceIds = model.instanceIds;
                this.projectId = model.projectId;
                this.serviceAccountId = model.serviceAccountId;
            } 

            /**
             * <p>VM实例ID列表，最多10个</p>
             */
            public Builder instanceIds(java.util.List<String> instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>Service Account对应sub</p>
             */
            public Builder serviceAccountId(String serviceAccountId) {
                this.serviceAccountId = serviceAccountId;
                return this;
            }

            public GcpVmConfig build() {
                return new GcpVmConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationFederatedCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationFederatedCredentialResponseBody</p>
     */
    public static class GenericConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Subject")
        private String subject;

        private GenericConfig(Builder builder) {
            this.subject = builder.subject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GenericConfig create() {
            return builder().build();
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        public static final class Builder {
            private String subject; 

            private Builder() {
            } 

            private Builder(GenericConfig model) {
                this.subject = model.subject;
            } 

            /**
             * Subject.
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            public GenericConfig build() {
                return new GenericConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationFederatedCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationFederatedCredentialResponseBody</p>
     */
    public static class KubernetesConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("PodNamePrefix")
        private String podNamePrefix;

        @com.aliyun.core.annotation.NameInMap("ServiceAccountName")
        private String serviceAccountName;

        private KubernetesConfig(Builder builder) {
            this.namespace = builder.namespace;
            this.podNamePrefix = builder.podNamePrefix;
            this.serviceAccountName = builder.serviceAccountName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KubernetesConfig create() {
            return builder().build();
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return podNamePrefix
         */
        public String getPodNamePrefix() {
            return this.podNamePrefix;
        }

        /**
         * @return serviceAccountName
         */
        public String getServiceAccountName() {
            return this.serviceAccountName;
        }

        public static final class Builder {
            private String namespace; 
            private String podNamePrefix; 
            private String serviceAccountName; 

            private Builder() {
            } 

            private Builder(KubernetesConfig model) {
                this.namespace = model.namespace;
                this.podNamePrefix = model.podNamePrefix;
                this.serviceAccountName = model.serviceAccountName;
            } 

            /**
             * <p>K8s命名空间</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>Pod名称前缀</p>
             */
            public Builder podNamePrefix(String podNamePrefix) {
                this.podNamePrefix = podNamePrefix;
                return this;
            }

            /**
             * <p>K8s服务账号名称</p>
             */
            public Builder serviceAccountName(String serviceAccountName) {
                this.serviceAccountName = serviceAccountName;
                return this;
            }

            public KubernetesConfig build() {
                return new KubernetesConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationFederatedCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationFederatedCredentialResponseBody</p>
     */
    public static class OidcVerificationConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AzureVmConfig")
        private AzureVmConfig azureVmConfig;

        @com.aliyun.core.annotation.NameInMap("GcpVmConfig")
        private GcpVmConfig gcpVmConfig;

        @com.aliyun.core.annotation.NameInMap("GenericConfig")
        private GenericConfig genericConfig;

        @com.aliyun.core.annotation.NameInMap("KubernetesConfig")
        private KubernetesConfig kubernetesConfig;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        private OidcVerificationConfig(Builder builder) {
            this.azureVmConfig = builder.azureVmConfig;
            this.gcpVmConfig = builder.gcpVmConfig;
            this.genericConfig = builder.genericConfig;
            this.kubernetesConfig = builder.kubernetesConfig;
            this.profile = builder.profile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OidcVerificationConfig create() {
            return builder().build();
        }

        /**
         * @return azureVmConfig
         */
        public AzureVmConfig getAzureVmConfig() {
            return this.azureVmConfig;
        }

        /**
         * @return gcpVmConfig
         */
        public GcpVmConfig getGcpVmConfig() {
            return this.gcpVmConfig;
        }

        /**
         * @return genericConfig
         */
        public GenericConfig getGenericConfig() {
            return this.genericConfig;
        }

        /**
         * @return kubernetesConfig
         */
        public KubernetesConfig getKubernetesConfig() {
            return this.kubernetesConfig;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        public static final class Builder {
            private AzureVmConfig azureVmConfig; 
            private GcpVmConfig gcpVmConfig; 
            private GenericConfig genericConfig; 
            private KubernetesConfig kubernetesConfig; 
            private String profile; 

            private Builder() {
            } 

            private Builder(OidcVerificationConfig model) {
                this.azureVmConfig = model.azureVmConfig;
                this.gcpVmConfig = model.gcpVmConfig;
                this.genericConfig = model.genericConfig;
                this.kubernetesConfig = model.kubernetesConfig;
                this.profile = model.profile;
            } 

            /**
             * <p>Azure VM场景配置</p>
             */
            public Builder azureVmConfig(AzureVmConfig azureVmConfig) {
                this.azureVmConfig = azureVmConfig;
                return this;
            }

            /**
             * <p>GCP VM场景配置</p>
             */
            public Builder gcpVmConfig(GcpVmConfig gcpVmConfig) {
                this.gcpVmConfig = gcpVmConfig;
                return this;
            }

            /**
             * GenericConfig.
             */
            public Builder genericConfig(GenericConfig genericConfig) {
                this.genericConfig = genericConfig;
                return this;
            }

            /**
             * <p>Kubernetes场景配置</p>
             */
            public Builder kubernetesConfig(KubernetesConfig kubernetesConfig) {
                this.kubernetesConfig = kubernetesConfig;
                return this;
            }

            /**
             * <p>OIDC场景Profile：generic / kubernetes / gcp_vm / azure_vm</p>
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            public OidcVerificationConfig build() {
                return new OidcVerificationConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationFederatedCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationFederatedCredentialResponseBody</p>
     */
    public static class Pkcs7VerificationConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceIds")
        private java.util.List<String> instanceIds;

        private Pkcs7VerificationConfig(Builder builder) {
            this.instanceIds = builder.instanceIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pkcs7VerificationConfig create() {
            return builder().build();
        }

        /**
         * @return instanceIds
         */
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public static final class Builder {
            private java.util.List<String> instanceIds; 

            private Builder() {
            } 

            private Builder(Pkcs7VerificationConfig model) {
                this.instanceIds = model.instanceIds;
            } 

            /**
             * <p>允许的实例ID列表，最多10个</p>
             */
            public Builder instanceIds(java.util.List<String> instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            public Pkcs7VerificationConfig build() {
                return new Pkcs7VerificationConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationFederatedCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationFederatedCredentialResponseBody</p>
     */
    public static class ApplicationFederatedCredential extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationFederatedCredentialId")
        private String applicationFederatedCredentialId;

        @com.aliyun.core.annotation.NameInMap("ApplicationFederatedCredentialName")
        private String applicationFederatedCredentialName;

        @com.aliyun.core.annotation.NameInMap("ApplicationFederatedCredentialType")
        private String applicationFederatedCredentialType;

        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("AttributeMappings")
        private java.util.List<AttributeMappings> attributeMappings;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FederatedCredentialProviderId")
        private String federatedCredentialProviderId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LastUsedTime")
        private Long lastUsedTime;

        @com.aliyun.core.annotation.NameInMap("OidcVerificationConfig")
        private OidcVerificationConfig oidcVerificationConfig;

        @com.aliyun.core.annotation.NameInMap("Pkcs7VerificationConfig")
        private Pkcs7VerificationConfig pkcs7VerificationConfig;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("VerificationCondition")
        private String verificationCondition;

        @com.aliyun.core.annotation.NameInMap("VerificationMode")
        private String verificationMode;

        private ApplicationFederatedCredential(Builder builder) {
            this.applicationFederatedCredentialId = builder.applicationFederatedCredentialId;
            this.applicationFederatedCredentialName = builder.applicationFederatedCredentialName;
            this.applicationFederatedCredentialType = builder.applicationFederatedCredentialType;
            this.applicationId = builder.applicationId;
            this.attributeMappings = builder.attributeMappings;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.federatedCredentialProviderId = builder.federatedCredentialProviderId;
            this.instanceId = builder.instanceId;
            this.lastUsedTime = builder.lastUsedTime;
            this.oidcVerificationConfig = builder.oidcVerificationConfig;
            this.pkcs7VerificationConfig = builder.pkcs7VerificationConfig;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
            this.verificationCondition = builder.verificationCondition;
            this.verificationMode = builder.verificationMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationFederatedCredential create() {
            return builder().build();
        }

        /**
         * @return applicationFederatedCredentialId
         */
        public String getApplicationFederatedCredentialId() {
            return this.applicationFederatedCredentialId;
        }

        /**
         * @return applicationFederatedCredentialName
         */
        public String getApplicationFederatedCredentialName() {
            return this.applicationFederatedCredentialName;
        }

        /**
         * @return applicationFederatedCredentialType
         */
        public String getApplicationFederatedCredentialType() {
            return this.applicationFederatedCredentialType;
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
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return federatedCredentialProviderId
         */
        public String getFederatedCredentialProviderId() {
            return this.federatedCredentialProviderId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return lastUsedTime
         */
        public Long getLastUsedTime() {
            return this.lastUsedTime;
        }

        /**
         * @return oidcVerificationConfig
         */
        public OidcVerificationConfig getOidcVerificationConfig() {
            return this.oidcVerificationConfig;
        }

        /**
         * @return pkcs7VerificationConfig
         */
        public Pkcs7VerificationConfig getPkcs7VerificationConfig() {
            return this.pkcs7VerificationConfig;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return verificationCondition
         */
        public String getVerificationCondition() {
            return this.verificationCondition;
        }

        /**
         * @return verificationMode
         */
        public String getVerificationMode() {
            return this.verificationMode;
        }

        public static final class Builder {
            private String applicationFederatedCredentialId; 
            private String applicationFederatedCredentialName; 
            private String applicationFederatedCredentialType; 
            private String applicationId; 
            private java.util.List<AttributeMappings> attributeMappings; 
            private Long createTime; 
            private String description; 
            private String federatedCredentialProviderId; 
            private String instanceId; 
            private Long lastUsedTime; 
            private OidcVerificationConfig oidcVerificationConfig; 
            private Pkcs7VerificationConfig pkcs7VerificationConfig; 
            private String status; 
            private Long updateTime; 
            private String verificationCondition; 
            private String verificationMode; 

            private Builder() {
            } 

            private Builder(ApplicationFederatedCredential model) {
                this.applicationFederatedCredentialId = model.applicationFederatedCredentialId;
                this.applicationFederatedCredentialName = model.applicationFederatedCredentialName;
                this.applicationFederatedCredentialType = model.applicationFederatedCredentialType;
                this.applicationId = model.applicationId;
                this.attributeMappings = model.attributeMappings;
                this.createTime = model.createTime;
                this.description = model.description;
                this.federatedCredentialProviderId = model.federatedCredentialProviderId;
                this.instanceId = model.instanceId;
                this.lastUsedTime = model.lastUsedTime;
                this.oidcVerificationConfig = model.oidcVerificationConfig;
                this.pkcs7VerificationConfig = model.pkcs7VerificationConfig;
                this.status = model.status;
                this.updateTime = model.updateTime;
                this.verificationCondition = model.verificationCondition;
                this.verificationMode = model.verificationMode;
            } 

            /**
             * <p>应用联邦凭证ID</p>
             * 
             * <strong>example:</strong>
             * <p>afc_aaaaa1111</p>
             */
            public Builder applicationFederatedCredentialId(String applicationFederatedCredentialId) {
                this.applicationFederatedCredentialId = applicationFederatedCredentialId;
                return this;
            }

            /**
             * <p>应用联邦凭证名称</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder applicationFederatedCredentialName(String applicationFederatedCredentialName) {
                this.applicationFederatedCredentialName = applicationFederatedCredentialName;
                return this;
            }

            /**
             * <p>应用联邦凭证类型</p>
             * 
             * <strong>example:</strong>
             * <p>oidc</p>
             */
            public Builder applicationFederatedCredentialType(String applicationFederatedCredentialType) {
                this.applicationFederatedCredentialType = applicationFederatedCredentialType;
                return this;
            }

            /**
             * <p>应用ID</p>
             * 
             * <strong>example:</strong>
             * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>属性映射</p>
             */
            public Builder attributeMappings(java.util.List<AttributeMappings> attributeMappings) {
                this.attributeMappings = attributeMappings;
                return this;
            }

            /**
             * <p>创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>1758785994982</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>应用联邦凭证描述</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>应用联邦凭证提供者ID</p>
             * 
             * <strong>example:</strong>
             * <p>fcp_asda1dasdxxxx</p>
             */
            public Builder federatedCredentialProviderId(String federatedCredentialProviderId) {
                this.federatedCredentialProviderId = federatedCredentialProviderId;
                return this;
            }

            /**
             * <p>EAIM 实例ID</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>最近使用时间</p>
             * 
             * <strong>example:</strong>
             * <p>1758785994982</p>
             */
            public Builder lastUsedTime(Long lastUsedTime) {
                this.lastUsedTime = lastUsedTime;
                return this;
            }

            /**
             * <p>OIDC结构化配置（structured模式 + oidc类型）</p>
             */
            public Builder oidcVerificationConfig(OidcVerificationConfig oidcVerificationConfig) {
                this.oidcVerificationConfig = oidcVerificationConfig;
                return this;
            }

            /**
             * <p>PKCS#7结构化配置（structured模式 + pkcs7类型）</p>
             */
            public Builder pkcs7VerificationConfig(Pkcs7VerificationConfig pkcs7VerificationConfig) {
                this.pkcs7VerificationConfig = pkcs7VerificationConfig;
                return this;
            }

            /**
             * <p>应用联邦凭证状态</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>更新时间</p>
             * 
             * <strong>example:</strong>
             * <p>1758785994982</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>验证条件</p>
             * 
             * <strong>example:</strong>
             * <p>Equals(cert.subject.CN, &quot;test&quot;)</p>
             */
            public Builder verificationCondition(String verificationCondition) {
                this.verificationCondition = verificationCondition;
                return this;
            }

            /**
             * <p>校验模式：freedom / structured</p>
             */
            public Builder verificationMode(String verificationMode) {
                this.verificationMode = verificationMode;
                return this;
            }

            public ApplicationFederatedCredential build() {
                return new ApplicationFederatedCredential(this);
            } 

        } 

    }
}
