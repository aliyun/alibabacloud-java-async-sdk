// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link SearchAlertContactResponseBody} extends {@link TeaModel}
 *
 * <p>SearchAlertContactResponseBody</p>
 */
public class SearchAlertContactResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageBean")
    private PageBean pageBean;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The returned struct.</p>
         */
        public Builder pageBean(PageBean pageBean) {
            this.pageBean = pageBean;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>21E85B16-75A6-429A-9F65-8AAC9A54****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SearchAlertContactResponseBody build() {
            return new SearchAlertContactResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchAlertContactResponseBody} extends {@link TeaModel}
     *
     * <p>SearchAlertContactResponseBody</p>
     */
    public static class Contacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactId")
        private Long contactId;

        @com.aliyun.core.annotation.NameInMap("ContactName")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DingRobot")
        private String dingRobot;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SystemNoc")
        private Boolean systemNoc;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("Webhook")
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
             * <p>The ID of the alert contact.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder contactId(Long contactId) {
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
             * <p>The contact group to which the contact belongs. If your contacts are added to multiple contact groups, the contact groups are separated by vertical bars (|).</p>
             * 
             * <strong>example:</strong>
             * <p>Default Group | SRE Group</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The timestamp generated when the alert contact was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1572349025000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The webhook URL of the DingTalk chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=91f2f6">https://oapi.dingtalk.com/robot/send?access_token=91f2f6</a>****</p>
             */
            public Builder dingRobot(String dingRobot) {
                this.dingRobot = dingRobot;
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
             * <p>1381111*****</p>
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxyexli2****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Indicates whether the alert contact receives system notifications. Valid values:</p>
             * <ul>
             * <li><code>true</code>: The alert contact receives system notifications.</li>
             * <li><code>false</code>: The alert contact does not receive system notifications.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder systemNoc(Boolean systemNoc) {
                this.systemNoc = systemNoc;
                return this;
            }

            /**
             * <p>The timestamp generated when the alert contact was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1580258717000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>113197164949****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The information about the webhook.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;body&quot;:&quot;{   \&quot;msg_type\&quot;: \&quot;text\&quot;,   \&quot;content\&quot;: {     \&quot;text\&quot;: \&quot;$content\&quot;   } }&quot;,&quot;header&quot;:{&quot;Arms-Content-Type&quot;:&quot;json&quot;},&quot;method&quot;:&quot;post&quot;,&quot;params&quot;:{},&quot;url&quot;:&quot;https://<em><strong>&quot;,&quot;userId&quot;:&quot;1131971649</strong></em>&quot;}&quot;,</p>
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
    /**
     * 
     * {@link SearchAlertContactResponseBody} extends {@link TeaModel}
     *
     * <p>SearchAlertContactResponseBody</p>
     */
    public static class PageBean extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Contacts")
        private java.util.List<Contacts> contacts;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
        public java.util.List<Contacts> getContacts() {
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
            private java.util.List<Contacts> contacts; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The information about the alert contacts.</p>
             */
            public Builder contacts(java.util.List<Contacts> contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of returned entries.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
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
