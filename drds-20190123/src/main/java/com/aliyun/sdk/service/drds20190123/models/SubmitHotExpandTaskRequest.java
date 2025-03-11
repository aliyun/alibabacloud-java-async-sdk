// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link SubmitHotExpandTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitHotExpandTaskRequest</p>
 */
public class SubmitHotExpandTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtendedMapping")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ExtendedMapping> extendedMapping;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceDbMapping")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<InstanceDbMapping> instanceDbMapping;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mapping")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Mapping> mapping;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupperAccountMapping")
    private java.util.List<SupperAccountMapping> supperAccountMapping;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskDesc")
    private String taskDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
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
    public java.util.List<ExtendedMapping> getExtendedMapping() {
        return this.extendedMapping;
    }

    /**
     * @return instanceDbMapping
     */
    public java.util.List<InstanceDbMapping> getInstanceDbMapping() {
        return this.instanceDbMapping;
    }

    /**
     * @return mapping
     */
    public java.util.List<Mapping> getMapping() {
        return this.mapping;
    }

    /**
     * @return supperAccountMapping
     */
    public java.util.List<SupperAccountMapping> getSupperAccountMapping() {
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
        private java.util.List<ExtendedMapping> extendedMapping; 
        private java.util.List<InstanceDbMapping> instanceDbMapping; 
        private java.util.List<Mapping> mapping; 
        private java.util.List<SupperAccountMapping> supperAccountMapping; 
        private String taskDesc; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(SubmitHotExpandTaskRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.drdsInstanceId = request.drdsInstanceId;
            this.extendedMapping = request.extendedMapping;
            this.instanceDbMapping = request.instanceDbMapping;
            this.mapping = request.mapping;
            this.supperAccountMapping = request.supperAccountMapping;
            this.taskDesc = request.taskDesc;
            this.taskName = request.taskName;
        } 

        /**
         * <p>The name of the database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drdshbga1138****</p>
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * <p>The information about the database on which you want to perform hot-spot scale-out.</p>
         * <p>This parameter is required.</p>
         */
        public Builder extendedMapping(java.util.List<ExtendedMapping> extendedMapping) {
            this.putQueryParameter("ExtendedMapping", extendedMapping);
            this.extendedMapping = extendedMapping;
            return this;
        }

        /**
         * <p>The information about the instance to which the hot-spot database belongs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder instanceDbMapping(java.util.List<InstanceDbMapping> instanceDbMapping) {
            this.putQueryParameter("InstanceDbMapping", instanceDbMapping);
            this.instanceDbMapping = instanceDbMapping;
            return this;
        }

        /**
         * <p>The information about the hot-spot database.</p>
         * <p>This parameter is required.</p>
         */
        public Builder mapping(java.util.List<Mapping> mapping) {
            this.putQueryParameter("Mapping", mapping);
            this.mapping = mapping;
            return this;
        }

        /**
         * <p>The information about the privileged account.</p>
         */
        public Builder supperAccountMapping(java.util.List<SupperAccountMapping> supperAccountMapping) {
            this.putQueryParameter("SupperAccountMapping", supperAccountMapping);
            this.supperAccountMapping = supperAccountMapping;
            return this;
        }

        /**
         * <p>The description of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder taskDesc(String taskDesc) {
            this.putQueryParameter("TaskDesc", taskDesc);
            this.taskDesc = taskDesc;
            return this;
        }

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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

    /**
     * 
     * {@link SubmitHotExpandTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitHotExpandTaskRequest</p>
     */
    public static class ExtendedMapping extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SrcDb")
        private String srcDb;

        @com.aliyun.core.annotation.NameInMap("SrcInstanceId")
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
             * <p>The name of the source physical database.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder srcDb(String srcDb) {
                this.srcDb = srcDb;
                return this;
            }

            /**
             * <p>The ID of the ApsaraDB RDS instance to which the source physical database belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1t1mk5a5bdj****</p>
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
    /**
     * 
     * {@link SubmitHotExpandTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitHotExpandTaskRequest</p>
     */
    public static class InstanceDbMapping extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbList")
        @com.aliyun.core.annotation.Validation(required = true)
        private String dbList;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
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
             * <p>The name of the hot-spot database.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>hot_test_****_****</p>
             */
            public Builder dbList(String dbList) {
                this.dbList = dbList;
                return this;
            }

            /**
             * <p>The name of the ApsaraDB RDS instance to which the hot-spot database belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1t1mk5a5bdj****</p>
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
    /**
     * 
     * {@link SubmitHotExpandTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitHotExpandTaskRequest</p>
     */
    public static class Mapping extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbShardColumn")
        private String dbShardColumn;

        @com.aliyun.core.annotation.NameInMap("HotDbName")
        private String hotDbName;

        @com.aliyun.core.annotation.NameInMap("HotTableName")
        private String hotTableName;

        @com.aliyun.core.annotation.NameInMap("LogicTable")
        private String logicTable;

        @com.aliyun.core.annotation.NameInMap("ShardDbValue")
        private String shardDbValue;

        @com.aliyun.core.annotation.NameInMap("ShardTbValue")
        private String shardTbValue;

        @com.aliyun.core.annotation.NameInMap("TbShardColumn")
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
             * <p>The shard key used to split the database to which the associated table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>platform</p>
             */
            public Builder dbShardColumn(String dbShardColumn) {
                this.dbShardColumn = dbShardColumn;
                return this;
            }

            /**
             * <p>The name of the hot-spot database.</p>
             * 
             * <strong>example:</strong>
             * <p>hot_test_****_****</p>
             */
            public Builder hotDbName(String hotDbName) {
                this.hotDbName = hotDbName;
                return this;
            }

            /**
             * <p>The name of the hot-spot table. The name must be prefixed with the name of a logical table.</p>
             * 
             * <strong>example:</strong>
             * <p>test_table_*****</p>
             */
            public Builder hotTableName(String hotTableName) {
                this.hotTableName = hotTableName;
                return this;
            }

            /**
             * <p>The name of the logical table on which you want to perform hot-spot scale-out.</p>
             * 
             * <strong>example:</strong>
             * <p>test_table</p>
             */
            public Builder logicTable(String logicTable) {
                this.logicTable = logicTable;
                return this;
            }

            /**
             * <p>The value of the shard key used to split a database.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder shardDbValue(String shardDbValue) {
                this.shardDbValue = shardDbValue;
                return this;
            }

            /**
             * <p>The value of the shard key used to split a table.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder shardTbValue(String shardTbValue) {
                this.shardTbValue = shardTbValue;
                return this;
            }

            /**
             * <p>The shard key used to split an associated table.</p>
             * 
             * <strong>example:</strong>
             * <p>platform</p>
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
    /**
     * 
     * {@link SubmitHotExpandTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitHotExpandTaskRequest</p>
     */
    public static class SupperAccountMapping extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("SupperAccount")
        private String supperAccount;

        @com.aliyun.core.annotation.NameInMap("SupperPassword")
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
             * <p>The ID of the ApsaraDB RDS instance that has the privileged account.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1t1mk5a5bdj****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The name of the privileged account of the ApsaraDB RDS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder supperAccount(String supperAccount) {
                this.supperAccount = supperAccount;
                return this;
            }

            /**
             * <p>The password of the privileged account of the ApsaraDB RDS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>11111111</p>
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
