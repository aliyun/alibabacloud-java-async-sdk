// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunCloudBenchTaskResponseBody} extends {@link TeaModel}
 *
 * <p>RunCloudBenchTaskResponseBody</p>
 */
public class RunCloudBenchTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private RunCloudBenchTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunCloudBenchTaskResponseBody create() {
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

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public RunCloudBenchTaskResponseBody build() {
            return new RunCloudBenchTaskResponseBody(this);
        } 

    } 

    public static class PreCheckItem extends TeaModel {
        @NameInMap("Code")
        private Integer code;

        @NameInMap("Details")
        private String details;

        @NameInMap("Message")
        private String message;

        @NameInMap("Name")
        private String name;

        @NameInMap("Order")
        private Integer order;

        @NameInMap("Status")
        private String status;

        private PreCheckItem(Builder builder) {
            this.code = builder.code;
            this.details = builder.details;
            this.message = builder.message;
            this.name = builder.name;
            this.order = builder.order;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreCheckItem create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return details
         */
        public String getDetails() {
            return this.details;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return order
         */
        public Integer getOrder() {
            return this.order;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer code; 
            private String details; 
            private String message; 
            private String name; 
            private Integer order; 
            private String status; 

            /**
             * Code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * Details.
             */
            public Builder details(String details) {
                this.details = details;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Order.
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PreCheckItem build() {
                return new PreCheckItem(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PreCheckItem")
        private java.util.List < PreCheckItem> preCheckItem;

        private Data(Builder builder) {
            this.preCheckItem = builder.preCheckItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return preCheckItem
         */
        public java.util.List < PreCheckItem> getPreCheckItem() {
            return this.preCheckItem;
        }

        public static final class Builder {
            private java.util.List < PreCheckItem> preCheckItem; 

            /**
             * PreCheckItem.
             */
            public Builder preCheckItem(java.util.List < PreCheckItem> preCheckItem) {
                this.preCheckItem = preCheckItem;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
