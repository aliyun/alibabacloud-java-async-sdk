// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeInternetOpenServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInternetOpenServiceResponseBody</p>
 */
public class DescribeInternetOpenServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInternetOpenServiceResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInternetOpenServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataList
     */
    public java.util.List<DataList> getDataList() {
        return this.dataList;
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
        private java.util.List<DataList> dataList; 
        private PageInfo pageInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInternetOpenServiceResponseBody model) {
            this.dataList = model.dataList;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of data.</p>
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * <p>The paging information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>99A65AA0-C5B5-5092-BFCF-8111B436****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInternetOpenServiceResponseBody build() {
            return new DescribeInternetOpenServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInternetOpenServiceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInternetOpenServiceResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetailNum")
        private Integer detailNum;

        @com.aliyun.core.annotation.NameInMap("InBytes")
        private Long inBytes;

        @com.aliyun.core.annotation.NameInMap("OutBytes")
        private Long outBytes;

        @com.aliyun.core.annotation.NameInMap("PortList")
        private java.util.List<String> portList;

        @com.aliyun.core.annotation.NameInMap("ProbRisk")
        private String probRisk;

        @com.aliyun.core.annotation.NameInMap("ProbRiskDesc")
        private String probRiskDesc;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("PublicIpNum")
        private Integer publicIpNum;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private Integer riskLevel;

        @com.aliyun.core.annotation.NameInMap("RiskReason")
        private String riskReason;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private Integer serviceName;

        @com.aliyun.core.annotation.NameInMap("SuggestLevel")
        private Integer suggestLevel;

        @com.aliyun.core.annotation.NameInMap("TotalBytes")
        private Long totalBytes;

        @com.aliyun.core.annotation.NameInMap("TrafficPercent1Day")
        private String trafficPercent1Day;

        @com.aliyun.core.annotation.NameInMap("TrafficPercent30Day")
        private String trafficPercent30Day;

        @com.aliyun.core.annotation.NameInMap("TrafficPercent7Day")
        private String trafficPercent7Day;

        @com.aliyun.core.annotation.NameInMap("UnknownReason")
        private java.util.List<String> unknownReason;

        private DataList(Builder builder) {
            this.detailNum = builder.detailNum;
            this.inBytes = builder.inBytes;
            this.outBytes = builder.outBytes;
            this.portList = builder.portList;
            this.probRisk = builder.probRisk;
            this.probRiskDesc = builder.probRiskDesc;
            this.protocol = builder.protocol;
            this.publicIpNum = builder.publicIpNum;
            this.riskLevel = builder.riskLevel;
            this.riskReason = builder.riskReason;
            this.serviceName = builder.serviceName;
            this.suggestLevel = builder.suggestLevel;
            this.totalBytes = builder.totalBytes;
            this.trafficPercent1Day = builder.trafficPercent1Day;
            this.trafficPercent30Day = builder.trafficPercent30Day;
            this.trafficPercent7Day = builder.trafficPercent7Day;
            this.unknownReason = builder.unknownReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return detailNum
         */
        public Integer getDetailNum() {
            return this.detailNum;
        }

        /**
         * @return inBytes
         */
        public Long getInBytes() {
            return this.inBytes;
        }

        /**
         * @return outBytes
         */
        public Long getOutBytes() {
            return this.outBytes;
        }

        /**
         * @return portList
         */
        public java.util.List<String> getPortList() {
            return this.portList;
        }

        /**
         * @return probRisk
         */
        public String getProbRisk() {
            return this.probRisk;
        }

        /**
         * @return probRiskDesc
         */
        public String getProbRiskDesc() {
            return this.probRiskDesc;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return publicIpNum
         */
        public Integer getPublicIpNum() {
            return this.publicIpNum;
        }

        /**
         * @return riskLevel
         */
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return riskReason
         */
        public String getRiskReason() {
            return this.riskReason;
        }

        /**
         * @return serviceName
         */
        public Integer getServiceName() {
            return this.serviceName;
        }

        /**
         * @return suggestLevel
         */
        public Integer getSuggestLevel() {
            return this.suggestLevel;
        }

        /**
         * @return totalBytes
         */
        public Long getTotalBytes() {
            return this.totalBytes;
        }

        /**
         * @return trafficPercent1Day
         */
        public String getTrafficPercent1Day() {
            return this.trafficPercent1Day;
        }

        /**
         * @return trafficPercent30Day
         */
        public String getTrafficPercent30Day() {
            return this.trafficPercent30Day;
        }

        /**
         * @return trafficPercent7Day
         */
        public String getTrafficPercent7Day() {
            return this.trafficPercent7Day;
        }

        /**
         * @return unknownReason
         */
        public java.util.List<String> getUnknownReason() {
            return this.unknownReason;
        }

        public static final class Builder {
            private Integer detailNum; 
            private Long inBytes; 
            private Long outBytes; 
            private java.util.List<String> portList; 
            private String probRisk; 
            private String probRiskDesc; 
            private String protocol; 
            private Integer publicIpNum; 
            private Integer riskLevel; 
            private String riskReason; 
            private Integer serviceName; 
            private Integer suggestLevel; 
            private Long totalBytes; 
            private String trafficPercent1Day; 
            private String trafficPercent30Day; 
            private String trafficPercent7Day; 
            private java.util.List<String> unknownReason; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.detailNum = model.detailNum;
                this.inBytes = model.inBytes;
                this.outBytes = model.outBytes;
                this.portList = model.portList;
                this.probRisk = model.probRisk;
                this.probRiskDesc = model.probRiskDesc;
                this.protocol = model.protocol;
                this.publicIpNum = model.publicIpNum;
                this.riskLevel = model.riskLevel;
                this.riskReason = model.riskReason;
                this.serviceName = model.serviceName;
                this.suggestLevel = model.suggestLevel;
                this.totalBytes = model.totalBytes;
                this.trafficPercent1Day = model.trafficPercent1Day;
                this.trafficPercent30Day = model.trafficPercent30Day;
                this.trafficPercent7Day = model.trafficPercent7Day;
                this.unknownReason = model.unknownReason;
            } 

            /**
             * <p>The number of details.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder detailNum(Integer detailNum) {
                this.detailNum = detailNum;
                return this;
            }

            /**
             * <p>The inbound traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>447458</p>
             */
            public Builder inBytes(Long inBytes) {
                this.inBytes = inBytes;
                return this;
            }

            /**
             * <p>The outbound traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>1123</p>
             */
            public Builder outBytes(Long outBytes) {
                this.outBytes = outBytes;
                return this;
            }

            /**
             * <p>The list of open ports.</p>
             */
            public Builder portList(java.util.List<String> portList) {
                this.portList = portList;
                return this;
            }

            /**
             * <p>The security threat.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder probRisk(String probRisk) {
                this.probRisk = probRisk;
                return this;
            }

            /**
             * <p>The description of the security threat.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder probRiskDesc(String probRiskDesc) {
                this.probRiskDesc = probRiskDesc;
                return this;
            }

            /**
             * <p>The protocol type.</p>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The number of exposed public IP addresses.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder publicIpNum(Integer publicIpNum) {
                this.publicIpNum = publicIpNum;
                return this;
            }

            /**
             * <p>The risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The description of the risk.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder riskReason(String riskReason) {
                this.riskReason = riskReason;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>SMB</p>
             */
            public Builder serviceName(Integer serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The recommended policy level.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder suggestLevel(Integer suggestLevel) {
                this.suggestLevel = suggestLevel;
                return this;
            }

            /**
             * <p>The total traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>621404</p>
             */
            public Builder totalBytes(Long totalBytes) {
                this.totalBytes = totalBytes;
                return this;
            }

            /**
             * <p>The traffic percentage over the last 24 hours.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder trafficPercent1Day(String trafficPercent1Day) {
                this.trafficPercent1Day = trafficPercent1Day;
                return this;
            }

            /**
             * <p>The traffic percentage over the last 30 days.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder trafficPercent30Day(String trafficPercent30Day) {
                this.trafficPercent30Day = trafficPercent30Day;
                return this;
            }

            /**
             * <p>The traffic percentage over the last 7 days.</p>
             * 
             * <strong>example:</strong>
             * <p>77</p>
             */
            public Builder trafficPercent7Day(String trafficPercent7Day) {
                this.trafficPercent7Day = trafficPercent7Day;
                return this;
            }

            /**
             * <p>The reason why the protocol is not identified if the detected protocol is \<code>Unknown\\</code>.</p>
             */
            public Builder unknownReason(java.util.List<String> unknownReason) {
                this.unknownReason = unknownReason;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInternetOpenServiceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInternetOpenServiceResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
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
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
