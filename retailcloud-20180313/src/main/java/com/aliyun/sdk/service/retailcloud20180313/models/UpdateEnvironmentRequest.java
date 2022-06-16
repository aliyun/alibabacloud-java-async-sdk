// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEnvironmentRequest} extends {@link RequestModel}
 *
 * <p>UpdateEnvironmentRequest</p>
 */
public class UpdateEnvironmentRequest extends Request {
    @Query
    @NameInMap("AppEnvId")
    @Validation(required = true)
    private Long appEnvId;

    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Query
    @NameInMap("AppSchemaId")
    private Long appSchemaId;

    @Query
    @NameInMap("Replicas")
    private Integer replicas;

    private UpdateEnvironmentRequest(Builder builder) {
        super(builder);
        this.appEnvId = builder.appEnvId;
        this.appId = builder.appId;
        this.appSchemaId = builder.appSchemaId;
        this.replicas = builder.replicas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEnvironmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appEnvId
     */
    public Long getAppEnvId() {
        return this.appEnvId;
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return appSchemaId
     */
    public Long getAppSchemaId() {
        return this.appSchemaId;
    }

    /**
     * @return replicas
     */
    public Integer getReplicas() {
        return this.replicas;
    }

    public static final class Builder extends Request.Builder<UpdateEnvironmentRequest, Builder> {
        private Long appEnvId; 
        private Long appId; 
        private Long appSchemaId; 
        private Integer replicas; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEnvironmentRequest request) {
            super(request);
            this.appEnvId = request.appEnvId;
            this.appId = request.appId;
            this.appSchemaId = request.appSchemaId;
            this.replicas = request.replicas;
        } 

        /**
         * AppEnvId.
         */
        public Builder appEnvId(Long appEnvId) {
            this.putQueryParameter("AppEnvId", appEnvId);
            this.appEnvId = appEnvId;
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
         * AppSchemaId.
         */
        public Builder appSchemaId(Long appSchemaId) {
            this.putQueryParameter("AppSchemaId", appSchemaId);
            this.appSchemaId = appSchemaId;
            return this;
        }

        /**
         * Replicas.
         */
        public Builder replicas(Integer replicas) {
            this.putQueryParameter("Replicas", replicas);
            this.replicas = replicas;
            return this;
        }

        @Override
        public UpdateEnvironmentRequest build() {
            return new UpdateEnvironmentRequest(this);
        } 

    } 

}
