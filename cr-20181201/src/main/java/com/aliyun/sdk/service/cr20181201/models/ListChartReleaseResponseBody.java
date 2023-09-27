// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChartReleaseResponseBody} extends {@link TeaModel}
 *
 * <p>ListChartReleaseResponseBody</p>
 */
public class ListChartReleaseResponseBody extends TeaModel {
    @NameInMap("ChartReleases")
    private java.util.List < ChartReleases> chartReleases;

    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    /**
     * @return chartReleases
     */
    public java.util.List < ChartReleases> getChartReleases() {
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
        private java.util.List < ChartReleases> chartReleases; 
        private String code; 
        private Boolean isSuccess; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private String totalCount; 

        /**
         * The list of chart versions.
         */
        public Builder chartReleases(java.util.List < ChartReleases> chartReleases) {
            this.chartReleases = chartReleases;
            return this;
        }

        /**
         * The return value.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListChartReleaseResponseBody build() {
            return new ListChartReleaseResponseBody(this);
        } 

    } 

    public static class ChartReleases extends TeaModel {
        @NameInMap("Chart")
        private String chart;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("ModifiedTime")
        private Long modifiedTime;

        @NameInMap("Release")
        private String release;

        @NameInMap("RepoId")
        private String repoId;

        @NameInMap("Size")
        private String size;

        @NameInMap("Status")
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

            /**
             * The name of the chart version.
             */
            public Builder chart(String chart) {
                this.chart = chart;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The time when the chart was last modified.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The version number of the chart.
             */
            public Builder release(String release) {
                this.release = release;
                return this;
            }

            /**
             * The ID of the chart repository.
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * The size of the chart of the version. Unit: bytes.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * The status of the chart.
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
