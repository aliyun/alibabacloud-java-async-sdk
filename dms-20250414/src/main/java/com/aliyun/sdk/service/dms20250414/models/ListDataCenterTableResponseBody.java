// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ListDataCenterTableResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataCenterTableResponseBody</p>
 */
public class ListDataCenterTableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListDataCenterTableResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataCenterTableResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListDataCenterTableResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The data returned in the response.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The code that indicates the result of the request. If the request fails, an error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Specified parameter Tid is not valid.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The request succeeded.</p>
         * </li>
         * <li><p><strong>false</strong>: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDataCenterTableResponseBody build() {
            return new ListDataCenterTableResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataCenterTableResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataCenterTableResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("DescUpdateTime")
        private String descUpdateTime;

        @com.aliyun.core.annotation.NameInMap("DmsDbId")
        private Long dmsDbId;

        @com.aliyun.core.annotation.NameInMap("DmsInstanceId")
        private Long dmsInstanceId;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("ImportType")
        private String importType;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("TableDesc")
        private String tableDesc;

        @com.aliyun.core.annotation.NameInMap("TableId")
        private String tableId;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private Content(Builder builder) {
            this.databaseName = builder.databaseName;
            this.descUpdateTime = builder.descUpdateTime;
            this.dmsDbId = builder.dmsDbId;
            this.dmsInstanceId = builder.dmsInstanceId;
            this.gmtCreated = builder.gmtCreated;
            this.importType = builder.importType;
            this.instanceName = builder.instanceName;
            this.tableDesc = builder.tableDesc;
            this.tableId = builder.tableId;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return descUpdateTime
         */
        public String getDescUpdateTime() {
            return this.descUpdateTime;
        }

        /**
         * @return dmsDbId
         */
        public Long getDmsDbId() {
            return this.dmsDbId;
        }

        /**
         * @return dmsInstanceId
         */
        public Long getDmsInstanceId() {
            return this.dmsInstanceId;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return importType
         */
        public String getImportType() {
            return this.importType;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return tableDesc
         */
        public String getTableDesc() {
            return this.tableDesc;
        }

        /**
         * @return tableId
         */
        public String getTableId() {
            return this.tableId;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String databaseName; 
            private String descUpdateTime; 
            private Long dmsDbId; 
            private Long dmsInstanceId; 
            private String gmtCreated; 
            private String importType; 
            private String instanceName; 
            private String tableDesc; 
            private String tableId; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.databaseName = model.databaseName;
                this.descUpdateTime = model.descUpdateTime;
                this.dmsDbId = model.dmsDbId;
                this.dmsInstanceId = model.dmsInstanceId;
                this.gmtCreated = model.gmtCreated;
                this.importType = model.importType;
                this.instanceName = model.instanceName;
                this.tableDesc = model.tableDesc;
                this.tableId = model.tableId;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The database name.</p>
             * <ul>
             * <li>If <code>ImportType</code> is <code>FILE</code>, this parameter returns the file name.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>diamonds.csv</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The time when the data table description was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-11T14:04:32.000+00:00</p>
             */
            public Builder descUpdateTime(String descUpdateTime) {
                this.descUpdateTime = descUpdateTime;
                return this;
            }

            /**
             * <p>The ID of the DMS database.</p>
             * <ul>
             * <li>This parameter is not returned if <code>ImportType</code> is <code>FILE</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>69950353</p>
             */
            public Builder dmsDbId(Long dmsDbId) {
                this.dmsDbId = dmsDbId;
                return this;
            }

            /**
             * <p>The ID of the DMS instance that hosts the database.</p>
             * <ul>
             * <li>This parameter is not returned if <code>ImportType</code> is <code>FILE</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2310246</p>
             */
            public Builder dmsInstanceId(Long dmsInstanceId) {
                this.dmsInstanceId = dmsInstanceId;
                return this;
            }

            /**
             * <p>The time when the data table was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-11T14:04:32.000+00:00</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The import type. Valid value:</p>
             * <ul>
             * <li><strong>FILE</strong>: The data is imported from a file.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FILE</p>
             */
            public Builder importType(String importType) {
                this.importType = importType;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * <ul>
             * <li>If <code>ImportType</code> is <code>FILE</code>, this parameter returns the file ID.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>f-ean8u5881qk4*********xh5y</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The description of the data table.</p>
             * 
             * <strong>example:</strong>
             * <p>这是一份钻石数据。</p>
             */
            public Builder tableDesc(String tableDesc) {
                this.tableDesc = tableDesc;
                return this;
            }

            /**
             * <p>The ID of the data table.</p>
             * 
             * <strong>example:</strong>
             * <p>xa8wib4ga3a2*********fjbx</p>
             */
            public Builder tableId(String tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * <p>The table name.</p>
             * 
             * <strong>example:</strong>
             * <p>diamonds</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataCenterTableResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataCenterTableResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private java.util.List<Content> content;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalElements")
        private Long totalElements;

        @com.aliyun.core.annotation.NameInMap("TotalPages")
        private Long totalPages;

        private Data(Builder builder) {
            this.content = builder.content;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalElements = builder.totalElements;
            this.totalPages = builder.totalPages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public java.util.List<Content> getContent() {
            return this.content;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalElements
         */
        public Long getTotalElements() {
            return this.totalElements;
        }

        /**
         * @return totalPages
         */
        public Long getTotalPages() {
            return this.totalPages;
        }

        public static final class Builder {
            private java.util.List<Content> content; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalElements; 
            private Long totalPages; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.content = model.content;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalElements = model.totalElements;
                this.totalPages = model.totalPages;
            } 

            /**
             * <p>A list of the data tables.</p>
             */
            public Builder content(java.util.List<Content> content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The page size.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder totalElements(Long totalElements) {
                this.totalElements = totalElements;
                return this;
            }

            /**
             * <p>The total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalPages(Long totalPages) {
                this.totalPages = totalPages;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
