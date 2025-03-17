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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListMediaLiveInputSecurityGroupsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.securityGroups = model.securityGroups;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426614174000</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The security groups.</p>
         */
        public Builder securityGroups(java.util.List<SecurityGroups> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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

            private Builder() {
            } 

            private Builder(SecurityGroups model) {
                this.createTime = model.createTime;
                this.inputIds = model.inputIds;
                this.name = model.name;
                this.securityGroupId = model.securityGroupId;
                this.whitelistRules = model.whitelistRules;
            } 

            /**
             * <p>The time when the security group was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-03T06:56:42Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The IDs of the inputs associated with the security group.</p>
             */
            public Builder inputIds(java.util.List<String> inputIds) {
                this.inputIds = inputIds;
                return this;
            }

            /**
             * <p>The security group name.</p>
             * 
             * <strong>example:</strong>
             * <p>mysg</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>SEGK5KA6KYKAWQQH</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The security group rules.</p>
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
