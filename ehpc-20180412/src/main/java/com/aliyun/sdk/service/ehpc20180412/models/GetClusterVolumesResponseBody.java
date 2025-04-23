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
 * {@link GetClusterVolumesResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterVolumesResponseBody</p>
 */
public class GetClusterVolumesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Volumes")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetClusterVolumesResponseBody model) {
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.volumes = model.volumes;
        } 

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8BCFD52E-0336-4490-AE7D-F560F106****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The array of the file system mounted to the E-HPC cluster.</p>
         */
        public Builder volumes(Volumes volumes) {
            this.volumes = volumes;
            return this;
        }

        public GetClusterVolumesResponseBody build() {
            return new GetClusterVolumesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetClusterVolumesResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterVolumesResponseBody</p>
     */
    public static class RoleInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
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

            private Builder() {
            } 

            private Builder(RoleInfo model) {
                this.name = model.name;
            } 

            /**
             * <p>The type of the node on which the file system is mounted. Valid values:</p>
             * <ul>
             * <li>Compute: compute node</li>
             * <li>Manager: management node</li>
             * <li>Login: logon node</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Compute</p>
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
    /**
     * 
     * {@link GetClusterVolumesResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterVolumesResponseBody</p>
     */
    public static class Roles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RoleInfo")
        private java.util.List<RoleInfo> roleInfo;

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
        public java.util.List<RoleInfo> getRoleInfo() {
            return this.roleInfo;
        }

        public static final class Builder {
            private java.util.List<RoleInfo> roleInfo; 

            private Builder() {
            } 

            private Builder(Roles model) {
                this.roleInfo = model.roleInfo;
            } 

            /**
             * RoleInfo.
             */
            public Builder roleInfo(java.util.List<RoleInfo> roleInfo) {
                this.roleInfo = roleInfo;
                return this;
            }

            public Roles build() {
                return new Roles(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetClusterVolumesResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterVolumesResponseBody</p>
     */
    public static class VolumeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobQueue")
        private String jobQueue;

        @com.aliyun.core.annotation.NameInMap("LocalDirectory")
        private String localDirectory;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("MustKeep")
        private Boolean mustKeep;

        @com.aliyun.core.annotation.NameInMap("RemoteDirectory")
        private String remoteDirectory;

        @com.aliyun.core.annotation.NameInMap("Roles")
        private Roles roles;

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

            private Builder() {
            } 

            private Builder(VolumeInfo model) {
                this.jobQueue = model.jobQueue;
                this.localDirectory = model.localDirectory;
                this.location = model.location;
                this.mustKeep = model.mustKeep;
                this.remoteDirectory = model.remoteDirectory;
                this.roles = model.roles;
                this.volumeId = model.volumeId;
                this.volumeMountpoint = model.volumeMountpoint;
                this.volumeProtocol = model.volumeProtocol;
                this.volumeType = model.volumeType;
            } 

            /**
             * <p>The queue of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>workq</p>
             */
            public Builder jobQueue(String jobQueue) {
                this.jobQueue = jobQueue;
                return this;
            }

            /**
             * <p>The local mount directory.</p>
             * 
             * <strong>example:</strong>
             * <p>/ehpcdata</p>
             */
            public Builder localDirectory(String localDirectory) {
                this.localDirectory = localDirectory;
                return this;
            }

            /**
             * <p>The type of cluster. Valid values:</p>
             * <ul>
             * <li>OnPremise: The cluster is deployed on a hybrid cloud.</li>
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
             * <p>Indicates whether the resource can be unmounted.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder mustKeep(Boolean mustKeep) {
                this.mustKeep = mustKeep;
                return this;
            }

            /**
             * <p>The remote mount directory.</p>
             * 
             * <strong>example:</strong>
             * <p>/test</p>
             */
            public Builder remoteDirectory(String remoteDirectory) {
                this.remoteDirectory = remoteDirectory;
                return this;
            }

            /**
             * <p>The array of the node on which the file system is mounted.</p>
             */
            public Builder roles(Roles roles) {
                this.roles = roles;
                return this;
            }

            /**
             * <p>The ID of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>0e754****</p>
             */
            public Builder volumeId(String volumeId) {
                this.volumeId = volumeId;
                return this;
            }

            /**
             * <p>The address of the mount target.</p>
             * 
             * <strong>example:</strong>
             * <p>0e754****-kal90.cn-hangzhou.nas.aliyuncs.com</p>
             */
            public Builder volumeMountpoint(String volumeMountpoint) {
                this.volumeMountpoint = volumeMountpoint;
                return this;
            }

            /**
             * <p>The storage protocol type of the file system. Valid values:</p>
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
             * <p>The type of the file system. Valid values:</p>
             * <ul>
             * <li>NAS</li>
             * </ul>
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
     * {@link GetClusterVolumesResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterVolumesResponseBody</p>
     */
    public static class Volumes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VolumeInfo")
        private java.util.List<VolumeInfo> volumeInfo;

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
        public java.util.List<VolumeInfo> getVolumeInfo() {
            return this.volumeInfo;
        }

        public static final class Builder {
            private java.util.List<VolumeInfo> volumeInfo; 

            private Builder() {
            } 

            private Builder(Volumes model) {
                this.volumeInfo = model.volumeInfo;
            } 

            /**
             * VolumeInfo.
             */
            public Builder volumeInfo(java.util.List<VolumeInfo> volumeInfo) {
                this.volumeInfo = volumeInfo;
                return this;
            }

            public Volumes build() {
                return new Volumes(this);
            } 

        } 

    }
}
