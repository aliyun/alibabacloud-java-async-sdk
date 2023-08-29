// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ColumnStatisticsDesc} extends {@link TeaModel}
 *
 * <p>ColumnStatisticsDesc</p>
 */
public class ColumnStatisticsDesc extends TeaModel {
    @NameInMap("LastAnalyzedTime")
    private Long lastAnalyzedTime;

    @NameInMap("PartitionName")
    private String partitionName;

    private ColumnStatisticsDesc(Builder builder) {
        this.lastAnalyzedTime = builder.lastAnalyzedTime;
        this.partitionName = builder.partitionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ColumnStatisticsDesc create() {
        return builder().build();
    }

    /**
     * @return lastAnalyzedTime
     */
    public Long getLastAnalyzedTime() {
        return this.lastAnalyzedTime;
    }

    /**
     * @return partitionName
     */
    public String getPartitionName() {
        return this.partitionName;
    }

    public static final class Builder {
        private Long lastAnalyzedTime; 
        private String partitionName; 

        /**
         * LastAnalyzedTime.
         */
        public Builder lastAnalyzedTime(Long lastAnalyzedTime) {
            this.lastAnalyzedTime = lastAnalyzedTime;
            return this;
        }

        /**
         * PartitionName.
         */
        public Builder partitionName(String partitionName) {
            this.partitionName = partitionName;
            return this;
        }

        public ColumnStatisticsDesc build() {
            return new ColumnStatisticsDesc(this);
        } 

    } 

}
