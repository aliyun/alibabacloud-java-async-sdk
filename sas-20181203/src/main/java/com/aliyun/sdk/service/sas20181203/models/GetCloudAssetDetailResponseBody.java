// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetCloudAssetDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetCloudAssetDetailResponseBody</p>
 */
public class GetCloudAssetDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCloudAssetDetailResponseBody(Builder builder) {
        this.count = builder.count;
        this.instances = builder.instances;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudAssetDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List<Instances> instances; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCloudAssetDetailResponseBody model) {
            this.count = model.count;
            this.instances = model.instances;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The number of instances in the list of cloud assets returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>An array that consists of the details of the cloud assets.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>CB45CAED-31C3-517A-8619-10F632D3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCloudAssetDetailResponseBody build() {
            return new GetCloudAssetDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCloudAssetDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetCloudAssetDetailResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmStatus")
        private String alarmStatus;

        @com.aliyun.core.annotation.NameInMap("AssetSubType")
        private Integer assetSubType;

        @com.aliyun.core.annotation.NameInMap("AssetSubTypeName")
        private String assetSubTypeName;

        @com.aliyun.core.annotation.NameInMap("AssetType")
        private Integer assetType;

        @com.aliyun.core.annotation.NameInMap("AssetTypeName")
        private String assetTypeName;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("DetailLink")
        private String detailLink;

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
            this.detailLink = builder.detailLink;
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
        public Integer getAssetSubType() {
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
         * @return detailLink
         */
        public String getDetailLink() {
            return this.detailLink;
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
            private Integer assetSubType; 
            private String assetSubTypeName; 
            private Integer assetType; 
            private String assetTypeName; 
            private Long createdTime; 
            private String detailLink; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String regionId; 
            private String riskStatus; 
            private String securityInfo; 
            private Integer vendor; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.alarmStatus = model.alarmStatus;
                this.assetSubType = model.assetSubType;
                this.assetSubTypeName = model.assetSubTypeName;
                this.assetType = model.assetType;
                this.assetTypeName = model.assetTypeName;
                this.createdTime = model.createdTime;
                this.detailLink = model.detailLink;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.internetIp = model.internetIp;
                this.regionId = model.regionId;
                this.riskStatus = model.riskStatus;
                this.securityInfo = model.securityInfo;
                this.vendor = model.vendor;
            } 

            /**
             * <p>Indicates whether alerts are generated for the current cloud asset. Valid values:</p>
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
             * <p>The subtype of the cloud asset.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder assetSubType(Integer assetSubType) {
                this.assetSubType = assetSubType;
                return this;
            }

            /**
             * <p>The name of the cloud asset subtype.</p>
             * 
             * <strong>example:</strong>
             * <p>INSTANCE</p>
             */
            public Builder assetSubTypeName(String assetSubTypeName) {
                this.assetSubTypeName = assetSubTypeName;
                return this;
            }

            /**
             * <p>The type of the cloud asset. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: ECS.</li>
             * <li><strong>1</strong>: SLB.</li>
             * <li><strong>3</strong>: ApsaraDB RDS.</li>
             * <li><strong>4</strong>: ApsaraDB for MongoDB.</li>
             * <li><strong>5</strong>: ApsaraDB for Redis.</li>
             * <li><strong>6</strong>: Container Registry.</li>
             * <li><strong>8</strong>: Container Service for Kubernetes.</li>
             * <li><strong>9</strong>: VPC.</li>
             * <li><strong>11</strong>: ActionTrail.</li>
             * <li><strong>12</strong>: CDN.</li>
             * <li><strong>13</strong>: Certificate Management Service.</li>
             * <li><strong>14</strong>: Apsara Devops.</li>
             * <li><strong>15</strong>: RAM.</li>
             * <li><strong>16</strong>: Anti-DDoS.</li>
             * <li><strong>17</strong>: WAF.</li>
             * <li><strong>18</strong>: OSS.</li>
             * <li><strong>19</strong>: PolarDB.</li>
             * <li><strong>20</strong>: ApsaraDB RDS for PostgreSQL.</li>
             * <li><strong>21</strong>: MSE.</li>
             * <li><strong>22</strong>: NAS.</li>
             * <li><strong>23</strong>: DSC.</li>
             * <li><strong>24</strong>: EIP.</li>
             * <li><strong>25</strong>: IDaaS-EIAM.</li>
             * <li><strong>26</strong>: PolarDB-X.</li>
             * <li><strong>27</strong>: Elasticsearch.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder assetType(Integer assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>The name of the cloud asset type.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder assetTypeName(String assetTypeName) {
                this.assetTypeName = assetTypeName;
                return this;
            }

            /**
             * <p>The time when the instance was created. The value is a timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1607365213000</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The detailed address of the cloud asset.</p>
             */
            public Builder detailLink(String detailLink) {
                this.detailLink = detailLink;
                return this;
            }

            /**
             * <p>The instance ID of the cloud asset.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf6t6u05n6g48****</p>
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
             * <p>The public IP address of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The region in which the cloud asset resides.</p>
             * <blockquote>
             * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hanghzou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Indicates whether risks are detected on the current cloud asset. Valid values:</p>
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
             * <p>{&quot;seriousNum&quot;:0,&quot;appNum&quot;:0,&quot;baselineMedium&quot;:0,&quot;remindNum&quot;:0,&quot;imageVulNntf&quot;:0,&quot;cveNum&quot;:0,&quot;vul&quot;:0,&quot;uuid&quot;:&quot;rm-uf6t6u05n6g485o70&quot;,&quot;emgNum&quot;:0,&quot;weakPWNum&quot;:0,&quot;imageMaliciousFileRemind&quot;:0,&quot;imageBaselineMedium&quot;:0,&quot;laterVulCount&quot;:0,&quot;cmsNum&quot;:0,&quot;imageMaliciousFileSerious&quot;:0,&quot;agentlessMalicious&quot;:0,&quot;suspNum&quot;:0,&quot;imageBaselineHigh&quot;:0,&quot;asapVulCount&quot;:0,&quot;imageVulLater&quot;:0,&quot;agentlessAll&quot;:0,&quot;sysNum&quot;:0,&quot;containerLater&quot;:0,&quot;containerSuspicious&quot;:0,&quot;imageBaselineNum&quot;:0,&quot;newSuspicious&quot;:0,&quot;nntfVulCount&quot;:0,&quot;scaNum&quot;:0,&quot;containerNntf&quot;:0,&quot;health&quot;:0,&quot;trojan&quot;:0,&quot;suspicious&quot;:0,&quot;imageMaliciousFileSuspicious&quot;:0,&quot;containerRemind&quot;:0,&quot;baselineLow&quot;:0,&quot;imageVulAsap&quot;:0,&quot;imageBaselineLow&quot;:0,&quot;containerAsap&quot;:0,&quot;agentlessBaseline&quot;:0,&quot;agentlessVulSca&quot;:0,&quot;agentlessVulCve&quot;:0,&quot;containerSerious&quot;:0,&quot;baselineHigh&quot;:0,&quot;account&quot;:0,&quot;baselineNum&quot;:6}</p>
             */
            public Builder securityInfo(String securityInfo) {
                this.securityInfo = securityInfo;
                return this;
            }

            /**
             * <p>The service provider of the cloud asset. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Alibaba Cloud.</li>
             * <li><strong>1</strong>: service provider that is unrecognized.</li>
             * <li><strong>2</strong>: data center.</li>
             * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: third-party service provider.</li>
             * <li><strong>8</strong>: simple application server.</li>
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
}
