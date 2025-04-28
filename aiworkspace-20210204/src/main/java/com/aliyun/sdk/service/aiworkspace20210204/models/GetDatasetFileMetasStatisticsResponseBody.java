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
         * <p>The details of the returned aggregation list, including the number of each aggregate item. The list is by default sorted in descending order based on the count number.</p>
         */
        public Builder datasetFileMetasStats(java.util.List<DatasetFileMetasStat> datasetFileMetasStats) {
            this.datasetFileMetasStats = datasetFileMetasStats;
            return this;
        }

        /**
         * <p>The returned number. Example: the number of metadata records or the number of user-defined tags.</p>
         * 
         * <strong>example:</strong>
         * <p>73</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ADF6D849-*****-7E7030F0CE53</p>
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
