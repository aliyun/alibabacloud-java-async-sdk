// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOperatorListByTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOperatorListByTypeResponseBody</p>
 */
public class DescribeOperatorListByTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List < ResultObject> resultObject;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public java.util.List < ResultObject> getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResultObject> resultObject; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(java.util.List < ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeOperatorListByTypeResponseBody build() {
            return new DescribeOperatorListByTypeResponseBody(this);
        } 

    } 

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

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * hasRightVariable.
             */
            public Builder hasRightVariable(Boolean hasRightVariable) {
                this.hasRightVariable = hasRightVariable;
                return this;
            }

            /**
             * name.
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
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fieldType")
        private String fieldType;

        @com.aliyun.core.annotation.NameInMap("operators")
        private java.util.List < Operators> operators;

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
        public java.util.List < Operators> getOperators() {
            return this.operators;
        }

        public static final class Builder {
            private String fieldType; 
            private java.util.List < Operators> operators; 

            /**
             * fieldType.
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * operators.
             */
            public Builder operators(java.util.List < Operators> operators) {
                this.operators = operators;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
