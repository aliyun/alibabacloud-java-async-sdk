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
 * {@link AgenticTableEngineMeta} extends {@link TeaModel}
 *
 * <p>AgenticTableEngineMeta</p>
 */
public class AgenticTableEngineMeta extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Checksum")
    private String checksum;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DataBytes")
    private Long dataBytes;

    @com.aliyun.core.annotation.NameInMap("Encoding")
    private String encoding;

    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("FullChecksum")
    private String fullChecksum;

    @com.aliyun.core.annotation.NameInMap("IndexBytes")
    private Long indexBytes;

    @com.aliyun.core.annotation.NameInMap("LastDdlTime")
    private String lastDdlTime;

    @com.aliyun.core.annotation.NameInMap("NumRows")
    private Long numRows;

    @com.aliyun.core.annotation.NameInMap("RefInfo")
    private String refInfo;

    @com.aliyun.core.annotation.NameInMap("StorageCapacity")
    private Long storageCapacity;

    @com.aliyun.core.annotation.NameInMap("TableSchemaName")
    private String tableSchemaName;

    private AgenticTableEngineMeta(Builder builder) {
        this.checksum = builder.checksum;
        this.createTime = builder.createTime;
        this.dataBytes = builder.dataBytes;
        this.encoding = builder.encoding;
        this.engine = builder.engine;
        this.fullChecksum = builder.fullChecksum;
        this.indexBytes = builder.indexBytes;
        this.lastDdlTime = builder.lastDdlTime;
        this.numRows = builder.numRows;
        this.refInfo = builder.refInfo;
        this.storageCapacity = builder.storageCapacity;
        this.tableSchemaName = builder.tableSchemaName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgenticTableEngineMeta create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checksum
     */
    public String getChecksum() {
        return this.checksum;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return dataBytes
     */
    public Long getDataBytes() {
        return this.dataBytes;
    }

    /**
     * @return encoding
     */
    public String getEncoding() {
        return this.encoding;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return fullChecksum
     */
    public String getFullChecksum() {
        return this.fullChecksum;
    }

    /**
     * @return indexBytes
     */
    public Long getIndexBytes() {
        return this.indexBytes;
    }

    /**
     * @return lastDdlTime
     */
    public String getLastDdlTime() {
        return this.lastDdlTime;
    }

    /**
     * @return numRows
     */
    public Long getNumRows() {
        return this.numRows;
    }

    /**
     * @return refInfo
     */
    public String getRefInfo() {
        return this.refInfo;
    }

    /**
     * @return storageCapacity
     */
    public Long getStorageCapacity() {
        return this.storageCapacity;
    }

    /**
     * @return tableSchemaName
     */
    public String getTableSchemaName() {
        return this.tableSchemaName;
    }

    public static final class Builder {
        private String checksum; 
        private String createTime; 
        private Long dataBytes; 
        private String encoding; 
        private String engine; 
        private String fullChecksum; 
        private Long indexBytes; 
        private String lastDdlTime; 
        private Long numRows; 
        private String refInfo; 
        private Long storageCapacity; 
        private String tableSchemaName; 

        private Builder() {
        } 

        private Builder(AgenticTableEngineMeta model) {
            this.checksum = model.checksum;
            this.createTime = model.createTime;
            this.dataBytes = model.dataBytes;
            this.encoding = model.encoding;
            this.engine = model.engine;
            this.fullChecksum = model.fullChecksum;
            this.indexBytes = model.indexBytes;
            this.lastDdlTime = model.lastDdlTime;
            this.numRows = model.numRows;
            this.refInfo = model.refInfo;
            this.storageCapacity = model.storageCapacity;
            this.tableSchemaName = model.tableSchemaName;
        } 

        /**
         * <p>The checksum of the table metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>9f86d081884c7d65****</p>
         */
        public Builder checksum(String checksum) {
            this.checksum = checksum;
            return this;
        }

        /**
         * <p>The time when the table was created. The format is yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01 10:00:00</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The data size of the table. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>786432</p>
         */
        public Builder dataBytes(Long dataBytes) {
            this.dataBytes = dataBytes;
            return this;
        }

        /**
         * <p>The character set encoding of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>utf8mb4</p>
         */
        public Builder encoding(String encoding) {
            this.encoding = encoding;
            return this;
        }

        /**
         * <p>The storage engine of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>InnoDB</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>The full checksum of the table metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>2c26b46b68ffc68f****</p>
         */
        public Builder fullChecksum(String fullChecksum) {
            this.fullChecksum = fullChecksum;
            return this;
        }

        /**
         * <p>The index size of the table. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>262144</p>
         */
        public Builder indexBytes(Long indexBytes) {
            this.indexBytes = indexBytes;
            return this;
        }

        /**
         * <p>The time when the last DDL operation was executed on the table. The format is yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-02 10:00:00</p>
         */
        public Builder lastDdlTime(String lastDdlTime) {
            this.lastDdlTime = lastDdlTime;
            return this;
        }

        /**
         * <p>The number of rows in the table.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder numRows(Long numRows) {
            this.numRows = numRows;
            return this;
        }

        /**
         * <p>The reference information of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>order_db.orders_view</p>
         */
        public Builder refInfo(String refInfo) {
            this.refInfo = refInfo;
            return this;
        }

        /**
         * <p>The storage capacity of the table. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder storageCapacity(Long storageCapacity) {
            this.storageCapacity = storageCapacity;
            return this;
        }

        /**
         * <p>The name of the schema to which the table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        public Builder tableSchemaName(String tableSchemaName) {
            this.tableSchemaName = tableSchemaName;
            return this;
        }

        public AgenticTableEngineMeta build() {
            return new AgenticTableEngineMeta(this);
        } 

    } 

}
