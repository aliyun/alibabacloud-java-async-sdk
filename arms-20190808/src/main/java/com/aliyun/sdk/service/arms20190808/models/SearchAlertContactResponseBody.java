// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchAlertContactResponseBody} extends {@link TeaModel}
 *
 * <p>SearchAlertContactResponseBody</p>
 */
public class SearchAlertContactResponseBody extends TeaModel {
    @NameInMap("PageBean")
    private PageBean pageBean;

    @NameInMap("RequestId")
    private String requestId;

    private SearchAlertContactResponseBody(Builder builder) {
        this.pageBean = builder.pageBean;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchAlertContactResponseBody create() {
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
         * The returned struct.
         */
        public Builder pageBean(PageBean pageBean) {
            this.pageBean = pageBean;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SearchAlertContactResponseBody build() {
            return new SearchAlertContactResponseBody(this);
        } 

    } 

    public static class Contacts extends TeaModel {
        @NameInMap("ContactId")
        private Long contactId;

        @NameInMap("ContactName")
        private String contactName;

        @NameInMap("Content")
        private String content;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DingRobot")
        private String dingRobot;

        @NameInMap("Email")
        private String email;

        @NameInMap("Phone")
        private String phone;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SystemNoc")
        private Boolean systemNoc;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("Webhook")
        private String webhook;

        private Contacts(Builder builder) {
            this.contactId = builder.contactId;
            this.contactName = builder.contactName;
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.dingRobot = builder.dingRobot;
            this.email = builder.email;
            this.phone = builder.phone;
            this.resourceGroupId = builder.resourceGroupId;
            this.systemNoc = builder.systemNoc;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
            this.webhook = builder.webhook;
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
        public Long getContactId() {
            return this.contactId;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dingRobot
         */
        public String getDingRobot() {
            return this.dingRobot;
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

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return systemNoc
         */
        public Boolean getSystemNoc() {
            return this.systemNoc;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return webhook
         */
        public String getWebhook() {
            return this.webhook;
        }

        public static final class Builder {
            private Long contactId; 
            private String contactName; 
            private String content; 
            private Long createTime; 
            private String dingRobot; 
            private String email; 
            private String phone; 
            private String resourceGroupId; 
            private Boolean systemNoc; 
            private Long updateTime; 
            private String userId; 
            private String webhook; 

            /**
             * The ID of the alert contact.
             */
            public Builder contactId(Long contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * The name of the alert contact.
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * The contact group to which the contact belongs. If your contacts are added to multiple contact groups, the contact groups are separated by vertical bars (|).
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The timestamp generated when the alert contact was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The webhook URL of the DingTalk chatbot.
             */
            public Builder dingRobot(String dingRobot) {
                this.dingRobot = dingRobot;
                return this;
            }

            /**
             * The email address of the alert contact.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * The mobile number of the alert contact.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Indicates whether the alert contact receives system notifications. Valid values:
             * <p>
             * 
             * *   `true`: The alert contact receives system notifications.
             * *   `false`: The alert contact does not receive system notifications.
             */
            public Builder systemNoc(Boolean systemNoc) {
                this.systemNoc = systemNoc;
                return this;
            }

            /**
             * The timestamp generated when the alert contact was updated.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The ID of the user.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The information about the webhook.
             */
            public Builder webhook(String webhook) {
                this.webhook = webhook;
                return this;
            }

            public Contacts build() {
                return new Contacts(this);
            } 

        } 

    }
    public static class PageBean extends TeaModel {
        @NameInMap("Contacts")
        private java.util.List < Contacts> contacts;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageBean(Builder builder) {
            this.contacts = builder.contacts;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageBean create() {
            return builder().build();
        }

        /**
         * @return contacts
         */
        public java.util.List < Contacts> getContacts() {
            return this.contacts;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Contacts> contacts; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The information about the alert contacts.
             */
            public Builder contacts(java.util.List < Contacts> contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of returned entries.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageBean build() {
                return new PageBean(this);
            } 

        } 

    }
}
