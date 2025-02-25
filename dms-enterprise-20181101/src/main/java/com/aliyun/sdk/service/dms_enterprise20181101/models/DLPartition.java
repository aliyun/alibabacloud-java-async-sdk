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
 * {@link DLPartition} extends {@link TeaModel}
 *
 * <p>DLPartition</p>
 */
public class DLPartition extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CatalogName")
    private String catalogName;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Integer createTime;

    @com.aliyun.core.annotation.NameInMap("DbName")
    private String dbName;

    @com.aliyun.core.annotation.NameInMap("LastAccessTime")
    private Integer lastAccessTime;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map<String, String> parameters;

    @com.aliyun.core.annotation.NameInMap("Sd")
    private DLStorageDescriptor sd;

    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    @com.aliyun.core.annotation.NameInMap("Values")
    private java.util.List<String> values;

    private DLPartition(Builder builder) {
        this.catalogName = builder.catalogName;
        this.createTime = builder.createTime;
        this.dbName = builder.dbName;
        this.lastAccessTime = builder.lastAccessTime;
        this.parameters = builder.parameters;
        this.sd = builder.sd;
        this.tableName = builder.tableName;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DLPartition create() {
        return builder().build();
    }

    /**
     * @return catalogName
     */
    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * @return createTime
     */
    public Integer getCreateTime() {
        return this.createTime;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return lastAccessTime
     */
    public Integer getLastAccessTime() {
        return this.lastAccessTime;
    }

    /**
     * @return parameters
     */
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    /**
     * @return sd
     */
    public DLStorageDescriptor getSd() {
        return this.sd;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return values
     */
    public java.util.List<String> getValues() {
        return this.values;
    }

    public static final class Builder {
        private String catalogName; 
        private Integer createTime; 
        private String dbName; 
        private Integer lastAccessTime; 
        private java.util.Map<String, String> parameters; 
        private DLStorageDescriptor sd; 
        private String tableName; 
        private java.util.List<String> values; 

        /**
         * CatalogName.
         */
        public Builder catalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.dbName = dbName;
            return this;
        }

        /**
         * LastAccessTime.
         */
        public Builder lastAccessTime(Integer lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * Sd.
         */
        public Builder sd(DLStorageDescriptor sd) {
            this.sd = sd;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * Values.
         */
        public Builder values(java.util.List<String> values) {
            this.values = values;
            return this;
        }

        public DLPartition build() {
            return new DLPartition(this);
        } 

    } 

}
