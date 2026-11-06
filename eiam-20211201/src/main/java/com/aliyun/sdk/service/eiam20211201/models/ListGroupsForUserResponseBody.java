// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListGroupsForUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListGroupsForUserResponseBody</p>
 */
public class ListGroupsForUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Groups")
    private java.util.List<Groups> groups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListGroupsForUserResponseBody(Builder builder) {
        this.groups = builder.groups;
        this.requestId = builder.requestId;
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
     * @return groups
     */
    public java.util.List<Groups> getGroups() {
        return this.groups;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Groups> groups; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListGroupsForUserResponseBody model) {
            this.groups = model.groups;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of groups.</p>
         */
        public Builder groups(java.util.List<Groups> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of matched entries. The maximum number of entries returned per page is specified by the PageSize parameter.</p>
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
    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupMemberRelationSourceId")
        private String groupMemberRelationSourceId;

        @com.aliyun.core.annotation.NameInMap("GroupMemberRelationSourceType")
        private String groupMemberRelationSourceType;

        private Groups(Builder builder) {
            this.groupId = builder.groupId;
            this.groupMemberRelationSourceId = builder.groupMemberRelationSourceId;
            this.groupMemberRelationSourceType = builder.groupMemberRelationSourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
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

        public static final class Builder {
            private String groupId; 
            private String groupMemberRelationSourceId; 
            private String groupMemberRelationSourceType; 

            private Builder() {
            } 

            private Builder(Groups model) {
                this.groupId = model.groupId;
                this.groupMemberRelationSourceId = model.groupMemberRelationSourceId;
                this.groupMemberRelationSourceType = model.groupMemberRelationSourceType;
            } 

            /**
             * <p>The group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>group_d6sbsuumeta4h66ec3il7yxxxx</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The source ID of the group member relationship. For self-managed groups, the default value is the instance ID. For other types, the value corresponds to the enterprise ID of the source. For example, if the source is DingTalk, the value is the corpId of the DingTalk enterprise.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder groupMemberRelationSourceId(String groupMemberRelationSourceId) {
                this.groupMemberRelationSourceId = groupMemberRelationSourceId;
                return this;
            }

            /**
             * <p>The source type of the group member relationship. Valid values:</p>
             * <ul>
             * <li>build_in: Self-managed.</li>
             * <li>ding_talk: Imported from DingTalk.</li>
             * <li>ad: Imported from AD.</li>
             * <li>ldap: Imported from LDAP.</li>
             * <li>we_com: Imported from WeCom.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>build_in</p>
             */
            public Builder groupMemberRelationSourceType(String groupMemberRelationSourceType) {
                this.groupMemberRelationSourceType = groupMemberRelationSourceType;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
}
