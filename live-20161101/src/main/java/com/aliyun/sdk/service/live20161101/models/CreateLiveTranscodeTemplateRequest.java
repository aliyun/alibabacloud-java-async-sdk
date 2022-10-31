// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLiveTranscodeTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateLiveTranscodeTemplateRequest</p>
 */
public class CreateLiveTranscodeTemplateRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("TemplateConfig")
    @Validation(required = true)
    private String templateConfig;

    @Query
    @NameInMap("Type")
    private String type;

    private CreateLiveTranscodeTemplateRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
        this.templateConfig = builder.templateConfig;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLiveTranscodeTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return templateConfig
     */
    public String getTemplateConfig() {
        return this.templateConfig;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateLiveTranscodeTemplateRequest, Builder> {
        private Long ownerId; 
        private String securityToken; 
        private String templateConfig; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateLiveTranscodeTemplateRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.securityToken = request.securityToken;
            this.templateConfig = request.templateConfig;
            this.type = request.type;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
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
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateLiveTranscodeTemplateRequest build() {
            return new CreateLiveTranscodeTemplateRequest(this);
        } 

    } 

}
