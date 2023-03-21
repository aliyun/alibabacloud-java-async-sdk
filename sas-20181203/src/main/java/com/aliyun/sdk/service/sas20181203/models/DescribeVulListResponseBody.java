// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of vulnerabilities returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * An array that consists of the details about the vulnerability.
         */
        public Builder vulRecords(java.util.List < VulRecords> vulRecords) {
            this.vulRecords = vulRecords;
            return this;
        }

        public DescribeVulListResponseBody build() {
            return new DescribeVulListResponseBody(this);
        } 

    } 

    public static class Necessity extends TeaModel {
        @NameInMap("Assets_factor")
        private String assetsFactor;

        @NameInMap("Cvss_factor")
        private String cvssFactor;

        @NameInMap("Enviroment_factor")
        private String enviromentFactor;

        @NameInMap("Is_calc")
        private String isCalc;

        @NameInMap("Status")
        private String status;

        @NameInMap("Time_factor")
        private String timeFactor;

        @NameInMap("Total_score")
        private String totalScore;

        private Necessity(Builder builder) {
            this.assetsFactor = builder.assetsFactor;
            this.cvssFactor = builder.cvssFactor;
            this.enviromentFactor = builder.enviromentFactor;
            this.isCalc = builder.isCalc;
            this.status = builder.status;
            this.timeFactor = builder.timeFactor;
            this.totalScore = builder.totalScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Necessity create() {
            return builder().build();
        }

        /**
         * @return assetsFactor
         */
        public String getAssetsFactor() {
            return this.assetsFactor;
        }

        /**
         * @return cvssFactor
         */
        public String getCvssFactor() {
            return this.cvssFactor;
        }

        /**
         * @return enviromentFactor
         */
        public String getEnviromentFactor() {
            return this.enviromentFactor;
        }

        /**
         * @return isCalc
         */
        public String getIsCalc() {
            return this.isCalc;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timeFactor
         */
        public String getTimeFactor() {
            return this.timeFactor;
        }

        /**
         * @return totalScore
         */
        public String getTotalScore() {
            return this.totalScore;
        }

        public static final class Builder {
            private String assetsFactor; 
            private String cvssFactor; 
            private String enviromentFactor; 
            private String isCalc; 
            private String status; 
            private String timeFactor; 
            private String totalScore; 

            /**
             * The asset importance score. Valid values:
             * <p>
             * 
             * *   **2**: an important asset
             * *   **1**: a common asset
             * *   **0**: a test asset
             */
            public Builder assetsFactor(String assetsFactor) {
                this.assetsFactor = assetsFactor;
                return this;
            }

            /**
             * The Common Vulnerability Scoring System (CVSS) score.
             */
            public Builder cvssFactor(String cvssFactor) {
                this.cvssFactor = cvssFactor;
                return this;
            }

            /**
             * The environment score.
             */
            public Builder enviromentFactor(String enviromentFactor) {
                this.enviromentFactor = enviromentFactor;
                return this;
            }

            /**
             * Indicates whether the score of urgency to fix a vulnerability is calculated. Valid values:
             * <p>
             * 
             * *   **0**: no
             * *   **1**: yes
             */
            public Builder isCalc(String isCalc) {
                this.isCalc = isCalc;
                return this;
            }

            /**
             * The status of the score of urgency to fix a vulnerability. Valid values:
             * <p>
             * 
             * *   **none**: No score is generated.
             * *   **pending**: The score is pending calculation.
             * *   **normal**: The calculation is normal.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time score.
             */
            public Builder timeFactor(String timeFactor) {
                this.timeFactor = timeFactor;
                return this;
            }

            /**
             * The score of urgency to fix a vulnerability.
             * <p>
             * 
             * The following list describes scores and related fixing suggestions:
             * 
             * *   If the score is from **13.5 to 15**, the vulnerability is a high-risk vulnerability. You must fix the vulnerability at the earliest opportunity.
             * *   If the score is **greater than or equal to 7 but less than 13.5**, the vulnerability is a medium-risk vulnerability. You can fix the vulnerability at your convenience.
             * *   If the score is **less than 7**, the vulnerability is a low-risk vulnerability. You can ignore the vulnerability.
             */
            public Builder totalScore(String totalScore) {
                this.totalScore = totalScore;
                return this;
            }

            public Necessity build() {
                return new Necessity(this);
            } 

        } 

    }
    public static class RpmEntityList extends TeaModel {
        @NameInMap("ContainerName")
        private String containerName;

        @NameInMap("FullVersion")
        private String fullVersion;

        @NameInMap("ImageName")
        private String imageName;

        @NameInMap("MatchDetail")
        private String matchDetail;

        @NameInMap("MatchList")
        private java.util.List < String > matchList;

        @NameInMap("Name")
        private String name;

        @NameInMap("Path")
        private String path;

        @NameInMap("Pid")
        private String pid;

        @NameInMap("UpdateCmd")
        private String updateCmd;

        @NameInMap("Version")
        private String version;

        private RpmEntityList(Builder builder) {
            this.containerName = builder.containerName;
            this.fullVersion = builder.fullVersion;
            this.imageName = builder.imageName;
            this.matchDetail = builder.matchDetail;
            this.matchList = builder.matchList;
            this.name = builder.name;
            this.path = builder.path;
            this.pid = builder.pid;
            this.updateCmd = builder.updateCmd;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RpmEntityList create() {
            return builder().build();
        }

        /**
         * @return containerName
         */
        public String getContainerName() {
            return this.containerName;
        }

        /**
         * @return fullVersion
         */
        public String getFullVersion() {
            return this.fullVersion;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return matchDetail
         */
        public String getMatchDetail() {
            return this.matchDetail;
        }

        /**
         * @return matchList
         */
        public java.util.List < String > getMatchList() {
            return this.matchList;
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
         * @return pid
         */
        public String getPid() {
            return this.pid;
        }

        /**
         * @return updateCmd
         */
        public String getUpdateCmd() {
            return this.updateCmd;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String containerName; 
            private String fullVersion; 
            private String imageName; 
            private String matchDetail; 
            private java.util.List < String > matchList; 
            private String name; 
            private String path; 
            private String pid; 
            private String updateCmd; 
            private String version; 

            /**
             * The name of the container.
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * The complete version number.
             */
            public Builder fullVersion(String fullVersion) {
                this.fullVersion = fullVersion;
                return this;
            }

            /**
             * The name of the image.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
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
             * The rule that is used to detect the vulnerability.
             */
            public Builder matchList(java.util.List < String > matchList) {
                this.matchList = matchList;
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
             * The process ID.
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * The command that is used to fix the vulnerability.
             */
            public Builder updateCmd(String updateCmd) {
                this.updateCmd = updateCmd;
                return this;
            }

            /**
             * The package version number of the software that has the vulnerability.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public RpmEntityList build() {
                return new RpmEntityList(this);
            } 

        } 

    }
    public static class ExtendContentJson extends TeaModel {
        @NameInMap("AbsolutePath")
        private String absolutePath;

        @NameInMap("AliasName")
        private String aliasName;

        @NameInMap("Description")
        private String description;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("LastTs")
        private Long lastTs;

        @NameInMap("Necessity")
        private Necessity necessity;

        @NameInMap("Os")
        private String os;

        @NameInMap("OsRelease")
        private String osRelease;

        @NameInMap("PrimaryId")
        private Long primaryId;

        @NameInMap("RpmEntityList")
        private java.util.List < RpmEntityList> rpmEntityList;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("cveList")
        private java.util.List < String > cveList;

        private ExtendContentJson(Builder builder) {
            this.absolutePath = builder.absolutePath;
            this.aliasName = builder.aliasName;
            this.description = builder.description;
            this.ip = builder.ip;
            this.lastTs = builder.lastTs;
            this.necessity = builder.necessity;
            this.os = builder.os;
            this.osRelease = builder.osRelease;
            this.primaryId = builder.primaryId;
            this.rpmEntityList = builder.rpmEntityList;
            this.status = builder.status;
            this.tag = builder.tag;
            this.cveList = builder.cveList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendContentJson create() {
            return builder().build();
        }

        /**
         * @return absolutePath
         */
        public String getAbsolutePath() {
            return this.absolutePath;
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return lastTs
         */
        public Long getLastTs() {
            return this.lastTs;
        }

        /**
         * @return necessity
         */
        public Necessity getNecessity() {
            return this.necessity;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return osRelease
         */
        public String getOsRelease() {
            return this.osRelease;
        }

        /**
         * @return primaryId
         */
        public Long getPrimaryId() {
            return this.primaryId;
        }

        /**
         * @return rpmEntityList
         */
        public java.util.List < RpmEntityList> getRpmEntityList() {
            return this.rpmEntityList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return cveList
         */
        public java.util.List < String > getCveList() {
            return this.cveList;
        }

        public static final class Builder {
            private String absolutePath; 
            private String aliasName; 
            private String description; 
            private String ip; 
            private Long lastTs; 
            private Necessity necessity; 
            private String os; 
            private String osRelease; 
            private Long primaryId; 
            private java.util.List < RpmEntityList> rpmEntityList; 
            private String status; 
            private String tag; 
            private java.util.List < String > cveList; 

            /**
             * The package path of the software that has the vulnerability.
             */
            public Builder absolutePath(String absolutePath) {
                this.absolutePath = absolutePath;
                return this;
            }

            /**
             * The alias of the vulnerability.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * The description of the vulnerability.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The public IP address of the asset that is associated with the vulnerability.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The timestamp when the vulnerability was last detected. Unit: milliseconds.
             */
            public Builder lastTs(Long lastTs) {
                this.lastTs = lastTs;
                return this;
            }

            /**
             * Indicates whether the vulnerability needs to be fixed.
             */
            public Builder necessity(Necessity necessity) {
                this.necessity = necessity;
                return this;
            }

            /**
             * The name of the operating system.
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * The release of the operating system.
             */
            public Builder osRelease(String osRelease) {
                this.osRelease = osRelease;
                return this;
            }

            /**
             * The ID of the vulnerability.
             */
            public Builder primaryId(Long primaryId) {
                this.primaryId = primaryId;
                return this;
            }

            /**
             * The RPM Package Manager (RPM) packages.
             */
            public Builder rpmEntityList(java.util.List < RpmEntityList> rpmEntityList) {
                this.rpmEntityList = rpmEntityList;
                return this;
            }

            /**
             * The status of the vulnerability. Valid values:
             * <p>
             * 
             * *   **1**: unfixed
             * *   **2**: fix failed
             * *   3: rollback failed
             * *   **4**: fixing
             * *   **5**: being rolled back
             * *   **6**: being verified
             * *   **7**: fixed
             * *   **8**: fixed and to be restarted
             * *   **9**: rolled back
             * *   **10**: ignored
             * *   **11**: rolled back and to be restarted
             * *   **12**: not found
             * *   **20**: expired
             */
            public Builder status(String status) {
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
             * The CVE list.
             */
            public Builder cveList(java.util.List < String > cveList) {
                this.cveList = cveList;
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

        @NameInMap("AuthVersion")
        private String authVersion;

        @NameInMap("Bind")
        private Boolean bind;

        @NameInMap("ExtendContentJson")
        private ExtendContentJson extendContentJson;

        @NameInMap("FirstTs")
        private Long firstTs;

        @NameInMap("GroupId")
        private Integer groupId;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

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

        @NameInMap("OsName")
        private String osName;

        @NameInMap("OsVersion")
        private String osVersion;

        @NameInMap("PrimaryId")
        private Long primaryId;

        @NameInMap("RaspDefend")
        private Integer raspDefend;

        @NameInMap("RaspStatus")
        private Integer raspStatus;

        @NameInMap("RegionId")
        private String regionId;

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

        @NameInMap("Uuid")
        private String uuid;

        private VulRecords(Builder builder) {
            this.aliasName = builder.aliasName;
            this.authVersion = builder.authVersion;
            this.bind = builder.bind;
            this.extendContentJson = builder.extendContentJson;
            this.firstTs = builder.firstTs;
            this.groupId = builder.groupId;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.lastTs = builder.lastTs;
            this.modifyTs = builder.modifyTs;
            this.name = builder.name;
            this.necessity = builder.necessity;
            this.online = builder.online;
            this.osName = builder.osName;
            this.osVersion = builder.osVersion;
            this.primaryId = builder.primaryId;
            this.raspDefend = builder.raspDefend;
            this.raspStatus = builder.raspStatus;
            this.regionId = builder.regionId;
            this.related = builder.related;
            this.repairTs = builder.repairTs;
            this.resultCode = builder.resultCode;
            this.resultMessage = builder.resultMessage;
            this.status = builder.status;
            this.tag = builder.tag;
            this.type = builder.type;
            this.uuid = builder.uuid;
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
         * @return authVersion
         */
        public String getAuthVersion() {
            return this.authVersion;
        }

        /**
         * @return bind
         */
        public Boolean getBind() {
            return this.bind;
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
         * @return groupId
         */
        public Integer getGroupId() {
            return this.groupId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
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
         * @return osName
         */
        public String getOsName() {
            return this.osName;
        }

        /**
         * @return osVersion
         */
        public String getOsVersion() {
            return this.osVersion;
        }

        /**
         * @return primaryId
         */
        public Long getPrimaryId() {
            return this.primaryId;
        }

        /**
         * @return raspDefend
         */
        public Integer getRaspDefend() {
            return this.raspDefend;
        }

        /**
         * @return raspStatus
         */
        public Integer getRaspStatus() {
            return this.raspStatus;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String aliasName; 
            private String authVersion; 
            private Boolean bind; 
            private ExtendContentJson extendContentJson; 
            private Long firstTs; 
            private Integer groupId; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private Long lastTs; 
            private Long modifyTs; 
            private String name; 
            private String necessity; 
            private Boolean online; 
            private String osName; 
            private String osVersion; 
            private Long primaryId; 
            private Integer raspDefend; 
            private Integer raspStatus; 
            private String regionId; 
            private String related; 
            private Long repairTs; 
            private String resultCode; 
            private String resultMessage; 
            private Integer status; 
            private String tag; 
            private String type; 
            private String uuid; 

            /**
             * The name of the vulnerability.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * The edition of Security Center that is authorized to protect the asset. Valid values:
             * <p>
             * 
             * *   **1**: Basic edition
             * *   **6**: Anti-virus edition
             * *   **5**: Advanced edition
             * *   **3**: Enterprise edition
             * *   **7**: Ultimate edition
             * *   **10**: Value-added Plan edition
             */
            public Builder authVersion(String authVersion) {
                this.authVersion = authVersion;
                return this;
            }

            /**
             * Indicates whether Security Center is authorized to protect the asset. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder bind(Boolean bind) {
                this.bind = bind;
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
             * The timestamp when the vulnerability was first detected. Unit: milliseconds.
             */
            public Builder firstTs(Long firstTs) {
                this.firstTs = firstTs;
                return this;
            }

            /**
             * The ID of the asset group.
             */
            public Builder groupId(Integer groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The instance ID of the asset.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the asset.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The public IP address of the asset.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The private IP address of the asset.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The timestamp when the vulnerability was last detected. Unit: milliseconds.
             */
            public Builder lastTs(Long lastTs) {
                this.lastTs = lastTs;
                return this;
            }

            /**
             * The timestamp when the vulnerability status was modified. Unit: milliseconds.
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
             * The priority to fix the vulnerability. Valid values:
             * <p>
             * 
             * *   **asap**: high
             * *   **later**: medium
             * *   **nntf**: low
             * 
             * > We recommend that you fix the vulnerabilities that have the **high** priority at the earliest opportunity.
             */
            public Builder necessity(String necessity) {
                this.necessity = necessity;
                return this;
            }

            /**
             * Indicates whether the Security Center agent on the asset is online. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * The name of the operating system for your asset.
             */
            public Builder osName(String osName) {
                this.osName = osName;
                return this;
            }

            /**
             * The name of the operating system for your asset.
             */
            public Builder osVersion(String osVersion) {
                this.osVersion = osVersion;
                return this;
            }

            /**
             * The ID of the vulnerability.
             */
            public Builder primaryId(Long primaryId) {
                this.primaryId = primaryId;
                return this;
            }

            /**
             * RaspDefend.
             */
            public Builder raspDefend(Integer raspDefend) {
                this.raspDefend = raspDefend;
                return this;
            }

            /**
             * RaspStatus.
             */
            public Builder raspStatus(Integer raspStatus) {
                this.raspStatus = raspStatus;
                return this;
            }

            /**
             * The ID of the region in which the server resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The Common Vulnerabilities and Exposures (CVE) IDs related to the vulnerability. Multiple CVE IDs are separated by commas (,).
             */
            public Builder related(String related) {
                this.related = related;
                return this;
            }

            /**
             * The timestamp when the vulnerability was fixed. Unit: milliseconds.
             */
            public Builder repairTs(Long repairTs) {
                this.repairTs = repairTs;
                return this;
            }

            /**
             * The code that indicates the vulnerability fixing result.
             */
            public Builder resultCode(String resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            /**
             * The message that indicates the vulnerability fixing result.
             */
            public Builder resultMessage(String resultMessage) {
                this.resultMessage = resultMessage;
                return this;
            }

            /**
             * The status of the vulnerability. Valid values:
             * <p>
             * 
             * *   **1**: unfixed
             * *   **2**: fix failed
             * *   **3**: rollback failed
             * *   **4**: fixing
             * *   **5**: being rolled back
             * *   **6**: being verified
             * *   **7**: fixed
             * *   **8**: fixed and to be restarted
             * *   **9**: rolled back
             * *   **10**: ignored
             * *   **11**: rolled back and to be restarted
             * *   **12**: not found
             * *   **20**: expired
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
             * The type of the vulnerability. Valid values:
             * <p>
             * 
             * *   **cve**: Linux software vulnerability
             * *   **sys**: Windows system vulnerability
             * *   **cms**: Web-CMS vulnerability
             * *   **emg**: urgent vulnerability
             * *   **app**: application vulnerability
             * *   **sca**: application vulnerability that is detected by using software component analysis
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The UUID of the asset.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public VulRecords build() {
                return new VulRecords(this);
            } 

        } 

    }
}
