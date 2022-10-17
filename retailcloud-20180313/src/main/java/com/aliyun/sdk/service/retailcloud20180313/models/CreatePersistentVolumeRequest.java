// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePersistentVolumeRequest} extends {@link RequestModel}
 *
 * <p>CreatePersistentVolumeRequest</p>
 */
public class CreatePersistentVolumeRequest extends Request {
    @Body
    @NameInMap("AccessModes")
    @Validation(required = true)
    private String accessModes;

    @Body
    @NameInMap("Capacity")
    @Validation(required = true)
    private String capacity;

    @Body
    @NameInMap("ClusterInstanceId")
    @Validation(required = true)
    private String clusterInstanceId;

    @Body
    @NameInMap("MountDir")
    private String mountDir;

    @Body
    @NameInMap("MountTargetDomain")
    @Validation(required = true)
    private String mountTargetDomain;

    @Body
    @NameInMap("NFSVersion")
    @Validation(required = true)
    private String NFSVersion;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("NasType")
    private String nasType;

    @Body
    @NameInMap("ReclaimPolicy")
    @Validation(required = true)
    private String reclaimPolicy;

    @Body
    @NameInMap("StorageClass")
    @Validation(required = true)
    private String storageClass;

    private CreatePersistentVolumeRequest(Builder builder) {
        super(builder);
        this.accessModes = builder.accessModes;
        this.capacity = builder.capacity;
        this.clusterInstanceId = builder.clusterInstanceId;
        this.mountDir = builder.mountDir;
        this.mountTargetDomain = builder.mountTargetDomain;
        this.NFSVersion = builder.NFSVersion;
        this.name = builder.name;
        this.nasType = builder.nasType;
        this.reclaimPolicy = builder.reclaimPolicy;
        this.storageClass = builder.storageClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePersistentVolumeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessModes
     */
    public String getAccessModes() {
        return this.accessModes;
    }

    /**
     * @return capacity
     */
    public String getCapacity() {
        return this.capacity;
    }

    /**
     * @return clusterInstanceId
     */
    public String getClusterInstanceId() {
        return this.clusterInstanceId;
    }

    /**
     * @return mountDir
     */
    public String getMountDir() {
        return this.mountDir;
    }

    /**
     * @return mountTargetDomain
     */
    public String getMountTargetDomain() {
        return this.mountTargetDomain;
    }

    /**
     * @return NFSVersion
     */
    public String getNFSVersion() {
        return this.NFSVersion;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nasType
     */
    public String getNasType() {
        return this.nasType;
    }

    /**
     * @return reclaimPolicy
     */
    public String getReclaimPolicy() {
        return this.reclaimPolicy;
    }

    /**
     * @return storageClass
     */
    public String getStorageClass() {
        return this.storageClass;
    }

    public static final class Builder extends Request.Builder<CreatePersistentVolumeRequest, Builder> {
        private String accessModes; 
        private String capacity; 
        private String clusterInstanceId; 
        private String mountDir; 
        private String mountTargetDomain; 
        private String NFSVersion; 
        private String name; 
        private String nasType; 
        private String reclaimPolicy; 
        private String storageClass; 

        private Builder() {
            super();
        } 

        private Builder(CreatePersistentVolumeRequest request) {
            super(request);
            this.accessModes = request.accessModes;
            this.capacity = request.capacity;
            this.clusterInstanceId = request.clusterInstanceId;
            this.mountDir = request.mountDir;
            this.mountTargetDomain = request.mountTargetDomain;
            this.NFSVersion = request.NFSVersion;
            this.name = request.name;
            this.nasType = request.nasType;
            this.reclaimPolicy = request.reclaimPolicy;
            this.storageClass = request.storageClass;
        } 

        /**
         * AccessModes.
         */
        public Builder accessModes(String accessModes) {
            this.putBodyParameter("AccessModes", accessModes);
            this.accessModes = accessModes;
            return this;
        }

        /**
         * Capacity.
         */
        public Builder capacity(String capacity) {
            this.putBodyParameter("Capacity", capacity);
            this.capacity = capacity;
            return this;
        }

        /**
         * ClusterInstanceId.
         */
        public Builder clusterInstanceId(String clusterInstanceId) {
            this.putBodyParameter("ClusterInstanceId", clusterInstanceId);
            this.clusterInstanceId = clusterInstanceId;
            return this;
        }

        /**
         * MountDir.
         */
        public Builder mountDir(String mountDir) {
            this.putBodyParameter("MountDir", mountDir);
            this.mountDir = mountDir;
            return this;
        }

        /**
         * MountTargetDomain.
         */
        public Builder mountTargetDomain(String mountTargetDomain) {
            this.putBodyParameter("MountTargetDomain", mountTargetDomain);
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }

        /**
         * NFSVersion.
         */
        public Builder NFSVersion(String NFSVersion) {
            this.putBodyParameter("NFSVersion", NFSVersion);
            this.NFSVersion = NFSVersion;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NasType.
         */
        public Builder nasType(String nasType) {
            this.putBodyParameter("NasType", nasType);
            this.nasType = nasType;
            return this;
        }

        /**
         * ReclaimPolicy.
         */
        public Builder reclaimPolicy(String reclaimPolicy) {
            this.putBodyParameter("ReclaimPolicy", reclaimPolicy);
            this.reclaimPolicy = reclaimPolicy;
            return this;
        }

        /**
         * StorageClass.
         */
        public Builder storageClass(String storageClass) {
            this.putBodyParameter("StorageClass", storageClass);
            this.storageClass = storageClass;
            return this;
        }

        @Override
        public CreatePersistentVolumeRequest build() {
            return new CreatePersistentVolumeRequest(this);
        } 

    } 

}
