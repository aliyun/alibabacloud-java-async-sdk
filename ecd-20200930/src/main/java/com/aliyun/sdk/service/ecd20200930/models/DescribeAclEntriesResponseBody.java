// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAclEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAclEntriesResponseBody</p>
 */
public class DescribeAclEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AclEntries")
    private java.util.List < AclEntries> aclEntries;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAclEntriesResponseBody(Builder builder) {
        this.aclEntries = builder.aclEntries;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAclEntriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return aclEntries
     */
    public java.util.List < AclEntries> getAclEntries() {
        return this.aclEntries;
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

    public static final class Builder {
        private java.util.List < AclEntries> aclEntries; 
        private String nextToken; 
        private String requestId; 

        /**
         * The ACL entries.
         */
        public Builder aclEntries(java.util.List < AclEntries> aclEntries) {
            this.aclEntries = aclEntries;
            return this;
        }

        /**
         * The token that is used to start the next query. If the value of this parameter is empty, all results are returned.
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

        public DescribeAclEntriesResponseBody build() {
            return new DescribeAclEntriesResponseBody(this);
        } 

    } 

    public static class AclEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("SourceId")
        private String sourceId;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        private AclEntries(Builder builder) {
            this.policy = builder.policy;
            this.sourceId = builder.sourceId;
            this.sourceType = builder.sourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclEntries create() {
            return builder().build();
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private String policy; 
            private String sourceId; 
            private String sourceType; 

            /**
             * The ACL type.
             * <p>
             * 
             * Valid values:
             * 
             * *   allow: whitelist
             * *   disable: blacklist
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * The ID of the instance to which the ACL applies, such as an office network ID or a cloud computer ID.
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * The granularity of the ACL.
             * <p>
             * 
             * Valid values:
             * 
             * *   desktop: cloud computer
             * *   vpc: office network
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public AclEntries build() {
                return new AclEntries(this);
            } 

        } 

    }
}
