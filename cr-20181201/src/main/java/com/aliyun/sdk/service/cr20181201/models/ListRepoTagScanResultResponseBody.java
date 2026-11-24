// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link ListRepoTagScanResultResponseBody} extends {@link TeaModel}
 *
 * <p>ListRepoTagScanResultResponseBody</p>
 */
public class ListRepoTagScanResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("Vulnerabilities")
    private java.util.List<Vulnerabilities> vulnerabilities;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Vulnerabilities> getVulnerabilities() {
        return this.vulnerabilities;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<Vulnerabilities> vulnerabilities; 

        private Builder() {
        } 

        private Builder(ListRepoTagScanResultResponseBody model) {
            this.code = model.code;
            this.isSuccess = model.isSuccess;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.vulnerabilities = model.vulnerabilities;
        } 

        /**
         * <p>The return value.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Success</p>
         * </li>
         * <li><p><code>false</code>: Failure</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The page number of the scan result list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page in the scan result list.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>56B5C92F-F5D9-46E0-823F-EC71D1892DAA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of scanned vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>196</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The array of scanned vulnerabilities.</p>
         */
        public Builder vulnerabilities(java.util.List<Vulnerabilities> vulnerabilities) {
            this.vulnerabilities = vulnerabilities;
            return this;
        }

        public ListRepoTagScanResultResponseBody build() {
            return new ListRepoTagScanResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRepoTagScanResultResponseBody} extends {@link TeaModel}
     *
     * <p>ListRepoTagScanResultResponseBody</p>
     */
    public static class Vulnerabilities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddedBy")
        private String addedBy;

        @com.aliyun.core.annotation.NameInMap("AliasName")
        @Deprecated
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("CveLink")
        private String cveLink;

        @com.aliyun.core.annotation.NameInMap("CveLocation")
        private String cveLocation;

        @com.aliyun.core.annotation.NameInMap("CveName")
        private String cveName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Feature")
        private String feature;

        @com.aliyun.core.annotation.NameInMap("FixCmd")
        private String fixCmd;

        @com.aliyun.core.annotation.NameInMap("ScanType")
        private String scanType;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VersionFixed")
        private String versionFixed;

        @com.aliyun.core.annotation.NameInMap("VersionFormat")
        private String versionFormat;

        private Vulnerabilities(Builder builder) {
            this.addedBy = builder.addedBy;
            this.aliasName = builder.aliasName;
            this.cveLink = builder.cveLink;
            this.cveLocation = builder.cveLocation;
            this.cveName = builder.cveName;
            this.description = builder.description;
            this.feature = builder.feature;
            this.fixCmd = builder.fixCmd;
            this.scanType = builder.scanType;
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
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return cveLink
         */
        public String getCveLink() {
            return this.cveLink;
        }

        /**
         * @return cveLocation
         */
        public String getCveLocation() {
            return this.cveLocation;
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
         * @return scanType
         */
        public String getScanType() {
            return this.scanType;
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
            private String aliasName; 
            private String cveLink; 
            private String cveLocation; 
            private String cveName; 
            private String description; 
            private String feature; 
            private String fixCmd; 
            private String scanType; 
            private String severity; 
            private String version; 
            private String versionFixed; 
            private String versionFormat; 

            private Builder() {
            } 

            private Builder(Vulnerabilities model) {
                this.addedBy = model.addedBy;
                this.aliasName = model.aliasName;
                this.cveLink = model.cveLink;
                this.cveLocation = model.cveLocation;
                this.cveName = model.cveName;
                this.description = model.description;
                this.feature = model.feature;
                this.fixCmd = model.fixCmd;
                this.scanType = model.scanType;
                this.severity = model.severity;
                this.version = model.version;
                this.versionFixed = model.versionFixed;
                this.versionFormat = model.versionFormat;
            } 

            /**
             * <p>The image layer that introduced the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>sha256:123456717b8e40b6480979b739010d8d549989602bcdd07922119aec6f9dbe57</p>
             */
            public Builder addedBy(String addedBy) {
                this.addedBy = addedBy;
                return this;
            }

            /**
             * <p>The vulnerability name.</p>
             * 
             * <strong>example:</strong>
             * <p>Vulnerability</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>The vulnerability link.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://security-tracker.debian.org/tracker/CVE-2009-5155">https://security-tracker.debian.org/tracker/CVE-2009-5155</a></p>
             */
            public Builder cveLink(String cveLink) {
                this.cveLink = cveLink;
                return this;
            }

            /**
             * <p>The vulnerability location.</p>
             * 
             * <strong>example:</strong>
             * <p>/test.txt</p>
             */
            public Builder cveLocation(String cveLocation) {
                this.cveLocation = cveLocation;
                return this;
            }

            /**
             * <p>The vulnerability name.</p>
             * 
             * <strong>example:</strong>
             * <p>CVE-2009-5155</p>
             */
            public Builder cveName(String cveName) {
                this.cveName = cveName;
                return this;
            }

            /**
             * <p>The vulnerability description.</p>
             * 
             * <strong>example:</strong>
             * <p>description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The feature that introduced the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>eglibc</p>
             */
            public Builder feature(String feature) {
                this.feature = feature;
                return this;
            }

            /**
             * <p>The vulnerability fix command.</p>
             * 
             * <strong>example:</strong>
             * <p>yum install -y xxx</p>
             */
            public Builder fixCmd(String fixCmd) {
                this.fixCmd = fixCmd;
                return this;
            }

            /**
             * <p>The vulnerability type. Valid values:</p>
             * <ul>
             * <li><p><code>cve</code>: System vulnerability</p>
             * </li>
             * <li><p><code>sca</code>: Application vulnerability</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cve</p>
             */
            public Builder scanType(String scanType) {
                this.scanType = scanType;
                return this;
            }

            /**
             * <p>The severity level of the scanned vulnerability. Valid values:</p>
             * <ul>
             * <li><p><code>High</code>: High</p>
             * </li>
             * <li><p><code>Medium</code>: Medium</p>
             * </li>
             * <li><p><code>Low</code>: Low</p>
             * </li>
             * <li><p><code>Unknown</code>: Unknown</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Medium</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The vulnerability version.</p>
             * 
             * <strong>example:</strong>
             * <p>2.19-6.9</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The version that fixes the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>2.19-18+deb8u5</p>
             */
            public Builder versionFixed(String versionFixed) {
                this.versionFixed = versionFixed;
                return this;
            }

            /**
             * <p>The version format.</p>
             * 
             * <strong>example:</strong>
             * <p>dpkg</p>
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
