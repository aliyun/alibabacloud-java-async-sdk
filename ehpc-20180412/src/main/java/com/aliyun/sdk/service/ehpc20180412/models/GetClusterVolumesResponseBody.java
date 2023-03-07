// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterVolumesResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterVolumesResponseBody</p>
 */
public class GetClusterVolumesResponseBody extends TeaModel {
    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Volumes")
    private Volumes volumes;

    private GetClusterVolumesResponseBody(Builder builder) {
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.volumes = builder.volumes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterVolumesResponseBody create() {
        return builder().build();
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return volumes
     */
    public Volumes getVolumes() {
        return this.volumes;
    }

    public static final class Builder {
        private String regionId; 
        private String requestId; 
        private Volumes volumes; 

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * The array of the file system mounted to the E-HPC cluster.
         */
        public Builder volumes(Volumes volumes) {
            this.volumes = volumes;
            return this;
        }

        public GetClusterVolumesResponseBody build() {
            return new GetClusterVolumesResponseBody(this);
        } 

    } 

    public static class RoleInfo extends TeaModel {
        @NameInMap("Name")
        private String name;

        private RoleInfo(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleInfo create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            /**
             * The type of the node on which the file system is mounted. Valid values:
             * <p>
             * 
             * *   Compute: compute node
             * *   Manager: management node
             * *   Login: logon node
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public RoleInfo build() {
                return new RoleInfo(this);
            } 

        } 

    }
    public static class Roles extends TeaModel {
        @NameInMap("RoleInfo")
        private java.util.List < RoleInfo> roleInfo;

        private Roles(Builder builder) {
            this.roleInfo = builder.roleInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Roles create() {
            return builder().build();
        }

        /**
         * @return roleInfo
         */
        public java.util.List < RoleInfo> getRoleInfo() {
            return this.roleInfo;
        }

        public static final class Builder {
            private java.util.List < RoleInfo> roleInfo; 

            /**
             * RoleInfo.
             */
            public Builder roleInfo(java.util.List < RoleInfo> roleInfo) {
                this.roleInfo = roleInfo;
                return this;
            }

            public Roles build() {
                return new Roles(this);
            } 

        } 

    }
    public static class VolumeInfo extends TeaModel {
        @NameInMap("JobQueue")
        private String jobQueue;

        @NameInMap("LocalDirectory")
        private String localDirectory;

        @NameInMap("Location")
        private String location;

        @NameInMap("MustKeep")
        private Boolean mustKeep;

        @NameInMap("RemoteDirectory")
        private String remoteDirectory;

        @NameInMap("Roles")
        private Roles roles;

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
            this.mustKeep = builder.mustKeep;
            this.remoteDirectory = builder.remoteDirectory;
            this.roles = builder.roles;
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
         * @return mustKeep
         */
        public Boolean getMustKeep() {
            return this.mustKeep;
        }

        /**
         * @return remoteDirectory
         */
        public String getRemoteDirectory() {
            return this.remoteDirectory;
        }

        /**
         * @return roles
         */
        public Roles getRoles() {
            return this.roles;
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
            private Boolean mustKeep; 
            private String remoteDirectory; 
            private Roles roles; 
            private String volumeId; 
            private String volumeMountpoint; 
            private String volumeProtocol; 
            private String volumeType; 

            /**
             * The queue of the job.
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
             * The type of cluster. Valid values:
             * <p>
             * 
             * *   OnPremise: The cluster is deployed on a hybrid cloud.
             * *   PublicCloud: The cluster is deployed on a public cloud.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * Indicates whether the resource can be unmounted.
             */
            public Builder mustKeep(Boolean mustKeep) {
                this.mustKeep = mustKeep;
                return this;
            }

            /**
             * The remote mount directory.
             */
            public Builder remoteDirectory(String remoteDirectory) {
                this.remoteDirectory = remoteDirectory;
                return this;
            }

            /**
             * The array of the node on which the file system is mounted.
             */
            public Builder roles(Roles roles) {
                this.roles = roles;
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
             * The address of the mount target.
             */
            public Builder volumeMountpoint(String volumeMountpoint) {
                this.volumeMountpoint = volumeMountpoint;
                return this;
            }

            /**
             * The storage protocol type of the file system. Valid values:
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
             * The type of the file system. Valid values:
             * <p>
             * 
             * *   NAS
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
    public static class Volumes extends TeaModel {
        @NameInMap("VolumeInfo")
        private java.util.List < VolumeInfo> volumeInfo;

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

            public Volumes build() {
                return new Volumes(this);
            } 

        } 

    }
}
