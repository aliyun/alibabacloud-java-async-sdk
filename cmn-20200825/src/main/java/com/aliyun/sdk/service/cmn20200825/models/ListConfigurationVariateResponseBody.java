// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConfigurationVariateResponseBody} extends {@link TeaModel}
 *
 * <p>ListConfigurationVariateResponseBody</p>
 */
public class ListConfigurationVariateResponseBody extends TeaModel {
    @NameInMap("ConfigurationVariate")
    private java.util.List < ConfigurationVariate> configurationVariate;

    @NameInMap("MaxResults")
    private Long maxResults;

    @NameInMap("NextToken")
    private Integer nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListConfigurationVariateResponseBody(Builder builder) {
        this.configurationVariate = builder.configurationVariate;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConfigurationVariateResponseBody create() {
        return builder().build();
    }

    /**
     * @return configurationVariate
     */
    public java.util.List < ConfigurationVariate> getConfigurationVariate() {
        return this.configurationVariate;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public Integer getNextToken() {
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
        private java.util.List < ConfigurationVariate> configurationVariate; 
        private Long maxResults; 
        private Integer nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ConfigurationVariate.
         */
        public Builder configurationVariate(java.util.List < ConfigurationVariate> configurationVariate) {
            this.configurationVariate = configurationVariate;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(Integer nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListConfigurationVariateResponseBody build() {
            return new ListConfigurationVariateResponseBody(this);
        } 

    } 

    public static class ConfigurationVariate extends TeaModel {
        @NameInMap("Comment")
        private String comment;

        @NameInMap("ConfigurationVariateId")
        private String configurationVariateId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("FormatFunction")
        private String formatFunction;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("VariateName")
        private String variateName;

        private ConfigurationVariate(Builder builder) {
            this.comment = builder.comment;
            this.configurationVariateId = builder.configurationVariateId;
            this.createTime = builder.createTime;
            this.formatFunction = builder.formatFunction;
            this.updateTime = builder.updateTime;
            this.variateName = builder.variateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigurationVariate create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return configurationVariateId
         */
        public String getConfigurationVariateId() {
            return this.configurationVariateId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return formatFunction
         */
        public String getFormatFunction() {
            return this.formatFunction;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return variateName
         */
        public String getVariateName() {
            return this.variateName;
        }

        public static final class Builder {
            private String comment; 
            private String configurationVariateId; 
            private String createTime; 
            private String formatFunction; 
            private String updateTime; 
            private String variateName; 

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * ConfigurationVariateId.
             */
            public Builder configurationVariateId(String configurationVariateId) {
                this.configurationVariateId = configurationVariateId;
                return this;
            }

            /**
             * 代表创建时间的资源属性字段
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * FormatFunction.
             */
            public Builder formatFunction(String formatFunction) {
                this.formatFunction = formatFunction;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * VariateName.
             */
            public Builder variateName(String variateName) {
                this.variateName = variateName;
                return this;
            }

            public ConfigurationVariate build() {
                return new ConfigurationVariate(this);
            } 

        } 

    }
}
