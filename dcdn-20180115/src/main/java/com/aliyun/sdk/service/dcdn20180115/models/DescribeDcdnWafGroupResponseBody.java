// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnWafGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnWafGroupResponseBody</p>
 */
public class DescribeDcdnWafGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List < Rules> rules;

    @com.aliyun.core.annotation.NameInMap("Subscribe")
    private String subscribe;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The ID of the custom WAF rule group.</p>
         * 
         * <strong>example:</strong>
         * <p>1012</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The name of the WAF rule group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The page number of the page returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The configurations of the rule.</p>
         */
        public Builder rules(java.util.List < Rules> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * <p>Indicates whether to enable subscription. Valid values:</p>
         * <ul>
         * <li><strong>on:</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder subscribe(String subscribe) {
            this.subscribe = subscribe;
            return this;
        }

        /**
         * <p>The ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>1012</p>
         */
        public Builder templateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The total number of rules that are filtered out.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDcdnWafGroupResponseBody build() {
            return new DescribeDcdnWafGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnWafGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnWafGroupResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationType")
        private Integer applicationType;

        @com.aliyun.core.annotation.NameInMap("CveId")
        private String cveId;

        @com.aliyun.core.annotation.NameInMap("CveUrl")
        private String cveUrl;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProtectionType")
        private Integer protectionType;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
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
             * <p>The type of the application. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Common</li>
             * <li><strong>1</strong>: WordPress</li>
             * <li><strong>2</strong>: DedeCMS</li>
             * <li><strong>3</strong>: Discuz</li>
             * <li><strong>4</strong>: PHP CMS</li>
             * <li><strong>5</strong>: ECShop</li>
             * <li><strong>6</strong>: ShopEX</li>
             * <li><strong>7</strong>: Drupal</li>
             * <li><strong>8</strong>: Joomla</li>
             * <li><strong>9</strong>: MetInfo</li>
             * <li><strong>10</strong>: Struts2</li>
             * <li><strong>11</strong>: Spring Boot</li>
             * <li><strong>12</strong>: JBoss</li>
             * <li><strong>13</strong>: WebLogic</li>
             * <li><strong>14</strong>: WebSphere</li>
             * <li><strong>15</strong>: Tomcat</li>
             * <li><strong>16</strong>: Elastic Search</li>
             * <li><strong>18</strong>: ThinkPHP</li>
             * <li><strong>19</strong>: Fastjson</li>
             * <li><strong>20</strong>: ImageMagick</li>
             * <li><strong>21</strong>: PHPWind</li>
             * <li><strong>22</strong>: phpMyAdmin</li>
             * <li><strong>23</strong>: Resin</li>
             * <li><strong>24</strong>: IIS</li>
             * <li><strong>99</strong>: Others</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder applicationType(Integer applicationType) {
                this.applicationType = applicationType;
                return this;
            }

            /**
             * <p>The Common Vulnerabilities and Exposures (CVE) ID of the related vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>CVE-2021-22945</p>
             */
            public Builder cveId(String cveId) {
                this.cveId = cveId;
                return this;
            }

            /**
             * <p>The CVE link.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://nxx.nxxx.gov/vuln/detail/CVE-2022-XXXX">https://nxx.nxxx.gov/vuln/detail/CVE-2022-XXXX</a></p>
             */
            public Builder cveUrl(String cveUrl) {
                this.cveUrl = cveUrl;
                return this;
            }

            /**
             * <p>The description of the WAF rule.</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the rule was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-29T17:08:45Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the custom WAF rule.</p>
             * 
             * <strong>example:</strong>
             * <p>100001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the WAF rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Protection type Valid values:</p>
             * <ul>
             * <li><strong>11</strong>: SQL injection</li>
             * <li><strong>12</strong>: cross-site scripting (XSS)</li>
             * <li><strong>13</strong>: code execution</li>
             * <li><strong>14</strong>: carriage return line feeds (CRLF)</li>
             * <li><strong>15</strong>: local file inclusion</li>
             * <li><strong>16</strong>: remote file inclusion</li>
             * <li><strong>17</strong>: webshells</li>
             * <li><strong>19</strong>: cross-site request forgery</li>
             * <li><strong>20</strong>: others</li>
             * <li><strong>21</strong>: SEMA</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder protectionType(Integer protectionType) {
                this.protectionType = protectionType;
                return this;
            }

            /**
             * <p>The risk level of the resources that do not comply with the managed rule. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: high risk</li>
             * <li><strong>2</strong>: medium risk</li>
             * <li><strong>3</strong>: low risk</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
