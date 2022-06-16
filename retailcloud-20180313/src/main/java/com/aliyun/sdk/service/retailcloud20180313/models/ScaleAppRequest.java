// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScaleAppRequest} extends {@link RequestModel}
 *
 * <p>ScaleAppRequest</p>
 */
public class ScaleAppRequest extends Request {
    @Query
    @NameInMap("EnvId")
    @Validation(required = true)
    private Long envId;

    @Query
    @NameInMap("Replicas")
    @Validation(required = true)
    private Integer replicas;

    @Query
    @NameInMap("TotalPartitions")
    private Integer totalPartitions;

    private ScaleAppRequest(Builder builder) {
        super(builder);
        this.envId = builder.envId;
        this.replicas = builder.replicas;
        this.totalPartitions = builder.totalPartitions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScaleAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return envId
     */
    public Long getEnvId() {
        return this.envId;
    }

    /**
     * @return replicas
     */
    public Integer getReplicas() {
        return this.replicas;
    }

    /**
     * @return totalPartitions
     */
    public Integer getTotalPartitions() {
        return this.totalPartitions;
    }

    public static final class Builder extends Request.Builder<ScaleAppRequest, Builder> {
        private Long envId; 
        private Integer replicas; 
        private Integer totalPartitions; 

        private Builder() {
            super();
        } 

        private Builder(ScaleAppRequest request) {
            super(request);
            this.envId = request.envId;
            this.replicas = request.replicas;
            this.totalPartitions = request.totalPartitions;
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
         * Replicas.
         */
        public Builder replicas(Integer replicas) {
            this.putQueryParameter("Replicas", replicas);
            this.replicas = replicas;
            return this;
        }

        /**
         * TotalPartitions.
         */
        public Builder totalPartitions(Integer totalPartitions) {
            this.putQueryParameter("TotalPartitions", totalPartitions);
            this.totalPartitions = totalPartitions;
            return this;
        }

        @Override
        public ScaleAppRequest build() {
            return new ScaleAppRequest(this);
        } 

    } 

}
