// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVolumesResponseBody} extends {@link TeaModel}
 *
 * <p>ListVolumesResponseBody</p>
 */
public class ListVolumesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("Volumes")
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

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * The request ID.
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
         * The information of file systems that are mounted on E-HPC clusters.
         */
        public Builder volumes(Volumes volumes) {
            this.volumes = volumes;
            return this;
        }

        public ListVolumesResponseBody build() {
            return new ListVolumesResponseBody(this);
        } 

    } 

    public static class VolumeInfo extends TeaModel {
        @NameInMap("JobQueue")
        private String jobQueue;

        @NameInMap("LocalDirectory")
        private String localDirectory;

        @NameInMap("Location")
        private String location;

        @NameInMap("RemoteDirectory")
        private String remoteDirectory;

        @NameInMap("Role")
        private String role;

        @NameInMap("VolumeId")
        private String volumeId;

        @NameInMap("VolumeMountpoint")
        private String volumeMountpoint;

        @NameInMap("VolumeProtocol")
        private String volumeProtocol;

        @NameInMap("VolumeType")
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

            /**
             * The queue to which the job belongs.
             */
            public Builder jobQueue(String jobQueue) {
                this.jobQueue = jobQueue;
                return this;
            }

            /**
             * The local mount directory.
             */
            public Builder localDirectory(String localDirectory) {
                this.localDirectory = localDirectory;
                return this;
            }

            /**
             * The location where the cluster is deployed. Valid values:
             * <p>
             * 
             * *   OnPremise: The node is deployed on a hybrid cloud.
             * *   PublicCloud: The cluster is deployed on a public cloud.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The remote directory on which the file system is mounted.
             */
            public Builder remoteDirectory(String remoteDirectory) {
                this.remoteDirectory = remoteDirectory;
                return this;
            }

            /**
             * The type of the node on which the file system is mounted. Valid values:
             * <p>
             * 
             * *   Manager: management node
             * *   Login: logon node
             * *   Compute: compute node
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * The ID of the file system.
             */
            public Builder volumeId(String volumeId) {
                this.volumeId = volumeId;
                return this;
            }

            /**
             * The domain name of the mount target.
             */
            public Builder volumeMountpoint(String volumeMountpoint) {
                this.volumeMountpoint = volumeMountpoint;
                return this;
            }

            /**
             * The type of the storage protocol. Valid values:
             * <p>
             * 
             * *   NFS
             * *   SMB
             */
            public Builder volumeProtocol(String volumeProtocol) {
                this.volumeProtocol = volumeProtocol;
                return this;
            }

            /**
             * The type of the additional file system. Only NAS is supported.
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
    public static class AdditionalVolumes extends TeaModel {
        @NameInMap("VolumeInfo")
        private java.util.List < VolumeInfo> volumeInfo;

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
        public java.util.List < VolumeInfo> getVolumeInfo() {
            return this.volumeInfo;
        }

        public static final class Builder {
            private java.util.List < VolumeInfo> volumeInfo; 

            /**
             * VolumeInfo.
             */
            public Builder volumeInfo(java.util.List < VolumeInfo> volumeInfo) {
                this.volumeInfo = volumeInfo;
                return this;
            }

            public AdditionalVolumes build() {
                return new AdditionalVolumes(this);
            } 

        } 

    }
    public static class VolumesVolumeInfo extends TeaModel {
        @NameInMap("AdditionalVolumes")
        private AdditionalVolumes additionalVolumes;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RemoteDirectory")
        private String remoteDirectory;

        @NameInMap("VolumeId")
        private String volumeId;

        @NameInMap("VolumeMountpoint")
        private String volumeMountpoint;

        @NameInMap("VolumeProtocol")
        private String volumeProtocol;

        @NameInMap("VolumeType")
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

            /**
             * The information of additional file systems mounted on E-HPC clusters.
             */
            public Builder additionalVolumes(AdditionalVolumes additionalVolumes) {
                this.additionalVolumes = additionalVolumes;
                return this;
            }

            /**
             * The cluster ID.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The instance name.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The remote directory on which the file system is mounted.
             */
            public Builder remoteDirectory(String remoteDirectory) {
                this.remoteDirectory = remoteDirectory;
                return this;
            }

            /**
             * The ID of the file system.
             */
            public Builder volumeId(String volumeId) {
                this.volumeId = volumeId;
                return this;
            }

            /**
             * The domain name of the mount target.
             */
            public Builder volumeMountpoint(String volumeMountpoint) {
                this.volumeMountpoint = volumeMountpoint;
                return this;
            }

            /**
             * The type of the storage protocol. Valid values:
             * <p>
             * 
             * *   NFS
             * *   SMB
             */
            public Builder volumeProtocol(String volumeProtocol) {
                this.volumeProtocol = volumeProtocol;
                return this;
            }

            /**
             * The type of the file system that is mounted on the cluster. Only NAS is supported.
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
    public static class Volumes extends TeaModel {
        @NameInMap("VolumeInfo")
        private java.util.List < VolumesVolumeInfo> volumeInfo;

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
        public java.util.List < VolumesVolumeInfo> getVolumeInfo() {
            return this.volumeInfo;
        }

        public static final class Builder {
            private java.util.List < VolumesVolumeInfo> volumeInfo; 

            /**
             * VolumeInfo.
             */
            public Builder volumeInfo(java.util.List < VolumesVolumeInfo> volumeInfo) {
                this.volumeInfo = volumeInfo;
                return this;
            }

            public Volumes build() {
                return new Volumes(this);
            } 

        } 

    }
}
