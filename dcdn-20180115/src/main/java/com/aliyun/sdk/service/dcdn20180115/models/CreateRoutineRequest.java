// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateRoutineRequest} extends {@link RequestModel}
 *
 * <p>CreateRoutineRequest</p>
 */
public class CreateRoutineRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnvConf")
    private java.util.Map < String, ? > envConf;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The description of the routine.</p>
         * 
         * <strong>example:</strong>
         * <p>the description of this routine</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The configurations of the specified environment.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;staging&quot;:{&quot;SpecName&quot;:&quot;50ms&quot;},&quot;production&quot;:{&quot;SpecName&quot;:&quot;50ms&quot;}}</p>
         */
        public Builder envConf(java.util.Map < String, ? > envConf) {
            String envConfShrink = shrink(envConf, "EnvConf", "json");
            this.putBodyParameter("EnvConf", envConfShrink);
            this.envConf = envConf;
            return this;
        }

        /**
         * <p>The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
