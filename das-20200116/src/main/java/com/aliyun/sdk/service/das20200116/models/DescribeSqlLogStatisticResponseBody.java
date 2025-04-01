// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(DescribeSqlLogStatisticResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeSqlLogStatisticResponseBody build() {
            return new DescribeSqlLogStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSqlLogStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSqlLogStatisticResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.coldSqlSize = model.coldSqlSize;
                this.freeColdSqlSize = model.freeColdSqlSize;
                this.freeHotSqlSize = model.freeHotSqlSize;
                this.hotSqlSize = model.hotSqlSize;
                this.importSqlSize = model.importSqlSize;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The size of the SQL Explorer and Audit data that is stored in cold storage. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>8585901</p>
             */
            public Builder coldSqlSize(Long coldSqlSize) {
                this.coldSqlSize = coldSqlSize;
                return this;
            }

            /**
             * <p>The free quota for cold data storage. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>5041450</p>
             */
            public Builder freeColdSqlSize(Long freeColdSqlSize) {
                this.freeColdSqlSize = freeColdSqlSize;
                return this;
            }

            /**
             * <p>The free quota for hot data storage. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>297245</p>
             */
            public Builder freeHotSqlSize(Long freeHotSqlSize) {
                this.freeHotSqlSize = freeHotSqlSize;
                return this;
            }

            /**
             * <p>The size of the SQL Explorer and Audit data that is stored in hot storage. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1118042</p>
             */
            public Builder hotSqlSize(Long hotSqlSize) {
                this.hotSqlSize = hotSqlSize;
                return this;
            }

            /**
             * <p>The size of the SQL Explorer and Audit data that was generated in the most recent day. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder importSqlSize(Long importSqlSize) {
                this.importSqlSize = importSqlSize;
                return this;
            }

            /**
             * <p>The timestamp. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1712568564928</p>
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
