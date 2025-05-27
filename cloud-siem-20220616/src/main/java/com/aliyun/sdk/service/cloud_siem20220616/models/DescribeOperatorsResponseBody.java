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
 * {@link DescribeOperatorsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOperatorsResponseBody</p>
 */
public class DescribeOperatorsResponseBody extends TeaModel {
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

        private Builder(DescribeOperatorsResponseBody model) {
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

        public DescribeOperatorsResponseBody build() {
            return new DescribeOperatorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOperatorsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOperatorsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("OperatorDescCn")
        private String operatorDescCn;

        @com.aliyun.core.annotation.NameInMap("OperatorDescEn")
        private String operatorDescEn;

        @com.aliyun.core.annotation.NameInMap("OperatorName")
        private String operatorName;

        @com.aliyun.core.annotation.NameInMap("SupportDataType")
        private String supportDataType;

        @com.aliyun.core.annotation.NameInMap("SupportTag")
        private java.util.List<String> supportTag;

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
        public java.util.List<String> getSupportTag() {
            return this.supportTag;
        }

        public static final class Builder {
            private Integer index; 
            private String operator; 
            private String operatorDescCn; 
            private String operatorDescEn; 
            private String operatorName; 
            private String supportDataType; 
            private java.util.List<String> supportTag; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.index = model.index;
                this.operator = model.operator;
                this.operatorDescCn = model.operatorDescCn;
                this.operatorDescEn = model.operatorDescEn;
                this.operatorName = model.operatorName;
                this.supportDataType = model.supportDataType;
                this.supportTag = model.supportTag;
            } 

            /**
             * <p>The position of the operator in the operator list.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The operator.</p>
             * 
             * <strong>example:</strong>
             * <p>&lt;=</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The description of the operator in Chinese.</p>
             * 
             * <strong>example:</strong>
             * <p>arger than or equal to</p>
             */
            public Builder operatorDescCn(String operatorDescCn) {
                this.operatorDescCn = operatorDescCn;
                return this;
            }

            /**
             * <p>The description of the operator in English.</p>
             * 
             * <strong>example:</strong>
             * <p>larger than or equal to</p>
             */
            public Builder operatorDescEn(String operatorDescEn) {
                this.operatorDescEn = operatorDescEn;
                return this;
            }

            /**
             * <p>The name of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>&lt;=</p>
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * <p>The data types that are supported by the operator. The data types are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>varchar</p>
             */
            public Builder supportDataType(String supportDataType) {
                this.supportDataType = supportDataType;
                return this;
            }

            /**
             * <p>The scenarios that are supported by the operator. Multiple scenarios are separated by commas (,), such as AGGREGATE scenarios. By default, this parameter is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>[AGGREGATE]</p>
             */
            public Builder supportTag(java.util.List<String> supportTag) {
                this.supportTag = supportTag;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
