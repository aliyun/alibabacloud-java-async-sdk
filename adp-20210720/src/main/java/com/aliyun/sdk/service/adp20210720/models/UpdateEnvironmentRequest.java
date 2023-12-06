// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEnvironmentRequest} extends {@link RequestModel}
 *
 * <p>UpdateEnvironmentRequest</p>
 */
public class UpdateEnvironmentRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Body
    @NameInMap("advancedConfigs")
    private AdvancedConfigs advancedConfigs;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("location")
    private String location;

    @Body
    @NameInMap("vendorConfig")
    private String vendorConfig;

    private UpdateEnvironmentRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.advancedConfigs = builder.advancedConfigs;
        this.description = builder.description;
        this.location = builder.location;
        this.vendorConfig = builder.vendorConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEnvironmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return advancedConfigs
     */
    public AdvancedConfigs getAdvancedConfigs() {
        return this.advancedConfigs;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return vendorConfig
     */
    public String getVendorConfig() {
        return this.vendorConfig;
    }

    public static final class Builder extends Request.Builder<UpdateEnvironmentRequest, Builder> {
        private String uid; 
        private AdvancedConfigs advancedConfigs; 
        private String description; 
        private String location; 
        private String vendorConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEnvironmentRequest request) {
            super(request);
            this.uid = request.uid;
            this.advancedConfigs = request.advancedConfigs;
            this.description = request.description;
            this.location = request.location;
            this.vendorConfig = request.vendorConfig;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * advancedConfigs.
         */
        public Builder advancedConfigs(AdvancedConfigs advancedConfigs) {
            this.putBodyParameter("advancedConfigs", advancedConfigs);
            this.advancedConfigs = advancedConfigs;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * location.
         */
        public Builder location(String location) {
            this.putBodyParameter("location", location);
            this.location = location;
            return this;
        }

        /**
         * vendorConfig.
         */
        public Builder vendorConfig(String vendorConfig) {
            this.putBodyParameter("vendorConfig", vendorConfig);
            this.vendorConfig = vendorConfig;
            return this;
        }

        @Override
        public UpdateEnvironmentRequest build() {
            return new UpdateEnvironmentRequest(this);
        } 

    } 

    public static class AdvancedConfigs extends TeaModel {
        @NameInMap("enableDeploySimulation")
        private Boolean enableDeploySimulation;

        @NameInMap("enableSiteSurvey")
        private Boolean enableSiteSurvey;

        private AdvancedConfigs(Builder builder) {
            this.enableDeploySimulation = builder.enableDeploySimulation;
            this.enableSiteSurvey = builder.enableSiteSurvey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvancedConfigs create() {
            return builder().build();
        }

        /**
         * @return enableDeploySimulation
         */
        public Boolean getEnableDeploySimulation() {
            return this.enableDeploySimulation;
        }

        /**
         * @return enableSiteSurvey
         */
        public Boolean getEnableSiteSurvey() {
            return this.enableSiteSurvey;
        }

        public static final class Builder {
            private Boolean enableDeploySimulation; 
            private Boolean enableSiteSurvey; 

            /**
             * enableDeploySimulation.
             */
            public Builder enableDeploySimulation(Boolean enableDeploySimulation) {
                this.enableDeploySimulation = enableDeploySimulation;
                return this;
            }

            /**
             * enableSiteSurvey.
             */
            public Builder enableSiteSurvey(Boolean enableSiteSurvey) {
                this.enableSiteSurvey = enableSiteSurvey;
                return this;
            }

            public AdvancedConfigs build() {
                return new AdvancedConfigs(this);
            } 

        } 

    }
}
