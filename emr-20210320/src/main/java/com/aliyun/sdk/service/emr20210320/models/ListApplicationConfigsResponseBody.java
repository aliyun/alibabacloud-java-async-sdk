// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link ListApplicationConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationConfigsResponseBody</p>
 */
public class ListApplicationConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationConfigs")
    private java.util.List<ApplicationConfigs> applicationConfigs;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<ApplicationConfigs> getApplicationConfigs() {
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
        private java.util.List<ApplicationConfigs> applicationConfigs; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The application configurations.</p>
         */
        public Builder applicationConfigs(java.util.List<ApplicationConfigs> applicationConfigs) {
            this.applicationConfigs = applicationConfigs;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The page number of the next page returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9E3A7161-EB7B-172B-8D18-FFB06BA3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApplicationConfigsResponseBody build() {
            return new ListApplicationConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationConfigsResponseBody</p>
     */
    public static class ApplicationConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("ConfigEffectState")
        private String configEffectState;

        @com.aliyun.core.annotation.NameInMap("ConfigFileName")
        private String configFileName;

        @com.aliyun.core.annotation.NameInMap("ConfigItemKey")
        private String configItemKey;

        @com.aliyun.core.annotation.NameInMap("ConfigItemValue")
        private String configItemValue;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Custom")
        private Boolean custom;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InitValue")
        private String initValue;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("NodeGroupId")
        private String nodeGroupId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>HDFS</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * <p>The status of the configuration value.</p>
             * 
             * <strong>example:</strong>
             * <p>EFFECT</p>
             */
            public Builder configEffectState(String configEffectState) {
                this.configEffectState = configEffectState;
                return this;
            }

            /**
             * <p>The name of the configuration file.</p>
             * 
             * <strong>example:</strong>
             * <p>hdfs-site.xml</p>
             */
            public Builder configFileName(String configFileName) {
                this.configFileName = configFileName;
                return this;
            }

            /**
             * <p>The key of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>dfs.replication</p>
             */
            public Builder configItemKey(String configItemKey) {
                this.configItemKey = configItemKey;
                return this;
            }

            /**
             * <p>The value of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder configItemValue(String configItemValue) {
                this.configItemValue = configItemValue;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1628589439114</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether the configurations are custom.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder custom(Boolean custom) {
                this.custom = custom;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>dfs.replication description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The initial value.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder initValue(String initValue) {
                this.initValue = initValue;
                return this;
            }

            /**
             * <p>The person who modified the configurations.</p>
             * 
             * <strong>example:</strong>
             * <p>170906468757****</p>
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * <p>The node group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ng-d555335ced5****</p>
             */
            public Builder nodeGroupId(String nodeGroupId) {
                this.nodeGroupId = nodeGroupId;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp18y0ng3qqxog4mw****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>1628589439114</p>
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
