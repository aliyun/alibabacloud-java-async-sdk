// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateClusterVolumesRequest} extends {@link RequestModel}
 *
 * <p>UpdateClusterVolumesRequest</p>
 */
public class UpdateClusterVolumesRequest extends Request {
    @Query
    @NameInMap("AdditionalVolumes")
    private java.util.List < AdditionalVolumes> additionalVolumes;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    private UpdateClusterVolumesRequest(Builder builder) {
        super(builder);
        this.additionalVolumes = builder.additionalVolumes;
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateClusterVolumesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return additionalVolumes
     */
    public java.util.List < AdditionalVolumes> getAdditionalVolumes() {
        return this.additionalVolumes;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    public static final class Builder extends Request.Builder<UpdateClusterVolumesRequest, Builder> {
        private java.util.List < AdditionalVolumes> additionalVolumes; 
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateClusterVolumesRequest request) {
            super(request);
            this.additionalVolumes = request.additionalVolumes;
            this.clusterId = request.clusterId;
        } 

        /**
         * The operation that you want to perform. Set the value to UpdateClusterVolumes
         */
        public Builder additionalVolumes(java.util.List < AdditionalVolumes> additionalVolumes) {
            this.putQueryParameter("AdditionalVolumes", additionalVolumes);
            this.additionalVolumes = additionalVolumes;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public UpdateClusterVolumesRequest build() {
            return new UpdateClusterVolumesRequest(this);
        } 

    } 

    public static class Roles extends TeaModel {
        @NameInMap("Name")
        private String name;

        private Roles(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Roles create() {
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
             * The node type on which the nth additional mounted file system is mounted. Valid values:
             * <p>
             * 
             * *   Manager: management node
             * *   Login: logon node
             * *   Compute: compute node
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Roles build() {
                return new Roles(this);
            } 

        } 

    }
    public static class AdditionalVolumes extends TeaModel {
        @NameInMap("JobQueue")
        private String jobQueue;

        @NameInMap("LocalDirectory")
        private String localDirectory;

        @NameInMap("Location")
        private String location;

        @NameInMap("RemoteDirectory")
        private String remoteDirectory;

        @NameInMap("Roles")
        private java.util.List < Roles> roles;

        @NameInMap("VolumeId")
        private String volumeId;

        @NameInMap("VolumeMountOption")
        private String volumeMountOption;

        @NameInMap("VolumeMountpoint")
        private String volumeMountpoint;

        @NameInMap("VolumeProtocol")
        private String volumeProtocol;

        @NameInMap("VolumeType")
        private String volumeType;

        private AdditionalVolumes(Builder builder) {
            this.jobQueue = builder.jobQueue;
            this.localDirectory = builder.localDirectory;
            this.location = builder.location;
            this.remoteDirectory = builder.remoteDirectory;
            this.roles = builder.roles;
            this.volumeId = builder.volumeId;
            this.volumeMountOption = builder.volumeMountOption;
            this.volumeMountpoint = builder.volumeMountpoint;
            this.volumeProtocol = builder.volumeProtocol;
            this.volumeType = builder.volumeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdditionalVolumes create() {
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
         * @return roles
         */
        public java.util.List < Roles> getRoles() {
            return this.roles;
        }

        /**
         * @return volumeId
         */
        public String getVolumeId() {
            return this.volumeId;
        }

        /**
         * @return volumeMountOption
         */
        public String getVolumeMountOption() {
            return this.volumeMountOption;
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
            private java.util.List < Roles> roles; 
            private String volumeId; 
            private String volumeMountOption; 
            private String volumeMountpoint; 
            private String volumeProtocol; 
            private String volumeType; 

            /**
             * The ID of the cluster.
             */
            public Builder jobQueue(String jobQueue) {
                this.jobQueue = jobQueue;
                return this;
            }

            /**
             * The on-premises mount directory for the nth additional mounted file system.
             */
            public Builder localDirectory(String localDirectory) {
                this.localDirectory = localDirectory;
                return this;
            }

            /**
             * The storage location of the nth attached mounted file system. Valid values:
             * <p>
             * 
             * *   OnPremise: hybrid cloud cluster
             * *   PublicCloud: public cloud cluster
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The remote directory to be mounted by the nth additional mounted file system.
             */
            public Builder remoteDirectory(String remoteDirectory) {
                this.remoteDirectory = remoteDirectory;
                return this;
            }

            /**
             * The ID of the nth additional mounted file system.
             */
            public Builder roles(java.util.List < Roles> roles) {
                this.roles = roles;
                return this;
            }

            /**
             * The queue name of the nth attached mounted filesystem.
             */
            public Builder volumeId(String volumeId) {
                this.volumeId = volumeId;
                return this;
            }

            /**
             * VolumeMountOption.
             */
            public Builder volumeMountOption(String volumeMountOption) {
                this.volumeMountOption = volumeMountOption;
                return this;
            }

            /**
             * The domain name of the mount target for the nth additional mounted file system.
             */
            public Builder volumeMountpoint(String volumeMountpoint) {
                this.volumeMountpoint = volumeMountpoint;
                return this;
            }

            /**
             * The protocol type of the nth additional mounted file system. Valid values:
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
             * The type of the nth additional mounted file system. Currently, only NAS is supported.
             * <p>
             * 
             * Valid values of N: 1 to 10.
             */
            public Builder volumeType(String volumeType) {
                this.volumeType = volumeType;
                return this;
            }

            public AdditionalVolumes build() {
                return new AdditionalVolumes(this);
            } 

        } 

    }
}
