// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ApplyScenarioRequest} extends {@link RequestModel}
 *
 * <p>ApplyScenarioRequest</p>
 */
public class ApplyScenarioRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scenario")
    private String scenario;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sign")
    private String sign;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnDump")
    private Boolean snDump;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnForce")
    private Boolean snForce;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnStat")
    private Boolean snStat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnTransfer")
    private Boolean snTransfer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateOption")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.Map<String, ?> getConfig() {
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
        private java.util.Map<String, ?> config; 
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
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b590lhguqs@28f515462f******</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The configuration of the business monitoring job. The value is a JSON string. For more information about this parameter, see the following additional information about the <strong>Config</strong> parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;rpcType&quot;:&quot;0&quot;,&quot;nameMatchType&quot;:&quot;EQUALS&quot;,&quot;service&quot;:&quot;/api/pop/test&quot;,&quot;operator&quot;:&quot;and&quot;,&quot;filterItems&quot;:[{&quot;type&quot;:&quot;HttpHeaders&quot;,&quot;key&quot;:&quot;uid&quot;,&quot;opt&quot;:&quot;==&quot;,&quot;value&quot;:&quot;123456789&quot;}],&quot;group&quot;:{&quot;type&quot;:&quot;HttpRequestParameters&quot;,&quot;key&quot;:&quot;name&quot;}}</p>
         */
        public Builder config(java.util.Map<String, ?> config) {
            String configShrink = shrink(config, "Config", "json");
            this.putQueryParameter("Config", configShrink);
            this.config = config;
            return this;
        }

        /**
         * <p>The name of the business monitoring job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ScenarioName</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjaikou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The scenario where you want to use the business monitoring job. Valid values:</p>
         * <ul>
         * <li><code>USER-DEFINED</code>: user-defined. This is the default value.</li>
         * <li><code>EDAS-ROLLOUT</code>: application release in Enterprise Distributed Application Service (EDAS)</li>
         * <li><code>OAM-ROLLOUT</code>: application release based on Open Application Model (OAM)</li>
         * <li><code>MSC-CANARY</code>: canary release based on Microservice Engine (MSE)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER-DEFINED</p>
         */
        public Builder scenario(String scenario) {
            this.putQueryParameter("Scenario", scenario);
            this.scenario = scenario;
            return this;
        }

        /**
         * <p>The code of the business monitoring job. This parameter is not required when you create a business monitoring job. However, this parameter is required when you update a business monitoring job.</p>
         * 
         * <strong>example:</strong>
         * <p>a9f8****</p>
         */
        public Builder sign(String sign) {
            this.putQueryParameter("Sign", sign);
            this.sign = sign;
            return this;
        }

        /**
         * <p>Specifies whether to record business parameters to the trace marked with the coloring sign.</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code>: This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder snDump(Boolean snDump) {
            this.putQueryParameter("SnDump", snDump);
            this.snDump = snDump;
            return this;
        }

        /**
         * <p>Specifies whether traffic in the trace marked with the coloring sign is all collected.</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code>: This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder snForce(Boolean snForce) {
            this.putQueryParameter("SnForce", snForce);
            this.snForce = snForce;
            return this;
        }

        /**
         * <p>Specifies whether to count traffic based on the coloring sign.</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code>: This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder snStat(Boolean snStat) {
            this.putQueryParameter("SnStat", snStat);
            this.snStat = snStat;
            return this;
        }

        /**
         * <p>Specifies whether the coloring sign is transparently passed down to downstream application nodes in the trace.</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code>: This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder snTransfer(Boolean snTransfer) {
            this.putQueryParameter("SnTransfer", snTransfer);
            this.snTransfer = snTransfer;
            return this;
        }

        /**
         * <p>Specifies whether the operation is an update operation.</p>
         * <ul>
         * <li><code>true</code>: update</li>
         * <li><code>false</code>: insert</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
