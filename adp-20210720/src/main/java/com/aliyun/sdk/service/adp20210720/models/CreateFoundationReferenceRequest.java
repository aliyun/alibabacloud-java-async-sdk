// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFoundationReferenceRequest} extends {@link RequestModel}
 *
 * <p>CreateFoundationReferenceRequest</p>
 */
public class CreateFoundationReferenceRequest extends Request {
    @Body
    @NameInMap("clusterConfig")
    private String clusterConfig;

    @Body
    @NameInMap("componentConfigs")
    private java.util.List < ComponentConfigs> componentConfigs;

    @Body
    @NameInMap("foundationReferenceConfigs")
    private java.util.List < FoundationReferenceConfigs> foundationReferenceConfigs;

    @Body
    @NameInMap("foundationVersionUID")
    @Validation(required = true)
    private String foundationVersionUID;

    @Body
    @NameInMap("originFoundationReferenceUID")
    private String originFoundationReferenceUID;

    private CreateFoundationReferenceRequest(Builder builder) {
        super(builder);
        this.clusterConfig = builder.clusterConfig;
        this.componentConfigs = builder.componentConfigs;
        this.foundationReferenceConfigs = builder.foundationReferenceConfigs;
        this.foundationVersionUID = builder.foundationVersionUID;
        this.originFoundationReferenceUID = builder.originFoundationReferenceUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFoundationReferenceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterConfig
     */
    public String getClusterConfig() {
        return this.clusterConfig;
    }

    /**
     * @return componentConfigs
     */
    public java.util.List < ComponentConfigs> getComponentConfigs() {
        return this.componentConfigs;
    }

    /**
     * @return foundationReferenceConfigs
     */
    public java.util.List < FoundationReferenceConfigs> getFoundationReferenceConfigs() {
        return this.foundationReferenceConfigs;
    }

    /**
     * @return foundationVersionUID
     */
    public String getFoundationVersionUID() {
        return this.foundationVersionUID;
    }

    /**
     * @return originFoundationReferenceUID
     */
    public String getOriginFoundationReferenceUID() {
        return this.originFoundationReferenceUID;
    }

    public static final class Builder extends Request.Builder<CreateFoundationReferenceRequest, Builder> {
        private String clusterConfig; 
        private java.util.List < ComponentConfigs> componentConfigs; 
        private java.util.List < FoundationReferenceConfigs> foundationReferenceConfigs; 
        private String foundationVersionUID; 
        private String originFoundationReferenceUID; 

        private Builder() {
            super();
        } 

        private Builder(CreateFoundationReferenceRequest request) {
            super(request);
            this.clusterConfig = request.clusterConfig;
            this.componentConfigs = request.componentConfigs;
            this.foundationReferenceConfigs = request.foundationReferenceConfigs;
            this.foundationVersionUID = request.foundationVersionUID;
            this.originFoundationReferenceUID = request.originFoundationReferenceUID;
        } 

        /**
         * clusterConfig.
         */
        public Builder clusterConfig(String clusterConfig) {
            this.putBodyParameter("clusterConfig", clusterConfig);
            this.clusterConfig = clusterConfig;
            return this;
        }

        /**
         * componentConfigs.
         */
        public Builder componentConfigs(java.util.List < ComponentConfigs> componentConfigs) {
            this.putBodyParameter("componentConfigs", componentConfigs);
            this.componentConfigs = componentConfigs;
            return this;
        }

        /**
         * foundationReferenceConfigs.
         */
        public Builder foundationReferenceConfigs(java.util.List < FoundationReferenceConfigs> foundationReferenceConfigs) {
            this.putBodyParameter("foundationReferenceConfigs", foundationReferenceConfigs);
            this.foundationReferenceConfigs = foundationReferenceConfigs;
            return this;
        }

        /**
         * foundationVersionUID.
         */
        public Builder foundationVersionUID(String foundationVersionUID) {
            this.putBodyParameter("foundationVersionUID", foundationVersionUID);
            this.foundationVersionUID = foundationVersionUID;
            return this;
        }

        /**
         * originFoundationReferenceUID.
         */
        public Builder originFoundationReferenceUID(String originFoundationReferenceUID) {
            this.putBodyParameter("originFoundationReferenceUID", originFoundationReferenceUID);
            this.originFoundationReferenceUID = originFoundationReferenceUID;
            return this;
        }

        @Override
        public CreateFoundationReferenceRequest build() {
            return new CreateFoundationReferenceRequest(this);
        } 

    } 

    public static class ComponentConfigs extends TeaModel {
        @NameInMap("componentVersionUID")
        private String componentVersionUID;

        @NameInMap("orchestrationValues")
        private String orchestrationValues;

        private ComponentConfigs(Builder builder) {
            this.componentVersionUID = builder.componentVersionUID;
            this.orchestrationValues = builder.orchestrationValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentConfigs create() {
            return builder().build();
        }

        /**
         * @return componentVersionUID
         */
        public String getComponentVersionUID() {
            return this.componentVersionUID;
        }

        /**
         * @return orchestrationValues
         */
        public String getOrchestrationValues() {
            return this.orchestrationValues;
        }

        public static final class Builder {
            private String componentVersionUID; 
            private String orchestrationValues; 

            /**
             * componentVersionUID.
             */
            public Builder componentVersionUID(String componentVersionUID) {
                this.componentVersionUID = componentVersionUID;
                return this;
            }

            /**
             * orchestrationValues.
             */
            public Builder orchestrationValues(String orchestrationValues) {
                this.orchestrationValues = orchestrationValues;
                return this;
            }

            public ComponentConfigs build() {
                return new ComponentConfigs(this);
            } 

        } 

    }
    public static class FoundationReferenceConfigs extends TeaModel {
        @NameInMap("componentReleaseName")
        private String componentReleaseName;

        @NameInMap("configType")
        private String configType;

        @NameInMap("name")
        private String name;

        @NameInMap("value")
        private String value;

        private FoundationReferenceConfigs(Builder builder) {
            this.componentReleaseName = builder.componentReleaseName;
            this.configType = builder.configType;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FoundationReferenceConfigs create() {
            return builder().build();
        }

        /**
         * @return componentReleaseName
         */
        public String getComponentReleaseName() {
            return this.componentReleaseName;
        }

        /**
         * @return configType
         */
        public String getConfigType() {
            return this.configType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String componentReleaseName; 
            private String configType; 
            private String name; 
            private String value; 

            /**
             * componentReleaseName.
             */
            public Builder componentReleaseName(String componentReleaseName) {
                this.componentReleaseName = componentReleaseName;
                return this;
            }

            /**
             * configType.
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public FoundationReferenceConfigs build() {
                return new FoundationReferenceConfigs(this);
            } 

        } 

    }
}
