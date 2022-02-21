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
         * ChartReleases.
         */
        public Builder chartReleases(java.util.List < ChartReleases> chartReleases) {
            this.chartReleases = chartReleases;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
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
         * TotalCount.
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
             * Chart.
             */
            public Builder chart(String chart) {
                this.chart = chart;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * Release.
             */
            public Builder release(String release) {
                this.release = release;
                return this;
            }

            /**
             * RepoId.
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * Status.
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
