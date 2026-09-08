// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.notifications20241225.models;

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
 * {@link ReadAllMarketingPreferencesResponseBody} extends {@link TeaModel}
 *
 * <p>ReadAllMarketingPreferencesResponseBody</p>
 */
public class ReadAllMarketingPreferencesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ReadAllMarketingPreferencesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadAllMarketingPreferencesResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ReadAllMarketingPreferencesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned by the system. For more information about error codes, see error codes.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The execution result.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A5F62766-1C2F-1F56-A39D-63E3D30F0633</p>
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

        public ReadAllMarketingPreferencesResponseBody build() {
            return new ReadAllMarketingPreferencesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ReadAllMarketingPreferencesResponseBody} extends {@link TeaModel}
     *
     * <p>ReadAllMarketingPreferencesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowMarketing")
        private Boolean allowMarketing;

        @com.aliyun.core.annotation.NameInMap("ContactEmail")
        private String contactEmail;

        @com.aliyun.core.annotation.NameInMap("ContactId")
        private Long contactId;

        @com.aliyun.core.annotation.NameInMap("ContactMobile")
        private String contactMobile;

        @com.aliyun.core.annotation.NameInMap("ContactName")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("Position")
        private String position;

        private Data(Builder builder) {
            this.allowMarketing = builder.allowMarketing;
            this.contactEmail = builder.contactEmail;
            this.contactId = builder.contactId;
            this.contactMobile = builder.contactMobile;
            this.contactName = builder.contactName;
            this.position = builder.position;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return allowMarketing
         */
        public Boolean getAllowMarketing() {
            return this.allowMarketing;
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
         * @return contactMobile
         */
        public String getContactMobile() {
            return this.contactMobile;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return position
         */
        public String getPosition() {
            return this.position;
        }

        public static final class Builder {
            private Boolean allowMarketing; 
            private String contactEmail; 
            private Long contactId; 
            private String contactMobile; 
            private String contactName; 
            private String position; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.allowMarketing = model.allowMarketing;
                this.contactEmail = model.contactEmail;
                this.contactId = model.contactId;
                this.contactMobile = model.contactMobile;
                this.contactName = model.contactName;
                this.position = model.position;
            } 

            /**
             * <p>Indicates whether notifications are allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowMarketing(Boolean allowMarketing) {
                this.allowMarketing = allowMarketing;
                return this;
            }

            /**
             * <p>The email address of the contact in the Account Center (masked).</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@aliyun.com">test@aliyun.com</a></p>
             */
            public Builder contactEmail(String contactEmail) {
                this.contactEmail = contactEmail;
                return this;
            }

            /**
             * <p>The contact ID in the Account Center. A value of 0 indicates the account contact.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder contactId(Long contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * <p>The mobile phone number of the contact in the Account Center (masked).</p>
             * 
             * <strong>example:</strong>
             * <p>130*123</p>
             */
            public Builder contactMobile(String contactMobile) {
                this.contactMobile = contactMobile;
                return this;
            }

            /**
             * <p>The contact name in the Account Center.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * <p>The position of the contact in the Account Center.</p>
             * 
             * <strong>example:</strong>
             * <p>CEO</p>
             */
            public Builder position(String position) {
                this.position = position;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
