// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSecurityGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSecurityGroupsResponseBody</p>
 */
public class ListSecurityGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityGroups")
    private SecurityGroups securityGroups;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListSecurityGroupsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityGroups = builder.securityGroups;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecurityGroupsResponseBody create() {
        return builder().build();
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
    public SecurityGroups getSecurityGroups() {
        return this.securityGroups;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private SecurityGroups securityGroups; 
        private Integer totalCount; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The security group ID.
         */
        public Builder securityGroups(SecurityGroups securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        /**
         * The number of security groups.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSecurityGroupsResponseBody build() {
            return new ListSecurityGroupsResponseBody(this);
        } 

    } 

    public static class SecurityGroups extends TeaModel {
        @NameInMap("SecurityGroup")
        private java.util.List < String > securityGroup;

        private SecurityGroups(Builder builder) {
            this.securityGroup = builder.securityGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroups create() {
            return builder().build();
        }

        /**
         * @return securityGroup
         */
        public java.util.List < String > getSecurityGroup() {
            return this.securityGroup;
        }

        public static final class Builder {
            private java.util.List < String > securityGroup; 

            /**
             * SecurityGroup.
             */
            public Builder securityGroup(java.util.List < String > securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            public SecurityGroups build() {
                return new SecurityGroups(this);
            } 

        } 

    }
}
