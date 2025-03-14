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
 * {@link DescribeVulDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVulDetailsResponseBody</p>
 */
public class DescribeVulDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cves")
    private java.util.List<Cves> cves;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVulDetailsResponseBody(Builder builder) {
        this.cves = builder.cves;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulDetailsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cves
     */
    public java.util.List<Cves> getCves() {
        return this.cves;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Cves> cves; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeVulDetailsResponseBody model) {
            this.cves = model.cves;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the vulnerability.</p>
         */
        public Builder cves(java.util.List<Cves> cves) {
            this.cves = cves;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>EDA40EA3-6265-5900-AD99-C83E4F109CA8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVulDetailsResponseBody build() {
            return new DescribeVulDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVulDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVulDetailsResponseBody</p>
     */
    public static class Classifys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Classify")
        private String classify;

        @com.aliyun.core.annotation.NameInMap("DemoVideoUrl")
        private String demoVideoUrl;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        private Classifys(Builder builder) {
            this.classify = builder.classify;
            this.demoVideoUrl = builder.demoVideoUrl;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Classifys create() {
            return builder().build();
        }

        /**
         * @return classify
         */
        public String getClassify() {
            return this.classify;
        }

        /**
         * @return demoVideoUrl
         */
        public String getDemoVideoUrl() {
            return this.demoVideoUrl;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String classify; 
            private String demoVideoUrl; 
            private String description; 

            private Builder() {
            } 

            private Builder(Classifys model) {
                this.classify = model.classify;
                this.demoVideoUrl = model.demoVideoUrl;
                this.description = model.description;
            } 

            /**
             * <p>The type of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>remote_code_execution</p>
             */
            public Builder classify(String classify) {
                this.classify = classify;
                return this;
            }

            /**
             * <p>The URL of the demo video for the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com">https://example.com</a></p>
             */
            public Builder demoVideoUrl(String demoVideoUrl) {
                this.demoVideoUrl = demoVideoUrl;
                return this;
            }

            /**
             * <p>The description of the vulnerability type.</p>
             * 
             * <strong>example:</strong>
             * <p>Remote code execution</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public Classifys build() {
                return new Classifys(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVulDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVulDetailsResponseBody</p>
     */
    public static class Cves extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Classify")
        private String classify;

        @com.aliyun.core.annotation.NameInMap("Classifys")
        private java.util.List<Classifys> classifys;

        @com.aliyun.core.annotation.NameInMap("CnvdId")
        private String cnvdId;

        @com.aliyun.core.annotation.NameInMap("Complexity")
        private String complexity;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CveId")
        private String cveId;

        @com.aliyun.core.annotation.NameInMap("CveLink")
        private String cveLink;

        @com.aliyun.core.annotation.NameInMap("CvssScore")
        private String cvssScore;

        @com.aliyun.core.annotation.NameInMap("CvssVector")
        private String cvssVector;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("OtherId")
        private String otherId;

        @com.aliyun.core.annotation.NameInMap("Poc")
        private String poc;

        @com.aliyun.core.annotation.NameInMap("PocCreateTime")
        private Long pocCreateTime;

        @com.aliyun.core.annotation.NameInMap("PocDisclosureTime")
        private Long pocDisclosureTime;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("Reference")
        private String reference;

        @com.aliyun.core.annotation.NameInMap("ReleaseTime")
        private Long releaseTime;

        @com.aliyun.core.annotation.NameInMap("Solution")
        private String solution;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("TargetName")
        private String targetName;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private String vendor;

        @com.aliyun.core.annotation.NameInMap("VulLevel")
        private String vulLevel;

        private Cves(Builder builder) {
            this.classify = builder.classify;
            this.classifys = builder.classifys;
            this.cnvdId = builder.cnvdId;
            this.complexity = builder.complexity;
            this.content = builder.content;
            this.cveId = builder.cveId;
            this.cveLink = builder.cveLink;
            this.cvssScore = builder.cvssScore;
            this.cvssVector = builder.cvssVector;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.otherId = builder.otherId;
            this.poc = builder.poc;
            this.pocCreateTime = builder.pocCreateTime;
            this.pocDisclosureTime = builder.pocDisclosureTime;
            this.product = builder.product;
            this.reference = builder.reference;
            this.releaseTime = builder.releaseTime;
            this.solution = builder.solution;
            this.summary = builder.summary;
            this.targetId = builder.targetId;
            this.targetName = builder.targetName;
            this.title = builder.title;
            this.vendor = builder.vendor;
            this.vulLevel = builder.vulLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cves create() {
            return builder().build();
        }

        /**
         * @return classify
         */
        public String getClassify() {
            return this.classify;
        }

        /**
         * @return classifys
         */
        public java.util.List<Classifys> getClassifys() {
            return this.classifys;
        }

        /**
         * @return cnvdId
         */
        public String getCnvdId() {
            return this.cnvdId;
        }

        /**
         * @return complexity
         */
        public String getComplexity() {
            return this.complexity;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return cveId
         */
        public String getCveId() {
            return this.cveId;
        }

        /**
         * @return cveLink
         */
        public String getCveLink() {
            return this.cveLink;
        }

        /**
         * @return cvssScore
         */
        public String getCvssScore() {
            return this.cvssScore;
        }

        /**
         * @return cvssVector
         */
        public String getCvssVector() {
            return this.cvssVector;
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
         * @return otherId
         */
        public String getOtherId() {
            return this.otherId;
        }

        /**
         * @return poc
         */
        public String getPoc() {
            return this.poc;
        }

        /**
         * @return pocCreateTime
         */
        public Long getPocCreateTime() {
            return this.pocCreateTime;
        }

        /**
         * @return pocDisclosureTime
         */
        public Long getPocDisclosureTime() {
            return this.pocDisclosureTime;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return reference
         */
        public String getReference() {
            return this.reference;
        }

        /**
         * @return releaseTime
         */
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        /**
         * @return solution
         */
        public String getSolution() {
            return this.solution;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetName
         */
        public String getTargetName() {
            return this.targetName;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        /**
         * @return vulLevel
         */
        public String getVulLevel() {
            return this.vulLevel;
        }

        public static final class Builder {
            private String classify; 
            private java.util.List<Classifys> classifys; 
            private String cnvdId; 
            private String complexity; 
            private String content; 
            private String cveId; 
            private String cveLink; 
            private String cvssScore; 
            private String cvssVector; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String otherId; 
            private String poc; 
            private Long pocCreateTime; 
            private Long pocDisclosureTime; 
            private String product; 
            private String reference; 
            private Long releaseTime; 
            private String solution; 
            private String summary; 
            private String targetId; 
            private String targetName; 
            private String title; 
            private String vendor; 
            private String vulLevel; 

            private Builder() {
            } 

            private Builder(Cves model) {
                this.classify = model.classify;
                this.classifys = model.classifys;
                this.cnvdId = model.cnvdId;
                this.complexity = model.complexity;
                this.content = model.content;
                this.cveId = model.cveId;
                this.cveLink = model.cveLink;
                this.cvssScore = model.cvssScore;
                this.cvssVector = model.cvssVector;
                this.instanceName = model.instanceName;
                this.internetIp = model.internetIp;
                this.intranetIp = model.intranetIp;
                this.otherId = model.otherId;
                this.poc = model.poc;
                this.pocCreateTime = model.pocCreateTime;
                this.pocDisclosureTime = model.pocDisclosureTime;
                this.product = model.product;
                this.reference = model.reference;
                this.releaseTime = model.releaseTime;
                this.solution = model.solution;
                this.summary = model.summary;
                this.targetId = model.targetId;
                this.targetName = model.targetName;
                this.title = model.title;
                this.vendor = model.vendor;
                this.vulLevel = model.vulLevel;
            } 

            /**
             * <p>The type of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>remote_code_execution</p>
             */
            public Builder classify(String classify) {
                this.classify = classify;
                return this;
            }

            /**
             * <p>The vulnerability types.</p>
             */
            public Builder classifys(java.util.List<Classifys> classifys) {
                this.classifys = classifys;
                return this;
            }

            /**
             * <p>The China National Vulnerability Database (CNVD) ID.</p>
             * 
             * <strong>example:</strong>
             * <p>CNVD-2019-9167</p>
             */
            public Builder cnvdId(String cnvdId) {
                this.cnvdId = cnvdId;
                return this;
            }

            /**
             * <p>The difficulty level of exploiting the vulnerability. Valid values:</p>
             * <ul>
             * <li><strong>LOW</strong></li>
             * <li><strong>MEDIUM</strong></li>
             * <li><strong>HIGH</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>LOW</p>
             */
            public Builder complexity(String complexity) {
                this.complexity = complexity;
                return this;
            }

            /**
             * <p>The CVE content.</p>
             * 
             * <strong>example:</strong>
             * <p>Apache Shiro is a user authentication and authorization framework for a wide range of rights management applications.↵Recently, Apache Shiro released version 1.7.0, which fixes the Apache Shiro authentication bypass vulnerability (CVE-2020-17510).↵Attackers can bypass Shiro&quot;s authentication using malicious requests containing payloads.↵↵Related bugs:↵CVE-2020-17510 Shiro &lt; 1.7.0 Validation Bypass Vulnerability↵CVE-2020-13933 Shiro &lt; 1.6.0 Validation Bypass Vulnerability↵CVE-2020-11989 Shiro &lt; 1.5.3 Validation Bypass Vulnerability↵CVE-2020-1957 Shiro &lt; 1.5.2 Validation Bypass Vulnerability↵CVE-2016-6802 Shiro &lt; 1.3.2 Validation Bypass Vulnerability
             * Check whether the fastjson version currently running on the system is in the affected version and whether safeMode is configured to disable autoType. If it is in the affected version and safeMode is not configured to disable autoType, the vulnerability is considered to exist.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The Common Vulnerabilities and Exposures (CVE) ID.</p>
             * 
             * <strong>example:</strong>
             * <p>CVE-2019-9167</p>
             */
            public Builder cveId(String cveId) {
                this.cveId = cveId;
                return this;
            }

            /**
             * <p>The link to the CVE details.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://avd.aliyun.com/detail/CVE-2022-1184">https://avd.aliyun.com/detail/CVE-2022-1184</a></p>
             */
            public Builder cveLink(String cveLink) {
                this.cveLink = cveLink;
                return this;
            }

            /**
             * <p>The Common Vulnerability Scoring System (CVSS) score of the vulnerability in the Alibaba Cloud vulnerability library.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0</p>
             */
            public Builder cvssScore(String cvssScore) {
                this.cvssScore = cvssScore;
                return this;
            }

            /**
             * <p>The vector that is used to calculate the CVSS score.</p>
             * 
             * <strong>example:</strong>
             * <p>AV:N/AC:L/Au:N/C:C/I:C/A:C</p>
             */
            public Builder cvssVector(String cvssVector) {
                this.cvssVector = cvssVector;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * <blockquote>
             * <p> This parameter is deprecated. You can call the <a href="~~DescribeVulList~~">DescribeVulList</a> operation to query the instance that is affected by the vulnerability.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>sql-test-001</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the server.</p>
             * <blockquote>
             * <p> This parameter is deprecated. You can call the <a href="~~DescribeVulList~~">DescribeVulList</a> operation to query the instance that is affected by the vulnerability.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>47.114.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the server.</p>
             * <blockquote>
             * <p> This parameter is deprecated. You can call the <a href="~~DescribeVulList~~">DescribeVulList</a> operation to query the instance that is affected by the vulnerability.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>172.19.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The ID of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>CVE-2020-8597</p>
             */
            public Builder otherId(String otherId) {
                this.otherId = otherId;
                return this;
            }

            /**
             * <p>The POC content.</p>
             */
            public Builder poc(String poc) {
                this.poc = poc;
                return this;
            }

            /**
             * <p>The UNIX timestamp when the proof of concept (POC) was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1554189334000</p>
             */
            public Builder pocCreateTime(Long pocCreateTime) {
                this.pocCreateTime = pocCreateTime;
                return this;
            }

            /**
             * <p>The UNIX timestamp when the POC was disclosed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1554189334000</p>
             */
            public Builder pocDisclosureTime(Long pocDisclosureTime) {
                this.pocDisclosureTime = pocDisclosureTime;
                return this;
            }

            /**
             * <p>The service that is affected by the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>Log4j2</p>
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * <p>The reference of the vulnerability in the Alibaba Cloud vulnerability library. The value is a URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com">https://example.com</a></p>
             */
            public Builder reference(String reference) {
                this.reference = reference;
                return this;
            }

            /**
             * <p>The disclosure time that is displayed for the vulnerability in the Alibaba Cloud vulnerability library. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1554189334000</p>
             */
            public Builder releaseTime(Long releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * <p>The fixing suggestions of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>At present, Chanjet has urgently released a vulnerability patch to fix the vulnerability. CNVD recommends affected units and users to upgrade to the latest version immediately:</p>↵<p>https://www.chanjetvip.com/product/goods/goods-detail?id=53aaa40295d458e44f5d3ce5</p>↵<p>At the same time, organizations and users affected by the vulnerability are requested to immediately follow the steps below to conduct self-inspection and repair work:</p>↵<ol>↵<li><p>User self-check steps:↵<br  />Check whether website/bin/load.aspx.cdcab7d2.compiled, website/bin/App_Web_load.aspx.cdcab7d2.dll, and tplus/Load.aspx files exist locally. If they exist, it means that they have been poisoned, and you must reinstall the system and install the product. patch.</p>↵</li>↵<li><p>Non-poisoned users please:↵<br  />1) Update the latest product patch.↵<br  />2) Install anti-virus software and update the virus database in time.↵<br  />3) Upgrade the lower version of IIS and Nginx to IIS10.0 and Windows 2016.↵<br  />4) Local installation customers need to confirm whether the backup file is complete as soon as possible, and do off-site backup. Customers on the cloud should enable the mirroring function in time.↵<br  />5) Users who fail to update the patch in time can contact Chanjet technical support and take temporary preventive measures such as deleting files.</p>↵</li>↵<li><p>Poisoned users please:↵<br  />1) Check whether the server has taken regular snapshots or backups. If so, you can restore data through snapshots or backups.↵<br  />2) Contact Chanjet technical support to confirm whether it has the conditions and operation methods to restore data from backup files.</p>↵</li>↵</ol>↵<p>If you have any technical problems, please contact Chanjet technical support: 4006600566-9</p>
             */
            public Builder solution(String solution) {
                this.solution = solution;
                return this;
            }

            /**
             * <p>The introduction to the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>Chanjet T-Plus is an Internet business management software. There is an unauthorized access vulnerability in one of its interfaces disclosed on the Internet. Attackers can construct malicious requests to upload malicious files to execute arbitrary code and control the server.</p>
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * <p>The ID of the asset that is scanned.</p>
             * <blockquote>
             * <p> This parameter is deprecated. You can call the <a href="~~DescribeVulList~~">DescribeVulList</a> operation to query the instance that is affected by the vulnerability.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>m-bp17m0pc0xprzbwo****</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The name of the asset that is scanned.</p>
             * <blockquote>
             * <p> This parameter is deprecated. You can call the <a href="~~DescribeVulList~~">DescribeVulList</a> operation to query the instance that is affected by the vulnerability.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>frontend</p>
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * <p>The title of the vulnerability announcement.</p>
             * 
             * <strong>example:</strong>
             * <p>Chanjet T-Plus SetupAccount/Upload. Aspx file upload vulnerability(CNVD-2022-60632)</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The vendor that disclosed the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>Apache</p>
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            /**
             * <p>The severity of the vulnerability. Valid values:</p>
             * <ul>
             * <li><strong>serious</strong></li>
             * <li><strong>high</strong></li>
             * <li><strong>medium</strong></li>
             * <li><strong>low</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>serious</p>
             */
            public Builder vulLevel(String vulLevel) {
                this.vulLevel = vulLevel;
                return this;
            }

            public Cves build() {
                return new Cves(this);
            } 

        } 

    }
}
