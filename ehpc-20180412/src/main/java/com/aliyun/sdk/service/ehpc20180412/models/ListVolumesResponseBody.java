// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ListVolumesResponseBody} extends {@link TeaModel}
 *
 * <p>ListVolumesResponseBody</p>
 */
public class ListVolumesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("Volumes")
    private Volumes volumes;

    private ListVolumesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.volumes = builder.volumes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVolumesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return volumes
     */
    public Volumes getVolumes() {
        return this.volumes;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Volumes volumes; 

        private Builder() {
        } 

        private Builder(ListVolumesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.volumes = model.volumes;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The information of file systems that are mounted on E-HPC clusters.</p>
         */
        public Builder volumes(Volumes volumes) {
            this.volumes = volumes;
            return this;
        }

        public ListVolumesResponseBody build() {
            return new ListVolumesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVolumesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVolumesResponseBody</p>
     */
    public static class VolumeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobQueue")
        private String jobQueue;

        @com.aliyun.core.annotation.NameInMap("LocalDirectory")
        private String localDirectory;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("RemoteDirectory")
        private String remoteDirectory;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("VolumeId")
        private String volumeId;

        @com.aliyun.core.annotation.NameInMap("VolumeMountpoint")
        private String volumeMountpoint;

        @com.aliyun.core.annotation.NameInMap("VolumeProtocol")
        private String volumeProtocol;

        @com.aliyun.core.annotation.NameInMap("VolumeType")
        private String volumeType;

        private VolumeInfo(Builder builder) {
            this.jobQueue = builder.jobQueue;
            this.localDirectory = builder.localDirectory;
            this.location = builder.location;
            this.remoteDirectory = builder.remoteDirectory;
            this.role = builder.role;
            this.volumeId = builder.volumeId;
            this.volumeMountpoint = builder.volumeMountpoint;
            this.volumeProtocol = builder.volumeProtocol;
            this.volumeType = builder.volumeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VolumeInfo create() {
            return builder().build();
        }

        /**
         * @return jobQueue
         */
        public String getJobQueue() {
            return this.jobQueue;
        }

        /**
         * @return localDirectory
         */
        public String getLocalDirectory() {
            return this.localDirectory;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return remoteDirectory
         */
        public String getRemoteDirectory() {
            return this.remoteDirectory;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return volumeId
         */
        public String getVolumeId() {
            return this.volumeId;
        }

        /**
         * @return volumeMountpoint
         */
        public String getVolumeMountpoint() {
            return this.volumeMountpoint;
        }

        /**
         * @return volumeProtocol
         */
        public String getVolumeProtocol() {
            return this.volumeProtocol;
        }

        /**
         * @return volumeType
         */
        public String getVolumeType() {
            return this.volumeType;
        }

        public static final class Builder {
            private String jobQueue; 
            private String localDirectory; 
            private String location; 
            private String remoteDirectory; 
            private String role; 
            private String volumeId; 
            private String volumeMountpoint; 
            private String volumeProtocol; 
            private String volumeType; 

            private Builder() {
            } 

            private Builder(VolumeInfo model) {
                this.jobQueue = model.jobQueue;
                this.localDirectory = model.localDirectory;
                this.location = model.location;
                this.remoteDirectory = model.remoteDirectory;
                this.role = model.role;
                this.volumeId = model.volumeId;
                this.volumeMountpoint = model.volumeMountpoint;
                this.volumeProtocol = model.volumeProtocol;
                this.volumeType = model.volumeType;
            } 

            /**
             * <p>The queue to which the job belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>all.q</p>
             */
            public Builder jobQueue(String jobQueue) {
                this.jobQueue = jobQueue;
                return this;
            }

            /**
             * <p>The local mount directory.</p>
             * 
             * <strong>example:</strong>
             * <p>/testopt</p>
             */
            public Builder localDirectory(String localDirectory) {
                this.localDirectory = localDirectory;
                return this;
            }

            /**
             * <p>The location where the cluster is deployed. Valid values:</p>
             * <ul>
             * <li>OnPremise: The node is deployed on a hybrid cloud.</li>
             * <li>PublicCloud: The cluster is deployed on a public cloud.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PublicCloud</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The remote directory on which the file system is mounted.</p>
             * 
             * <strong>example:</strong>
             * <p>/test</p>
             */
            public Builder remoteDirectory(String remoteDirectory) {
                this.remoteDirectory = remoteDirectory;
                return this;
            }

            /**
             * <p>The type of the node on which the file system is mounted. Valid values:</p>
             * <ul>
             * <li>Manager: management node</li>
             * <li>Login: logon node</li>
             * <li>Compute: compute node</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Compute</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The ID of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>86y3****</p>
             */
            public Builder volumeId(String volumeId) {
                this.volumeId = volumeId;
                return this;
            }

            /**
             * <p>The domain name of the mount target.</p>
             * 
             * <strong>example:</strong>
             * <p>86y3****-rgd51.cn-hangzhou.nas.aliyuncs.com</p>
             */
            public Builder volumeMountpoint(String volumeMountpoint) {
                this.volumeMountpoint = volumeMountpoint;
                return this;
            }

            /**
             * <p>The type of the storage protocol. Valid values:</p>
             * <ul>
             * <li>NFS</li>
             * <li>SMB</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NFS</p>
             */
            public Builder volumeProtocol(String volumeProtocol) {
                this.volumeProtocol = volumeProtocol;
                return this;
            }

            /**
             * <p>The type of the additional file system. Only NAS is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>NAS</p>
             */
            public Builder volumeType(String volumeType) {
                this.volumeType = volumeType;
                return this;
            }

            public VolumeInfo build() {
                return new VolumeInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVolumesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVolumesResponseBody</p>
     */
    public static class AdditionalVolumes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VolumeInfo")
        private java.util.List<VolumeInfo> volumeInfo;

        private AdditionalVolumes(Builder builder) {
            this.volumeInfo = builder.volumeInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdditionalVolumes create() {
            return builder().build();
        }

        /**
         * @return volumeInfo
         */
        public java.util.List<VolumeInfo> getVolumeInfo() {
            return this.volumeInfo;
        }

        public static final class Builder {
            private java.util.List<VolumeInfo> volumeInfo; 

            private Builder() {
            } 

            private Builder(AdditionalVolumes model) {
                this.volumeInfo = model.volumeInfo;
            } 

            /**
             * VolumeInfo.
             */
            public Builder volumeInfo(java.util.List<VolumeInfo> volumeInfo) {
                this.volumeInfo = volumeInfo;
                return this;
            }

            public AdditionalVolumes build() {
                return new AdditionalVolumes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVolumesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVolumesResponseBody</p>
     */
    public static class VolumesVolumeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdditionalVolumes")
        private AdditionalVolumes additionalVolumes;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RemoteDirectory")
        private String remoteDirectory;

        @com.aliyun.core.annotation.NameInMap("VolumeId")
        private String volumeId;

        @com.aliyun.core.annotation.NameInMap("VolumeMountpoint")
        private String volumeMountpoint;

        @com.aliyun.core.annotation.NameInMap("VolumeProtocol")
        private String volumeProtocol;

        @com.aliyun.core.annotation.NameInMap("VolumeType")
        private String volumeType;

        private VolumesVolumeInfo(Builder builder) {
            this.additionalVolumes = builder.additionalVolumes;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.regionId = builder.regionId;
            this.remoteDirectory = builder.remoteDirectory;
            this.volumeId = builder.volumeId;
            this.volumeMountpoint = builder.volumeMountpoint;
            this.volumeProtocol = builder.volumeProtocol;
            this.volumeType = builder.volumeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VolumesVolumeInfo create() {
            return builder().build();
        }

        /**
         * @return additionalVolumes
         */
        public AdditionalVolumes getAdditionalVolumes() {
            return this.additionalVolumes;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return remoteDirectory
         */
        public String getRemoteDirectory() {
            return this.remoteDirectory;
        }

        /**
         * @return volumeId
         */
        public String getVolumeId() {
            return this.volumeId;
        }

        /**
         * @return volumeMountpoint
         */
        public String getVolumeMountpoint() {
            return this.volumeMountpoint;
        }

        /**
         * @return volumeProtocol
         */
        public String getVolumeProtocol() {
            return this.volumeProtocol;
        }

        /**
         * @return volumeType
         */
        public String getVolumeType() {
            return this.volumeType;
        }

        public static final class Builder {
            private AdditionalVolumes additionalVolumes; 
            private String clusterId; 
            private String clusterName; 
            private String regionId; 
            private String remoteDirectory; 
            private String volumeId; 
            private String volumeMountpoint; 
            private String volumeProtocol; 
            private String volumeType; 

            private Builder() {
            } 

            private Builder(VolumesVolumeInfo model) {
                this.additionalVolumes = model.additionalVolumes;
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.regionId = model.regionId;
                this.remoteDirectory = model.remoteDirectory;
                this.volumeId = model.volumeId;
                this.volumeMountpoint = model.volumeMountpoint;
                this.volumeProtocol = model.volumeProtocol;
                this.volumeType = model.volumeType;
            } 

            /**
             * <p>The information of additional file systems mounted on E-HPC clusters.</p>
             */
            public Builder additionalVolumes(AdditionalVolumes additionalVolumes) {
                this.additionalVolumes = additionalVolumes;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ehpc-hz-FYUr32****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster1</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The remote directory on which the file system is mounted.</p>
             * 
             * <strong>example:</strong>
             * <p>/test1</p>
             */
            public Builder remoteDirectory(String remoteDirectory) {
                this.remoteDirectory = remoteDirectory;
                return this;
            }

            /**
             * <p>The ID of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>bc8a****</p>
             */
            public Builder volumeId(String volumeId) {
                this.volumeId = volumeId;
                return this;
            }

            /**
             * <p>The domain name of the mount target.</p>
             * 
             * <strong>example:</strong>
             * <p>bc8a****-rgd51.cn-hangzhou.nas.aliyuncs.com</p>
             */
            public Builder volumeMountpoint(String volumeMountpoint) {
                this.volumeMountpoint = volumeMountpoint;
                return this;
            }

            /**
             * <p>The type of the storage protocol. Valid values:</p>
             * <ul>
             * <li>NFS</li>
             * <li>SMB</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NFS</p>
             */
            public Builder volumeProtocol(String volumeProtocol) {
                this.volumeProtocol = volumeProtocol;
                return this;
            }

            /**
             * <p>The type of the file system that is mounted on the cluster. Only NAS is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>NAS</p>
             */
            public Builder volumeType(String volumeType) {
                this.volumeType = volumeType;
                return this;
            }

            public VolumesVolumeInfo build() {
                return new VolumesVolumeInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVolumesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVolumesResponseBody</p>
     */
    public static class Volumes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VolumeInfo")
        private java.util.List<VolumesVolumeInfo> volumeInfo;

        private Volumes(Builder builder) {
            this.volumeInfo = builder.volumeInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Volumes create() {
            return builder().build();
        }

        /**
         * @return volumeInfo
         */
        public java.util.List<VolumesVolumeInfo> getVolumeInfo() {
            return this.volumeInfo;
        }

        public static final class Builder {
            private java.util.List<VolumesVolumeInfo> volumeInfo; 

            private Builder() {
            } 

            private Builder(Volumes model) {
                this.volumeInfo = model.volumeInfo;
            } 

            /**
             * VolumeInfo.
             */
            public Builder volumeInfo(java.util.List<VolumesVolumeInfo> volumeInfo) {
                this.volumeInfo = volumeInfo;
                return this;
            }

            public Volumes build() {
                return new Volumes(this);
            } 

        } 

    }
}
