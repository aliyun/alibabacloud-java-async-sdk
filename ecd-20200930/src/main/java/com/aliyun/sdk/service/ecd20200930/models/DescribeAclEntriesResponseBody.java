// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAclEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAclEntriesResponseBody</p>
 */
public class DescribeAclEntriesResponseBody extends TeaModel {
    @NameInMap("AclEntries")
    private java.util.List < AclEntries> aclEntries;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
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
         * The ACL entry.
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
        @NameInMap("Policy")
        private String policy;

        @NameInMap("SourceId")
        private String sourceId;

        @NameInMap("SourceType")
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
             * The ACL policy.
             * <p>
             * 
             * *   **allow**: allows access.
             * *   **drop**: denies access.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * The ID of the instance corresponding to the ACL.
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * The object on which the ACL takes effect.
             * <p>
             * 
             * *   **vpc**: workspace.
             * *   **desktop**: cloud desktop.
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
