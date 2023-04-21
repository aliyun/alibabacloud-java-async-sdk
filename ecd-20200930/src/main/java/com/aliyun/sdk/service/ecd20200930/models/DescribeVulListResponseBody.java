// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVulListResponseBody</p>
 */
public class DescribeVulListResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("VulRecords")
    private java.util.List < VulRecords> vulRecords;

    private DescribeVulListResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vulRecords = builder.vulRecords;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulListResponseBody create() {
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
     * @return vulRecords
     */
    public java.util.List < VulRecords> getVulRecords() {
        return this.vulRecords;
    }

    public static final class Builder {
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < VulRecords> vulRecords; 

        /**
         * The page number of the returned page.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The vulnerabilities.
         */
        public Builder vulRecords(java.util.List < VulRecords> vulRecords) {
            this.vulRecords = vulRecords;
            return this;
        }

        public DescribeVulListResponseBody build() {
            return new DescribeVulListResponseBody(this);
        } 

    } 

    public static class RpmEntityList extends TeaModel {
        @NameInMap("FullVersion")
        private String fullVersion;

        @NameInMap("MatchDetail")
        private String matchDetail;

        @NameInMap("Name")
        private String name;

        @NameInMap("Path")
        private String path;

        @NameInMap("UpdateCmd")
        private String updateCmd;

        private RpmEntityList(Builder builder) {
            this.fullVersion = builder.fullVersion;
            this.matchDetail = builder.matchDetail;
            this.name = builder.name;
            this.path = builder.path;
            this.updateCmd = builder.updateCmd;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RpmEntityList create() {
            return builder().build();
        }

        /**
         * @return fullVersion
         */
        public String getFullVersion() {
            return this.fullVersion;
        }

        /**
         * @return matchDetail
         */
        public String getMatchDetail() {
            return this.matchDetail;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return updateCmd
         */
        public String getUpdateCmd() {
            return this.updateCmd;
        }

        public static final class Builder {
            private String fullVersion; 
            private String matchDetail; 
            private String name; 
            private String path; 
            private String updateCmd; 

            /**
             * The complete version number.
             */
            public Builder fullVersion(String fullVersion) {
                this.fullVersion = fullVersion;
                return this;
            }

            /**
             * The reason why the vulnerability is detected.
             */
            public Builder matchDetail(String matchDetail) {
                this.matchDetail = matchDetail;
                return this;
            }

            /**
             * The name of the RPM package.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The path of the software that has the vulnerability.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * The command that is used to fix the vulnerability.
             */
            public Builder updateCmd(String updateCmd) {
                this.updateCmd = updateCmd;
                return this;
            }

            public RpmEntityList build() {
                return new RpmEntityList(this);
            } 

        } 

    }
    public static class ExtendContentJson extends TeaModel {
        @NameInMap("RpmEntityList")
        private java.util.List < RpmEntityList> rpmEntityList;

        private ExtendContentJson(Builder builder) {
            this.rpmEntityList = builder.rpmEntityList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendContentJson create() {
            return builder().build();
        }

        /**
         * @return rpmEntityList
         */
        public java.util.List < RpmEntityList> getRpmEntityList() {
            return this.rpmEntityList;
        }

        public static final class Builder {
            private java.util.List < RpmEntityList> rpmEntityList; 

            /**
             * The RPM Package Manager (RPM) packages.
             */
            public Builder rpmEntityList(java.util.List < RpmEntityList> rpmEntityList) {
                this.rpmEntityList = rpmEntityList;
                return this;
            }

            public ExtendContentJson build() {
                return new ExtendContentJson(this);
            } 

        } 

    }
    public static class VulRecords extends TeaModel {
        @NameInMap("AliasName")
        private String aliasName;

        @NameInMap("DesktopId")
        private String desktopId;

        @NameInMap("DesktopName")
        private String desktopName;

        @NameInMap("ExtendContentJson")
        private ExtendContentJson extendContentJson;

        @NameInMap("FirstTs")
        private Long firstTs;

        @NameInMap("LastTs")
        private Long lastTs;

        @NameInMap("ModifyTs")
        private Long modifyTs;

        @NameInMap("Name")
        private String name;

        @NameInMap("Necessity")
        private String necessity;

        @NameInMap("Online")
        private Boolean online;

        @NameInMap("OsVersion")
        private String osVersion;

        @NameInMap("Related")
        private String related;

        @NameInMap("RepairTs")
        private Long repairTs;

        @NameInMap("ResultCode")
        private String resultCode;

        @NameInMap("ResultMessage")
        private String resultMessage;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("Type")
        private String type;

        private VulRecords(Builder builder) {
            this.aliasName = builder.aliasName;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.extendContentJson = builder.extendContentJson;
            this.firstTs = builder.firstTs;
            this.lastTs = builder.lastTs;
            this.modifyTs = builder.modifyTs;
            this.name = builder.name;
            this.necessity = builder.necessity;
            this.online = builder.online;
            this.osVersion = builder.osVersion;
            this.related = builder.related;
            this.repairTs = builder.repairTs;
            this.resultCode = builder.resultCode;
            this.resultMessage = builder.resultMessage;
            this.status = builder.status;
            this.tag = builder.tag;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VulRecords create() {
            return builder().build();
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return desktopName
         */
        public String getDesktopName() {
            return this.desktopName;
        }

        /**
         * @return extendContentJson
         */
        public ExtendContentJson getExtendContentJson() {
            return this.extendContentJson;
        }

        /**
         * @return firstTs
         */
        public Long getFirstTs() {
            return this.firstTs;
        }

        /**
         * @return lastTs
         */
        public Long getLastTs() {
            return this.lastTs;
        }

        /**
         * @return modifyTs
         */
        public Long getModifyTs() {
            return this.modifyTs;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return necessity
         */
        public String getNecessity() {
            return this.necessity;
        }

        /**
         * @return online
         */
        public Boolean getOnline() {
            return this.online;
        }

        /**
         * @return osVersion
         */
        public String getOsVersion() {
            return this.osVersion;
        }

        /**
         * @return related
         */
        public String getRelated() {
            return this.related;
        }

        /**
         * @return repairTs
         */
        public Long getRepairTs() {
            return this.repairTs;
        }

        /**
         * @return resultCode
         */
        public String getResultCode() {
            return this.resultCode;
        }

        /**
         * @return resultMessage
         */
        public String getResultMessage() {
            return this.resultMessage;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String aliasName; 
            private String desktopId; 
            private String desktopName; 
            private ExtendContentJson extendContentJson; 
            private Long firstTs; 
            private Long lastTs; 
            private Long modifyTs; 
            private String name; 
            private String necessity; 
            private Boolean online; 
            private String osVersion; 
            private String related; 
            private Long repairTs; 
            private String resultCode; 
            private String resultMessage; 
            private Integer status; 
            private String tag; 
            private String type; 

            /**
             * The alias of the vulnerability.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * The ID of the affected cloud desktop.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * The name of the affected cloud desktop.
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * The extended information about the vulnerability.
             */
            public Builder extendContentJson(ExtendContentJson extendContentJson) {
                this.extendContentJson = extendContentJson;
                return this;
            }

            /**
             * The UNIX timestamp when the vulnerability was first detected. Unit: milliseconds.
             */
            public Builder firstTs(Long firstTs) {
                this.firstTs = firstTs;
                return this;
            }

            /**
             * The UNIX timestamp when the vulnerability was last detected. Unit: milliseconds.
             */
            public Builder lastTs(Long lastTs) {
                this.lastTs = lastTs;
                return this;
            }

            /**
             * The timestamp when the vulnerability status was changed. Unit: milliseconds.
             */
            public Builder modifyTs(Long modifyTs) {
                this.modifyTs = modifyTs;
                return this;
            }

            /**
             * The name of the vulnerability.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The priority to fix the vulnerability or the risk level of the vulnerability.
             */
            public Builder necessity(String necessity) {
                this.necessity = necessity;
                return this;
            }

            /**
             * Indicates whether the Security Center agent on the cloud desktop is online.
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * The version of the OS of the cloud desktop.
             */
            public Builder osVersion(String osVersion) {
                this.osVersion = osVersion;
                return this;
            }

            /**
             * The IDs of the common vulnerabilities and exposures (CVEs) that are related to the vulnerability.
             */
            public Builder related(String related) {
                this.related = related;
                return this;
            }

            /**
             * The UNIX timestamp when the vulnerability was fixed. Unit: milliseconds.
             */
            public Builder repairTs(Long repairTs) {
                this.repairTs = repairTs;
                return this;
            }

            /**
             * The code returned after the vulnerability is fixed.
             */
            public Builder resultCode(String resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            /**
             * The message returned after the vulnerability is fixed.
             */
            public Builder resultMessage(String resultMessage) {
                this.resultMessage = resultMessage;
                return this;
            }

            /**
             * The status of the vulnerability.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The tag that is added to the vulnerability.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The type of the vulnerability.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public VulRecords build() {
                return new VulRecords(this);
            } 

        } 

    }
}
