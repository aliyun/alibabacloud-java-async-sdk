// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRoutineRequest} extends {@link RequestModel}
 *
 * <p>CreateRoutineRequest</p>
 */
public class CreateRoutineRequest extends Request {
    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("EnvConf")
    private java.util.Map < String, ? > envConf;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private CreateRoutineRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.envConf = builder.envConf;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRoutineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return envConf
     */
    public java.util.Map < String, ? > getEnvConf() {
        return this.envConf;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreateRoutineRequest, Builder> {
        private String description; 
        private java.util.Map < String, ? > envConf; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateRoutineRequest request) {
            super(request);
            this.description = request.description;
            this.envConf = request.envConf;
            this.name = request.name;
        } 

        /**
         * The description of the routine.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The configurations of the specified environment.
         */
        public Builder envConf(java.util.Map < String, ? > envConf) {
            String envConfShrink = shrink(envConf, "EnvConf", "json");
            this.putBodyParameter("EnvConf", envConfShrink);
            this.envConf = envConf;
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
        public CreateRoutineRequest build() {
            return new CreateRoutineRequest(this);
        } 

    } 

}
