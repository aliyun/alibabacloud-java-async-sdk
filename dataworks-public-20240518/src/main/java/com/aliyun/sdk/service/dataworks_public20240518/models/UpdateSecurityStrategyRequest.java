// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link UpdateSecurityStrategyRequest} extends {@link RequestModel}
 *
 * <p>UpdateSecurityStrategyRequest</p>
 */
public class UpdateSecurityStrategyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private Content content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Workspaces")
    private java.util.List<Long> workspaces;

    private UpdateSecurityStrategyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.content = builder.content;
        this.description = builder.description;
        this.id = builder.id;
        this.name = builder.name;
        this.workspaces = builder.workspaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSecurityStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return workspaces
     */
    public java.util.List<Long> getWorkspaces() {
        return this.workspaces;
    }

    public static final class Builder extends Request.Builder<UpdateSecurityStrategyRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private Content content; 
        private String description; 
        private Long id; 
        private String name; 
        private java.util.List<Long> workspaces; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSecurityStrategyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.content = request.content;
            this.description = request.description;
            this.id = request.id;
            this.name = request.name;
            this.workspaces = request.workspaces;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder content(Content content) {
            String contentShrink = shrink(content, "Content", "json");
            this.putBodyParameter("Content", contentShrink);
            this.content = content;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Workspaces.
         */
        public Builder workspaces(java.util.List<Long> workspaces) {
            String workspacesShrink = shrink(workspaces, "Workspaces", "json");
            this.putBodyParameter("Workspaces", workspacesShrink);
            this.workspaces = workspaces;
            return this;
        }

        @Override
        public UpdateSecurityStrategyRequest build() {
            return new UpdateSecurityStrategyRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateSecurityStrategyRequest} extends {@link TeaModel}
     *
     * <p>UpdateSecurityStrategyRequest</p>
     */
    public static class Controllers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BasicEditionDefaultValue")
        private Object basicEditionDefaultValue;

        @com.aliyun.core.annotation.NameInMap("BasicEditionIntervalValue")
        private java.util.List<Integer> basicEditionIntervalValue;

        @com.aliyun.core.annotation.NameInMap("Controller")
        private String controller;

        @com.aliyun.core.annotation.NameInMap("ControllerValueType")
        private String controllerValueType;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("DisplayNameEn")
        private String displayNameEn;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("EnterpriseEditionDefaultValue")
        private Object enterpriseEditionDefaultValue;

        @com.aliyun.core.annotation.NameInMap("EnterpriseEditionIntervalValue")
        private java.util.List<Integer> enterpriseEditionIntervalValue;

        @com.aliyun.core.annotation.NameInMap("ProfessionalEditionDefaultValue")
        private Object professionalEditionDefaultValue;

        @com.aliyun.core.annotation.NameInMap("ProfessionalEditionIntervalValue")
        private java.util.List<Integer> professionalEditionIntervalValue;

        @com.aliyun.core.annotation.NameInMap("StandardEditionDefaultValue")
        private Object standardEditionDefaultValue;

        @com.aliyun.core.annotation.NameInMap("StandardEditionIntervalValue")
        private java.util.List<Integer> standardEditionIntervalValue;

        @com.aliyun.core.annotation.NameInMap("UserConfigValue")
        private Object userConfigValue;

        private Controllers(Builder builder) {
            this.basicEditionDefaultValue = builder.basicEditionDefaultValue;
            this.basicEditionIntervalValue = builder.basicEditionIntervalValue;
            this.controller = builder.controller;
            this.controllerValueType = builder.controllerValueType;
            this.displayName = builder.displayName;
            this.displayNameEn = builder.displayNameEn;
            this.enable = builder.enable;
            this.enterpriseEditionDefaultValue = builder.enterpriseEditionDefaultValue;
            this.enterpriseEditionIntervalValue = builder.enterpriseEditionIntervalValue;
            this.professionalEditionDefaultValue = builder.professionalEditionDefaultValue;
            this.professionalEditionIntervalValue = builder.professionalEditionIntervalValue;
            this.standardEditionDefaultValue = builder.standardEditionDefaultValue;
            this.standardEditionIntervalValue = builder.standardEditionIntervalValue;
            this.userConfigValue = builder.userConfigValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Controllers create() {
            return builder().build();
        }

        /**
         * @return basicEditionDefaultValue
         */
        public Object getBasicEditionDefaultValue() {
            return this.basicEditionDefaultValue;
        }

        /**
         * @return basicEditionIntervalValue
         */
        public java.util.List<Integer> getBasicEditionIntervalValue() {
            return this.basicEditionIntervalValue;
        }

        /**
         * @return controller
         */
        public String getController() {
            return this.controller;
        }

        /**
         * @return controllerValueType
         */
        public String getControllerValueType() {
            return this.controllerValueType;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return displayNameEn
         */
        public String getDisplayNameEn() {
            return this.displayNameEn;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return enterpriseEditionDefaultValue
         */
        public Object getEnterpriseEditionDefaultValue() {
            return this.enterpriseEditionDefaultValue;
        }

        /**
         * @return enterpriseEditionIntervalValue
         */
        public java.util.List<Integer> getEnterpriseEditionIntervalValue() {
            return this.enterpriseEditionIntervalValue;
        }

        /**
         * @return professionalEditionDefaultValue
         */
        public Object getProfessionalEditionDefaultValue() {
            return this.professionalEditionDefaultValue;
        }

        /**
         * @return professionalEditionIntervalValue
         */
        public java.util.List<Integer> getProfessionalEditionIntervalValue() {
            return this.professionalEditionIntervalValue;
        }

        /**
         * @return standardEditionDefaultValue
         */
        public Object getStandardEditionDefaultValue() {
            return this.standardEditionDefaultValue;
        }

        /**
         * @return standardEditionIntervalValue
         */
        public java.util.List<Integer> getStandardEditionIntervalValue() {
            return this.standardEditionIntervalValue;
        }

        /**
         * @return userConfigValue
         */
        public Object getUserConfigValue() {
            return this.userConfigValue;
        }

        public static final class Builder {
            private Object basicEditionDefaultValue; 
            private java.util.List<Integer> basicEditionIntervalValue; 
            private String controller; 
            private String controllerValueType; 
            private String displayName; 
            private String displayNameEn; 
            private Boolean enable; 
            private Object enterpriseEditionDefaultValue; 
            private java.util.List<Integer> enterpriseEditionIntervalValue; 
            private Object professionalEditionDefaultValue; 
            private java.util.List<Integer> professionalEditionIntervalValue; 
            private Object standardEditionDefaultValue; 
            private java.util.List<Integer> standardEditionIntervalValue; 
            private Object userConfigValue; 

            private Builder() {
            } 

            private Builder(Controllers model) {
                this.basicEditionDefaultValue = model.basicEditionDefaultValue;
                this.basicEditionIntervalValue = model.basicEditionIntervalValue;
                this.controller = model.controller;
                this.controllerValueType = model.controllerValueType;
                this.displayName = model.displayName;
                this.displayNameEn = model.displayNameEn;
                this.enable = model.enable;
                this.enterpriseEditionDefaultValue = model.enterpriseEditionDefaultValue;
                this.enterpriseEditionIntervalValue = model.enterpriseEditionIntervalValue;
                this.professionalEditionDefaultValue = model.professionalEditionDefaultValue;
                this.professionalEditionIntervalValue = model.professionalEditionIntervalValue;
                this.standardEditionDefaultValue = model.standardEditionDefaultValue;
                this.standardEditionIntervalValue = model.standardEditionIntervalValue;
                this.userConfigValue = model.userConfigValue;
            } 

            /**
             * BasicEditionDefaultValue.
             */
            public Builder basicEditionDefaultValue(Object basicEditionDefaultValue) {
                this.basicEditionDefaultValue = basicEditionDefaultValue;
                return this;
            }

            /**
             * BasicEditionIntervalValue.
             */
            public Builder basicEditionIntervalValue(java.util.List<Integer> basicEditionIntervalValue) {
                this.basicEditionIntervalValue = basicEditionIntervalValue;
                return this;
            }

            /**
             * Controller.
             */
            public Builder controller(String controller) {
                this.controller = controller;
                return this;
            }

            /**
             * ControllerValueType.
             */
            public Builder controllerValueType(String controllerValueType) {
                this.controllerValueType = controllerValueType;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * DisplayNameEn.
             */
            public Builder displayNameEn(String displayNameEn) {
                this.displayNameEn = displayNameEn;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * EnterpriseEditionDefaultValue.
             */
            public Builder enterpriseEditionDefaultValue(Object enterpriseEditionDefaultValue) {
                this.enterpriseEditionDefaultValue = enterpriseEditionDefaultValue;
                return this;
            }

            /**
             * EnterpriseEditionIntervalValue.
             */
            public Builder enterpriseEditionIntervalValue(java.util.List<Integer> enterpriseEditionIntervalValue) {
                this.enterpriseEditionIntervalValue = enterpriseEditionIntervalValue;
                return this;
            }

            /**
             * ProfessionalEditionDefaultValue.
             */
            public Builder professionalEditionDefaultValue(Object professionalEditionDefaultValue) {
                this.professionalEditionDefaultValue = professionalEditionDefaultValue;
                return this;
            }

            /**
             * ProfessionalEditionIntervalValue.
             */
            public Builder professionalEditionIntervalValue(java.util.List<Integer> professionalEditionIntervalValue) {
                this.professionalEditionIntervalValue = professionalEditionIntervalValue;
                return this;
            }

            /**
             * StandardEditionDefaultValue.
             */
            public Builder standardEditionDefaultValue(Object standardEditionDefaultValue) {
                this.standardEditionDefaultValue = standardEditionDefaultValue;
                return this;
            }

            /**
             * StandardEditionIntervalValue.
             */
            public Builder standardEditionIntervalValue(java.util.List<Integer> standardEditionIntervalValue) {
                this.standardEditionIntervalValue = standardEditionIntervalValue;
                return this;
            }

            /**
             * UserConfigValue.
             */
            public Builder userConfigValue(Object userConfigValue) {
                this.userConfigValue = userConfigValue;
                return this;
            }

            public Controllers build() {
                return new Controllers(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateSecurityStrategyRequest} extends {@link TeaModel}
     *
     * <p>UpdateSecurityStrategyRequest</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Controllers")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Controllers> controllers;

        private Content(Builder builder) {
            this.controllers = builder.controllers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return controllers
         */
        public java.util.List<Controllers> getControllers() {
            return this.controllers;
        }

        public static final class Builder {
            private java.util.List<Controllers> controllers; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.controllers = model.controllers;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder controllers(java.util.List<Controllers> controllers) {
                this.controllers = controllers;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
