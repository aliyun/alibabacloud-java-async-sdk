// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCompanyTemplateRequest} extends {@link RequestModel}
 *
 * <p>AddCompanyTemplateRequest</p>
 */
public class AddCompanyTemplateRequest extends Request {
    @Body
    @NameInMap("DeviceType")
    @Validation(required = true)
    private String deviceType;

    @Body
    @NameInMap("EslSize")
    @Validation(required = true)
    private String eslSize;

    @Body
    @NameInMap("ExtraParams")
    private String extraParams;

    @Body
    @NameInMap("GroupId")
    private String groupId;

    @Body
    @NameInMap("IfDefault")
    private Boolean ifDefault;

    @Body
    @NameInMap("IfMember")
    private Boolean ifMember;

    @Body
    @NameInMap("IfOutOfInventory")
    private Boolean ifOutOfInventory;

    @Body
    @NameInMap("IfPromotion")
    private Boolean ifPromotion;

    @Body
    @NameInMap("IfSourceCode")
    private Boolean ifSourceCode;

    @Body
    @NameInMap("Layout")
    @Validation(required = true, maximum = 2, minimum = 1)
    private Integer layout;

    @Body
    @NameInMap("Scene")
    private String scene;

    @Body
    @NameInMap("TemplateName")
    @Validation(required = true, maxLength = 128)
    private String templateName;

    @Body
    @NameInMap("TemplateSceneId")
    private String templateSceneId;

    @Body
    @NameInMap("TemplateType")
    private String templateType;

    @Body
    @NameInMap("TemplateVersion")
    @Validation(required = true)
    private String templateVersion;

    @Body
    @NameInMap("Vendor")
    private String vendor;

    private AddCompanyTemplateRequest(Builder builder) {
        super(builder);
        this.deviceType = builder.deviceType;
        this.eslSize = builder.eslSize;
        this.extraParams = builder.extraParams;
        this.groupId = builder.groupId;
        this.ifDefault = builder.ifDefault;
        this.ifMember = builder.ifMember;
        this.ifOutOfInventory = builder.ifOutOfInventory;
        this.ifPromotion = builder.ifPromotion;
        this.ifSourceCode = builder.ifSourceCode;
        this.layout = builder.layout;
        this.scene = builder.scene;
        this.templateName = builder.templateName;
        this.templateSceneId = builder.templateSceneId;
        this.templateType = builder.templateType;
        this.templateVersion = builder.templateVersion;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCompanyTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceType
     */
    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * @return eslSize
     */
    public String getEslSize() {
        return this.eslSize;
    }

    /**
     * @return extraParams
     */
    public String getExtraParams() {
        return this.extraParams;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return ifDefault
     */
    public Boolean getIfDefault() {
        return this.ifDefault;
    }

    /**
     * @return ifMember
     */
    public Boolean getIfMember() {
        return this.ifMember;
    }

    /**
     * @return ifOutOfInventory
     */
    public Boolean getIfOutOfInventory() {
        return this.ifOutOfInventory;
    }

    /**
     * @return ifPromotion
     */
    public Boolean getIfPromotion() {
        return this.ifPromotion;
    }

    /**
     * @return ifSourceCode
     */
    public Boolean getIfSourceCode() {
        return this.ifSourceCode;
    }

    /**
     * @return layout
     */
    public Integer getLayout() {
        return this.layout;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateSceneId
     */
    public String getTemplateSceneId() {
        return this.templateSceneId;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    /**
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<AddCompanyTemplateRequest, Builder> {
        private String deviceType; 
        private String eslSize; 
        private String extraParams; 
        private String groupId; 
        private Boolean ifDefault; 
        private Boolean ifMember; 
        private Boolean ifOutOfInventory; 
        private Boolean ifPromotion; 
        private Boolean ifSourceCode; 
        private Integer layout; 
        private String scene; 
        private String templateName; 
        private String templateSceneId; 
        private String templateType; 
        private String templateVersion; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(AddCompanyTemplateRequest request) {
            super(request);
            this.deviceType = request.deviceType;
            this.eslSize = request.eslSize;
            this.extraParams = request.extraParams;
            this.groupId = request.groupId;
            this.ifDefault = request.ifDefault;
            this.ifMember = request.ifMember;
            this.ifOutOfInventory = request.ifOutOfInventory;
            this.ifPromotion = request.ifPromotion;
            this.ifSourceCode = request.ifSourceCode;
            this.layout = request.layout;
            this.scene = request.scene;
            this.templateName = request.templateName;
            this.templateSceneId = request.templateSceneId;
            this.templateType = request.templateType;
            this.templateVersion = request.templateVersion;
            this.vendor = request.vendor;
        } 

        /**
         * DeviceType.
         */
        public Builder deviceType(String deviceType) {
            this.putBodyParameter("DeviceType", deviceType);
            this.deviceType = deviceType;
            return this;
        }

        /**
         * EslSize.
         */
        public Builder eslSize(String eslSize) {
            this.putBodyParameter("EslSize", eslSize);
            this.eslSize = eslSize;
            return this;
        }

        /**
         * ExtraParams.
         */
        public Builder extraParams(String extraParams) {
            this.putBodyParameter("ExtraParams", extraParams);
            this.extraParams = extraParams;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * IfDefault.
         */
        public Builder ifDefault(Boolean ifDefault) {
            this.putBodyParameter("IfDefault", ifDefault);
            this.ifDefault = ifDefault;
            return this;
        }

        /**
         * IfMember.
         */
        public Builder ifMember(Boolean ifMember) {
            this.putBodyParameter("IfMember", ifMember);
            this.ifMember = ifMember;
            return this;
        }

        /**
         * IfOutOfInventory.
         */
        public Builder ifOutOfInventory(Boolean ifOutOfInventory) {
            this.putBodyParameter("IfOutOfInventory", ifOutOfInventory);
            this.ifOutOfInventory = ifOutOfInventory;
            return this;
        }

        /**
         * IfPromotion.
         */
        public Builder ifPromotion(Boolean ifPromotion) {
            this.putBodyParameter("IfPromotion", ifPromotion);
            this.ifPromotion = ifPromotion;
            return this;
        }

        /**
         * IfSourceCode.
         */
        public Builder ifSourceCode(Boolean ifSourceCode) {
            this.putBodyParameter("IfSourceCode", ifSourceCode);
            this.ifSourceCode = ifSourceCode;
            return this;
        }

        /**
         * Layout.
         */
        public Builder layout(Integer layout) {
            this.putBodyParameter("Layout", layout);
            this.layout = layout;
            return this;
        }

        /**
         * Scene.
         */
        public Builder scene(String scene) {
            this.putBodyParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putBodyParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * TemplateSceneId.
         */
        public Builder templateSceneId(String templateSceneId) {
            this.putBodyParameter("TemplateSceneId", templateSceneId);
            this.templateSceneId = templateSceneId;
            return this;
        }

        /**
         * TemplateType.
         */
        public Builder templateType(String templateType) {
            this.putBodyParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        /**
         * TemplateVersion.
         */
        public Builder templateVersion(String templateVersion) {
            this.putBodyParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.putBodyParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public AddCompanyTemplateRequest build() {
            return new AddCompanyTemplateRequest(this);
        } 

    } 

}
