// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIdcProbeScanResultListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIdcProbeScanResultListResponseBody</p>
 */
public class DescribeIdcProbeScanResultListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List < Instances> instances;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeIdcProbeScanResultListResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIdcProbeScanResultListResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Instances> instances; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeIdcProbeScanResultListResponseBody build() {
            return new DescribeIdcProbeScanResultListResponseBody(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientStatus")
        private String clientStatus;

        @com.aliyun.core.annotation.NameInMap("IdcName")
        private String idcName;

        @com.aliyun.core.annotation.NameInMap("IpSegment")
        private String ipSegment;

        @com.aliyun.core.annotation.NameInMap("LastScanTime")
        private Long lastScanTime;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("ProbeInternetIp")
        private String probeInternetIp;

        @com.aliyun.core.annotation.NameInMap("ProbeIntranetIp")
        private String probeIntranetIp;

        @com.aliyun.core.annotation.NameInMap("ProbeMachineName")
        private String probeMachineName;

        @com.aliyun.core.annotation.NameInMap("ProbeUuid")
        private String probeUuid;

        @com.aliyun.core.annotation.NameInMap("ScanResultId")
        private Long scanResultId;

        @com.aliyun.core.annotation.NameInMap("ScannedIp")
        private String scannedIp;

        @com.aliyun.core.annotation.NameInMap("ValidPort")
        private String validPort;

        private Instances(Builder builder) {
            this.clientStatus = builder.clientStatus;
            this.idcName = builder.idcName;
            this.ipSegment = builder.ipSegment;
            this.lastScanTime = builder.lastScanTime;
            this.os = builder.os;
            this.probeInternetIp = builder.probeInternetIp;
            this.probeIntranetIp = builder.probeIntranetIp;
            this.probeMachineName = builder.probeMachineName;
            this.probeUuid = builder.probeUuid;
            this.scanResultId = builder.scanResultId;
            this.scannedIp = builder.scannedIp;
            this.validPort = builder.validPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return clientStatus
         */
        public String getClientStatus() {
            return this.clientStatus;
        }

        /**
         * @return idcName
         */
        public String getIdcName() {
            return this.idcName;
        }

        /**
         * @return ipSegment
         */
        public String getIpSegment() {
            return this.ipSegment;
        }

        /**
         * @return lastScanTime
         */
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return probeInternetIp
         */
        public String getProbeInternetIp() {
            return this.probeInternetIp;
        }

        /**
         * @return probeIntranetIp
         */
        public String getProbeIntranetIp() {
            return this.probeIntranetIp;
        }

        /**
         * @return probeMachineName
         */
        public String getProbeMachineName() {
            return this.probeMachineName;
        }

        /**
         * @return probeUuid
         */
        public String getProbeUuid() {
            return this.probeUuid;
        }

        /**
         * @return scanResultId
         */
        public Long getScanResultId() {
            return this.scanResultId;
        }

        /**
         * @return scannedIp
         */
        public String getScannedIp() {
            return this.scannedIp;
        }

        /**
         * @return validPort
         */
        public String getValidPort() {
            return this.validPort;
        }

        public static final class Builder {
            private String clientStatus; 
            private String idcName; 
            private String ipSegment; 
            private Long lastScanTime; 
            private String os; 
            private String probeInternetIp; 
            private String probeIntranetIp; 
            private String probeMachineName; 
            private String probeUuid; 
            private Long scanResultId; 
            private String scannedIp; 
            private String validPort; 

            /**
             * The status of the client of the instance on which the probe is installed. Valid values:
             * <p>
             * 
             * *   **online**: The Security Center agent on the asset is **enabled**.
             * *   **offline**: The Security Center agent on the asset is **disabled**.
             */
            public Builder clientStatus(String clientStatus) {
                this.clientStatus = clientStatus;
                return this;
            }

            /**
             * The name of the IDC.
             */
            public Builder idcName(String idcName) {
                this.idcName = idcName;
                return this;
            }

            /**
             * The CIDR blocks.
             */
            public Builder ipSegment(String ipSegment) {
                this.ipSegment = ipSegment;
                return this;
            }

            /**
             * The timestamp when the last scan was performed. Unit: milliseconds.
             */
            public Builder lastScanTime(Long lastScanTime) {
                this.lastScanTime = lastScanTime;
                return this;
            }

            /**
             * The operating system type of the asset. Valid values:
             * <p>
             * 
             * *   **windows**
             * *   **linux**
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * The private IP address of the associated instance.
             */
            public Builder probeInternetIp(String probeInternetIp) {
                this.probeInternetIp = probeInternetIp;
                return this;
            }

            /**
             * The private IP address of the associated instance.
             */
            public Builder probeIntranetIp(String probeIntranetIp) {
                this.probeIntranetIp = probeIntranetIp;
                return this;
            }

            /**
             * The name of the associated instance.
             */
            public Builder probeMachineName(String probeMachineName) {
                this.probeMachineName = probeMachineName;
                return this;
            }

            /**
             * The UUID of the associated instance.
             */
            public Builder probeUuid(String probeUuid) {
                this.probeUuid = probeUuid;
                return this;
            }

            /**
             * The ID of the scan result.
             */
            public Builder scanResultId(Long scanResultId) {
                this.scanResultId = scanResultId;
                return this;
            }

            /**
             * The IP address that is scanned.
             */
            public Builder scannedIp(String scannedIp) {
                this.scannedIp = scannedIp;
                return this;
            }

            /**
             * The port that is scanned.
             */
            public Builder validPort(String validPort) {
                this.validPort = validPort;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
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

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
