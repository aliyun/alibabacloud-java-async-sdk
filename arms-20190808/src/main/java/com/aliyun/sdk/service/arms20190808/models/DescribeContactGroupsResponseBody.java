// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeContactGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContactGroupsResponseBody</p>
 */
public class DescribeContactGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageBean")
    private PageBean pageBean;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeContactGroupsResponseBody(Builder builder) {
        this.pageBean = builder.pageBean;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContactGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageBean
     */
    public PageBean getPageBean() {
        return this.pageBean;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PageBean pageBean; 
        private String requestId; 

        /**
         * <p>The objects that were returned.</p>
         */
        public Builder pageBean(PageBean pageBean) {
            this.pageBean = pageBean;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4D6C358A-A58B-4F4B-94CE-F5AAF023****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeContactGroupsResponseBody build() {
            return new DescribeContactGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeContactGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContactGroupsResponseBody</p>
     */
    public static class Contacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArmsContactId")
        private Long armsContactId;

        @com.aliyun.core.annotation.NameInMap("ContactId")
        private Float contactId;

        @com.aliyun.core.annotation.NameInMap("ContactName")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        private Contacts(Builder builder) {
            this.armsContactId = builder.armsContactId;
            this.contactId = builder.contactId;
            this.contactName = builder.contactName;
            this.email = builder.email;
            this.phone = builder.phone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contacts create() {
            return builder().build();
        }

        /**
         * @return armsContactId
         */
        public Long getArmsContactId() {
            return this.armsContactId;
        }

        /**
         * @return contactId
         */
        public Float getContactId() {
            return this.contactId;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        public static final class Builder {
            private Long armsContactId; 
            private Float contactId; 
            private String contactName; 
            private String email; 
            private String phone; 

            /**
             * <p>The ID of the alert contact.</p>
             * 
             * <strong>example:</strong>
             * <p>100117</p>
             */
            public Builder armsContactId(Long armsContactId) {
                this.armsContactId = armsContactId;
                return this;
            }

            /**
             * <p>The ID of the alert contact.</p>
             * 
             * <strong>example:</strong>
             * <p>456</p>
             */
            public Builder contactId(Float contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * <p>The name of the alert contact.</p>
             * 
             * <strong>example:</strong>
             * <p>John Doe</p>
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * <p>The email address of the alert contact.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:someone@example.com">someone@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The mobile number of the alert contact.</p>
             * 
             * <strong>example:</strong>
             * <p>1381111****</p>
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            public Contacts build() {
                return new Contacts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeContactGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContactGroupsResponseBody</p>
     */
    public static class AlertContactGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArmsContactGroupId")
        private Long armsContactGroupId;

        @com.aliyun.core.annotation.NameInMap("ContactGroupId")
        private Float contactGroupId;

        @com.aliyun.core.annotation.NameInMap("ContactGroupName")
        private String contactGroupName;

        @com.aliyun.core.annotation.NameInMap("Contacts")
        private java.util.List < Contacts> contacts;

        private AlertContactGroups(Builder builder) {
            this.armsContactGroupId = builder.armsContactGroupId;
            this.contactGroupId = builder.contactGroupId;
            this.contactGroupName = builder.contactGroupName;
            this.contacts = builder.contacts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertContactGroups create() {
            return builder().build();
        }

        /**
         * @return armsContactGroupId
         */
        public Long getArmsContactGroupId() {
            return this.armsContactGroupId;
        }

        /**
         * @return contactGroupId
         */
        public Float getContactGroupId() {
            return this.contactGroupId;
        }

        /**
         * @return contactGroupName
         */
        public String getContactGroupName() {
            return this.contactGroupName;
        }

        /**
         * @return contacts
         */
        public java.util.List < Contacts> getContacts() {
            return this.contacts;
        }

        public static final class Builder {
            private Long armsContactGroupId; 
            private Float contactGroupId; 
            private String contactGroupName; 
            private java.util.List < Contacts> contacts; 

            /**
             * <p>The ID of the alert contact group.</p>
             * 
             * <strong>example:</strong>
             * <p>83261</p>
             */
            public Builder armsContactGroupId(Long armsContactGroupId) {
                this.armsContactGroupId = armsContactGroupId;
                return this;
            }

            /**
             * <p>The ID of the alert contact group.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder contactGroupId(Float contactGroupId) {
                this.contactGroupId = contactGroupId;
                return this;
            }

            /**
             * <p>The name of the alert contact group.</p>
             * 
             * <strong>example:</strong>
             * <p>TestGroup</p>
             */
            public Builder contactGroupName(String contactGroupName) {
                this.contactGroupName = contactGroupName;
                return this;
            }

            /**
             * <p>The contact information. If the <strong>IsDetail</strong> parameter is set to <code>false</code>, no <strong>contact</strong> information is displayed.</p>
             */
            public Builder contacts(java.util.List < Contacts> contacts) {
                this.contacts = contacts;
                return this;
            }

            public AlertContactGroups build() {
                return new AlertContactGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeContactGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContactGroupsResponseBody</p>
     */
    public static class PageBean extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertContactGroups")
        private java.util.List < AlertContactGroups> alertContactGroups;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Long page;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private PageBean(Builder builder) {
            this.alertContactGroups = builder.alertContactGroups;
            this.page = builder.page;
            this.size = builder.size;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageBean create() {
            return builder().build();
        }

        /**
         * @return alertContactGroups
         */
        public java.util.List < AlertContactGroups> getAlertContactGroups() {
            return this.alertContactGroups;
        }

        /**
         * @return page
         */
        public Long getPage() {
            return this.page;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < AlertContactGroups> alertContactGroups; 
            private Long page; 
            private Long size; 
            private Long total; 

            /**
             * <p>The name of the alert contact group.</p>
             */
            public Builder alertContactGroups(java.util.List < AlertContactGroups> alertContactGroups) {
                this.alertContactGroups = alertContactGroups;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Long page) {
                this.page = page;
                return this;
            }

            /**
             * <p>The number of alert contact groups displayed on each page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The total number of alert contact groups.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public PageBean build() {
                return new PageBean(this);
            } 

        } 

    }
}
