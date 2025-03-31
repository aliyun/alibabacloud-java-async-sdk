// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link ListChartReleaseResponseBody} extends {@link TeaModel}
 *
 * <p>ListChartReleaseResponseBody</p>
 */
public class ListChartReleaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChartReleases")
    private java.util.List<ChartReleases> chartReleases;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListChartReleaseResponseBody(Builder builder) {
        this.chartReleases = builder.chartReleases;
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChartReleaseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chartReleases
     */
    public java.util.List<ChartReleases> getChartReleases() {
        return this.chartReleases;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<ChartReleases> chartReleases; 
        private String code; 
        private Boolean isSuccess; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListChartReleaseResponseBody model) {
            this.chartReleases = model.chartReleases;
            this.code = model.code;
            this.isSuccess = model.isSuccess;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of chart versions.</p>
         */
        public Builder chartReleases(java.util.List<ChartReleases> chartReleases) {
            this.chartReleases = chartReleases;
            return this;
        }

        /**
         * <p>The return value.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
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
         * <p>F68823F6-F1B5-4A4E-8421-A83CAB8F2963</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListChartReleaseResponseBody build() {
            return new ListChartReleaseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListChartReleaseResponseBody} extends {@link TeaModel}
     *
     * <p>ListChartReleaseResponseBody</p>
     */
    public static class ChartReleases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Chart")
        private String chart;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private Long modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Release")
        private String release;

        @com.aliyun.core.annotation.NameInMap("RepoId")
        private String repoId;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ChartReleases(Builder builder) {
            this.chart = builder.chart;
            this.instanceId = builder.instanceId;
            this.modifiedTime = builder.modifiedTime;
            this.release = builder.release;
            this.repoId = builder.repoId;
            this.size = builder.size;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChartReleases create() {
            return builder().build();
        }

        /**
         * @return chart
         */
        public String getChart() {
            return this.chart;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return release
         */
        public String getRelease() {
            return this.release;
        }

        /**
         * @return repoId
         */
        public String getRepoId() {
            return this.repoId;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String chart; 
            private String instanceId; 
            private Long modifiedTime; 
            private String release; 
            private String repoId; 
            private String size; 
            private String status; 

            private Builder() {
            } 

            private Builder(ChartReleases model) {
                this.chart = model.chart;
                this.instanceId = model.instanceId;
                this.modifiedTime = model.modifiedTime;
                this.release = model.release;
                this.repoId = model.repoId;
                this.size = model.size;
                this.status = model.status;
            } 

            /**
             * <p>The name of the chart version.</p>
             * 
             * <strong>example:</strong>
             * <p>chart1</p>
             */
            public Builder chart(String chart) {
                this.chart = chart;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-xkx6vujuhay0****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The time when the chart was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1571930323000</p>
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The version number of the chart.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1.0</p>
             */
            public Builder release(String release) {
                this.release = release;
                return this;
            }

            /**
             * <p>The ID of the chart repository.</p>
             * 
             * <strong>example:</strong>
             * <p>crcr-gpsu7b8chmxk****</p>
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * <p>The size of the chart of the version. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>2826</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The status of the chart.</p>
             * 
             * <strong>example:</strong>
             * <p>ENABLED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ChartReleases build() {
                return new ChartReleases(this);
            } 

        } 

    }
}
