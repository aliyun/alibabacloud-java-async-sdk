// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tablestore20201209.models;

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
 * {@link GetAgentStorageResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentStorageResponseBody</p>
 */
public class GetAgentStorageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentStorageDescription")
    private String agentStorageDescription;

    @com.aliyun.core.annotation.NameInMap("AgentStorageName")
    private String agentStorageName;

    @com.aliyun.core.annotation.NameInMap("AgentStorageSpecification")
    private String agentStorageSpecification;

    @com.aliyun.core.annotation.NameInMap("AgentStorageStatus")
    private String agentStorageStatus;

    @com.aliyun.core.annotation.NameInMap("AliasName")
    private String aliasName;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("NetworkSourceACL")
    private java.util.List<String> networkSourceACL;

    @com.aliyun.core.annotation.NameInMap("NetworkTypeACL")
    private java.util.List<String> networkTypeACL;

    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.NameInMap("PolicyVersion")
    private Long policyVersion;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private GetAgentStorageResponseBody(Builder builder) {
        this.agentStorageDescription = builder.agentStorageDescription;
        this.agentStorageName = builder.agentStorageName;
        this.agentStorageSpecification = builder.agentStorageSpecification;
        this.agentStorageStatus = builder.agentStorageStatus;
        this.aliasName = builder.aliasName;
        this.createTime = builder.createTime;
        this.networkSourceACL = builder.networkSourceACL;
        this.networkTypeACL = builder.networkTypeACL;
        this.policy = builder.policy;
        this.policyVersion = builder.policyVersion;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentStorageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentStorageDescription
     */
    public String getAgentStorageDescription() {
        return this.agentStorageDescription;
    }

    /**
     * @return agentStorageName
     */
    public String getAgentStorageName() {
        return this.agentStorageName;
    }

    /**
     * @return agentStorageSpecification
     */
    public String getAgentStorageSpecification() {
        return this.agentStorageSpecification;
    }

    /**
     * @return agentStorageStatus
     */
    public String getAgentStorageStatus() {
        return this.agentStorageStatus;
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return networkSourceACL
     */
    public java.util.List<String> getNetworkSourceACL() {
        return this.networkSourceACL;
    }

    /**
     * @return networkTypeACL
     */
    public java.util.List<String> getNetworkTypeACL() {
        return this.networkTypeACL;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return policyVersion
     */
    public Long getPolicyVersion() {
        return this.policyVersion;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String agentStorageDescription; 
        private String agentStorageName; 
        private String agentStorageSpecification; 
        private String agentStorageStatus; 
        private String aliasName; 
        private String createTime; 
        private java.util.List<String> networkSourceACL; 
        private java.util.List<String> networkTypeACL; 
        private String policy; 
        private Long policyVersion; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private java.util.List<Tags> tags; 
        private String userId; 

        private Builder() {
        } 

        private Builder(GetAgentStorageResponseBody model) {
            this.agentStorageDescription = model.agentStorageDescription;
            this.agentStorageName = model.agentStorageName;
            this.agentStorageSpecification = model.agentStorageSpecification;
            this.agentStorageStatus = model.agentStorageStatus;
            this.aliasName = model.aliasName;
            this.createTime = model.createTime;
            this.networkSourceACL = model.networkSourceACL;
            this.networkTypeACL = model.networkTypeACL;
            this.policy = model.policy;
            this.policyVersion = model.policyVersion;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.tags = model.tags;
            this.userId = model.userId;
        } 

        /**
         * <p>agent storage description</p>
         * 
         * <strong>example:</strong>
         * <p>description for agent storage</p>
         */
        public Builder agentStorageDescription(String agentStorageDescription) {
            this.agentStorageDescription = agentStorageDescription;
            return this;
        }

        /**
         * <p>agent storage name</p>
         * 
         * <strong>example:</strong>
         * <p>agent-test</p>
         */
        public Builder agentStorageName(String agentStorageName) {
            this.agentStorageName = agentStorageName;
            return this;
        }

        /**
         * AgentStorageSpecification.
         */
        public Builder agentStorageSpecification(String agentStorageSpecification) {
            this.agentStorageSpecification = agentStorageSpecification;
            return this;
        }

        /**
         * AgentStorageStatus.
         */
        public Builder agentStorageStatus(String agentStorageStatus) {
            this.agentStorageStatus = agentStorageStatus;
            return this;
        }

        /**
         * AliasName.
         */
        public Builder aliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * NetworkSourceACL.
         */
        public Builder networkSourceACL(java.util.List<String> networkSourceACL) {
            this.networkSourceACL = networkSourceACL;
            return this;
        }

        /**
         * NetworkTypeACL.
         */
        public Builder networkTypeACL(java.util.List<String> networkTypeACL) {
            this.networkTypeACL = networkTypeACL;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * PolicyVersion.
         */
        public Builder policyVersion(Long policyVersion) {
            this.policyVersion = policyVersion;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3104C83E-6E82-57FB-BB88-8C64CCFDEF89</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * Tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public GetAgentStorageResponseBody build() {
            return new GetAgentStorageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentStorageResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentStorageResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String tagKey; 
            private String tagValue; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
