// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteVehicleControlRequest} extends {@link RequestModel}
 *
 * <p>ExecuteVehicleControlRequest</p>
 */
public class ExecuteVehicleControlRequest extends Request {
    @Query
    @NameInMap("Command")
    @Validation(required = true)
    private String command;

    @Query
    @NameInMap("CommandParam")
    private String commandParam;

    @Query
    @NameInMap("DeviceId")
    private String deviceId;

    @Query
    @NameInMap("ProjectId")
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Vin")
    private String vin;

    private ExecuteVehicleControlRequest(Builder builder) {
        super(builder);
        this.command = builder.command;
        this.commandParam = builder.commandParam;
        this.deviceId = builder.deviceId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.vin = builder.vin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteVehicleControlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return command
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * @return commandParam
     */
    public String getCommandParam() {
        return this.commandParam;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vin
     */
    public String getVin() {
        return this.vin;
    }

    public static final class Builder extends Request.Builder<ExecuteVehicleControlRequest, Builder> {
        private String command; 
        private String commandParam; 
        private String deviceId; 
        private String projectId; 
        private String regionId; 
        private String vin; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteVehicleControlRequest response) {
            super(response);
            this.command = response.command;
            this.commandParam = response.commandParam;
            this.deviceId = response.deviceId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.vin = response.vin;
        } 

        /**
         * Command.
         */
        public Builder command(String command) {
            this.putQueryParameter("Command", command);
            this.command = command;
            return this;
        }

        /**
         * CommandParam.
         */
        public Builder commandParam(String commandParam) {
            this.putQueryParameter("CommandParam", commandParam);
            this.commandParam = commandParam;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Vin.
         */
        public Builder vin(String vin) {
            this.putQueryParameter("Vin", vin);
            this.vin = vin;
            return this;
        }

        @Override
        public ExecuteVehicleControlRequest build() {
            return new ExecuteVehicleControlRequest(this);
        } 

    } 

}
