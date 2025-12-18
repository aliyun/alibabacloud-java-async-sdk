// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link ListConfigRuleOperatorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListConfigRuleOperatorsResponseBody</p>
 */
public class ListConfigRuleOperatorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Operators")
    private java.util.List<Operators> operators;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListConfigRuleOperatorsResponseBody(Builder builder) {
        this.operators = builder.operators;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConfigRuleOperatorsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operators
     */
    public java.util.List<Operators> getOperators() {
        return this.operators;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Operators> operators; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListConfigRuleOperatorsResponseBody model) {
            this.operators = model.operators;
            this.requestId = model.requestId;
        } 

        /**
         * Operators.
         */
        public Builder operators(java.util.List<Operators> operators) {
            this.operators = operators;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A68DD98C-DE65-46AC-B2D2-04A4A9AB5B99</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListConfigRuleOperatorsResponseBody build() {
            return new ListConfigRuleOperatorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListConfigRuleOperatorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListConfigRuleOperatorsResponseBody</p>
     */
    public static class Operators extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        private Operators(Builder builder) {
            this.dataType = builder.dataType;
            this.description = builder.description;
            this.name = builder.name;
            this.operator = builder.operator;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Operators create() {
            return builder().build();
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        public static final class Builder {
            private String dataType; 
            private String description; 
            private String name; 
            private String operator; 

            private Builder() {
            } 

            private Builder(Operators model) {
                this.dataType = model.dataType;
                this.description = model.description;
                this.name = model.name;
                this.operator = model.operator;
            } 

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            public Operators build() {
                return new Operators(this);
            } 

        } 

    }
}
