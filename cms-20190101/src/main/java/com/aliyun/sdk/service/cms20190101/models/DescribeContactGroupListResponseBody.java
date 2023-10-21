// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContactGroupListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContactGroupListResponseBody</p>
 */
public class DescribeContactGroupListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ContactGroupList")
    private ContactGroupList contactGroupList;

    @NameInMap("ContactGroups")
    private ContactGroups contactGroups;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private Integer total;

    private DescribeContactGroupListResponseBody(Builder builder) {
        this.code = builder.code;
        this.contactGroupList = builder.contactGroupList;
        this.contactGroups = builder.contactGroups;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContactGroupListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return contactGroupList
     */
    public ContactGroupList getContactGroupList() {
        return this.contactGroupList;
    }

    /**
     * @return contactGroups
     */
    public ContactGroups getContactGroups() {
        return this.contactGroups;
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

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private ContactGroupList contactGroupList; 
        private ContactGroups contactGroups; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The information about alert groups that were queried.
         */
        public Builder contactGroupList(ContactGroupList contactGroupList) {
            this.contactGroupList = contactGroupList;
            return this;
        }

        /**
         * The names of alert groups.
         */
        public Builder contactGroups(ContactGroups contactGroups) {
            this.contactGroups = contactGroups;
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
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of the returned entries.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeContactGroupListResponseBody build() {
            return new DescribeContactGroupListResponseBody(this);
        } 

    } 

    public static class Contacts extends TeaModel {
        @NameInMap("Contact")
        private java.util.List < String > contact;

        private Contacts(Builder builder) {
            this.contact = builder.contact;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contacts create() {
            return builder().build();
        }

        /**
         * @return contact
         */
        public java.util.List < String > getContact() {
            return this.contact;
        }

        public static final class Builder {
            private java.util.List < String > contact; 

            /**
             * Contact.
             */
            public Builder contact(java.util.List < String > contact) {
                this.contact = contact;
                return this;
            }

            public Contacts build() {
                return new Contacts(this);
            } 

        } 

    }
    public static class ContactGroup extends TeaModel {
        @NameInMap("Contacts")
        private Contacts contacts;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Describe")
        private String describe;

        @NameInMap("EnableSubscribed")
        private Boolean enableSubscribed;

        @NameInMap("EnabledWeeklyReport")
        private Boolean enabledWeeklyReport;

        @NameInMap("Name")
        private String name;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private ContactGroup(Builder builder) {
            this.contacts = builder.contacts;
            this.createTime = builder.createTime;
            this.describe = builder.describe;
            this.enableSubscribed = builder.enableSubscribed;
            this.enabledWeeklyReport = builder.enabledWeeklyReport;
            this.name = builder.name;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactGroup create() {
            return builder().build();
        }

        /**
         * @return contacts
         */
        public Contacts getContacts() {
            return this.contacts;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return describe
         */
        public String getDescribe() {
            return this.describe;
        }

        /**
         * @return enableSubscribed
         */
        public Boolean getEnableSubscribed() {
            return this.enableSubscribed;
        }

        /**
         * @return enabledWeeklyReport
         */
        public Boolean getEnabledWeeklyReport() {
            return this.enabledWeeklyReport;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Contacts contacts; 
            private Long createTime; 
            private String describe; 
            private Boolean enableSubscribed; 
            private Boolean enabledWeeklyReport; 
            private String name; 
            private Long updateTime; 

            /**
             * The alert contacts in the alert group.
             */
            public Builder contacts(Contacts contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * The time when the alert group was created. This value is a UNIX timestamp that represents the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the alert group.
             */
            public Builder describe(String describe) {
                this.describe = describe;
                return this;
            }

            /**
             * Indicates whether the alert group subscribes to weekly reports. Valid values:
             * <p>
             * 
             * *   true: The alert group subscribes to weekly reports.
             * *   false: The alert group does not subscribe to weekly reports.
             */
            public Builder enableSubscribed(Boolean enableSubscribed) {
                this.enableSubscribed = enableSubscribed;
                return this;
            }

            /**
             * Indicates whether the alert group can subscribe to weekly reports. Valid values:
             * <p>
             * 
             * *   true: The alert group can subscribe to weekly reports.
             * *   false: The alert group cannot subscribe to weekly reports.
             * 
             * >  The weekly report subscription feature is only available for Alibaba Cloud accounts with more than five Elastic Compute Service (ECS) instances.
             */
            public Builder enabledWeeklyReport(Boolean enabledWeeklyReport) {
                this.enabledWeeklyReport = enabledWeeklyReport;
                return this;
            }

            /**
             * The name of the alert group.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The time when the alert group was modified. This value is a UNIX timestamp that represents the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ContactGroup build() {
                return new ContactGroup(this);
            } 

        } 

    }
    public static class ContactGroupList extends TeaModel {
        @NameInMap("ContactGroup")
        private java.util.List < ContactGroup> contactGroup;

        private ContactGroupList(Builder builder) {
            this.contactGroup = builder.contactGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactGroupList create() {
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

            public ContactGroupList build() {
                return new ContactGroupList(this);
            } 

        } 

    }
    public static class ContactGroups extends TeaModel {
        @NameInMap("ContactGroup")
        private java.util.List < String > contactGroup;

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
        public java.util.List < String > getContactGroup() {
            return this.contactGroup;
        }

        public static final class Builder {
            private java.util.List < String > contactGroup; 

            /**
             * ContactGroup.
             */
            public Builder contactGroup(java.util.List < String > contactGroup) {
                this.contactGroup = contactGroup;
                return this;
            }

            public ContactGroups build() {
                return new ContactGroups(this);
            } 

        } 

    }
}
