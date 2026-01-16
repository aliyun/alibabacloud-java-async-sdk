// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

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
 * {@link ListCertResponseBody} extends {@link TeaModel}
 *
 * <p>ListCertResponseBody</p>
 */
public class ListCertResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageCount")
    private Integer pageCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListCertResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.list = builder.list;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageCount = builder.pageCount;
        this.requestId = builder.requestId;
        this.showSize = builder.showSize;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCertResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageCount
     */
    public Integer getPageCount() {
        return this.pageCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return showSize
     */
    public Integer getShowSize() {
        return this.showSize;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List<List> list; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageCount; 
        private String requestId; 
        private Integer showSize; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListCertResponseBody model) {
            this.currentPage = model.currentPage;
            this.list = model.list;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageCount = model.pageCount;
            this.requestId = model.requestId;
            this.showSize = model.showSize;
            this.totalCount = model.totalCount;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * List.
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PageCount.
         */
        public Builder pageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ShowSize.
         */
        public Builder showSize(Integer showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCertResponseBody build() {
            return new ListCertResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCertResponseBody} extends {@link TeaModel}
     *
     * <p>ListCertResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AfterDate")
        private String afterDate;

        @com.aliyun.core.annotation.NameInMap("AfterTime")
        private Long afterTime;

        @com.aliyun.core.annotation.NameInMap("Algorithm")
        private String algorithm;

        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("BeforeDate")
        private String beforeDate;

        @com.aliyun.core.annotation.NameInMap("BeforeTime")
        private Long beforeTime;

        @com.aliyun.core.annotation.NameInMap("CertificateType")
        private String certificateType;

        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("CustomIdentifier")
        private String customIdentifier;

        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("KeyExportable")
        private Boolean keyExportable;

        @com.aliyun.core.annotation.NameInMap("Organization")
        private String organization;

        @com.aliyun.core.annotation.NameInMap("OrganizationUnit")
        private String organizationUnit;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private String serialNumber;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubjectDn")
        private String subjectDn;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<String> tags;

        private List(Builder builder) {
            this.afterDate = builder.afterDate;
            this.afterTime = builder.afterTime;
            this.algorithm = builder.algorithm;
            this.aliasName = builder.aliasName;
            this.beforeDate = builder.beforeDate;
            this.beforeTime = builder.beforeTime;
            this.certificateType = builder.certificateType;
            this.commonName = builder.commonName;
            this.customIdentifier = builder.customIdentifier;
            this.extra = builder.extra;
            this.id = builder.id;
            this.identifier = builder.identifier;
            this.keyExportable = builder.keyExportable;
            this.organization = builder.organization;
            this.organizationUnit = builder.organizationUnit;
            this.serialNumber = builder.serialNumber;
            this.status = builder.status;
            this.subjectDn = builder.subjectDn;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return afterDate
         */
        public String getAfterDate() {
            return this.afterDate;
        }

        /**
         * @return afterTime
         */
        public Long getAfterTime() {
            return this.afterTime;
        }

        /**
         * @return algorithm
         */
        public String getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return beforeDate
         */
        public String getBeforeDate() {
            return this.beforeDate;
        }

        /**
         * @return beforeTime
         */
        public Long getBeforeTime() {
            return this.beforeTime;
        }

        /**
         * @return certificateType
         */
        public String getCertificateType() {
            return this.certificateType;
        }

        /**
         * @return commonName
         */
        public String getCommonName() {
            return this.commonName;
        }

        /**
         * @return customIdentifier
         */
        public String getCustomIdentifier() {
            return this.customIdentifier;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return keyExportable
         */
        public Boolean getKeyExportable() {
            return this.keyExportable;
        }

        /**
         * @return organization
         */
        public String getOrganization() {
            return this.organization;
        }

        /**
         * @return organizationUnit
         */
        public String getOrganizationUnit() {
            return this.organizationUnit;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subjectDn
         */
        public String getSubjectDn() {
            return this.subjectDn;
        }

        /**
         * @return tags
         */
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String afterDate; 
            private Long afterTime; 
            private String algorithm; 
            private String aliasName; 
            private String beforeDate; 
            private Long beforeTime; 
            private String certificateType; 
            private String commonName; 
            private String customIdentifier; 
            private String extra; 
            private Long id; 
            private String identifier; 
            private Boolean keyExportable; 
            private String organization; 
            private String organizationUnit; 
            private String serialNumber; 
            private String status; 
            private String subjectDn; 
            private java.util.List<String> tags; 

            private Builder() {
            } 

            private Builder(List model) {
                this.afterDate = model.afterDate;
                this.afterTime = model.afterTime;
                this.algorithm = model.algorithm;
                this.aliasName = model.aliasName;
                this.beforeDate = model.beforeDate;
                this.beforeTime = model.beforeTime;
                this.certificateType = model.certificateType;
                this.commonName = model.commonName;
                this.customIdentifier = model.customIdentifier;
                this.extra = model.extra;
                this.id = model.id;
                this.identifier = model.identifier;
                this.keyExportable = model.keyExportable;
                this.organization = model.organization;
                this.organizationUnit = model.organizationUnit;
                this.serialNumber = model.serialNumber;
                this.status = model.status;
                this.subjectDn = model.subjectDn;
                this.tags = model.tags;
            } 

            /**
             * AfterDate.
             */
            public Builder afterDate(String afterDate) {
                this.afterDate = afterDate;
                return this;
            }

            /**
             * AfterTime.
             */
            public Builder afterTime(Long afterTime) {
                this.afterTime = afterTime;
                return this;
            }

            /**
             * Algorithm.
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * AliasName.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * BeforeDate.
             */
            public Builder beforeDate(String beforeDate) {
                this.beforeDate = beforeDate;
                return this;
            }

            /**
             * BeforeTime.
             */
            public Builder beforeTime(Long beforeTime) {
                this.beforeTime = beforeTime;
                return this;
            }

            /**
             * CertificateType.
             */
            public Builder certificateType(String certificateType) {
                this.certificateType = certificateType;
                return this;
            }

            /**
             * CommonName.
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * CustomIdentifier.
             */
            public Builder customIdentifier(String customIdentifier) {
                this.customIdentifier = customIdentifier;
                return this;
            }

            /**
             * Extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * KeyExportable.
             */
            public Builder keyExportable(Boolean keyExportable) {
                this.keyExportable = keyExportable;
                return this;
            }

            /**
             * Organization.
             */
            public Builder organization(String organization) {
                this.organization = organization;
                return this;
            }

            /**
             * OrganizationUnit.
             */
            public Builder organizationUnit(String organizationUnit) {
                this.organizationUnit = organizationUnit;
                return this;
            }

            /**
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SubjectDn.
             */
            public Builder subjectDn(String subjectDn) {
                this.subjectDn = subjectDn;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<String> tags) {
                this.tags = tags;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
