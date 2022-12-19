// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExposedInstanceDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExposedInstanceDetailResponseBody</p>
 */
public class DescribeExposedInstanceDetailResponseBody extends TeaModel {
    @NameInMap("ExposedChains")
    private java.util.List < ExposedChains> exposedChains;

    @NameInMap("RequestId")
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
    public java.util.List < ExposedChains> getExposedChains() {
        return this.exposedChains;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ExposedChains> exposedChains; 
        private String requestId; 

        /**
         * The exposure details about the server.
         */
        public Builder exposedChains(java.util.List < ExposedChains> exposedChains) {
            this.exposedChains = exposedChains;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeExposedInstanceDetailResponseBody build() {
            return new DescribeExposedInstanceDetailResponseBody(this);
        } 

    } 

    public static class AllVulList extends TeaModel {
        @NameInMap("AliasName")
        private String aliasName;

        @NameInMap("Name")
        private String name;

        @NameInMap("Necessity")
        private String necessity;

        @NameInMap("Type")
        private String type;

        @NameInMap("Uuid")
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
             * The alias of the vulnerability.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * The name of the vulnerability.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The priority to fix the vulnerability. Valid values:
             * <p>
             * 
             * *   **asap**: high
             * *   **later**: medium
             * *   **nntf**: low
             * 
             * >  We recommend that you fix the vulnerabilities that have the **high** priority at the earliest opportunity.
             */
            public Builder necessity(String necessity) {
                this.necessity = necessity;
                return this;
            }

            /**
             * The type of the vulnerability. Valid values:
             * <p>
             * 
             * *   **cve**: Linux software vulnerabilities
             * *   **sys**: Windows system vulnerabilities
             * *   **cms**: Web-CMS vulnerabilities
             * *   **app**: application vulnerabilities
             * *   **emg**: urgent vulnerabilities
             * *   **sca**: middleware vulnerabilities
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The UUID of the server.
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
    public static class RealVulList extends TeaModel {
        @NameInMap("AliasName")
        private String aliasName;

        @NameInMap("Name")
        private String name;

        @NameInMap("Necessity")
        private String necessity;

        @NameInMap("Type")
        private String type;

        @NameInMap("Uuid")
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
             * The alias of the vulnerability.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * The name of the vulnerability.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The priority to fix the vulnerability. Valid values:
             * <p>
             * 
             * *   **asap**: high
             * *   **later**: medium
             * *   **nntf**: low
             * 
             * >  We recommend that you fix the vulnerabilities that have the **high** priority at the earliest opportunity.
             */
            public Builder necessity(String necessity) {
                this.necessity = necessity;
                return this;
            }

            /**
             * The type of the vulnerability. Valid values:
             * <p>
             * 
             * *   **cve**: Linux software vulnerabilities
             * *   **sys**: Windows system vulnerabilities
             * *   **cms**: Web-CMS vulnerabilities
             * *   **app**: application vulnerabilities
             * *   **emg**: urgent vulnerabilities
             * *   **sca**: middleware vulnerabilities
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The UUID of the server.
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
    public static class ExposedChains extends TeaModel {
        @NameInMap("AllVulList")
        private java.util.List < AllVulList> allVulList;

        @NameInMap("ExposureComponent")
        private String exposureComponent;

        @NameInMap("ExposureIp")
        private String exposureIp;

        @NameInMap("ExposurePort")
        private String exposurePort;

        @NameInMap("ExposureType")
        private String exposureType;

        @NameInMap("ExposureTypeId")
        private String exposureTypeId;

        @NameInMap("GroupNo")
        private String groupNo;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("RealVulList")
        private java.util.List < RealVulList> realVulList;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Uuid")
        private String uuid;

        private ExposedChains(Builder builder) {
            this.allVulList = builder.allVulList;
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
        public java.util.List < AllVulList> getAllVulList() {
            return this.allVulList;
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
        public java.util.List < RealVulList> getRealVulList() {
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
            private java.util.List < AllVulList> allVulList; 
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
            private java.util.List < RealVulList> realVulList; 
            private String regionId; 
            private String uuid; 

            /**
             * The information about all vulnerabilities on the server.
             */
            public Builder allVulList(java.util.List < AllVulList> allVulList) {
                this.allVulList = allVulList;
                return this;
            }

            /**
             * The server component that is exposed on the Internet.
             */
            public Builder exposureComponent(String exposureComponent) {
                this.exposureComponent = exposureComponent;
                return this;
            }

            /**
             * The public IP address.
             */
            public Builder exposureIp(String exposureIp) {
                this.exposureIp = exposureIp;
                return this;
            }

            /**
             * The port that is exposed on the Internet.
             */
            public Builder exposurePort(String exposurePort) {
                this.exposurePort = exposurePort;
                return this;
            }

            /**
             * The resource from which the server is exposed. Valid values:
             * <p>
             * 
             * *   **INTERNET_IP**: the public IP address of an Elastic Compute Service (ECS) instance
             * *   **SLB**: the public IP address of a Server Load Balancer (SLB) instance
             * *   **EIP**: an elastic IP address (EIP)
             * *   **DNAT**: the NAT gateway that connects to the Internet by using the DNAT feature
             */
            public Builder exposureType(String exposureType) {
                this.exposureType = exposureType;
                return this;
            }

            /**
             * The ID of the instance to which the resource belongs. The valid values of this parameter vary based on the value of the ExposureType parameter.
             * <p>
             * 
             * *   If the value of the ExposureType parameter is **INTERNET_IP**, the value of this parameter is an empty string.
             * *   If the value of the ExposureType parameter is **SLB**, the value of this parameter is the ID of the Internet-facing SLB instance.
             * *   If the value of the ExposureType parameter is **EIP**, the value of this parameter is the ID of the EIP.
             * *   If the value of the ExposureType parameter is **DNAT**, the value of this parameter is the ID of the NAT gateway.
             */
            public Builder exposureTypeId(String exposureTypeId) {
                this.exposureTypeId = exposureTypeId;
                return this;
            }

            /**
             * The server group to which the server belongs.
             */
            public Builder groupNo(String groupNo) {
                this.groupNo = groupNo;
                return this;
            }

            /**
             * The ID of the server.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the server.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The public IP address of the server.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The private IP address of the server.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The information about the vulnerabilities that are exposed on the Internet and can be exploited by attackers.
             */
            public Builder realVulList(java.util.List < RealVulList> realVulList) {
                this.realVulList = realVulList;
                return this;
            }

            /**
             * The region in which the server resides.
             * <p>
             * 
             * >  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The UUID of the server.
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
