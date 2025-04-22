// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link GetDatasetFileMetasStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetDatasetFileMetasStatisticsResponseBody</p>
 */
public class GetDatasetFileMetasStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatasetFileMetasStats")
    private java.util.List<DatasetFileMetasStat> datasetFileMetasStats;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetDatasetFileMetasStatisticsResponseBody(Builder builder) {
        this.datasetFileMetasStats = builder.datasetFileMetasStats;
        this.totalCount = builder.totalCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatasetFileMetasStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasetFileMetasStats
     */
    public java.util.List<DatasetFileMetasStat> getDatasetFileMetasStats() {
        return this.datasetFileMetasStats;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DatasetFileMetasStat> datasetFileMetasStats; 
        private Integer totalCount; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDatasetFileMetasStatisticsResponseBody model) {
            this.datasetFileMetasStats = model.datasetFileMetasStats;
            this.totalCount = model.totalCount;
            this.requestId = model.requestId;
        } 

        /**
         * DatasetFileMetasStats.
         */
        public Builder datasetFileMetasStats(java.util.List<DatasetFileMetasStat> datasetFileMetasStats) {
            this.datasetFileMetasStats = datasetFileMetasStats;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDatasetFileMetasStatisticsResponseBody build() {
            return new GetDatasetFileMetasStatisticsResponseBody(this);
        } 

    } 

}
