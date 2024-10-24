// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDatasetVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatasetVersionsResponseBody</p>
 */
public class ListDatasetVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatasetVersions")
    private java.util.List < DatasetVersion > datasetVersions;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListDatasetVersionsResponseBody(Builder builder) {
        this.datasetVersions = builder.datasetVersions;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.totalCount = builder.totalCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatasetVersionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return datasetVersions
     */
    public java.util.List < DatasetVersion > getDatasetVersions() {
        return this.datasetVersions;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
        private java.util.List < DatasetVersion > datasetVersions; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer totalCount; 
        private String requestId; 

        /**
         * DatasetVersions.
         */
        public Builder datasetVersions(java.util.List < DatasetVersion > datasetVersions) {
            this.datasetVersions = datasetVersions;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        public ListDatasetVersionsResponseBody build() {
            return new ListDatasetVersionsResponseBody(this);
        } 

    } 

}
