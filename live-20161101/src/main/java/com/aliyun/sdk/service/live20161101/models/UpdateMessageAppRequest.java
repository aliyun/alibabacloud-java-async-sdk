// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMessageAppRequest} extends {@link RequestModel}
 *
 * <p>UpdateMessageAppRequest</p>
 */
public class UpdateMessageAppRequest extends Request {
    @Body
    @NameInMap("AppConfig")
    private java.util.Map < String, String > appConfig;

    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("AppName")
    private String appName;

    @Body
    @NameInMap("Extension")
    private java.util.Map < String, String > extension;

    private UpdateMessageAppRequest(Builder builder) {
        super(builder);
        this.appConfig = builder.appConfig;
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.extension = builder.extension;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMessageAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appConfig
     */
    public java.util.Map < String, String > getAppConfig() {
        return this.appConfig;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return extension
     */
    public java.util.Map < String, String > getExtension() {
        return this.extension;
    }

    public static final class Builder extends Request.Builder<UpdateMessageAppRequest, Builder> {
        private java.util.Map < String, String > appConfig; 
        private String appId; 
        private String appName; 
        private java.util.Map < String, String > extension; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMessageAppRequest request) {
            super(request);
            this.appConfig = request.appConfig;
            this.appId = request.appId;
            this.appName = request.appName;
            this.extension = request.extension;
        } 

        /**
         * AppConfig.
         */
        public Builder appConfig(java.util.Map < String, String > appConfig) {
            String appConfigShrink = shrink(appConfig, "AppConfig", "json");
            this.putBodyParameter("AppConfig", appConfigShrink);
            this.appConfig = appConfig;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * Extension.
         */
        public Builder extension(java.util.Map < String, String > extension) {
            String extensionShrink = shrink(extension, "Extension", "json");
            this.putBodyParameter("Extension", extensionShrink);
            this.extension = extension;
            return this;
        }

        @Override
        public UpdateMessageAppRequest build() {
            return new UpdateMessageAppRequest(this);
        } 

    } 

}
