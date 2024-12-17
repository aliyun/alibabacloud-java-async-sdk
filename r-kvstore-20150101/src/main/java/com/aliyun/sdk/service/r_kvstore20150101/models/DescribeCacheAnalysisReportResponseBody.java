// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCacheAnalysisReportResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCacheAnalysisReportResponseBody</p>
 */
public class DescribeCacheAnalysisReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BigKeys")
    private java.util.List < java.util.Map<String, ?>> bigKeys;

    @com.aliyun.core.annotation.NameInMap("HotKeys")
    private java.util.List < java.util.Map<String, ?>> hotKeys;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
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
         * <p>Details of the large keys.</p>
         */
        public Builder bigKeys(java.util.List < java.util.Map<String, ?>> bigKeys) {
            this.bigKeys = bigKeys;
            return this;
        }

        /**
         * <p>Details of the hotkeys.</p>
         * <blockquote>
         * <p>This parameter is not returned because ApsaraDB for Redis does not support hotkey analytics.</p>
         * </blockquote>
         */
        public Builder hotKeys(java.util.List < java.util.Map<String, ?>> hotKeys) {
            this.hotKeys = hotKeys;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The maximum number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A057C066-C3F5-4CC9-9FE4-A8D8B0DC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>160</p>
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
