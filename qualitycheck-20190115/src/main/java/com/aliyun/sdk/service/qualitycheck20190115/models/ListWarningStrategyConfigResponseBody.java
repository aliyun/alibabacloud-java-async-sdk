// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWarningStrategyConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListWarningStrategyConfigResponseBody</p>
 */
public class ListWarningStrategyConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListWarningStrategyConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWarningStrategyConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer count; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
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
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListWarningStrategyConfigResponseBody build() {
            return new ListWarningStrategyConfigResponseBody(this);
        } 

    } 

    public static class DataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IntervalTime")
        private Long intervalTime;

        @com.aliyun.core.annotation.NameInMap("Lambda")
        private String lambda;

        @com.aliyun.core.annotation.NameInMap("Level")
        private Long level;

        @com.aliyun.core.annotation.NameInMap("MaxNumber")
        private Long maxNumber;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private DataData(Builder builder) {
            this.id = builder.id;
            this.intervalTime = builder.intervalTime;
            this.lambda = builder.lambda;
            this.level = builder.level;
            this.maxNumber = builder.maxNumber;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataData create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return intervalTime
         */
        public Long getIntervalTime() {
            return this.intervalTime;
        }

        /**
         * @return lambda
         */
        public String getLambda() {
            return this.lambda;
        }

        /**
         * @return level
         */
        public Long getLevel() {
            return this.level;
        }

        /**
         * @return maxNumber
         */
        public Long getMaxNumber() {
            return this.maxNumber;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long id; 
            private Long intervalTime; 
            private String lambda; 
            private Long level; 
            private Long maxNumber; 
            private String name; 

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IntervalTime.
             */
            public Builder intervalTime(Long intervalTime) {
                this.intervalTime = intervalTime;
                return this;
            }

            /**
             * Lambda.
             */
            public Builder lambda(String lambda) {
                this.lambda = lambda;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(Long level) {
                this.level = level;
                return this;
            }

            /**
             * MaxNumber.
             */
            public Builder maxNumber(Long maxNumber) {
                this.maxNumber = maxNumber;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DataData build() {
                return new DataData(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List < DataData> data;

        private Data(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < DataData> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List < DataData> data; 

            /**
             * data.
             */
            public Builder data(java.util.List < DataData> data) {
                this.data = data;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
