// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInternetOpenIpResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInternetOpenIpResponseBody</p>
 */
public class DescribeInternetOpenIpResponseBody extends TeaModel {
    @NameInMap("DataList")
    private java.util.List < DataList> dataList;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInternetOpenIpResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInternetOpenIpResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataList
     */
    public java.util.List < DataList> getDataList() {
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
        private java.util.List < DataList> dataList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The data returned.
         */
        public Builder dataList(java.util.List < DataList> dataList) {
            this.dataList = dataList;
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

        public DescribeInternetOpenIpResponseBody build() {
            return new DescribeInternetOpenIpResponseBody(this);
        } 

    } 

    public static class DataList extends TeaModel {
        @NameInMap("AclRecommendDetail")
        private String aclRecommendDetail;

        @NameInMap("AssetsInstanceId")
        private String assetsInstanceId;

        @NameInMap("AssetsName")
        private String assetsName;

        @NameInMap("AssetsType")
        private String assetsType;

        @NameInMap("DetailNum")
        private Integer detailNum;

        @NameInMap("HasAclRecommend")
        private Boolean hasAclRecommend;

        @NameInMap("PortList")
        private java.util.List < String > portList;

        @NameInMap("PublicIp")
        private String publicIp;

        @NameInMap("RegionNo")
        private String regionNo;

        @NameInMap("RiskLevel")
        private Integer riskLevel;

        @NameInMap("RiskReason")
        private String riskReason;

        @NameInMap("ServiceNameList")
        private java.util.List < String > serviceNameList;

        @NameInMap("TrafficPercent1Day")
        private String trafficPercent1Day;

        @NameInMap("TrafficPercent30Day")
        private String trafficPercent30Day;

        @NameInMap("TrafficPercent7Day")
        private String trafficPercent7Day;

        private DataList(Builder builder) {
            this.aclRecommendDetail = builder.aclRecommendDetail;
            this.assetsInstanceId = builder.assetsInstanceId;
            this.assetsName = builder.assetsName;
            this.assetsType = builder.assetsType;
            this.detailNum = builder.detailNum;
            this.hasAclRecommend = builder.hasAclRecommend;
            this.portList = builder.portList;
            this.publicIp = builder.publicIp;
            this.regionNo = builder.regionNo;
            this.riskLevel = builder.riskLevel;
            this.riskReason = builder.riskReason;
            this.serviceNameList = builder.serviceNameList;
            this.trafficPercent1Day = builder.trafficPercent1Day;
            this.trafficPercent30Day = builder.trafficPercent30Day;
            this.trafficPercent7Day = builder.trafficPercent7Day;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return aclRecommendDetail
         */
        public String getAclRecommendDetail() {
            return this.aclRecommendDetail;
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
         * @return detailNum
         */
        public Integer getDetailNum() {
            return this.detailNum;
        }

        /**
         * @return hasAclRecommend
         */
        public Boolean getHasAclRecommend() {
            return this.hasAclRecommend;
        }

        /**
         * @return portList
         */
        public java.util.List < String > getPortList() {
            return this.portList;
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
         * @return serviceNameList
         */
        public java.util.List < String > getServiceNameList() {
            return this.serviceNameList;
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

        public static final class Builder {
            private String aclRecommendDetail; 
            private String assetsInstanceId; 
            private String assetsName; 
            private String assetsType; 
            private Integer detailNum; 
            private Boolean hasAclRecommend; 
            private java.util.List < String > portList; 
            private String publicIp; 
            private String regionNo; 
            private Integer riskLevel; 
            private String riskReason; 
            private java.util.List < String > serviceNameList; 
            private String trafficPercent1Day; 
            private String trafficPercent30Day; 
            private String trafficPercent7Day; 

            /**
             * The reason why recommended intelligent policies are unavailable. Valid values:
             * <p>
             * 
             * *   No recommended intelligent policies are available.
             * *   This feature is available only to some users.
             * *   The policy configuration has been modified. No recommended intelligent policies are available.
             * *   The recommended intelligent policies have been configured. No new recommended intelligent policies are available.
             */
            public Builder aclRecommendDetail(String aclRecommendDetail) {
                this.aclRecommendDetail = aclRecommendDetail;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder assetsInstanceId(String assetsInstanceId) {
                this.assetsInstanceId = assetsInstanceId;
                return this;
            }

            /**
             * The instance name.
             */
            public Builder assetsName(String assetsName) {
                this.assetsName = assetsName;
                return this;
            }

            /**
             * The asset type of the instance.
             */
            public Builder assetsType(String assetsType) {
                this.assetsType = assetsType;
                return this;
            }

            /**
             * The total number of ports.
             */
            public Builder detailNum(Integer detailNum) {
                this.detailNum = detailNum;
                return this;
            }

            /**
             * Specifies whether an access control policy is recommended. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder hasAclRecommend(Boolean hasAclRecommend) {
                this.hasAclRecommend = hasAclRecommend;
                return this;
            }

            /**
             * The list of ports.
             */
            public Builder portList(java.util.List < String > portList) {
                this.portList = portList;
                return this;
            }

            /**
             * The public IP address of the instance.
             */
            public Builder publicIp(String publicIp) {
                this.publicIp = publicIp;
                return this;
            }

            /**
             * The region ID of the instance.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * The risk level. Valid values:
             * <p>
             * 
             * *   **3**: high risk
             * *   **2**: medium risk
             * *   **1**: low risk
             * *   **0**: no risk
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * The reason for the risk.
             */
            public Builder riskReason(String riskReason) {
                this.riskReason = riskReason;
                return this;
            }

            /**
             * The list of applications.
             */
            public Builder serviceNameList(java.util.List < String > serviceNameList) {
                this.serviceNameList = serviceNameList;
                return this;
            }

            /**
             * The percentage of traffic of a day. Unit: percent (%).
             */
            public Builder trafficPercent1Day(String trafficPercent1Day) {
                this.trafficPercent1Day = trafficPercent1Day;
                return this;
            }

            /**
             * The percentage of traffic of 30 days. Unit: percent (%).
             */
            public Builder trafficPercent30Day(String trafficPercent30Day) {
                this.trafficPercent30Day = trafficPercent30Day;
                return this;
            }

            /**
             * The percentage of traffic of seven days. Unit: percent (%).
             */
            public Builder trafficPercent7Day(String trafficPercent7Day) {
                this.trafficPercent7Day = trafficPercent7Day;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
