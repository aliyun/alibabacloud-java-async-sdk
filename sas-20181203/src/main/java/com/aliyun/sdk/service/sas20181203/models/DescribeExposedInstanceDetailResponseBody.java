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
 * {@link DescribeExposedInstanceDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExposedInstanceDetailResponseBody</p>
 */
public class DescribeExposedInstanceDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExposedChains")
    private java.util.List<ExposedChains> exposedChains;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeExposedInstanceDetailResponseBody(Builder builder) {
        this.exposedChains = builder.exposedChains;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExposedInstanceDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return exposedChains
     */
    public java.util.List<ExposedChains> getExposedChains() {
        return this.exposedChains;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ExposedChains> exposedChains; 
        private String requestId; 

        /**
         * <p>The list of exposure details of the server or database.</p>
         */
        public Builder exposedChains(java.util.List<ExposedChains> exposedChains) {
            this.exposedChains = exposedChains;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>C590482B-54A7-4273-8115-9DBE2DE46B26</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeExposedInstanceDetailResponseBody build() {
            return new DescribeExposedInstanceDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeExposedInstanceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExposedInstanceDetailResponseBody</p>
     */
    public static class AllVulList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Necessity")
        private String necessity;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private AllVulList(Builder builder) {
            this.aliasName = builder.aliasName;
            this.name = builder.name;
            this.necessity = builder.necessity;
            this.type = builder.type;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllVulList create() {
            return builder().build();
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return necessity
         */
        public String getNecessity() {
            return this.necessity;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String aliasName; 
            private String name; 
            private String necessity; 
            private String type; 
            private String uuid; 

            /**
             * <p>The alias of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>RHSA-2022:0274-Important: polkit pkexec Local Privilege Escalation Vulnerability(CVE-2021-4034)</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>The name of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>SCA:ACSV-2020-052801</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The priority to fix the vulnerability. Valid values:</p>
             * <ul>
             * <li><strong>asap</strong>: high</li>
             * <li><strong>later</strong>: medium</li>
             * <li><strong>nntf</strong>: low</li>
             * </ul>
             * <blockquote>
             * <p> We recommend that you fix the vulnerabilities that have the <strong>high</strong> priority at the earliest opportunity.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>asap</p>
             */
            public Builder necessity(String necessity) {
                this.necessity = necessity;
                return this;
            }

            /**
             * <p>The type of the vulnerability. Valid values:</p>
             * <ul>
             * <li><strong>cve</strong>: Linux software vulnerabilities</li>
             * <li><strong>sys</strong>: Windows system vulnerabilities</li>
             * <li><strong>cms</strong>: Web-CMS vulnerabilities</li>
             * <li><strong>app</strong>: application vulnerabilities</li>
             * <li><strong>emg</strong>: urgent vulnerabilities</li>
             * <li><strong>sca</strong>: middleware vulnerabilities</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sca</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The UUID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>4f9ce097-4a7d-48fe-baef-6960e5b6****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public AllVulList build() {
                return new AllVulList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeExposedInstanceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExposedInstanceDetailResponseBody</p>
     */
    public static class CspmRiskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetSubType")
        private Integer assetSubType;

        @com.aliyun.core.annotation.NameInMap("AssetSubTypeName")
        private String assetSubTypeName;

        @com.aliyun.core.annotation.NameInMap("AssetType")
        private Integer assetType;

        @com.aliyun.core.annotation.NameInMap("AssetTypeName")
        private String assetTypeName;

        @com.aliyun.core.annotation.NameInMap("CheckName")
        private String checkName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private Integer vendor;

        private CspmRiskList(Builder builder) {
            this.assetSubType = builder.assetSubType;
            this.assetSubTypeName = builder.assetSubTypeName;
            this.assetType = builder.assetType;
            this.assetTypeName = builder.assetTypeName;
            this.checkName = builder.checkName;
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
            this.riskLevel = builder.riskLevel;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CspmRiskList create() {
            return builder().build();
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
         * @return checkName
         */
        public String getCheckName() {
            return this.checkName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return vendor
         */
        public Integer getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private Integer assetSubType; 
            private String assetSubTypeName; 
            private Integer assetType; 
            private String assetTypeName; 
            private String checkName; 
            private String instanceId; 
            private String regionId; 
            private String riskLevel; 
            private Integer vendor; 

            /**
             * <p>The subtype of the cloud asset. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: Elastic Compute Service (ECS).</p>
             * <ul>
             * <li><strong>100</strong>: instance.</li>
             * </ul>
             * </li>
             * <li><p><strong>3</strong>: ApsaraDB RDS.</p>
             * <ul>
             * <li><strong>0</strong>: instance.</li>
             * </ul>
             * </li>
             * <li><p><strong>4</strong>: ApsaraDB for MongoDB (MongoDB).</p>
             * <ul>
             * <li><strong>0</strong>: instance.</li>
             * </ul>
             * </li>
             * <li><p><strong>5</strong>: ApsaraDB for Redis (Redis).</p>
             * <ul>
             * <li><strong>0</strong>: instance.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder assetSubType(Integer assetSubType) {
                this.assetSubType = assetSubType;
                return this;
            }

            /**
             * <p>The subtype name of the cloud asset. Valid values:</p>
             * <ul>
             * <li><strong>INSTANCE</strong>: MongoDB instance, Apsara DB for RDS instance, and ApsaraDB for Redis instance.</li>
             * <li><strong>ECS_INSTANCE</strong>: ECS instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INSTANCE</p>
             */
            public Builder assetSubTypeName(String assetSubTypeName) {
                this.assetSubTypeName = assetSubTypeName;
                return this;
            }

            /**
             * <p>The instance type. Valid values:</p>
             * <ul>
             * <li>0: an ECS instance.</li>
             * <li>3: an ApsaraDB RDS instance.</li>
             * <li>4: an ApsaraDB for MongoDB instance.</li>
             * <li>5: an ApsaraDB for Redis instance.</li>
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
             * <p>The name of the cloud asset type. Valid values:</p>
             * <ul>
             * <li><strong>ECS</strong></li>
             * <li><strong>RDS</strong></li>
             * <li><strong>KVSTORE</strong></li>
             * <li><strong>MONGODB</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder assetTypeName(String assetTypeName) {
                this.assetTypeName = assetTypeName;
                return this;
            }

            /**
             * <p>The name of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>Create Alert Rule</p>
             */
            public Builder checkName(String checkName) {
                this.checkName = checkName;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp14ggqzi9k6ocfb****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li><strong>HIGH</strong></li>
             * <li><strong>MEDIUM</strong></li>
             * <li><strong>LOW</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HIGH</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The type of the cloud asset by source. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: an asset provided by Alibaba Cloud.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            public CspmRiskList build() {
                return new CspmRiskList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeExposedInstanceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExposedInstanceDetailResponseBody</p>
     */
    public static class RealVulList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Necessity")
        private String necessity;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private RealVulList(Builder builder) {
            this.aliasName = builder.aliasName;
            this.name = builder.name;
            this.necessity = builder.necessity;
            this.type = builder.type;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RealVulList create() {
            return builder().build();
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return necessity
         */
        public String getNecessity() {
            return this.necessity;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String aliasName; 
            private String name; 
            private String necessity; 
            private String type; 
            private String uuid; 

            /**
             * <p>The alias of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>RHSA-2022:0274-Important: polkit pkexec Local Privilege Escalation Vulnerability(CVE-2021-4034)</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>The name of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>SCA:ACSV-2020-052801</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The priority to fix the vulnerability. Valid values:</p>
             * <ul>
             * <li><strong>asap</strong>: high</li>
             * <li><strong>later</strong>: medium</li>
             * <li><strong>nntf</strong>: low</li>
             * </ul>
             * <blockquote>
             * <p> We recommend that you fix the vulnerabilities that have the <strong>high</strong> priority at the earliest opportunity.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>asap</p>
             */
            public Builder necessity(String necessity) {
                this.necessity = necessity;
                return this;
            }

            /**
             * <p>The type of the vulnerability. Valid values:</p>
             * <ul>
             * <li><strong>cve</strong>: Linux software vulnerabilities</li>
             * <li><strong>sys</strong>: Windows system vulnerabilities</li>
             * <li><strong>cms</strong>: Web-CMS vulnerabilities</li>
             * <li><strong>app</strong>: application vulnerabilities</li>
             * <li><strong>emg</strong>: urgent vulnerabilities</li>
             * <li><strong>sca</strong>: middleware vulnerabilities</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sca</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The UUID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>4f9ce097-4a7d-48fe-baef-6960e5b6****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public RealVulList build() {
                return new RealVulList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeExposedInstanceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExposedInstanceDetailResponseBody</p>
     */
    public static class ExposedChains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllVulList")
        private java.util.List<AllVulList> allVulList;

        @com.aliyun.core.annotation.NameInMap("CspmRiskList")
        private java.util.List<CspmRiskList> cspmRiskList;

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

        @com.aliyun.core.annotation.NameInMap("GroupNo")
        private String groupNo;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("RealVulList")
        private java.util.List<RealVulList> realVulList;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private ExposedChains(Builder builder) {
            this.allVulList = builder.allVulList;
            this.cspmRiskList = builder.cspmRiskList;
            this.exposureComponent = builder.exposureComponent;
            this.exposureIp = builder.exposureIp;
            this.exposurePort = builder.exposurePort;
            this.exposureType = builder.exposureType;
            this.exposureTypeId = builder.exposureTypeId;
            this.groupNo = builder.groupNo;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.realVulList = builder.realVulList;
            this.regionId = builder.regionId;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExposedChains create() {
            return builder().build();
        }

        /**
         * @return allVulList
         */
        public java.util.List<AllVulList> getAllVulList() {
            return this.allVulList;
        }

        /**
         * @return cspmRiskList
         */
        public java.util.List<CspmRiskList> getCspmRiskList() {
            return this.cspmRiskList;
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
         * @return groupNo
         */
        public String getGroupNo() {
            return this.groupNo;
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
         * @return realVulList
         */
        public java.util.List<RealVulList> getRealVulList() {
            return this.realVulList;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private java.util.List<AllVulList> allVulList; 
            private java.util.List<CspmRiskList> cspmRiskList; 
            private String exposureComponent; 
            private String exposureIp; 
            private String exposurePort; 
            private String exposureType; 
            private String exposureTypeId; 
            private String groupNo; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private java.util.List<RealVulList> realVulList; 
            private String regionId; 
            private String uuid; 

            /**
             * <p>The information about all vulnerabilities on the server.</p>
             */
            public Builder allVulList(java.util.List<AllVulList> allVulList) {
                this.allVulList = allVulList;
                return this;
            }

            /**
             * <p>The list of configuration risks.</p>
             */
            public Builder cspmRiskList(java.util.List<CspmRiskList> cspmRiskList) {
                this.cspmRiskList = cspmRiskList;
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
             * <p>The IP address of the server or the public endpoint of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>47.99.XX.XX</p>
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
             * <p>The resource from which the server or database is exposed. Valid values:</p>
             * <ul>
             * <li><strong>INTERNET_IP</strong>: the public IP address of an Elastic Compute Service (ECS) instance.</li>
             * <li><strong>SLB</strong>: the public IP address of a Server Load Balancer (SLB) instance.</li>
             * <li><strong>EIP</strong>: an elastic IP address (EIP).</li>
             * <li><strong>DNAT</strong>: the Network Address Translation (NAT) gateway that connects to the Internet by using the Destination Network Address Translation (DNAT) feature</li>
             * <li><strong>DB_CONNECTION</strong>: the public endpoint of a database.</li>
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
             * <p>The ID of the instance to which the resource belongs. The valid values of this parameter vary based on the value of the ExposureType parameter.</p>
             * <ul>
             * <li>If the value of the ExposureType parameter is <strong>INTERNET_IP</strong>, this parameter is empty.</li>
             * <li>If the value of the ExposureType parameter is <strong>SLB</strong>, the value of this parameter is the ID of the SLB instance.</li>
             * <li>If the value of the ExposureType parameter is <strong>EIP</strong>, the value of this parameter is the ID of the EIP.</li>
             * <li>If the value of the ExposureType parameter is <strong>DNAT</strong>, the value of this parameter is the ID of the NAT gateway.</li>
             * <li>If the value of the ExposureType parameter is <strong>DB_CONNECTION</strong>, the value of this parameter is the ID of the database.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>eip-bp1bkgowzam49rld3****</p>
             */
            public Builder exposureTypeId(String exposureTypeId) {
                this.exposureTypeId = exposureTypeId;
                return this;
            }

            /**
             * <p>The server group to which the server belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp1iw5enua6gf5i2xr7z</p>
             */
            public Builder groupNo(String groupNo) {
                this.groupNo = groupNo;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp116qem8npvchqc****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>worker-k8s-for-cs-c929ee2a145214f89a8b248005be5****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>47.99.XX.XX</p>
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
             * <p>The information about the vulnerabilities that are exposed on the Internet and can be exploited by attackers.</p>
             */
            public Builder realVulList(java.util.List<RealVulList> realVulList) {
                this.realVulList = realVulList;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * <blockquote>
             * <p> For information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
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
             * <p>The UUID of the server or the instance ID of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>4f9ce097-4a7d-48fe-baef-6960e5b6****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public ExposedChains build() {
                return new ExposedChains(this);
            } 

        } 

    }
}
