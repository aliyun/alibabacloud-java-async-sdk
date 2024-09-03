// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationVariablesResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationVariablesResponseBody</p>
 */
public class GetApplicationVariablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetApplicationVariablesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationVariablesResponseBody create() {
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

    public static final class Builder {
        private Integer code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 

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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApplicationVariablesResponseBody build() {
            return new GetApplicationVariablesResponseBody(this);
        } 

    } 

    public static class VariableList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("Variable")
        private String variable;

        private VariableList(Builder builder) {
            this.value = builder.value;
            this.variable = builder.variable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VariableList create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return variable
         */
        public String getVariable() {
            return this.variable;
        }

        public static final class Builder {
            private String value; 
            private String variable; 

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * Variable.
             */
            public Builder variable(String variable) {
                this.variable = variable;
                return this;
            }

            public VariableList build() {
                return new VariableList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("VariableList")
        private java.util.List < VariableList> variableList;

        private Data(Builder builder) {
            this.instanceId = builder.instanceId;
            this.variableList = builder.variableList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return variableList
         */
        public java.util.List < VariableList> getVariableList() {
            return this.variableList;
        }

        public static final class Builder {
            private String instanceId; 
            private java.util.List < VariableList> variableList; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * VariableList.
             */
            public Builder variableList(java.util.List < VariableList> variableList) {
                this.variableList = variableList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
