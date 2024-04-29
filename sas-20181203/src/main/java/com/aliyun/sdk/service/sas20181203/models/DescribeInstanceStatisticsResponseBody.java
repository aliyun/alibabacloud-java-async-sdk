// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceStatisticsResponseBody</p>
 */
public class DescribeInstanceStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceStatisticsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * The risk information about the asset.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceStatisticsResponseBody build() {
            return new DescribeInstanceStatisticsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        private Integer account;

        @com.aliyun.core.annotation.NameInMap("AgentlessAll")
        private Integer agentlessAll;

        @com.aliyun.core.annotation.NameInMap("AgentlessBaseline")
        private Integer agentlessBaseline;

        @com.aliyun.core.annotation.NameInMap("AgentlessMalicious")
        private Integer agentlessMalicious;

        @com.aliyun.core.annotation.NameInMap("AgentlessVulCve")
        private Integer agentlessVulCve;

        @com.aliyun.core.annotation.NameInMap("AgentlessVulSca")
        private Integer agentlessVulSca;

        @com.aliyun.core.annotation.NameInMap("AgentlessVulSys")
        private Integer agentlessVulSys;

        @com.aliyun.core.annotation.NameInMap("AppNum")
        private Integer appNum;

        @com.aliyun.core.annotation.NameInMap("CmsNum")
        private Integer cmsNum;

        @com.aliyun.core.annotation.NameInMap("CspmNum")
        private Integer cspmNum;

        @com.aliyun.core.annotation.NameInMap("CveNum")
        private Integer cveNum;

        @com.aliyun.core.annotation.NameInMap("EmgNum")
        private Integer emgNum;

        @com.aliyun.core.annotation.NameInMap("Health")
        private Integer health;

        @com.aliyun.core.annotation.NameInMap("ScaNum")
        private Integer scaNum;

        @com.aliyun.core.annotation.NameInMap("Suspicious")
        private Integer suspicious;

        @com.aliyun.core.annotation.NameInMap("SysNum")
        private Integer sysNum;

        @com.aliyun.core.annotation.NameInMap("Trojan")
        private Integer trojan;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("Vul")
        private Integer vul;

        @com.aliyun.core.annotation.NameInMap("WeakPWNum")
        private Integer weakPWNum;

        private Data(Builder builder) {
            this.account = builder.account;
            this.agentlessAll = builder.agentlessAll;
            this.agentlessBaseline = builder.agentlessBaseline;
            this.agentlessMalicious = builder.agentlessMalicious;
            this.agentlessVulCve = builder.agentlessVulCve;
            this.agentlessVulSca = builder.agentlessVulSca;
            this.agentlessVulSys = builder.agentlessVulSys;
            this.appNum = builder.appNum;
            this.cmsNum = builder.cmsNum;
            this.cspmNum = builder.cspmNum;
            this.cveNum = builder.cveNum;
            this.emgNum = builder.emgNum;
            this.health = builder.health;
            this.scaNum = builder.scaNum;
            this.suspicious = builder.suspicious;
            this.sysNum = builder.sysNum;
            this.trojan = builder.trojan;
            this.uuid = builder.uuid;
            this.vul = builder.vul;
            this.weakPWNum = builder.weakPWNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public Integer getAccount() {
            return this.account;
        }

        /**
         * @return agentlessAll
         */
        public Integer getAgentlessAll() {
            return this.agentlessAll;
        }

        /**
         * @return agentlessBaseline
         */
        public Integer getAgentlessBaseline() {
            return this.agentlessBaseline;
        }

        /**
         * @return agentlessMalicious
         */
        public Integer getAgentlessMalicious() {
            return this.agentlessMalicious;
        }

        /**
         * @return agentlessVulCve
         */
        public Integer getAgentlessVulCve() {
            return this.agentlessVulCve;
        }

        /**
         * @return agentlessVulSca
         */
        public Integer getAgentlessVulSca() {
            return this.agentlessVulSca;
        }

        /**
         * @return agentlessVulSys
         */
        public Integer getAgentlessVulSys() {
            return this.agentlessVulSys;
        }

        /**
         * @return appNum
         */
        public Integer getAppNum() {
            return this.appNum;
        }

        /**
         * @return cmsNum
         */
        public Integer getCmsNum() {
            return this.cmsNum;
        }

        /**
         * @return cspmNum
         */
        public Integer getCspmNum() {
            return this.cspmNum;
        }

        /**
         * @return cveNum
         */
        public Integer getCveNum() {
            return this.cveNum;
        }

        /**
         * @return emgNum
         */
        public Integer getEmgNum() {
            return this.emgNum;
        }

        /**
         * @return health
         */
        public Integer getHealth() {
            return this.health;
        }

        /**
         * @return scaNum
         */
        public Integer getScaNum() {
            return this.scaNum;
        }

        /**
         * @return suspicious
         */
        public Integer getSuspicious() {
            return this.suspicious;
        }

        /**
         * @return sysNum
         */
        public Integer getSysNum() {
            return this.sysNum;
        }

        /**
         * @return trojan
         */
        public Integer getTrojan() {
            return this.trojan;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return vul
         */
        public Integer getVul() {
            return this.vul;
        }

        /**
         * @return weakPWNum
         */
        public Integer getWeakPWNum() {
            return this.weakPWNum;
        }

        public static final class Builder {
            private Integer account; 
            private Integer agentlessAll; 
            private Integer agentlessBaseline; 
            private Integer agentlessMalicious; 
            private Integer agentlessVulCve; 
            private Integer agentlessVulSca; 
            private Integer agentlessVulSys; 
            private Integer appNum; 
            private Integer cmsNum; 
            private Integer cspmNum; 
            private Integer cveNum; 
            private Integer emgNum; 
            private Integer health; 
            private Integer scaNum; 
            private Integer suspicious; 
            private Integer sysNum; 
            private Integer trojan; 
            private String uuid; 
            private Integer vul; 
            private Integer weakPWNum; 

            /**
             * The number of unusual logons to the asset.
             */
            public Builder account(Integer account) {
                this.account = account;
                return this;
            }

            /**
             * The number of alerts generated by the agentless detection feature.
             */
            public Builder agentlessAll(Integer agentlessAll) {
                this.agentlessAll = agentlessAll;
                return this;
            }

            /**
             * The number of baseline risks detected by the agentless detection feature.
             */
            public Builder agentlessBaseline(Integer agentlessBaseline) {
                this.agentlessBaseline = agentlessBaseline;
                return this;
            }

            /**
             * The number of malicious samples detected by the agentless detection feature.
             */
            public Builder agentlessMalicious(Integer agentlessMalicious) {
                this.agentlessMalicious = agentlessMalicious;
                return this;
            }

            /**
             * The number of system vulnerabilities detected by the agentless detection feature.
             */
            public Builder agentlessVulCve(Integer agentlessVulCve) {
                this.agentlessVulCve = agentlessVulCve;
                return this;
            }

            /**
             * The number of application vulnerabilities detected by the agentless detection feature.
             */
            public Builder agentlessVulSca(Integer agentlessVulSca) {
                this.agentlessVulSca = agentlessVulSca;
                return this;
            }

            /**
             * The number of Windows vulnerabilities detected by using agentless detection.
             */
            public Builder agentlessVulSys(Integer agentlessVulSys) {
                this.agentlessVulSys = agentlessVulSys;
                return this;
            }

            /**
             * The number of application vulnerabilities detected on the asset.
             */
            public Builder appNum(Integer appNum) {
                this.appNum = appNum;
                return this;
            }

            /**
             * The number of Web-CMS vulnerabilities detected on the asset.
             */
            public Builder cmsNum(Integer cmsNum) {
                this.cmsNum = cmsNum;
                return this;
            }

            /**
             * The number of configuration risks detected on the asset.
             */
            public Builder cspmNum(Integer cspmNum) {
                this.cspmNum = cspmNum;
                return this;
            }

            /**
             * The number of common vulnerabilities detected on the asset.
             */
            public Builder cveNum(Integer cveNum) {
                this.cveNum = cveNum;
                return this;
            }

            /**
             * The number of urgent vulnerabilities detected on the asset.
             */
            public Builder emgNum(Integer emgNum) {
                this.emgNum = emgNum;
                return this;
            }

            /**
             * The number of baseline risks detected on the asset.
             */
            public Builder health(Integer health) {
                this.health = health;
                return this;
            }

            /**
             * The number of middleware vulnerabilities detected on the asset.
             */
            public Builder scaNum(Integer scaNum) {
                this.scaNum = scaNum;
                return this;
            }

            /**
             * The number of alerts generated for the asset.
             */
            public Builder suspicious(Integer suspicious) {
                this.suspicious = suspicious;
                return this;
            }

            /**
             * The number of Windows system vulnerabilities detected on the asset.
             */
            public Builder sysNum(Integer sysNum) {
                this.sysNum = sysNum;
                return this;
            }

            /**
             * The number of trojans detected on the asset.
             */
            public Builder trojan(Integer trojan) {
                this.trojan = trojan;
                return this;
            }

            /**
             * The UUID of the asset.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * The total number of vulnerabilities detected on the asset.
             */
            public Builder vul(Integer vul) {
                this.vul = vul;
                return this;
            }

            /**
             * The number of weak passwords.
             */
            public Builder weakPWNum(Integer weakPWNum) {
                this.weakPWNum = weakPWNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
