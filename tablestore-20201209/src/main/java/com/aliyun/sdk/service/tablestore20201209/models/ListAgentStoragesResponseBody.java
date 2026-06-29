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
 * {@link ListAgentStoragesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentStoragesResponseBody</p>
 */
public class ListAgentStoragesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentStorages")
    private java.util.List<AgentStorages> agentStorages;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListAgentStoragesResponseBody(Builder builder) {
        this.agentStorages = builder.agentStorages;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentStoragesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentStorages
     */
    public java.util.List<AgentStorages> getAgentStorages() {
        return this.agentStorages;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<AgentStorages> agentStorages; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListAgentStoragesResponseBody model) {
            this.agentStorages = model.agentStorages;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * AgentStorages.
         */
        public Builder agentStorages(java.util.List<AgentStorages> agentStorages) {
            this.agentStorages = agentStorages;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>39871ED2-62C0-578F-A32E-B88072D5582F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAgentStoragesResponseBody build() {
            return new ListAgentStoragesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAgentStoragesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentStoragesResponseBody</p>
     */
    public static class AgentStorages extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private AgentStorages(Builder builder) {
            this.agentStorageDescription = builder.agentStorageDescription;
            this.agentStorageName = builder.agentStorageName;
            this.agentStorageSpecification = builder.agentStorageSpecification;
            this.agentStorageStatus = builder.agentStorageStatus;
            this.aliasName = builder.aliasName;
            this.createTime = builder.createTime;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentStorages create() {
            return builder().build();
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
            private String regionId; 
            private String resourceGroupId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(AgentStorages model) {
                this.agentStorageDescription = model.agentStorageDescription;
                this.agentStorageName = model.agentStorageName;
                this.agentStorageSpecification = model.agentStorageSpecification;
                this.agentStorageStatus = model.agentStorageStatus;
                this.aliasName = model.aliasName;
                this.createTime = model.createTime;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
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
             * AgentStorageName.
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
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public AgentStorages build() {
                return new AgentStorages(this);
            } 

        } 

    }
}
