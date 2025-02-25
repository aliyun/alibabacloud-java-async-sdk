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
 * {@link ExportCustomerQuotaRecordResponseBody} extends {@link TeaModel}
 *
 * <p>ExportCustomerQuotaRecordResponseBody</p>
 */
public class ExportCustomerQuotaRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>Code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>ID of the Request</p>
         * 
         * <strong>example:</strong>
         * <p>210bc4b416874189683843905d9f9a</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExportCustomerQuotaRecordResponseBody build() {
            return new ExportCustomerQuotaRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExportCustomerQuotaRecordResponseBody} extends {@link TeaModel}
     *
     * <p>ExportCustomerQuotaRecordResponseBody</p>
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

            /**
             * <p>Estimated duration, in minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cost(Integer cost) {
                this.cost = cost;
                return this;
            }

            /**
             * <p>ID of Export task</p>
             * 
             * <strong>example:</strong>
             * <p>1231</p>
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
