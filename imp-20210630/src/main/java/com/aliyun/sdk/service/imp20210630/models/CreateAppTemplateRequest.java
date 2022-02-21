// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateAppTemplateRequest</p>
 */
public class CreateAppTemplateRequest extends Request {
    @Body
    @NameInMap("AppTemplateName")
    @Validation(required = true)
    private String appTemplateName;

    @Body
    @NameInMap("ComponentList")
    @Validation(required = true)
    private java.util.List < String > componentList;

    @Body
    @NameInMap("IntegrationMode")
    private String integrationMode;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Scene")
    private String scene;

    private CreateAppTemplateRequest(Builder builder) {
        super(builder);
        this.appTemplateName = builder.appTemplateName;
        this.componentList = builder.componentList;
        this.integrationMode = builder.integrationMode;
        this.regionId = builder.regionId;
        this.scene = builder.scene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appTemplateName
     */
    public String getAppTemplateName() {
        return this.appTemplateName;
    }

    /**
     * @return componentList
     */
    public java.util.List < String > getComponentList() {
        return this.componentList;
    }

    /**
     * @return integrationMode
     */
    public String getIntegrationMode() {
        return this.integrationMode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    public static final class Builder extends Request.Builder<CreateAppTemplateRequest, Builder> {
        private String appTemplateName; 
        private java.util.List < String > componentList; 
        private String integrationMode; 
        private String regionId; 
        private String scene; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppTemplateRequest response) {
            super(response);
            this.appTemplateName = response.appTemplateName;
            this.componentList = response.componentList;
            this.integrationMode = response.integrationMode;
            this.regionId = response.regionId;
            this.scene = response.scene;
        } 

        /**
         * 应用模板名称
         */
        public Builder appTemplateName(String appTemplateName) {
            this.putBodyParameter("AppTemplateName", appTemplateName);
            this.appTemplateName = appTemplateName;
            return this;
        }

        /**
         * 组件列表
         */
        public Builder componentList(java.util.List < String > componentList) {
            this.putBodyParameter("ComponentList", componentList);
            this.componentList = componentList;
            return this;
        }

        /**
         * 集成方式（一体化SDK：paasSDK，样板间：standardRoom）
         */
        public Builder integrationMode(String integrationMode) {
            this.putBodyParameter("IntegrationMode", integrationMode);
            this.integrationMode = integrationMode;
            return this;
        }

        /**
         * 地域
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 应用模板场景，电商business，课堂classroom
         */
        public Builder scene(String scene) {
            this.putBodyParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        @Override
        public CreateAppTemplateRequest build() {
            return new CreateAppTemplateRequest(this);
        } 

    } 

}
