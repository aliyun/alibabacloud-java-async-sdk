// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeContactGroupListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContactGroupListResponseBody</p>
 */
public class DescribeContactGroupListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ContactGroupList")
    private ContactGroupList contactGroupList;

    @com.aliyun.core.annotation.NameInMap("ContactGroups")
    private ContactGroups contactGroups;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
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
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the call was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about alert groups that were queried.</p>
         */
        public Builder contactGroupList(ContactGroupList contactGroupList) {
            this.contactGroupList = contactGroupList;
            return this;
        }

        /**
         * <p>The names of alert groups.</p>
         */
        public Builder contactGroups(ContactGroups contactGroups) {
            this.contactGroups = contactGroups;
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
         * <p>916EE694-03C2-47B6-85EE-5054E3C168D3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li>true: The call was successful.</li>
         * <li>false: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of the returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeContactGroupListResponseBody build() {
            return new DescribeContactGroupListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeContactGroupListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContactGroupListResponseBody</p>
     */
    public static class Contacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Contact")
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
    /**
     * 
     * {@link DescribeContactGroupListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContactGroupListResponseBody</p>
     */
    public static class ContactGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Contacts")
        private Contacts contacts;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Describe")
        private String describe;

        @com.aliyun.core.annotation.NameInMap("EnableSubscribed")
        private Boolean enableSubscribed;

        @com.aliyun.core.annotation.NameInMap("EnabledWeeklyReport")
        private Boolean enabledWeeklyReport;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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
             * <p>The alert contacts in the alert group.</p>
             */
            public Builder contacts(Contacts contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * <p>The time when the alert group was created. This value is a UNIX timestamp that represents the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1507070598000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the alert group.</p>
             */
            public Builder describe(String describe) {
                this.describe = describe;
                return this;
            }

            /**
             * <p>Indicates whether the alert group subscribes to weekly reports. Valid values:</p>
             * <ul>
             * <li>true: The alert group subscribes to weekly reports.</li>
             * <li>false: The alert group does not subscribe to weekly reports.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableSubscribed(Boolean enableSubscribed) {
                this.enableSubscribed = enableSubscribed;
                return this;
            }

            /**
             * <p>Indicates whether the alert group can subscribe to weekly reports. Valid values:</p>
             * <ul>
             * <li>true: The alert group can subscribe to weekly reports.</li>
             * <li>false: The alert group cannot subscribe to weekly reports.</li>
             * </ul>
             * <blockquote>
             * <p> The weekly report subscription feature is only available for Alibaba Cloud accounts with more than five Elastic Compute Service (ECS) instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabledWeeklyReport(Boolean enabledWeeklyReport) {
                this.enabledWeeklyReport = enabledWeeklyReport;
                return this;
            }

            /**
             * <p>The name of the alert group.</p>
             * 
             * <strong>example:</strong>
             * <p>Contact1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The time when the alert group was modified. This value is a UNIX timestamp that represents the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1589447759000</p>
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
    /**
     * 
     * {@link DescribeContactGroupListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContactGroupListResponseBody</p>
     */
    public static class ContactGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactGroup")
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
    /**
     * 
     * {@link DescribeContactGroupListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContactGroupListResponseBody</p>
     */
    public static class ContactGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactGroup")
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
