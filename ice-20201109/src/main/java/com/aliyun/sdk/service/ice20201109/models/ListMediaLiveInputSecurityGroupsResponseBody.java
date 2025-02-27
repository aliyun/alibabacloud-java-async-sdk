// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListMediaLiveInputSecurityGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMediaLiveInputSecurityGroupsResponseBody</p>
 */
public class ListMediaLiveInputSecurityGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityGroups")
    private java.util.List<SecurityGroups> securityGroups;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListMediaLiveInputSecurityGroupsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.securityGroups = builder.securityGroups;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMediaLiveInputSecurityGroupsResponseBody create() {
        return builder().build();
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
     * @return securityGroups
     */
    public java.util.List<SecurityGroups> getSecurityGroups() {
        return this.securityGroups;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<SecurityGroups> securityGroups; 
        private Integer totalCount; 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecurityGroups.
         */
        public Builder securityGroups(java.util.List<SecurityGroups> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMediaLiveInputSecurityGroupsResponseBody build() {
            return new ListMediaLiveInputSecurityGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMediaLiveInputSecurityGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaLiveInputSecurityGroupsResponseBody</p>
     */
    public static class SecurityGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("InputIds")
        private java.util.List<String> inputIds;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("WhitelistRules")
        private java.util.List<String> whitelistRules;

        private SecurityGroups(Builder builder) {
            this.createTime = builder.createTime;
            this.inputIds = builder.inputIds;
            this.name = builder.name;
            this.securityGroupId = builder.securityGroupId;
            this.whitelistRules = builder.whitelistRules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroups create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return inputIds
         */
        public java.util.List<String> getInputIds() {
            return this.inputIds;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return whitelistRules
         */
        public java.util.List<String> getWhitelistRules() {
            return this.whitelistRules;
        }

        public static final class Builder {
            private String createTime; 
            private java.util.List<String> inputIds; 
            private String name; 
            private String securityGroupId; 
            private java.util.List<String> whitelistRules; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * InputIds.
             */
            public Builder inputIds(java.util.List<String> inputIds) {
                this.inputIds = inputIds;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * WhitelistRules.
             */
            public Builder whitelistRules(java.util.List<String> whitelistRules) {
                this.whitelistRules = whitelistRules;
                return this;
            }

            public SecurityGroups build() {
                return new SecurityGroups(this);
            } 

        } 

    }
}
