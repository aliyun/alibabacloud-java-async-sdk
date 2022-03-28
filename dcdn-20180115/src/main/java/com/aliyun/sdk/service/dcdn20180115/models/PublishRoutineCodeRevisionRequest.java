// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishRoutineCodeRevisionRequest} extends {@link RequestModel}
 *
 * <p>PublishRoutineCodeRevisionRequest</p>
 */
public class PublishRoutineCodeRevisionRequest extends Request {
    @Body
    @NameInMap("Envs")
    @Validation(required = true)
    private java.util.Map < String, ? > envs;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Body
    @NameInMap("SelectCodeRevision")
    @Validation(required = true)
    private String selectCodeRevision;

    private PublishRoutineCodeRevisionRequest(Builder builder) {
        super(builder);
        this.envs = builder.envs;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.selectCodeRevision = builder.selectCodeRevision;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishRoutineCodeRevisionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return envs
     */
    public java.util.Map < String, ? > getEnvs() {
        return this.envs;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return selectCodeRevision
     */
    public String getSelectCodeRevision() {
        return this.selectCodeRevision;
    }

    public static final class Builder extends Request.Builder<PublishRoutineCodeRevisionRequest, Builder> {
        private java.util.Map < String, ? > envs; 
        private String name; 
        private Long ownerId; 
        private String selectCodeRevision; 

        private Builder() {
            super();
        } 

        private Builder(PublishRoutineCodeRevisionRequest request) {
            super(request);
            this.envs = request.envs;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.selectCodeRevision = request.selectCodeRevision;
        } 

        /**
         * Envs.
         */
        public Builder envs(java.util.Map < String, ? > envs) {
            this.putBodyParameter("Envs", envs);
            this.envs = envs;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * SelectCodeRevision.
         */
        public Builder selectCodeRevision(String selectCodeRevision) {
            this.putBodyParameter("SelectCodeRevision", selectCodeRevision);
            this.selectCodeRevision = selectCodeRevision;
            return this;
        }

        @Override
        public PublishRoutineCodeRevisionRequest build() {
            return new PublishRoutineCodeRevisionRequest(this);
        } 

    } 

}
