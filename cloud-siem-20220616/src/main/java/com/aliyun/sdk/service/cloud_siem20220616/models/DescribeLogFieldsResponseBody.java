// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link DescribeLogFieldsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogFieldsResponseBody</p>
 */
public class DescribeLogFieldsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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

    public Builder toBuilder() {
        return new Builder(this);
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
        private Integer code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeLogFieldsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeLogFieldsResponseBody build() {
            return new DescribeLogFieldsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLogFieldsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogFieldsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.activityName = model.activityName;
                this.fieldDesc = model.fieldDesc;
                this.fieldName = model.fieldName;
                this.fieldType = model.fieldType;
                this.logCode = model.logCode;
            } 

            /**
             * <p>The type of the log to which the field belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP_ACTIVITY</p>
             */
            public Builder activityName(String activityName) {
                this.activityName = activityName;
                return this;
            }

            /**
             * <p>The internal code of the field description.</p>
             * 
             * <strong>example:</strong>
             * <p>sas.cloudsiem.prod.activity_name</p>
             */
            public Builder fieldDesc(String fieldDesc) {
                this.fieldDesc = fieldDesc;
                return this;
            }

            /**
             * <p>The name of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>activity_name</p>
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * <p>The data type of the field. Valid values:</p>
             * <ul>
             * <li>varchar</li>
             * <li>bigint</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>varchar</p>
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * <p>The log source to which the field belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_siem_aegis_sas_alert</p>
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
