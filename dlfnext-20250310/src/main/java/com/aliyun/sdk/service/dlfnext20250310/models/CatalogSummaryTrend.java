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
 * {@link CatalogSummaryTrend} extends {@link TeaModel}
 *
 * <p>CatalogSummaryTrend</p>
 */
public class CatalogSummaryTrend extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiVisitCount")
    private java.util.List<DateSummary> apiVisitCount;

    @com.aliyun.core.annotation.NameInMap("throughput")
    private java.util.List<DateSummary> throughput;

    @com.aliyun.core.annotation.NameInMap("totalFileCount")
    private java.util.List<DateSummary> totalFileCount;

    @com.aliyun.core.annotation.NameInMap("totalFileSizeInBytes")
    private java.util.List<DateSummary> totalFileSizeInBytes;

    @com.aliyun.core.annotation.NameInMap("totalMetaCount")
    private java.util.List<DateSummary> totalMetaCount;

    private CatalogSummaryTrend(Builder builder) {
        this.apiVisitCount = builder.apiVisitCount;
        this.throughput = builder.throughput;
        this.totalFileCount = builder.totalFileCount;
        this.totalFileSizeInBytes = builder.totalFileSizeInBytes;
        this.totalMetaCount = builder.totalMetaCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CatalogSummaryTrend create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiVisitCount
     */
    public java.util.List<DateSummary> getApiVisitCount() {
        return this.apiVisitCount;
    }

    /**
     * @return throughput
     */
    public java.util.List<DateSummary> getThroughput() {
        return this.throughput;
    }

    /**
     * @return totalFileCount
     */
    public java.util.List<DateSummary> getTotalFileCount() {
        return this.totalFileCount;
    }

    /**
     * @return totalFileSizeInBytes
     */
    public java.util.List<DateSummary> getTotalFileSizeInBytes() {
        return this.totalFileSizeInBytes;
    }

    /**
     * @return totalMetaCount
     */
    public java.util.List<DateSummary> getTotalMetaCount() {
        return this.totalMetaCount;
    }

    public static final class Builder {
        private java.util.List<DateSummary> apiVisitCount; 
        private java.util.List<DateSummary> throughput; 
        private java.util.List<DateSummary> totalFileCount; 
        private java.util.List<DateSummary> totalFileSizeInBytes; 
        private java.util.List<DateSummary> totalMetaCount; 

        private Builder() {
        } 

        private Builder(CatalogSummaryTrend model) {
            this.apiVisitCount = model.apiVisitCount;
            this.throughput = model.throughput;
            this.totalFileCount = model.totalFileCount;
            this.totalFileSizeInBytes = model.totalFileSizeInBytes;
            this.totalMetaCount = model.totalMetaCount;
        } 

        /**
         * <p>API visit count trends</p>
         */
        public Builder apiVisitCount(java.util.List<DateSummary> apiVisitCount) {
            this.apiVisitCount = apiVisitCount;
            return this;
        }

        /**
         * <p>Table count trends</p>
         */
        public Builder throughput(java.util.List<DateSummary> throughput) {
            this.throughput = throughput;
            return this;
        }

        /**
         * <p>Historical total file count</p>
         */
        public Builder totalFileCount(java.util.List<DateSummary> totalFileCount) {
            this.totalFileCount = totalFileCount;
            return this;
        }

        /**
         * <p>Database count trends</p>
         */
        public Builder totalFileSizeInBytes(java.util.List<DateSummary> totalFileSizeInBytes) {
            this.totalFileSizeInBytes = totalFileSizeInBytes;
            return this;
        }

        /**
         * <p>Latest snapshot file count</p>
         */
        public Builder totalMetaCount(java.util.List<DateSummary> totalMetaCount) {
            this.totalMetaCount = totalMetaCount;
            return this;
        }

        public CatalogSummaryTrend build() {
            return new CatalogSummaryTrend(this);
        } 

    } 

}
