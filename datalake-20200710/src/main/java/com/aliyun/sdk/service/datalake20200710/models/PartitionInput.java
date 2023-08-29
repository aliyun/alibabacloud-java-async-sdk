// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PartitionInput} extends {@link TeaModel}
 *
 * <p>PartitionInput</p>
 */
public class PartitionInput extends TeaModel {
    @NameInMap("CreateTime")
    private Integer createTime;

    @NameInMap("DatabaseName")
    private String databaseName;

    @NameInMap("LastAccessTime")
    private Integer lastAccessTime;

    @NameInMap("LastAnalyzedTime")
    private Integer lastAnalyzedTime;

    @NameInMap("Parameters")
    private java.util.Map < String, String > parameters;

    @NameInMap("Privileges")
    private PrincipalPrivilegeSet privileges;

    @NameInMap("Sd")
    private StorageDescriptor sd;

    @NameInMap("TableName")
    private String tableName;

    @NameInMap("Values")
    private java.util.List < String > values;

    private PartitionInput(Builder builder) {
        this.createTime = builder.createTime;
        this.databaseName = builder.databaseName;
        this.lastAccessTime = builder.lastAccessTime;
        this.lastAnalyzedTime = builder.lastAnalyzedTime;
        this.parameters = builder.parameters;
        this.privileges = builder.privileges;
        this.sd = builder.sd;
        this.tableName = builder.tableName;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PartitionInput create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public Integer getCreateTime() {
        return this.createTime;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return lastAccessTime
     */
    public Integer getLastAccessTime() {
        return this.lastAccessTime;
    }

    /**
     * @return lastAnalyzedTime
     */
    public Integer getLastAnalyzedTime() {
        return this.lastAnalyzedTime;
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, String > getParameters() {
        return this.parameters;
    }

    /**
     * @return privileges
     */
    public PrincipalPrivilegeSet getPrivileges() {
        return this.privileges;
    }

    /**
     * @return sd
     */
    public StorageDescriptor getSd() {
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
    public java.util.List < String > getValues() {
        return this.values;
    }

    public static final class Builder {
        private Integer createTime; 
        private String databaseName; 
        private Integer lastAccessTime; 
        private Integer lastAnalyzedTime; 
        private java.util.Map < String, String > parameters; 
        private PrincipalPrivilegeSet privileges; 
        private StorageDescriptor sd; 
        private String tableName; 
        private java.util.List < String > values; 

        /**
         * CreateTime.
         */
        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DatabaseName.
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
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
         * LastAnalyzedTime.
         */
        public Builder lastAnalyzedTime(Integer lastAnalyzedTime) {
            this.lastAnalyzedTime = lastAnalyzedTime;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.Map < String, String > parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * Privileges.
         */
        public Builder privileges(PrincipalPrivilegeSet privileges) {
            this.privileges = privileges;
            return this;
        }

        /**
         * Sd.
         */
        public Builder sd(StorageDescriptor sd) {
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
        public Builder values(java.util.List < String > values) {
            this.values = values;
            return this;
        }

        public PartitionInput build() {
            return new PartitionInput(this);
        } 

    } 

}
