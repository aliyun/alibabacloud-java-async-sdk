// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link ListLiveMessageGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLiveMessageGroupsResponseBody</p>
 */
public class ListLiveMessageGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupList")
    private java.util.List<GroupList> groupList;

    @com.aliyun.core.annotation.NameInMap("Hasmore")
    private Boolean hasmore;

    @com.aliyun.core.annotation.NameInMap("NextpageToken")
    private String nextpageToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListLiveMessageGroupsResponseBody(Builder builder) {
        this.groupList = builder.groupList;
        this.hasmore = builder.hasmore;
        this.nextpageToken = builder.nextpageToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveMessageGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupList
     */
    public java.util.List<GroupList> getGroupList() {
        return this.groupList;
    }

    /**
     * @return hasmore
     */
    public Boolean getHasmore() {
        return this.hasmore;
    }

    /**
     * @return nextpageToken
     */
    public String getNextpageToken() {
        return this.nextpageToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<GroupList> groupList; 
        private Boolean hasmore; 
        private String nextpageToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListLiveMessageGroupsResponseBody model) {
            this.groupList = model.groupList;
            this.hasmore = model.hasmore;
            this.nextpageToken = model.nextpageToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Details about the groups.</p>
         */
        public Builder groupList(java.util.List<GroupList> groupList) {
            this.groupList = groupList;
            return this;
        }

        /**
         * <p>Indicates whether the current page is followed by another page.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder hasmore(Boolean hasmore) {
            this.hasmore = hasmore;
            return this;
        }

        /**
         * <p>The starting page number for the next query. This parameter is returned only if the value of Hasmore is true.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder nextpageToken(String nextpageToken) {
            this.nextpageToken = nextpageToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B5D95365-5A46-1A6A-BBF5-C7B6BDED****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListLiveMessageGroupsResponseBody build() {
            return new ListLiveMessageGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLiveMessageGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLiveMessageGroupsResponseBody</p>
     */
    public static class GroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdminList")
        private java.util.List<String> adminList;

        @com.aliyun.core.annotation.NameInMap("Createtime")
        private Long createtime;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("Delete")
        private Boolean delete;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupInfo")
        private String groupInfo;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        private GroupList(Builder builder) {
            this.adminList = builder.adminList;
            this.createtime = builder.createtime;
            this.creatorId = builder.creatorId;
            this.delete = builder.delete;
            this.groupId = builder.groupId;
            this.groupInfo = builder.groupInfo;
            this.groupName = builder.groupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupList create() {
            return builder().build();
        }

        /**
         * @return adminList
         */
        public java.util.List<String> getAdminList() {
            return this.adminList;
        }

        /**
         * @return createtime
         */
        public Long getCreatetime() {
            return this.createtime;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return delete
         */
        public Boolean getDelete() {
            return this.delete;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupInfo
         */
        public String getGroupInfo() {
            return this.groupInfo;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        public static final class Builder {
            private java.util.List<String> adminList; 
            private Long createtime; 
            private String creatorId; 
            private Boolean delete; 
            private String groupId; 
            private String groupInfo; 
            private String groupName; 

            private Builder() {
            } 

            private Builder(GroupList model) {
                this.adminList = model.adminList;
                this.createtime = model.createtime;
                this.creatorId = model.creatorId;
                this.delete = model.delete;
                this.groupId = model.groupId;
                this.groupInfo = model.groupInfo;
                this.groupName = model.groupName;
            } 

            /**
             * <p>The list of the IDs of the group administrators.</p>
             */
            public Builder adminList(java.util.List<String> adminList) {
                this.adminList = adminList;
                return this;
            }

            /**
             * <p>The time when the group was created. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1698299727</p>
             */
            public Builder createtime(Long createtime) {
                this.createtime = createtime;
                return this;
            }

            /**
             * <p>The ID of the group creator.</p>
             * 
             * <strong>example:</strong>
             * <p>user_77</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>Indicates whether the group is deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder delete(Boolean delete) {
                this.delete = delete;
                return this;
            }

            /**
             * <p>The ID of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>cU9MeBqf****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The additional information about the group.</p>
             * 
             * <strong>example:</strong>
             * <p>testgroupinfo</p>
             */
            public Builder groupInfo(String groupInfo) {
                this.groupInfo = groupInfo;
                return this;
            }

            /**
             * <p>The name of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>mytestgroup</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            public GroupList build() {
                return new GroupList(this);
            } 

        } 

    }
}
