// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogFieldsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogFieldsResponseBody</p>
 */
public class DescribeLogFieldsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeLogFieldsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogFieldsResponseBody create() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeLogFieldsResponseBody build() {
            return new DescribeLogFieldsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityName")
        private String activityName;

        @com.aliyun.core.annotation.NameInMap("FieldDesc")
        private String fieldDesc;

        @com.aliyun.core.annotation.NameInMap("FieldName")
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("FieldType")
        private String fieldType;

        @com.aliyun.core.annotation.NameInMap("LogCode")
        private String logCode;

        private Data(Builder builder) {
            this.activityName = builder.activityName;
            this.fieldDesc = builder.fieldDesc;
            this.fieldName = builder.fieldName;
            this.fieldType = builder.fieldType;
            this.logCode = builder.logCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return activityName
         */
        public String getActivityName() {
            return this.activityName;
        }

        /**
         * @return fieldDesc
         */
        public String getFieldDesc() {
            return this.fieldDesc;
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return fieldType
         */
        public String getFieldType() {
            return this.fieldType;
        }

        /**
         * @return logCode
         */
        public String getLogCode() {
            return this.logCode;
        }

        public static final class Builder {
            private String activityName; 
            private String fieldDesc; 
            private String fieldName; 
            private String fieldType; 
            private String logCode; 

            /**
             * The type of the log to which the field belongs.
             */
            public Builder activityName(String activityName) {
                this.activityName = activityName;
                return this;
            }

            /**
             * The internal code of the field description.
             */
            public Builder fieldDesc(String fieldDesc) {
                this.fieldDesc = fieldDesc;
                return this;
            }

            /**
             * The name of the field.
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * The data type of the field. Valid values:
             * <p>
             * 
             * *   varchar
             * *   bigint
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * The log source to which the field belongs.
             */
            public Builder logCode(String logCode) {
                this.logCode = logCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
