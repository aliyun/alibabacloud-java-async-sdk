// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMessageAppRequest} extends {@link RequestModel}
 *
 * <p>CreateMessageAppRequest</p>
 */
public class CreateMessageAppRequest extends Request {
    @Body
    @NameInMap("AppConfig")
    private java.util.Map < String, String > appConfig;

    @Body
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Body
    @NameInMap("Extension")
    private java.util.Map < String, String > extension;

    private CreateMessageAppRequest(Builder builder) {
        super(builder);
        this.appConfig = builder.appConfig;
        this.appName = builder.appName;
        this.extension = builder.extension;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMessageAppRequest create() {
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

    public static final class Builder extends Request.Builder<CreateMessageAppRequest, Builder> {
        private java.util.Map < String, String > appConfig; 
        private String appName; 
        private java.util.Map < String, String > extension; 

        private Builder() {
            super();
        } 

        private Builder(CreateMessageAppRequest request) {
            super(request);
            this.appConfig = request.appConfig;
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
        public CreateMessageAppRequest build() {
            return new CreateMessageAppRequest(this);
        } 

    } 

}
