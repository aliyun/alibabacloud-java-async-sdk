// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAppInstanceGroupAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyAppInstanceGroupAttributeRequest</p>
 */
public class ModifyAppInstanceGroupAttributeRequest extends Request {
    @Query
    @NameInMap("AppInstanceGroupId")
    @Validation(required = true)
    private String appInstanceGroupId;

    @Query
    @NameInMap("AppInstanceGroupName")
    private String appInstanceGroupName;

    @Body
    @NameInMap("Network")
    private Network network;

    @Query
    @NameInMap("NodePool")
    private NodePool nodePool;

    @Body
    @NameInMap("PreOpenAppId")
    private String preOpenAppId;

    @Body
    @NameInMap("PreOpenMode")
    private String preOpenMode;

    @Query
    @NameInMap("ProductType")
    @Validation(required = true)
    private String productType;

    @Body
    @NameInMap("SecurityPolicy")
    private SecurityPolicy securityPolicy;

    @Query
    @NameInMap("SessionTimeout")
    @Validation(maximum = 300)
    private Integer sessionTimeout;

    @Body
    @NameInMap("StoragePolicy")
    private StoragePolicy storagePolicy;

    private ModifyAppInstanceGroupAttributeRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.appInstanceGroupName = builder.appInstanceGroupName;
        this.network = builder.network;
        this.nodePool = builder.nodePool;
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
            this.preOpenAppId = request.preOpenAppId;
            this.preOpenMode = request.preOpenMode;
            this.productType = request.productType;
            this.securityPolicy = request.securityPolicy;
            this.sessionTimeout = request.sessionTimeout;
            this.storagePolicy = request.storagePolicy;
        } 

        /**
         * AppInstanceGroupId.
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putQueryParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * AppInstanceGroupName.
         */
        public Builder appInstanceGroupName(String appInstanceGroupName) {
            this.putQueryParameter("AppInstanceGroupName", appInstanceGroupName);
            this.appInstanceGroupName = appInstanceGroupName;
            return this;
        }

        /**
         * Network.
         */
        public Builder network(Network network) {
            String networkShrink = shrink(network, "Network", "json");
            this.putBodyParameter("Network", networkShrink);
            this.network = network;
            return this;
        }

        /**
         * NodePool.
         */
        public Builder nodePool(NodePool nodePool) {
            String nodePoolShrink = shrink(nodePool, "NodePool", "json");
            this.putQueryParameter("NodePool", nodePoolShrink);
            this.nodePool = nodePool;
            return this;
        }

        /**
         * PreOpenAppId.
         */
        public Builder preOpenAppId(String preOpenAppId) {
            this.putBodyParameter("PreOpenAppId", preOpenAppId);
            this.preOpenAppId = preOpenAppId;
            return this;
        }

        /**
         * PreOpenMode.
         */
        public Builder preOpenMode(String preOpenMode) {
            this.putBodyParameter("PreOpenMode", preOpenMode);
            this.preOpenMode = preOpenMode;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * SecurityPolicy.
         */
        public Builder securityPolicy(SecurityPolicy securityPolicy) {
            String securityPolicyShrink = shrink(securityPolicy, "SecurityPolicy", "json");
            this.putBodyParameter("SecurityPolicy", securityPolicyShrink);
            this.securityPolicy = securityPolicy;
            return this;
        }

        /**
         * SessionTimeout.
         */
        public Builder sessionTimeout(Integer sessionTimeout) {
            this.putQueryParameter("SessionTimeout", sessionTimeout);
            this.sessionTimeout = sessionTimeout;
            return this;
        }

        /**
         * StoragePolicy.
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

    public static class DomainRules extends TeaModel {
        @NameInMap("Domain")
        private String domain;

        @NameInMap("Policy")
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

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Policy.
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
    public static class Network extends TeaModel {
        @NameInMap("DomainRules")
        private java.util.List < DomainRules> domainRules;

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
        public java.util.List < DomainRules> getDomainRules() {
            return this.domainRules;
        }

        public static final class Builder {
            private java.util.List < DomainRules> domainRules; 

            /**
             * DomainRules.
             */
            public Builder domainRules(java.util.List < DomainRules> domainRules) {
                this.domainRules = domainRules;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    public static class NodePool extends TeaModel {
        @NameInMap("NodeCapacity")
        private Integer nodeCapacity;

        @NameInMap("NodePoolId")
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

            /**
             * NodeCapacity.
             */
            public Builder nodeCapacity(Integer nodeCapacity) {
                this.nodeCapacity = nodeCapacity;
                return this;
            }

            /**
             * NodePoolId.
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
    public static class SecurityPolicy extends TeaModel {
        @NameInMap("ResetAfterUnbind")
        private Boolean resetAfterUnbind;

        @NameInMap("SkipUserAuthCheck")
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

            /**
             * ResetAfterUnbind.
             */
            public Builder resetAfterUnbind(Boolean resetAfterUnbind) {
                this.resetAfterUnbind = resetAfterUnbind;
                return this;
            }

            /**
             * SkipUserAuthCheck.
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
    public static class StoragePolicy extends TeaModel {
        @NameInMap("StorageTypeList")
        private java.util.List < String > storageTypeList;

        private StoragePolicy(Builder builder) {
            this.storageTypeList = builder.storageTypeList;
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
        public java.util.List < String > getStorageTypeList() {
            return this.storageTypeList;
        }

        public static final class Builder {
            private java.util.List < String > storageTypeList; 

            /**
             * StorageTypeList.
             */
            public Builder storageTypeList(java.util.List < String > storageTypeList) {
                this.storageTypeList = storageTypeList;
                return this;
            }

            public StoragePolicy build() {
                return new StoragePolicy(this);
            } 

        } 

    }
}
