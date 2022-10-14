// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PartitionProfile} extends {@link TeaModel}
 *
 * <p>PartitionProfile</p>
 */
public class PartitionProfile extends TeaModel {
    @NameInMap("ArchiveStatus")
    private String archiveStatus;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("DatabaseName")
    private String databaseName;

    @NameInMap("DmlTime")
    private String dmlTime;

    @NameInMap("Location")
    private String location;

    @NameInMap("PartitionName")
    private String partitionName;

    @NameInMap("TableName")
    private String tableName;

    private PartitionProfile(Builder builder) {
        this.archiveStatus = builder.archiveStatus;
        this.createTime = builder.createTime;
        this.databaseName = builder.databaseName;
        this.dmlTime = builder.dmlTime;
        this.location = builder.location;
        this.partitionName = builder.partitionName;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PartitionProfile create() {
        return builder().build();
    }

    /**
     * @return archiveStatus
     */
    public String getArchiveStatus() {
        return this.archiveStatus;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return dmlTime
     */
    public String getDmlTime() {
        return this.dmlTime;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return partitionName
     */
    public String getPartitionName() {
        return this.partitionName;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder {
        private String archiveStatus; 
        private String createTime; 
        private String databaseName; 
        private String dmlTime; 
        private String location; 
        private String partitionName; 
        private String tableName; 

        /**
         * oss存储类型
         */
        public Builder archiveStatus(String archiveStatus) {
            this.archiveStatus = archiveStatus;
            return this;
        }

        /**
         * 创建时间
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * 库名称
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * dml时间
         */
        public Builder dmlTime(String dmlTime) {
            this.dmlTime = dmlTime;
            return this;
        }

        /**
         * 存储位置
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * 分区名称
         */
        public Builder partitionName(String partitionName) {
            this.partitionName = partitionName;
            return this;
        }

        /**
         * 表名称
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        public PartitionProfile build() {
            return new PartitionProfile(this);
        } 

    } 

}
