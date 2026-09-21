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
         * <p>The delivery group ID.</p>
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
         * <p>The delivery group name.</p>
         * 
         * <strong>example:</strong>
         * <p>OfficeApp</p>
         */
        public Builder appInstanceGroupName(String appInstanceGroupName) {
            this.putQueryParameter("AppInstanceGroupName", appInstanceGroupName);
            this.appInstanceGroupName = appInstanceGroupName;
            return this;
        }

        /**
         * <p>The network configuration.</p>
         * <blockquote>
         * <p>To use this parameter, submit a ticket.</p>
         * </blockquote>
         */
        public Builder network(Network network) {
            String networkShrink = shrink(network, "Network", "json");
            this.putBodyParameter("Network", networkShrink);
            this.network = network;
            return this;
        }

        /**
         * <p>The resource group object.</p>
         */
        public Builder nodePool(NodePool nodePool) {
            String nodePoolShrink = shrink(nodePool, "NodePool", "json");
            this.putQueryParameter("NodePool", nodePoolShrink);
            this.nodePool = nodePool;
            return this;
        }

        /**
         * <p>Specifies whether to allow only one application per session.</p>
         * <ul>
         * <li>If enabled, opening multiple applications within the delivery group allocates a separate session for each application, consuming more sessions.</li>
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
         * <p>The AppId of the pre-open application. If the PreOpenMode parameter is set to <code>SINGLE_APP</code>, PreOpenAppId cannot be an empty string.</p>
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
         * <p>The session retention duration after disconnection, in minutes. After an end user session is disconnected, the session is retained for the duration specified here before being logged off. Set this parameter to <code>-1</code> to retain the session indefinitely. Valid values: -1 and 3 to 300. Default value: <code>15</code>.</p>
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
             * <p>The policy value.</p>
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
             * <p>The domain name rule configurations.</p>
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
             * <p>The number of concurrent sessions, which is the number of sessions that can be simultaneously connected to a single resource. Too many simultaneous sessions may degrade the application experience. The valid value range varies depending on the resource specification. You can call the ListNodeInstanceType operation to obtain the valid value range for each resource specification.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder nodeCapacity(Integer nodeCapacity) {
                this.nodeCapacity = nodeCapacity;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
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
             * <p>Specifies whether to reset after unbinding.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder resetAfterUnbind(Boolean resetAfterUnbind) {
                this.resetAfterUnbind = resetAfterUnbind;
                return this;
            }

            /**
             * <p>Specifies whether to skip user authorization check.</p>
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
             * <p>The user data storage system ID (NAS ID).</p>
             * 
             * <strong>example:</strong>
             * <p>06ae94****</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * <p>Specifies whether to enable user data roaming.</p>
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
             * <p>The file system ID.</p>
             * 
             * <strong>example:</strong>
             * <p>file-0001</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * <p>Specifies whether to enable user data roaming.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
             * <p>The list of storage types.</p>
             */
            public Builder storageTypeList(java.util.List<String> storageTypeList) {
                this.storageTypeList = storageTypeList;
                return this;
            }

            /**
             * <p>The user data roaming configuration.</p>
             */
            public Builder userProfile(UserProfile userProfile) {
                this.userProfile = userProfile;
                return this;
            }

            /**
             * <p>The user data roaming configuration.</p>
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
