// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMonitorGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMonitorGroupResponseBody</p>
 */
public class DeleteMonitorGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Group")
    private Group group;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DeleteMonitorGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.group = builder.group;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMonitorGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return group
     */
    public Group getGroup() {
        return this.group;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Integer code; 
        private Group group; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The deleted application group.
         */
        public Builder group(Group group) {
            this.group = group;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call was successful. The value true indicates a success. The value false indicates a failure.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteMonitorGroupResponseBody build() {
            return new DeleteMonitorGroupResponseBody(this);
        } 

    } 

    public static class ContactGroup extends TeaModel {
        @NameInMap("Name")
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

            /**
             * The name of the alert group.
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
    public static class ContactGroups extends TeaModel {
        @NameInMap("ContactGroup")
        private java.util.List < ContactGroup> contactGroup;

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
        public java.util.List < ContactGroup> getContactGroup() {
            return this.contactGroup;
        }

        public static final class Builder {
            private java.util.List < ContactGroup> contactGroup; 

            /**
             * ContactGroup.
             */
            public Builder contactGroup(java.util.List < ContactGroup> contactGroup) {
                this.contactGroup = contactGroup;
                return this;
            }

            public ContactGroups build() {
                return new ContactGroups(this);
            } 

        } 

    }
    public static class Group extends TeaModel {
        @NameInMap("ContactGroups")
        private ContactGroups contactGroups;

        @NameInMap("GroupName")
        private String groupName;

        private Group(Builder builder) {
            this.contactGroups = builder.contactGroups;
            this.groupName = builder.groupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Group create() {
            return builder().build();
        }

        /**
         * @return contactGroups
         */
        public ContactGroups getContactGroups() {
            return this.contactGroups;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        public static final class Builder {
            private ContactGroups contactGroups; 
            private String groupName; 

            /**
             * The alert groups that receive alert notifications for the application group.
             */
            public Builder contactGroups(ContactGroups contactGroups) {
                this.contactGroups = contactGroups;
                return this;
            }

            /**
             * The name of the application group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            public Group build() {
                return new Group(this);
            } 

        } 

    }
}
