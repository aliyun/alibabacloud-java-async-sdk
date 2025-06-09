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
 * {@link CatalogSummary} extends {@link TeaModel}
 *
 * <p>CatalogSummary</p>
 */
public class CatalogSummary extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiVisitCountMonthly")
    private Long apiVisitCountMonthly;

    @com.aliyun.core.annotation.NameInMap("databaseCount")
    private MoMValues databaseCount;

    @com.aliyun.core.annotation.NameInMap("generatedDate")
    private String generatedDate;

    @com.aliyun.core.annotation.NameInMap("partitionCount")
    private MoMValues partitionCount;

    @com.aliyun.core.annotation.NameInMap("tableCount")
    private MoMValues tableCount;

    @com.aliyun.core.annotation.NameInMap("throughputMonthly")
    private Long throughputMonthly;

    @com.aliyun.core.annotation.NameInMap("totalFileCount")
    private MoMValues totalFileCount;

    @com.aliyun.core.annotation.NameInMap("totalFileSizeInBytes")
    private MoMValues totalFileSizeInBytes;

    private CatalogSummary(Builder builder) {
        this.apiVisitCountMonthly = builder.apiVisitCountMonthly;
        this.databaseCount = builder.databaseCount;
        this.generatedDate = builder.generatedDate;
        this.partitionCount = builder.partitionCount;
        this.tableCount = builder.tableCount;
        this.throughputMonthly = builder.throughputMonthly;
        this.totalFileCount = builder.totalFileCount;
        this.totalFileSizeInBytes = builder.totalFileSizeInBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CatalogSummary create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiVisitCountMonthly
     */
    public Long getApiVisitCountMonthly() {
        return this.apiVisitCountMonthly;
    }

    /**
     * @return databaseCount
     */
    public MoMValues getDatabaseCount() {
        return this.databaseCount;
    }

    /**
     * @return generatedDate
     */
    public String getGeneratedDate() {
        return this.generatedDate;
    }

    /**
     * @return partitionCount
     */
    public MoMValues getPartitionCount() {
        return this.partitionCount;
    }

    /**
     * @return tableCount
     */
    public MoMValues getTableCount() {
        return this.tableCount;
    }

    /**
     * @return throughputMonthly
     */
    public Long getThroughputMonthly() {
        return this.throughputMonthly;
    }

    /**
     * @return totalFileCount
     */
    public MoMValues getTotalFileCount() {
        return this.totalFileCount;
    }

    /**
     * @return totalFileSizeInBytes
     */
    public MoMValues getTotalFileSizeInBytes() {
        return this.totalFileSizeInBytes;
    }

    public static final class Builder {
        private Long apiVisitCountMonthly; 
        private MoMValues databaseCount; 
        private String generatedDate; 
        private MoMValues partitionCount; 
        private MoMValues tableCount; 
        private Long throughputMonthly; 
        private MoMValues totalFileCount; 
        private MoMValues totalFileSizeInBytes; 

        private Builder() {
        } 

        private Builder(CatalogSummary model) {
            this.apiVisitCountMonthly = model.apiVisitCountMonthly;
            this.databaseCount = model.databaseCount;
            this.generatedDate = model.generatedDate;
            this.partitionCount = model.partitionCount;
            this.tableCount = model.tableCount;
            this.throughputMonthly = model.throughputMonthly;
            this.totalFileCount = model.totalFileCount;
            this.totalFileSizeInBytes = model.totalFileSizeInBytes;
        } 

        /**
         * apiVisitCountMonthly.
         */
        public Builder apiVisitCountMonthly(Long apiVisitCountMonthly) {
            this.apiVisitCountMonthly = apiVisitCountMonthly;
            return this;
        }

        /**
         * databaseCount.
         */
        public Builder databaseCount(MoMValues databaseCount) {
            this.databaseCount = databaseCount;
            return this;
        }

        /**
         * <p>Update date of the statistics</p>
         */
        public Builder generatedDate(String generatedDate) {
            this.generatedDate = generatedDate;
            return this;
        }

        /**
         * partitionCount.
         */
        public Builder partitionCount(MoMValues partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }

        /**
         * tableCount.
         */
        public Builder tableCount(MoMValues tableCount) {
            this.tableCount = tableCount;
            return this;
        }

        /**
         * throughputMonthly.
         */
        public Builder throughputMonthly(Long throughputMonthly) {
            this.throughputMonthly = throughputMonthly;
            return this;
        }

        /**
         * totalFileCount.
         */
        public Builder totalFileCount(MoMValues totalFileCount) {
            this.totalFileCount = totalFileCount;
            return this;
        }

        /**
         * totalFileSizeInBytes.
         */
        public Builder totalFileSizeInBytes(MoMValues totalFileSizeInBytes) {
            this.totalFileSizeInBytes = totalFileSizeInBytes;
            return this;
        }

        public CatalogSummary build() {
            return new CatalogSummary(this);
        } 

    } 

}
