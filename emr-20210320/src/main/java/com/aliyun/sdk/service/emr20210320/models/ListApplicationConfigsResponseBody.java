// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationConfigsResponseBody</p>
 */
public class ListApplicationConfigsResponseBody extends TeaModel {
    @NameInMap("ApplicationConfigs")
    private java.util.List < ApplicationConfigs> applicationConfigs;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListApplicationConfigsResponseBody(Builder builder) {
        this.applicationConfigs = builder.applicationConfigs;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return applicationConfigs
     */
    public java.util.List < ApplicationConfigs> getApplicationConfigs() {
        return this.applicationConfigs;
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
        private java.util.List < ApplicationConfigs> applicationConfigs; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The application configurations.
         */
        public Builder applicationConfigs(java.util.List < ApplicationConfigs> applicationConfigs) {
            this.applicationConfigs = applicationConfigs;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The page number of the next page returned.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of pages.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApplicationConfigsResponseBody build() {
            return new ListApplicationConfigsResponseBody(this);
        } 

    } 

    public static class ApplicationConfigs extends TeaModel {
        @NameInMap("ApplicationName")
        private String applicationName;

        @NameInMap("ConfigEffectState")
        private String configEffectState;

        @NameInMap("ConfigFileName")
        private String configFileName;

        @NameInMap("ConfigItemKey")
        private String configItemKey;

        @NameInMap("ConfigItemValue")
        private String configItemValue;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Custom")
        private Boolean custom;

        @NameInMap("Description")
        private String description;

        @NameInMap("InitValue")
        private String initValue;

        @NameInMap("Modifier")
        private String modifier;

        @NameInMap("NodeGroupId")
        private String nodeGroupId;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private ApplicationConfigs(Builder builder) {
            this.applicationName = builder.applicationName;
            this.configEffectState = builder.configEffectState;
            this.configFileName = builder.configFileName;
            this.configItemKey = builder.configItemKey;
            this.configItemValue = builder.configItemValue;
            this.createTime = builder.createTime;
            this.custom = builder.custom;
            this.description = builder.description;
            this.initValue = builder.initValue;
            this.modifier = builder.modifier;
            this.nodeGroupId = builder.nodeGroupId;
            this.nodeId = builder.nodeId;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationConfigs create() {
            return builder().build();
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return configEffectState
         */
        public String getConfigEffectState() {
            return this.configEffectState;
        }

        /**
         * @return configFileName
         */
        public String getConfigFileName() {
            return this.configFileName;
        }

        /**
         * @return configItemKey
         */
        public String getConfigItemKey() {
            return this.configItemKey;
        }

        /**
         * @return configItemValue
         */
        public String getConfigItemValue() {
            return this.configItemValue;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return custom
         */
        public Boolean getCustom() {
            return this.custom;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return initValue
         */
        public String getInitValue() {
            return this.initValue;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return nodeGroupId
         */
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String applicationName; 
            private String configEffectState; 
            private String configFileName; 
            private String configItemKey; 
            private String configItemValue; 
            private Long createTime; 
            private Boolean custom; 
            private String description; 
            private String initValue; 
            private String modifier; 
            private String nodeGroupId; 
            private String nodeId; 
            private Long updateTime; 

            /**
             * The name of the application.
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * The status of the configuration value.
             */
            public Builder configEffectState(String configEffectState) {
                this.configEffectState = configEffectState;
                return this;
            }

            /**
             * The name of the configuration file.
             */
            public Builder configFileName(String configFileName) {
                this.configFileName = configFileName;
                return this;
            }

            /**
             * The name of the configuration item.
             */
            public Builder configItemKey(String configItemKey) {
                this.configItemKey = configItemKey;
                return this;
            }

            /**
             * The value of the configuration item.
             */
            public Builder configItemValue(String configItemValue) {
                this.configItemValue = configItemValue;
                return this;
            }

            /**
             * The time when the application was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Indicates whether the configurations are custom.
             */
            public Builder custom(Boolean custom) {
                this.custom = custom;
                return this;
            }

            /**
             * The description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The initial value.
             */
            public Builder initValue(String initValue) {
                this.initValue = initValue;
                return this;
            }

            /**
             * The person who modified the configurations.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * The ID of the node group.
             */
            public Builder nodeGroupId(String nodeGroupId) {
                this.nodeGroupId = nodeGroupId;
                return this;
            }

            /**
             * The node ID.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The time when the application was updated.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ApplicationConfigs build() {
                return new ApplicationConfigs(this);
            } 

        } 

    }
}
