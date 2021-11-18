// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListRepoTagScanResultResponseBody} extends {@link TeaModel}
 *
 * <p>ListRepoTagScanResultResponseBody</p>
 */
public class ListRepoTagScanResultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Code")
    private String code;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("Vulnerabilities")
    private java.util.List < Vulnerabilities> vulnerabilities;


    private ListRepoTagScanResultResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.pageNo = builder.pageNo;
        this.isSuccess = builder.isSuccess;
        this.pageSize = builder.pageSize;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
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

    /**
     * @return vulnerabilities
     */
    public java.util.List < Vulnerabilities> getVulnerabilities() {
        return this.vulnerabilities;
    }

    public static final class Builder {
        private String requestId; 
        private String code; 
        private Integer pageNo; 
        private Boolean isSuccess; 
        private Integer pageSize; 
        private Integer totalCount; 
        private java.util.List < Vulnerabilities> vulnerabilities; 

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Scan results list page number</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>Successful</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Number of scan results displayed per page</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Vulnerabilities scanned</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Scan vulnerability array</p>
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

        @NameInMap("Severity")
        private String severity;

        @NameInMap("CveName")
        private String cveName;

        @NameInMap("Feature")
        private String feature;

        @NameInMap("Description")
        private String description;

        @NameInMap("Version")
        private String version;

        @NameInMap("VersionFormat")
        private String versionFormat;

        @NameInMap("CveLink")
        private String cveLink;

        @NameInMap("FixCmd")
        private String fixCmd;

        @NameInMap("VersionFixed")
        private String versionFixed;


        private Vulnerabilities(Builder builder) {
            this.addedBy = builder.addedBy;
            this.severity = builder.severity;
            this.cveName = builder.cveName;
            this.feature = builder.feature;
            this.description = builder.description;
            this.version = builder.version;
            this.versionFormat = builder.versionFormat;
            this.cveLink = builder.cveLink;
            this.fixCmd = builder.fixCmd;
            this.versionFixed = builder.versionFixed;
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
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return cveName
         */
        public String getCveName() {
            return this.cveName;
        }

        /**
         * @return feature
         */
        public String getFeature() {
            return this.feature;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return versionFormat
         */
        public String getVersionFormat() {
            return this.versionFormat;
        }

        /**
         * @return cveLink
         */
        public String getCveLink() {
            return this.cveLink;
        }

        /**
         * @return fixCmd
         */
        public String getFixCmd() {
            return this.fixCmd;
        }

        /**
         * @return versionFixed
         */
        public String getVersionFixed() {
            return this.versionFixed;
        }

        public static final class Builder {
            private String addedBy; 
            private String severity; 
            private String cveName; 
            private String feature; 
            private String description; 
            private String version; 
            private String versionFormat; 
            private String cveLink; 
            private String fixCmd; 
            private String versionFixed; 

            /**
             * <p>Introduce the image layer of the vulnerability</p>
             */
            public Builder addedBy(String addedBy) {
                this.addedBy = addedBy;
                return this;
            }

            /**
             * <p>Vulnerability level</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>Vulnerability name</p>
             */
            public Builder cveName(String cveName) {
                this.cveName = cveName;
                return this;
            }

            /**
             * <p>Methods for introducing vulnerabilities</p>
             */
            public Builder feature(String feature) {
                this.feature = feature;
                return this;
            }

            /**
             * <p>Vulnerability description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Vulnerability version</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>Vulnerability format</p>
             */
            public Builder versionFormat(String versionFormat) {
                this.versionFormat = versionFormat;
                return this;
            }

            /**
             * <p>Vulnerability link</p>
             */
            public Builder cveLink(String cveLink) {
                this.cveLink = cveLink;
                return this;
            }

            /**
             * <p>Vulnerability fix commands</p>
             */
            public Builder fixCmd(String fixCmd) {
                this.fixCmd = fixCmd;
                return this;
            }

            /**
             * <p>The version of the vulnerability.</p>
             */
            public Builder versionFixed(String versionFixed) {
                this.versionFixed = versionFixed;
                return this;
            }

            public Vulnerabilities build() {
                return new Vulnerabilities(this);
            } 

        } 

    }
}
