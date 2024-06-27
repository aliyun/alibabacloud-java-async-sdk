// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOperatorListBySceneResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOperatorListBySceneResponseBody</p>
 */
public class DescribeOperatorListBySceneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List < ResultObject> resultObject;

    private DescribeOperatorListBySceneResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOperatorListBySceneResponseBody create() {
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
         * requestId.
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

        public DescribeOperatorListBySceneResponseBody build() {
            return new DescribeOperatorListBySceneResponseBody(this);
        } 

    } 

    public static class RightVariables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fieldName")
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("fieldType")
        private String fieldType;

        @com.aliyun.core.annotation.NameInMap("fieldValue")
        private String fieldValue;

        private RightVariables(Builder builder) {
            this.fieldName = builder.fieldName;
            this.fieldType = builder.fieldType;
            this.fieldValue = builder.fieldValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RightVariables create() {
            return builder().build();
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
         * @return fieldValue
         */
        public String getFieldValue() {
            return this.fieldValue;
        }

        public static final class Builder {
            private String fieldName; 
            private String fieldType; 
            private String fieldValue; 

            /**
             * fieldName.
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * fieldType.
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * fieldValue.
             */
            public Builder fieldValue(String fieldValue) {
                this.fieldValue = fieldValue;
                return this;
            }

            public RightVariables build() {
                return new RightVariables(this);
            } 

        } 

    }
    public static class Operators extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("hasRightVariable")
        private Boolean hasRightVariable;

        @com.aliyun.core.annotation.NameInMap("memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("rightVariables")
        private java.util.List < RightVariables> rightVariables;

        private Operators(Builder builder) {
            this.code = builder.code;
            this.hasRightVariable = builder.hasRightVariable;
            this.memo = builder.memo;
            this.name = builder.name;
            this.rightVariables = builder.rightVariables;
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
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return rightVariables
         */
        public java.util.List < RightVariables> getRightVariables() {
            return this.rightVariables;
        }

        public static final class Builder {
            private String code; 
            private Boolean hasRightVariable; 
            private String memo; 
            private String name; 
            private java.util.List < RightVariables> rightVariables; 

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
             * memo.
             */
            public Builder memo(String memo) {
                this.memo = memo;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * rightVariables.
             */
            public Builder rightVariables(java.util.List < RightVariables> rightVariables) {
                this.rightVariables = rightVariables;
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
