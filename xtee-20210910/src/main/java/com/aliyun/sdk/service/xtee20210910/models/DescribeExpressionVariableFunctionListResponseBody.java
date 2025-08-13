// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeExpressionVariableFunctionListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExpressionVariableFunctionListResponseBody</p>
 */
public class DescribeExpressionVariableFunctionListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List<ResultObject> resultObject;

    private DescribeExpressionVariableFunctionListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExpressionVariableFunctionListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public java.util.List<ResultObject> getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ResultObject> resultObject; 

        private Builder() {
        } 

        private Builder(DescribeExpressionVariableFunctionListResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6E8817D5-5354-5953-84B1-D98379F036DC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return object</p>
         */
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeExpressionVariableFunctionListResponseBody build() {
            return new DescribeExpressionVariableFunctionListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeExpressionVariableFunctionListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExpressionVariableFunctionListResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("maxParamSize")
        private Long maxParamSize;

        @com.aliyun.core.annotation.NameInMap("minParamSize")
        private Long minParamSize;

        @com.aliyun.core.annotation.NameInMap("paramTypes")
        private String paramTypes;

        @com.aliyun.core.annotation.NameInMap("redirect")
        private Boolean redirect;

        @com.aliyun.core.annotation.NameInMap("returnTypes")
        private String returnTypes;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private ResultObject(Builder builder) {
            this.description = builder.description;
            this.key = builder.key;
            this.maxParamSize = builder.maxParamSize;
            this.minParamSize = builder.minParamSize;
            this.paramTypes = builder.paramTypes;
            this.redirect = builder.redirect;
            this.returnTypes = builder.returnTypes;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return maxParamSize
         */
        public Long getMaxParamSize() {
            return this.maxParamSize;
        }

        /**
         * @return minParamSize
         */
        public Long getMinParamSize() {
            return this.minParamSize;
        }

        /**
         * @return paramTypes
         */
        public String getParamTypes() {
            return this.paramTypes;
        }

        /**
         * @return redirect
         */
        public Boolean getRedirect() {
            return this.redirect;
        }

        /**
         * @return returnTypes
         */
        public String getReturnTypes() {
            return this.returnTypes;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String key; 
            private Long maxParamSize; 
            private Long minParamSize; 
            private String paramTypes; 
            private Boolean redirect; 
            private String returnTypes; 
            private String value; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.description = model.description;
                this.key = model.key;
                this.maxParamSize = model.maxParamSize;
                this.minParamSize = model.minParamSize;
                this.paramTypes = model.paramTypes;
                this.redirect = model.redirect;
                this.returnTypes = model.returnTypes;
                this.value = model.value;
            } 

            /**
             * <p>Description information.</p>
             * 
             * <strong>example:</strong>
             * <p>描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Function name</p>
             * 
             * <strong>example:</strong>
             * <p>concat</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Maximum number of parameters</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder maxParamSize(Long maxParamSize) {
                this.maxParamSize = maxParamSize;
                return this;
            }

            /**
             * <p>Minimum number of parameters</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder minParamSize(Long minParamSize) {
                this.minParamSize = minParamSize;
                return this;
            }

            /**
             * <p>Parameter types</p>
             * 
             * <strong>example:</strong>
             * <p>*STRING</p>
             */
            public Builder paramTypes(String paramTypes) {
                this.paramTypes = paramTypes;
                return this;
            }

            /**
             * <p>Whether it is directly invoked</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder redirect(Boolean redirect) {
                this.redirect = redirect;
                return this;
            }

            /**
             * <p>Method return types</p>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
             */
            public Builder returnTypes(String returnTypes) {
                this.returnTypes = returnTypes;
                return this;
            }

            /**
             * <p>Function value</p>
             * 
             * <strong>example:</strong>
             * <p>concat</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
