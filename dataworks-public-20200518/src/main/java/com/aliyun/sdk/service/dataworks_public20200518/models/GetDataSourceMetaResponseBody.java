// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataSourceMetaResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataSourceMetaResponseBody</p>
 */
public class GetDataSourceMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDataSourceMetaResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataSourceMetaResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * The returned result.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID. You can locate logs and troubleshoot issues based on the ID.
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
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataSourceMetaResponseBody build() {
            return new GetDataSourceMetaResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Meta")
        private String meta;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.message = builder.message;
            this.meta = builder.meta;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return meta
         */
        public String getMeta() {
            return this.meta;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String message; 
            private String meta; 
            private String status; 

            /**
             * The reason why the metadata of the data source fails to be obtained. If the metadata of the data source is obtained, no value is returned for this parameter.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The returned metadata of the data source. The returned metadata is in the JSON format.
             * <p>
             * 
             * `{"dbTables":[{"dbName":"testdb","schema":[{"tableInfos":[{"dbName":"testdb","enable":true,"table":"table1","tableName":"table1"}]},{"tableInfos":[{"dbName":"testdb","enable":true,"table":"table2","tableName":"table2"}]}]}]}`
             * 
             * Parameter description:
             * 
             * *   dbName: the name of the database in which the data source resides.
             * *   schema: the schema of the database.
             * *   enable: indicates whether the database is available. The valid values are true and false. The value true indicates that the database is available. The value false indicates that the database is unavailable.
             * *   tableName: the name of the table in the database.
             * *   tableInfos: the information about the table in the database.
             */
            public Builder meta(String meta) {
                this.meta = meta;
                return this;
            }

            /**
             * Indicates whether the metadata of the data source is obtained. Valid values:
             * <p>
             * 
             * *   success: The metadata of the data source is obtained.
             * *   fail: The metadata of the data source failed to be obtained. You can troubleshoot issues based on the Message parameter.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
