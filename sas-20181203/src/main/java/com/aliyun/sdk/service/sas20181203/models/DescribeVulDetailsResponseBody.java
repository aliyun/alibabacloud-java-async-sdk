// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVulDetailsResponseBody</p>
 */
public class DescribeVulDetailsResponseBody extends TeaModel {
    @NameInMap("Cves")
    private java.util.List < Cves> cves;

    @NameInMap("RequestId")
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

    /**
     * @return cves
     */
    public java.util.List < Cves> getCves() {
        return this.cves;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Cves> cves; 
        private String requestId; 

        /**
         * The details of the vulnerability.
         */
        public Builder cves(java.util.List < Cves> cves) {
            this.cves = cves;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVulDetailsResponseBody build() {
            return new DescribeVulDetailsResponseBody(this);
        } 

    } 

    public static class Classifys extends TeaModel {
        @NameInMap("Classify")
        private String classify;

        @NameInMap("DemoVideoUrl")
        private String demoVideoUrl;

        @NameInMap("Description")
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

            /**
             * The type of the vulnerability.
             */
            public Builder classify(String classify) {
                this.classify = classify;
                return this;
            }

            /**
             * The URL of the demo video for the vulnerability.
             */
            public Builder demoVideoUrl(String demoVideoUrl) {
                this.demoVideoUrl = demoVideoUrl;
                return this;
            }

            /**
             * The description of the vulnerability type.
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
    public static class Cves extends TeaModel {
        @NameInMap("Classify")
        private String classify;

        @NameInMap("Classifys")
        private java.util.List < Classifys> classifys;

        @NameInMap("CnvdId")
        private String cnvdId;

        @NameInMap("Complexity")
        private String complexity;

        @NameInMap("Content")
        private String content;

        @NameInMap("CveId")
        private String cveId;

        @NameInMap("CvssScore")
        private String cvssScore;

        @NameInMap("CvssVector")
        private String cvssVector;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("Poc")
        private String poc;

        @NameInMap("PocCreateTime")
        private Long pocCreateTime;

        @NameInMap("PocDisclosureTime")
        private Long pocDisclosureTime;

        @NameInMap("Product")
        private String product;

        @NameInMap("Reference")
        private String reference;

        @NameInMap("ReleaseTime")
        private Long releaseTime;

        @NameInMap("Solution")
        private String solution;

        @NameInMap("Summary")
        private String summary;

        @NameInMap("TargetId")
        private String targetId;

        @NameInMap("TargetName")
        private String targetName;

        @NameInMap("Title")
        private String title;

        @NameInMap("Vendor")
        private String vendor;

        @NameInMap("VulLevel")
        private String vulLevel;

        private Cves(Builder builder) {
            this.classify = builder.classify;
            this.classifys = builder.classifys;
            this.cnvdId = builder.cnvdId;
            this.complexity = builder.complexity;
            this.content = builder.content;
            this.cveId = builder.cveId;
            this.cvssScore = builder.cvssScore;
            this.cvssVector = builder.cvssVector;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
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
        public java.util.List < Classifys> getClassifys() {
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
            private java.util.List < Classifys> classifys; 
            private String cnvdId; 
            private String complexity; 
            private String content; 
            private String cveId; 
            private String cvssScore; 
            private String cvssVector; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
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

            /**
             * The type of the vulnerability.
             */
            public Builder classify(String classify) {
                this.classify = classify;
                return this;
            }

            /**
             * The vulnerability types.
             */
            public Builder classifys(java.util.List < Classifys> classifys) {
                this.classifys = classifys;
                return this;
            }

            /**
             * The China National Vulnerability Database (CNVD) ID.
             */
            public Builder cnvdId(String cnvdId) {
                this.cnvdId = cnvdId;
                return this;
            }

            /**
             * The difficulty level of exploiting the vulnerability. Valid values:
             * <p>
             * 
             * *   **LOW**
             * *   **MEDIUM**
             * *   **HIGH**
             */
            public Builder complexity(String complexity) {
                this.complexity = complexity;
                return this;
            }

            /**
             * The CVE content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The Common Vulnerabilities and Exposures (CVE) ID.
             */
            public Builder cveId(String cveId) {
                this.cveId = cveId;
                return this;
            }

            /**
             * The Common Vulnerability Scoring System (CVSS) score of the vulnerability in the Alibaba Cloud vulnerability library.
             */
            public Builder cvssScore(String cvssScore) {
                this.cvssScore = cvssScore;
                return this;
            }

            /**
             * The vector that is used to calculate the CVSS score.
             */
            public Builder cvssVector(String cvssVector) {
                this.cvssVector = cvssVector;
                return this;
            }

            /**
             * The instance name of the server.
             * <p>
             * 
             * > This parameter is deprecated. You can call the [DescribeVulList](~~DescribeVulList~~) operation to query the instances that are affected by vulnerabilities.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The public IP address of the server.
             * <p>
             * 
             * > This parameter is deprecated. You can call the [DescribeVulList](~~DescribeVulList~~) operation to query the instances that are affected by vulnerabilities.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The private IP address of the server.
             * <p>
             * 
             * > This parameter is deprecated. You can call the [DescribeVulList](~~DescribeVulList~~) operation to query the instances that are affected by vulnerabilities.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The POC content.
             */
            public Builder poc(String poc) {
                this.poc = poc;
                return this;
            }

            /**
             * The timestamp when the proof of concept (POC) was created. Unit: milliseconds.
             */
            public Builder pocCreateTime(Long pocCreateTime) {
                this.pocCreateTime = pocCreateTime;
                return this;
            }

            /**
             * The timestamp when the POC was disclosed. Unit: milliseconds.
             */
            public Builder pocDisclosureTime(Long pocDisclosureTime) {
                this.pocDisclosureTime = pocDisclosureTime;
                return this;
            }

            /**
             * The service that is affected by the vulnerability.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * The reference of the vulnerability in the Alibaba Cloud vulnerability library. The value is a URL.
             */
            public Builder reference(String reference) {
                this.reference = reference;
                return this;
            }

            /**
             * The disclosure time that is displayed for the vulnerability in the Alibaba Cloud vulnerability library. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder releaseTime(Long releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * The fixing suggestions of the vulnerability.
             */
            public Builder solution(String solution) {
                this.solution = solution;
                return this;
            }

            /**
             * The introduction to the vulnerability.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * The ID of the asset on which the vulnerability is detected.
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * The name of the asset on which the vulnerability is detected.
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * The title of the vulnerability announcement.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The vendor that disclosed the vulnerability.
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            /**
             * The severity of the vulnerability. Valid values:
             * <p>
             * 
             * *   **serious**
             * *   **high**
             * *   **medium**
             * *   **low**
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
