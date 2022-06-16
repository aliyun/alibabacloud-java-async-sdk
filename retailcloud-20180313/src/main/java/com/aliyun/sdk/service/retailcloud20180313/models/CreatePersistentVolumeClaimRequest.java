// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePersistentVolumeClaimRequest} extends {@link RequestModel}
 *
 * <p>CreatePersistentVolumeClaimRequest</p>
 */
public class CreatePersistentVolumeClaimRequest extends Request {
    @Query
    @NameInMap("AccessModes")
    @Validation(required = true)
    private String accessModes;

    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Query
    @NameInMap("Capacity")
    @Validation(required = true)
    private String capacity;

    @Query
    @NameInMap("EnvId")
    @Validation(required = true)
    private Long envId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("StorageClass")
    @Validation(required = true)
    private String storageClass;

    private CreatePersistentVolumeClaimRequest(Builder builder) {
        super(builder);
        this.accessModes = builder.accessModes;
        this.appId = builder.appId;
        this.capacity = builder.capacity;
        this.envId = builder.envId;
        this.name = builder.name;
        this.storageClass = builder.storageClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePersistentVolumeClaimRequest create() {
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
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return capacity
     */
    public String getCapacity() {
        return this.capacity;
    }

    /**
     * @return envId
     */
    public Long getEnvId() {
        return this.envId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return storageClass
     */
    public String getStorageClass() {
        return this.storageClass;
    }

    public static final class Builder extends Request.Builder<CreatePersistentVolumeClaimRequest, Builder> {
        private String accessModes; 
        private Long appId; 
        private String capacity; 
        private Long envId; 
        private String name; 
        private String storageClass; 

        private Builder() {
            super();
        } 

        private Builder(CreatePersistentVolumeClaimRequest request) {
            super(request);
            this.accessModes = request.accessModes;
            this.appId = request.appId;
            this.capacity = request.capacity;
            this.envId = request.envId;
            this.name = request.name;
            this.storageClass = request.storageClass;
        } 

        /**
         * AccessModes.
         */
        public Builder accessModes(String accessModes) {
            this.putQueryParameter("AccessModes", accessModes);
            this.accessModes = accessModes;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(Long appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Capacity.
         */
        public Builder capacity(String capacity) {
            this.putQueryParameter("Capacity", capacity);
            this.capacity = capacity;
            return this;
        }

        /**
         * EnvId.
         */
        public Builder envId(Long envId) {
            this.putQueryParameter("EnvId", envId);
            this.envId = envId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * StorageClass.
         */
        public Builder storageClass(String storageClass) {
            this.putQueryParameter("StorageClass", storageClass);
            this.storageClass = storageClass;
            return this;
        }

        @Override
        public CreatePersistentVolumeClaimRequest build() {
            return new CreatePersistentVolumeClaimRequest(this);
        } 

    } 

}
