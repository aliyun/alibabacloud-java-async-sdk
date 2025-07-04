// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link ListAclEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAclEntriesResponseBody</p>
 */
public class ListAclEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AclEntries")
    private java.util.List<AclEntries> aclEntries;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListAclEntriesResponseBody(Builder builder) {
        this.aclEntries = builder.aclEntries;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAclEntriesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclEntries
     */
    public java.util.List<AclEntries> getAclEntries() {
        return this.aclEntries;
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
        private java.util.List<AclEntries> aclEntries; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListAclEntriesResponseBody model) {
            this.aclEntries = model.aclEntries;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The ACL entries.</p>
         */
        public Builder aclEntries(java.util.List<AclEntries> aclEntries) {
            this.aclEntries = aclEntries;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value is returned for <strong>NextToken</strong>, the value is the token that determines the start point of the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAclEntriesResponseBody build() {
            return new ListAclEntriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAclEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAclEntriesResponseBody</p>
     */
    public static class AclEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Entry")
        private String entry;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private AclEntries(Builder builder) {
            this.description = builder.description;
            this.entry = builder.entry;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclEntries create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return entry
         */
        public String getEntry() {
            return this.entry;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String description; 
            private String entry; 
            private String status; 

            private Builder() {
            } 

            private Builder(AclEntries model) {
                this.description = model.description;
                this.entry = model.entry;
                this.status = model.status;
            } 

            /**
             * <p>The description of the ACL entry. The description must be 1 to 256 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
             * 
             * <strong>example:</strong>
             * <p>test-entry</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The CIDR block for the ACL entry.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.1.1/24</p>
             */
            public Builder entry(String entry) {
                this.entry = entry;
                return this;
            }

            /**
             * <p>The status of the ACL entry. Valid values:</p>
             * <ul>
             * <li><strong>Adding</strong>: The ACL entry is being added.</li>
             * <li><strong>Available</strong>: The ACL entry is added and available.</li>
             * <li><strong>Removing</strong>: The ACL entry is being removed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AclEntries build() {
                return new AclEntries(this);
            } 

        } 

    }
}
