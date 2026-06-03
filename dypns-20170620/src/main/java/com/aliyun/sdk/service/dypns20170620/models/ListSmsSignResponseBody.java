// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypns20170620.models;

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
 * {@link ListSmsSignResponseBody} extends {@link TeaModel}
 *
 * <p>ListSmsSignResponseBody</p>
 */
public class ListSmsSignResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListSmsSignResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSmsSignResponseBody create() {
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

        private Builder(ListSmsSignResponseBody model) {
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

        public ListSmsSignResponseBody build() {
            return new ListSmsSignResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSmsSignResponseBody} extends {@link TeaModel}
     *
     * <p>ListSmsSignResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditResult")
        private String auditResult;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private Long createDate;

        @com.aliyun.core.annotation.NameInMap("DefaultFlag")
        private Boolean defaultFlag;

        @com.aliyun.core.annotation.NameInMap("SmsSignName")
        private String smsSignName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TestFlag")
        private Boolean testFlag;

        private Data(Builder builder) {
            this.auditResult = builder.auditResult;
            this.createDate = builder.createDate;
            this.defaultFlag = builder.defaultFlag;
            this.smsSignName = builder.smsSignName;
            this.status = builder.status;
            this.testFlag = builder.testFlag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return auditResult
         */
        public String getAuditResult() {
            return this.auditResult;
        }

        /**
         * @return createDate
         */
        public Long getCreateDate() {
            return this.createDate;
        }

        /**
         * @return defaultFlag
         */
        public Boolean getDefaultFlag() {
            return this.defaultFlag;
        }

        /**
         * @return smsSignName
         */
        public String getSmsSignName() {
            return this.smsSignName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return testFlag
         */
        public Boolean getTestFlag() {
            return this.testFlag;
        }

        public static final class Builder {
            private String auditResult; 
            private Long createDate; 
            private Boolean defaultFlag; 
            private String smsSignName; 
            private String status; 
            private Boolean testFlag; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.auditResult = model.auditResult;
                this.createDate = model.createDate;
                this.defaultFlag = model.defaultFlag;
                this.smsSignName = model.smsSignName;
                this.status = model.status;
                this.testFlag = model.testFlag;
            } 

            /**
             * AuditResult.
             */
            public Builder auditResult(String auditResult) {
                this.auditResult = auditResult;
                return this;
            }

            /**
             * CreateDate.
             */
            public Builder createDate(Long createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * DefaultFlag.
             */
            public Builder defaultFlag(Boolean defaultFlag) {
                this.defaultFlag = defaultFlag;
                return this;
            }

            /**
             * SmsSignName.
             */
            public Builder smsSignName(String smsSignName) {
                this.smsSignName = smsSignName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TestFlag.
             */
            public Builder testFlag(Boolean testFlag) {
                this.testFlag = testFlag;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
