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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * Vulnerabilities.
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
             * CveList.
             */
            public Builder cveList(java.util.List<String> cveList) {
                this.cveList = cveList;
                return this;
            }

            /**
             * DescriptionEn.
             */
            public Builder descriptionEn(String descriptionEn) {
                this.descriptionEn = descriptionEn;
                return this;
            }

            /**
             * DescriptionZh.
             */
            public Builder descriptionZh(String descriptionZh) {
                this.descriptionZh = descriptionZh;
                return this;
            }

            /**
             * Kbs.
             */
            public Builder kbs(java.util.List<String> kbs) {
                this.kbs = kbs;
                return this;
            }

            /**
             * Product.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * ReleaseTime.
             */
            public Builder releaseTime(Long releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * TitleEn.
             */
            public Builder titleEn(String titleEn) {
                this.titleEn = titleEn;
                return this;
            }

            /**
             * TitleZh.
             */
            public Builder titleZh(String titleZh) {
                this.titleZh = titleZh;
                return this;
            }

            /**
             * UpdateId.
             */
            public Builder updateId(String updateId) {
                this.updateId = updateId;
                return this;
            }

            /**
             * VulDeviceCount.
             */
            public Builder vulDeviceCount(Long vulDeviceCount) {
                this.vulDeviceCount = vulDeviceCount;
                return this;
            }

            /**
             * VulLevel.
             */
            public Builder vulLevel(String vulLevel) {
                this.vulLevel = vulLevel;
                return this;
            }

            /**
             * VulType.
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
