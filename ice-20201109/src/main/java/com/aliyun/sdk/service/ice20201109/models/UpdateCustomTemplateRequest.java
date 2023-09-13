// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCustomTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateCustomTemplateRequest</p>
 */
public class UpdateCustomTemplateRequest extends Request {
    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("TemplateConfig")
    private String templateConfig;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    private UpdateCustomTemplateRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.templateConfig = builder.templateConfig;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<UpdateCustomTemplateRequest, Builder> {
        private String name; 
        private String templateConfig; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCustomTemplateRequest request) {
            super(request);
            this.name = request.name;
            this.templateConfig = request.templateConfig;
            this.templateId = request.templateId;
        } 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * TemplateConfig.
         */
        public Builder templateConfig(String templateConfig) {
            this.putQueryParameter("TemplateConfig", templateConfig);
            this.templateConfig = templateConfig;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public UpdateCustomTemplateRequest build() {
            return new UpdateCustomTemplateRequest(this);
        } 

    } 

}
