// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20230516.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TaskCallInfoResponseBody} extends {@link TeaModel}
 *
 * <p>TaskCallInfoResponseBody</p>
 */
public class TaskCallInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private Long timestamp;

    private TaskCallInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TaskCallInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
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

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder {
        private Long code; 
        private String message; 
        private Model model; 
        private String requestId; 
        private Boolean success; 
        private Long timestamp; 

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
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
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Timestamp.
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public TaskCallInfoResponseBody build() {
            return new TaskCallInfoResponseBody(this);
        } 

    } 

    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FinishTotal")
        private Long finishTotal;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("UnCallTotal")
        private Long unCallTotal;

        private Model(Builder builder) {
            this.finishTotal = builder.finishTotal;
            this.total = builder.total;
            this.unCallTotal = builder.unCallTotal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return finishTotal
         */
        public Long getFinishTotal() {
            return this.finishTotal;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return unCallTotal
         */
        public Long getUnCallTotal() {
            return this.unCallTotal;
        }

        public static final class Builder {
            private Long finishTotal; 
            private Long total; 
            private Long unCallTotal; 

            /**
             * FinishTotal.
             */
            public Builder finishTotal(Long finishTotal) {
                this.finishTotal = finishTotal;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * UnCallTotal.
             */
            public Builder unCallTotal(Long unCallTotal) {
                this.unCallTotal = unCallTotal;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
