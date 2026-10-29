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
         * Checksum.
         */
        public Builder checksum(String checksum) {
            this.checksum = checksum;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DataBytes.
         */
        public Builder dataBytes(Long dataBytes) {
            this.dataBytes = dataBytes;
            return this;
        }

        /**
         * Encoding.
         */
        public Builder encoding(String encoding) {
            this.encoding = encoding;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * FullChecksum.
         */
        public Builder fullChecksum(String fullChecksum) {
            this.fullChecksum = fullChecksum;
            return this;
        }

        /**
         * IndexBytes.
         */
        public Builder indexBytes(Long indexBytes) {
            this.indexBytes = indexBytes;
            return this;
        }

        /**
         * LastDdlTime.
         */
        public Builder lastDdlTime(String lastDdlTime) {
            this.lastDdlTime = lastDdlTime;
            return this;
        }

        /**
         * NumRows.
         */
        public Builder numRows(Long numRows) {
            this.numRows = numRows;
            return this;
        }

        /**
         * RefInfo.
         */
        public Builder refInfo(String refInfo) {
            this.refInfo = refInfo;
            return this;
        }

        /**
         * StorageCapacity.
         */
        public Builder storageCapacity(Long storageCapacity) {
            this.storageCapacity = storageCapacity;
            return this;
        }

        /**
         * TableSchemaName.
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
