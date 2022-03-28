// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRoutineConfEnvsRequest} extends {@link RequestModel}
 *
 * <p>DeleteRoutineConfEnvsRequest</p>
 */
public class DeleteRoutineConfEnvsRequest extends Request {
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

    private DeleteRoutineConfEnvsRequest(Builder builder) {
        super(builder);
        this.envs = builder.envs;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRoutineConfEnvsRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteRoutineConfEnvsRequest, Builder> {
        private java.util.Map < String, ? > envs; 
        private String name; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRoutineConfEnvsRequest request) {
            super(request);
            this.envs = request.envs;
            this.name = request.name;
            this.ownerId = request.ownerId;
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

        @Override
        public DeleteRoutineConfEnvsRequest build() {
            return new DeleteRoutineConfEnvsRequest(this);
        } 

    } 

}
