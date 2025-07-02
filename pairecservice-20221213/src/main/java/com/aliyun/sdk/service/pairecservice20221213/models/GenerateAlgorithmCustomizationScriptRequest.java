// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link GenerateAlgorithmCustomizationScriptRequest} extends {@link RequestModel}
 *
 * <p>GenerateAlgorithmCustomizationScriptRequest</p>
 */
public class GenerateAlgorithmCustomizationScriptRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("AlgorithmCustomizationId")
    private String algorithmCustomizationId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeployMode")
    private String deployMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModuleFieldTypes")
    private java.util.Map<String, ?> moduleFieldTypes;

    private GenerateAlgorithmCustomizationScriptRequest(Builder builder) {
        super(builder);
        this.algorithmCustomizationId = builder.algorithmCustomizationId;
        this.regionId = builder.regionId;
        this.deployMode = builder.deployMode;
        this.instanceId = builder.instanceId;
        this.moduleFieldTypes = builder.moduleFieldTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateAlgorithmCustomizationScriptRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmCustomizationId
     */
    public String getAlgorithmCustomizationId() {
        return this.algorithmCustomizationId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return deployMode
     */
    public String getDeployMode() {
        return this.deployMode;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return moduleFieldTypes
     */
    public java.util.Map<String, ?> getModuleFieldTypes() {
        return this.moduleFieldTypes;
    }

    public static final class Builder extends Request.Builder<GenerateAlgorithmCustomizationScriptRequest, Builder> {
        private String algorithmCustomizationId; 
        private String regionId; 
        private String deployMode; 
        private String instanceId; 
        private java.util.Map<String, ?> moduleFieldTypes; 

        private Builder() {
            super();
        } 

        private Builder(GenerateAlgorithmCustomizationScriptRequest request) {
            super(request);
            this.algorithmCustomizationId = request.algorithmCustomizationId;
            this.regionId = request.regionId;
            this.deployMode = request.deployMode;
            this.instanceId = request.instanceId;
            this.moduleFieldTypes = request.moduleFieldTypes;
        } 

        /**
         * AlgorithmCustomizationId.
         */
        public Builder algorithmCustomizationId(String algorithmCustomizationId) {
            this.putPathParameter("AlgorithmCustomizationId", algorithmCustomizationId);
            this.algorithmCustomizationId = algorithmCustomizationId;
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
         * DeployMode.
         */
        public Builder deployMode(String deployMode) {
            this.putBodyParameter("DeployMode", deployMode);
            this.deployMode = deployMode;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ModuleFieldTypes.
         */
        public Builder moduleFieldTypes(java.util.Map<String, ?> moduleFieldTypes) {
            this.putBodyParameter("ModuleFieldTypes", moduleFieldTypes);
            this.moduleFieldTypes = moduleFieldTypes;
            return this;
        }

        @Override
        public GenerateAlgorithmCustomizationScriptRequest build() {
            return new GenerateAlgorithmCustomizationScriptRequest(this);
        } 

    } 

}
