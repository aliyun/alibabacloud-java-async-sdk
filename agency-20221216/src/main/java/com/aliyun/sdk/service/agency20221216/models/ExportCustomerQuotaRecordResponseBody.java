// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportCustomerQuotaRecordResponseBody} extends {@link TeaModel}
 *
 * <p>ExportCustomerQuotaRecordResponseBody</p>
 */
public class ExportCustomerQuotaRecordResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Msg")
    private String msg;

    @NameInMap("RequestId")
    private String requestId;

    private ExportCustomerQuotaRecordResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportCustomerQuotaRecordResponseBody create() {
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
     * @return msg
     */
    public String getMsg() {
        return this.msg;
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
        private String msg; 
        private String requestId; 

        /**
         * Code
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Description
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * ID of the Request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExportCustomerQuotaRecordResponseBody build() {
            return new ExportCustomerQuotaRecordResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Cost")
        private Integer cost;

        @NameInMap("Id")
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

            /**
             * Estimated duration, in minutes.
             */
            public Builder cost(Integer cost) {
                this.cost = cost;
                return this;
            }

            /**
             * ID of Export task
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
