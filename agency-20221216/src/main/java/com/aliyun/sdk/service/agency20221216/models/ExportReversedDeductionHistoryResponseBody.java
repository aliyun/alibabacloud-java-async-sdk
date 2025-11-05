// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
 * {@link ExportReversedDeductionHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>ExportReversedDeductionHistoryResponseBody</p>
 */
public class ExportReversedDeductionHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ExportReversedDeductionHistoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportReversedDeductionHistoryResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ExportReversedDeductionHistoryResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
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

        public ExportReversedDeductionHistoryResponseBody build() {
            return new ExportReversedDeductionHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExportReversedDeductionHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>ExportReversedDeductionHistoryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cost")
        private Integer cost;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        private Data(Builder builder) {
            this.cost = builder.cost;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cost
         */
        public Integer getCost() {
            return this.cost;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        public static final class Builder {
            private Integer cost; 
            private Long id; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cost = model.cost;
                this.id = model.id;
            } 

            /**
             * Cost.
             */
            public Builder cost(Integer cost) {
                this.cost = cost;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
