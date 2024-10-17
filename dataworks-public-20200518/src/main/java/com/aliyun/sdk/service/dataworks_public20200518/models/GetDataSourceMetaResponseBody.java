// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The returned result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG</p>
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
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataSourceMetaResponseBody build() {
            return new GetDataSourceMetaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataSourceMetaResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataSourceMetaResponseBody</p>
     */
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
             * <p>The reason why the metadata of the data source fails to be obtained. If the metadata of the data source is obtained, no value is returned for this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>read datasource time out</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The returned metadata of the data source. The returned metadata is in the JSON format.</p>
             * <p><code>{&quot;dbTables&quot;:[{&quot;dbName&quot;:&quot;testdb&quot;,&quot;schema&quot;:[{&quot;tableInfos&quot;:[{&quot;dbName&quot;:&quot;testdb&quot;,&quot;enable&quot;:true,&quot;table&quot;:&quot;table1&quot;,&quot;tableName&quot;:&quot;table1&quot;}]},{&quot;tableInfos&quot;:[{&quot;dbName&quot;:&quot;testdb&quot;,&quot;enable&quot;:true,&quot;table&quot;:&quot;table2&quot;,&quot;tableName&quot;:&quot;table2&quot;}]}]}]}</code></p>
             * <p>Parameter description:</p>
             * <ul>
             * <li>dbName: the name of the database in which the data source resides.</li>
             * <li>schema: the schema of the database.</li>
             * <li>enable: indicates whether the database is available. The valid values are true and false. The value true indicates that the database is available. The value false indicates that the database is unavailable.</li>
             * <li>tableName: the name of the table in the database.</li>
             * <li>tableInfos: the information about the table in the database.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;dbTables&quot;:[{&quot;dbName&quot;:&quot;testdb&quot;,&quot;schema&quot;:[{&quot;tableInfos&quot;:[{&quot;dbName&quot;:&quot;testdb&quot;,&quot;enable&quot;:true,&quot;table&quot;:&quot;table1&quot;,&quot;tableName&quot;:&quot;table1&quot;}]},{&quot;tableInfos&quot;:[{&quot;dbName&quot;:&quot;testdb&quot;,&quot;enable&quot;:true,&quot;table&quot;:&quot;table2&quot;,&quot;tableName&quot;:&quot;table2&quot;}]}]}]}</p>
             */
            public Builder meta(String meta) {
                this.meta = meta;
                return this;
            }

            /**
             * <p>Indicates whether the metadata of the data source is obtained. Valid values:</p>
             * <ul>
             * <li>success: The metadata of the data source is obtained.</li>
             * <li>fail: The metadata of the data source failed to be obtained. You can troubleshoot issues based on the Message parameter.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
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
