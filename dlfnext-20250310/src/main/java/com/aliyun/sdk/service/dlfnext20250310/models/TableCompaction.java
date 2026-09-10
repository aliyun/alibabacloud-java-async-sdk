// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link TableCompaction} extends {@link TeaModel}
 *
 * <p>TableCompaction</p>
 */
public class TableCompaction extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("catalogId")
    private String catalogId;

    @com.aliyun.core.annotation.NameInMap("cuUsage")
    private Double cuUsage;

    @com.aliyun.core.annotation.NameInMap("lastCompactedFileTime")
    @Deprecated
    private Long lastCompactedFileTime;

    @com.aliyun.core.annotation.NameInMap("latencyFileEarliestTime")
    private Long latencyFileEarliestTime;

    @com.aliyun.core.annotation.NameInMap("maxLevel0FileCount")
    @Deprecated
    private String maxLevel0FileCount;

    @com.aliyun.core.annotation.NameInMap("tableId")
    private String tableId;

    private TableCompaction(Builder builder) {
        this.catalogId = builder.catalogId;
        this.cuUsage = builder.cuUsage;
        this.lastCompactedFileTime = builder.lastCompactedFileTime;
        this.latencyFileEarliestTime = builder.latencyFileEarliestTime;
        this.maxLevel0FileCount = builder.maxLevel0FileCount;
        this.tableId = builder.tableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TableCompaction create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return cuUsage
     */
    public Double getCuUsage() {
        return this.cuUsage;
    }

    /**
     * @return lastCompactedFileTime
     */
    public Long getLastCompactedFileTime() {
        return this.lastCompactedFileTime;
    }

    /**
     * @return latencyFileEarliestTime
     */
    public Long getLatencyFileEarliestTime() {
        return this.latencyFileEarliestTime;
    }

    /**
     * @return maxLevel0FileCount
     */
    public String getMaxLevel0FileCount() {
        return this.maxLevel0FileCount;
    }

    /**
     * @return tableId
     */
    public String getTableId() {
        return this.tableId;
    }

    public static final class Builder {
        private String catalogId; 
        private Double cuUsage; 
        private Long lastCompactedFileTime; 
        private Long latencyFileEarliestTime; 
        private String maxLevel0FileCount; 
        private String tableId; 

        private Builder() {
        } 

        private Builder(TableCompaction model) {
            this.catalogId = model.catalogId;
            this.cuUsage = model.cuUsage;
            this.lastCompactedFileTime = model.lastCompactedFileTime;
            this.latencyFileEarliestTime = model.latencyFileEarliestTime;
            this.maxLevel0FileCount = model.maxLevel0FileCount;
            this.tableId = model.tableId;
        } 

        /**
         * <p>The catalog ID.</p>
         * 
         * <strong>example:</strong>
         * <p>clg-paimon-xxx</p>
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /**
         * <p>The total CU usage.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cuUsage(Double cuUsage) {
            this.cuUsage = cuUsage;
            return this;
        }

        /**
         * <p>The time when the last file was compacted.</p>
         * 
         * <strong>example:</strong>
         * <p>1759111660075</p>
         */
        public Builder lastCompactedFileTime(Long lastCompactedFileTime) {
            this.lastCompactedFileTime = lastCompactedFileTime;
            return this;
        }

        /**
         * <p>The earliest creation time of uncompacted files.</p>
         * 
         * <strong>example:</strong>
         * <p>1760321763633</p>
         */
        public Builder latencyFileEarliestTime(Long latencyFileEarliestTime) {
            this.latencyFileEarliestTime = latencyFileEarliestTime;
            return this;
        }

        /**
         * <p>The number of Level 0 files.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maxLevel0FileCount(String maxLevel0FileCount) {
            this.maxLevel0FileCount = maxLevel0FileCount;
            return this;
        }

        /**
         * <p>The table ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tbl-xxx</p>
         */
        public Builder tableId(String tableId) {
            this.tableId = tableId;
            return this;
        }

        public TableCompaction build() {
            return new TableCompaction(this);
        } 

    } 

}
