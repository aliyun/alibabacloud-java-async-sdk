// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs_workbench20220220.models;

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
 * {@link LoginInstanceRequest} extends {@link RequestModel}
 *
 * <p>LoginInstanceRequest</p>
 */
public class LoginInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceLoginInfo")
    private InstanceLoginInfo instanceLoginInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PartnerInfo")
    private PartnerInfo partnerInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAccount")
    private UserAccount userAccount;

    private LoginInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceLoginInfo = builder.instanceLoginInfo;
        this.partnerInfo = builder.partnerInfo;
        this.userAccount = builder.userAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LoginInstanceRequest create() {
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
     * @return instanceLoginInfo
     */
    public InstanceLoginInfo getInstanceLoginInfo() {
        return this.instanceLoginInfo;
    }

    /**
     * @return partnerInfo
     */
    public PartnerInfo getPartnerInfo() {
        return this.partnerInfo;
    }

    /**
     * @return userAccount
     */
    public UserAccount getUserAccount() {
        return this.userAccount;
    }

    public static final class Builder extends Request.Builder<LoginInstanceRequest, Builder> {
        private String regionId; 
        private InstanceLoginInfo instanceLoginInfo; 
        private PartnerInfo partnerInfo; 
        private UserAccount userAccount; 

        private Builder() {
            super();
        } 

        private Builder(LoginInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceLoginInfo = request.instanceLoginInfo;
            this.partnerInfo = request.partnerInfo;
            this.userAccount = request.userAccount;
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
         * InstanceLoginInfo.
         */
        public Builder instanceLoginInfo(InstanceLoginInfo instanceLoginInfo) {
            this.putQueryParameter("InstanceLoginInfo", instanceLoginInfo);
            this.instanceLoginInfo = instanceLoginInfo;
            return this;
        }

        /**
         * PartnerInfo.
         */
        public Builder partnerInfo(PartnerInfo partnerInfo) {
            this.putQueryParameter("PartnerInfo", partnerInfo);
            this.partnerInfo = partnerInfo;
            return this;
        }

        /**
         * UserAccount.
         */
        public Builder userAccount(UserAccount userAccount) {
            this.putQueryParameter("UserAccount", userAccount);
            this.userAccount = userAccount;
            return this;
        }

        @Override
        public LoginInstanceRequest build() {
            return new LoginInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link LoginInstanceRequest} extends {@link TeaModel}
     *
     * <p>LoginInstanceRequest</p>
     */
    public static class EncryptionOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("KMSKeyId")
        private String KMSKeyId;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        private EncryptionOptions(Builder builder) {
            this.enabled = builder.enabled;
            this.KMSKeyId = builder.KMSKeyId;
            this.mode = builder.mode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EncryptionOptions create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return KMSKeyId
         */
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String KMSKeyId; 
            private String mode; 

            private Builder() {
            } 

            private Builder(EncryptionOptions model) {
                this.enabled = model.enabled;
                this.KMSKeyId = model.KMSKeyId;
                this.mode = model.mode;
            } 

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * KMSKeyId.
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            public EncryptionOptions build() {
                return new EncryptionOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link LoginInstanceRequest} extends {@link TeaModel}
     *
     * <p>LoginInstanceRequest</p>
     */
    public static class ContainerInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ContainerName")
        private String containerName;

        @com.aliyun.core.annotation.NameInMap("Deployment")
        private String deployment;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("Headers")
        private java.util.Map<String, ?> headers;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("PodName")
        private String podName;

        private ContainerInfo(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.containerName = builder.containerName;
            this.deployment = builder.deployment;
            this.endpoint = builder.endpoint;
            this.headers = builder.headers;
            this.namespace = builder.namespace;
            this.podName = builder.podName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerInfo create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return containerName
         */
        public String getContainerName() {
            return this.containerName;
        }

        /**
         * @return deployment
         */
        public String getDeployment() {
            return this.deployment;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return headers
         */
        public java.util.Map<String, ?> getHeaders() {
            return this.headers;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return podName
         */
        public String getPodName() {
            return this.podName;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private String containerName; 
            private String deployment; 
            private String endpoint; 
            private java.util.Map<String, ?> headers; 
            private String namespace; 
            private String podName; 

            private Builder() {
            } 

            private Builder(ContainerInfo model) {
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.containerName = model.containerName;
                this.deployment = model.deployment;
                this.endpoint = model.endpoint;
                this.headers = model.headers;
                this.namespace = model.namespace;
                this.podName = model.podName;
            } 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * ContainerName.
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * Deployment.
             */
            public Builder deployment(String deployment) {
                this.deployment = deployment;
                return this;
            }

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * Headers.
             */
            public Builder headers(java.util.Map<String, ?> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * PodName.
             */
            public Builder podName(String podName) {
                this.podName = podName;
                return this;
            }

            public ContainerInfo build() {
                return new ContainerInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link LoginInstanceRequest} extends {@link TeaModel}
     *
     * <p>LoginInstanceRequest</p>
     */
    public static class Options extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioMuteSeconds")
        private Integer audioMuteSeconds;

        @com.aliyun.core.annotation.NameInMap("ContainerInfo")
        private ContainerInfo containerInfo;

        @com.aliyun.core.annotation.NameInMap("FixedHeight")
        private Integer fixedHeight;

        @com.aliyun.core.annotation.NameInMap("FixedWidth")
        private Integer fixedWidth;

        @com.aliyun.core.annotation.NameInMap("NotificationEventTypes")
        private String notificationEventTypes;

        @com.aliyun.core.annotation.NameInMap("NotificationRecipientUrl")
        private String notificationRecipientUrl;

        @com.aliyun.core.annotation.NameInMap("NotificationRetryIntervalSeconds")
        private Integer notificationRetryIntervalSeconds;

        @com.aliyun.core.annotation.NameInMap("NotificationRetryLimit")
        private Integer notificationRetryLimit;

        @com.aliyun.core.annotation.NameInMap("OperationDisableSeconds")
        private Integer operationDisableSeconds;

        @com.aliyun.core.annotation.NameInMap("SessionControl")
        private String sessionControl;

        @com.aliyun.core.annotation.NameInMap("VideoFreezeSeconds")
        private Integer videoFreezeSeconds;

        private Options(Builder builder) {
            this.audioMuteSeconds = builder.audioMuteSeconds;
            this.containerInfo = builder.containerInfo;
            this.fixedHeight = builder.fixedHeight;
            this.fixedWidth = builder.fixedWidth;
            this.notificationEventTypes = builder.notificationEventTypes;
            this.notificationRecipientUrl = builder.notificationRecipientUrl;
            this.notificationRetryIntervalSeconds = builder.notificationRetryIntervalSeconds;
            this.notificationRetryLimit = builder.notificationRetryLimit;
            this.operationDisableSeconds = builder.operationDisableSeconds;
            this.sessionControl = builder.sessionControl;
            this.videoFreezeSeconds = builder.videoFreezeSeconds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Options create() {
            return builder().build();
        }

        /**
         * @return audioMuteSeconds
         */
        public Integer getAudioMuteSeconds() {
            return this.audioMuteSeconds;
        }

        /**
         * @return containerInfo
         */
        public ContainerInfo getContainerInfo() {
            return this.containerInfo;
        }

        /**
         * @return fixedHeight
         */
        public Integer getFixedHeight() {
            return this.fixedHeight;
        }

        /**
         * @return fixedWidth
         */
        public Integer getFixedWidth() {
            return this.fixedWidth;
        }

        /**
         * @return notificationEventTypes
         */
        public String getNotificationEventTypes() {
            return this.notificationEventTypes;
        }

        /**
         * @return notificationRecipientUrl
         */
        public String getNotificationRecipientUrl() {
            return this.notificationRecipientUrl;
        }

        /**
         * @return notificationRetryIntervalSeconds
         */
        public Integer getNotificationRetryIntervalSeconds() {
            return this.notificationRetryIntervalSeconds;
        }

        /**
         * @return notificationRetryLimit
         */
        public Integer getNotificationRetryLimit() {
            return this.notificationRetryLimit;
        }

        /**
         * @return operationDisableSeconds
         */
        public Integer getOperationDisableSeconds() {
            return this.operationDisableSeconds;
        }

        /**
         * @return sessionControl
         */
        public String getSessionControl() {
            return this.sessionControl;
        }

        /**
         * @return videoFreezeSeconds
         */
        public Integer getVideoFreezeSeconds() {
            return this.videoFreezeSeconds;
        }

        public static final class Builder {
            private Integer audioMuteSeconds; 
            private ContainerInfo containerInfo; 
            private Integer fixedHeight; 
            private Integer fixedWidth; 
            private String notificationEventTypes; 
            private String notificationRecipientUrl; 
            private Integer notificationRetryIntervalSeconds; 
            private Integer notificationRetryLimit; 
            private Integer operationDisableSeconds; 
            private String sessionControl; 
            private Integer videoFreezeSeconds; 

            private Builder() {
            } 

            private Builder(Options model) {
                this.audioMuteSeconds = model.audioMuteSeconds;
                this.containerInfo = model.containerInfo;
                this.fixedHeight = model.fixedHeight;
                this.fixedWidth = model.fixedWidth;
                this.notificationEventTypes = model.notificationEventTypes;
                this.notificationRecipientUrl = model.notificationRecipientUrl;
                this.notificationRetryIntervalSeconds = model.notificationRetryIntervalSeconds;
                this.notificationRetryLimit = model.notificationRetryLimit;
                this.operationDisableSeconds = model.operationDisableSeconds;
                this.sessionControl = model.sessionControl;
                this.videoFreezeSeconds = model.videoFreezeSeconds;
            } 

            /**
             * AudioMuteSeconds.
             */
            public Builder audioMuteSeconds(Integer audioMuteSeconds) {
                this.audioMuteSeconds = audioMuteSeconds;
                return this;
            }

            /**
             * ContainerInfo.
             */
            public Builder containerInfo(ContainerInfo containerInfo) {
                this.containerInfo = containerInfo;
                return this;
            }

            /**
             * FixedHeight.
             */
            public Builder fixedHeight(Integer fixedHeight) {
                this.fixedHeight = fixedHeight;
                return this;
            }

            /**
             * FixedWidth.
             */
            public Builder fixedWidth(Integer fixedWidth) {
                this.fixedWidth = fixedWidth;
                return this;
            }

            /**
             * NotificationEventTypes.
             */
            public Builder notificationEventTypes(String notificationEventTypes) {
                this.notificationEventTypes = notificationEventTypes;
                return this;
            }

            /**
             * NotificationRecipientUrl.
             */
            public Builder notificationRecipientUrl(String notificationRecipientUrl) {
                this.notificationRecipientUrl = notificationRecipientUrl;
                return this;
            }

            /**
             * NotificationRetryIntervalSeconds.
             */
            public Builder notificationRetryIntervalSeconds(Integer notificationRetryIntervalSeconds) {
                this.notificationRetryIntervalSeconds = notificationRetryIntervalSeconds;
                return this;
            }

            /**
             * NotificationRetryLimit.
             */
            public Builder notificationRetryLimit(Integer notificationRetryLimit) {
                this.notificationRetryLimit = notificationRetryLimit;
                return this;
            }

            /**
             * OperationDisableSeconds.
             */
            public Builder operationDisableSeconds(Integer operationDisableSeconds) {
                this.operationDisableSeconds = operationDisableSeconds;
                return this;
            }

            /**
             * SessionControl.
             */
            public Builder sessionControl(String sessionControl) {
                this.sessionControl = sessionControl;
                return this;
            }

            /**
             * VideoFreezeSeconds.
             */
            public Builder videoFreezeSeconds(Integer videoFreezeSeconds) {
                this.videoFreezeSeconds = videoFreezeSeconds;
                return this;
            }

            public Options build() {
                return new Options(this);
            } 

        } 

    }
    /**
     * 
     * {@link LoginInstanceRequest} extends {@link TeaModel}
     *
     * <p>LoginInstanceRequest</p>
     */
    public static class InstanceLoginInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthenticationType")
        private String authenticationType;

        @com.aliyun.core.annotation.NameInMap("Certificate")
        private String certificate;

        @com.aliyun.core.annotation.NameInMap("CredentialToken")
        private String credentialToken;

        @com.aliyun.core.annotation.NameInMap("DockerContainerName")
        private String dockerContainerName;

        @com.aliyun.core.annotation.NameInMap("DockerExec")
        private String dockerExec;

        @com.aliyun.core.annotation.NameInMap("DurationSeconds")
        private Long durationSeconds;

        @com.aliyun.core.annotation.NameInMap("EncryptionOptions")
        private EncryptionOptions encryptionOptions;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("LoginByInstanceCredential")
        private Boolean loginByInstanceCredential;

        @com.aliyun.core.annotation.NameInMap("LoginByInstanceShortcut")
        private Boolean loginByInstanceShortcut;

        @com.aliyun.core.annotation.NameInMap("NetworkAccessMode")
        private String networkAccessMode;

        @com.aliyun.core.annotation.NameInMap("Options")
        private Options options;

        @com.aliyun.core.annotation.NameInMap("PassPhrase")
        private String passPhrase;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ShortcutToken")
        private String shortcutToken;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private InstanceLoginInfo(Builder builder) {
            this.authenticationType = builder.authenticationType;
            this.certificate = builder.certificate;
            this.credentialToken = builder.credentialToken;
            this.dockerContainerName = builder.dockerContainerName;
            this.dockerExec = builder.dockerExec;
            this.durationSeconds = builder.durationSeconds;
            this.encryptionOptions = builder.encryptionOptions;
            this.expireTime = builder.expireTime;
            this.host = builder.host;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.loginByInstanceCredential = builder.loginByInstanceCredential;
            this.loginByInstanceShortcut = builder.loginByInstanceShortcut;
            this.networkAccessMode = builder.networkAccessMode;
            this.options = builder.options;
            this.passPhrase = builder.passPhrase;
            this.password = builder.password;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.shortcutToken = builder.shortcutToken;
            this.username = builder.username;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceLoginInfo create() {
            return builder().build();
        }

        /**
         * @return authenticationType
         */
        public String getAuthenticationType() {
            return this.authenticationType;
        }

        /**
         * @return certificate
         */
        public String getCertificate() {
            return this.certificate;
        }

        /**
         * @return credentialToken
         */
        public String getCredentialToken() {
            return this.credentialToken;
        }

        /**
         * @return dockerContainerName
         */
        public String getDockerContainerName() {
            return this.dockerContainerName;
        }

        /**
         * @return dockerExec
         */
        public String getDockerExec() {
            return this.dockerExec;
        }

        /**
         * @return durationSeconds
         */
        public Long getDurationSeconds() {
            return this.durationSeconds;
        }

        /**
         * @return encryptionOptions
         */
        public EncryptionOptions getEncryptionOptions() {
            return this.encryptionOptions;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return loginByInstanceCredential
         */
        public Boolean getLoginByInstanceCredential() {
            return this.loginByInstanceCredential;
        }

        /**
         * @return loginByInstanceShortcut
         */
        public Boolean getLoginByInstanceShortcut() {
            return this.loginByInstanceShortcut;
        }

        /**
         * @return networkAccessMode
         */
        public String getNetworkAccessMode() {
            return this.networkAccessMode;
        }

        /**
         * @return options
         */
        public Options getOptions() {
            return this.options;
        }

        /**
         * @return passPhrase
         */
        public String getPassPhrase() {
            return this.passPhrase;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return shortcutToken
         */
        public String getShortcutToken() {
            return this.shortcutToken;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String authenticationType; 
            private String certificate; 
            private String credentialToken; 
            private String dockerContainerName; 
            private String dockerExec; 
            private Long durationSeconds; 
            private EncryptionOptions encryptionOptions; 
            private String expireTime; 
            private String host; 
            private String instanceId; 
            private String instanceType; 
            private Boolean loginByInstanceCredential; 
            private Boolean loginByInstanceShortcut; 
            private String networkAccessMode; 
            private Options options; 
            private String passPhrase; 
            private String password; 
            private Integer port; 
            private String protocol; 
            private String regionId; 
            private String resourceGroupId; 
            private String shortcutToken; 
            private String username; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(InstanceLoginInfo model) {
                this.authenticationType = model.authenticationType;
                this.certificate = model.certificate;
                this.credentialToken = model.credentialToken;
                this.dockerContainerName = model.dockerContainerName;
                this.dockerExec = model.dockerExec;
                this.durationSeconds = model.durationSeconds;
                this.encryptionOptions = model.encryptionOptions;
                this.expireTime = model.expireTime;
                this.host = model.host;
                this.instanceId = model.instanceId;
                this.instanceType = model.instanceType;
                this.loginByInstanceCredential = model.loginByInstanceCredential;
                this.loginByInstanceShortcut = model.loginByInstanceShortcut;
                this.networkAccessMode = model.networkAccessMode;
                this.options = model.options;
                this.passPhrase = model.passPhrase;
                this.password = model.password;
                this.port = model.port;
                this.protocol = model.protocol;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.shortcutToken = model.shortcutToken;
                this.username = model.username;
                this.vpcId = model.vpcId;
            } 

            /**
             * AuthenticationType.
             */
            public Builder authenticationType(String authenticationType) {
                this.authenticationType = authenticationType;
                return this;
            }

            /**
             * Certificate.
             */
            public Builder certificate(String certificate) {
                this.certificate = certificate;
                return this;
            }

            /**
             * CredentialToken.
             */
            public Builder credentialToken(String credentialToken) {
                this.credentialToken = credentialToken;
                return this;
            }

            /**
             * DockerContainerName.
             */
            public Builder dockerContainerName(String dockerContainerName) {
                this.dockerContainerName = dockerContainerName;
                return this;
            }

            /**
             * DockerExec.
             */
            public Builder dockerExec(String dockerExec) {
                this.dockerExec = dockerExec;
                return this;
            }

            /**
             * DurationSeconds.
             */
            public Builder durationSeconds(Long durationSeconds) {
                this.durationSeconds = durationSeconds;
                return this;
            }

            /**
             * EncryptionOptions.
             */
            public Builder encryptionOptions(EncryptionOptions encryptionOptions) {
                this.encryptionOptions = encryptionOptions;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * LoginByInstanceCredential.
             */
            public Builder loginByInstanceCredential(Boolean loginByInstanceCredential) {
                this.loginByInstanceCredential = loginByInstanceCredential;
                return this;
            }

            /**
             * LoginByInstanceShortcut.
             */
            public Builder loginByInstanceShortcut(Boolean loginByInstanceShortcut) {
                this.loginByInstanceShortcut = loginByInstanceShortcut;
                return this;
            }

            /**
             * NetworkAccessMode.
             */
            public Builder networkAccessMode(String networkAccessMode) {
                this.networkAccessMode = networkAccessMode;
                return this;
            }

            /**
             * Options.
             */
            public Builder options(Options options) {
                this.options = options;
                return this;
            }

            /**
             * PassPhrase.
             */
            public Builder passPhrase(String passPhrase) {
                this.passPhrase = passPhrase;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * ShortcutToken.
             */
            public Builder shortcutToken(String shortcutToken) {
                this.shortcutToken = shortcutToken;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public InstanceLoginInfo build() {
                return new InstanceLoginInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link LoginInstanceRequest} extends {@link TeaModel}
     *
     * <p>LoginInstanceRequest</p>
     */
    public static class PartnerInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PartnerId")
        private String partnerId;

        @com.aliyun.core.annotation.NameInMap("PartnerName")
        private String partnerName;

        private PartnerInfo(Builder builder) {
            this.partnerId = builder.partnerId;
            this.partnerName = builder.partnerName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PartnerInfo create() {
            return builder().build();
        }

        /**
         * @return partnerId
         */
        public String getPartnerId() {
            return this.partnerId;
        }

        /**
         * @return partnerName
         */
        public String getPartnerName() {
            return this.partnerName;
        }

        public static final class Builder {
            private String partnerId; 
            private String partnerName; 

            private Builder() {
            } 

            private Builder(PartnerInfo model) {
                this.partnerId = model.partnerId;
                this.partnerName = model.partnerName;
            } 

            /**
             * PartnerId.
             */
            public Builder partnerId(String partnerId) {
                this.partnerId = partnerId;
                return this;
            }

            /**
             * PartnerName.
             */
            public Builder partnerName(String partnerName) {
                this.partnerName = partnerName;
                return this;
            }

            public PartnerInfo build() {
                return new PartnerInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link LoginInstanceRequest} extends {@link TeaModel}
     *
     * <p>LoginInstanceRequest</p>
     */
    public static class UserAccountOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoginLimit")
        private Long loginLimit;

        private UserAccountOptions(Builder builder) {
            this.loginLimit = builder.loginLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserAccountOptions create() {
            return builder().build();
        }

        /**
         * @return loginLimit
         */
        public Long getLoginLimit() {
            return this.loginLimit;
        }

        public static final class Builder {
            private Long loginLimit; 

            private Builder() {
            } 

            private Builder(UserAccountOptions model) {
                this.loginLimit = model.loginLimit;
            } 

            /**
             * LoginLimit.
             */
            public Builder loginLimit(Long loginLimit) {
                this.loginLimit = loginLimit;
                return this;
            }

            public UserAccountOptions build() {
                return new UserAccountOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link LoginInstanceRequest} extends {@link TeaModel}
     *
     * <p>LoginInstanceRequest</p>
     */
    public static class UserAccount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("AccountPlatform")
        private String accountPlatform;

        @com.aliyun.core.annotation.NameInMap("AccountStructure")
        private String accountStructure;

        @com.aliyun.core.annotation.NameInMap("DurationSeconds")
        private Long durationSeconds;

        @com.aliyun.core.annotation.NameInMap("EmpId")
        private String empId;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("LoginName")
        private String loginName;

        @com.aliyun.core.annotation.NameInMap("Options")
        private UserAccountOptions options;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private Long parentId;

        private UserAccount(Builder builder) {
            this.accountId = builder.accountId;
            this.accountPlatform = builder.accountPlatform;
            this.accountStructure = builder.accountStructure;
            this.durationSeconds = builder.durationSeconds;
            this.empId = builder.empId;
            this.expireTime = builder.expireTime;
            this.loginName = builder.loginName;
            this.options = builder.options;
            this.parentId = builder.parentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserAccount create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return accountPlatform
         */
        public String getAccountPlatform() {
            return this.accountPlatform;
        }

        /**
         * @return accountStructure
         */
        public String getAccountStructure() {
            return this.accountStructure;
        }

        /**
         * @return durationSeconds
         */
        public Long getDurationSeconds() {
            return this.durationSeconds;
        }

        /**
         * @return empId
         */
        public String getEmpId() {
            return this.empId;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return loginName
         */
        public String getLoginName() {
            return this.loginName;
        }

        /**
         * @return options
         */
        public UserAccountOptions getOptions() {
            return this.options;
        }

        /**
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        public static final class Builder {
            private Long accountId; 
            private String accountPlatform; 
            private String accountStructure; 
            private Long durationSeconds; 
            private String empId; 
            private String expireTime; 
            private String loginName; 
            private UserAccountOptions options; 
            private Long parentId; 

            private Builder() {
            } 

            private Builder(UserAccount model) {
                this.accountId = model.accountId;
                this.accountPlatform = model.accountPlatform;
                this.accountStructure = model.accountStructure;
                this.durationSeconds = model.durationSeconds;
                this.empId = model.empId;
                this.expireTime = model.expireTime;
                this.loginName = model.loginName;
                this.options = model.options;
                this.parentId = model.parentId;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * AccountPlatform.
             */
            public Builder accountPlatform(String accountPlatform) {
                this.accountPlatform = accountPlatform;
                return this;
            }

            /**
             * AccountStructure.
             */
            public Builder accountStructure(String accountStructure) {
                this.accountStructure = accountStructure;
                return this;
            }

            /**
             * DurationSeconds.
             */
            public Builder durationSeconds(Long durationSeconds) {
                this.durationSeconds = durationSeconds;
                return this;
            }

            /**
             * EmpId.
             */
            public Builder empId(String empId) {
                this.empId = empId;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * LoginName.
             */
            public Builder loginName(String loginName) {
                this.loginName = loginName;
                return this;
            }

            /**
             * Options.
             */
            public Builder options(UserAccountOptions options) {
                this.options = options;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            public UserAccount build() {
                return new UserAccount(this);
            } 

        } 

    }
}
