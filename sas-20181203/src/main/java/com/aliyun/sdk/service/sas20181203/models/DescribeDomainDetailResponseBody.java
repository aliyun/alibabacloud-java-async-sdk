// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainDetailResponseBody</p>
 */
public class DescribeDomainDetailResponseBody extends TeaModel {
    @NameInMap("AlarmCount")
    private Integer alarmCount;

    @NameInMap("Domain")
    private String domain;

    @NameInMap("DomainDetailItems")
    private java.util.List < DomainDetailItems> domainDetailItems;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RootDomain")
    private String rootDomain;

    @NameInMap("VulCount")
    private Integer vulCount;

    private DescribeDomainDetailResponseBody(Builder builder) {
        this.alarmCount = builder.alarmCount;
        this.domain = builder.domain;
        this.domainDetailItems = builder.domainDetailItems;
        this.requestId = builder.requestId;
        this.rootDomain = builder.rootDomain;
        this.vulCount = builder.vulCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return alarmCount
     */
    public Integer getAlarmCount() {
        return this.alarmCount;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return domainDetailItems
     */
    public java.util.List < DomainDetailItems> getDomainDetailItems() {
        return this.domainDetailItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rootDomain
     */
    public String getRootDomain() {
        return this.rootDomain;
    }

    /**
     * @return vulCount
     */
    public Integer getVulCount() {
        return this.vulCount;
    }

    public static final class Builder {
        private Integer alarmCount; 
        private String domain; 
        private java.util.List < DomainDetailItems> domainDetailItems; 
        private String requestId; 
        private String rootDomain; 
        private Integer vulCount; 

        /**
         * The total number of alerts in your website assets.
         */
        public Builder alarmCount(Integer alarmCount) {
            this.alarmCount = alarmCount;
            return this;
        }

        /**
         * The domain name.
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * An array that consists of the details about the domain asset.
         */
        public Builder domainDetailItems(java.util.List < DomainDetailItems> domainDetailItems) {
            this.domainDetailItems = domainDetailItems;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The name of the root domain that corresponds to the domain.
         */
        public Builder rootDomain(String rootDomain) {
            this.rootDomain = rootDomain;
            return this;
        }

        /**
         * The total number of vulnerabilities in your website assets.
         */
        public Builder vulCount(Integer vulCount) {
            this.vulCount = vulCount;
            return this;
        }

        public DescribeDomainDetailResponseBody build() {
            return new DescribeDomainDetailResponseBody(this);
        } 

    } 

    public static class DomainDetailItems extends TeaModel {
        @NameInMap("AssetType")
        private String assetType;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("Uuid")
        private String uuid;

        private DomainDetailItems(Builder builder) {
            this.assetType = builder.assetType;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainDetailItems create() {
            return builder().build();
        }

        /**
         * @return assetType
         */
        public String getAssetType() {
            return this.assetType;
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
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String assetType; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String uuid; 

            /**
             * The type of the domain asset. Valid values:
             * <p>
             * 
             * *   **0**: an Elastic Compute Service (ECS) instance
             * *   **1**: a Server Load Balancer (SLB) instance
             * *   **2**: a Network Address Translation (NAT) gateway
             * *   **3**: an ApsaraDB RDS instance
             * *   **4**: an ApsaraDB for MongoDB instance
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * The instance ID of the asset.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the asset.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The public IP address of the asset.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The private IP address of the asset.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The instance UUID of the domain asset.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public DomainDetailItems build() {
                return new DomainDetailItems(this);
            } 

        } 

    }
}
