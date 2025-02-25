// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link SubmitChatQuestionResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitChatQuestionResponseBody</p>
 */
public class SubmitChatQuestionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cost")
    private Long cost;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("dataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("time")
    private String time;

    private SubmitChatQuestionResponseBody(Builder builder) {
        this.cost = builder.cost;
        this.data = builder.data;
        this.dataType = builder.dataType;
        this.errCode = builder.errCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitChatQuestionResponseBody create() {
        return builder().build();
    }

    /**
     * @return cost
     */
    public Long getCost() {
        return this.cost;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
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

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder {
        private Long cost; 
        private Data data; 
        private String dataType; 
        private String errCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String time; 

        /**
         * cost.
         */
        public Builder cost(Long cost) {
            this.cost = cost;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * dataType.
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * errCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * time.
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public SubmitChatQuestionResponseBody build() {
            return new SubmitChatQuestionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SubmitChatQuestionResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitChatQuestionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("batchId")
        private String batchId;

        private Data(Builder builder) {
            this.batchId = builder.batchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return batchId
         */
        public String getBatchId() {
            return this.batchId;
        }

        public static final class Builder {
            private String batchId; 

            /**
             * batchId.
             */
            public Builder batchId(String batchId) {
                this.batchId = batchId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
