// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryDISyncTaskConfigProcessResultResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDISyncTaskConfigProcessResultResponseBody</p>
 */
public class QueryDISyncTaskConfigProcessResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryDISyncTaskConfigProcessResultResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDISyncTaskConfigProcessResultResponseBody create() {
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
         * <p>The information returned for the parameters that are asynchronously generated and used to create or update a real-time synchronization task in Data Integration.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc1411515937635973****</p>
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

        public QueryDISyncTaskConfigProcessResultResponseBody build() {
            return new QueryDISyncTaskConfigProcessResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDISyncTaskConfigProcessResultResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDISyncTaskConfigProcessResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskContent")
        private String taskContent;

        private Data(Builder builder) {
            this.message = builder.message;
            this.status = builder.status;
            this.taskContent = builder.taskContent;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskContent
         */
        public String getTaskContent() {
            return this.taskContent;
        }

        public static final class Builder {
            private String message; 
            private String status; 
            private String taskContent; 

            /**
             * <p>The reason why the parameters fail to be obtained. If the parameters are obtained, the value null is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>fileId:[100] is invalid.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Indicates whether the parameters are obtained. Valid values:</p>
             * <ul>
             * <li>success: The parameters are obtained.</li>
             * <li>fail: The parameters fail to be obtained. You can view the reason for the failure and troubleshoot the issue based on the reason.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The parameters that are obtained. The parameters are used as the request parameters of the <a href="https://help.aliyun.com/document_detail/278725.html">CreateDISyncTask</a> or <a href="https://help.aliyun.com/document_detail/289109.html">UpdateDISyncTask</a> operation to create or update a real-time synchronization task in Data Integration.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;extend&quot;:{&quot;mode&quot;:&quot;migration_holo&quot;,&quot;resourceGroup&quot;:&quot;280749&quot;,&quot;name&quot;:&quot;h&quot;},&quot;type&quot;:&quot;job&quot;,&quot;steps&quot;:[{&quot;stepType&quot;:&quot;mysql&quot;,&quot;parameter&quot;:{&quot;connection&quot;:[{&quot;datasourceType&quot;:&quot;mysql&quot;,&quot;datasource&quot;:&quot;mm&quot;,&quot;selectedTables&quot;:[{&quot;schema&quot;:[{&quot;tableInfos&quot;:[{&quot;enable&quot;:true,&quot;table&quot;:&quot;m_v1&quot;,&quot;tableName&quot;:&quot;m_v1&quot;}]}],&quot;dbName&quot;:&quot;m&quot;}]}]},&quot;name&quot;:&quot;reader&quot;,&quot;category&quot;:&quot;reader&quot;},{&quot;stepType&quot;:&quot;holo&quot;,&quot;parameter&quot;:{&quot;datasource&quot;:&quot;h&quot;,&quot;tableMappingRule&quot;:{&quot;datasource&quot;:[{&quot;tableRule&quot;:[{&quot;srcTable&quot;:&quot;m_v1&quot;,&quot;mergeIntoCycleType&quot;:&quot;DEFAULT&quot;,&quot;hourDeltaEnable&quot;:false,&quot;dstTable&quot;:&quot;m.m_v1&quot;,&quot;dayDeltaEnable&quot;:false,&quot;primaryKeyInfo&quot;:{&quot;column&quot;:[&quot;id&quot;],&quot;type&quot;:&quot;pk&quot;},&quot;dstCreateTableInfo&quot;:{&quot;indexType&quot;:&quot;m_v1&quot;,&quot;dataColumn&quot;:[{&quot;columnSize&quot;:0,&quot;name&quot;:&quot;id&quot;,&quot;index&quot;:0,&quot;comment&quot;:&quot;&quot;,&quot;newDigit&quot;:0,&quot;type&quot;:&quot;int8&quot;,&quot;digit&quot;:0,&quot;primaryKey&quot;:true}],&quot;schemaName&quot;:&quot;m&quot;,&quot;tableName&quot;:&quot;m_v1&quot;},&quot;srcDbName&quot;:&quot;m&quot;],&quot;srcDatasourceName&quot;:&quot;mm&quot;}],&quot;totalTableMapping&quot;:1},&quot;writeMode&quot;:&quot;replay&quot;},&quot;name&quot;:&quot;writer&quot;,&quot;category&quot;:&quot;writer&quot;}],&quot;version&quot;:&quot;2.0&quot;,&quot;order&quot;:{&quot;hops&quot;:[{&quot;from&quot;:&quot;reader&quot;,&quot;to&quot;:&quot;writer&quot;}]}}</p>
             */
            public Builder taskContent(String taskContent) {
                this.taskContent = taskContent;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
