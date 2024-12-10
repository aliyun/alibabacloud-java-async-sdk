// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetVulItemPageResponseBody} extends {@link TeaModel}
 *
 * <p>GetVulItemPageResponseBody</p>
 */
public class GetVulItemPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetVulItemPageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVulItemPageResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private PageInfo pageInfo; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>API response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data returned by the interface.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Prompt message for the returned result.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>Request response.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>02F8BBF3-2D61-5982-8911-EEB387BE3AF8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether the call was successful.
         * true: Call succeeded. false: Call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetVulItemPageResponseBody build() {
            return new GetVulItemPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVulItemPageResponseBody} extends {@link TeaModel}
     *
     * <p>GetVulItemPageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("AsapCount")
        private Integer asapCount;

        @com.aliyun.core.annotation.NameInMap("CustomerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("CveUrlPrefix")
        private String cveUrlPrefix;

        @com.aliyun.core.annotation.NameInMap("Dealed")
        private String dealed;

        @com.aliyun.core.annotation.NameInMap("FindTime")
        private String findTime;

        @com.aliyun.core.annotation.NameInMap("HandledCount")
        private Integer handledCount;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LaterCount")
        private Integer laterCount;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NntfCount")
        private Integer nntfCount;

        @com.aliyun.core.annotation.NameInMap("Related")
        private String related;

        @com.aliyun.core.annotation.NameInMap("RelatedCveCount")
        private Integer relatedCveCount;

        @com.aliyun.core.annotation.NameInMap("ScanType")
        private String scanType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("TotalFixCount")
        private Long totalFixCount;

        private Data(Builder builder) {
            this.aliasName = builder.aliasName;
            this.asapCount = builder.asapCount;
            this.customerId = builder.customerId;
            this.cveUrlPrefix = builder.cveUrlPrefix;
            this.dealed = builder.dealed;
            this.findTime = builder.findTime;
            this.handledCount = builder.handledCount;
            this.id = builder.id;
            this.laterCount = builder.laterCount;
            this.level = builder.level;
            this.name = builder.name;
            this.nntfCount = builder.nntfCount;
            this.related = builder.related;
            this.relatedCveCount = builder.relatedCveCount;
            this.scanType = builder.scanType;
            this.tags = builder.tags;
            this.totalFixCount = builder.totalFixCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return asapCount
         */
        public Integer getAsapCount() {
            return this.asapCount;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return cveUrlPrefix
         */
        public String getCveUrlPrefix() {
            return this.cveUrlPrefix;
        }

        /**
         * @return dealed
         */
        public String getDealed() {
            return this.dealed;
        }

        /**
         * @return findTime
         */
        public String getFindTime() {
            return this.findTime;
        }

        /**
         * @return handledCount
         */
        public Integer getHandledCount() {
            return this.handledCount;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return laterCount
         */
        public Integer getLaterCount() {
            return this.laterCount;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nntfCount
         */
        public Integer getNntfCount() {
            return this.nntfCount;
        }

        /**
         * @return related
         */
        public String getRelated() {
            return this.related;
        }

        /**
         * @return relatedCveCount
         */
        public Integer getRelatedCveCount() {
            return this.relatedCveCount;
        }

        /**
         * @return scanType
         */
        public String getScanType() {
            return this.scanType;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return totalFixCount
         */
        public Long getTotalFixCount() {
            return this.totalFixCount;
        }

        public static final class Builder {
            private String aliasName; 
            private Integer asapCount; 
            private String customerId; 
            private String cveUrlPrefix; 
            private String dealed; 
            private String findTime; 
            private Integer handledCount; 
            private Long id; 
            private Integer laterCount; 
            private String level; 
            private String name; 
            private Integer nntfCount; 
            private String related; 
            private Integer relatedCveCount; 
            private String scanType; 
            private String tags; 
            private Long totalFixCount; 

            /**
             * <p>Vulnerability alias.</p>
             * 
             * <strong>example:</strong>
             * <p>RHSA-2024:4620: libndp 安全更新</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>Number of high-priority vulnerabilities to be fixed.</p>
             * 
             * <strong>example:</strong>
             * <p>74</p>
             */
            public Builder asapCount(Integer asapCount) {
                this.asapCount = asapCount;
                return this;
            }

            /**
             * <p>User ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1940494487193744</p>
             */
            public Builder customerId(String customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * <p>Prefix for the CVE remediation advice URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://avd.aliyun.com/detail/">https://avd.aliyun.com/detail/</a></p>
             */
            public Builder cveUrlPrefix(String cveUrlPrefix) {
                this.cveUrlPrefix = cveUrlPrefix;
                return this;
            }

            /**
             * <p>Processing status.</p>
             * 
             * <strong>example:</strong>
             * <p>y</p>
             */
            public Builder dealed(String dealed) {
                this.dealed = dealed;
                return this;
            }

            /**
             * <p>Timestamp of the last discovery of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-23 14:47:34</p>
             */
            public Builder findTime(String findTime) {
                this.findTime = findTime;
                return this;
            }

            /**
             * <p>Number of processed vulnerabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder handledCount(Integer handledCount) {
                this.handledCount = handledCount;
                return this;
            }

            /**
             * <p>Primary key ID.</p>
             * 
             * <strong>example:</strong>
             * <p>353845</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Number of medium-priority vulnerabilities to be fixed.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder laterCount(Integer laterCount) {
                this.laterCount = laterCount;
                return this;
            }

            /**
             * <p>Risk level</p>
             * 
             * <strong>example:</strong>
             * <p>later</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>Vulnerability name.</p>
             * 
             * <strong>example:</strong>
             * <p>oval:com.redhat.rhsa:def:20205002</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Number of low-priority vulnerabilities to be fixed.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder nntfCount(Integer nntfCount) {
                this.nntfCount = nntfCount;
                return this;
            }

            /**
             * <p>CVE number.</p>
             * 
             * <strong>example:</strong>
             * <p>CVE-2019-20907</p>
             */
            public Builder related(String related) {
                this.related = related;
                return this;
            }

            /**
             * <p>Number of related CVE numbers.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder relatedCveCount(Integer relatedCveCount) {
                this.relatedCveCount = relatedCveCount;
                return this;
            }

            /**
             * <p>Vulnerability type.</p>
             * 
             * <strong>example:</strong>
             * <p>sca</p>
             */
            public Builder scanType(String scanType) {
                this.scanType = scanType;
                return this;
            }

            /**
             * <p>Tags.</p>
             * 
             * <strong>example:</strong>
             * <p>Elevation of Privilege</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>Total number of fixed vulnerabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder totalFixCount(Long totalFixCount) {
                this.totalFixCount = totalFixCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVulItemPageResponseBody} extends {@link TeaModel}
     *
     * <p>GetVulItemPageResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The current page number for pagination queries.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>Number of items to display per page in the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total number of records in the query result.</p>
             * 
             * <strong>example:</strong>
             * <p>163</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
