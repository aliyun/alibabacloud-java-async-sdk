// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnWafGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnWafGroupResponseBody</p>
 */
public class DescribeDcdnWafGroupResponseBody extends TeaModel {
    @NameInMap("Id")
    private Long id;

    @NameInMap("Name")
    private String name;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Rules")
    private java.util.List < Rules> rules;

    @NameInMap("Subscribe")
    private String subscribe;

    @NameInMap("TemplateId")
    private Long templateId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDcdnWafGroupResponseBody(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.rules = builder.rules;
        this.subscribe = builder.subscribe;
        this.templateId = builder.templateId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rules
     */
    public java.util.List < Rules> getRules() {
        return this.rules;
    }

    /**
     * @return subscribe
     */
    public String getSubscribe() {
        return this.subscribe;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long id; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < Rules> rules; 
        private String subscribe; 
        private Long templateId; 
        private Integer totalCount; 

        /**
         * The ID of the custom WAF rule group.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * The name of the WAF rule group.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The page number of the page returned.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **20**.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The configurations of the rule.
         */
        public Builder rules(java.util.List < Rules> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * Indicates whether to enable subscription. Valid values:
         * <p>
         * 
         * *   **on:**
         * *   **off**
         */
        public Builder subscribe(String subscribe) {
            this.subscribe = subscribe;
            return this;
        }

        /**
         * The ID of the template.
         */
        public Builder templateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * The total number of rules that are filtered out.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDcdnWafGroupResponseBody build() {
            return new DescribeDcdnWafGroupResponseBody(this);
        } 

    } 

    public static class Rules extends TeaModel {
        @NameInMap("ApplicationType")
        private Integer applicationType;

        @NameInMap("CveId")
        private String cveId;

        @NameInMap("CveUrl")
        private String cveUrl;

        @NameInMap("Description")
        private String description;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("ProtectionType")
        private Integer protectionType;

        @NameInMap("RiskLevel")
        private Integer riskLevel;

        private Rules(Builder builder) {
            this.applicationType = builder.applicationType;
            this.cveId = builder.cveId;
            this.cveUrl = builder.cveUrl;
            this.description = builder.description;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.name = builder.name;
            this.protectionType = builder.protectionType;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return applicationType
         */
        public Integer getApplicationType() {
            return this.applicationType;
        }

        /**
         * @return cveId
         */
        public String getCveId() {
            return this.cveId;
        }

        /**
         * @return cveUrl
         */
        public String getCveUrl() {
            return this.cveUrl;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return protectionType
         */
        public Integer getProtectionType() {
            return this.protectionType;
        }

        /**
         * @return riskLevel
         */
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private Integer applicationType; 
            private String cveId; 
            private String cveUrl; 
            private String description; 
            private String gmtModified; 
            private Long id; 
            private String name; 
            private Integer protectionType; 
            private Integer riskLevel; 

            /**
             * The type of the application. Valid values:
             * <p>
             * 
             * *   **0**: Common
             * *   **1**: WordPress
             * *   **2**: DedeCMS
             * *   **3**: Discuz
             * *   **4**: PHP CMS
             * *   **5**: ECShop
             * *   **6**: ShopEX
             * *   **7**: Drupal
             * *   **8**: Joomla
             * *   **9**: MetInfo
             * *   **10**: Struts2
             * *   **11**: Spring Boot
             * *   **12**: JBoss
             * *   **13**: WebLogic
             * *   **14**: WebSphere
             * *   **15**: Tomcat
             * *   **16**: Elastic Search
             * *   **18**: ThinkPHP
             * *   **19**: Fastjson
             * *   **20**: ImageMagick
             * *   **21**: PHPWind
             * *   **22**: phpMyAdmin
             * *   **23**: Resin
             * *   **24**: IIS
             * *   **99**: Others
             */
            public Builder applicationType(Integer applicationType) {
                this.applicationType = applicationType;
                return this;
            }

            /**
             * The Common Vulnerabilities and Exposures (CVE) ID of the related vulnerability.
             */
            public Builder cveId(String cveId) {
                this.cveId = cveId;
                return this;
            }

            /**
             * The CVE link.
             */
            public Builder cveUrl(String cveUrl) {
                this.cveUrl = cveUrl;
                return this;
            }

            /**
             * The description of the WAF rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the rule was modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the custom WAF rule.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the WAF rule.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Protection type Valid values:
             * <p>
             * 
             * *   **11**: SQL injection
             * *   **12**: cross-site scripting (XSS)
             * *   **13**: code execution
             * *   **14**: carriage return line feeds (CRLF)
             * *   **15**: local file inclusion
             * *   **16**: remote file inclusion
             * *   **17**: webshells
             * *   **19**: cross-site request forgery
             * *   **20**: others
             * *   **21**: SEMA
             */
            public Builder protectionType(Integer protectionType) {
                this.protectionType = protectionType;
                return this;
            }

            /**
             * The risk level of the resources that do not comply with the managed rule. Valid values:
             * <p>
             * 
             * *   **1**: high risk
             * *   **2**: medium risk
             * *   **3**: low risk
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
