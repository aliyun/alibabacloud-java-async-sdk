// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link UpdateAdaptorRequest} extends {@link RequestModel}
 *
 * <p>UpdateAdaptorRequest</p>
 */
public class UpdateAdaptorRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AdaptorId")
    private String adaptorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppScript")
    private String appScript;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExecuteFileAddress")
    private String executeFileAddress;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OptimizeParam")
    private String optimizeParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SilenceParam")
    private String silenceParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserConfig")
    private UserConfig userConfig;

    private UpdateAdaptorRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.adaptorId = builder.adaptorId;
        this.appScript = builder.appScript;
        this.executeFileAddress = builder.executeFileAddress;
        this.optimizeParam = builder.optimizeParam;
        this.silenceParam = builder.silenceParam;
        this.userConfig = builder.userConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAdaptorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return adaptorId
     */
    public String getAdaptorId() {
        return this.adaptorId;
    }

    /**
     * @return appScript
     */
    public String getAppScript() {
        return this.appScript;
    }

    /**
     * @return executeFileAddress
     */
    public String getExecuteFileAddress() {
        return this.executeFileAddress;
    }

    /**
     * @return optimizeParam
     */
    public String getOptimizeParam() {
        return this.optimizeParam;
    }

    /**
     * @return silenceParam
     */
    public String getSilenceParam() {
        return this.silenceParam;
    }

    /**
     * @return userConfig
     */
    public UserConfig getUserConfig() {
        return this.userConfig;
    }

    public static final class Builder extends Request.Builder<UpdateAdaptorRequest, Builder> {
        private String regionId; 
        private String adaptorId; 
        private String appScript; 
        private String executeFileAddress; 
        private String optimizeParam; 
        private String silenceParam; 
        private UserConfig userConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAdaptorRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.adaptorId = request.adaptorId;
            this.appScript = request.appScript;
            this.executeFileAddress = request.executeFileAddress;
            this.optimizeParam = request.optimizeParam;
            this.silenceParam = request.silenceParam;
            this.userConfig = request.userConfig;
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
         * <p>The ID of the application adapter to be modified. This parameter is required and must belong to an application adapter manageable by the current account.</p>
         * 
         * <strong>example:</strong>
         * <p>adt-bp1example****</p>
         */
        public Builder adaptorId(String adaptorId) {
            this.putBodyParameter("AdaptorId", adaptorId);
            this.adaptorId = adaptorId;
            return this;
        }

        /**
         * <p><strong>Not enabled. Do not pass this parameter.</strong> This operation does not support modifying application scripts through this parameter.</p>
         * <p>The example &quot;Not applicable (not enabled)&quot; is only a description of the field status and is not a valid parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>Not applicable (not enabled)</p>
         */
        public Builder appScript(String appScript) {
            this.putBodyParameter("AppScript", appScript);
            this.appScript = appScript;
            return this;
        }

        /**
         * <p><strong>Not enabled. Do not pass this parameter.</strong> This operation does not support modifying executable file paths through this parameter.</p>
         * <p>The example &quot;Not applicable (not enabled)&quot; is only a description of the field status and is not a valid parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>Not applicable (not enabled)</p>
         */
        public Builder executeFileAddress(String executeFileAddress) {
            this.putBodyParameter("ExecuteFileAddress", executeFileAddress);
            this.executeFileAddress = executeFileAddress;
            return this;
        }

        /**
         * <p>The application optimization configuration, represented as a JSON object string. Pass this parameter only when specific optimization configuration requirements exist. The content must be a valid JSON object.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder optimizeParam(String optimizeParam) {
            this.putBodyParameter("OptimizeParam", optimizeParam);
            this.optimizeParam = optimizeParam;
            return this;
        }

        /**
         * <p>The command-line parameters used when the application starts. If not empty, this parameter is used to update the startup parameters of the application adapter. Specify the value based on the startup requirements of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>--lang=zh-CN</p>
         */
        public Builder silenceParam(String silenceParam) {
            this.putBodyParameter("SilenceParam", silenceParam);
            this.silenceParam = silenceParam;
            return this;
        }

        /**
         * <p>The application runtime configuration object. If this parameter is omitted, the existing user configuration is not modified.</p>
         * <p><strong>If passed, the original UserConfig is entirely replaced and not merged item by item.</strong> Submit the complete configuration and include the configuration items that need to be retained. Subfields that are not provided do not automatically inherit the original values.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;FixedResolution&quot;:&quot;1440x2560&quot;,&quot;DisconnectAction&quot;:&quot;KEEP_CURRENT&quot;,&quot;ShowWindow&quot;:&quot;HIDE&quot;}</p>
         */
        public Builder userConfig(UserConfig userConfig) {
            String userConfigShrink = shrink(userConfig, "UserConfig", "json");
            this.putBodyParameter("UserConfig", userConfigShrink);
            this.userConfig = userConfig;
            return this;
        }

        @Override
        public UpdateAdaptorRequest build() {
            return new UpdateAdaptorRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAdaptorRequest} extends {@link TeaModel}
     *
     * <p>UpdateAdaptorRequest</p>
     */
    public static class UserConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisconnectAction")
        private String disconnectAction;

        @com.aliyun.core.annotation.NameInMap("FixedResolution")
        private String fixedResolution;

        @com.aliyun.core.annotation.NameInMap("ShowWindow")
        private String showWindow;

        private UserConfig(Builder builder) {
            this.disconnectAction = builder.disconnectAction;
            this.fixedResolution = builder.fixedResolution;
            this.showWindow = builder.showWindow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserConfig create() {
            return builder().build();
        }

        /**
         * @return disconnectAction
         */
        public String getDisconnectAction() {
            return this.disconnectAction;
        }

        /**
         * @return fixedResolution
         */
        public String getFixedResolution() {
            return this.fixedResolution;
        }

        /**
         * @return showWindow
         */
        public String getShowWindow() {
            return this.showWindow;
        }

        public static final class Builder {
            private String disconnectAction; 
            private String fixedResolution; 
            private String showWindow; 

            private Builder() {
            } 

            private Builder(UserConfig model) {
                this.disconnectAction = model.disconnectAction;
                this.fixedResolution = model.fixedResolution;
                this.showWindow = model.showWindow;
            } 

            /**
             * <p>The processing policy after a connection is disconnected. When modifying other UserConfig configurations, if you need to retain the original policy, pass the original value in the complete configuration object. This operation does not automatically populate default values.</p>
             * 
             * <strong>example:</strong>
             * <p>KEEP_CURRENT</p>
             */
            public Builder disconnectAction(String disconnectAction) {
                this.disconnectAction = disconnectAction;
                return this;
            }

            /**
             * <p>The fixed resolution used when the application runs, in the format of width × height, in pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>1440x2560</p>
             */
            public Builder fixedResolution(String fixedResolution) {
                this.fixedResolution = fixedResolution;
                return this;
            }

            /**
             * <p>The application window display configuration. When modifying other UserConfig configurations, if you need to retain the original configuration, pass the original value in the complete configuration object. This operation does not automatically populate default values.</p>
             * 
             * <strong>example:</strong>
             * <p>HIDE</p>
             */
            public Builder showWindow(String showWindow) {
                this.showWindow = showWindow;
                return this;
            }

            public UserConfig build() {
                return new UserConfig(this);
            } 

        } 

    }
}
