// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
    private java.util.List<VulRecords> vulRecords;

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
    public java.util.List<VulRecords> getVulRecords() {
        return this.vulRecords;
    }

    public static final class Builder {
        private Integer currentPage; 
        private String nextToken; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<VulRecords> vulRecords; 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The value of NextToken that is returned when the NextToken method is used.</p>
         * 
         * <strong>example:</strong>
         * <p>E17B501887A2D3AA5E8360A6EFA3B***</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>2F26AB2A-1075-488F-8472-40E5DB486ACC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of vulnerabilities returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The information about the vulnerability.</p>
         */
        public Builder vulRecords(java.util.List<VulRecords> vulRecords) {
            this.vulRecords = vulRecords;
            return this;
        }

        public DescribeVulListResponseBody build() {
            return new DescribeVulListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVulListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVulListResponseBody</p>
     */
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
             * <p>The asset importance score. Valid values:</p>
             * <ul>
             * <li><strong>2</strong>: important asset.</li>
             * <li><strong>1</strong>: common asset.</li>
             * <li><strong>0</strong>: test asset.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder assetsFactor(String assetsFactor) {
                this.assetsFactor = assetsFactor;
                return this;
            }

            /**
             * <p>The Common Vulnerability Scoring System (CVSS) score.</p>
             * 
             * <strong>example:</strong>
             * <p>7.8</p>
             */
            public Builder cvssFactor(String cvssFactor) {
                this.cvssFactor = cvssFactor;
                return this;
            }

            /**
             * <p>The environment score.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder enviromentFactor(String enviromentFactor) {
                this.enviromentFactor = enviromentFactor;
                return this;
            }

            /**
             * <p>Indicates whether the vulnerability priority score is calculated. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: no.</li>
             * <li><strong>1</strong>: yes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isCalc(String isCalc) {
                this.isCalc = isCalc;
                return this;
            }

            /**
             * <p>The status of the vulnerability priority score. Valid values:</p>
             * <ul>
             * <li><strong>none</strong>: No score is generated.</li>
             * <li><strong>pending</strong>: The score is pending calculation.</li>
             * <li><strong>normal</strong>: The calculation is normal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time score.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder timeFactor(String timeFactor) {
                this.timeFactor = timeFactor;
                return this;
            }

            /**
             * <p>The vulnerability priority score.</p>
             * <p>The following list describes scores and related fixing suggestions:</p>
             * <ul>
             * <li>If the score is from <strong>13.5 to 15</strong>, the vulnerability is a high-risk vulnerability. You must fix the vulnerability at the earliest opportunity.</li>
             * <li>If the score is <strong>greater than or equal to 7 but less than 13.5</strong>, the vulnerability is a medium-risk vulnerability. You can fix the vulnerability at your convenience.</li>
             * <li>If the score is <strong>less than 7</strong>, the vulnerability is a low-risk vulnerability. You can ignore the vulnerability.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>7.8</p>
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
    /**
     * 
     * {@link DescribeVulListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVulListResponseBody</p>
     */
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
        private java.util.List<String> matchList;

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
        public java.util.List<String> getMatchList() {
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
            private java.util.List<String> matchList; 
            private String name; 
            private String path; 
            private String pid; 
            private String updateCmd; 
            private String version; 

            /**
             * <p>The name of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>k8s_67895c4_xxx</p>
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * <p>The extended information about the software package that has the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;msg_no_lookups_configured_CVE_2021_44228&quot;: &quot;false&quot;, &quot;jndi_class_not_exist&quot;: &quot;false&quot;}</p>
             */
            public Builder extendField(String extendField) {
                this.extendField = extendField;
                return this;
            }

            /**
             * <p>The complete version number.</p>
             * 
             * <strong>example:</strong>
             * <p>3.10.0-693.2.2.el7</p>
             */
            public Builder fullVersion(String fullVersion) {
                this.fullVersion = fullVersion;
                return this;
            }

            /**
             * <p>The name of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>registry_387ytb_xxx</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The reason why the vulnerability is detected.</p>
             * 
             * <strong>example:</strong>
             * <p>python-perf version less than 0:3.10.0-693.21.1.el7</p>
             */
            public Builder matchDetail(String matchDetail) {
                this.matchDetail = matchDetail;
                return this;
            }

            /**
             * <p>The rules that are used to detect the vulnerability.</p>
             */
            public Builder matchList(java.util.List<String> matchList) {
                this.matchList = matchList;
                return this;
            }

            /**
             * <p>The name of the RPM package.</p>
             * 
             * <strong>example:</strong>
             * <p>python-perf</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The path to the software that has the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/lib64/python2.7/site-packages</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The process ID.</p>
             * 
             * <strong>example:</strong>
             * <p>8664</p>
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * <p>The command that is used to fix the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>*** update python-perf</p>
             */
            public Builder updateCmd(String updateCmd) {
                this.updateCmd = updateCmd;
                return this;
            }

            /**
             * <p>The version number of the package of the software that has the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>3.10.0</p>
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
    /**
     * 
     * {@link DescribeVulListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVulListResponseBody</p>
     */
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
        private java.util.List<RpmEntityList> rpmEntityList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("cveList")
        private java.util.List<String> cveList;

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
        public java.util.List<RpmEntityList> getRpmEntityList() {
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
        public java.util.List<String> getCveList() {
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
            private java.util.List<RpmEntityList> rpmEntityList; 
            private String status; 
            private String tag; 
            private String target; 
            private java.util.List<String> cveList; 

            /**
             * <p>The path to the package of the software that has the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>/roo/www/web</p>
             */
            public Builder absolutePath(String absolutePath) {
                this.absolutePath = absolutePath;
                return this;
            }

            /**
             * <p>The name of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>RHSA-2019:0230-Important: polkit security update</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>The description of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>kernel version:5.10.84-10.2.al8.x86_64</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The returned message that indicates the urgent vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>com.xxl.rpc.util.XxlRpcException: xxl-rpc request data is empty.\n\tat com.xxl.rpc.remoting.net.impl.servlet.serve&quot;</p>
             */
            public Builder emgProof(String emgProof) {
                this.emgProof = emgProof;
                return this;
            }

            /**
             * <p>The public IP address of the asset that is associated with the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The timestamp when the vulnerability was last detected. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1620404763000</p>
             */
            public Builder lastTs(Long lastTs) {
                this.lastTs = lastTs;
                return this;
            }

            /**
             * <p>Indicates whether the vulnerability needs to be fixed.</p>
             */
            public Builder necessity(Necessity necessity) {
                this.necessity = necessity;
                return this;
            }

            /**
             * <p>The name of the operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>centos</p>
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * <p>The information about the operating system version.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder osRelease(String osRelease) {
                this.osRelease = osRelease;
                return this;
            }

            /**
             * <p>The ID of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder primaryId(Long primaryId) {
                this.primaryId = primaryId;
                return this;
            }

            /**
             * <p>The information about RPM Package Manager (RPM) packages.</p>
             */
            public Builder rpmEntityList(java.util.List<RpmEntityList> rpmEntityList) {
                this.rpmEntityList = rpmEntityList;
                return this;
            }

            /**
             * <p>The status of the vulnerability. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: unfixed.</li>
             * <li><strong>2</strong>: fix failed.</li>
             * <li>3: rollback failed.</li>
             * <li><strong>4</strong>: being fixed.</li>
             * <li><strong>5</strong>: being rolled back.</li>
             * <li><strong>6</strong>: being verified.</li>
             * <li><strong>7</strong>: fixed.</li>
             * <li><strong>8</strong>: fixed and to be restarted.</li>
             * <li><strong>9</strong>: rolled back.</li>
             * <li><strong>10</strong>: ignored.</li>
             * <li><strong>11</strong>: rolled back and to be restarted.</li>
             * <li><strong>12</strong>: not found.</li>
             * <li><strong>20</strong>: expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tag that is added to the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>oval</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The URL of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://39.99.XX.XX:30005/toLogin">http://39.99.XX.XX:30005/toLogin</a></p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The CVE list.</p>
             */
            public Builder cveList(java.util.List<String> cveList) {
                this.cveList = cveList;
                return this;
            }

            public ExtendContentJson build() {
                return new ExtendContentJson(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVulListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVulListResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

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
            this.progress = builder.progress;
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
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
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
            private Integer progress; 
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
             * <p>The name of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>RHSA-2019:0230-Important: polkit security update</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>The edition of Security Center that is authorized to scan the asset. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Basic.</li>
             * <li><strong>6</strong>: Anti-virus.</li>
             * <li><strong>5</strong>: Advanced.</li>
             * <li><strong>3</strong>: Enterprise.</li>
             * <li><strong>7</strong>: Ultimate.</li>
             * <li><strong>10</strong>: Value-added Plan.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder authVersion(String authVersion) {
                this.authVersion = authVersion;
                return this;
            }

            /**
             * <p>Indicates whether Security Center is authorized to scan the asset. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder bind(Boolean bind) {
                this.bind = bind;
                return this;
            }

            /**
             * <p>The extended information about the vulnerability.</p>
             */
            public Builder extendContentJson(ExtendContentJson extendContentJson) {
                this.extendContentJson = extendContentJson;
                return this;
            }

            /**
             * <p>The timestamp when the vulnerability was first detected. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1554189334000</p>
             */
            public Builder firstTs(Long firstTs) {
                this.firstTs = firstTs;
                return this;
            }

            /**
             * <p>The ID of the asset group.</p>
             * 
             * <strong>example:</strong>
             * <p>281801</p>
             */
            public Builder groupId(Integer groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp18t***</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>testInstance</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>c863dc93bed3843de9934d4346dc4****</p>
             */
            public Builder k8sClusterId(String k8sClusterId) {
                this.k8sClusterId = k8sClusterId;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder k8sNamespace(String k8sNamespace) {
                this.k8sNamespace = k8sNamespace;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1ifm6suw9mnbsr****</p>
             */
            public Builder k8sNodeId(String k8sNodeId) {
                this.k8sNodeId = k8sNodeId;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>deployment-riskai-7b67d68975-m****</p>
             */
            public Builder k8sNodeName(String k8sNodeName) {
                this.k8sNodeName = k8sNodeName;
                return this;
            }

            /**
             * <p>The name of the pod.</p>
             * 
             * <strong>example:</strong>
             * <p>deployment-riskai-7b67d68975-m****</p>
             */
            public Builder k8sPodName(String k8sPodName) {
                this.k8sPodName = k8sPodName;
                return this;
            }

            /**
             * <p>The timestamp when the vulnerability was last detected. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1620404763000</p>
             */
            public Builder lastTs(Long lastTs) {
                this.lastTs = lastTs;
                return this;
            }

            /**
             * <p>The timestamp when the vulnerability status was modified. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1620404763000</p>
             */
            public Builder modifyTs(Long modifyTs) {
                this.modifyTs = modifyTs;
                return this;
            }

            /**
             * <p>The name of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>oval:com.redhat.rhsa:def:20170574</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The priority to fix the vulnerability. Valid values:</p>
             * <ul>
             * <li><strong>asap</strong>: high.</li>
             * <li><strong>later</strong>: medium.</li>
             * <li><strong>nntf</strong>: low.</li>
             * </ul>
             * <blockquote>
             * <p> We recommend that you fix <strong>high-risk</strong> vulnerabilities at the earliest opportunity.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>asap</p>
             */
            public Builder necessity(String necessity) {
                this.necessity = necessity;
                return this;
            }

            /**
             * <p>Indicates whether the Security Center agent on the asset is online. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * <p>The name of the operating system for your asset.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS 7.2 64-bit</p>
             */
            public Builder osName(String osName) {
                this.osName = osName;
                return this;
            }

            /**
             * <p>The name of the operating system for your asset.</p>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder osVersion(String osVersion) {
                this.osVersion = osVersion;
                return this;
            }

            /**
             * <p>The ID of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>101162078</p>
             */
            public Builder primaryId(Long primaryId) {
                this.primaryId = primaryId;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>Indicates whether the application protection feature is supported. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: no.</li>
             * <li><strong>1</strong>: yes.</li>
             * </ul>
             * <blockquote>
             * <p> If this parameter is not returned, the application protection feature is not supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder raspDefend(Integer raspDefend) {
                this.raspDefend = raspDefend;
                return this;
            }

            /**
             * <p>The protection mode of the application protection feature. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: unprotected.</li>
             * <li><strong>1</strong>: the Monitor mode.</li>
             * <li><strong>2</strong>: the Block mode.</li>
             * <li><strong>3</strong>: disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder raspStatus(Integer raspStatus) {
                this.raspStatus = raspStatus;
                return this;
            }

            /**
             * <p>Indicates whether the vulnerability is easily exploited. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder realRisk(Boolean realRisk) {
                this.realRisk = realRisk;
                return this;
            }

            /**
             * <p>The region ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The Common Vulnerabilities and Exposures (CVE) IDs related to the vulnerability. Multiple CVE IDs are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>CVE-2017-7518,CVE-2017-12188</p>
             */
            public Builder related(String related) {
                this.related = related;
                return this;
            }

            /**
             * <p>The timestamp when the vulnerability was fixed. Unit: milliseconds. This parameter is returned only if you fix vulnerabilities in the Security Center console.</p>
             * 
             * <strong>example:</strong>
             * <p>1541207563000</p>
             */
            public Builder repairTs(Long repairTs) {
                this.repairTs = repairTs;
                return this;
            }

            /**
             * <p>The code that indicates the vulnerability fixing result.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder resultCode(String resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            /**
             * <p>The message that indicates the vulnerability fixing result.</p>
             * 
             * <strong>example:</strong>
             * <p>timeout</p>
             */
            public Builder resultMessage(String resultMessage) {
                this.resultMessage = resultMessage;
                return this;
            }

            /**
             * <p>The status of the vulnerability. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: unfixed.</li>
             * <li><strong>2</strong>: fix failed.</li>
             * <li><strong>3</strong>: rollback failed.</li>
             * <li><strong>4</strong>: being fixed.</li>
             * <li><strong>5</strong>: being rolled back.</li>
             * <li><strong>6</strong>: being verified.</li>
             * <li><strong>7</strong>: fixed.</li>
             * <li><strong>8</strong>: fixed and to be restarted.</li>
             * <li><strong>9</strong>: rolled back.</li>
             * <li><strong>10</strong>: ignored.</li>
             * <li><strong>11</strong>: rolled back and to be restarted.</li>
             * <li><strong>12</strong>: not found.</li>
             * <li><strong>20</strong>: expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tag that is added to the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>oval</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The type of the vulnerability. Valid values:</p>
             * <ul>
             * <li><strong>cve</strong>: Linux software vulnerability.</li>
             * <li><strong>sys</strong>: Windows system vulnerability.</li>
             * <li><strong>cms</strong>: Web-CMS vulnerability.</li>
             * <li><strong>emg</strong>: urgent vulnerability.</li>
             * <li><strong>app</strong>: application vulnerability.</li>
             * <li><strong>sca</strong>: application vulnerability that is detected by using software component analysis.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cve</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The UUID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>04c56617-23fc-43a5-ab9b-****</p>
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
