// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeExposedInstanceListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExposedInstanceListResponseBody</p>
 */
public class DescribeExposedInstanceListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExposedInstances")
    private java.util.List < ExposedInstances> exposedInstances;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeExposedInstanceListResponseBody(Builder builder) {
        this.exposedInstances = builder.exposedInstances;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExposedInstanceListResponseBody create() {
        return builder().build();
    }

    /**
     * @return exposedInstances
     */
    public java.util.List < ExposedInstances> getExposedInstances() {
        return this.exposedInstances;
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
        private java.util.List < ExposedInstances> exposedInstances; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>An array that consists of the details about the exposed asset.</p>
         */
        public Builder exposedInstances(java.util.List < ExposedInstances> exposedInstances) {
            this.exposedInstances = exposedInstances;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>598A4A61-ABA7-456B-8725-7378258276D9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeExposedInstanceListResponseBody build() {
            return new DescribeExposedInstanceListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeExposedInstanceListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExposedInstanceListResponseBody</p>
     */
    public static class ExposedInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsapVulCount")
        private Integer asapVulCount;

        @com.aliyun.core.annotation.NameInMap("AssetType")
        private Integer assetType;

        @com.aliyun.core.annotation.NameInMap("CloudAssetInfo")
        private String cloudAssetInfo;

        @com.aliyun.core.annotation.NameInMap("CspmAlarmCount")
        private Integer cspmAlarmCount;

        @com.aliyun.core.annotation.NameInMap("ExploitHealthCount")
        private Integer exploitHealthCount;

        @com.aliyun.core.annotation.NameInMap("ExposureComponent")
        private String exposureComponent;

        @com.aliyun.core.annotation.NameInMap("ExposureIp")
        private String exposureIp;

        @com.aliyun.core.annotation.NameInMap("ExposurePort")
        private String exposurePort;

        @com.aliyun.core.annotation.NameInMap("ExposureType")
        private String exposureType;

        @com.aliyun.core.annotation.NameInMap("ExposureTypeId")
        private String exposureTypeId;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("LaterVulCount")
        private Integer laterVulCount;

        @com.aliyun.core.annotation.NameInMap("NntfVulCount")
        private Integer nntfVulCount;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("TotalVulCount")
        private Integer totalVulCount;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private ExposedInstances(Builder builder) {
            this.asapVulCount = builder.asapVulCount;
            this.assetType = builder.assetType;
            this.cloudAssetInfo = builder.cloudAssetInfo;
            this.cspmAlarmCount = builder.cspmAlarmCount;
            this.exploitHealthCount = builder.exploitHealthCount;
            this.exposureComponent = builder.exposureComponent;
            this.exposureIp = builder.exposureIp;
            this.exposurePort = builder.exposurePort;
            this.exposureType = builder.exposureType;
            this.exposureTypeId = builder.exposureTypeId;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.laterVulCount = builder.laterVulCount;
            this.nntfVulCount = builder.nntfVulCount;
            this.regionId = builder.regionId;
            this.totalVulCount = builder.totalVulCount;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExposedInstances create() {
            return builder().build();
        }

        /**
         * @return asapVulCount
         */
        public Integer getAsapVulCount() {
            return this.asapVulCount;
        }

        /**
         * @return assetType
         */
        public Integer getAssetType() {
            return this.assetType;
        }

        /**
         * @return cloudAssetInfo
         */
        public String getCloudAssetInfo() {
            return this.cloudAssetInfo;
        }

        /**
         * @return cspmAlarmCount
         */
        public Integer getCspmAlarmCount() {
            return this.cspmAlarmCount;
        }

        /**
         * @return exploitHealthCount
         */
        public Integer getExploitHealthCount() {
            return this.exploitHealthCount;
        }

        /**
         * @return exposureComponent
         */
        public String getExposureComponent() {
            return this.exposureComponent;
        }

        /**
         * @return exposureIp
         */
        public String getExposureIp() {
            return this.exposureIp;
        }

        /**
         * @return exposurePort
         */
        public String getExposurePort() {
            return this.exposurePort;
        }

        /**
         * @return exposureType
         */
        public String getExposureType() {
            return this.exposureType;
        }

        /**
         * @return exposureTypeId
         */
        public String getExposureTypeId() {
            return this.exposureTypeId;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return laterVulCount
         */
        public Integer getLaterVulCount() {
            return this.laterVulCount;
        }

        /**
         * @return nntfVulCount
         */
        public Integer getNntfVulCount() {
            return this.nntfVulCount;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return totalVulCount
         */
        public Integer getTotalVulCount() {
            return this.totalVulCount;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Integer asapVulCount; 
            private Integer assetType; 
            private String cloudAssetInfo; 
            private Integer cspmAlarmCount; 
            private Integer exploitHealthCount; 
            private String exposureComponent; 
            private String exposureIp; 
            private String exposurePort; 
            private String exposureType; 
            private String exposureTypeId; 
            private Long groupId; 
            private String groupName; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private Integer laterVulCount; 
            private Integer nntfVulCount; 
            private String regionId; 
            private Integer totalVulCount; 
            private String uuid; 

            /**
             * <p>The number of high-severity vulnerabilities that are exposed on the Internet and can be exploited by attackers.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder asapVulCount(Integer asapVulCount) {
                this.asapVulCount = asapVulCount;
                return this;
            }

            /**
             * AssetType.
             */
            public Builder assetType(Integer assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * CloudAssetInfo.
             */
            public Builder cloudAssetInfo(String cloudAssetInfo) {
                this.cloudAssetInfo = cloudAssetInfo;
                return this;
            }

            /**
             * CspmAlarmCount.
             */
            public Builder cspmAlarmCount(Integer cspmAlarmCount) {
                this.cspmAlarmCount = cspmAlarmCount;
                return this;
            }

            /**
             * <p>The total number of servers that are exposed on the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder exploitHealthCount(Integer exploitHealthCount) {
                this.exploitHealthCount = exploitHealthCount;
                return this;
            }

            /**
             * <p>The server component that is exposed on the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>openssl,openssh</p>
             */
            public Builder exposureComponent(String exposureComponent) {
                this.exposureComponent = exposureComponent;
                return this;
            }

            /**
             * <p>The public IP address that is exposed on the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>116.12.XX.XX</p>
             */
            public Builder exposureIp(String exposureIp) {
                this.exposureIp = exposureIp;
                return this;
            }

            /**
             * <p>The port that is exposed on the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder exposurePort(String exposurePort) {
                this.exposurePort = exposurePort;
                return this;
            }

            /**
             * <p>The resource from which the asset is exposed. Valid values:</p>
             * <ul>
             * <li><strong>INTERNET_IP</strong>: the public IP address of an ECS instance</li>
             * <li><strong>SLB</strong>: the public IP address of a Server Load Balancer (SLB) instance</li>
             * <li><strong>EIP</strong>: an elastic IP address (EIP)</li>
             * <li><strong>DNAT</strong>: the NAT gateway that connects to the Internet by using the DNAT feature</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INTERNET_IP</p>
             */
            public Builder exposureType(String exposureType) {
                this.exposureType = exposureType;
                return this;
            }

            /**
             * <p>The ID of the instance to which the resource belongs. The valid values of this parameter vary based on the ExposureType parameter.</p>
             * <ul>
             * <li>If the value of the ExposureType parameter is <strong>INTERNET_IP</strong>, this parameter is empty.</li>
             * <li>If the value of the ExposureType parameter is <strong>SLB</strong>, the value of this parameter is the ID of the SLB instance.</li>
             * <li>If the value of the ExposureType parameter is <strong>EIP</strong>, the value of this parameter is the ID of the EIP.</li>
             * <li>If the value of the ExposureType parameter is <strong>DNAT</strong>, the value of this parameter is the ID of the NAT gateway.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>i-ew11313a****</p>
             */
            public Builder exposureTypeId(String exposureTypeId) {
                this.exposureTypeId = exposureTypeId;
                return this;
            }

            /**
             * <p>The ID of the server group.</p>
             * 
             * <strong>example:</strong>
             * <p>9469268</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the server group.</p>
             * 
             * <strong>example:</strong>
             * <p>testGroup</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The ID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1g6wxdwps7s9dz****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>abc_centos7.2_005</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>116.12.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The number of medium-severity vulnerabilities that are exposed on the Internet and can be exploited by attackers.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder laterVulCount(Integer laterVulCount) {
                this.laterVulCount = laterVulCount;
                return this;
            }

            /**
             * <p>The number of low-severity vulnerabilities that are exposed on the Internet and can be exploited by attackers.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder nntfVulCount(Integer nntfVulCount) {
                this.nntfVulCount = nntfVulCount;
                return this;
            }

            /**
             * <p>The ID of the region where the server resides.</p>
             * <blockquote>
             * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The total number of vulnerabilities that are exposed on the Internet and can be exploited by attackers.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalVulCount(Integer totalVulCount) {
                this.totalVulCount = totalVulCount;
                return this;
            }

            /**
             * <p>The UUID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>dd803d9e-a337-4add-9c5b-7d503e08****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public ExposedInstances build() {
                return new ExposedInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeExposedInstanceListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExposedInstanceListResponseBody</p>
     */
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
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries about the servers that are exposed on the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
