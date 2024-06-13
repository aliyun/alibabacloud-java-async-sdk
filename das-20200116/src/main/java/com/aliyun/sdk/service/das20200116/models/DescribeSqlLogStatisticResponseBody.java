// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSqlLogStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSqlLogStatisticResponseBody</p>
 */
public class DescribeSqlLogStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeSqlLogStatisticResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSqlLogStatisticResponseBody create() {
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
         * The response code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request was successful, **Successful** is returned. If the request failed, an error message is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeSqlLogStatisticResponseBody build() {
            return new DescribeSqlLogStatisticResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColdSqlSize")
        private Long coldSqlSize;

        @com.aliyun.core.annotation.NameInMap("FreeColdSqlSize")
        private Long freeColdSqlSize;

        @com.aliyun.core.annotation.NameInMap("FreeHotSqlSize")
        private Long freeHotSqlSize;

        @com.aliyun.core.annotation.NameInMap("HotSqlSize")
        private Long hotSqlSize;

        @com.aliyun.core.annotation.NameInMap("ImportSqlSize")
        private Long importSqlSize;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private Data(Builder builder) {
            this.coldSqlSize = builder.coldSqlSize;
            this.freeColdSqlSize = builder.freeColdSqlSize;
            this.freeHotSqlSize = builder.freeHotSqlSize;
            this.hotSqlSize = builder.hotSqlSize;
            this.importSqlSize = builder.importSqlSize;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return coldSqlSize
         */
        public Long getColdSqlSize() {
            return this.coldSqlSize;
        }

        /**
         * @return freeColdSqlSize
         */
        public Long getFreeColdSqlSize() {
            return this.freeColdSqlSize;
        }

        /**
         * @return freeHotSqlSize
         */
        public Long getFreeHotSqlSize() {
            return this.freeHotSqlSize;
        }

        /**
         * @return hotSqlSize
         */
        public Long getHotSqlSize() {
            return this.hotSqlSize;
        }

        /**
         * @return importSqlSize
         */
        public Long getImportSqlSize() {
            return this.importSqlSize;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Long coldSqlSize; 
            private Long freeColdSqlSize; 
            private Long freeHotSqlSize; 
            private Long hotSqlSize; 
            private Long importSqlSize; 
            private Long timestamp; 

            /**
             * The size of the SQL Explorer and Audit data that is stored in cold storage. Unit: bytes.
             */
            public Builder coldSqlSize(Long coldSqlSize) {
                this.coldSqlSize = coldSqlSize;
                return this;
            }

            /**
             * The free quota for cold data storage. Unit: bytes.
             */
            public Builder freeColdSqlSize(Long freeColdSqlSize) {
                this.freeColdSqlSize = freeColdSqlSize;
                return this;
            }

            /**
             * The free quota for hot data storage. Unit: bytes.
             */
            public Builder freeHotSqlSize(Long freeHotSqlSize) {
                this.freeHotSqlSize = freeHotSqlSize;
                return this;
            }

            /**
             * The size of the SQL Explorer and Audit data that is stored in hot storage. Unit: bytes.
             */
            public Builder hotSqlSize(Long hotSqlSize) {
                this.hotSqlSize = hotSqlSize;
                return this;
            }

            /**
             * The size of the SQL Explorer and Audit data that was generated in the most recent day. Unit: bytes.
             */
            public Builder importSqlSize(Long importSqlSize) {
                this.importSqlSize = importSqlSize;
                return this;
            }

            /**
             * The timestamp. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
