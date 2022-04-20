// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppTemplateRequest</p>
 */
public class UpdateAppTemplateRequest extends Request {
    @Body
    @NameInMap("AppTemplateId")
    @Validation(required = true)
    private String appTemplateId;

    @Body
    @NameInMap("AppTemplateName")
    private String appTemplateName;

    @Body
    @NameInMap("ComponentList")
    private java.util.List < String > componentList;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private UpdateAppTemplateRequest(Builder builder) {
        super(builder);
        this.appTemplateId = builder.appTemplateId;
        this.appTemplateName = builder.appTemplateName;
        this.componentList = builder.componentList;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appTemplateId
     */
    public String getAppTemplateId() {
        return this.appTemplateId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateAppTemplateRequest, Builder> {
        private String appTemplateId; 
        private String appTemplateName; 
        private java.util.List < String > componentList; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppTemplateRequest request) {
            super(request);
            this.appTemplateId = request.appTemplateId;
            this.appTemplateName = request.appTemplateName;
            this.componentList = request.componentList;
            this.regionId = request.regionId;
        } 

        /**
         * 应用模板唯一标识
         */
        public Builder appTemplateId(String appTemplateId) {
            this.putBodyParameter("AppTemplateId", appTemplateId);
            this.appTemplateId = appTemplateId;
            return this;
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
            String componentListShrink = shrink(componentList, "ComponentList", "json");
            this.putBodyParameter("ComponentList", componentListShrink);
            this.componentList = componentList;
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

        @Override
        public UpdateAppTemplateRequest build() {
            return new UpdateAppTemplateRequest(this);
        } 

    } 

}
