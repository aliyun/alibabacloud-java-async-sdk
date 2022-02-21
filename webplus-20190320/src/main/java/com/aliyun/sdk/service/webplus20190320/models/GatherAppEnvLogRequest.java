// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GatherAppEnvLogRequest} extends {@link RequestModel}
 *
 * <p>GatherAppEnvLogRequest</p>
 */
public class GatherAppEnvLogRequest extends Request {
    @Body
    @NameInMap("EnvId")
    private String envId;

    @Body
    @NameInMap("LogPath")
    private String logPath;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("TargetInstances")
    private String targetInstances;

    private GatherAppEnvLogRequest(Builder builder) {
        super(builder);
        this.envId = builder.envId;
        this.logPath = builder.logPath;
        this.regionId = builder.regionId;
        this.targetInstances = builder.targetInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GatherAppEnvLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return envId
     */
    public String getEnvId() {
        return this.envId;
    }

    /**
     * @return logPath
     */
    public String getLogPath() {
        return this.logPath;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return targetInstances
     */
    public String getTargetInstances() {
        return this.targetInstances;
    }

    public static final class Builder extends Request.Builder<GatherAppEnvLogRequest, Builder> {
        private String envId; 
        private String logPath; 
        private String regionId; 
        private String targetInstances; 

        private Builder() {
            super();
        } 

        private Builder(GatherAppEnvLogRequest response) {
            super(response);
            this.envId = response.envId;
            this.logPath = response.logPath;
            this.regionId = response.regionId;
            this.targetInstances = response.targetInstances;
        } 

        /**
         * EnvId.
         */
        public Builder envId(String envId) {
            this.putBodyParameter("EnvId", envId);
            this.envId = envId;
            return this;
        }

        /**
         * LogPath.
         */
        public Builder logPath(String logPath) {
            this.putBodyParameter("LogPath", logPath);
            this.logPath = logPath;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TargetInstances.
         */
        public Builder targetInstances(String targetInstances) {
            this.putBodyParameter("TargetInstances", targetInstances);
            this.targetInstances = targetInstances;
            return this;
        }

        @Override
        public GatherAppEnvLogRequest build() {
            return new GatherAppEnvLogRequest(this);
        } 

    } 

}
