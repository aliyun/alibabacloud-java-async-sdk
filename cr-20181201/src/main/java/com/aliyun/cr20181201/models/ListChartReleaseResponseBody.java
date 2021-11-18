// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListChartReleaseResponseBody} extends {@link TeaModel}
 *
 * <p>ListChartReleaseResponseBody</p>
 */
public class ListChartReleaseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Code")
    private String code;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("TotalCount")
    private String totalCount;

    @NameInMap("ChartReleases")
    private java.util.List < ChartReleases> chartReleases;


    private ListChartReleaseResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.pageNo = builder.pageNo;
        this.isSuccess = builder.isSuccess;
        this.pageSize = builder.pageSize;
        this.totalCount = builder.totalCount;
        this.chartReleases = builder.chartReleases;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChartReleaseResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return chartReleases
     */
    public java.util.List < ChartReleases> getChartReleases() {
        return this.chartReleases;
    }

    public static final class Builder {
        private String requestId; 
        private String code; 
        private Integer pageNo; 
        private Boolean isSuccess; 
        private Integer pageSize; 
        private String totalCount; 
        private java.util.List < ChartReleases> chartReleases; 

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Page number</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>Successful</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Page size</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Total quantity</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Chart version list</p>
         */
        public Builder chartReleases(java.util.List < ChartReleases> chartReleases) {
            this.chartReleases = chartReleases;
            return this;
        }

        public ListChartReleaseResponseBody build() {
            return new ListChartReleaseResponseBody(this);
        } 

    } 

    public static class ChartReleases extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("ModifiedTime")
        private Long modifiedTime;

        @NameInMap("RepoId")
        private String repoId;

        @NameInMap("Release")
        private String release;

        @NameInMap("Size")
        private String size;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Chart")
        private String chart;


        private ChartReleases(Builder builder) {
            this.status = builder.status;
            this.modifiedTime = builder.modifiedTime;
            this.repoId = builder.repoId;
            this.release = builder.release;
            this.size = builder.size;
            this.instanceId = builder.instanceId;
            this.chart = builder.chart;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChartReleases create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return repoId
         */
        public String getRepoId() {
            return this.repoId;
        }

        /**
         * @return release
         */
        public String getRelease() {
            return this.release;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return chart
         */
        public String getChart() {
            return this.chart;
        }

        public static final class Builder {
            private String status; 
            private Long modifiedTime; 
            private String repoId; 
            private String release; 
            private String size; 
            private String instanceId; 
            private String chart; 

            /**
             * <p>State</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Chart modification time</p>
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>Chart Repository ID</p>
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * <p>Chart version</p>
             */
            public Builder release(String release) {
                this.release = release;
                return this;
            }

            /**
             * <p>Chart version size</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * <p>Instance ID</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Chart version name</p>
             */
            public Builder chart(String chart) {
                this.chart = chart;
                return this;
            }

            public ChartReleases build() {
                return new ChartReleases(this);
            } 

        } 

    }
}
