// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link GetMetaTableLineageResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaTableLineageResponseBody</p>
 */
public class GetMetaTableLineageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetMetaTableLineageResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaTableLineageResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The business data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid.Tenant.ConnectionNotExists</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The connection does not exist.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc1ec92159376</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMetaTableLineageResponseBody build() {
            return new GetMetaTableLineageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMetaTableLineageResponseBody} extends {@link TeaModel}
     *
     * <p>GetMetaTableLineageResponseBody</p>
     */
    public static class DataEntityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("TableGuid")
        private String tableGuid;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private DataEntityList(Builder builder) {
            this.createTimestamp = builder.createTimestamp;
            this.databaseName = builder.databaseName;
            this.tableGuid = builder.tableGuid;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataEntityList create() {
            return builder().build();
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return tableGuid
         */
        public String getTableGuid() {
            return this.tableGuid;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private Long createTimestamp; 
            private String databaseName; 
            private String tableGuid; 
            private String tableName; 

            /**
             * <p>The time when the table was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1638720736000</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>db1</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The unique identifier of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.tt.name</p>
             */
            public Builder tableGuid(String tableGuid) {
                this.tableGuid = tableGuid;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public DataEntityList build() {
                return new DataEntityList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMetaTableLineageResponseBody} extends {@link TeaModel}
     *
     * <p>GetMetaTableLineageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataEntityList")
        private java.util.List<DataEntityList> dataEntityList;

        @com.aliyun.core.annotation.NameInMap("HasNext")
        private Boolean hasNext;

        @com.aliyun.core.annotation.NameInMap("NextPrimaryKey")
        private String nextPrimaryKey;

        private Data(Builder builder) {
            this.dataEntityList = builder.dataEntityList;
            this.hasNext = builder.hasNext;
            this.nextPrimaryKey = builder.nextPrimaryKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataEntityList
         */
        public java.util.List<DataEntityList> getDataEntityList() {
            return this.dataEntityList;
        }

        /**
         * @return hasNext
         */
        public Boolean getHasNext() {
            return this.hasNext;
        }

        /**
         * @return nextPrimaryKey
         */
        public String getNextPrimaryKey() {
            return this.nextPrimaryKey;
        }

        public static final class Builder {
            private java.util.List<DataEntityList> dataEntityList; 
            private Boolean hasNext; 
            private String nextPrimaryKey; 

            /**
             * <p>The information about the table.</p>
             */
            public Builder dataEntityList(java.util.List<DataEntityList> dataEntityList) {
                this.dataEntityList = dataEntityList;
                return this;
            }

            /**
             * <p>Indicates whether the next page exists.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasNext(Boolean hasNext) {
                this.hasNext = hasNext;
                return this;
            }

            /**
             * <p>The logic of paging. If the value true is returned for the HasNext parameter and a value is returned for the NextPrimaryKey parameter in the response of the previous request, you must use the value of the NextPrimaryKey parameter for the next request.</p>
             * 
             * <strong>example:</strong>
             * <p>odps | retail_e_commerce_2 | retail_e_commerce_2 | dws_ec_trd__cate_commodity_gmv_kpy_fy</p>
             */
            public Builder nextPrimaryKey(String nextPrimaryKey) {
                this.nextPrimaryKey = nextPrimaryKey;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
