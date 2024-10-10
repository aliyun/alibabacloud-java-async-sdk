// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListCloudAssetInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCloudAssetInstancesResponseBody</p>
 */
public class ListCloudAssetInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List < Instances> instances;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListCloudAssetInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudAssetInstancesResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List < Instances> instances; 
        private PageInfo pageInfo; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The details of the cloud assets.</p>
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
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
         * <p>028CF634-5268-5660-9575-48C9ED6BF880</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCloudAssetInstancesResponseBody build() {
            return new ListCloudAssetInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCloudAssetInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudAssetInstancesResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmStatus")
        private String alarmStatus;

        @com.aliyun.core.annotation.NameInMap("AssetSubType")
        private String assetSubType;

        @com.aliyun.core.annotation.NameInMap("AssetSubTypeName")
        private String assetSubTypeName;

        @com.aliyun.core.annotation.NameInMap("AssetType")
        private Integer assetType;

        @com.aliyun.core.annotation.NameInMap("AssetTypeName")
        private String assetTypeName;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RiskStatus")
        private String riskStatus;

        @com.aliyun.core.annotation.NameInMap("SecurityInfo")
        private String securityInfo;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private Integer vendor;

        private Instances(Builder builder) {
            this.alarmStatus = builder.alarmStatus;
            this.assetSubType = builder.assetSubType;
            this.assetSubTypeName = builder.assetSubTypeName;
            this.assetType = builder.assetType;
            this.assetTypeName = builder.assetTypeName;
            this.createdTime = builder.createdTime;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.regionId = builder.regionId;
            this.riskStatus = builder.riskStatus;
            this.securityInfo = builder.securityInfo;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return alarmStatus
         */
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        /**
         * @return assetSubType
         */
        public String getAssetSubType() {
            return this.assetSubType;
        }

        /**
         * @return assetSubTypeName
         */
        public String getAssetSubTypeName() {
            return this.assetSubTypeName;
        }

        /**
         * @return assetType
         */
        public Integer getAssetType() {
            return this.assetType;
        }

        /**
         * @return assetTypeName
         */
        public String getAssetTypeName() {
            return this.assetTypeName;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return riskStatus
         */
        public String getRiskStatus() {
            return this.riskStatus;
        }

        /**
         * @return securityInfo
         */
        public String getSecurityInfo() {
            return this.securityInfo;
        }

        /**
         * @return vendor
         */
        public Integer getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String alarmStatus; 
            private String assetSubType; 
            private String assetSubTypeName; 
            private Integer assetType; 
            private String assetTypeName; 
            private Long createdTime; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String regionId; 
            private String riskStatus; 
            private String securityInfo; 
            private Integer vendor; 

            /**
             * <p>Indicates whether alerts are generated for the cloud asset. Valid values:</p>
             * <ul>
             * <li><strong>YES</strong></li>
             * <li><strong>NO</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NO</p>
             */
            public Builder alarmStatus(String alarmStatus) {
                this.alarmStatus = alarmStatus;
                return this;
            }

            /**
             * <p>The subtype of the cloud service. The subtype of the cloud asset. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: ECS</p>
             * <ul>
             * <li><strong>0</strong>: instance</li>
             * <li><strong>1</strong>: disk (storage)</li>
             * <li><strong>2</strong>: security group</li>
             * </ul>
             * </li>
             * <li><p><strong>1</strong>: SLB</p>
             * <ul>
             * <li><strong>0</strong>: SLB</li>
             * <li><strong>1</strong>: Application Load Balancer (ALB)</li>
             * </ul>
             * </li>
             * <li><p><strong>3</strong>: ApsaraDB RDS</p>
             * <ul>
             * <li><strong>0</strong>: instance</li>
             * </ul>
             * </li>
             * <li><p><strong>4</strong>: ApsaraDB for MongoDB</p>
             * <ul>
             * <li><strong>0</strong>: instance</li>
             * </ul>
             * </li>
             * <li><p><strong>5</strong>: ApsaraDB for Redis</p>
             * <ul>
             * <li><strong>0</strong>: instance</li>
             * </ul>
             * </li>
             * <li><p><strong>6</strong>: Container Registry</p>
             * <ul>
             * <li><strong>1</strong>: Enterprise Edition</li>
             * <li><strong>2</strong>: Personal Edition</li>
             * </ul>
             * </li>
             * <li><p><strong>8</strong>: ACK</p>
             * <ul>
             * <li><strong>0</strong>: cluster</li>
             * </ul>
             * </li>
             * <li><p><strong>9</strong>: VPC</p>
             * <ul>
             * <li><strong>0</strong>: NAT gateway</li>
             * <li><strong>1</strong>: EIP</li>
             * <li><strong>2</strong>: VPN</li>
             * <li><strong>3</strong>: FLOW_LOG</li>
             * </ul>
             * </li>
             * <li><p><strong>11</strong>: ActionTrail</p>
             * <ul>
             * <li><strong>0</strong>: trail</li>
             * </ul>
             * </li>
             * <li><p><strong>12</strong>: Alibaba Cloud CDN</p>
             * <ul>
             * <li><strong>0</strong>: instance</li>
             * </ul>
             * </li>
             * <li><p><strong>13</strong>: Certificate Management Service (formerly SSL Certificates Service)</p>
             * <ul>
             * <li><strong>0</strong>: certificate</li>
             * </ul>
             * </li>
             * <li><p><strong>14</strong>: Apsara Devops</p>
             * <ul>
             * <li><strong>0</strong>: organization</li>
             * </ul>
             * </li>
             * <li><p><strong>16</strong>: Anti-DDoS</p>
             * <ul>
             * <li><strong>0</strong>: instance</li>
             * </ul>
             * </li>
             * <li><p><strong>17</strong>: WAF</p>
             * <ul>
             * <li><strong>0</strong>: domain name</li>
             * </ul>
             * </li>
             * <li><p><strong>18</strong>: OSS</p>
             * <ul>
             * <li><strong>0</strong>: bucket</li>
             * </ul>
             * </li>
             * <li><p><strong>19</strong>: PolarDB</p>
             * <ul>
             * <li><strong>0</strong>: cluster</li>
             * </ul>
             * </li>
             * <li><p><strong>20</strong>: ApsaraDB RDS for PostgreSQL</p>
             * <ul>
             * <li><strong>0</strong>: instance</li>
             * </ul>
             * </li>
             * <li><p><strong>21</strong>: MSE</p>
             * <ul>
             * <li><strong>0</strong>: cluster</li>
             * </ul>
             * </li>
             * <li><p><strong>22</strong>: NAS</p>
             * <ul>
             * <li><strong>0</strong>: file system</li>
             * </ul>
             * </li>
             * <li><p><strong>23</strong>: DSC</p>
             * <ul>
             * <li><strong>0</strong>: instance</li>
             * </ul>
             * </li>
             * <li><p><strong>24</strong>: EIP</p>
             * <ul>
             * <li><strong>0</strong>: Anycast EIP</li>
             * </ul>
             * </li>
             * <li><p><strong>25</strong>: IDaaS EIAM</p>
             * <ul>
             * <li><strong>0</strong>: instance</li>
             * </ul>
             * </li>
             * <li><p><strong>26</strong>: PolarDB-X</p>
             * <ul>
             * <li><strong>0</strong>: instance</li>
             * </ul>
             * </li>
             * <li><p><strong>27</strong>: Elasticsearch</p>
             * <ul>
             * <li><strong>0</strong>: instance</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder assetSubType(String assetSubType) {
                this.assetSubType = assetSubType;
                return this;
            }

            /**
             * <p>The subtype name of the cloud asset.</p>
             * 
             * <strong>example:</strong>
             * <p>SECURITY_GROUP</p>
             */
            public Builder assetSubTypeName(String assetSubTypeName) {
                this.assetSubTypeName = assetSubTypeName;
                return this;
            }

            /**
             * <p>The type of the cloud asset. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Elastic Compute Service (ECS)</li>
             * <li><strong>1</strong>: Server Load Balancer (SLB)</li>
             * <li><strong>3</strong>: ApsaraDB RDS</li>
             * <li><strong>4</strong>: ApsaraDB for MongoDB</li>
             * <li><strong>5</strong>: ApsaraDB for Redis</li>
             * <li><strong>6</strong>: Container Registry</li>
             * <li><strong>8</strong>: Container Service for Kubernetes (ACK)</li>
             * <li><strong>9</strong>: Virtual Private Cloud (VPC)</li>
             * <li><strong>11</strong>: ActionTrail</li>
             * <li><strong>12</strong>: Alibaba Cloud CDN</li>
             * <li><strong>13</strong>: Certificate Management Service (formerly SSL Certificates Service)</li>
             * <li><strong>14</strong>: Apsara Devops</li>
             * <li><strong>16</strong>: Anti-DDoS</li>
             * <li><strong>17</strong>: Web Application Firewall (WAF)</li>
             * <li><strong>18</strong>: Object Storage Service (OSS)</li>
             * <li><strong>19</strong>: PolarDB</li>
             * <li><strong>20</strong>: ApsaraDB RDS for PostgreSQL</li>
             * <li><strong>21</strong>: Microservices Engine (MSE)</li>
             * <li><strong>22</strong>: Apsara File Storage NAS (NAS)</li>
             * <li><strong>23</strong>: Data Security Center (DSC)</li>
             * <li><strong>24</strong>: Elastic IP Address (EIP)</li>
             * <li><strong>25</strong>: Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM)</li>
             * <li><strong>26</strong>: PolarDB-X</li>
             * <li><strong>27</strong>: Elasticsearch</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder assetType(Integer assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>The type name of the cloud asset.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder assetTypeName(String assetTypeName) {
                this.assetTypeName = assetTypeName;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1607365213000</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The instance ID of the cloud asset.</p>
             * 
             * <strong>example:</strong>
             * <p>d-uf60vevzkztnflx7cny5</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name of the cloud asset.</p>
             * 
             * <strong>example:</strong>
             * <p>yztest-l***</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the cloud asset.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The ID of the region to which the cloud asset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hanghzou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Indicates whether risks are detected on the cloud asset. Valid values:</p>
             * <ul>
             * <li><strong>YES</strong></li>
             * <li><strong>NO</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NO</p>
             */
            public Builder riskStatus(String riskStatus) {
                this.riskStatus = riskStatus;
                return this;
            }

            /**
             * <p>The security information about the cloud asset.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;seriousNum&quot;:0,&quot;appNum&quot;:0,&quot;baselineMedium&quot;:0,&quot;remindNum&quot;:0,&quot;imageVulNntf&quot;:0,&quot;cveNum&quot;:0,&quot;vul&quot;:0,&quot;uuid&quot;:&quot;yuejia-test&quot;,&quot;emgNum&quot;:0,&quot;weakPWNum&quot;:0,&quot;imageMaliciousFileRemind&quot;:0,&quot;imageBaselineMedium&quot;:0,&quot;laterVulCount&quot;:0,&quot;cmsNum&quot;:0,&quot;imageMaliciousFileSerious&quot;:0,&quot;agentlessMalicious&quot;:0,&quot;suspNum&quot;:0,&quot;imageBaselineHigh&quot;:0,&quot;asapVulCount&quot;:0,&quot;imageVulLater&quot;:0,&quot;agentlessAll&quot;:0,&quot;sysNum&quot;:0,&quot;containerLater&quot;:0,&quot;containerSuspicious&quot;:0,&quot;imageBaselineNum&quot;:0,&quot;newSuspicious&quot;:0,&quot;nntfVulCount&quot;:0,&quot;scaNum&quot;:0,&quot;containerNntf&quot;:0,&quot;health&quot;:0,&quot;trojan&quot;:0,&quot;suspicious&quot;:0,&quot;imageMaliciousFileSuspicious&quot;:0,&quot;containerRemind&quot;:0,&quot;baselineLow&quot;:0,&quot;imageVulAsap&quot;:0,&quot;imageBaselineLow&quot;:0,&quot;containerAsap&quot;:0,&quot;agentlessBaseline&quot;:0,&quot;agentlessVulSca&quot;:0,&quot;agentlessVulCve&quot;:0,&quot;containerSerious&quot;:0,&quot;baselineHigh&quot;:0,&quot;account&quot;:0,&quot;baselineNum&quot;:5}</p>
             */
            public Builder securityInfo(String securityInfo) {
                this.securityInfo = securityInfo;
                return this;
            }

            /**
             * <p>The service provider (SP) of the cloud asset. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: a cloud asset provided by Alibaba Cloud</li>
             * <li><strong>1</strong>: a third-party cloud asset</li>
             * <li><strong>2</strong>: a cloud asset in a data center</li>
             * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: other cloud asset</li>
             * <li><strong>8</strong>: a lightweight cloud asset</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCloudAssetInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudAssetInstancesResponseBody</p>
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
             * <p>20</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of cloud assets.</p>
             * 
             * <strong>example:</strong>
             * <p>69</p>
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
