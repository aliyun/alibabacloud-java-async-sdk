// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCacheAnalysisReportResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCacheAnalysisReportResponseBody</p>
 */
public class DescribeCacheAnalysisReportResponseBody extends TeaModel {
    @NameInMap("BigKeys")
    private java.util.List < java.util.Map<String, ?>> bigKeys;

    @NameInMap("HotKeys")
    private java.util.List < java.util.Map<String, ?>> hotKeys;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeCacheAnalysisReportResponseBody(Builder builder) {
        this.bigKeys = builder.bigKeys;
        this.hotKeys = builder.hotKeys;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCacheAnalysisReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return bigKeys
     */
    public java.util.List < java.util.Map<String, ?>> getBigKeys() {
        return this.bigKeys;
    }

    /**
     * @return hotKeys
     */
    public java.util.List < java.util.Map<String, ?>> getHotKeys() {
        return this.hotKeys;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List < java.util.Map<String, ?>> bigKeys; 
        private java.util.List < java.util.Map<String, ?>> hotKeys; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * BigKeys.
         */
        public Builder bigKeys(java.util.List < java.util.Map<String, ?>> bigKeys) {
            this.bigKeys = bigKeys;
            return this;
        }

        /**
         * HotKeys.
         */
        public Builder hotKeys(java.util.List < java.util.Map<String, ?>> hotKeys) {
            this.hotKeys = hotKeys;
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
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeCacheAnalysisReportResponseBody build() {
            return new DescribeCacheAnalysisReportResponseBody(this);
        } 

    } 

}
