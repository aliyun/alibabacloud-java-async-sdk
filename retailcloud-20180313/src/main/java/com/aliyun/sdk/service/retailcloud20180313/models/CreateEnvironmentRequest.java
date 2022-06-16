// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEnvironmentRequest} extends {@link RequestModel}
 *
 * <p>CreateEnvironmentRequest</p>
 */
public class CreateEnvironmentRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Query
    @NameInMap("AppSchemaId")
    @Validation(required = true)
    private Long appSchemaId;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("EnvName")
    @Validation(required = true)
    private String envName;

    @Query
    @NameInMap("EnvType")
    @Validation(required = true)
    private Integer envType;

    @Query
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    @Query
    @NameInMap("Replicas")
    @Validation(required = true)
    private Integer replicas;

    private CreateEnvironmentRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appSchemaId = builder.appSchemaId;
        this.clusterId = builder.clusterId;
        this.envName = builder.envName;
        this.envType = builder.envType;
        this.region = builder.region;
        this.replicas = builder.replicas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEnvironmentRequest create() {
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
     * @return appSchemaId
     */
    public Long getAppSchemaId() {
        return this.appSchemaId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return envName
     */
    public String getEnvName() {
        return this.envName;
    }

    /**
     * @return envType
     */
    public Integer getEnvType() {
        return this.envType;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return replicas
     */
    public Integer getReplicas() {
        return this.replicas;
    }

    public static final class Builder extends Request.Builder<CreateEnvironmentRequest, Builder> {
        private Long appId; 
        private Long appSchemaId; 
        private String clusterId; 
        private String envName; 
        private Integer envType; 
        private String region; 
        private Integer replicas; 

        private Builder() {
            super();
        } 

        private Builder(CreateEnvironmentRequest request) {
            super(request);
            this.appId = request.appId;
            this.appSchemaId = request.appSchemaId;
            this.clusterId = request.clusterId;
            this.envName = request.envName;
            this.envType = request.envType;
            this.region = request.region;
            this.replicas = request.replicas;
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
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * EnvName.
         */
        public Builder envName(String envName) {
            this.putQueryParameter("EnvName", envName);
            this.envName = envName;
            return this;
        }

        /**
         * EnvType.
         */
        public Builder envType(Integer envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
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
        public CreateEnvironmentRequest build() {
            return new CreateEnvironmentRequest(this);
        } 

    } 

}
