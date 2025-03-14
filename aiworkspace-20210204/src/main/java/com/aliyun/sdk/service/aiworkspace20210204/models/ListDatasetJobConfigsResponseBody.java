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
 * {@link ListDatasetJobConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatasetJobConfigsResponseBody</p>
 */
public class ListDatasetJobConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatasetJobConfigs")
    private java.util.List<DatasetJobConfig> datasetJobConfigs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListDatasetJobConfigsResponseBody(Builder builder) {
        this.datasetJobConfigs = builder.datasetJobConfigs;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatasetJobConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return datasetJobConfigs
     */
    public java.util.List<DatasetJobConfig> getDatasetJobConfigs() {
        return this.datasetJobConfigs;
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
        private java.util.List<DatasetJobConfig> datasetJobConfigs; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * DatasetJobConfigs.
         */
        public Builder datasetJobConfigs(java.util.List<DatasetJobConfig> datasetJobConfigs) {
            this.datasetJobConfigs = datasetJobConfigs;
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

        public ListDatasetJobConfigsResponseBody build() {
            return new ListDatasetJobConfigsResponseBody(this);
        } 

    } 

}
