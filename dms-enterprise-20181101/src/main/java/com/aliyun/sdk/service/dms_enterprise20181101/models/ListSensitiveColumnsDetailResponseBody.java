// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListSensitiveColumnsDetailResponseBody} extends {@link TeaModel}
 *
 * <p>ListSensitiveColumnsDetailResponseBody</p>
 */
public class ListSensitiveColumnsDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SensitiveColumnsDetailList")
    private SensitiveColumnsDetailList sensitiveColumnsDetailList;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListSensitiveColumnsDetailResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.sensitiveColumnsDetailList = builder.sensitiveColumnsDetailList;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSensitiveColumnsDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return sensitiveColumnsDetailList
     */
    public SensitiveColumnsDetailList getSensitiveColumnsDetailList() {
        return this.sensitiveColumnsDetailList;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private SensitiveColumnsDetailList sensitiveColumnsDetailList; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListSensitiveColumnsDetailResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.sensitiveColumnsDetailList = model.sensitiveColumnsDetailList;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7629888F-C9FB-4D16-A7D3-B443FE06FBD4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the sensitive field.</p>
         */
        public Builder sensitiveColumnsDetailList(SensitiveColumnsDetailList sensitiveColumnsDetailList) {
            this.sensitiveColumnsDetailList = sensitiveColumnsDetailList;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListSensitiveColumnsDetailResponseBody build() {
            return new ListSensitiveColumnsDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSensitiveColumnsDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListSensitiveColumnsDetailResponseBody</p>
     */
    public static class SensitiveColumnsDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnDescription")
        private String columnDescription;

        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("ColumnType")
        private String columnType;

        @com.aliyun.core.annotation.NameInMap("DbId")
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private Boolean logic;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("SearchName")
        private String searchName;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private SensitiveColumnsDetail(Builder builder) {
            this.columnDescription = builder.columnDescription;
            this.columnName = builder.columnName;
            this.columnType = builder.columnType;
            this.dbId = builder.dbId;
            this.dbType = builder.dbType;
            this.envType = builder.envType;
            this.logic = builder.logic;
            this.schemaName = builder.schemaName;
            this.searchName = builder.searchName;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveColumnsDetail create() {
            return builder().build();
        }

        /**
         * @return columnDescription
         */
        public String getColumnDescription() {
            return this.columnDescription;
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return columnType
         */
        public String getColumnType() {
            return this.columnType;
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return searchName
         */
        public String getSearchName() {
            return this.searchName;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String columnDescription; 
            private String columnName; 
            private String columnType; 
            private Long dbId; 
            private String dbType; 
            private String envType; 
            private Boolean logic; 
            private String schemaName; 
            private String searchName; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(SensitiveColumnsDetail model) {
                this.columnDescription = model.columnDescription;
                this.columnName = model.columnName;
                this.columnType = model.columnType;
                this.dbId = model.dbId;
                this.dbType = model.dbType;
                this.envType = model.envType;
                this.logic = model.logic;
                this.schemaName = model.schemaName;
                this.searchName = model.searchName;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The description of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder columnDescription(String columnDescription) {
                this.columnDescription = columnDescription;
                return this;
            }

            /**
             * <p>The name of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>ColumnName_test</p>
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * <p>The data type of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>varchar(32)</p>
             */
            public Builder columnType(String columnType) {
                this.columnType = columnType;
                return this;
            }

            /**
             * <p>The ID of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>1860****</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The type of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * <p>The type of the environment to which the database belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>product</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>Indicates whether the database is a logical database. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The database is a logical database.</li>
             * <li><strong>false</strong>: The database is not a logical database.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>SchemaName_test</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The name that is used to search for the database.</p>
             * 
             * <strong>example:</strong>
             * <p>test@xxx:3306</p>
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public SensitiveColumnsDetail build() {
                return new SensitiveColumnsDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSensitiveColumnsDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListSensitiveColumnsDetailResponseBody</p>
     */
    public static class SensitiveColumnsDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SensitiveColumnsDetail")
        private java.util.List<SensitiveColumnsDetail> sensitiveColumnsDetail;

        private SensitiveColumnsDetailList(Builder builder) {
            this.sensitiveColumnsDetail = builder.sensitiveColumnsDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveColumnsDetailList create() {
            return builder().build();
        }

        /**
         * @return sensitiveColumnsDetail
         */
        public java.util.List<SensitiveColumnsDetail> getSensitiveColumnsDetail() {
            return this.sensitiveColumnsDetail;
        }

        public static final class Builder {
            private java.util.List<SensitiveColumnsDetail> sensitiveColumnsDetail; 

            private Builder() {
            } 

            private Builder(SensitiveColumnsDetailList model) {
                this.sensitiveColumnsDetail = model.sensitiveColumnsDetail;
            } 

            /**
             * SensitiveColumnsDetail.
             */
            public Builder sensitiveColumnsDetail(java.util.List<SensitiveColumnsDetail> sensitiveColumnsDetail) {
                this.sensitiveColumnsDetail = sensitiveColumnsDetail;
                return this;
            }

            public SensitiveColumnsDetailList build() {
                return new SensitiveColumnsDetailList(this);
            } 

        } 

    }
}
