// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link UpdateMessageAppRequest} extends {@link RequestModel}
 *
 * <p>UpdateMessageAppRequest</p>
 */
public class UpdateMessageAppRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppConfig")
    private java.util.Map<String, String> appConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Extension")
    private java.util.Map<String, String> extension;

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
    public java.util.Map<String, String> getAppConfig() {
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
    public java.util.Map<String, String> getExtension() {
        return this.extension;
    }

    public static final class Builder extends Request.Builder<UpdateMessageAppRequest, Builder> {
        private java.util.Map<String, String> appConfig; 
        private String appId; 
        private String appName; 
        private java.util.Map<String, String> extension; 

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
         * <p>The configurations of the application.</p>
         */
        public Builder appConfig(java.util.Map<String, String> appConfig) {
            String appConfigShrink = shrink(appConfig, "AppConfig", "json");
            this.putBodyParameter("AppConfig", appConfigShrink);
            this.appConfig = appConfig;
            return this;
        }

        /**
         * <p>The ID of the interactive messaging application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VKL3***</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The name of the interactive messaging application.</p>
         * 
         * <strong>example:</strong>
         * <p>testApp</p>
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The extended field.</p>
         */
        public Builder extension(java.util.Map<String, String> extension) {
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
