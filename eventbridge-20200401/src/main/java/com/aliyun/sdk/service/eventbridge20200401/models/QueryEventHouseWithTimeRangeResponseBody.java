// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link QueryEventHouseWithTimeRangeResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEventHouseWithTimeRangeResponseBody</p>
 */
public class QueryEventHouseWithTimeRangeResponseBody extends TeaModel {
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

    private QueryEventHouseWithTimeRangeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEventHouseWithTimeRangeResponseBody create() {
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

        private Builder(QueryEventHouseWithTimeRangeResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>接口返回码。Success表示调用成功，其他取值表示具体错误码。</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>SQL查询返回的结构化结果数据。</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>接口调用成功时返回成功信息，调用失败时返回具体错误信息。</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>本次请求的唯一标识，可用于问题排查。</p>
         * 
         * <strong>example:</strong>
         * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>接口调用是否成功。true表示成功，false表示失败。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryEventHouseWithTimeRangeResponseBody build() {
            return new QueryEventHouseWithTimeRangeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryEventHouseWithTimeRangeResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEventHouseWithTimeRangeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rows")
        private java.util.List<Row> rows;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.rows = builder.rows;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return rows
         */
        public java.util.List<Row> getRows() {
            return this.rows;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Row> rows; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.rows = model.rows;
                this.total = model.total;
            } 

            /**
             * <p>本次SQL查询返回的结果行列表。</p>
             */
            public Builder rows(java.util.List<Row> rows) {
                this.rows = rows;
                return this;
            }

            /**
             * <p>本次查询实际返回的结果行数。</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
