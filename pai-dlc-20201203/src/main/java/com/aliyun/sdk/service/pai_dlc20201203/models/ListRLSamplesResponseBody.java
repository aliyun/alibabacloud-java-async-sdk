// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link ListRLSamplesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRLSamplesResponseBody</p>
 */
public class ListRLSamplesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Samples")
    private java.util.List<RLSample> samples;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListRLSamplesResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.samples = builder.samples;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRLSamplesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return samples
     */
    public java.util.List<RLSample> getSamples() {
        return this.samples;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String jobId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<RLSample> samples; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListRLSamplesResponseBody model) {
            this.jobId = model.jobId;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.samples = model.samples;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>作业 ID</p>
         * 
         * <strong>example:</strong>
         * <p>dlc5yfk7eyg95lac</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>生效的页码；未传分页参数时为默认值 1</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>生效的每页条数；未传分页参数时为默认值 10</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>请求 ID</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>当前页的样本轨迹概览，按 PromptUid 字典序、SampleIndex 数值升序排列。</p>
         */
        public Builder samples(java.util.List<RLSample> samples) {
            this.samples = samples;
            return this;
        }

        /**
         * <p>分页前的匹配轨迹总数，不是当前页条数。查询规模受限时可能仅为下界，不保证是精确总数。</p>
         * 
         * <strong>example:</strong>
         * <p>21596</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRLSamplesResponseBody build() {
            return new ListRLSamplesResponseBody(this);
        } 

    } 

}
