// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePersistentVolumeClaimRequest} extends {@link RequestModel}
 *
 * <p>DeletePersistentVolumeClaimRequest</p>
 */
public class DeletePersistentVolumeClaimRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Query
    @NameInMap("EnvId")
    @Validation(required = true)
    private Long envId;

    @Query
    @NameInMap("PersistentVolumeClaimName")
    @Validation(required = true)
    private String persistentVolumeClaimName;

    private DeletePersistentVolumeClaimRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.envId = builder.envId;
        this.persistentVolumeClaimName = builder.persistentVolumeClaimName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePersistentVolumeClaimRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return envId
     */
    public Long getEnvId() {
        return this.envId;
    }

    /**
     * @return persistentVolumeClaimName
     */
    public String getPersistentVolumeClaimName() {
        return this.persistentVolumeClaimName;
    }

    public static final class Builder extends Request.Builder<DeletePersistentVolumeClaimRequest, Builder> {
        private Long appId; 
        private Long envId; 
        private String persistentVolumeClaimName; 

        private Builder() {
            super();
        } 

        private Builder(DeletePersistentVolumeClaimRequest request) {
            super(request);
            this.appId = request.appId;
            this.envId = request.envId;
            this.persistentVolumeClaimName = request.persistentVolumeClaimName;
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
         * EnvId.
         */
        public Builder envId(Long envId) {
            this.putQueryParameter("EnvId", envId);
            this.envId = envId;
            return this;
        }

        /**
         * PersistentVolumeClaimName.
         */
        public Builder persistentVolumeClaimName(String persistentVolumeClaimName) {
            this.putQueryParameter("PersistentVolumeClaimName", persistentVolumeClaimName);
            this.persistentVolumeClaimName = persistentVolumeClaimName;
            return this;
        }

        @Override
        public DeletePersistentVolumeClaimRequest build() {
            return new DeletePersistentVolumeClaimRequest(this);
        } 

    } 

}
