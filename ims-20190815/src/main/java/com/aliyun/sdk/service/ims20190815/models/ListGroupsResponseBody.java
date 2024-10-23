// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListGroupsResponseBody</p>
 */
public class ListGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Groups")
    private Groups groups;

    @com.aliyun.core.annotation.NameInMap("IsTruncated")
    private Boolean isTruncated;

    @com.aliyun.core.annotation.NameInMap("Marker")
    private String marker;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListGroupsResponseBody(Builder builder) {
        this.groups = builder.groups;
        this.isTruncated = builder.isTruncated;
        this.marker = builder.marker;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return groups
     */
    public Groups getGroups() {
        return this.groups;
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Groups groups; 
        private Boolean isTruncated; 
        private String marker; 
        private String requestId; 

        /**
         * <p>The information of the RAM user groups.</p>
         */
        public Builder groups(Groups groups) {
            this.groups = groups;
            return this;
        }

        /**
         * <p>Indicates whether the response is truncated. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * <p>The <code>marker</code>. This parameter is returned only if the value of <code>IsTruncated</code> is <code>true</code>. If the parameter is returned, you can call this operation again and set this parameter to obtain the truncated part.</p>
         * 
         * <strong>example:</strong>
         * <p>EXAMPLE</p>
         */
        public Builder marker(String marker) {
            this.marker = marker;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>065527AA-2F2E-AD7C-7484-F2626CFE4934</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListGroupsResponseBody build() {
            return new ListGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListGroupsResponseBody</p>
     */
    public static class Group extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comments")
        private String comments;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
        private String updateDate;

        private Group(Builder builder) {
            this.comments = builder.comments;
            this.createDate = builder.createDate;
            this.displayName = builder.displayName;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.updateDate = builder.updateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Group create() {
            return builder().build();
        }

        /**
         * @return comments
         */
        public String getComments() {
            return this.comments;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private String comments; 
            private String createDate; 
            private String displayName; 
            private String groupId; 
            private String groupName; 
            private String updateDate; 

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Dev-Team</p>
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-19T12:33:18Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The display name of the RAM user group.</p>
             * 
             * <strong>example:</strong>
             * <p>Dev-Team</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The ID of the RAM user group.</p>
             * 
             * <strong>example:</strong>
             * <p>740317625433843****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the RAM user group.</p>
             * 
             * <strong>example:</strong>
             * <p>dev-team</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-19T12:33:18Z</p>
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public Group build() {
                return new Group(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListGroupsResponseBody</p>
     */
    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Group")
        private java.util.List < Group> group;

        private Groups(Builder builder) {
            this.group = builder.group;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return group
         */
        public java.util.List < Group> getGroup() {
            return this.group;
        }

        public static final class Builder {
            private java.util.List < Group> group; 

            /**
             * Group.
             */
            public Builder group(java.util.List < Group> group) {
                this.group = group;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
}
