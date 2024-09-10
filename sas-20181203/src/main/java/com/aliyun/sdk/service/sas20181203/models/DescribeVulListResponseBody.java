// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVulListResponseBody</p>
 */
public class DescribeVulListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VulRecords")
    private java.util.List < VulRecords> vulRecords;

    private DescribeVulListResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.nextToken = builder.nextToken;
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
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private String nextToken; 
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
         * The value of NextToken that is returned when the NextToken method is used.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The number of entries per page.
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
         * The information about the vulnerability.
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
        @com.aliyun.core.annotation.NameInMap("Assets_factor")
        private String assetsFactor;

        @com.aliyun.core.annotation.NameInMap("Cvss_factor")
        private String cvssFactor;

        @com.aliyun.core.annotation.NameInMap("Enviroment_factor")
        private String enviromentFactor;

        @com.aliyun.core.annotation.NameInMap("Is_calc")
        private String isCalc;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Time_factor")
        private String timeFactor;

        @com.aliyun.core.annotation.NameInMap("Total_score")
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
             * *   **2**: important asset.
             * *   **1**: common asset.
             * *   **0**: test asset.
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
             * Indicates whether the vulnerability priority score is calculated. Valid values:
             * <p>
             * 
             * *   **0**: no.
             * *   **1**: yes.
             */
            public Builder isCalc(String isCalc) {
                this.isCalc = isCalc;
                return this;
            }

            /**
             * The status of the vulnerability priority score. Valid values:
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
             * The vulnerability priority score.
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
        @com.aliyun.core.annotation.NameInMap("ContainerName")
        private String containerName;

        @com.aliyun.core.annotation.NameInMap("ExtendField")
        private String extendField;

        @com.aliyun.core.annotation.NameInMap("FullVersion")
        private String fullVersion;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("MatchDetail")
        private String matchDetail;

        @com.aliyun.core.annotation.NameInMap("MatchList")
        private java.util.List < String > matchList;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Pid")
        private String pid;

        @com.aliyun.core.annotation.NameInMap("UpdateCmd")
        private String updateCmd;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private RpmEntityList(Builder builder) {
            this.containerName = builder.containerName;
            this.extendField = builder.extendField;
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
         * @return extendField
         */
        public String getExtendField() {
            return this.extendField;
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
            private String extendField; 
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
             * The extended information about the software package that has the vulnerability.
             */
            public Builder extendField(String extendField) {
                this.extendField = extendField;
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
             * The rules that are used to detect the vulnerability.
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
             * The path to the software that has the vulnerability.
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
             * The version number of the package of the software that has the vulnerability.
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
        @com.aliyun.core.annotation.NameInMap("AbsolutePath")
        private String absolutePath;

        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EmgProof")
        private String emgProof;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("LastTs")
        private Long lastTs;

        @com.aliyun.core.annotation.NameInMap("Necessity")
        private Necessity necessity;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("OsRelease")
        private String osRelease;

        @com.aliyun.core.annotation.NameInMap("PrimaryId")
        private Long primaryId;

        @com.aliyun.core.annotation.NameInMap("RpmEntityList")
        private java.util.List < RpmEntityList> rpmEntityList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("cveList")
        private java.util.List < String > cveList;

        private ExtendContentJson(Builder builder) {
            this.absolutePath = builder.absolutePath;
            this.aliasName = builder.aliasName;
            this.description = builder.description;
            this.emgProof = builder.emgProof;
            this.ip = builder.ip;
            this.lastTs = builder.lastTs;
            this.necessity = builder.necessity;
            this.os = builder.os;
            this.osRelease = builder.osRelease;
            this.primaryId = builder.primaryId;
            this.rpmEntityList = builder.rpmEntityList;
            this.status = builder.status;
            this.tag = builder.tag;
            this.target = builder.target;
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
         * @return emgProof
         */
        public String getEmgProof() {
            return this.emgProof;
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
         * @return target
         */
        public String getTarget() {
            return this.target;
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
            private String emgProof; 
            private String ip; 
            private Long lastTs; 
            private Necessity necessity; 
            private String os; 
            private String osRelease; 
            private Long primaryId; 
            private java.util.List < RpmEntityList> rpmEntityList; 
            private String status; 
            private String tag; 
            private String target; 
            private java.util.List < String > cveList; 

            /**
             * The path to the package of the software that has the vulnerability.
             */
            public Builder absolutePath(String absolutePath) {
                this.absolutePath = absolutePath;
                return this;
            }

            /**
             * The name of the vulnerability.
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
             * The returned message that indicates the urgent vulnerability.
             */
            public Builder emgProof(String emgProof) {
                this.emgProof = emgProof;
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
             * The information about the operating system version.
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
             * The information about RPM Package Manager (RPM) packages.
             */
            public Builder rpmEntityList(java.util.List < RpmEntityList> rpmEntityList) {
                this.rpmEntityList = rpmEntityList;
                return this;
            }

            /**
             * The status of the vulnerability. Valid values:
             * <p>
             * 
             * *   **1**: unfixed.
             * *   **2**: fix failed.
             * *   3: rollback failed.
             * *   **4**: being fixed.
             * *   **5**: being rolled back.
             * *   **6**: being verified.
             * *   **7**: fixed.
             * *   **8**: fixed and to be restarted.
             * *   **9**: rolled back.
             * *   **10**: ignored.
             * *   **11**: rolled back and to be restarted.
             * *   **12**: not found.
             * *   **20**: expired.
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
             * The URL of the vulnerability.
             */
            public Builder target(String target) {
                this.target = target;
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
        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("AuthVersion")
        private String authVersion;

        @com.aliyun.core.annotation.NameInMap("Bind")
        private Boolean bind;

        @com.aliyun.core.annotation.NameInMap("ExtendContentJson")
        private ExtendContentJson extendContentJson;

        @com.aliyun.core.annotation.NameInMap("FirstTs")
        private Long firstTs;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Integer groupId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("K8sClusterId")
        private String k8sClusterId;

        @com.aliyun.core.annotation.NameInMap("K8sNamespace")
        private String k8sNamespace;

        @com.aliyun.core.annotation.NameInMap("K8sNodeId")
        private String k8sNodeId;

        @com.aliyun.core.annotation.NameInMap("K8sNodeName")
        private String k8sNodeName;

        @com.aliyun.core.annotation.NameInMap("K8sPodName")
        private String k8sPodName;

        @com.aliyun.core.annotation.NameInMap("LastTs")
        private Long lastTs;

        @com.aliyun.core.annotation.NameInMap("ModifyTs")
        private Long modifyTs;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Necessity")
        private String necessity;

        @com.aliyun.core.annotation.NameInMap("Online")
        private Boolean online;

        @com.aliyun.core.annotation.NameInMap("OsName")
        private String osName;

        @com.aliyun.core.annotation.NameInMap("OsVersion")
        private String osVersion;

        @com.aliyun.core.annotation.NameInMap("PrimaryId")
        private Long primaryId;

        @com.aliyun.core.annotation.NameInMap("RaspDefend")
        private Integer raspDefend;

        @com.aliyun.core.annotation.NameInMap("RaspStatus")
        private Integer raspStatus;

        @com.aliyun.core.annotation.NameInMap("RealRisk")
        private Boolean realRisk;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Related")
        private String related;

        @com.aliyun.core.annotation.NameInMap("RepairTs")
        private Long repairTs;

        @com.aliyun.core.annotation.NameInMap("ResultCode")
        private String resultCode;

        @com.aliyun.core.annotation.NameInMap("ResultMessage")
        private String resultMessage;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Uuid")
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
            this.k8sClusterId = builder.k8sClusterId;
            this.k8sNamespace = builder.k8sNamespace;
            this.k8sNodeId = builder.k8sNodeId;
            this.k8sNodeName = builder.k8sNodeName;
            this.k8sPodName = builder.k8sPodName;
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
            this.realRisk = builder.realRisk;
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
         * @return k8sClusterId
         */
        public String getK8sClusterId() {
            return this.k8sClusterId;
        }

        /**
         * @return k8sNamespace
         */
        public String getK8sNamespace() {
            return this.k8sNamespace;
        }

        /**
         * @return k8sNodeId
         */
        public String getK8sNodeId() {
            return this.k8sNodeId;
        }

        /**
         * @return k8sNodeName
         */
        public String getK8sNodeName() {
            return this.k8sNodeName;
        }

        /**
         * @return k8sPodName
         */
        public String getK8sPodName() {
            return this.k8sPodName;
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
         * @return realRisk
         */
        public Boolean getRealRisk() {
            return this.realRisk;
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
            private String k8sClusterId; 
            private String k8sNamespace; 
            private String k8sNodeId; 
            private String k8sNodeName; 
            private String k8sPodName; 
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
            private Boolean realRisk; 
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
             * The edition of Security Center that is authorized to scan the asset. Valid values:
             * <p>
             * 
             * *   **1**: Basic.
             * *   **6**: Anti-virus.
             * *   **5**: Advanced.
             * *   **3**: Enterprise.
             * *   **7**: Ultimate.
             * *   **10**: Value-added Plan.
             */
            public Builder authVersion(String authVersion) {
                this.authVersion = authVersion;
                return this;
            }

            /**
             * Indicates whether Security Center is authorized to scan the asset. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
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
             * The ID of the asset.
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
             * The ID of the cluster.
             */
            public Builder k8sClusterId(String k8sClusterId) {
                this.k8sClusterId = k8sClusterId;
                return this;
            }

            /**
             * The namespace.
             */
            public Builder k8sNamespace(String k8sNamespace) {
                this.k8sNamespace = k8sNamespace;
                return this;
            }

            /**
             * The ID of the node.
             */
            public Builder k8sNodeId(String k8sNodeId) {
                this.k8sNodeId = k8sNodeId;
                return this;
            }

            /**
             * The name of the node.
             */
            public Builder k8sNodeName(String k8sNodeName) {
                this.k8sNodeName = k8sNodeName;
                return this;
            }

            /**
             * The name of the pod.
             */
            public Builder k8sPodName(String k8sPodName) {
                this.k8sPodName = k8sPodName;
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
             * *   **asap**: high.
             * *   **later**: medium.
             * *   **nntf**: low.
             * 
             * >  We recommend that you fix **high-risk** vulnerabilities at the earliest opportunity.
             */
            public Builder necessity(String necessity) {
                this.necessity = necessity;
                return this;
            }

            /**
             * Indicates whether the Security Center agent on the asset is online. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
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
             * Indicates whether the application protection feature is supported. Valid values:
             * <p>
             * 
             * *   **0**: no.
             * *   **1**: yes.
             * 
             * >  If this parameter is not returned, the application protection feature is not supported.
             */
            public Builder raspDefend(Integer raspDefend) {
                this.raspDefend = raspDefend;
                return this;
            }

            /**
             * The protection mode of the application protection feature. Valid values:
             * <p>
             * 
             * *   **0**: unprotected.
             * *   **1**: the Monitor mode.
             * *   **2**: the Block mode.
             * *   **3**: disabled.
             */
            public Builder raspStatus(Integer raspStatus) {
                this.raspStatus = raspStatus;
                return this;
            }

            /**
             * Indicates whether the vulnerability is easily exploited. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder realRisk(Boolean realRisk) {
                this.realRisk = realRisk;
                return this;
            }

            /**
             * The region ID of the asset.
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
             * The timestamp when the vulnerability was fixed. Unit: milliseconds. This parameter is returned only if you fix vulnerabilities in the Security Center console.
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
             * *   **1**: unfixed.
             * *   **2**: fix failed.
             * *   **3**: rollback failed.
             * *   **4**: being fixed.
             * *   **5**: being rolled back.
             * *   **6**: being verified.
             * *   **7**: fixed.
             * *   **8**: fixed and to be restarted.
             * *   **9**: rolled back.
             * *   **10**: ignored.
             * *   **11**: rolled back and to be restarted.
             * *   **12**: not found.
             * *   **20**: expired.
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
             * *   **cve**: Linux software vulnerability.
             * *   **sys**: Windows system vulnerability.
             * *   **cms**: Web-CMS vulnerability.
             * *   **emg**: urgent vulnerability.
             * *   **app**: application vulnerability.
             * *   **sca**: application vulnerability that is detected by using software component analysis.
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
