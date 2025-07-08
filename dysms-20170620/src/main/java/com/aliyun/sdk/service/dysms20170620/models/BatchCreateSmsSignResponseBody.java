// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link BatchCreateSmsSignResponseBody} extends {@link TeaModel}
 *
 * <p>BatchCreateSmsSignResponseBody</p>
 */
public class BatchCreateSmsSignResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private BatchCreateSmsSignResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateSmsSignResponseBody create() {
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
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(BatchCreateSmsSignResponseBody model) {
            this.code = model.code;
            this.data = model.data;
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

        public BatchCreateSmsSignResponseBody build() {
            return new BatchCreateSmsSignResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchCreateSmsSignResponseBody} extends {@link TeaModel}
     *
     * <p>BatchCreateSmsSignResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppliedNum")
        private Integer appliedNum;

        @com.aliyun.core.annotation.NameInMap("AvailableNum")
        private Integer availableNum;

        @com.aliyun.core.annotation.NameInMap("BatchCreateSmsSignResult")
        private String batchCreateSmsSignResult;

        private Data(Builder builder) {
            this.appliedNum = builder.appliedNum;
            this.availableNum = builder.availableNum;
            this.batchCreateSmsSignResult = builder.batchCreateSmsSignResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appliedNum
         */
        public Integer getAppliedNum() {
            return this.appliedNum;
        }

        /**
         * @return availableNum
         */
        public Integer getAvailableNum() {
            return this.availableNum;
        }

        /**
         * @return batchCreateSmsSignResult
         */
        public String getBatchCreateSmsSignResult() {
            return this.batchCreateSmsSignResult;
        }

        public static final class Builder {
            private Integer appliedNum; 
            private Integer availableNum; 
            private String batchCreateSmsSignResult; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appliedNum = model.appliedNum;
                this.availableNum = model.availableNum;
                this.batchCreateSmsSignResult = model.batchCreateSmsSignResult;
            } 

            /**
             * AppliedNum.
             */
            public Builder appliedNum(Integer appliedNum) {
                this.appliedNum = appliedNum;
                return this;
            }

            /**
             * AvailableNum.
             */
            public Builder availableNum(Integer availableNum) {
                this.availableNum = availableNum;
                return this;
            }

            /**
             * BatchCreateSmsSignResult.
             */
            public Builder batchCreateSmsSignResult(String batchCreateSmsSignResult) {
                this.batchCreateSmsSignResult = batchCreateSmsSignResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
