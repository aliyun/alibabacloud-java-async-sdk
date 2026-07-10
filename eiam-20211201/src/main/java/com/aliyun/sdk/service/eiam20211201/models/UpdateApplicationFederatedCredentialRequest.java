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
    @com.aliyun.core.annotation.NameInMap("OidcVerificationConfig")
    private OidcVerificationConfig oidcVerificationConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pkcs7VerificationConfig")
    private Pkcs7VerificationConfig pkcs7VerificationConfig;

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
        this.oidcVerificationConfig = builder.oidcVerificationConfig;
        this.pkcs7VerificationConfig = builder.pkcs7VerificationConfig;
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
        private OidcVerificationConfig oidcVerificationConfig; 
        private Pkcs7VerificationConfig pkcs7VerificationConfig; 
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
            this.oidcVerificationConfig = request.oidcVerificationConfig;
            this.pkcs7VerificationConfig = request.pkcs7VerificationConfig;
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
         * <p>OIDC结构化配置（structured模式 + oidc类型）</p>
         */
        public Builder oidcVerificationConfig(OidcVerificationConfig oidcVerificationConfig) {
            this.putQueryParameter("OidcVerificationConfig", oidcVerificationConfig);
            this.oidcVerificationConfig = oidcVerificationConfig;
            return this;
        }

        /**
         * <p>PKCS#7结构化配置（structured模式 + pkcs7类型）</p>
         */
        public Builder pkcs7VerificationConfig(Pkcs7VerificationConfig pkcs7VerificationConfig) {
            this.putQueryParameter("Pkcs7VerificationConfig", pkcs7VerificationConfig);
            this.pkcs7VerificationConfig = pkcs7VerificationConfig;
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
    /**
     * 
     * {@link UpdateApplicationFederatedCredentialRequest} extends {@link TeaModel}
     *
     * <p>UpdateApplicationFederatedCredentialRequest</p>
     */
    public static class AzureVmConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrincipalId")
        @com.aliyun.core.annotation.Validation(maxLength = 128)
        private String principalId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        @com.aliyun.core.annotation.Validation(maxLength = 128)
        private String resourceGroupName;

        @com.aliyun.core.annotation.NameInMap("SubscriptionId")
        @com.aliyun.core.annotation.Validation(maxLength = 128)
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
     * {@link UpdateApplicationFederatedCredentialRequest} extends {@link TeaModel}
     *
     * <p>UpdateApplicationFederatedCredentialRequest</p>
     */
    public static class GcpVmConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceIds")
        private java.util.List<String> instanceIds;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(maxLength = 128)
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ServiceAccountId")
        @com.aliyun.core.annotation.Validation(maxLength = 128)
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
             * InstanceIds.
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
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
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
     * {@link UpdateApplicationFederatedCredentialRequest} extends {@link TeaModel}
     *
     * <p>UpdateApplicationFederatedCredentialRequest</p>
     */
    public static class GenericConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Subject")
        @com.aliyun.core.annotation.Validation(maxLength = 128)
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
     * {@link UpdateApplicationFederatedCredentialRequest} extends {@link TeaModel}
     *
     * <p>UpdateApplicationFederatedCredentialRequest</p>
     */
    public static class KubernetesConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Namespace")
        @com.aliyun.core.annotation.Validation(maxLength = 128)
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("PodNamePrefix")
        @com.aliyun.core.annotation.Validation(maxLength = 128)
        private String podNamePrefix;

        @com.aliyun.core.annotation.NameInMap("ServiceAccountName")
        @com.aliyun.core.annotation.Validation(maxLength = 128)
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
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>Pod名称前缀</p>
             * 
             * <strong>example:</strong>
             * <p>my-pod-</p>
             */
            public Builder podNamePrefix(String podNamePrefix) {
                this.podNamePrefix = podNamePrefix;
                return this;
            }

            /**
             * <p>K8s服务账号名称</p>
             * 
             * <strong>example:</strong>
             * <p>my-sa</p>
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
     * {@link UpdateApplicationFederatedCredentialRequest} extends {@link TeaModel}
     *
     * <p>UpdateApplicationFederatedCredentialRequest</p>
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
        @com.aliyun.core.annotation.Validation(maxLength = 32)
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
             * 
             * <strong>example:</strong>
             * <p>kubernetes</p>
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
     * {@link UpdateApplicationFederatedCredentialRequest} extends {@link TeaModel}
     *
     * <p>UpdateApplicationFederatedCredentialRequest</p>
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
             * InstanceIds.
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
}
