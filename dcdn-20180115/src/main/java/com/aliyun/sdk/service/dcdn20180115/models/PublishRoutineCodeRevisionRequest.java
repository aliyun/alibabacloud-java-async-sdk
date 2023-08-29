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

    @Body
    @NameInMap("SelectCodeRevision")
    @Validation(required = true)
    private String selectCodeRevision;

    private PublishRoutineCodeRevisionRequest(Builder builder) {
        super(builder);
        this.envs = builder.envs;
        this.name = builder.name;
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
     * @return selectCodeRevision
     */
    public String getSelectCodeRevision() {
        return this.selectCodeRevision;
    }

    public static final class Builder extends Request.Builder<PublishRoutineCodeRevisionRequest, Builder> {
        private java.util.Map < String, ? > envs; 
        private String name; 
        private String selectCodeRevision; 

        private Builder() {
            super();
        } 

        private Builder(PublishRoutineCodeRevisionRequest request) {
            super(request);
            this.envs = request.envs;
            this.name = request.name;
            this.selectCodeRevision = request.selectCodeRevision;
        } 

        /**
         * The environment to which you want to publish the code.
         * <p>
         * 
         * > 
         * 
         * *   production: the name of the environment, including the environment name (SpecName) and the domain name whitelist (AllowedHosts).
         * 
         * *   presetCanary: You can add canary release environments based on your business requirements. This parameter is optional.
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

        /**
         * The version of the routine code that you want to publish.
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
