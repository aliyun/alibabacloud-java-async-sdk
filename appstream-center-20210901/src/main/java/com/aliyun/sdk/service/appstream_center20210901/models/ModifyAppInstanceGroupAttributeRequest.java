// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ModifyAppInstanceGroupAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyAppInstanceGroupAttributeRequest</p>
 */
public class ModifyAppInstanceGroupAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appInstanceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupName")
    private String appInstanceGroupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Network")
    private Network network;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodePool")
    private NodePool nodePool;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PerSessionPerApp")
    private Boolean perSessionPerApp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PreOpenAppId")
    private String preOpenAppId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PreOpenMode")
    private String preOpenMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecurityPolicy")
    private SecurityPolicy securityPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 300)
    private Integer sessionTimeout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoragePolicy")
    private StoragePolicy storagePolicy;

    private ModifyAppInstanceGroupAttributeRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.appInstanceGroupName = builder.appInstanceGroupName;
        this.network = builder.network;
        this.nodePool = builder.nodePool;
        this.perSessionPerApp = builder.perSessionPerApp;
        this.preOpenAppId = builder.preOpenAppId;
        this.preOpenMode = builder.preOpenMode;
        this.productType = builder.productType;
        this.securityPolicy = builder.securityPolicy;
        this.sessionTimeout = builder.sessionTimeout;
        this.storagePolicy = builder.storagePolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAppInstanceGroupAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return appInstanceGroupName
     */
    public String getAppInstanceGroupName() {
        return this.appInstanceGroupName;
    }

    /**
     * @return network
     */
    public Network getNetwork() {
        return this.network;
    }

    /**
     * @return nodePool
     */
    public NodePool getNodePool() {
        return this.nodePool;
    }

    /**
     * @return perSessionPerApp
     */
    public Boolean getPerSessionPerApp() {
        return this.perSessionPerApp;
    }

    /**
     * @return preOpenAppId
     */
    public String getPreOpenAppId() {
        return this.preOpenAppId;
    }

    /**
     * @return preOpenMode
     */
    public String getPreOpenMode() {
        return this.preOpenMode;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return securityPolicy
     */
    public SecurityPolicy getSecurityPolicy() {
        return this.securityPolicy;
    }

    /**
     * @return sessionTimeout
     */
    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    /**
     * @return storagePolicy
     */
    public StoragePolicy getStoragePolicy() {
        return this.storagePolicy;
    }

    public static final class Builder extends Request.Builder<ModifyAppInstanceGroupAttributeRequest, Builder> {
        private String appInstanceGroupId; 
        private String appInstanceGroupName; 
        private Network network; 
        private NodePool nodePool; 
        private Boolean perSessionPerApp; 
        private String preOpenAppId; 
        private String preOpenMode; 
        private String productType; 
        private SecurityPolicy securityPolicy; 
        private Integer sessionTimeout; 
        private StoragePolicy storagePolicy; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAppInstanceGroupAttributeRequest request) {
            super(request);
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.appInstanceGroupName = request.appInstanceGroupName;
            this.network = request.network;
            this.nodePool = request.nodePool;
            this.perSessionPerApp = request.perSessionPerApp;
            this.preOpenAppId = request.preOpenAppId;
            this.preOpenMode = request.preOpenMode;
            this.productType = request.productType;
            this.securityPolicy = request.securityPolicy;
            this.sessionTimeout = request.sessionTimeout;
            this.storagePolicy = request.storagePolicy;
        } 

        /**
         * <p>The ID of the delivery group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-9ciijz60n4xsv****</p>
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putQueryParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * <p>The name of the delivery group.</p>
         */
        public Builder appInstanceGroupName(String appInstanceGroupName) {
            this.putQueryParameter("AppInstanceGroupName", appInstanceGroupName);
            this.appInstanceGroupName = appInstanceGroupName;
            return this;
        }

        /**
         * <p>The network settings.</p>
         * <blockquote>
         * <p> If you want to use this parameter, submit a ticket.</p>
         * </blockquote>
         */
        public Builder network(Network network) {
            String networkShrink = shrink(network, "Network", "json");
            this.putBodyParameter("Network", networkShrink);
            this.network = network;
            return this;
        }

        /**
         * <p>The information about the resource group.</p>
         */
        public Builder nodePool(NodePool nodePool) {
            String nodePoolShrink = shrink(nodePool, "NodePool", "json");
            this.putQueryParameter("NodePool", nodePoolShrink);
            this.nodePool = nodePool;
            return this;
        }

        /**
         * <p>Specifies whether only one application can be opened in a session.</p>
         * <ul>
         * <li>After you enable this feature, the system assigns a session to each application if you open multiple applications in a delivery group. This consumes a larger number of sessions.</li>
         * </ul>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder perSessionPerApp(Boolean perSessionPerApp) {
            this.putBodyParameter("PerSessionPerApp", perSessionPerApp);
            this.perSessionPerApp = perSessionPerApp;
            return this;
        }

        /**
         * <p>The application ID of the pre-open application. If you set <code>PreOpenMode</code> to <code>SINGLE_APP</code>, you cannot leave this parameter empty.``</p>
         * 
         * <strong>example:</strong>
         * <p>ca-b2ronxxd****</p>
         */
        public Builder preOpenAppId(String preOpenAppId) {
            this.putBodyParameter("PreOpenAppId", preOpenAppId);
            this.preOpenAppId = preOpenAppId;
            return this;
        }

        /**
         * <p>The pre-open mode.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>SINGLE_APP: enables the pre-open mode for a single application.</li>
         * <li>OFF: disables the pre-open mode. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OFF</p>
         */
        public Builder preOpenMode(String preOpenMode) {
            this.putBodyParameter("PreOpenMode", preOpenMode);
            this.preOpenMode = preOpenMode;
            return this;
        }

        /**
         * <p>The product type.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>CloudApp: App Streaming</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The security policy.</p>
         */
        public Builder securityPolicy(SecurityPolicy securityPolicy) {
            String securityPolicyShrink = shrink(securityPolicy, "SecurityPolicy", "json");
            this.putBodyParameter("SecurityPolicy", securityPolicyShrink);
            this.securityPolicy = securityPolicy;
            return this;
        }

        /**
         * <p>The duration for which sessions are retained after disconnection. Unit: minutes. After an end user disconnects from a session, the session is closed only after the specified duration elapses. If you want to permanently retain sessions, set this parameter to <code>-1</code>. Valid values:-1 and 3 to 300. Default value: <code>15</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder sessionTimeout(Integer sessionTimeout) {
            this.putQueryParameter("SessionTimeout", sessionTimeout);
            this.sessionTimeout = sessionTimeout;
            return this;
        }

        /**
         * <p>The storage policy.</p>
         */
        public Builder storagePolicy(StoragePolicy storagePolicy) {
            String storagePolicyShrink = shrink(storagePolicy, "StoragePolicy", "json");
            this.putBodyParameter("StoragePolicy", storagePolicyShrink);
            this.storagePolicy = storagePolicy;
            return this;
        }

        @Override
        public ModifyAppInstanceGroupAttributeRequest build() {
            return new ModifyAppInstanceGroupAttributeRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyAppInstanceGroupAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyAppInstanceGroupAttributeRequest</p>
     */
    public static class DomainRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        private DomainRules(Builder builder) {
            this.domain = builder.domain;
            this.policy = builder.policy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainRules create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        public static final class Builder {
            private String domain; 
            private String policy; 

            private Builder() {
            } 

            private Builder(DomainRules model) {
                this.domain = model.domain;
                this.policy = model.policy;
            } 

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The policy used for the domain name.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>allow</li>
             * <li>block</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>block</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            public DomainRules build() {
                return new DomainRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyAppInstanceGroupAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyAppInstanceGroupAttributeRequest</p>
     */
    public static class Network extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainRules")
        private java.util.List<DomainRules> domainRules;

        private Network(Builder builder) {
            this.domainRules = builder.domainRules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Network create() {
            return builder().build();
        }

        /**
         * @return domainRules
         */
        public java.util.List<DomainRules> getDomainRules() {
            return this.domainRules;
        }

        public static final class Builder {
            private java.util.List<DomainRules> domainRules; 

            private Builder() {
            } 

            private Builder(Network model) {
                this.domainRules = model.domainRules;
            } 

            /**
             * <p>The domain name rules.</p>
             */
            public Builder domainRules(java.util.List<DomainRules> domainRules) {
                this.domainRules = domainRules;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyAppInstanceGroupAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyAppInstanceGroupAttributeRequest</p>
     */
    public static class NodePool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeCapacity")
        private Integer nodeCapacity;

        @com.aliyun.core.annotation.NameInMap("NodePoolId")
        private String nodePoolId;

        private NodePool(Builder builder) {
            this.nodeCapacity = builder.nodeCapacity;
            this.nodePoolId = builder.nodePoolId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodePool create() {
            return builder().build();
        }

        /**
         * @return nodeCapacity
         */
        public Integer getNodeCapacity() {
            return this.nodeCapacity;
        }

        /**
         * @return nodePoolId
         */
        public String getNodePoolId() {
            return this.nodePoolId;
        }

        public static final class Builder {
            private Integer nodeCapacity; 
            private String nodePoolId; 

            private Builder() {
            } 

            private Builder(NodePool model) {
                this.nodeCapacity = model.nodeCapacity;
                this.nodePoolId = model.nodePoolId;
            } 

            /**
             * <p>The maximum number of sessions to which a resource can connect at the same time. If a resource connects to a large number of sessions at the same time, user experience can be compromised. The value range varies based on the resource type. The following items describe the value ranges of different resource types:</p>
             * <ul>
             * <li>appstreaming.general.4c8g: 1 to 2</li>
             * <li>appstreaming.general.8c16g: 1 to 4</li>
             * <li>appstreaming.vgpu.8c16g.4g: 1 to 4</li>
             * <li>appstreaming.vgpu.8c31g.16g: 1 to 4</li>
             * <li>appstreaming.vgpu.14c93g.12g: 1 to 6</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder nodeCapacity(Integer nodeCapacity) {
                this.nodeCapacity = nodeCapacity;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-ew7va2g1wl3vm****</p>
             */
            public Builder nodePoolId(String nodePoolId) {
                this.nodePoolId = nodePoolId;
                return this;
            }

            public NodePool build() {
                return new NodePool(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyAppInstanceGroupAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyAppInstanceGroupAttributeRequest</p>
     */
    public static class SecurityPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResetAfterUnbind")
        private Boolean resetAfterUnbind;

        @com.aliyun.core.annotation.NameInMap("SkipUserAuthCheck")
        private Boolean skipUserAuthCheck;

        private SecurityPolicy(Builder builder) {
            this.resetAfterUnbind = builder.resetAfterUnbind;
            this.skipUserAuthCheck = builder.skipUserAuthCheck;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityPolicy create() {
            return builder().build();
        }

        /**
         * @return resetAfterUnbind
         */
        public Boolean getResetAfterUnbind() {
            return this.resetAfterUnbind;
        }

        /**
         * @return skipUserAuthCheck
         */
        public Boolean getSkipUserAuthCheck() {
            return this.skipUserAuthCheck;
        }

        public static final class Builder {
            private Boolean resetAfterUnbind; 
            private Boolean skipUserAuthCheck; 

            private Builder() {
            } 

            private Builder(SecurityPolicy model) {
                this.resetAfterUnbind = model.resetAfterUnbind;
                this.skipUserAuthCheck = model.skipUserAuthCheck;
            } 

            /**
             * <p>Specifies whether to reset after unbinding from a delivery group.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder resetAfterUnbind(Boolean resetAfterUnbind) {
                this.resetAfterUnbind = resetAfterUnbind;
                return this;
            }

            /**
             * <p>Specifies whether to skip user permission verification.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false: This is the default value.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder skipUserAuthCheck(Boolean skipUserAuthCheck) {
                this.skipUserAuthCheck = skipUserAuthCheck;
                return this;
            }

            public SecurityPolicy build() {
                return new SecurityPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyAppInstanceGroupAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyAppInstanceGroupAttributeRequest</p>
     */
    public static class UserProfile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("UserProfileSwitch")
        private Boolean userProfileSwitch;

        private UserProfile(Builder builder) {
            this.fileSystemId = builder.fileSystemId;
            this.userProfileSwitch = builder.userProfileSwitch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserProfile create() {
            return builder().build();
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return userProfileSwitch
         */
        public Boolean getUserProfileSwitch() {
            return this.userProfileSwitch;
        }

        public static final class Builder {
            private String fileSystemId; 
            private Boolean userProfileSwitch; 

            private Builder() {
            } 

            private Builder(UserProfile model) {
                this.fileSystemId = model.fileSystemId;
                this.userProfileSwitch = model.userProfileSwitch;
            } 

            /**
             * <p>The ID of the File Storage NAS (NAS) file system used to store user data.</p>
             * 
             * <strong>example:</strong>
             * <p>06ae94****</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * <p>Specifies whether user data roaming is enabled.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder userProfileSwitch(Boolean userProfileSwitch) {
                this.userProfileSwitch = userProfileSwitch;
                return this;
            }

            public UserProfile build() {
                return new UserProfile(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyAppInstanceGroupAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyAppInstanceGroupAttributeRequest</p>
     */
    public static class UserProfileFollow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("ProfileFollowSwitch")
        private Boolean profileFollowSwitch;

        private UserProfileFollow(Builder builder) {
            this.fileSystemId = builder.fileSystemId;
            this.profileFollowSwitch = builder.profileFollowSwitch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserProfileFollow create() {
            return builder().build();
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return profileFollowSwitch
         */
        public Boolean getProfileFollowSwitch() {
            return this.profileFollowSwitch;
        }

        public static final class Builder {
            private String fileSystemId; 
            private Boolean profileFollowSwitch; 

            private Builder() {
            } 

            private Builder(UserProfileFollow model) {
                this.fileSystemId = model.fileSystemId;
                this.profileFollowSwitch = model.profileFollowSwitch;
            } 

            /**
             * <p>The ID of the File Storage NAS (NAS) file system used to store user data.</p>
             * 
             * <strong>example:</strong>
             * <p>06ae94****</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * ProfileFollowSwitch.
             */
            public Builder profileFollowSwitch(Boolean profileFollowSwitch) {
                this.profileFollowSwitch = profileFollowSwitch;
                return this;
            }

            public UserProfileFollow build() {
                return new UserProfileFollow(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyAppInstanceGroupAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyAppInstanceGroupAttributeRequest</p>
     */
    public static class StoragePolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StorageTypeList")
        private java.util.List<String> storageTypeList;

        @com.aliyun.core.annotation.NameInMap("UserProfile")
        private UserProfile userProfile;

        @com.aliyun.core.annotation.NameInMap("UserProfileFollow")
        private UserProfileFollow userProfileFollow;

        private StoragePolicy(Builder builder) {
            this.storageTypeList = builder.storageTypeList;
            this.userProfile = builder.userProfile;
            this.userProfileFollow = builder.userProfileFollow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StoragePolicy create() {
            return builder().build();
        }

        /**
         * @return storageTypeList
         */
        public java.util.List<String> getStorageTypeList() {
            return this.storageTypeList;
        }

        /**
         * @return userProfile
         */
        public UserProfile getUserProfile() {
            return this.userProfile;
        }

        /**
         * @return userProfileFollow
         */
        public UserProfileFollow getUserProfileFollow() {
            return this.userProfileFollow;
        }

        public static final class Builder {
            private java.util.List<String> storageTypeList; 
            private UserProfile userProfile; 
            private UserProfileFollow userProfileFollow; 

            private Builder() {
            } 

            private Builder(StoragePolicy model) {
                this.storageTypeList = model.storageTypeList;
                this.userProfile = model.userProfile;
                this.userProfileFollow = model.userProfileFollow;
            } 

            /**
             * <p>The storage types.</p>
             */
            public Builder storageTypeList(java.util.List<String> storageTypeList) {
                this.storageTypeList = storageTypeList;
                return this;
            }

            /**
             * <p>The configurations of user data roaming.</p>
             */
            public Builder userProfile(UserProfile userProfile) {
                this.userProfile = userProfile;
                return this;
            }

            /**
             * UserProfileFollow.
             */
            public Builder userProfileFollow(UserProfileFollow userProfileFollow) {
                this.userProfileFollow = userProfileFollow;
                return this;
            }

            public StoragePolicy build() {
                return new StoragePolicy(this);
            } 

        } 

    }
}
