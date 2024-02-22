// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDataSourceLogResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteDataSourceLogResponseBody</p>
 */
public class DeleteDataSourceLogResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteDataSourceLogResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDataSourceLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteDataSourceLogResponseBody build() {
            return new DeleteDataSourceLogResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("LogInstanceId")
        private String logInstanceId;

        private Data(Builder builder) {
            this.count = builder.count;
            this.logInstanceId = builder.logInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return logInstanceId
         */
        public String getLogInstanceId() {
            return this.logInstanceId;
        }

        public static final class Builder {
            private Integer count; 
            private String logInstanceId; 

            /**
             * The number of logs that are removed. The value 1 indicates that the log is removed, and a value less than or equal to 0 indicates that the log failed to be removed.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The ID of the log. The ID is an MD5 hash value that is calculated by the threat analysis feature based on specific parameters.
             */
            public Builder logInstanceId(String logInstanceId) {
                this.logInstanceId = logInstanceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
