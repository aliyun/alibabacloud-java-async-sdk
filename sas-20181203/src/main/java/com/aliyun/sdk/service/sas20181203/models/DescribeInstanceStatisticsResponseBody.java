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
 * {@link DescribeInstanceStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceStatisticsResponseBody</p>
 */
public class DescribeInstanceStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInstanceStatisticsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The risk information about assets.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>8F035A9D-D19F-5430-8CA5-1497991B7C61</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceStatisticsResponseBody build() {
            return new DescribeInstanceStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceStatisticsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        private Integer account;

        @com.aliyun.core.annotation.NameInMap("AgentlessAll")
        private Integer agentlessAll;

        @com.aliyun.core.annotation.NameInMap("AgentlessBaseline")
        private Integer agentlessBaseline;

        @com.aliyun.core.annotation.NameInMap("AgentlessMalicious")
        private Integer agentlessMalicious;

        @com.aliyun.core.annotation.NameInMap("AgentlessSensitiveFile")
        private Integer agentlessSensitiveFile;

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
            this.agentlessSensitiveFile = builder.agentlessSensitiveFile;
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
         * @return agentlessSensitiveFile
         */
        public Integer getAgentlessSensitiveFile() {
            return this.agentlessSensitiveFile;
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
            private Integer agentlessSensitiveFile; 
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.account = model.account;
                this.agentlessAll = model.agentlessAll;
                this.agentlessBaseline = model.agentlessBaseline;
                this.agentlessMalicious = model.agentlessMalicious;
                this.agentlessSensitiveFile = model.agentlessSensitiveFile;
                this.agentlessVulCve = model.agentlessVulCve;
                this.agentlessVulSca = model.agentlessVulSca;
                this.agentlessVulSys = model.agentlessVulSys;
                this.appNum = model.appNum;
                this.cmsNum = model.cmsNum;
                this.cspmNum = model.cspmNum;
                this.cveNum = model.cveNum;
                this.emgNum = model.emgNum;
                this.health = model.health;
                this.scaNum = model.scaNum;
                this.suspicious = model.suspicious;
                this.sysNum = model.sysNum;
                this.trojan = model.trojan;
                this.uuid = model.uuid;
                this.vul = model.vul;
                this.weakPWNum = model.weakPWNum;
            } 

            /**
             * <p>The number of unusual logons to the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder account(Integer account) {
                this.account = account;
                return this;
            }

            /**
             * <p>The number of alerts generated by the agentless detection feature.</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder agentlessAll(Integer agentlessAll) {
                this.agentlessAll = agentlessAll;
                return this;
            }

            /**
             * <p>The number of baseline risks detected by the agentless detection feature.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder agentlessBaseline(Integer agentlessBaseline) {
                this.agentlessBaseline = agentlessBaseline;
                return this;
            }

            /**
             * <p>The number of malicious samples detected by the agentless detection feature.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder agentlessMalicious(Integer agentlessMalicious) {
                this.agentlessMalicious = agentlessMalicious;
                return this;
            }

            /**
             * <p>The number of sensitive file alerts generated by the agentless detection feature.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder agentlessSensitiveFile(Integer agentlessSensitiveFile) {
                this.agentlessSensitiveFile = agentlessSensitiveFile;
                return this;
            }

            /**
             * <p>The number of system vulnerabilities detected by the agentless detection feature.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder agentlessVulCve(Integer agentlessVulCve) {
                this.agentlessVulCve = agentlessVulCve;
                return this;
            }

            /**
             * <p>The number of application vulnerabilities detected by the agentless detection feature.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder agentlessVulSca(Integer agentlessVulSca) {
                this.agentlessVulSca = agentlessVulSca;
                return this;
            }

            /**
             * <p>The number of Windows vulnerabilities detected by using agentless detection.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder agentlessVulSys(Integer agentlessVulSys) {
                this.agentlessVulSys = agentlessVulSys;
                return this;
            }

            /**
             * <p>The number of application vulnerabilities detected on the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder appNum(Integer appNum) {
                this.appNum = appNum;
                return this;
            }

            /**
             * <p>The number of Web-CMS vulnerabilities detected on the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder cmsNum(Integer cmsNum) {
                this.cmsNum = cmsNum;
                return this;
            }

            /**
             * <p>The number of configuration risks detected on the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cspmNum(Integer cspmNum) {
                this.cspmNum = cspmNum;
                return this;
            }

            /**
             * <p>The number of common vulnerabilities detected on the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cveNum(Integer cveNum) {
                this.cveNum = cveNum;
                return this;
            }

            /**
             * <p>The number of urgent vulnerabilities detected on the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder emgNum(Integer emgNum) {
                this.emgNum = emgNum;
                return this;
            }

            /**
             * <p>The number of baseline risks detected on the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder health(Integer health) {
                this.health = health;
                return this;
            }

            /**
             * <p>The number of middleware vulnerabilities detected on the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder scaNum(Integer scaNum) {
                this.scaNum = scaNum;
                return this;
            }

            /**
             * <p>The number of alerts generated for the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder suspicious(Integer suspicious) {
                this.suspicious = suspicious;
                return this;
            }

            /**
             * <p>The number of Windows system vulnerabilities detected on the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder sysNum(Integer sysNum) {
                this.sysNum = sysNum;
                return this;
            }

            /**
             * <p>The number of trojans detected on the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder trojan(Integer trojan) {
                this.trojan = trojan;
                return this;
            }

            /**
             * <p>The UUID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>6690a46c-0edb-4663-a641-3629d1a9****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>The total number of vulnerabilities detected on the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>17</p>
             */
            public Builder vul(Integer vul) {
                this.vul = vul;
                return this;
            }

            /**
             * <p>The number of weak passwords.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
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
