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
 * {@link ListApplicationFederatedCredentialsForProviderResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationFederatedCredentialsForProviderResponseBody</p>
 */
public class ListApplicationFederatedCredentialsForProviderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationFederatedCredentials")
    private java.util.List<ApplicationFederatedCredentials> applicationFederatedCredentials;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PreviousToken")
    private String previousToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListApplicationFederatedCredentialsForProviderResponseBody(Builder builder) {
        this.applicationFederatedCredentials = builder.applicationFederatedCredentials;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.previousToken = builder.previousToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationFederatedCredentialsForProviderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationFederatedCredentials
     */
    public java.util.List<ApplicationFederatedCredentials> getApplicationFederatedCredentials() {
        return this.applicationFederatedCredentials;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return previousToken
     */
    public String getPreviousToken() {
        return this.previousToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<ApplicationFederatedCredentials> applicationFederatedCredentials; 
        private Integer maxResults; 
        private String nextToken; 
        private String previousToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListApplicationFederatedCredentialsForProviderResponseBody model) {
            this.applicationFederatedCredentials = model.applicationFederatedCredentials;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.previousToken = model.previousToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of application federated credentials.</p>
         */
        public Builder applicationFederatedCredentials(java.util.List<ApplicationFederatedCredentials> applicationFederatedCredentials) {
            this.applicationFederatedCredentials = applicationFederatedCredentials;
            return this;
        }

        /**
         * <p>The maximum number of entries per page for a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token returned by this call.</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The pagination token returned by this call.</p>
         * 
         * <strong>example:</strong>
         * <p>PTxxxexample</p>
         */
        public Builder previousToken(String previousToken) {
            this.previousToken = previousToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries in the list.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBody build() {
            return new ListApplicationFederatedCredentialsForProviderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationFederatedCredentialsForProviderResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationFederatedCredentialsForProviderResponseBody</p>
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
             * <p>The principal ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5dee234a-1b4c-4ad7-a19f-fxxxxx</p>
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * <p>The Azure resource group name.</p>
             * 
             * <strong>example:</strong>
             * <p>user_default</p>
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * <p>The subscription ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4342a1f4-7e5d-4371-97dc-d4f33f4xxxx</p>
             */
            public Builder subscriptionId(String subscriptionId) {
                this.subscriptionId = subscriptionId;
                return this;
            }

            /**
             * <p>The list of virtual machine names.</p>
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
     * {@link ListApplicationFederatedCredentialsForProviderResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationFederatedCredentialsForProviderResponseBody</p>
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
             * <p>The list of VM instance IDs.</p>
             */
            public Builder instanceIds(java.util.List<String> instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * <p>The GCP project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>turnkey-axiom-475109-xx</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The subject corresponding to the service account.</p>
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
     * {@link ListApplicationFederatedCredentialsForProviderResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationFederatedCredentialsForProviderResponseBody</p>
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
             * <p>The subject identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>test_subject</p>
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
     * {@link ListApplicationFederatedCredentialsForProviderResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationFederatedCredentialsForProviderResponseBody</p>
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
             * <p>The K8s namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The pod name prefix.</p>
             * 
             * <strong>example:</strong>
             * <p>test-pod</p>
             */
            public Builder podNamePrefix(String podNamePrefix) {
                this.podNamePrefix = podNamePrefix;
                return this;
            }

            /**
             * <p>The K8s service account name.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
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
     * {@link ListApplicationFederatedCredentialsForProviderResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationFederatedCredentialsForProviderResponseBody</p>
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
             * <p>The Azure VM scenario configuration.</p>
             */
            public Builder azureVmConfig(AzureVmConfig azureVmConfig) {
                this.azureVmConfig = azureVmConfig;
                return this;
            }

            /**
             * <p>The GCP VM scenario configuration.</p>
             */
            public Builder gcpVmConfig(GcpVmConfig gcpVmConfig) {
                this.gcpVmConfig = gcpVmConfig;
                return this;
            }

            /**
             * <p>The generic scenario configuration.</p>
             */
            public Builder genericConfig(GenericConfig genericConfig) {
                this.genericConfig = genericConfig;
                return this;
            }

            /**
             * <p>The Kubernetes scenario configuration.</p>
             */
            public Builder kubernetesConfig(KubernetesConfig kubernetesConfig) {
                this.kubernetesConfig = kubernetesConfig;
                return this;
            }

            /**
             * <p>The OIDC scenario profile. Different profiles correspond to different configurations. Valid values:</p>
             * <ul>
             * <li>generic</li>
             * <li>kubernetes</li>
             * <li>gcp_vm</li>
             * <li>azure_vm</li>
             * </ul>
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
     * {@link ListApplicationFederatedCredentialsForProviderResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationFederatedCredentialsForProviderResponseBody</p>
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
             * <p>The list of allowed instance IDs.</p>
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
     * {@link ListApplicationFederatedCredentialsForProviderResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationFederatedCredentialsForProviderResponseBody</p>
     */
    public static class ApplicationFederatedCredentials extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationFederatedCredentialId")
        private String applicationFederatedCredentialId;

        @com.aliyun.core.annotation.NameInMap("ApplicationFederatedCredentialName")
        private String applicationFederatedCredentialName;

        @com.aliyun.core.annotation.NameInMap("ApplicationFederatedCredentialType")
        private String applicationFederatedCredentialType;

        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

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

        private ApplicationFederatedCredentials(Builder builder) {
            this.applicationFederatedCredentialId = builder.applicationFederatedCredentialId;
            this.applicationFederatedCredentialName = builder.applicationFederatedCredentialName;
            this.applicationFederatedCredentialType = builder.applicationFederatedCredentialType;
            this.applicationId = builder.applicationId;
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

        public static ApplicationFederatedCredentials create() {
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

            private Builder(ApplicationFederatedCredentials model) {
                this.applicationFederatedCredentialId = model.applicationFederatedCredentialId;
                this.applicationFederatedCredentialName = model.applicationFederatedCredentialName;
                this.applicationFederatedCredentialType = model.applicationFederatedCredentialType;
                this.applicationId = model.applicationId;
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
             * <p>The application federated credential ID.</p>
             * 
             * <strong>example:</strong>
             * <p>afc_dads12sadxxxxx</p>
             */
            public Builder applicationFederatedCredentialId(String applicationFederatedCredentialId) {
                this.applicationFederatedCredentialId = applicationFederatedCredentialId;
                return this;
            }

            /**
             * <p>The application federated credential name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder applicationFederatedCredentialName(String applicationFederatedCredentialName) {
                this.applicationFederatedCredentialName = applicationFederatedCredentialName;
                return this;
            }

            /**
             * <p>The application federated credential type.</p>
             * 
             * <strong>example:</strong>
             * <p>oidc</p>
             */
            public Builder applicationFederatedCredentialType(String applicationFederatedCredentialType) {
                this.applicationFederatedCredentialType = applicationFederatedCredentialType;
                return this;
            }

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>app_asda1dsadxxxxx</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1758785994982</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The application federated credential description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The federated trust source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>fcp_adasd12dxxxxx</p>
             */
            public Builder federatedCredentialProviderId(String federatedCredentialProviderId) {
                this.federatedCredentialProviderId = federatedCredentialProviderId;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The last used time.</p>
             * 
             * <strong>example:</strong>
             * <p>1758785994982</p>
             */
            public Builder lastUsedTime(Long lastUsedTime) {
                this.lastUsedTime = lastUsedTime;
                return this;
            }

            /**
             * <p>The OIDC structured configuration.</p>
             */
            public Builder oidcVerificationConfig(OidcVerificationConfig oidcVerificationConfig) {
                this.oidcVerificationConfig = oidcVerificationConfig;
                return this;
            }

            /**
             * <p>The PKCS#7 structured configuration.</p>
             */
            public Builder pkcs7VerificationConfig(Pkcs7VerificationConfig pkcs7VerificationConfig) {
                this.pkcs7VerificationConfig = pkcs7VerificationConfig;
                return this;
            }

            /**
             * <p>The application federated credential status.</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>1758785994982</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The verification condition.</p>
             * 
             * <strong>example:</strong>
             * <p>Equals(cert.subject.CN, &quot;test&quot;)</p>
             */
            public Builder verificationCondition(String verificationCondition) {
                this.verificationCondition = verificationCondition;
                return this;
            }

            /**
             * <p>The verification mode. Valid values:</p>
             * <ul>
             * <li>freedom: free mode.</li>
             * <li>structured: structured mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>structured</p>
             */
            public Builder verificationMode(String verificationMode) {
                this.verificationMode = verificationMode;
                return this;
            }

            public ApplicationFederatedCredentials build() {
                return new ApplicationFederatedCredentials(this);
            } 

        } 

    }
}
