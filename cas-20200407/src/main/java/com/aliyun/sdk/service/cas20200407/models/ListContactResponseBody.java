// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link ListContactResponseBody} extends {@link TeaModel}
 *
 * <p>ListContactResponseBody</p>
 */
public class ListContactResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContactList")
    private java.util.List<ContactList> contactList;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListContactResponseBody(Builder builder) {
        this.contactList = builder.contactList;
        this.currentPage = builder.currentPage;
        this.keyword = builder.keyword;
        this.requestId = builder.requestId;
        this.showSize = builder.showSize;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListContactResponseBody create() {
        return builder().build();
    }

    /**
     * @return contactList
     */
    public java.util.List<ContactList> getContactList() {
        return this.contactList;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return showSize
     */
    public Integer getShowSize() {
        return this.showSize;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<ContactList> contactList; 
        private Integer currentPage; 
        private String keyword; 
        private String requestId; 
        private Integer showSize; 
        private Long totalCount; 

        /**
         * <p>The contacts.</p>
         */
        public Builder contactList(java.util.List<ContactList> contactList) {
            this.contactList = contactList;
            return this;
        }

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The keyword used in the fuzzy search.</p>
         * 
         * <strong>example:</strong>
         * <p>186</p>
         */
        public Builder keyword(String keyword) {
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of certificates per page. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder showSize(Integer showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListContactResponseBody build() {
            return new ListContactResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListContactResponseBody} extends {@link TeaModel}
     *
     * <p>ListContactResponseBody</p>
     */
    public static class ContactList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactId")
        private Long contactId;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("EmailStatus")
        private Integer emailStatus;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("MobileStatus")
        private Integer mobileStatus;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Webhooks")
        private String webhooks;

        private ContactList(Builder builder) {
            this.contactId = builder.contactId;
            this.email = builder.email;
            this.emailStatus = builder.emailStatus;
            this.mobile = builder.mobile;
            this.mobileStatus = builder.mobileStatus;
            this.name = builder.name;
            this.webhooks = builder.webhooks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactList create() {
            return builder().build();
        }

        /**
         * @return contactId
         */
        public Long getContactId() {
            return this.contactId;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return emailStatus
         */
        public Integer getEmailStatus() {
            return this.emailStatus;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return mobileStatus
         */
        public Integer getMobileStatus() {
            return this.mobileStatus;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return webhooks
         */
        public String getWebhooks() {
            return this.webhooks;
        }

        public static final class Builder {
            private Long contactId; 
            private String email; 
            private Integer emailStatus; 
            private String mobile; 
            private Integer mobileStatus; 
            private String name; 
            private String webhooks; 

            /**
             * <p>The ID of the contact.</p>
             * 
             * <strong>example:</strong>
             * <p>519580</p>
             */
            public Builder contactId(Long contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * <p>The email address of the contact.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:username@example.com">username@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>Indicates whether the email address passed the verification.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder emailStatus(Integer emailStatus) {
                this.emailStatus = emailStatus;
                return this;
            }

            /**
             * <p>The phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>139****8888</p>
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * <p>Indicates whether the phone number was verified.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder mobileStatus(Integer mobileStatus) {
                this.mobileStatus = mobileStatus;
                return this;
            }

            /**
             * <p>The name of the contact.</p>
             * 
             * <strong>example:</strong>
             * <p>ty-yaoyue.com</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The webhook URL of the chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;<a href="https://open.feishu.cn/open-apis/bot/v2/hook/XXX%5C%22,%5C%22https://oapi.dingtalk.com/robot/send?access_token=XXX%5C%22,%5C%22https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key=XXX%5C%22%5D">https://open.feishu.cn/open-apis/bot/v2/hook/XXX\&quot;,\&quot;https://oapi.dingtalk.com/robot/send?access_token=XXX\&quot;,\&quot;https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key=XXX\&quot;]</a></p>
             */
            public Builder webhooks(String webhooks) {
                this.webhooks = webhooks;
                return this;
            }

            public ContactList build() {
                return new ContactList(this);
            } 

        } 

    }
}
