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
 * {@link ListDatasetJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatasetJobsResponseBody</p>
 */
public class ListDatasetJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatasetJobs")
    private java.util.List<DatasetJob> datasetJobs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListDatasetJobsResponseBody(Builder builder) {
        this.datasetJobs = builder.datasetJobs;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatasetJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return datasetJobs
     */
    public java.util.List<DatasetJob> getDatasetJobs() {
        return this.datasetJobs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<DatasetJob> datasetJobs; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * DatasetJobs.
         */
        public Builder datasetJobs(java.util.List<DatasetJob> datasetJobs) {
            this.datasetJobs = datasetJobs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDatasetJobsResponseBody build() {
            return new ListDatasetJobsResponseBody(this);
        } 

    } 

}
