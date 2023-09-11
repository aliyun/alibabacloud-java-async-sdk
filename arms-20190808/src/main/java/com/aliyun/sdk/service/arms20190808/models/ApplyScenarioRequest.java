// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyScenarioRequest} extends {@link RequestModel}
 *
 * <p>ApplyScenarioRequest</p>
 */
public class ApplyScenarioRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Config")
    @Validation(required = true)
    private java.util.Map < String, ? > config;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Scenario")
    private String scenario;

    @Query
    @NameInMap("Sign")
    private String sign;

    @Query
    @NameInMap("SnDump")
    private Boolean snDump;

    @Query
    @NameInMap("SnForce")
    private Boolean snForce;

    @Query
    @NameInMap("SnStat")
    private Boolean snStat;

    @Query
    @NameInMap("SnTransfer")
    private Boolean snTransfer;

    @Query
    @NameInMap("UpdateOption")
    @Validation(required = true)
    private Boolean updateOption;

    private ApplyScenarioRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.config = builder.config;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.scenario = builder.scenario;
        this.sign = builder.sign;
        this.snDump = builder.snDump;
        this.snForce = builder.snForce;
        this.snStat = builder.snStat;
        this.snTransfer = builder.snTransfer;
        this.updateOption = builder.updateOption;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyScenarioRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return config
     */
    public java.util.Map < String, ? > getConfig() {
        return this.config;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scenario
     */
    public String getScenario() {
        return this.scenario;
    }

    /**
     * @return sign
     */
    public String getSign() {
        return this.sign;
    }

    /**
     * @return snDump
     */
    public Boolean getSnDump() {
        return this.snDump;
    }

    /**
     * @return snForce
     */
    public Boolean getSnForce() {
        return this.snForce;
    }

    /**
     * @return snStat
     */
    public Boolean getSnStat() {
        return this.snStat;
    }

    /**
     * @return snTransfer
     */
    public Boolean getSnTransfer() {
        return this.snTransfer;
    }

    /**
     * @return updateOption
     */
    public Boolean getUpdateOption() {
        return this.updateOption;
    }

    public static final class Builder extends Request.Builder<ApplyScenarioRequest, Builder> {
        private String appId; 
        private java.util.Map < String, ? > config; 
        private String name; 
        private String regionId; 
        private String scenario; 
        private String sign; 
        private Boolean snDump; 
        private Boolean snForce; 
        private Boolean snStat; 
        private Boolean snTransfer; 
        private Boolean updateOption; 

        private Builder() {
            super();
        } 

        private Builder(ApplyScenarioRequest request) {
            super(request);
            this.appId = request.appId;
            this.config = request.config;
            this.name = request.name;
            this.regionId = request.regionId;
            this.scenario = request.scenario;
            this.sign = request.sign;
            this.snDump = request.snDump;
            this.snForce = request.snForce;
            this.snStat = request.snStat;
            this.snTransfer = request.snTransfer;
            this.updateOption = request.updateOption;
        } 

        /**
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The configuration of the business monitoring job. The value is a JSON string. For more information about this parameter, see the following additional information about the **Config** parameter.
         */
        public Builder config(java.util.Map < String, ? > config) {
            String configShrink = shrink(config, "Config", "json");
            this.putQueryParameter("Config", configShrink);
            this.config = config;
            return this;
        }

        /**
         * The name of the business monitoring job.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The scenario where you want to use the business monitoring job. Valid values:
         * <p>
         * 
         * *   `USER-DEFINED`: user-defined. This is the default value.
         * *   `EDAS-ROLLOUT`: application release in Enterprise Distributed Application Service (EDAS)
         * *   `OAM-ROLLOUT`: application release based on Open Application Model (OAM)
         * *   `MSC-CANARY`: canary release based on Microservice Engine (MSE)
         */
        public Builder scenario(String scenario) {
            this.putQueryParameter("Scenario", scenario);
            this.scenario = scenario;
            return this;
        }

        /**
         * The code of the business monitoring job. This parameter is not required when you create a business monitoring job. However, this parameter is required when you update a business monitoring job.
         */
        public Builder sign(String sign) {
            this.putQueryParameter("Sign", sign);
            this.sign = sign;
            return this;
        }

        /**
         * Specifies whether to record business parameters to the trace marked with the coloring sign.
         * <p>
         * 
         * *   `true`
         * *   `false`: This is the default value.
         */
        public Builder snDump(Boolean snDump) {
            this.putQueryParameter("SnDump", snDump);
            this.snDump = snDump;
            return this;
        }

        /**
         * Specifies whether traffic in the trace marked with the coloring sign is all collected.
         * <p>
         * 
         * *   `true`
         * *   `false`: This is the default value.
         */
        public Builder snForce(Boolean snForce) {
            this.putQueryParameter("SnForce", snForce);
            this.snForce = snForce;
            return this;
        }

        /**
         * Specifies whether to count traffic based on the coloring sign.
         * <p>
         * 
         * *   `true`
         * *   `false`: This is the default value.
         */
        public Builder snStat(Boolean snStat) {
            this.putQueryParameter("SnStat", snStat);
            this.snStat = snStat;
            return this;
        }

        /**
         * Specifies whether the coloring sign is transparently passed down to downstream application nodes in the trace.
         * <p>
         * 
         * *   `true`
         * *   `false`: This is the default value.
         */
        public Builder snTransfer(Boolean snTransfer) {
            this.putQueryParameter("SnTransfer", snTransfer);
            this.snTransfer = snTransfer;
            return this;
        }

        /**
         * Specifies whether the operation is an update operation.
         * <p>
         * 
         * *   `true`: update
         * *   `false`: insert
         */
        public Builder updateOption(Boolean updateOption) {
            this.putQueryParameter("UpdateOption", updateOption);
            this.updateOption = updateOption;
            return this;
        }

        @Override
        public ApplyScenarioRequest build() {
            return new ApplyScenarioRequest(this);
        } 

    } 

}
