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
 * {@link ListSoftwarelibSoftwareResponseBody} extends {@link TeaModel}
 *
 * <p>ListSoftwarelibSoftwareResponseBody</p>
 */
public class ListSoftwarelibSoftwareResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListSoftwarelibSoftwareResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSoftwarelibSoftwareResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataList
     */
    public java.util.List<DataList> getDataList() {
        return this.dataList;
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

    public static final class Builder {
        private java.util.List<DataList> dataList; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListSoftwarelibSoftwareResponseBody model) {
            this.dataList = model.dataList;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The software list.</p>
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * <p>The maximum number of entries per page. This parameter is not returned by this operation.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. This parameter is not returned by this operation.</p>
         * 
         * <strong>example:</strong>
         * <p>FFM+3L1WZbKngBeLWcDmQrzLuGDDwAw7JA5q2AjvTSJm9WyhQ0MwJoOWpky9ZhgcWfIgtGpZ+4NQX97+EIwsqUNQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BE4FB974-11BC-5453-9BE1-1606A73EACA6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of software entries that match the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSoftwarelibSoftwareResponseBody build() {
            return new ListSoftwarelibSoftwareResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSoftwarelibSoftwareResponseBody} extends {@link TeaModel}
     *
     * <p>ListSoftwarelibSoftwareResponseBody</p>
     */
    public static class Versions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DownloadTimes")
        private Long downloadTimes;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("PublisherType")
        private String publisherType;

        @com.aliyun.core.annotation.NameInMap("SoftwareId")
        private String softwareId;

        @com.aliyun.core.annotation.NameInMap("SoftwarePkgName")
        private String softwarePkgName;

        @com.aliyun.core.annotation.NameInMap("SoftwarePkgSize")
        private Long softwarePkgSize;

        @com.aliyun.core.annotation.NameInMap("SoftwareUrl")
        private String softwareUrl;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private String versionId;

        private Versions(Builder builder) {
            this.createTime = builder.createTime;
            this.downloadTimes = builder.downloadTimes;
            this.md5 = builder.md5;
            this.modifyTime = builder.modifyTime;
            this.os = builder.os;
            this.publisherType = builder.publisherType;
            this.softwareId = builder.softwareId;
            this.softwarePkgName = builder.softwarePkgName;
            this.softwarePkgSize = builder.softwarePkgSize;
            this.softwareUrl = builder.softwareUrl;
            this.status = builder.status;
            this.version = builder.version;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Versions create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return downloadTimes
         */
        public Long getDownloadTimes() {
            return this.downloadTimes;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return publisherType
         */
        public String getPublisherType() {
            return this.publisherType;
        }

        /**
         * @return softwareId
         */
        public String getSoftwareId() {
            return this.softwareId;
        }

        /**
         * @return softwarePkgName
         */
        public String getSoftwarePkgName() {
            return this.softwarePkgName;
        }

        /**
         * @return softwarePkgSize
         */
        public Long getSoftwarePkgSize() {
            return this.softwarePkgSize;
        }

        /**
         * @return softwareUrl
         */
        public String getSoftwareUrl() {
            return this.softwareUrl;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private String createTime; 
            private Long downloadTimes; 
            private String md5; 
            private String modifyTime; 
            private String os; 
            private String publisherType; 
            private String softwareId; 
            private String softwarePkgName; 
            private Long softwarePkgSize; 
            private String softwareUrl; 
            private String status; 
            private String version; 
            private String versionId; 

            private Builder() {
            } 

            private Builder(Versions model) {
                this.createTime = model.createTime;
                this.downloadTimes = model.downloadTimes;
                this.md5 = model.md5;
                this.modifyTime = model.modifyTime;
                this.os = model.os;
                this.publisherType = model.publisherType;
                this.softwareId = model.softwareId;
                this.softwarePkgName = model.softwarePkgName;
                this.softwarePkgSize = model.softwarePkgSize;
                this.softwareUrl = model.softwareUrl;
                this.status = model.status;
                this.version = model.version;
                this.versionId = model.versionId;
            } 

            /**
             * <p>The time when the software version was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-05 18:03:58</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The number of times the software has been downloaded from the client.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder downloadTimes(Long downloadTimes) {
                this.downloadTimes = downloadTimes;
                return this;
            }

            /**
             * <p>The MD5 value of the software package.</p>
             * 
             * <strong>example:</strong>
             * <p>0b5824cdd509d3ed560e2d20d29a1bcb</p>
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * <p>The time when the software version was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-05 18:03:58</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The operating system to which the software package applies. Valid values:</p>
             * <ul>
             * <li><strong>Windows</strong>: Windows.</li>
             * <li><strong>Mac(Apple)</strong>: macOS with Apple silicon.</li>
             * <li><strong>Mac(Intel)</strong>: macOS with Intel processors.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * <p>The software publisher type. Valid values:</p>
             * <ul>
             * <li><strong>local</strong>: locally uploaded.</li>
             * <li><strong>thirdparty</strong>: third-party link.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>local</p>
             */
            public Builder publisherType(String publisherType) {
                this.publisherType = publisherType;
                return this;
            }

            /**
             * <p>The ID of the software to which this version belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>softwarelib-software-1da844a39729****</p>
             */
            public Builder softwareId(String softwareId) {
                this.softwareId = softwareId;
                return this;
            }

            /**
             * <p>The name of the software package.</p>
             * 
             * <strong>example:</strong>
             * <p>test softwarename</p>
             */
            public Builder softwarePkgName(String softwarePkgName) {
                this.softwarePkgName = softwarePkgName;
                return this;
            }

            /**
             * <p>The size of the software package.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder softwarePkgSize(Long softwarePkgSize) {
                this.softwarePkgSize = softwarePkgSize;
                return this;
            }

            /**
             * <p>The download URL of the software package.</p>
             * 
             * <strong>example:</strong>
             * <p>https://<strong><strong>.com/</strong></strong></p>
             */
            public Builder softwareUrl(String softwareUrl) {
                this.softwareUrl = softwareUrl;
                return this;
            }

            /**
             * <p>The version publish status. Valid values:</p>
             * <ul>
             * <li><strong>published</strong>: published.</li>
             * <li><strong>unpublished</strong>: not published.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>published</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The software version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The software version ID.</p>
             * 
             * <strong>example:</strong>
             * <p>softwarelib-version-21ae186e2ac9****</p>
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public Versions build() {
                return new Versions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSoftwarelibSoftwareResponseBody} extends {@link TeaModel}
     *
     * <p>ListSoftwarelibSoftwareResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuiltinSoftwareId")
        private String builtinSoftwareId;

        @com.aliyun.core.annotation.NameInMap("CheckBundleId")
        private String checkBundleId;

        @com.aliyun.core.annotation.NameInMap("CheckSoftwareName")
        private String checkSoftwareName;

        @com.aliyun.core.annotation.NameInMap("ClassifyId")
        private String classifyId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DevTags")
        private java.util.List<String> devTags;

        @com.aliyun.core.annotation.NameInMap("DeviceGroupIds")
        private java.util.List<String> deviceGroupIds;

        @com.aliyun.core.annotation.NameInMap("DownloadTimes")
        private Long downloadTimes;

        @com.aliyun.core.annotation.NameInMap("HasNewVersion")
        private Boolean hasNewVersion;

        @com.aliyun.core.annotation.NameInMap("LogoUrl")
        private String logoUrl;

        @com.aliyun.core.annotation.NameInMap("MacAppleVersion")
        private String macAppleVersion;

        @com.aliyun.core.annotation.NameInMap("MacIntelVersion")
        private String macIntelVersion;

        @com.aliyun.core.annotation.NameInMap("MatchMode")
        private String matchMode;

        @com.aliyun.core.annotation.NameInMap("OfficialDownloadUrl")
        private String officialDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("RunAsAccount")
        private String runAsAccount;

        @com.aliyun.core.annotation.NameInMap("SoftwareId")
        private String softwareId;

        @com.aliyun.core.annotation.NameInMap("SoftwareName")
        private String softwareName;

        @com.aliyun.core.annotation.NameInMap("SourceRemoved")
        private Boolean sourceRemoved;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("UserGroupIds")
        private java.util.List<String> userGroupIds;

        @com.aliyun.core.annotation.NameInMap("Versions")
        private java.util.List<Versions> versions;

        @com.aliyun.core.annotation.NameInMap("WindowsVersion")
        private String windowsVersion;

        private DataList(Builder builder) {
            this.builtinSoftwareId = builder.builtinSoftwareId;
            this.checkBundleId = builder.checkBundleId;
            this.checkSoftwareName = builder.checkSoftwareName;
            this.classifyId = builder.classifyId;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.devTags = builder.devTags;
            this.deviceGroupIds = builder.deviceGroupIds;
            this.downloadTimes = builder.downloadTimes;
            this.hasNewVersion = builder.hasNewVersion;
            this.logoUrl = builder.logoUrl;
            this.macAppleVersion = builder.macAppleVersion;
            this.macIntelVersion = builder.macIntelVersion;
            this.matchMode = builder.matchMode;
            this.officialDownloadUrl = builder.officialDownloadUrl;
            this.runAsAccount = builder.runAsAccount;
            this.softwareId = builder.softwareId;
            this.softwareName = builder.softwareName;
            this.sourceRemoved = builder.sourceRemoved;
            this.sourceType = builder.sourceType;
            this.userGroupIds = builder.userGroupIds;
            this.versions = builder.versions;
            this.windowsVersion = builder.windowsVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return builtinSoftwareId
         */
        public String getBuiltinSoftwareId() {
            return this.builtinSoftwareId;
        }

        /**
         * @return checkBundleId
         */
        public String getCheckBundleId() {
            return this.checkBundleId;
        }

        /**
         * @return checkSoftwareName
         */
        public String getCheckSoftwareName() {
            return this.checkSoftwareName;
        }

        /**
         * @return classifyId
         */
        public String getClassifyId() {
            return this.classifyId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return devTags
         */
        public java.util.List<String> getDevTags() {
            return this.devTags;
        }

        /**
         * @return deviceGroupIds
         */
        public java.util.List<String> getDeviceGroupIds() {
            return this.deviceGroupIds;
        }

        /**
         * @return downloadTimes
         */
        public Long getDownloadTimes() {
            return this.downloadTimes;
        }

        /**
         * @return hasNewVersion
         */
        public Boolean getHasNewVersion() {
            return this.hasNewVersion;
        }

        /**
         * @return logoUrl
         */
        public String getLogoUrl() {
            return this.logoUrl;
        }

        /**
         * @return macAppleVersion
         */
        public String getMacAppleVersion() {
            return this.macAppleVersion;
        }

        /**
         * @return macIntelVersion
         */
        public String getMacIntelVersion() {
            return this.macIntelVersion;
        }

        /**
         * @return matchMode
         */
        public String getMatchMode() {
            return this.matchMode;
        }

        /**
         * @return officialDownloadUrl
         */
        public String getOfficialDownloadUrl() {
            return this.officialDownloadUrl;
        }

        /**
         * @return runAsAccount
         */
        public String getRunAsAccount() {
            return this.runAsAccount;
        }

        /**
         * @return softwareId
         */
        public String getSoftwareId() {
            return this.softwareId;
        }

        /**
         * @return softwareName
         */
        public String getSoftwareName() {
            return this.softwareName;
        }

        /**
         * @return sourceRemoved
         */
        public Boolean getSourceRemoved() {
            return this.sourceRemoved;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return userGroupIds
         */
        public java.util.List<String> getUserGroupIds() {
            return this.userGroupIds;
        }

        /**
         * @return versions
         */
        public java.util.List<Versions> getVersions() {
            return this.versions;
        }

        /**
         * @return windowsVersion
         */
        public String getWindowsVersion() {
            return this.windowsVersion;
        }

        public static final class Builder {
            private String builtinSoftwareId; 
            private String checkBundleId; 
            private String checkSoftwareName; 
            private String classifyId; 
            private String createTime; 
            private String description; 
            private java.util.List<String> devTags; 
            private java.util.List<String> deviceGroupIds; 
            private Long downloadTimes; 
            private Boolean hasNewVersion; 
            private String logoUrl; 
            private String macAppleVersion; 
            private String macIntelVersion; 
            private String matchMode; 
            private String officialDownloadUrl; 
            private String runAsAccount; 
            private String softwareId; 
            private String softwareName; 
            private Boolean sourceRemoved; 
            private String sourceType; 
            private java.util.List<String> userGroupIds; 
            private java.util.List<Versions> versions; 
            private String windowsVersion; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.builtinSoftwareId = model.builtinSoftwareId;
                this.checkBundleId = model.checkBundleId;
                this.checkSoftwareName = model.checkSoftwareName;
                this.classifyId = model.classifyId;
                this.createTime = model.createTime;
                this.description = model.description;
                this.devTags = model.devTags;
                this.deviceGroupIds = model.deviceGroupIds;
                this.downloadTimes = model.downloadTimes;
                this.hasNewVersion = model.hasNewVersion;
                this.logoUrl = model.logoUrl;
                this.macAppleVersion = model.macAppleVersion;
                this.macIntelVersion = model.macIntelVersion;
                this.matchMode = model.matchMode;
                this.officialDownloadUrl = model.officialDownloadUrl;
                this.runAsAccount = model.runAsAccount;
                this.softwareId = model.softwareId;
                this.softwareName = model.softwareName;
                this.sourceRemoved = model.sourceRemoved;
                this.sourceType = model.sourceType;
                this.userGroupIds = model.userGroupIds;
                this.versions = model.versions;
                this.windowsVersion = model.windowsVersion;
            } 

            /**
             * <p>The associated built-in software ID.</p>
             * 
             * <strong>example:</strong>
             * <p>softwarelib-software-1da844a39729****</p>
             */
            public Builder builtinSoftwareId(String builtinSoftwareId) {
                this.builtinSoftwareId = builtinSoftwareId;
                return this;
            }

            /**
             * <p>The software BundleId used for verification.</p>
             * 
             * <strong>example:</strong>
             * <p>test software</p>
             */
            public Builder checkBundleId(String checkBundleId) {
                this.checkBundleId = checkBundleId;
                return this;
            }

            /**
             * <p>The software name used for verification.</p>
             * 
             * <strong>example:</strong>
             * <p>test software</p>
             */
            public Builder checkSoftwareName(String checkSoftwareName) {
                this.checkSoftwareName = checkSoftwareName;
                return this;
            }

            /**
             * <p>The software classification ID.</p>
             * 
             * <strong>example:</strong>
             * <p>softwarelib-classify-61b7ccc63cae****</p>
             */
            public Builder classifyId(String classifyId) {
                this.classifyId = classifyId;
                return this;
            }

            /**
             * <p>The time when the software was created, in seconds-level UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1781748302</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The software description.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a demo software.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The list of associated terminal device IDs.</p>
             */
            public Builder devTags(java.util.List<String> devTags) {
                this.devTags = devTags;
                return this;
            }

            /**
             * <p>The list of associated device group IDs.</p>
             */
            public Builder deviceGroupIds(java.util.List<String> deviceGroupIds) {
                this.deviceGroupIds = deviceGroupIds;
                return this;
            }

            /**
             * <p>The number of times the software has been manually downloaded from the client.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder downloadTimes(Long downloadTimes) {
                this.downloadTimes = downloadTimes;
                return this;
            }

            /**
             * <p>Indicates whether a new version is available for the software.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasNewVersion(Boolean hasNewVersion) {
                this.hasNewVersion = hasNewVersion;
                return this;
            }

            /**
             * <p>The URL of the software logo.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://img.alicdn.com/imgextra/i4/O1CN01mXKAQX1P3a5fbS0Dp_!!6000000001785-2-tps-40-40.png">https://img.alicdn.com/imgextra/i4/O1CN01mXKAQX1P3a5fbS0Dp_!!6000000001785-2-tps-40-40.png</a></p>
             */
            public Builder logoUrl(String logoUrl) {
                this.logoUrl = logoUrl;
                return this;
            }

            /**
             * <p>The latest software version number for Mac (Apple).</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder macAppleVersion(String macAppleVersion) {
                this.macAppleVersion = macAppleVersion;
                return this;
            }

            /**
             * <p>The latest software version number for Mac (Intel).</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder macIntelVersion(String macIntelVersion) {
                this.macIntelVersion = macIntelVersion;
                return this;
            }

            /**
             * <p>The policy matching target type. Valid values:</p>
             * <ul>
             * <li><strong>UserGroupAll</strong>: all users.</li>
             * <li><strong>UserGroupNormal</strong>: specified user groups.</li>
             * <li><strong>DevTagNormal</strong>: specified devices.</li>
             * <li><strong>DeviceGroupNormal</strong>: specified device groups.</li>
             * <li><strong>DevTagAll</strong>: all devices.</li>
             * <li><strong>None</strong>: not configured.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UserGroupAll</p>
             */
            public Builder matchMode(String matchMode) {
                this.matchMode = matchMode;
                return this;
            }

            /**
             * <p>The official download URL of the software.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxx.com/">http://xxx.com/</a>****</p>
             */
            public Builder officialDownloadUrl(String officialDownloadUrl) {
                this.officialDownloadUrl = officialDownloadUrl;
                return this;
            }

            /**
             * <p>The execution account (only supported on Windows).</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder runAsAccount(String runAsAccount) {
                this.runAsAccount = runAsAccount;
                return this;
            }

            /**
             * <p>The software ID.</p>
             * 
             * <strong>example:</strong>
             * <p>softwarelib-software-1da844a39729****</p>
             */
            public Builder softwareId(String softwareId) {
                this.softwareId = softwareId;
                return this;
            }

            /**
             * <p>The software name.</p>
             * 
             * <strong>example:</strong>
             * <p>Thunder</p>
             */
            public Builder softwareName(String softwareName) {
                this.softwareName = softwareName;
                return this;
            }

            /**
             * <p>Indicates whether the built-in library source has been deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder sourceRemoved(Boolean sourceRemoved) {
                this.sourceRemoved = sourceRemoved;
                return this;
            }

            /**
             * <p>The software source. Valid values:</p>
             * <ul>
             * <li><strong>custom</strong>: custom software.</li>
             * <li><strong>builtin</strong>: built-in software library.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The list of associated user group IDs.</p>
             */
            public Builder userGroupIds(java.util.List<String> userGroupIds) {
                this.userGroupIds = userGroupIds;
                return this;
            }

            /**
             * <p>The software version list. This field is not returned by this operation. Call <a href="~~ListSoftwarelibVersion~~">ListSoftwarelibVersion</a> to query software versions.</p>
             */
            public Builder versions(java.util.List<Versions> versions) {
                this.versions = versions;
                return this;
            }

            /**
             * <p>The latest software version number for Windows.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder windowsVersion(String windowsVersion) {
                this.windowsVersion = windowsVersion;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
