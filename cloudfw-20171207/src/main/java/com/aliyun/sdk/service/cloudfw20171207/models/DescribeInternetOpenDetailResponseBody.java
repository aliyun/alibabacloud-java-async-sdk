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
 * {@link DescribeInternetOpenDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInternetOpenDetailResponseBody</p>
 */
public class DescribeInternetOpenDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInternetOpenDetailResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInternetOpenDetailResponseBody create() {
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

        private Builder(DescribeInternetOpenDetailResponseBody model) {
            this.dataList = model.dataList;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * DataList.
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInternetOpenDetailResponseBody build() {
            return new DescribeInternetOpenDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInternetOpenDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInternetOpenDetailResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetsInstanceId")
        private String assetsInstanceId;

        @com.aliyun.core.annotation.NameInMap("AssetsName")
        private String assetsName;

        @com.aliyun.core.annotation.NameInMap("AssetsType")
        private String assetsType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InBytes")
        private Long inBytes;

        @com.aliyun.core.annotation.NameInMap("OutBytes")
        private Long outBytes;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("ProbRisk")
        private String probRisk;

        @com.aliyun.core.annotation.NameInMap("ProbRiskDesc")
        private String probRiskDesc;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("PublicIp")
        private String publicIp;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private Integer riskLevel;

        @com.aliyun.core.annotation.NameInMap("RiskReason")
        private String riskReason;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

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
            this.assetsInstanceId = builder.assetsInstanceId;
            this.assetsName = builder.assetsName;
            this.assetsType = builder.assetsType;
            this.id = builder.id;
            this.inBytes = builder.inBytes;
            this.outBytes = builder.outBytes;
            this.port = builder.port;
            this.probRisk = builder.probRisk;
            this.probRiskDesc = builder.probRiskDesc;
            this.protocol = builder.protocol;
            this.publicIp = builder.publicIp;
            this.regionNo = builder.regionNo;
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
         * @return assetsInstanceId
         */
        public String getAssetsInstanceId() {
            return this.assetsInstanceId;
        }

        /**
         * @return assetsName
         */
        public String getAssetsName() {
            return this.assetsName;
        }

        /**
         * @return assetsType
         */
        public String getAssetsType() {
            return this.assetsType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
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
         * @return port
         */
        public Integer getPort() {
            return this.port;
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
         * @return publicIp
         */
        public String getPublicIp() {
            return this.publicIp;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
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
        public String getServiceName() {
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
            private String assetsInstanceId; 
            private String assetsName; 
            private String assetsType; 
            private String id; 
            private Long inBytes; 
            private Long outBytes; 
            private Integer port; 
            private String probRisk; 
            private String probRiskDesc; 
            private String protocol; 
            private String publicIp; 
            private String regionNo; 
            private Integer riskLevel; 
            private String riskReason; 
            private String serviceName; 
            private Integer suggestLevel; 
            private Long totalBytes; 
            private String trafficPercent1Day; 
            private String trafficPercent30Day; 
            private String trafficPercent7Day; 
            private java.util.List<String> unknownReason; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.assetsInstanceId = model.assetsInstanceId;
                this.assetsName = model.assetsName;
                this.assetsType = model.assetsType;
                this.id = model.id;
                this.inBytes = model.inBytes;
                this.outBytes = model.outBytes;
                this.port = model.port;
                this.probRisk = model.probRisk;
                this.probRiskDesc = model.probRiskDesc;
                this.protocol = model.protocol;
                this.publicIp = model.publicIp;
                this.regionNo = model.regionNo;
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
             * AssetsInstanceId.
             */
            public Builder assetsInstanceId(String assetsInstanceId) {
                this.assetsInstanceId = assetsInstanceId;
                return this;
            }

            /**
             * AssetsName.
             */
            public Builder assetsName(String assetsName) {
                this.assetsName = assetsName;
                return this;
            }

            /**
             * AssetsType.
             */
            public Builder assetsType(String assetsType) {
                this.assetsType = assetsType;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * InBytes.
             */
            public Builder inBytes(Long inBytes) {
                this.inBytes = inBytes;
                return this;
            }

            /**
             * OutBytes.
             */
            public Builder outBytes(Long outBytes) {
                this.outBytes = outBytes;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * ProbRisk.
             */
            public Builder probRisk(String probRisk) {
                this.probRisk = probRisk;
                return this;
            }

            /**
             * ProbRiskDesc.
             */
            public Builder probRiskDesc(String probRiskDesc) {
                this.probRiskDesc = probRiskDesc;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * PublicIp.
             */
            public Builder publicIp(String publicIp) {
                this.publicIp = publicIp;
                return this;
            }

            /**
             * RegionNo.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * RiskReason.
             */
            public Builder riskReason(String riskReason) {
                this.riskReason = riskReason;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * SuggestLevel.
             */
            public Builder suggestLevel(Integer suggestLevel) {
                this.suggestLevel = suggestLevel;
                return this;
            }

            /**
             * TotalBytes.
             */
            public Builder totalBytes(Long totalBytes) {
                this.totalBytes = totalBytes;
                return this;
            }

            /**
             * TrafficPercent1Day.
             */
            public Builder trafficPercent1Day(String trafficPercent1Day) {
                this.trafficPercent1Day = trafficPercent1Day;
                return this;
            }

            /**
             * TrafficPercent30Day.
             */
            public Builder trafficPercent30Day(String trafficPercent30Day) {
                this.trafficPercent30Day = trafficPercent30Day;
                return this;
            }

            /**
             * TrafficPercent7Day.
             */
            public Builder trafficPercent7Day(String trafficPercent7Day) {
                this.trafficPercent7Day = trafficPercent7Day;
                return this;
            }

            /**
             * UnknownReason.
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
     * {@link DescribeInternetOpenDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInternetOpenDetailResponseBody</p>
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
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
