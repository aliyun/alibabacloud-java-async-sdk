// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEdgeDriverVersionRequest} extends {@link RequestModel}
 *
 * <p>UpdateEdgeDriverVersionRequest</p>
 */
public class UpdateEdgeDriverVersionRequest extends Request {
    @Query
    @NameInMap("Argument")
    private String argument;

    @Query
    @NameInMap("ConfigCheckRule")
    private String configCheckRule;

    @Query
    @NameInMap("ContainerConfig")
    private String containerConfig;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DriverConfig")
    private String driverConfig;

    @Query
    @NameInMap("DriverId")
    @Validation(required = true)
    private String driverId;

    @Query
    @NameInMap("DriverVersion")
    @Validation(required = true)
    private String driverVersion;

    @Query
    @NameInMap("EdgeVersion")
    @Validation(required = true)
    private String edgeVersion;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("SourceConfig")
    private String sourceConfig;

    private UpdateEdgeDriverVersionRequest(Builder builder) {
        super(builder);
        this.argument = builder.argument;
        this.configCheckRule = builder.configCheckRule;
        this.containerConfig = builder.containerConfig;
        this.description = builder.description;
        this.driverConfig = builder.driverConfig;
        this.driverId = builder.driverId;
        this.driverVersion = builder.driverVersion;
        this.edgeVersion = builder.edgeVersion;
        this.iotInstanceId = builder.iotInstanceId;
        this.sourceConfig = builder.sourceConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEdgeDriverVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return argument
     */
    public String getArgument() {
        return this.argument;
    }

    /**
     * @return configCheckRule
     */
    public String getConfigCheckRule() {
        return this.configCheckRule;
    }

    /**
     * @return containerConfig
     */
    public String getContainerConfig() {
        return this.containerConfig;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return driverConfig
     */
    public String getDriverConfig() {
        return this.driverConfig;
    }

    /**
     * @return driverId
     */
    public String getDriverId() {
        return this.driverId;
    }

    /**
     * @return driverVersion
     */
    public String getDriverVersion() {
        return this.driverVersion;
    }

    /**
     * @return edgeVersion
     */
    public String getEdgeVersion() {
        return this.edgeVersion;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return sourceConfig
     */
    public String getSourceConfig() {
        return this.sourceConfig;
    }

    public static final class Builder extends Request.Builder<UpdateEdgeDriverVersionRequest, Builder> {
        private String argument; 
        private String configCheckRule; 
        private String containerConfig; 
        private String description; 
        private String driverConfig; 
        private String driverId; 
        private String driverVersion; 
        private String edgeVersion; 
        private String iotInstanceId; 
        private String sourceConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEdgeDriverVersionRequest request) {
            super(request);
            this.argument = request.argument;
            this.configCheckRule = request.configCheckRule;
            this.containerConfig = request.containerConfig;
            this.description = request.description;
            this.driverConfig = request.driverConfig;
            this.driverId = request.driverId;
            this.driverVersion = request.driverVersion;
            this.edgeVersion = request.edgeVersion;
            this.iotInstanceId = request.iotInstanceId;
            this.sourceConfig = request.sourceConfig;
        } 

        /**
         * Argument.
         */
        public Builder argument(String argument) {
            this.putQueryParameter("Argument", argument);
            this.argument = argument;
            return this;
        }

        /**
         * ConfigCheckRule.
         */
        public Builder configCheckRule(String configCheckRule) {
            this.putQueryParameter("ConfigCheckRule", configCheckRule);
            this.configCheckRule = configCheckRule;
            return this;
        }

        /**
         * ContainerConfig.
         */
        public Builder containerConfig(String containerConfig) {
            this.putQueryParameter("ContainerConfig", containerConfig);
            this.containerConfig = containerConfig;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DriverConfig.
         */
        public Builder driverConfig(String driverConfig) {
            this.putQueryParameter("DriverConfig", driverConfig);
            this.driverConfig = driverConfig;
            return this;
        }

        /**
         * DriverId.
         */
        public Builder driverId(String driverId) {
            this.putQueryParameter("DriverId", driverId);
            this.driverId = driverId;
            return this;
        }

        /**
         * DriverVersion.
         */
        public Builder driverVersion(String driverVersion) {
            this.putQueryParameter("DriverVersion", driverVersion);
            this.driverVersion = driverVersion;
            return this;
        }

        /**
         * EdgeVersion.
         */
        public Builder edgeVersion(String edgeVersion) {
            this.putQueryParameter("EdgeVersion", edgeVersion);
            this.edgeVersion = edgeVersion;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * SourceConfig.
         */
        public Builder sourceConfig(String sourceConfig) {
            this.putQueryParameter("SourceConfig", sourceConfig);
            this.sourceConfig = sourceConfig;
            return this;
        }

        @Override
        public UpdateEdgeDriverVersionRequest build() {
            return new UpdateEdgeDriverVersionRequest(this);
        } 

    } 

}
