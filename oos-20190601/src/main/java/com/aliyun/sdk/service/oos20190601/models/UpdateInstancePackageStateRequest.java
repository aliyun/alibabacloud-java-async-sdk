// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link UpdateInstancePackageStateRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstancePackageStateRequest</p>
 */
public class UpdateInstancePackageStateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigureAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configureAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map<String, ?> parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateVersion")
    private String templateVersion;

    private UpdateInstancePackageStateRequest(Builder builder) {
        super(builder);
        this.configureAction = builder.configureAction;
        this.instanceId = builder.instanceId;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.templateName = builder.templateName;
        this.templateVersion = builder.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstancePackageStateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configureAction
     */
    public String getConfigureAction() {
        return this.configureAction;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return parameters
     */
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static final class Builder extends Request.Builder<UpdateInstancePackageStateRequest, Builder> {
        private String configureAction; 
        private String instanceId; 
        private java.util.Map<String, ?> parameters; 
        private String regionId; 
        private String templateName; 
        private String templateVersion; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstancePackageStateRequest request) {
            super(request);
            this.configureAction = request.configureAction;
            this.instanceId = request.instanceId;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.templateName = request.templateName;
            this.templateVersion = request.templateVersion;
        } 

        /**
         * <p>The operation type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>uninstall</li>
         * <li>install</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>install</p>
         */
        public Builder configureAction(String configureAction) {
            this.putQueryParameter("ConfigureAction", configureAction);
            this.configureAction = configureAction;
            return this;
        }

        /**
         * <p>The ID of the Elastic Compute Service (ECS) instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1jaxa2bs4bps7*****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The parameters for installing or uninstalling the extensions.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;username&quot;: &quot;xx&quot;}</p>
         */
        public Builder parameters(java.util.Map<String, ?> parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putQueryParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS-ECS-InventoryDataCollection</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The version of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder templateVersion(String templateVersion) {
            this.putQueryParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        @Override
        public UpdateInstancePackageStateRequest build() {
            return new UpdateInstancePackageStateRequest(this);
        } 

    } 

}
