// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
         * <p>CurrentPage.</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>PageSize.</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>TotalCount.</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>VulRecords.</p>
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

        @NameInMap("Gmt_create")
        private String gmtCreate;

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
            this.gmtCreate = builder.gmtCreate;
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
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
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
            private String gmtCreate; 
            private String isCalc; 
            private String status; 
            private String timeFactor; 
            private String totalScore; 

            /**
             * <p>Assets_factor.</p>
             */
            public Builder assetsFactor(String assetsFactor) {
                this.assetsFactor = assetsFactor;
                return this;
            }

            /**
             * <p>Cvss_factor.</p>
             */
            public Builder cvssFactor(String cvssFactor) {
                this.cvssFactor = cvssFactor;
                return this;
            }

            /**
             * <p>Enviroment_factor.</p>
             */
            public Builder enviromentFactor(String enviromentFactor) {
                this.enviromentFactor = enviromentFactor;
                return this;
            }

            /**
             * <p>Gmt_create.</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Is_calc.</p>
             */
            public Builder isCalc(String isCalc) {
                this.isCalc = isCalc;
                return this;
            }

            /**
             * <p>Status.</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Time_factor.</p>
             */
            public Builder timeFactor(String timeFactor) {
                this.timeFactor = timeFactor;
                return this;
            }

            /**
             * <p>Total_score.</p>
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

        @NameInMap("Name")
        private String name;

        @NameInMap("Path")
        private String path;

        @NameInMap("UpdateCmd")
        private String updateCmd;

        @NameInMap("Version")
        private String version;


        private RpmEntityList(Builder builder) {
            this.containerName = builder.containerName;
            this.fullVersion = builder.fullVersion;
            this.imageName = builder.imageName;
            this.matchDetail = builder.matchDetail;
            this.name = builder.name;
            this.path = builder.path;
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
            private String name; 
            private String path; 
            private String updateCmd; 
            private String version; 

            /**
             * <p>ContainerName.</p>
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * <p>FullVersion.</p>
             */
            public Builder fullVersion(String fullVersion) {
                this.fullVersion = fullVersion;
                return this;
            }

            /**
             * <p>ImageName.</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>MatchDetail.</p>
             */
            public Builder matchDetail(String matchDetail) {
                this.matchDetail = matchDetail;
                return this;
            }

            /**
             * <p>Name.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Path.</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>UpdateCmd.</p>
             */
            public Builder updateCmd(String updateCmd) {
                this.updateCmd = updateCmd;
                return this;
            }

            /**
             * <p>Version.</p>
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

        @NameInMap("Cwe")
        private String cwe;

        @NameInMap("Description")
        private String description;

        @NameInMap("Effect")
        private String effect;

        @NameInMap("EmgProof")
        private String emgProof;

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

        @NameInMap("Owasp")
        private String owasp;

        @NameInMap("PrimaryId")
        private Long primaryId;

        @NameInMap("Proof")
        private String proof;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Reference")
        private String reference;

        @NameInMap("RpmEntityList")
        private java.util.List < RpmEntityList> rpmEntityList;

        @NameInMap("Solution")
        private String solution;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("Target")
        private String target;

        @NameInMap("Title")
        private String title;

        @NameInMap("VulType")
        private String vulType;

        @NameInMap("Wasc")
        private String wasc;

        @NameInMap("cveList")
        private java.util.List < String > cveList;


        private ExtendContentJson(Builder builder) {
            this.absolutePath = builder.absolutePath;
            this.aliasName = builder.aliasName;
            this.cwe = builder.cwe;
            this.description = builder.description;
            this.effect = builder.effect;
            this.emgProof = builder.emgProof;
            this.ip = builder.ip;
            this.lastTs = builder.lastTs;
            this.necessity = builder.necessity;
            this.os = builder.os;
            this.osRelease = builder.osRelease;
            this.owasp = builder.owasp;
            this.primaryId = builder.primaryId;
            this.proof = builder.proof;
            this.reason = builder.reason;
            this.reference = builder.reference;
            this.rpmEntityList = builder.rpmEntityList;
            this.solution = builder.solution;
            this.status = builder.status;
            this.tag = builder.tag;
            this.target = builder.target;
            this.title = builder.title;
            this.vulType = builder.vulType;
            this.wasc = builder.wasc;
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
         * @return cwe
         */
        public String getCwe() {
            return this.cwe;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return effect
         */
        public String getEffect() {
            return this.effect;
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
         * @return owasp
         */
        public String getOwasp() {
            return this.owasp;
        }

        /**
         * @return primaryId
         */
        public Long getPrimaryId() {
            return this.primaryId;
        }

        /**
         * @return proof
         */
        public String getProof() {
            return this.proof;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return reference
         */
        public String getReference() {
            return this.reference;
        }

        /**
         * @return rpmEntityList
         */
        public java.util.List < RpmEntityList> getRpmEntityList() {
            return this.rpmEntityList;
        }

        /**
         * @return solution
         */
        public String getSolution() {
            return this.solution;
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
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return vulType
         */
        public String getVulType() {
            return this.vulType;
        }

        /**
         * @return wasc
         */
        public String getWasc() {
            return this.wasc;
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
            private String cwe; 
            private String description; 
            private String effect; 
            private String emgProof; 
            private String ip; 
            private Long lastTs; 
            private Necessity necessity; 
            private String os; 
            private String osRelease; 
            private String owasp; 
            private Long primaryId; 
            private String proof; 
            private String reason; 
            private String reference; 
            private java.util.List < RpmEntityList> rpmEntityList; 
            private String solution; 
            private String status; 
            private String tag; 
            private String target; 
            private String title; 
            private String vulType; 
            private String wasc; 
            private java.util.List < String > cveList; 

            /**
             * <p>AbsolutePath.</p>
             */
            public Builder absolutePath(String absolutePath) {
                this.absolutePath = absolutePath;
                return this;
            }

            /**
             * <p>AliasName.</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>Cwe.</p>
             */
            public Builder cwe(String cwe) {
                this.cwe = cwe;
                return this;
            }

            /**
             * <p>Description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Effect.</p>
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * <p>EmgProof.</p>
             */
            public Builder emgProof(String emgProof) {
                this.emgProof = emgProof;
                return this;
            }

            /**
             * <p>Ip.</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>LastTs.</p>
             */
            public Builder lastTs(Long lastTs) {
                this.lastTs = lastTs;
                return this;
            }

            /**
             * <p>Necessity.</p>
             */
            public Builder necessity(Necessity necessity) {
                this.necessity = necessity;
                return this;
            }

            /**
             * <p>Os.</p>
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * <p>OsRelease.</p>
             */
            public Builder osRelease(String osRelease) {
                this.osRelease = osRelease;
                return this;
            }

            /**
             * <p>Owasp.</p>
             */
            public Builder owasp(String owasp) {
                this.owasp = owasp;
                return this;
            }

            /**
             * <p>PrimaryId.</p>
             */
            public Builder primaryId(Long primaryId) {
                this.primaryId = primaryId;
                return this;
            }

            /**
             * <p>Proof.</p>
             */
            public Builder proof(String proof) {
                this.proof = proof;
                return this;
            }

            /**
             * <p>Reason.</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>Reference.</p>
             */
            public Builder reference(String reference) {
                this.reference = reference;
                return this;
            }

            /**
             * <p>RpmEntityList.</p>
             */
            public Builder rpmEntityList(java.util.List < RpmEntityList> rpmEntityList) {
                this.rpmEntityList = rpmEntityList;
                return this;
            }

            /**
             * <p>Solution.</p>
             */
            public Builder solution(String solution) {
                this.solution = solution;
                return this;
            }

            /**
             * <p>Status.</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Tag.</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>Target.</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>Title.</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>VulType.</p>
             */
            public Builder vulType(String vulType) {
                this.vulType = vulType;
                return this;
            }

            /**
             * <p>Wasc.</p>
             */
            public Builder wasc(String wasc) {
                this.wasc = wasc;
                return this;
            }

            /**
             * <p>cveList.</p>
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
    public static class SubProcessList extends TeaModel {
        @NameInMap("Pid")
        private String pid;

        @NameInMap("Pname")
        private String pname;

        @NameInMap("Rpm")
        private String rpm;


        private SubProcessList(Builder builder) {
            this.pid = builder.pid;
            this.pname = builder.pname;
            this.rpm = builder.rpm;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubProcessList create() {
            return builder().build();
        }

        /**
         * @return pid
         */
        public String getPid() {
            return this.pid;
        }

        /**
         * @return pname
         */
        public String getPname() {
            return this.pname;
        }

        /**
         * @return rpm
         */
        public String getRpm() {
            return this.rpm;
        }

        public static final class Builder {
            private String pid; 
            private String pname; 
            private String rpm; 

            /**
             * <p>Pid.</p>
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * <p>Pname.</p>
             */
            public Builder pname(String pname) {
                this.pname = pname;
                return this;
            }

            /**
             * <p>Rpm.</p>
             */
            public Builder rpm(String rpm) {
                this.rpm = rpm;
                return this;
            }

            public SubProcessList build() {
                return new SubProcessList(this);
            } 

        } 

    }
    public static class ProcessList extends TeaModel {
        @NameInMap("Pid")
        private String pid;

        @NameInMap("Pname")
        private String pname;

        @NameInMap("Rpm")
        private String rpm;

        @NameInMap("SubProcessList")
        private java.util.List < SubProcessList> subProcessList;


        private ProcessList(Builder builder) {
            this.pid = builder.pid;
            this.pname = builder.pname;
            this.rpm = builder.rpm;
            this.subProcessList = builder.subProcessList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessList create() {
            return builder().build();
        }

        /**
         * @return pid
         */
        public String getPid() {
            return this.pid;
        }

        /**
         * @return pname
         */
        public String getPname() {
            return this.pname;
        }

        /**
         * @return rpm
         */
        public String getRpm() {
            return this.rpm;
        }

        /**
         * @return subProcessList
         */
        public java.util.List < SubProcessList> getSubProcessList() {
            return this.subProcessList;
        }

        public static final class Builder {
            private String pid; 
            private String pname; 
            private String rpm; 
            private java.util.List < SubProcessList> subProcessList; 

            /**
             * <p>Pid.</p>
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * <p>Pname.</p>
             */
            public Builder pname(String pname) {
                this.pname = pname;
                return this;
            }

            /**
             * <p>Rpm.</p>
             */
            public Builder rpm(String rpm) {
                this.rpm = rpm;
                return this;
            }

            /**
             * <p>SubProcessList.</p>
             */
            public Builder subProcessList(java.util.List < SubProcessList> subProcessList) {
                this.subProcessList = subProcessList;
                return this;
            }

            public ProcessList build() {
                return new ProcessList(this);
            } 

        } 

    }
    public static class ProcessInfo extends TeaModel {
        @NameInMap("GmtLastTs")
        private Long gmtLastTs;

        @NameInMap("ProcessList")
        private java.util.List < ProcessList> processList;

        @NameInMap("TotalCount")
        private Integer totalCount;


        private ProcessInfo(Builder builder) {
            this.gmtLastTs = builder.gmtLastTs;
            this.processList = builder.processList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessInfo create() {
            return builder().build();
        }

        /**
         * @return gmtLastTs
         */
        public Long getGmtLastTs() {
            return this.gmtLastTs;
        }

        /**
         * @return processList
         */
        public java.util.List < ProcessList> getProcessList() {
            return this.processList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long gmtLastTs; 
            private java.util.List < ProcessList> processList; 
            private Integer totalCount; 

            /**
             * <p>GmtLastTs.</p>
             */
            public Builder gmtLastTs(Long gmtLastTs) {
                this.gmtLastTs = gmtLastTs;
                return this;
            }

            /**
             * <p>ProcessList.</p>
             */
            public Builder processList(java.util.List < ProcessList> processList) {
                this.processList = processList;
                return this;
            }

            /**
             * <p>TotalCount.</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ProcessInfo build() {
                return new ProcessInfo(this);
            } 

        } 

    }
    public static class VulRecords extends TeaModel {
        @NameInMap("AliasName")
        private String aliasName;

        @NameInMap("CanFix")
        private String canFix;

        @NameInMap("ContainerId")
        private String containerId;

        @NameInMap("ContainerImageId")
        private String containerImageId;

        @NameInMap("ContainerImageName")
        private String containerImageName;

        @NameInMap("ContainerInnerPath")
        private String containerInnerPath;

        @NameInMap("ContainerName")
        private String containerName;

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

        @NameInMap("Ip")
        private String ip;

        @NameInMap("K8sClusterId")
        private String k8sClusterId;

        @NameInMap("K8sNamespace")
        private String k8sNamespace;

        @NameInMap("K8sNodeId")
        private String k8sNodeId;

        @NameInMap("K8sNodeName")
        private String k8sNodeName;

        @NameInMap("K8sPodName")
        private String k8sPodName;

        @NameInMap("LastTs")
        private Long lastTs;

        @NameInMap("Level")
        private String level;

        @NameInMap("ModifyTs")
        private Long modifyTs;

        @NameInMap("Name")
        private String name;

        @NameInMap("Necessity")
        private String necessity;

        @NameInMap("NeedReboot")
        private String needReboot;

        @NameInMap("Online")
        private Boolean online;

        @NameInMap("OsVersion")
        private String osVersion;

        @NameInMap("PrimaryId")
        private Long primaryId;

        @NameInMap("ProcessInfo")
        private ProcessInfo processInfo;

        @NameInMap("Progress")
        private Integer progress;

        @NameInMap("RecordId")
        private Long recordId;

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
            this.canFix = builder.canFix;
            this.containerId = builder.containerId;
            this.containerImageId = builder.containerImageId;
            this.containerImageName = builder.containerImageName;
            this.containerInnerPath = builder.containerInnerPath;
            this.containerName = builder.containerName;
            this.extendContentJson = builder.extendContentJson;
            this.firstTs = builder.firstTs;
            this.groupId = builder.groupId;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.ip = builder.ip;
            this.k8sClusterId = builder.k8sClusterId;
            this.k8sNamespace = builder.k8sNamespace;
            this.k8sNodeId = builder.k8sNodeId;
            this.k8sNodeName = builder.k8sNodeName;
            this.k8sPodName = builder.k8sPodName;
            this.lastTs = builder.lastTs;
            this.level = builder.level;
            this.modifyTs = builder.modifyTs;
            this.name = builder.name;
            this.necessity = builder.necessity;
            this.needReboot = builder.needReboot;
            this.online = builder.online;
            this.osVersion = builder.osVersion;
            this.primaryId = builder.primaryId;
            this.processInfo = builder.processInfo;
            this.progress = builder.progress;
            this.recordId = builder.recordId;
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
         * @return canFix
         */
        public String getCanFix() {
            return this.canFix;
        }

        /**
         * @return containerId
         */
        public String getContainerId() {
            return this.containerId;
        }

        /**
         * @return containerImageId
         */
        public String getContainerImageId() {
            return this.containerImageId;
        }

        /**
         * @return containerImageName
         */
        public String getContainerImageName() {
            return this.containerImageName;
        }

        /**
         * @return containerInnerPath
         */
        public String getContainerInnerPath() {
            return this.containerInnerPath;
        }

        /**
         * @return containerName
         */
        public String getContainerName() {
            return this.containerName;
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
         * @return ip
         */
        public String getIp() {
            return this.ip;
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
         * @return level
         */
        public String getLevel() {
            return this.level;
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
         * @return needReboot
         */
        public String getNeedReboot() {
            return this.needReboot;
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
         * @return primaryId
         */
        public Long getPrimaryId() {
            return this.primaryId;
        }

        /**
         * @return processInfo
         */
        public ProcessInfo getProcessInfo() {
            return this.processInfo;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return recordId
         */
        public Long getRecordId() {
            return this.recordId;
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
            private String canFix; 
            private String containerId; 
            private String containerImageId; 
            private String containerImageName; 
            private String containerInnerPath; 
            private String containerName; 
            private ExtendContentJson extendContentJson; 
            private Long firstTs; 
            private Integer groupId; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String ip; 
            private String k8sClusterId; 
            private String k8sNamespace; 
            private String k8sNodeId; 
            private String k8sNodeName; 
            private String k8sPodName; 
            private Long lastTs; 
            private String level; 
            private Long modifyTs; 
            private String name; 
            private String necessity; 
            private String needReboot; 
            private Boolean online; 
            private String osVersion; 
            private Long primaryId; 
            private ProcessInfo processInfo; 
            private Integer progress; 
            private Long recordId; 
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
             * <p>AliasName.</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>CanFix.</p>
             */
            public Builder canFix(String canFix) {
                this.canFix = canFix;
                return this;
            }

            /**
             * <p>ContainerId.</p>
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            /**
             * <p>ContainerImageId.</p>
             */
            public Builder containerImageId(String containerImageId) {
                this.containerImageId = containerImageId;
                return this;
            }

            /**
             * <p>ContainerImageName.</p>
             */
            public Builder containerImageName(String containerImageName) {
                this.containerImageName = containerImageName;
                return this;
            }

            /**
             * <p>ContainerInnerPath.</p>
             */
            public Builder containerInnerPath(String containerInnerPath) {
                this.containerInnerPath = containerInnerPath;
                return this;
            }

            /**
             * <p>ContainerName.</p>
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * <p>ExtendContentJson.</p>
             */
            public Builder extendContentJson(ExtendContentJson extendContentJson) {
                this.extendContentJson = extendContentJson;
                return this;
            }

            /**
             * <p>FirstTs.</p>
             */
            public Builder firstTs(Long firstTs) {
                this.firstTs = firstTs;
                return this;
            }

            /**
             * <p>GroupId.</p>
             */
            public Builder groupId(Integer groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>InstanceId.</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>InstanceName.</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>InternetIp.</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>IntranetIp.</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>Ip.</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>K8sClusterId.</p>
             */
            public Builder k8sClusterId(String k8sClusterId) {
                this.k8sClusterId = k8sClusterId;
                return this;
            }

            /**
             * <p>K8sNamespace.</p>
             */
            public Builder k8sNamespace(String k8sNamespace) {
                this.k8sNamespace = k8sNamespace;
                return this;
            }

            /**
             * <p>K8sNodeId.</p>
             */
            public Builder k8sNodeId(String k8sNodeId) {
                this.k8sNodeId = k8sNodeId;
                return this;
            }

            /**
             * <p>K8sNodeName.</p>
             */
            public Builder k8sNodeName(String k8sNodeName) {
                this.k8sNodeName = k8sNodeName;
                return this;
            }

            /**
             * <p>K8sPodName.</p>
             */
            public Builder k8sPodName(String k8sPodName) {
                this.k8sPodName = k8sPodName;
                return this;
            }

            /**
             * <p>LastTs.</p>
             */
            public Builder lastTs(Long lastTs) {
                this.lastTs = lastTs;
                return this;
            }

            /**
             * <p>Level.</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>ModifyTs.</p>
             */
            public Builder modifyTs(Long modifyTs) {
                this.modifyTs = modifyTs;
                return this;
            }

            /**
             * <p>Name.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Necessity.</p>
             */
            public Builder necessity(String necessity) {
                this.necessity = necessity;
                return this;
            }

            /**
             * <p>NeedReboot.</p>
             */
            public Builder needReboot(String needReboot) {
                this.needReboot = needReboot;
                return this;
            }

            /**
             * <p>Online.</p>
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * <p>OsVersion.</p>
             */
            public Builder osVersion(String osVersion) {
                this.osVersion = osVersion;
                return this;
            }

            /**
             * <p>PrimaryId.</p>
             */
            public Builder primaryId(Long primaryId) {
                this.primaryId = primaryId;
                return this;
            }

            /**
             * <p>ProcessInfo.</p>
             */
            public Builder processInfo(ProcessInfo processInfo) {
                this.processInfo = processInfo;
                return this;
            }

            /**
             * <p>Progress.</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>RecordId.</p>
             */
            public Builder recordId(Long recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * <p>RegionId.</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Related.</p>
             */
            public Builder related(String related) {
                this.related = related;
                return this;
            }

            /**
             * <p>RepairTs.</p>
             */
            public Builder repairTs(Long repairTs) {
                this.repairTs = repairTs;
                return this;
            }

            /**
             * <p>ResultCode.</p>
             */
            public Builder resultCode(String resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            /**
             * <p>ResultMessage.</p>
             */
            public Builder resultMessage(String resultMessage) {
                this.resultMessage = resultMessage;
                return this;
            }

            /**
             * <p>Status.</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Tag.</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>Type.</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Uuid.</p>
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
