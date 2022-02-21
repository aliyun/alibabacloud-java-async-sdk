// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContactGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContactGroupsResponseBody</p>
 */
public class DescribeContactGroupsResponseBody extends TeaModel {
    @NameInMap("PageBean")
    private PageBean pageBean;

    @NameInMap("RequestId")
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
         * 分页对象
         */
        public Builder pageBean(PageBean pageBean) {
            this.pageBean = pageBean;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeContactGroupsResponseBody build() {
            return new DescribeContactGroupsResponseBody(this);
        } 

    } 

    public static class Contacts extends TeaModel {
        @NameInMap("ContactId")
        private Float contactId;

        @NameInMap("ContactName")
        private String contactName;

        @NameInMap("Email")
        private String email;

        @NameInMap("Phone")
        private String phone;

        private Contacts(Builder builder) {
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
            private Float contactId; 
            private String contactName; 
            private String email; 
            private String phone; 

            /**
             * 联系人ID
             */
            public Builder contactId(Float contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * 联系人名称
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * 联系人邮箱
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * 联系人手机号码
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
    public static class AlertContactGroups extends TeaModel {
        @NameInMap("ContactGroupId")
        private Float contactGroupId;

        @NameInMap("ContactGroupName")
        private String contactGroupName;

        @NameInMap("Contacts")
        private java.util.List < Contacts> contacts;

        private AlertContactGroups(Builder builder) {
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
            private Float contactGroupId; 
            private String contactGroupName; 
            private java.util.List < Contacts> contacts; 

            /**
             * 告警联系人组ID
             */
            public Builder contactGroupId(Float contactGroupId) {
                this.contactGroupId = contactGroupId;
                return this;
            }

            /**
             * 告警联系人组名称
             */
            public Builder contactGroupName(String contactGroupName) {
                this.contactGroupName = contactGroupName;
                return this;
            }

            /**
             * 联系人对象
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
    public static class PageBean extends TeaModel {
        @NameInMap("AlertContactGroups")
        private java.util.List < AlertContactGroups> alertContactGroups;

        @NameInMap("Page")
        private Long page;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Total")
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
             * 告警联系人组列表
             */
            public Builder alertContactGroups(java.util.List < AlertContactGroups> alertContactGroups) {
                this.alertContactGroups = alertContactGroups;
                return this;
            }

            /**
             * 页数
             */
            public Builder page(Long page) {
                this.page = page;
                return this;
            }

            /**
             * 每一页数目
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * 总数
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
