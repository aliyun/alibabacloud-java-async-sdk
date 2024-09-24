// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyApplicationSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyApplicationSpecRequest</p>
 */
public class ModifyApplicationSpecRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceSpec")
    private java.util.List < InstanceSpec> instanceSpec;

    private ModifyApplicationSpecRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.instanceSpec = builder.instanceSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApplicationSpecRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return instanceSpec
     */
    public java.util.List < InstanceSpec> getInstanceSpec() {
        return this.instanceSpec;
    }

    public static final class Builder extends Request.Builder<ModifyApplicationSpecRequest, Builder> {
        private String applicationId; 
        private java.util.List < InstanceSpec> instanceSpec; 

        private Builder() {
            super();
        } 

        private Builder(ModifyApplicationSpecRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.instanceSpec = request.instanceSpec;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.putBodyParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * InstanceSpec.
         */
        public Builder instanceSpec(java.util.List < InstanceSpec> instanceSpec) {
            String instanceSpecShrink = shrink(instanceSpec, "InstanceSpec", "json");
            this.putBodyParameter("InstanceSpec", instanceSpecShrink);
            this.instanceSpec = instanceSpec;
            return this;
        }

        @Override
        public ModifyApplicationSpecRequest build() {
            return new ModifyApplicationSpecRequest(this);
        } 

    } 

    public static class InstanceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Configuration")
        private java.util.Map < String, ? > configuration;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private InstanceSpec(Builder builder) {
            this.configuration = builder.configuration;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSpec create() {
            return builder().build();
        }

        /**
         * @return configuration
         */
        public java.util.Map < String, ? > getConfiguration() {
            return this.configuration;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private java.util.Map < String, ? > configuration; 
            private String instanceId; 

            /**
             * Configuration.
             */
            public Builder configuration(java.util.Map < String, ? > configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public InstanceSpec build() {
                return new InstanceSpec(this);
            } 

        } 

    }
}
