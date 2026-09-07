// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListVulnerabilitiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListVulnerabilitiesResponseBody</p>
 */
public class ListVulnerabilitiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Long totalNum;

    @com.aliyun.core.annotation.NameInMap("Vulnerabilities")
    private java.util.List<Vulnerabilities> vulnerabilities;

    private ListVulnerabilitiesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
        this.vulnerabilities = builder.vulnerabilities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVulnerabilitiesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public Long getTotalNum() {
        return this.totalNum;
    }

    /**
     * @return vulnerabilities
     */
    public java.util.List<Vulnerabilities> getVulnerabilities() {
        return this.vulnerabilities;
    }

    public static final class Builder {
        private String requestId; 
        private Long totalNum; 
        private java.util.List<Vulnerabilities> vulnerabilities; 

        private Builder() {
        } 

        private Builder(ListVulnerabilitiesResponseBody model) {
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
            this.vulnerabilities = model.vulnerabilities;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of vulnerabilities that match the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>37</p>
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * <p>The list of vulnerabilities.</p>
         */
        public Builder vulnerabilities(java.util.List<Vulnerabilities> vulnerabilities) {
            this.vulnerabilities = vulnerabilities;
            return this;
        }

        public ListVulnerabilitiesResponseBody build() {
            return new ListVulnerabilitiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVulnerabilitiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVulnerabilitiesResponseBody</p>
     */
    public static class Vulnerabilities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CveList")
        private java.util.List<String> cveList;

        @com.aliyun.core.annotation.NameInMap("DescriptionEn")
        private String descriptionEn;

        @com.aliyun.core.annotation.NameInMap("DescriptionZh")
        private String descriptionZh;

        @com.aliyun.core.annotation.NameInMap("Kbs")
        private java.util.List<String> kbs;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("ReleaseTime")
        private Long releaseTime;

        @com.aliyun.core.annotation.NameInMap("TitleEn")
        private String titleEn;

        @com.aliyun.core.annotation.NameInMap("TitleZh")
        private String titleZh;

        @com.aliyun.core.annotation.NameInMap("UpdateId")
        private String updateId;

        @com.aliyun.core.annotation.NameInMap("VulDeviceCount")
        private Long vulDeviceCount;

        @com.aliyun.core.annotation.NameInMap("VulLevel")
        private String vulLevel;

        @com.aliyun.core.annotation.NameInMap("VulType")
        private String vulType;

        private Vulnerabilities(Builder builder) {
            this.cveList = builder.cveList;
            this.descriptionEn = builder.descriptionEn;
            this.descriptionZh = builder.descriptionZh;
            this.kbs = builder.kbs;
            this.product = builder.product;
            this.releaseTime = builder.releaseTime;
            this.titleEn = builder.titleEn;
            this.titleZh = builder.titleZh;
            this.updateId = builder.updateId;
            this.vulDeviceCount = builder.vulDeviceCount;
            this.vulLevel = builder.vulLevel;
            this.vulType = builder.vulType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vulnerabilities create() {
            return builder().build();
        }

        /**
         * @return cveList
         */
        public java.util.List<String> getCveList() {
            return this.cveList;
        }

        /**
         * @return descriptionEn
         */
        public String getDescriptionEn() {
            return this.descriptionEn;
        }

        /**
         * @return descriptionZh
         */
        public String getDescriptionZh() {
            return this.descriptionZh;
        }

        /**
         * @return kbs
         */
        public java.util.List<String> getKbs() {
            return this.kbs;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return releaseTime
         */
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        /**
         * @return titleEn
         */
        public String getTitleEn() {
            return this.titleEn;
        }

        /**
         * @return titleZh
         */
        public String getTitleZh() {
            return this.titleZh;
        }

        /**
         * @return updateId
         */
        public String getUpdateId() {
            return this.updateId;
        }

        /**
         * @return vulDeviceCount
         */
        public Long getVulDeviceCount() {
            return this.vulDeviceCount;
        }

        /**
         * @return vulLevel
         */
        public String getVulLevel() {
            return this.vulLevel;
        }

        /**
         * @return vulType
         */
        public String getVulType() {
            return this.vulType;
        }

        public static final class Builder {
            private java.util.List<String> cveList; 
            private String descriptionEn; 
            private String descriptionZh; 
            private java.util.List<String> kbs; 
            private String product; 
            private Long releaseTime; 
            private String titleEn; 
            private String titleZh; 
            private String updateId; 
            private Long vulDeviceCount; 
            private String vulLevel; 
            private String vulType; 

            private Builder() {
            } 

            private Builder(Vulnerabilities model) {
                this.cveList = model.cveList;
                this.descriptionEn = model.descriptionEn;
                this.descriptionZh = model.descriptionZh;
                this.kbs = model.kbs;
                this.product = model.product;
                this.releaseTime = model.releaseTime;
                this.titleEn = model.titleEn;
                this.titleZh = model.titleZh;
                this.updateId = model.updateId;
                this.vulDeviceCount = model.vulDeviceCount;
                this.vulLevel = model.vulLevel;
                this.vulType = model.vulType;
            } 

            /**
             * <p>The list of CVE IDs corresponding to the vulnerability. An empty list is returned if no CVE is associated.</p>
             */
            public Builder cveList(java.util.List<String> cveList) {
                this.cveList = cveList;
                return this;
            }

            /**
             * <p>The English description of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>This update fixes several remote code execution and privilege escalation vulnerabilities.</p>
             */
            public Builder descriptionEn(String descriptionEn) {
                this.descriptionEn = descriptionEn;
                return this;
            }

            /**
             * <p>The Chinese description of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>该更新修复了若干远程代码执行与权限提升漏洞</p>
             */
            public Builder descriptionZh(String descriptionZh) {
                this.descriptionZh = descriptionZh;
                return this;
            }

            /**
             * <p>The list of Knowledge Base (KB) numbers corresponding to the vulnerability.</p>
             */
            public Builder kbs(java.util.List<String> kbs) {
                this.kbs = kbs;
                return this;
            }

            /**
             * <p>The name of the product affected by the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows 11 Home</p>
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * <p>The release time of the vulnerability, in seconds as a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1786291200</p>
             */
            public Builder releaseTime(Long releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * <p>The English title of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08 Cumulative Update for Windows 11</p>
             */
            public Builder titleEn(String titleEn) {
                this.titleEn = titleEn;
                return this;
            }

            /**
             * <p>The Chinese title of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08 适用于 Windows 11 的累积更新</p>
             */
            public Builder titleZh(String titleZh) {
                this.titleZh = titleZh;
                return this;
            }

            /**
             * <p>The patch ID corresponding to the vulnerability. For Windows vulnerabilities, this is the Microsoft patch Update ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9f8c1d2e-4b7a-4c31-9e05-6d2f8a71****</p>
             */
            public Builder updateId(String updateId) {
                this.updateId = updateId;
                return this;
            }

            /**
             * <p>The number of user endpoint devices affected by the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder vulDeviceCount(Long vulDeviceCount) {
                this.vulDeviceCount = vulDeviceCount;
                return this;
            }

            /**
             * <p>The vulnerability risk level, mapped from the vendor risk level: Critical is mapped to High, Important is mapped to Mid, and others are mapped to Low. Valid values:</p>
             * <ul>
             * <li><strong>High</strong>: high risk.</li>
             * <li><strong>Mid</strong>: medium risk.</li>
             * <li><strong>Low</strong>: low risk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>High</p>
             */
            public Builder vulLevel(String vulLevel) {
                this.vulLevel = vulLevel;
                return this;
            }

            /**
             * <p>The vulnerability type. Valid values:</p>
             * <ul>
             * <li><strong>windows</strong>: Windows system vulnerability.</li>
             * <li><strong>ai_agent</strong>: AI Agent vulnerability.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>windows</p>
             */
            public Builder vulType(String vulType) {
                this.vulType = vulType;
                return this;
            }

            public Vulnerabilities build() {
                return new Vulnerabilities(this);
            } 

        } 

    }
}
