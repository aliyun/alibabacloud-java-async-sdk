// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddVodTemplateRequest} extends {@link RequestModel}
 *
 * <p>AddVodTemplateRequest</p>
 */
public class AddVodTemplateRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("TemplateConfig")
    @Validation(required = true)
    private String templateConfig;

    @Query
    @NameInMap("TemplateType")
    @Validation(required = true)
    private String templateType;

    private AddVodTemplateRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.name = builder.name;
        this.templateConfig = builder.templateConfig;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddVodTemplateRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return templateConfig
     */
    public String getTemplateConfig() {
        return this.templateConfig;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<AddVodTemplateRequest, Builder> {
        private String appId; 
        private String name; 
        private String templateConfig; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(AddVodTemplateRequest request) {
            super(request);
            this.appId = request.appId;
            this.name = request.name;
            this.templateConfig = request.templateConfig;
            this.templateType = request.templateType;
        } 

        /**
         * Creates a snapshot template.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The ID of the application. Default value: **app-1000000**. For more information, see [Overview](~~113600~~).
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **AddVodTemplate**.
         */
        public Builder templateConfig(String templateConfig) {
            this.putQueryParameter("TemplateConfig", templateConfig);
            this.templateConfig = templateConfig;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public AddVodTemplateRequest build() {
            return new AddVodTemplateRequest(this);
        } 

    } 

}
