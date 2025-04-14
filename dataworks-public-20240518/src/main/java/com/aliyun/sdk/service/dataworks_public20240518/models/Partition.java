// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link Partition} extends {@link TeaModel}
 *
 * <p>Partition</p>
 */
public class Partition extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("DataSize")
    private Long dataSize;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private Long modifyTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RecordCount")
    private Long recordCount;

    @com.aliyun.core.annotation.NameInMap("TableId")
    private String tableId;

    private Partition(Builder builder) {
        this.createTime = builder.createTime;
        this.dataSize = builder.dataSize;
        this.modifyTime = builder.modifyTime;
        this.name = builder.name;
        this.recordCount = builder.recordCount;
        this.tableId = builder.tableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Partition create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return dataSize
     */
    public Long getDataSize() {
        return this.dataSize;
    }

    /**
     * @return modifyTime
     */
    public Long getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return recordCount
     */
    public Long getRecordCount() {
        return this.recordCount;
    }

    /**
     * @return tableId
     */
    public String getTableId() {
        return this.tableId;
    }

    public static final class Builder {
        private Long createTime; 
        private Long dataSize; 
        private Long modifyTime; 
        private String name; 
        private Long recordCount; 
        private String tableId; 

        private Builder() {
        } 

        private Builder(Partition model) {
            this.createTime = model.createTime;
            this.dataSize = model.dataSize;
            this.modifyTime = model.modifyTime;
            this.name = model.name;
            this.recordCount = model.recordCount;
            this.tableId = model.tableId;
        } 

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DataSize.
         */
        public Builder dataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }

        /**
         * ModifyTime.
         */
        public Builder modifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * RecordCount.
         */
        public Builder recordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }

        /**
         * TableId.
         */
        public Builder tableId(String tableId) {
            this.tableId = tableId;
            return this;
        }

        public Partition build() {
            return new Partition(this);
        } 

    } 

}
