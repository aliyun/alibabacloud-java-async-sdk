// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.sdk.gateway.eiam.dev.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * 
 * {@link ListGroupsForUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListGroupsForUserResponseBody</p>
 */
public class ListGroupsForUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListGroupsForUserResponseBody(Builder builder) {
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupsForUserResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Long maxResults; 
        private String nextToken; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListGroupsForUserResponseBody model) {
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The data object.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The maximum number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token to retrieve the next page of results. If this parameter is not returned, all results have been returned.</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxx</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListGroupsForUserResponseBody build() {
            return new ListGroupsForUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGroupsForUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListGroupsForUserResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("groupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("groupMemberRelationSourceId")
        private String groupMemberRelationSourceId;

        @com.aliyun.core.annotation.NameInMap("groupMemberRelationSourceType")
        private String groupMemberRelationSourceType;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        private Data(Builder builder) {
            this.groupId = builder.groupId;
            this.groupMemberRelationSourceId = builder.groupMemberRelationSourceId;
            this.groupMemberRelationSourceType = builder.groupMemberRelationSourceType;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupMemberRelationSourceId
         */
        public String getGroupMemberRelationSourceId() {
            return this.groupMemberRelationSourceId;
        }

        /**
         * @return groupMemberRelationSourceType
         */
        public String getGroupMemberRelationSourceType() {
            return this.groupMemberRelationSourceType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String groupId; 
            private String groupMemberRelationSourceId; 
            private String groupMemberRelationSourceType; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.groupId = model.groupId;
                this.groupMemberRelationSourceId = model.groupMemberRelationSourceId;
                this.groupMemberRelationSourceType = model.groupMemberRelationSourceType;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The source ID of the group membership.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder groupMemberRelationSourceId(String groupMemberRelationSourceId) {
                this.groupMemberRelationSourceId = groupMemberRelationSourceId;
                return this;
            }

            /**
             * <p>The source type of the group membership.</p>
             * 
             * <strong>example:</strong>
             * <p>build_in</p>
             */
            public Builder groupMemberRelationSourceType(String groupMemberRelationSourceType) {
                this.groupMemberRelationSourceType = groupMemberRelationSourceType;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
