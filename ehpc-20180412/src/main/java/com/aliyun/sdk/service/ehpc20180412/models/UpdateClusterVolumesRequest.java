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
 * {@link UpdateClusterVolumesRequest} extends {@link RequestModel}
 *
 * <p>UpdateClusterVolumesRequest</p>
 */
public class UpdateClusterVolumesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdditionalVolumes")
    private java.util.List<AdditionalVolumes> additionalVolumes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<AdditionalVolumes> getAdditionalVolumes() {
        return this.additionalVolumes;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    public static final class Builder extends Request.Builder<UpdateClusterVolumesRequest, Builder> {
        private java.util.List<AdditionalVolumes> additionalVolumes; 
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
         * <p>The file systems that you want to mount.</p>
         */
        public Builder additionalVolumes(java.util.List<AdditionalVolumes> additionalVolumes) {
            this.putQueryParameter("AdditionalVolumes", additionalVolumes);
            this.additionalVolumes = additionalVolumes;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
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

    /**
     * 
     * {@link UpdateClusterVolumesRequest} extends {@link TeaModel}
     *
     * <p>UpdateClusterVolumesRequest</p>
     */
    public static class Roles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
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

            private Builder() {
            } 

            private Builder(Roles model) {
                this.name = model.name;
            } 

            /**
             * <p>The type of the node to which the file system is mounted. Valid values:</p>
             * <ul>
             * <li>Manager: management node</li>
             * <li>Login: logon node</li>
             * <li>Compute: compute node</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[&quot;Compute&quot;]</p>
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
    /**
     * 
     * {@link UpdateClusterVolumesRequest} extends {@link TeaModel}
     *
     * <p>UpdateClusterVolumesRequest</p>
     */
    public static class AdditionalVolumes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobQueue")
        private String jobQueue;

        @com.aliyun.core.annotation.NameInMap("LocalDirectory")
        private String localDirectory;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("RemoteDirectory")
        private String remoteDirectory;

        @com.aliyun.core.annotation.NameInMap("Roles")
        private java.util.List<Roles> roles;

        @com.aliyun.core.annotation.NameInMap("VolumeId")
        private String volumeId;

        @com.aliyun.core.annotation.NameInMap("VolumeMountOption")
        private String volumeMountOption;

        @com.aliyun.core.annotation.NameInMap("VolumeMountpoint")
        private String volumeMountpoint;

        @com.aliyun.core.annotation.NameInMap("VolumeProtocol")
        private String volumeProtocol;

        @com.aliyun.core.annotation.NameInMap("VolumeType")
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
        public java.util.List<Roles> getRoles() {
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
            private java.util.List<Roles> roles; 
            private String volumeId; 
            private String volumeMountOption; 
            private String volumeMountpoint; 
            private String volumeProtocol; 
            private String volumeType; 

            private Builder() {
            } 

            private Builder(AdditionalVolumes model) {
                this.jobQueue = model.jobQueue;
                this.localDirectory = model.localDirectory;
                this.location = model.location;
                this.remoteDirectory = model.remoteDirectory;
                this.roles = model.roles;
                this.volumeId = model.volumeId;
                this.volumeMountOption = model.volumeMountOption;
                this.volumeMountpoint = model.volumeMountpoint;
                this.volumeProtocol = model.volumeProtocol;
                this.volumeType = model.volumeType;
            } 

            /**
             * <p>The queue name of the file system to be mounted.</p>
             * 
             * <strong>example:</strong>
             * <p>work</p>
             */
            public Builder jobQueue(String jobQueue) {
                this.jobQueue = jobQueue;
                return this;
            }

            /**
             * <p>The on-premises mount directory of the file system to be mounted.</p>
             * 
             * <strong>example:</strong>
             * <p>/ff</p>
             */
            public Builder localDirectory(String localDirectory) {
                this.localDirectory = localDirectory;
                return this;
            }

            /**
             * <p>The storage location of the file system to be mounted. Valid values:</p>
             * <ul>
             * <li>OnPremise: The file system is stored in a hybrid cloud.</li>
             * <li>PublicCloud: The file system cluster is stored in a public cloud.</li>
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
             * <p>The remote directory to which the file system is mounted.</p>
             * 
             * <strong>example:</strong>
             * <p>/test</p>
             */
            public Builder remoteDirectory(String remoteDirectory) {
                this.remoteDirectory = remoteDirectory;
                return this;
            }

            /**
             * <p>The array of the nodes to which the file system is mounted.</p>
             */
            public Builder roles(java.util.List<Roles> roles) {
                this.roles = roles;
                return this;
            }

            /**
             * <p>The ID of the file system to be mounted.</p>
             * 
             * <strong>example:</strong>
             * <p>extreme-00b88****</p>
             */
            public Builder volumeId(String volumeId) {
                this.volumeId = volumeId;
                return this;
            }

            /**
             * <p>The mount option of the file system to be mounted.</p>
             * 
             * <strong>example:</strong>
             * <p>-t nfs -o vers=3,nolock,noresvport</p>
             */
            public Builder volumeMountOption(String volumeMountOption) {
                this.volumeMountOption = volumeMountOption;
                return this;
            }

            /**
             * <p>The endpoint of the mount target of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>0088****-sihc.cn-hangzhou.extreme.nas.aliyuncs.com</p>
             */
            public Builder volumeMountpoint(String volumeMountpoint) {
                this.volumeMountpoint = volumeMountpoint;
                return this;
            }

            /**
             * <p>The protocol type of the file system to be mounted. Valid values:</p>
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
             * <p>The type of the file system to be mounted. Set the value to NAS.</p>
             * 
             * <strong>example:</strong>
             * <p>NAS</p>
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
