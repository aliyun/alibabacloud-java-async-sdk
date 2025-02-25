// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteMonitorGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMonitorGroupResponseBody</p>
 */
public class DeleteMonitorGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Group")
    private Group group;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the call was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The deleted application group.</p>
         */
        public Builder group(Group group) {
            this.group = group;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>The Request is not authorization.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CA35B3AE-4FFD-4A33-AE67-67EF68711EFA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. The value true indicates a success. The value false indicates a failure.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteMonitorGroupResponseBody build() {
            return new DeleteMonitorGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteMonitorGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteMonitorGroupResponseBody</p>
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

            /**
             * <p>The name of the alert group.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS_Group</p>
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
     * {@link DeleteMonitorGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteMonitorGroupResponseBody</p>
     */
    public static class ContactGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactGroup")
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
    /**
     * 
     * {@link DeleteMonitorGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteMonitorGroupResponseBody</p>
     */
    public static class Group extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactGroups")
        private ContactGroups contactGroups;

        @com.aliyun.core.annotation.NameInMap("GroupName")
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
             * <p>The alert groups that receive alert notifications for the application group.</p>
             */
            public Builder contactGroups(ContactGroups contactGroups) {
                this.contactGroups = contactGroups;
                return this;
            }

            /**
             * <p>The name of the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS_test</p>
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
