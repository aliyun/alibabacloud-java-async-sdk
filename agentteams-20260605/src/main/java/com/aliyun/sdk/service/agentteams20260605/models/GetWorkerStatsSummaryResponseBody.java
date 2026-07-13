// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link GetWorkerStatsSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkerStatsSummaryResponseBody</p>
 */
public class GetWorkerStatsSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetWorkerStatsSummaryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkerStatsSummaryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetWorkerStatsSummaryResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public GetWorkerStatsSummaryResponseBody build() {
            return new GetWorkerStatsSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkerStatsSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkerStatsSummaryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OtherWorkers")
        private Integer otherWorkers;

        @com.aliyun.core.annotation.NameInMap("RunningWorkers")
        private Integer runningWorkers;

        @com.aliyun.core.annotation.NameInMap("StoppedWorkers")
        private Integer stoppedWorkers;

        @com.aliyun.core.annotation.NameInMap("TotalWorkers")
        private Integer totalWorkers;

        private Data(Builder builder) {
            this.otherWorkers = builder.otherWorkers;
            this.runningWorkers = builder.runningWorkers;
            this.stoppedWorkers = builder.stoppedWorkers;
            this.totalWorkers = builder.totalWorkers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return otherWorkers
         */
        public Integer getOtherWorkers() {
            return this.otherWorkers;
        }

        /**
         * @return runningWorkers
         */
        public Integer getRunningWorkers() {
            return this.runningWorkers;
        }

        /**
         * @return stoppedWorkers
         */
        public Integer getStoppedWorkers() {
            return this.stoppedWorkers;
        }

        /**
         * @return totalWorkers
         */
        public Integer getTotalWorkers() {
            return this.totalWorkers;
        }

        public static final class Builder {
            private Integer otherWorkers; 
            private Integer runningWorkers; 
            private Integer stoppedWorkers; 
            private Integer totalWorkers; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.otherWorkers = model.otherWorkers;
                this.runningWorkers = model.runningWorkers;
                this.stoppedWorkers = model.stoppedWorkers;
                this.totalWorkers = model.totalWorkers;
            } 

            /**
             * OtherWorkers.
             */
            public Builder otherWorkers(Integer otherWorkers) {
                this.otherWorkers = otherWorkers;
                return this;
            }

            /**
             * RunningWorkers.
             */
            public Builder runningWorkers(Integer runningWorkers) {
                this.runningWorkers = runningWorkers;
                return this;
            }

            /**
             * StoppedWorkers.
             */
            public Builder stoppedWorkers(Integer stoppedWorkers) {
                this.stoppedWorkers = stoppedWorkers;
                return this;
            }

            /**
             * TotalWorkers.
             */
            public Builder totalWorkers(Integer totalWorkers) {
                this.totalWorkers = totalWorkers;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
