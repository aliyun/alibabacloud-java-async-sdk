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
 * {@link ReadCommonContactResponseBody} extends {@link TeaModel}
 *
 * <p>ReadCommonContactResponseBody</p>
 */
public class ReadCommonContactResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ReadCommonContactResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadCommonContactResponseBody create() {
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
    public Data getData() {
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ReadCommonContactResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call failed. For more information, see error codes.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The query result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The result message.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
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

        public ReadCommonContactResponseBody build() {
            return new ReadCommonContactResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ReadCommonContactResponseBody} extends {@link TeaModel}
     *
     * <p>ReadCommonContactResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("ContactEmail")
        private String contactEmail;

        @com.aliyun.core.annotation.NameInMap("ContactId")
        private Long contactId;

        @com.aliyun.core.annotation.NameInMap("ContactMobile")
        private String contactMobile;

        @com.aliyun.core.annotation.NameInMap("ContactName")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("EmailConfirmed")
        private Boolean emailConfirmed;

        @com.aliyun.core.annotation.NameInMap("MobileConfirmed")
        private Boolean mobileConfirmed;

        @com.aliyun.core.annotation.NameInMap("Position")
        private String position;

        private Data(Builder builder) {
            this.aliUid = builder.aliUid;
            this.contactEmail = builder.contactEmail;
            this.contactId = builder.contactId;
            this.contactMobile = builder.contactMobile;
            this.contactName = builder.contactName;
            this.emailConfirmed = builder.emailConfirmed;
            this.mobileConfirmed = builder.mobileConfirmed;
            this.position = builder.position;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
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
         * @return emailConfirmed
         */
        public Boolean getEmailConfirmed() {
            return this.emailConfirmed;
        }

        /**
         * @return mobileConfirmed
         */
        public Boolean getMobileConfirmed() {
            return this.mobileConfirmed;
        }

        /**
         * @return position
         */
        public String getPosition() {
            return this.position;
        }

        public static final class Builder {
            private Long aliUid; 
            private String contactEmail; 
            private Long contactId; 
            private String contactMobile; 
            private String contactName; 
            private Boolean emailConfirmed; 
            private Boolean mobileConfirmed; 
            private String position; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aliUid = model.aliUid;
                this.contactEmail = model.contactEmail;
                this.contactId = model.contactId;
                this.contactMobile = model.contactMobile;
                this.contactName = model.contactName;
                this.emailConfirmed = model.emailConfirmed;
                this.mobileConfirmed = model.mobileConfirmed;
                this.position = model.position;
            } 

            /**
             * <p>The Alibaba Cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The email address of the contact.</p>
             * 
             * <strong>example:</strong>
             * <p>t*@qq.*</p>
             */
            public Builder contactEmail(String contactEmail) {
                this.contactEmail = contactEmail;
                return this;
            }

            /**
             * <p>The contact ID in Account Center. A value of 0 indicates the account contact.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder contactId(Long contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * <p>The mobile phone number of the contact in Account Center (masked).</p>
             * 
             * <strong>example:</strong>
             * <p>130**123</p>
             */
            public Builder contactMobile(String contactMobile) {
                this.contactMobile = contactMobile;
                return this;
            }

            /**
             * <p>The contact name in Account Center.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * <p>Indicates whether the email address of the contact is verified.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder emailConfirmed(Boolean emailConfirmed) {
                this.emailConfirmed = emailConfirmed;
                return this;
            }

            /**
             * <p>Indicates whether the mobile phone number of the contact in Account Center is verified.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder mobileConfirmed(Boolean mobileConfirmed) {
                this.mobileConfirmed = mobileConfirmed;
                return this;
            }

            /**
             * <p>The position of the contact in Account Center.</p>
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
