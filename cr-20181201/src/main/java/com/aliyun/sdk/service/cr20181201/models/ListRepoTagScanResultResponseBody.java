// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepoTagScanResultResponseBody} extends {@link TeaModel}
 *
 * <p>ListRepoTagScanResultResponseBody</p>
 */
public class ListRepoTagScanResultResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("Vulnerabilities")
    private java.util.List < Vulnerabilities> vulnerabilities;

    private ListRepoTagScanResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vulnerabilities = builder.vulnerabilities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRepoTagScanResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vulnerabilities
     */
    public java.util.List < Vulnerabilities> getVulnerabilities() {
        return this.vulnerabilities;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < Vulnerabilities> vulnerabilities; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Vulnerabilities.
         */
        public Builder vulnerabilities(java.util.List < Vulnerabilities> vulnerabilities) {
            this.vulnerabilities = vulnerabilities;
            return this;
        }

        public ListRepoTagScanResultResponseBody build() {
            return new ListRepoTagScanResultResponseBody(this);
        } 

    } 

    public static class Vulnerabilities extends TeaModel {
        @NameInMap("AddedBy")
        private String addedBy;

        @NameInMap("CveLink")
        private String cveLink;

        @NameInMap("CveName")
        private String cveName;

        @NameInMap("Description")
        private String description;

        @NameInMap("Feature")
        private String feature;

        @NameInMap("FixCmd")
        private String fixCmd;

        @NameInMap("Severity")
        private String severity;

        @NameInMap("Version")
        private String version;

        @NameInMap("VersionFixed")
        private String versionFixed;

        @NameInMap("VersionFormat")
        private String versionFormat;

        private Vulnerabilities(Builder builder) {
            this.addedBy = builder.addedBy;
            this.cveLink = builder.cveLink;
            this.cveName = builder.cveName;
            this.description = builder.description;
            this.feature = builder.feature;
            this.fixCmd = builder.fixCmd;
            this.severity = builder.severity;
            this.version = builder.version;
            this.versionFixed = builder.versionFixed;
            this.versionFormat = builder.versionFormat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vulnerabilities create() {
            return builder().build();
        }

        /**
         * @return addedBy
         */
        public String getAddedBy() {
            return this.addedBy;
        }

        /**
         * @return cveLink
         */
        public String getCveLink() {
            return this.cveLink;
        }

        /**
         * @return cveName
         */
        public String getCveName() {
            return this.cveName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return feature
         */
        public String getFeature() {
            return this.feature;
        }

        /**
         * @return fixCmd
         */
        public String getFixCmd() {
            return this.fixCmd;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return versionFixed
         */
        public String getVersionFixed() {
            return this.versionFixed;
        }

        /**
         * @return versionFormat
         */
        public String getVersionFormat() {
            return this.versionFormat;
        }

        public static final class Builder {
            private String addedBy; 
            private String cveLink; 
            private String cveName; 
            private String description; 
            private String feature; 
            private String fixCmd; 
            private String severity; 
            private String version; 
            private String versionFixed; 
            private String versionFormat; 

            /**
             * AddedBy.
             */
            public Builder addedBy(String addedBy) {
                this.addedBy = addedBy;
                return this;
            }

            /**
             * CveLink.
             */
            public Builder cveLink(String cveLink) {
                this.cveLink = cveLink;
                return this;
            }

            /**
             * CveName.
             */
            public Builder cveName(String cveName) {
                this.cveName = cveName;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Feature.
             */
            public Builder feature(String feature) {
                this.feature = feature;
                return this;
            }

            /**
             * FixCmd.
             */
            public Builder fixCmd(String fixCmd) {
                this.fixCmd = fixCmd;
                return this;
            }

            /**
             * Severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * VersionFixed.
             */
            public Builder versionFixed(String versionFixed) {
                this.versionFixed = versionFixed;
                return this;
            }

            /**
             * VersionFormat.
             */
            public Builder versionFormat(String versionFormat) {
                this.versionFormat = versionFormat;
                return this;
            }

            public Vulnerabilities build() {
                return new Vulnerabilities(this);
            } 

        } 

    }
}
