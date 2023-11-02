// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogFieldsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogFieldsResponseBody</p>
 */
public class DescribeLogFieldsResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Success.
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
        @NameInMap("ActivityName")
        private String activityName;

        @NameInMap("FieldDesc")
        private String fieldDesc;

        @NameInMap("FieldName")
        private String fieldName;

        @NameInMap("FieldType")
        private String fieldType;

        @NameInMap("LogCode")
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
             * ActivityName.
             */
            public Builder activityName(String activityName) {
                this.activityName = activityName;
                return this;
            }

            /**
             * FieldDesc.
             */
            public Builder fieldDesc(String fieldDesc) {
                this.fieldDesc = fieldDesc;
                return this;
            }

            /**
             * FieldName.
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * FieldType.
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * LogCode.
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
