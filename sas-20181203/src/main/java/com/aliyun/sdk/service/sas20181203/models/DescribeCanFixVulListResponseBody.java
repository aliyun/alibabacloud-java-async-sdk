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
 * {@link DescribeCanFixVulListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCanFixVulListResponseBody</p>
 */
public class DescribeCanFixVulListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VulRecords")
    private java.util.List<VulRecords> vulRecords;

    private DescribeCanFixVulListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vulRecords = builder.vulRecords;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCanFixVulListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vulRecords
     */
    public java.util.List<VulRecords> getVulRecords() {
        return this.vulRecords;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<VulRecords> vulRecords; 

        private Builder() {
        } 

        private Builder(DescribeCanFixVulListResponseBody model) {
            this.requestId = model.requestId;
            this.vulRecords = model.vulRecords;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1408FDB3-46F4-513C-9918-FE7D356DF048</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the vulnerability.</p>
         */
        public Builder vulRecords(java.util.List<VulRecords> vulRecords) {
            this.vulRecords = vulRecords;
            return this;
        }

        public DescribeCanFixVulListResponseBody build() {
            return new DescribeCanFixVulListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCanFixVulListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCanFixVulListResponseBody</p>
     */
    public static class RpmEntityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FullVersion")
        private String fullVersion;

        @com.aliyun.core.annotation.NameInMap("Layer")
        private String layer;

        @com.aliyun.core.annotation.NameInMap("MatchDetail")
        private String matchDetail;

        @com.aliyun.core.annotation.NameInMap("MatchList")
        private java.util.List<String> matchList;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("UpdateCmd")
        private String updateCmd;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private RpmEntityList(Builder builder) {
            this.fullVersion = builder.fullVersion;
            this.layer = builder.layer;
            this.matchDetail = builder.matchDetail;
            this.matchList = builder.matchList;
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
         * @return fullVersion
         */
        public String getFullVersion() {
            return this.fullVersion;
        }

        /**
         * @return layer
         */
        public String getLayer() {
            return this.layer;
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
            private String fullVersion; 
            private String layer; 
            private String matchDetail; 
            private java.util.List<String> matchList; 
            private String name; 
            private String path; 
            private String updateCmd; 
            private String version; 

            private Builder() {
            } 

            private Builder(RpmEntityList model) {
                this.fullVersion = model.fullVersion;
                this.layer = model.layer;
                this.matchDetail = model.matchDetail;
                this.matchList = model.matchList;
                this.name = model.name;
                this.path = model.path;
                this.updateCmd = model.updateCmd;
                this.version = model.version;
            } 

            /**
             * <p>The complete version number of the software package.</p>
             * 
             * <strong>example:</strong>
             * <p>3.10.0-693.2.2.el7</p>
             */
            public Builder fullVersion(String fullVersion) {
                this.fullVersion = fullVersion;
                return this;
            }

            /**
             * <p>The SHA-256 value of the digest of the image layer.</p>
             * 
             * <strong>example:</strong>
             * <p>b1f5b9420803ad0657cf21566e3e20acc08581e7f22991249ef3aa80b8b1****</p>
             */
            public Builder layer(String layer) {
                this.layer = layer;
                return this;
            }

            /**
             * <p>The information about the detected vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>python-perf version less than 0:3.10.0-693.21.1.el7</p>
             */
            public Builder matchDetail(String matchDetail) {
                this.matchDetail = matchDetail;
                return this;
            }

            /**
             * <p>The rule that is used to detect the vulnerability.</p>
             */
            public Builder matchList(java.util.List<String> matchList) {
                this.matchList = matchList;
                return this;
            }

            /**
             * <p>The name of the software package.</p>
             * 
             * <strong>example:</strong>
             * <p>python-perf</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The path of the software that has the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/lib64/python2.7/site-packages</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The command that is used to fix the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>apt-get update &amp;&amp; apt-get install libseccomp2  --only-upgrade</p>
             */
            public Builder updateCmd(String updateCmd) {
                this.updateCmd = updateCmd;
                return this;
            }

            /**
             * <p>The version number of the software package.</p>
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
     * {@link DescribeCanFixVulListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCanFixVulListResponseBody</p>
     */
    public static class ExtendContentJson extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("OsRelease")
        private String osRelease;

        @com.aliyun.core.annotation.NameInMap("RpmEntityList")
        private java.util.List<RpmEntityList> rpmEntityList;

        private ExtendContentJson(Builder builder) {
            this.os = builder.os;
            this.osRelease = builder.osRelease;
            this.rpmEntityList = builder.rpmEntityList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendContentJson create() {
            return builder().build();
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
         * @return rpmEntityList
         */
        public java.util.List<RpmEntityList> getRpmEntityList() {
            return this.rpmEntityList;
        }

        public static final class Builder {
            private String os; 
            private String osRelease; 
            private java.util.List<RpmEntityList> rpmEntityList; 

            private Builder() {
            } 

            private Builder(ExtendContentJson model) {
                this.os = model.os;
                this.osRelease = model.osRelease;
                this.rpmEntityList = model.rpmEntityList;
            } 

            /**
             * <p>The name of the operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>debian</p>
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * <p>The version of the operating system in the image.</p>
             * 
             * <strong>example:</strong>
             * <p>10.9</p>
             */
            public Builder osRelease(String osRelease) {
                this.osRelease = osRelease;
                return this;
            }

            /**
             * <p>The RPM packages.</p>
             */
            public Builder rpmEntityList(java.util.List<RpmEntityList> rpmEntityList) {
                this.rpmEntityList = rpmEntityList;
                return this;
            }

            public ExtendContentJson build() {
                return new ExtendContentJson(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCanFixVulListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCanFixVulListResponseBody</p>
     */
    public static class VulRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("CanFix")
        private String canFix;

        @com.aliyun.core.annotation.NameInMap("CanUpdate")
        private Boolean canUpdate;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ContainerId")
        private String containerId;

        @com.aliyun.core.annotation.NameInMap("ExtendContentJson")
        private ExtendContentJson extendContentJson;

        @com.aliyun.core.annotation.NameInMap("FirstTs")
        private Long firstTs;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("ImageDigest")
        private String imageDigest;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("LastTs")
        private Long lastTs;

        @com.aliyun.core.annotation.NameInMap("Layers")
        private java.util.List<String> layers;

        @com.aliyun.core.annotation.NameInMap("MaliciousSource")
        private String maliciousSource;

        @com.aliyun.core.annotation.NameInMap("ModifyTs")
        private Long modifyTs;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Necessity")
        private String necessity;

        @com.aliyun.core.annotation.NameInMap("Pod")
        private String pod;

        @com.aliyun.core.annotation.NameInMap("PrimaryId")
        private Long primaryId;

        @com.aliyun.core.annotation.NameInMap("Related")
        private String related;

        @com.aliyun.core.annotation.NameInMap("RepoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("RepoNamespace")
        private String repoNamespace;

        @com.aliyun.core.annotation.NameInMap("ScanTime")
        private Long scanTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("TargetName")
        private String targetName;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private VulRecords(Builder builder) {
            this.aliasName = builder.aliasName;
            this.canFix = builder.canFix;
            this.canUpdate = builder.canUpdate;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.containerId = builder.containerId;
            this.extendContentJson = builder.extendContentJson;
            this.firstTs = builder.firstTs;
            this.image = builder.image;
            this.imageDigest = builder.imageDigest;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.lastTs = builder.lastTs;
            this.layers = builder.layers;
            this.maliciousSource = builder.maliciousSource;
            this.modifyTs = builder.modifyTs;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.necessity = builder.necessity;
            this.pod = builder.pod;
            this.primaryId = builder.primaryId;
            this.related = builder.related;
            this.repoName = builder.repoName;
            this.repoNamespace = builder.repoNamespace;
            this.scanTime = builder.scanTime;
            this.status = builder.status;
            this.tag = builder.tag;
            this.targetId = builder.targetId;
            this.targetName = builder.targetName;
            this.targetType = builder.targetType;
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
         * @return canUpdate
         */
        public Boolean getCanUpdate() {
            return this.canUpdate;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return containerId
         */
        public String getContainerId() {
            return this.containerId;
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
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return imageDigest
         */
        public String getImageDigest() {
            return this.imageDigest;
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
         * @return layers
         */
        public java.util.List<String> getLayers() {
            return this.layers;
        }

        /**
         * @return maliciousSource
         */
        public String getMaliciousSource() {
            return this.maliciousSource;
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
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return necessity
         */
        public String getNecessity() {
            return this.necessity;
        }

        /**
         * @return pod
         */
        public String getPod() {
            return this.pod;
        }

        /**
         * @return primaryId
         */
        public Long getPrimaryId() {
            return this.primaryId;
        }

        /**
         * @return related
         */
        public String getRelated() {
            return this.related;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return repoNamespace
         */
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        /**
         * @return scanTime
         */
        public Long getScanTime() {
            return this.scanTime;
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
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetName
         */
        public String getTargetName() {
            return this.targetName;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
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
            private Boolean canUpdate; 
            private String clusterId; 
            private String clusterName; 
            private String containerId; 
            private ExtendContentJson extendContentJson; 
            private Long firstTs; 
            private String image; 
            private String imageDigest; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private Long lastTs; 
            private java.util.List<String> layers; 
            private String maliciousSource; 
            private Long modifyTs; 
            private String name; 
            private String namespace; 
            private String necessity; 
            private String pod; 
            private Long primaryId; 
            private String related; 
            private String repoName; 
            private String repoNamespace; 
            private Long scanTime; 
            private Integer status; 
            private String tag; 
            private String targetId; 
            private String targetName; 
            private String targetType; 
            private String type; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(VulRecords model) {
                this.aliasName = model.aliasName;
                this.canFix = model.canFix;
                this.canUpdate = model.canUpdate;
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.containerId = model.containerId;
                this.extendContentJson = model.extendContentJson;
                this.firstTs = model.firstTs;
                this.image = model.image;
                this.imageDigest = model.imageDigest;
                this.instanceName = model.instanceName;
                this.internetIp = model.internetIp;
                this.intranetIp = model.intranetIp;
                this.lastTs = model.lastTs;
                this.layers = model.layers;
                this.maliciousSource = model.maliciousSource;
                this.modifyTs = model.modifyTs;
                this.name = model.name;
                this.namespace = model.namespace;
                this.necessity = model.necessity;
                this.pod = model.pod;
                this.primaryId = model.primaryId;
                this.related = model.related;
                this.repoName = model.repoName;
                this.repoNamespace = model.repoNamespace;
                this.scanTime = model.scanTime;
                this.status = model.status;
                this.tag = model.tag;
                this.targetId = model.targetId;
                this.targetName = model.targetName;
                this.targetType = model.targetType;
                this.type = model.type;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The alias of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>CVE-2018-25010:libwebp up to 1.0.0 ApplyFilter out-of-bounds read</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>Indicates whether the vulnerability can be fixed in the Security Center console. Valid values:</p>
             * <ul>
             * <li><strong>yes</strong></li>
             * <li><strong>no</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>yes</p>
             */
            public Builder canFix(String canFix) {
                this.canFix = canFix;
                return this;
            }

            /**
             * <p>Indicates whether the packages of the software that has the vulnerability can be upgraded by using Security Center. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canUpdate(Boolean canUpdate) {
                this.canUpdate = canUpdate;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c08d5fc1a329a4b88950a253d082f1****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>docker-law</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The container ID.</p>
             * 
             * <strong>example:</strong>
             * <p>04d20e98c8e2c93b7b864372084320a15a58c8671e53c972ce3a71d9c163****</p>
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
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
             * <p>The timestamp generated when the vulnerability was first detected. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1620752053000</p>
             */
            public Builder firstTs(Long firstTs) {
                this.firstTs = firstTs;
                return this;
            }

            /**
             * <p>The name of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>registry.cn-wulanchabu.aliyuncs.com/sas_test/huxin-test-001:nuxeo6-conta****</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The unique identifier of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>8f0fbdb41d3d1ade4ffdf21558443f4c03342010563bb8c43ccc09594d50****</p>
             */
            public Builder imageDigest(String imageDigest) {
                this.imageDigest = imageDigest;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * <p>The name must be 3 to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
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
             * <p>172.19.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The timestamp generated when the vulnerability was last detected. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1620404763000</p>
             */
            public Builder lastTs(Long lastTs) {
                this.lastTs = lastTs;
                return this;
            }

            /**
             * <p>The image layers.</p>
             */
            public Builder layers(java.util.List<String> layers) {
                this.layers = layers;
                return this;
            }

            /**
             * <p>The source of the malicious file. Valid values:</p>
             * <ul>
             * <li><strong>agentless</strong></li>
             * <li><strong>image</strong></li>
             * <li><strong>container</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>agentless</p>
             */
            public Builder maliciousSource(String maliciousSource) {
                this.maliciousSource = maliciousSource;
                return this;
            }

            /**
             * <p>The timestamp generated when the vulnerability status was modified. Unit: milliseconds.</p>
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
             * <p>debian:10:CVE-2019-9893</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>test-002</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The priority to fix the vulnerability. Valid values:</p>
             * <ul>
             * <li><strong>asap</strong>: high</li>
             * <li><strong>later</strong>: medium</li>
             * <li><strong>nntf</strong>: low</li>
             * </ul>
             * <blockquote>
             * <p> We recommend that you fix high-level vulnerabilities as soon as possible.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>asap,later,nntf</p>
             */
            public Builder necessity(String necessity) {
                this.necessity = necessity;
                return this;
            }

            /**
             * <p>The name of the container group.</p>
             * 
             * <strong>example:</strong>
             * <p>22222-7xsqq</p>
             */
            public Builder pod(String pod) {
                this.pod = pod;
                return this;
            }

            /**
             * <p>The vulnerability ID.</p>
             * 
             * <strong>example:</strong>
             * <p>782661</p>
             */
            public Builder primaryId(Long primaryId) {
                this.primaryId = primaryId;
                return this;
            }

            /**
             * <p>The CVE IDs related to the vulnerability. Multiple CVE IDs are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>CVE-2017-7518,CVE-2017-12188</p>
             */
            public Builder related(String related) {
                this.related = related;
                return this;
            }

            /**
             * <p>The name of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>varnish</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The namespace to which the image repository belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>3rdparty</p>
             */
            public Builder repoNamespace(String repoNamespace) {
                this.repoNamespace = repoNamespace;
                return this;
            }

            /**
             * <p>The timestamp generated when the scan task was performed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649814050000</p>
             */
            public Builder scanTime(Long scanTime) {
                this.scanTime = scanTime;
                return this;
            }

            /**
             * <p>The status of the vulnerability. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The vulnerability is unfixed.</li>
             * <li><strong>4</strong>: The vulnerability is being fixed.</li>
             * <li><strong>7</strong>: The vulnerability is fixed.</li>
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
             * <p>The tag that is added to the image.</p>
             * 
             * <strong>example:</strong>
             * <p>latest</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The ID of the asset that is scanned.</p>
             * 
             * <strong>example:</strong>
             * <p>300269</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The name of the asset that is scanned.</p>
             * 
             * <strong>example:</strong>
             * <p>source-test-obj-XM0Ma</p>
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * <p>The type of the asset that is scanned. Valid values:</p>
             * <ul>
             * <li><strong>IMAGE</strong></li>
             * <li><strong>ECS_IMAGE</strong></li>
             * <li><strong>ECS_SNAPSHOT</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECS_IMAGE</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The type of the vulnerability. Valid values:</p>
             * <ul>
             * <li><strong>cve</strong>: system vulnerability</li>
             * <li><strong>sca</strong>: application vulnerability</li>
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
             * <p>The UUID of the container image.</p>
             * 
             * <strong>example:</strong>
             * <p>0004a32a0305a7f6ab5ff9600d47****</p>
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
