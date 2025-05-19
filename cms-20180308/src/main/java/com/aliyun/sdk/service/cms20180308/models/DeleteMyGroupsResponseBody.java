// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link DeleteMyGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMyGroupsResponseBody</p>
 */
public class DeleteMyGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("Group")
    private Group group;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DeleteMyGroupsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.group = builder.group;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMyGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer errorCode; 
        private String errorMessage; 
        private Group group; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DeleteMyGroupsResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.group = model.group;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Group.
         */
        public Builder group(Group group) {
            this.group = group;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteMyGroupsResponseBody build() {
            return new DeleteMyGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteMyGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteMyGroupsResponseBody</p>
     */
    public static class ContactGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private ContactGroup(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactGroup create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(ContactGroup model) {
                this.name = model.name;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ContactGroup build() {
                return new ContactGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeleteMyGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteMyGroupsResponseBody</p>
     */
    public static class ContactGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactGroup")
        private java.util.List<ContactGroup> contactGroup;

        private ContactGroups(Builder builder) {
            this.contactGroup = builder.contactGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactGroups create() {
            return builder().build();
        }

        /**
         * @return contactGroup
         */
        public java.util.List<ContactGroup> getContactGroup() {
            return this.contactGroup;
        }

        public static final class Builder {
            private java.util.List<ContactGroup> contactGroup; 

            private Builder() {
            } 

            private Builder(ContactGroups model) {
                this.contactGroup = model.contactGroup;
            } 

            /**
             * ContactGroup.
             */
            public Builder contactGroup(java.util.List<ContactGroup> contactGroup) {
                this.contactGroup = contactGroup;
                return this;
            }

            public ContactGroups build() {
                return new ContactGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeleteMyGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteMyGroupsResponseBody</p>
     */
    public static class Group extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindUrls")
        private String bindUrls;

        @com.aliyun.core.annotation.NameInMap("ContactGroups")
        private ContactGroups contactGroups;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Group(Builder builder) {
            this.bindUrls = builder.bindUrls;
            this.contactGroups = builder.contactGroups;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.serviceId = builder.serviceId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Group create() {
            return builder().build();
        }

        /**
         * @return bindUrls
         */
        public String getBindUrls() {
            return this.bindUrls;
        }

        /**
         * @return contactGroups
         */
        public ContactGroups getContactGroups() {
            return this.contactGroups;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String bindUrls; 
            private ContactGroups contactGroups; 
            private Long groupId; 
            private String groupName; 
            private String serviceId; 
            private String type; 

            private Builder() {
            } 

            private Builder(Group model) {
                this.bindUrls = model.bindUrls;
                this.contactGroups = model.contactGroups;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.serviceId = model.serviceId;
                this.type = model.type;
            } 

            /**
             * BindUrls.
             */
            public Builder bindUrls(String bindUrls) {
                this.bindUrls = bindUrls;
                return this;
            }

            /**
             * ContactGroups.
             */
            public Builder contactGroups(ContactGroups contactGroups) {
                this.contactGroups = contactGroups;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * ServiceId.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Group build() {
                return new Group(this);
            } 

        } 

    }
}
