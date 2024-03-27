// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOperatorsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOperatorsResponseBody</p>
 */
public class DescribeOperatorsResponseBody extends TeaModel {
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

    private DescribeOperatorsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOperatorsResponseBody create() {
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

        public DescribeOperatorsResponseBody build() {
            return new DescribeOperatorsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Index")
        private Integer index;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("OperatorDescCn")
        private String operatorDescCn;

        @NameInMap("OperatorDescEn")
        private String operatorDescEn;

        @NameInMap("OperatorName")
        private String operatorName;

        @NameInMap("SupportDataType")
        private String supportDataType;

        @NameInMap("SupportTag")
        private java.util.List < String > supportTag;

        private Data(Builder builder) {
            this.index = builder.index;
            this.operator = builder.operator;
            this.operatorDescCn = builder.operatorDescCn;
            this.operatorDescEn = builder.operatorDescEn;
            this.operatorName = builder.operatorName;
            this.supportDataType = builder.supportDataType;
            this.supportTag = builder.supportTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return operatorDescCn
         */
        public String getOperatorDescCn() {
            return this.operatorDescCn;
        }

        /**
         * @return operatorDescEn
         */
        public String getOperatorDescEn() {
            return this.operatorDescEn;
        }

        /**
         * @return operatorName
         */
        public String getOperatorName() {
            return this.operatorName;
        }

        /**
         * @return supportDataType
         */
        public String getSupportDataType() {
            return this.supportDataType;
        }

        /**
         * @return supportTag
         */
        public java.util.List < String > getSupportTag() {
            return this.supportTag;
        }

        public static final class Builder {
            private Integer index; 
            private String operator; 
            private String operatorDescCn; 
            private String operatorDescEn; 
            private String operatorName; 
            private String supportDataType; 
            private java.util.List < String > supportTag; 

            /**
             * The position of the operator in the operator list.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * The operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The description of the operator in Chinese.
             */
            public Builder operatorDescCn(String operatorDescCn) {
                this.operatorDescCn = operatorDescCn;
                return this;
            }

            /**
             * The description of the operator in English.
             */
            public Builder operatorDescEn(String operatorDescEn) {
                this.operatorDescEn = operatorDescEn;
                return this;
            }

            /**
             * The name of the operator.
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * The data types that are supported by the operator. The data types are separated by commas (,).
             */
            public Builder supportDataType(String supportDataType) {
                this.supportDataType = supportDataType;
                return this;
            }

            /**
             * The scenarios that are supported by the operator. Multiple scenarios are separated by commas (,), such as AGGREGATE scenarios. By default, this parameter is empty.
             */
            public Builder supportTag(java.util.List < String > supportTag) {
                this.supportTag = supportTag;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
