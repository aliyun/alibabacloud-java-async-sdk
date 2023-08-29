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

    private DeleteRoutineConfEnvsRequest(Builder builder) {
        super(builder);
        this.envs = builder.envs;
        this.name = builder.name;
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

    public static final class Builder extends Request.Builder<DeleteRoutineConfEnvsRequest, Builder> {
        private java.util.Map < String, ? > envs; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRoutineConfEnvsRequest request) {
            super(request);
            this.envs = request.envs;
            this.name = request.name;
        } 

        /**
         * The custom canary release environments that you want to delete.
         */
        public Builder envs(java.util.Map < String, ? > envs) {
            String envsShrink = shrink(envs, "Envs", "json");
            this.putBodyParameter("Envs", envsShrink);
            this.envs = envs;
            return this;
        }

        /**
         * The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public DeleteRoutineConfEnvsRequest build() {
            return new DeleteRoutineConfEnvsRequest(this);
        } 

    } 

}
