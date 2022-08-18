// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicationRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationRequest</p>
 */
public class CreateApplicationRequest extends Request {
    @Query
    @NameInMap("ApplicationName")
    @Validation(required = true, maxLength = 64)
    private String applicationName;

    @Query
    @NameInMap("ApplicationSourceType")
    @Validation(required = true, maxLength = 64)
    private String applicationSourceType;

    @Query
    @NameInMap("ApplicationTemplateId")
    private String applicationTemplateId;

    @Query
    @NameInMap("Description")
    @Validation(maxLength = 128)
    private String description;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true, maxLength = 64)
    private String instanceId;

    @Query
    @NameInMap("LogoUrl")
    @Validation(maxLength = 128)
    private String logoUrl;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SsoType")
    @Validation(required = true, maxLength = 64)
    private String ssoType;

    private CreateApplicationRequest(Builder builder) {
        super(builder);
        this.applicationName = builder.applicationName;
        this.applicationSourceType = builder.applicationSourceType;
        this.applicationTemplateId = builder.applicationTemplateId;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.logoUrl = builder.logoUrl;
        this.regionId = builder.regionId;
        this.ssoType = builder.ssoType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return applicationSourceType
     */
    public String getApplicationSourceType() {
        return this.applicationSourceType;
    }

    /**
     * @return applicationTemplateId
     */
    public String getApplicationTemplateId() {
        return this.applicationTemplateId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return logoUrl
     */
    public String getLogoUrl() {
        return this.logoUrl;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ssoType
     */
    public String getSsoType() {
        return this.ssoType;
    }

    public static final class Builder extends Request.Builder<CreateApplicationRequest, Builder> {
        private String applicationName; 
        private String applicationSourceType; 
        private String applicationTemplateId; 
        private String description; 
        private String instanceId; 
        private String logoUrl; 
        private String regionId; 
        private String ssoType; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationRequest request) {
            super(request);
            this.applicationName = request.applicationName;
            this.applicationSourceType = request.applicationSourceType;
            this.applicationTemplateId = request.applicationTemplateId;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.logoUrl = request.logoUrl;
            this.regionId = request.regionId;
            this.ssoType = request.ssoType;
        } 

        /**
         * 应用的表示名称
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * 创建应用的来源类型，标准协议 or 模板应用 or 自建应用
         */
        public Builder applicationSourceType(String applicationSourceType) {
            this.putQueryParameter("ApplicationSourceType", applicationSourceType);
            this.applicationSourceType = applicationSourceType;
            return this;
        }

        /**
         * 应用创建来源为模板应用时必须指定
         */
        public Builder applicationTemplateId(String applicationTemplateId) {
            this.putQueryParameter("ApplicationTemplateId", applicationTemplateId);
            this.applicationTemplateId = applicationTemplateId;
            return this;
        }

        /**
         * 应用的描述信息
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * IDaaS EIAM的实例id
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 应用Logo地址
         */
        public Builder logoUrl(String logoUrl) {
            this.putQueryParameter("LogoUrl", logoUrl);
            this.logoUrl = logoUrl;
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
         * 单点登录类型，saml2 or oidc
         */
        public Builder ssoType(String ssoType) {
            this.putQueryParameter("SsoType", ssoType);
            this.ssoType = ssoType;
            return this;
        }

        @Override
        public CreateApplicationRequest build() {
            return new CreateApplicationRequest(this);
        } 

    } 

}
