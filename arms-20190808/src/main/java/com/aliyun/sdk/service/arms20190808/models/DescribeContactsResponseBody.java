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
 * {@link DescribeContactsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContactsResponseBody</p>
 */
public class DescribeContactsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageBean")
    private PageBean pageBean;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeContactsResponseBody(Builder builder) {
        this.pageBean = builder.pageBean;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContactsResponseBody create() {
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
         * <p>21E85B16-75A6-429A-9F65-8AAC9A54****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeContactsResponseBody build() {
            return new DescribeContactsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeContactsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContactsResponseBody</p>
     */
    public static class AlertContacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArmsContactId")
        private Long armsContactId;

        @com.aliyun.core.annotation.NameInMap("ContactId")
        private Float contactId;

        @com.aliyun.core.annotation.NameInMap("ContactName")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("IsEmailVerify")
        private Boolean isEmailVerify;

        @com.aliyun.core.annotation.NameInMap("IsVerify")
        private Boolean isVerify;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("ReissueSendNotice")
        private Long reissueSendNotice;

        private AlertContacts(Builder builder) {
            this.armsContactId = builder.armsContactId;
            this.contactId = builder.contactId;
            this.contactName = builder.contactName;
            this.email = builder.email;
            this.isEmailVerify = builder.isEmailVerify;
            this.isVerify = builder.isVerify;
            this.phone = builder.phone;
            this.reissueSendNotice = builder.reissueSendNotice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertContacts create() {
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
         * @return isEmailVerify
         */
        public Boolean getIsEmailVerify() {
            return this.isEmailVerify;
        }

        /**
         * @return isVerify
         */
        public Boolean getIsVerify() {
            return this.isVerify;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return reissueSendNotice
         */
        public Long getReissueSendNotice() {
            return this.reissueSendNotice;
        }

        public static final class Builder {
            private Long armsContactId; 
            private Float contactId; 
            private String contactName; 
            private String email; 
            private Boolean isEmailVerify; 
            private Boolean isVerify; 
            private String phone; 
            private Long reissueSendNotice; 

            /**
             * <p>The ID of the alert contact.</p>
             * 
             * <strong>example:</strong>
             * <p>100147</p>
             */
            public Builder armsContactId(Long armsContactId) {
                this.armsContactId = armsContactId;
                return this;
            }

            /**
             * <p>The ID of the alert contact.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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
             * <p>Indicates whether the email address was verified.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isEmailVerify(Boolean isEmailVerify) {
                this.isEmailVerify = isEmailVerify;
                return this;
            }

            /**
             * <p>Indicates whether the mobile number was verified. Valid values:</p>
             * <ul>
             * <li><code>false</code>: no</li>
             * <li><code>true</code>: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isVerify(Boolean isVerify) {
                this.isVerify = isVerify;
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

            /**
             * <p>The operation that you want to perform if phone calls fail to be answered. Valid values:</p>
             * <ul>
             * <li>0: No operation is performed.</li>
             * <li>1: A phone call is made again.</li>
             * <li>2: A text message is sent.</li>
             * <li>3 (default value): The global default value is used.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder reissueSendNotice(Long reissueSendNotice) {
                this.reissueSendNotice = reissueSendNotice;
                return this;
            }

            public AlertContacts build() {
                return new AlertContacts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeContactsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContactsResponseBody</p>
     */
    public static class PageBean extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertContacts")
        private java.util.List<AlertContacts> alertContacts;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Long page;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private PageBean(Builder builder) {
            this.alertContacts = builder.alertContacts;
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
         * @return alertContacts
         */
        public java.util.List<AlertContacts> getAlertContacts() {
            return this.alertContacts;
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
            private java.util.List<AlertContacts> alertContacts; 
            private Long page; 
            private Long size; 
            private Long total; 

            /**
             * <p>The alert contacts.</p>
             */
            public Builder alertContacts(java.util.List<AlertContacts> alertContacts) {
                this.alertContacts = alertContacts;
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
             * <p>The number of alert contacts returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The total number of alert contacts.</p>
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
