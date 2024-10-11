// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRuleConditionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRuleConditionsResponseBody</p>
 */
public class ListRuleConditionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private ListRuleConditionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRuleConditionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalServerError</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>An internal server error occurred</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned results.</p>
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListRuleConditionsResponseBody build() {
            return new ListRuleConditionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRuleConditionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRuleConditionsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("selectType")
        private String selectType;

        @com.aliyun.core.annotation.NameInMap("selectValue")
        private String selectValue;

        @com.aliyun.core.annotation.NameInMap("selectionOperation")
        private String selectionOperation;

        private Result(Builder builder) {
            this.selectType = builder.selectType;
            this.selectValue = builder.selectValue;
            this.selectionOperation = builder.selectionOperation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return selectType
         */
        public String getSelectType() {
            return this.selectType;
        }

        /**
         * @return selectValue
         */
        public String getSelectValue() {
            return this.selectValue;
        }

        /**
         * @return selectionOperation
         */
        public String getSelectionOperation() {
            return this.selectionOperation;
        }

        public static final class Builder {
            private String selectType; 
            private String selectValue; 
            private String selectionOperation; 

            /**
             * <p>The type of the filtering condition for the item selection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>QUERY_ITEM_TYPE</p>
             */
            public Builder selectType(String selectType) {
                this.selectType = selectType;
                return this;
            }

            /**
             * <p>The specific value of the filtering condition for the item selection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder selectValue(String selectValue) {
                this.selectValue = selectValue;
                return this;
            }

            /**
             * <p>The operation on the filtering condition for the item selection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>QUERY_VALUE_IN</p>
             */
            public Builder selectionOperation(String selectionOperation) {
                this.selectionOperation = selectionOperation;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
