// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link UpdateGroupResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateGroupResponseBody</p>
 */
public class UpdateGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Group")
    private Group group;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateGroupResponseBody(Builder builder) {
        this.group = builder.group;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return group
     */
    public Group getGroup() {
        return this.group;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Group group; 
        private String requestId; 

        /**
         * <p>The information of the RAM user group.</p>
         */
        public Builder group(Group group) {
            this.group = group;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EC6647CC-0A36-EC7A-BA72-CC81BF3DE182</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateGroupResponseBody build() {
            return new UpdateGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateGroupResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateGroupResponseBody</p>
     */
    public static class Group extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comments")
        private String comments;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
        private String updateDate;

        private Group(Builder builder) {
            this.comments = builder.comments;
            this.createDate = builder.createDate;
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
            private String groupId; 
            private String groupName; 
            private String updateDate; 

            /**
             * <p>The description of the RAM user group.</p>
             * 
             * <strong>example:</strong>
             * <p>NewDev-Team</p>
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * <p>The time when the RAM user group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-01-23T12:33:18Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The ID of the RAM user group.</p>
             * 
             * <strong>example:</strong>
             * <p>g-FpMEHiMysofp****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The new name of the RAM user group.</p>
             * 
             * <strong>example:</strong>
             * <p>NewDev-Team</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The time when the information of the RAM user group was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-01-23T12:33:18Z</p>
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
}
