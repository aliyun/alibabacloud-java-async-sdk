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
 * {@link DescribeDomainDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainDetailResponseBody</p>
 */
public class DescribeDomainDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlarmCount")
    private Integer alarmCount;

    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("DomainDetailItems")
    private java.util.List<DomainDetailItems> domainDetailItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RootDomain")
    private String rootDomain;

    @com.aliyun.core.annotation.NameInMap("VulCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<DomainDetailItems> getDomainDetailItems() {
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
        private java.util.List<DomainDetailItems> domainDetailItems; 
        private String requestId; 
        private String rootDomain; 
        private Integer vulCount; 

        private Builder() {
        } 

        private Builder(DescribeDomainDetailResponseBody model) {
            this.alarmCount = model.alarmCount;
            this.domain = model.domain;
            this.domainDetailItems = model.domainDetailItems;
            this.requestId = model.requestId;
            this.rootDomain = model.rootDomain;
            this.vulCount = model.vulCount;
        } 

        /**
         * <p>The total number of alerts in your website assets.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder alarmCount(Integer alarmCount) {
            this.alarmCount = alarmCount;
            return this;
        }

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * <p>An array that consists of the details about the domain asset.</p>
         */
        public Builder domainDetailItems(java.util.List<DomainDetailItems> domainDetailItems) {
            this.domainDetailItems = domainDetailItems;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>3A85CFCF-05C8-451A-9E41-C0D5E96BA407</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The name of the root domain that corresponds to the domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder rootDomain(String rootDomain) {
            this.rootDomain = rootDomain;
            return this;
        }

        /**
         * <p>The total number of vulnerabilities in your website assets.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder vulCount(Integer vulCount) {
            this.vulCount = vulCount;
            return this;
        }

        public DescribeDomainDetailResponseBody build() {
            return new DescribeDomainDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainDetailResponseBody</p>
     */
    public static class DomainDetailItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetType")
        private String assetType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("Uuid")
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

            private Builder() {
            } 

            private Builder(DomainDetailItems model) {
                this.assetType = model.assetType;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.internetIp = model.internetIp;
                this.intranetIp = model.intranetIp;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The type of the domain asset. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: an Elastic Compute Service (ECS) instance</li>
             * <li><strong>1</strong>: a Server Load Balancer (SLB) instance</li>
             * <li><strong>2</strong>: a Network Address Translation (NAT) gateway</li>
             * <li><strong>3</strong>: an ApsaraDB RDS instance</li>
             * <li><strong>4</strong>: an ApsaraDB for MongoDB instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>The instance ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>i-m5e6w7dzsktt6mz4***</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>iZm5e6w7dzsktt6mz4yimeZ-6****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The instance UUID of the domain asset.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-bp1g9dohoyin9cjhn6****</p>
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
