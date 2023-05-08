// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceStatisticsResponseBody</p>
 */
public class DescribeInstanceStatisticsResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
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
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("Account")
        private Integer account;

        @NameInMap("AgentlessAll")
        private Integer agentlessAll;

        @NameInMap("AgentlessBaseline")
        private Integer agentlessBaseline;

        @NameInMap("AgentlessMalicious")
        private Integer agentlessMalicious;

        @NameInMap("AgentlessVulCve")
        private Integer agentlessVulCve;

        @NameInMap("AgentlessVulSca")
        private Integer agentlessVulSca;

        @NameInMap("AppNum")
        private Integer appNum;

        @NameInMap("CmsNum")
        private Integer cmsNum;

        @NameInMap("CspmNum")
        private Integer cspmNum;

        @NameInMap("CveNum")
        private Integer cveNum;

        @NameInMap("EmgNum")
        private Integer emgNum;

        @NameInMap("Health")
        private Integer health;

        @NameInMap("ScaNum")
        private Integer scaNum;

        @NameInMap("Suspicious")
        private Integer suspicious;

        @NameInMap("SysNum")
        private Integer sysNum;

        @NameInMap("Trojan")
        private Integer trojan;

        @NameInMap("Uuid")
        private String uuid;

        @NameInMap("Vul")
        private Integer vul;

        @NameInMap("WeakPWNum")
        private Integer weakPWNum;

        private Data(Builder builder) {
            this.account = builder.account;
            this.agentlessAll = builder.agentlessAll;
            this.agentlessBaseline = builder.agentlessBaseline;
            this.agentlessMalicious = builder.agentlessMalicious;
            this.agentlessVulCve = builder.agentlessVulCve;
            this.agentlessVulSca = builder.agentlessVulSca;
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
             * Account.
             */
            public Builder account(Integer account) {
                this.account = account;
                return this;
            }

            /**
             * AgentlessAll.
             */
            public Builder agentlessAll(Integer agentlessAll) {
                this.agentlessAll = agentlessAll;
                return this;
            }

            /**
             * AgentlessBaseline.
             */
            public Builder agentlessBaseline(Integer agentlessBaseline) {
                this.agentlessBaseline = agentlessBaseline;
                return this;
            }

            /**
             * AgentlessMalicious.
             */
            public Builder agentlessMalicious(Integer agentlessMalicious) {
                this.agentlessMalicious = agentlessMalicious;
                return this;
            }

            /**
             * AgentlessVulCve.
             */
            public Builder agentlessVulCve(Integer agentlessVulCve) {
                this.agentlessVulCve = agentlessVulCve;
                return this;
            }

            /**
             * AgentlessVulSca.
             */
            public Builder agentlessVulSca(Integer agentlessVulSca) {
                this.agentlessVulSca = agentlessVulSca;
                return this;
            }

            /**
             * AppNum.
             */
            public Builder appNum(Integer appNum) {
                this.appNum = appNum;
                return this;
            }

            /**
             * CmsNum.
             */
            public Builder cmsNum(Integer cmsNum) {
                this.cmsNum = cmsNum;
                return this;
            }

            /**
             * CspmNum.
             */
            public Builder cspmNum(Integer cspmNum) {
                this.cspmNum = cspmNum;
                return this;
            }

            /**
             * CveNum.
             */
            public Builder cveNum(Integer cveNum) {
                this.cveNum = cveNum;
                return this;
            }

            /**
             * EmgNum.
             */
            public Builder emgNum(Integer emgNum) {
                this.emgNum = emgNum;
                return this;
            }

            /**
             * Health.
             */
            public Builder health(Integer health) {
                this.health = health;
                return this;
            }

            /**
             * ScaNum.
             */
            public Builder scaNum(Integer scaNum) {
                this.scaNum = scaNum;
                return this;
            }

            /**
             * Suspicious.
             */
            public Builder suspicious(Integer suspicious) {
                this.suspicious = suspicious;
                return this;
            }

            /**
             * SysNum.
             */
            public Builder sysNum(Integer sysNum) {
                this.sysNum = sysNum;
                return this;
            }

            /**
             * Trojan.
             */
            public Builder trojan(Integer trojan) {
                this.trojan = trojan;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * Vul.
             */
            public Builder vul(Integer vul) {
                this.vul = vul;
                return this;
            }

            /**
             * WeakPWNum.
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
