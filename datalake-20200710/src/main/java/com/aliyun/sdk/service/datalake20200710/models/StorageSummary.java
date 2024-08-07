// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StorageSummary} extends {@link TeaModel}
 *
 * <p>StorageSummary</p>
 */
public class StorageSummary extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatabaseNum")
    private Integer databaseNum;

    @com.aliyun.core.annotation.NameInMap("PartitionNum")
    private Integer partitionNum;

    @com.aliyun.core.annotation.NameInMap("TableNum")
    private Integer tableNum;

    private StorageSummary(Builder builder) {
        this.databaseNum = builder.databaseNum;
        this.partitionNum = builder.partitionNum;
        this.tableNum = builder.tableNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StorageSummary create() {
        return builder().build();
    }

    /**
     * @return databaseNum
     */
    public Integer getDatabaseNum() {
        return this.databaseNum;
    }

    /**
     * @return partitionNum
     */
    public Integer getPartitionNum() {
        return this.partitionNum;
    }

    /**
     * @return tableNum
     */
    public Integer getTableNum() {
        return this.tableNum;
    }

    public static final class Builder {
        private Integer databaseNum; 
        private Integer partitionNum; 
        private Integer tableNum; 

        /**
         * DatabaseNum.
         */
        public Builder databaseNum(Integer databaseNum) {
            this.databaseNum = databaseNum;
            return this;
        }

        /**
         * PartitionNum.
         */
        public Builder partitionNum(Integer partitionNum) {
            this.partitionNum = partitionNum;
            return this;
        }

        /**
         * TableNum.
         */
        public Builder tableNum(Integer tableNum) {
            this.tableNum = tableNum;
            return this;
        }

        public StorageSummary build() {
            return new StorageSummary(this);
        } 

    } 

}
