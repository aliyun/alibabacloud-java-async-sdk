// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyFlowResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyFlowResponseBody</p>
 */
public class ModifyFlowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyFlowResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFlowResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * <p>If OK is returned, the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1612C226-E271-4CFE-9F18-4066D******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyFlowResponseBody build() {
            return new ModifyFlowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyFlowResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyFlowResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Categories")
        private java.util.List < String > categories;

        @com.aliyun.core.annotation.NameInMap("FlowId")
        private String flowId;

        @com.aliyun.core.annotation.NameInMap("FlowName")
        private String flowName;

        private Data(Builder builder) {
            this.categories = builder.categories;
            this.flowId = builder.flowId;
            this.flowName = builder.flowName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return categories
         */
        public java.util.List < String > getCategories() {
            return this.categories;
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        /**
         * @return flowName
         */
        public String getFlowName() {
            return this.flowName;
        }

        public static final class Builder {
            private java.util.List < String > categories; 
            private String flowId; 
            private String flowName; 

            /**
             * <p>The categories of the Flow.</p>
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
                return this;
            }

            /**
             * <p>The Flow ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3939399****</p>
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * <p>The Flow name.</p>
             * 
             * <strong>example:</strong>
             * <p>flow-00203</p>
             */
            public Builder flowName(String flowName) {
                this.flowName = flowName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
