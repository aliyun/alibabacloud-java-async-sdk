// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

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
 * {@link ListContactsResponseBody} extends {@link TeaModel}
 *
 * <p>ListContactsResponseBody</p>
 */
public class ListContactsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListContactsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListContactsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListContactsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListContactsResponseBody build() {
            return new ListContactsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListContactsResponseBody} extends {@link TeaModel}
     *
     * <p>ListContactsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactEmail")
        private String contactEmail;

        @com.aliyun.core.annotation.NameInMap("ContactId")
        private Long contactId;

        @com.aliyun.core.annotation.NameInMap("ContactName")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("ContactPhone")
        private String contactPhone;

        @com.aliyun.core.annotation.NameInMap("MailStatus")
        private Integer mailStatus;

        @com.aliyun.core.annotation.NameInMap("Main")
        private Integer main;

        @com.aliyun.core.annotation.NameInMap("OpenStatusWarning")
        private Boolean openStatusWarning;

        @com.aliyun.core.annotation.NameInMap("OpentAttributionWarning")
        private Boolean opentAttributionWarning;

        @com.aliyun.core.annotation.NameInMap("PhoneStatus")
        private Integer phoneStatus;

        private Data(Builder builder) {
            this.contactEmail = builder.contactEmail;
            this.contactId = builder.contactId;
            this.contactName = builder.contactName;
            this.contactPhone = builder.contactPhone;
            this.mailStatus = builder.mailStatus;
            this.main = builder.main;
            this.openStatusWarning = builder.openStatusWarning;
            this.opentAttributionWarning = builder.opentAttributionWarning;
            this.phoneStatus = builder.phoneStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return contactEmail
         */
        public String getContactEmail() {
            return this.contactEmail;
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
         * @return contactPhone
         */
        public String getContactPhone() {
            return this.contactPhone;
        }

        /**
         * @return mailStatus
         */
        public Integer getMailStatus() {
            return this.mailStatus;
        }

        /**
         * @return main
         */
        public Integer getMain() {
            return this.main;
        }

        /**
         * @return openStatusWarning
         */
        public Boolean getOpenStatusWarning() {
            return this.openStatusWarning;
        }

        /**
         * @return opentAttributionWarning
         */
        public Boolean getOpentAttributionWarning() {
            return this.opentAttributionWarning;
        }

        /**
         * @return phoneStatus
         */
        public Integer getPhoneStatus() {
            return this.phoneStatus;
        }

        public static final class Builder {
            private String contactEmail; 
            private Long contactId; 
            private String contactName; 
            private String contactPhone; 
            private Integer mailStatus; 
            private Integer main; 
            private Boolean openStatusWarning; 
            private Boolean opentAttributionWarning; 
            private Integer phoneStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.contactEmail = model.contactEmail;
                this.contactId = model.contactId;
                this.contactName = model.contactName;
                this.contactPhone = model.contactPhone;
                this.mailStatus = model.mailStatus;
                this.main = model.main;
                this.openStatusWarning = model.openStatusWarning;
                this.opentAttributionWarning = model.opentAttributionWarning;
                this.phoneStatus = model.phoneStatus;
            } 

            /**
             * ContactEmail.
             */
            public Builder contactEmail(String contactEmail) {
                this.contactEmail = contactEmail;
                return this;
            }

            /**
             * ContactId.
             */
            public Builder contactId(Long contactId) {
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
             * ContactPhone.
             */
            public Builder contactPhone(String contactPhone) {
                this.contactPhone = contactPhone;
                return this;
            }

            /**
             * MailStatus.
             */
            public Builder mailStatus(Integer mailStatus) {
                this.mailStatus = mailStatus;
                return this;
            }

            /**
             * Main.
             */
            public Builder main(Integer main) {
                this.main = main;
                return this;
            }

            /**
             * OpenStatusWarning.
             */
            public Builder openStatusWarning(Boolean openStatusWarning) {
                this.openStatusWarning = openStatusWarning;
                return this;
            }

            /**
             * OpentAttributionWarning.
             */
            public Builder opentAttributionWarning(Boolean opentAttributionWarning) {
                this.opentAttributionWarning = opentAttributionWarning;
                return this;
            }

            /**
             * PhoneStatus.
             */
            public Builder phoneStatus(Integer phoneStatus) {
                this.phoneStatus = phoneStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
