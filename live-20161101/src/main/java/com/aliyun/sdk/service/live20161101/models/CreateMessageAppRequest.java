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
 * {@link CreateMessageAppRequest} extends {@link RequestModel}
 *
 * <p>CreateMessageAppRequest</p>
 */
public class CreateMessageAppRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppConfig")
    private java.util.Map<String, String> appConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Extension")
    private java.util.Map<String, String> extension;

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
    public java.util.Map<String, String> getAppConfig() {
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
    public java.util.Map<String, String> getExtension() {
        return this.extension;
    }

    public static final class Builder extends Request.Builder<CreateMessageAppRequest, Builder> {
        private java.util.Map<String, String> appConfig; 
        private String appName; 
        private java.util.Map<String, String> extension; 

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
         * <p>The configurations of the application.</p>
         */
        public Builder appConfig(java.util.Map<String, String> appConfig) {
            String appConfigShrink = shrink(appConfig, "AppConfig", "json");
            this.putBodyParameter("AppConfig", appConfigShrink);
            this.appConfig = appConfig;
            return this;
        }

        /**
         * <p>The name of the interactive message application. The name must be 2 to 16 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The extended fields.</p>
         */
        public Builder extension(java.util.Map<String, String> extension) {
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
