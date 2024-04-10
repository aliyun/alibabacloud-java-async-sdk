// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFlowResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFlowResponseBody</p>
 */
public class CreateFlowResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private CreateFlowResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFlowResponseBody create() {
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
         * If OK is returned, the request was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message.
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

        public CreateFlowResponseBody build() {
            return new CreateFlowResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Categories")
        private java.util.List < String > categories;

        @NameInMap("FlowId")
        private String flowId;

        @NameInMap("FlowName")
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
             * The categories of the Flow.
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
                return this;
            }

            /**
             * The Flow ID.
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * The name of the Flow.
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
