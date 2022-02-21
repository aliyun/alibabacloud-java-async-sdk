// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitHotExpandTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitHotExpandTaskRequest</p>
 */
public class SubmitHotExpandTaskRequest extends Request {
    @Query
    @NameInMap("DbName")
    @Validation(required = true)
    private String dbName;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("ExtendedMapping")
    @Validation(required = true)
    private java.util.List < ExtendedMapping> extendedMapping;

    @Query
    @NameInMap("InstanceDbMapping")
    @Validation(required = true)
    private java.util.List < InstanceDbMapping> instanceDbMapping;

    @Query
    @NameInMap("Mapping")
    @Validation(required = true)
    private java.util.List < Mapping> mapping;

    @Query
    @NameInMap("SupperAccountMapping")
    private java.util.List < SupperAccountMapping> supperAccountMapping;

    @Query
    @NameInMap("TaskDesc")
    private String taskDesc;

    @Query
    @NameInMap("TaskName")
    private String taskName;

    private SubmitHotExpandTaskRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.extendedMapping = builder.extendedMapping;
        this.instanceDbMapping = builder.instanceDbMapping;
        this.mapping = builder.mapping;
        this.supperAccountMapping = builder.supperAccountMapping;
        this.taskDesc = builder.taskDesc;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitHotExpandTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return extendedMapping
     */
    public java.util.List < ExtendedMapping> getExtendedMapping() {
        return this.extendedMapping;
    }

    /**
     * @return instanceDbMapping
     */
    public java.util.List < InstanceDbMapping> getInstanceDbMapping() {
        return this.instanceDbMapping;
    }

    /**
     * @return mapping
     */
    public java.util.List < Mapping> getMapping() {
        return this.mapping;
    }

    /**
     * @return supperAccountMapping
     */
    public java.util.List < SupperAccountMapping> getSupperAccountMapping() {
        return this.supperAccountMapping;
    }

    /**
     * @return taskDesc
     */
    public String getTaskDesc() {
        return this.taskDesc;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<SubmitHotExpandTaskRequest, Builder> {
        private String dbName; 
        private String drdsInstanceId; 
        private java.util.List < ExtendedMapping> extendedMapping; 
        private java.util.List < InstanceDbMapping> instanceDbMapping; 
        private java.util.List < Mapping> mapping; 
        private java.util.List < SupperAccountMapping> supperAccountMapping; 
        private String taskDesc; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(SubmitHotExpandTaskRequest response) {
            super(response);
            this.dbName = response.dbName;
            this.drdsInstanceId = response.drdsInstanceId;
            this.extendedMapping = response.extendedMapping;
            this.instanceDbMapping = response.instanceDbMapping;
            this.mapping = response.mapping;
            this.supperAccountMapping = response.supperAccountMapping;
            this.taskDesc = response.taskDesc;
            this.taskName = response.taskName;
        } 

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * DrdsInstanceId.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * ExtendedMapping.
         */
        public Builder extendedMapping(java.util.List < ExtendedMapping> extendedMapping) {
            this.putQueryParameter("ExtendedMapping", extendedMapping);
            this.extendedMapping = extendedMapping;
            return this;
        }

        /**
         * InstanceDbMapping.
         */
        public Builder instanceDbMapping(java.util.List < InstanceDbMapping> instanceDbMapping) {
            this.putQueryParameter("InstanceDbMapping", instanceDbMapping);
            this.instanceDbMapping = instanceDbMapping;
            return this;
        }

        /**
         * Mapping.
         */
        public Builder mapping(java.util.List < Mapping> mapping) {
            this.putQueryParameter("Mapping", mapping);
            this.mapping = mapping;
            return this;
        }

        /**
         * SupperAccountMapping.
         */
        public Builder supperAccountMapping(java.util.List < SupperAccountMapping> supperAccountMapping) {
            this.putQueryParameter("SupperAccountMapping", supperAccountMapping);
            this.supperAccountMapping = supperAccountMapping;
            return this;
        }

        /**
         * TaskDesc.
         */
        public Builder taskDesc(String taskDesc) {
            this.putQueryParameter("TaskDesc", taskDesc);
            this.taskDesc = taskDesc;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public SubmitHotExpandTaskRequest build() {
            return new SubmitHotExpandTaskRequest(this);
        } 

    } 

    public static class ExtendedMapping extends TeaModel {
        @NameInMap("SrcDb")
        private String srcDb;

        @NameInMap("SrcInstanceId")
        private String srcInstanceId;

        private ExtendedMapping(Builder builder) {
            this.srcDb = builder.srcDb;
            this.srcInstanceId = builder.srcInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendedMapping create() {
            return builder().build();
        }

        /**
         * @return srcDb
         */
        public String getSrcDb() {
            return this.srcDb;
        }

        /**
         * @return srcInstanceId
         */
        public String getSrcInstanceId() {
            return this.srcInstanceId;
        }

        public static final class Builder {
            private String srcDb; 
            private String srcInstanceId; 

            /**
             * SrcDb.
             */
            public Builder srcDb(String srcDb) {
                this.srcDb = srcDb;
                return this;
            }

            /**
             * SrcInstanceId.
             */
            public Builder srcInstanceId(String srcInstanceId) {
                this.srcInstanceId = srcInstanceId;
                return this;
            }

            public ExtendedMapping build() {
                return new ExtendedMapping(this);
            } 

        } 

    }
    public static class InstanceDbMapping extends TeaModel {
        @NameInMap("DbList")
        @Validation(required = true)
        private String dbList;

        @NameInMap("InstanceName")
        private String instanceName;

        private InstanceDbMapping(Builder builder) {
            this.dbList = builder.dbList;
            this.instanceName = builder.instanceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceDbMapping create() {
            return builder().build();
        }

        /**
         * @return dbList
         */
        public String getDbList() {
            return this.dbList;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        public static final class Builder {
            private String dbList; 
            private String instanceName; 

            /**
             * DbList.
             */
            public Builder dbList(String dbList) {
                this.dbList = dbList;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            public InstanceDbMapping build() {
                return new InstanceDbMapping(this);
            } 

        } 

    }
    public static class Mapping extends TeaModel {
        @NameInMap("DbShardColumn")
        private String dbShardColumn;

        @NameInMap("HotDbName")
        private String hotDbName;

        @NameInMap("HotTableName")
        private String hotTableName;

        @NameInMap("LogicTable")
        private String logicTable;

        @NameInMap("ShardDbValue")
        private String shardDbValue;

        @NameInMap("ShardTbValue")
        private String shardTbValue;

        @NameInMap("TbShardColumn")
        private String tbShardColumn;

        private Mapping(Builder builder) {
            this.dbShardColumn = builder.dbShardColumn;
            this.hotDbName = builder.hotDbName;
            this.hotTableName = builder.hotTableName;
            this.logicTable = builder.logicTable;
            this.shardDbValue = builder.shardDbValue;
            this.shardTbValue = builder.shardTbValue;
            this.tbShardColumn = builder.tbShardColumn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Mapping create() {
            return builder().build();
        }

        /**
         * @return dbShardColumn
         */
        public String getDbShardColumn() {
            return this.dbShardColumn;
        }

        /**
         * @return hotDbName
         */
        public String getHotDbName() {
            return this.hotDbName;
        }

        /**
         * @return hotTableName
         */
        public String getHotTableName() {
            return this.hotTableName;
        }

        /**
         * @return logicTable
         */
        public String getLogicTable() {
            return this.logicTable;
        }

        /**
         * @return shardDbValue
         */
        public String getShardDbValue() {
            return this.shardDbValue;
        }

        /**
         * @return shardTbValue
         */
        public String getShardTbValue() {
            return this.shardTbValue;
        }

        /**
         * @return tbShardColumn
         */
        public String getTbShardColumn() {
            return this.tbShardColumn;
        }

        public static final class Builder {
            private String dbShardColumn; 
            private String hotDbName; 
            private String hotTableName; 
            private String logicTable; 
            private String shardDbValue; 
            private String shardTbValue; 
            private String tbShardColumn; 

            /**
             * DbShardColumn.
             */
            public Builder dbShardColumn(String dbShardColumn) {
                this.dbShardColumn = dbShardColumn;
                return this;
            }

            /**
             * HotDbName.
             */
            public Builder hotDbName(String hotDbName) {
                this.hotDbName = hotDbName;
                return this;
            }

            /**
             * HotTableName.
             */
            public Builder hotTableName(String hotTableName) {
                this.hotTableName = hotTableName;
                return this;
            }

            /**
             * LogicTable.
             */
            public Builder logicTable(String logicTable) {
                this.logicTable = logicTable;
                return this;
            }

            /**
             * ShardDbValue.
             */
            public Builder shardDbValue(String shardDbValue) {
                this.shardDbValue = shardDbValue;
                return this;
            }

            /**
             * ShardTbValue.
             */
            public Builder shardTbValue(String shardTbValue) {
                this.shardTbValue = shardTbValue;
                return this;
            }

            /**
             * TbShardColumn.
             */
            public Builder tbShardColumn(String tbShardColumn) {
                this.tbShardColumn = tbShardColumn;
                return this;
            }

            public Mapping build() {
                return new Mapping(this);
            } 

        } 

    }
    public static class SupperAccountMapping extends TeaModel {
        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("SupperAccount")
        private String supperAccount;

        @NameInMap("SupperPassword")
        private String supperPassword;

        private SupperAccountMapping(Builder builder) {
            this.instanceName = builder.instanceName;
            this.supperAccount = builder.supperAccount;
            this.supperPassword = builder.supperPassword;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupperAccountMapping create() {
            return builder().build();
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return supperAccount
         */
        public String getSupperAccount() {
            return this.supperAccount;
        }

        /**
         * @return supperPassword
         */
        public String getSupperPassword() {
            return this.supperPassword;
        }

        public static final class Builder {
            private String instanceName; 
            private String supperAccount; 
            private String supperPassword; 

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * SupperAccount.
             */
            public Builder supperAccount(String supperAccount) {
                this.supperAccount = supperAccount;
                return this;
            }

            /**
             * SupperPassword.
             */
            public Builder supperPassword(String supperPassword) {
                this.supperPassword = supperPassword;
                return this;
            }

            public SupperAccountMapping build() {
                return new SupperAccountMapping(this);
            } 

        } 

    }
}
