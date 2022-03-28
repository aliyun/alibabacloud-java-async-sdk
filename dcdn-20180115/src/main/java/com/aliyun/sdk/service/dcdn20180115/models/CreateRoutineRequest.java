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

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private CreateRoutineRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.envConf = builder.envConf;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
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

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<CreateRoutineRequest, Builder> {
        private String description; 
        private java.util.Map < String, ? > envConf; 
        private String name; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRoutineRequest request) {
            super(request);
            this.description = request.description;
            this.envConf = request.envConf;
            this.name = request.name;
            this.ownerId = request.ownerId;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EnvConf.
         */
        public Builder envConf(java.util.Map < String, ? > envConf) {
            this.putBodyParameter("EnvConf", envConf);
            this.envConf = envConf;
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
        public CreateRoutineRequest build() {
            return new CreateRoutineRequest(this);
        } 

    } 

}
