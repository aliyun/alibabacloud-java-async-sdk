// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContactsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContactsResponseBody</p>
 */
public class DescribeContactsResponseBody extends TeaModel {
    @NameInMap("PageBean")
    private PageBean pageBean;

    @NameInMap("RequestId")
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
         * PageBean.
         */
        public Builder pageBean(PageBean pageBean) {
            this.pageBean = pageBean;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeContactsResponseBody build() {
            return new DescribeContactsResponseBody(this);
        } 

    } 

    public static class AlertContacts extends TeaModel {
        @NameInMap("ArmsContactId")
        private Long armsContactId;

        @NameInMap("ContactId")
        private Float contactId;

        @NameInMap("ContactName")
        private String contactName;

        @NameInMap("Email")
        private String email;

        @NameInMap("IsEmailVerify")
        private Boolean isEmailVerify;

        @NameInMap("IsVerify")
        private Boolean isVerify;

        @NameInMap("Phone")
        private String phone;

        @NameInMap("ReissueSendNotice")
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
             * ArmsContactId.
             */
            public Builder armsContactId(Long armsContactId) {
                this.armsContactId = armsContactId;
                return this;
            }

            /**
             * ContactId.
             */
            public Builder contactId(Float contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * ContactName.
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * IsEmailVerify.
             */
            public Builder isEmailVerify(Boolean isEmailVerify) {
                this.isEmailVerify = isEmailVerify;
                return this;
            }

            /**
             * IsVerify.
             */
            public Builder isVerify(Boolean isVerify) {
                this.isVerify = isVerify;
                return this;
            }

            /**
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * ReissueSendNotice.
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
    public static class PageBean extends TeaModel {
        @NameInMap("AlertContacts")
        private java.util.List < AlertContacts> alertContacts;

        @NameInMap("Page")
        private Long page;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Total")
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
        public java.util.List < AlertContacts> getAlertContacts() {
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
            private java.util.List < AlertContacts> alertContacts; 
            private Long page; 
            private Long size; 
            private Long total; 

            /**
             * AlertContacts.
             */
            public Builder alertContacts(java.util.List < AlertContacts> alertContacts) {
                this.alertContacts = alertContacts;
                return this;
            }

            /**
             * Page.
             */
            public Builder page(Long page) {
                this.page = page;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * Total.
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
