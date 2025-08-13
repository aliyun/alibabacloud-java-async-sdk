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
 * {@link DescribeOperatorListByTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOperatorListByTypeResponseBody</p>
 */
public class DescribeOperatorListByTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List<ResultObject> resultObject;

    private DescribeOperatorListByTypeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOperatorListByTypeResponseBody create() {
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

        private Builder(DescribeOperatorListByTypeResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
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

        public DescribeOperatorListByTypeResponseBody build() {
            return new DescribeOperatorListByTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOperatorListByTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOperatorListByTypeResponseBody</p>
     */
    public static class Operators extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("hasRightVariable")
        private Boolean hasRightVariable;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Operators(Builder builder) {
            this.code = builder.code;
            this.hasRightVariable = builder.hasRightVariable;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Operators create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return hasRightVariable
         */
        public Boolean getHasRightVariable() {
            return this.hasRightVariable;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private Boolean hasRightVariable; 
            private String name; 

            private Builder() {
            } 

            private Builder(Operators model) {
                this.code = model.code;
                this.hasRightVariable = model.hasRightVariable;
                this.name = model.name;
            } 

            /**
             * <p>Operator code</p>
             * 
             * <strong>example:</strong>
             * <p>equals</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>Whether it contains a right variable</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasRightVariable(Boolean hasRightVariable) {
                this.hasRightVariable = hasRightVariable;
                return this;
            }

            /**
             * <p>Operator name</p>
             * 
             * <strong>example:</strong>
             * <p>等于</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Operators build() {
                return new Operators(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOperatorListByTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOperatorListByTypeResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fieldType")
        private String fieldType;

        @com.aliyun.core.annotation.NameInMap("operators")
        private java.util.List<Operators> operators;

        private ResultObject(Builder builder) {
            this.fieldType = builder.fieldType;
            this.operators = builder.operators;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return fieldType
         */
        public String getFieldType() {
            return this.fieldType;
        }

        /**
         * @return operators
         */
        public java.util.List<Operators> getOperators() {
            return this.operators;
        }

        public static final class Builder {
            private String fieldType; 
            private java.util.List<Operators> operators; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.fieldType = model.fieldType;
                this.operators = model.operators;
            } 

            /**
             * <p>Return value type</p>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * <p>Operator list</p>
             */
            public Builder operators(java.util.List<Operators> operators) {
                this.operators = operators;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
