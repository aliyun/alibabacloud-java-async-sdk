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

        public DescribeContactsResponseBody build() {
            return new DescribeContactsResponseBody(this);
        } 

    } 

    public static class AlertContacts extends TeaModel {
        @NameInMap("ContactId")
        private Float contactId;

        @NameInMap("ContactName")
        private String contactName;

        @NameInMap("Email")
        private String email;

        @NameInMap("IsVerify")
        private Boolean isVerify;

        @NameInMap("Phone")
        private String phone;

        @NameInMap("ReissueSendNotice")
        private Long reissueSendNotice;

        private AlertContacts(Builder builder) {
            this.contactId = builder.contactId;
            this.contactName = builder.contactName;
            this.email = builder.email;
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
            private Float contactId; 
            private String contactName; 
            private String email; 
            private Boolean isVerify; 
            private String phone; 
            private Long reissueSendNotice; 

            /**
             * 告警联系人ID
             */
            public Builder contactId(Float contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * 告警联系人名称
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * 告警联系人邮箱
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * 手机号码是否验证标识
             */
            public Builder isVerify(Boolean isVerify) {
                this.isVerify = isVerify;
                return this;
            }

            /**
             * 告警联系人手机号码
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * 电话通知失败补发类型：0. 不补发   1. 重复拨打一次电话   2. 发送短信通知   3. 使用全局默认值（当前为不补发）
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
             * 告警联系人列表
             */
            public Builder alertContacts(java.util.List < AlertContacts> alertContacts) {
                this.alertContacts = alertContacts;
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
             * 每一页大小
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
