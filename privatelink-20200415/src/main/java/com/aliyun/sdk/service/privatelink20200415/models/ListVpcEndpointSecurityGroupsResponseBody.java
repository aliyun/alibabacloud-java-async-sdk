// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcEndpointSecurityGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcEndpointSecurityGroupsResponseBody</p>
 */
public class ListVpcEndpointSecurityGroupsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityGroups")
    private java.util.List < SecurityGroups> securityGroups;

    private ListVpcEndpointSecurityGroupsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.securityGroups = builder.securityGroups;
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
    public java.util.List < SecurityGroups> getSecurityGroups() {
        return this.securityGroups;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < SecurityGroups> securityGroups; 

        /**
         * The number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If no value is returned for **NextToken**, no next requests are performed.
         * *   If a value is returned for **NextToken**, the value can be used in the next request to retrieve a new page of results.
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
         * The information about the security groups.
         */
        public Builder securityGroups(java.util.List < SecurityGroups> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public ListVpcEndpointSecurityGroupsResponseBody build() {
            return new ListVpcEndpointSecurityGroupsResponseBody(this);
        } 

    } 

    public static class SecurityGroups extends TeaModel {
        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        private SecurityGroups(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
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

        public static final class Builder {
            private String securityGroupId; 

            /**
             * The ID of the security group that is associated with the endpoint.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            public SecurityGroups build() {
                return new SecurityGroups(this);
            } 

        } 

    }
}
