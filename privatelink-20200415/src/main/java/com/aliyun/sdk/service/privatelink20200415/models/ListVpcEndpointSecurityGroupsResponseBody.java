// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

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
 * {@link ListVpcEndpointSecurityGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcEndpointSecurityGroupsResponseBody</p>
 */
public class ListVpcEndpointSecurityGroupsResponseBody extends TeaModel {
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

    private ListVpcEndpointSecurityGroupsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.securityGroups = builder.securityGroups;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcEndpointSecurityGroupsResponseBody create() {
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
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If no value is returned for <strong>NextToken</strong>, no next requests are performed.</li>
         * <li>If a value is returned for <strong>NextToken</strong>, the value can be used in the next request to retrieve a new page of results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the security groups.</p>
         */
        public Builder securityGroups(java.util.List<SecurityGroups> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListVpcEndpointSecurityGroupsResponseBody build() {
            return new ListVpcEndpointSecurityGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVpcEndpointSecurityGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcEndpointSecurityGroupsResponseBody</p>
     */
    public static class SecurityGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupStatus")
        private String securityGroupStatus;

        private SecurityGroups(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupStatus = builder.securityGroupStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroups create() {
            return builder().build();
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return securityGroupStatus
         */
        public String getSecurityGroupStatus() {
            return this.securityGroupStatus;
        }

        public static final class Builder {
            private String securityGroupId; 
            private String securityGroupStatus; 

            /**
             * <p>The ID of the security group that is associated with the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-hp33bw6ynvm2yb0e****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The associate status of the security group, valid values:</p>
             * <ul>
             * <li>Attaching: The security group is being attached.</li>
             * <li>Attached: The security group is attached.</li>
             * <li>Detaching: The security group is being detached.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Attached</p>
             */
            public Builder securityGroupStatus(String securityGroupStatus) {
                this.securityGroupStatus = securityGroupStatus;
                return this;
            }

            public SecurityGroups build() {
                return new SecurityGroups(this);
            } 

        } 

    }
}
