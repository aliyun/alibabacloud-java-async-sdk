// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertContactWithAlertSettingIdResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlertContactWithAlertSettingIdResponseBody</p>
 */
public class DescribeAlertContactWithAlertSettingIdResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private DescribeAlertContactWithAlertSettingIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertContactWithAlertSettingIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private String status; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
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

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeAlertContactWithAlertSettingIdResponseBody build() {
            return new DescribeAlertContactWithAlertSettingIdResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("contactId")
        private Long contactId;

        @NameInMap("contactName")
        private String contactName;

        @NameInMap("contactType")
        private Long contactType;

        private Data(Builder builder) {
            this.contactId = builder.contactId;
            this.contactName = builder.contactName;
            this.contactType = builder.contactType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
         * @return contactType
         */
        public Long getContactType() {
            return this.contactType;
        }

        public static final class Builder {
            private Long contactId; 
            private String contactName; 
            private Long contactType; 

            /**
             * contactId.
             */
            public Builder contactId(Long contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * contactName.
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * contactType.
             */
            public Builder contactType(Long contactType) {
                this.contactType = contactType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
