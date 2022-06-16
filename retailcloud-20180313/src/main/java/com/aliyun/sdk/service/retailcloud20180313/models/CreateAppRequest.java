// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppRequest} extends {@link RequestModel}
 *
 * <p>CreateAppRequest</p>
 */
public class CreateAppRequest extends Request {
    @Body
    @NameInMap("BizCode")
    @Validation(required = true)
    private String bizCode;

    @Body
    @NameInMap("BizTitle")
    private String bizTitle;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("GroupName")
    private String groupName;

    @Body
    @NameInMap("Language")
    @Validation(required = true)
    private String language;

    @Body
    @NameInMap("MiddleWareIdList")
    private java.util.List < Integer > middleWareIdList;

    @Body
    @NameInMap("Namespace")
    private String namespace;

    @Body
    @NameInMap("OperatingSystem")
    @Validation(required = true)
    private String operatingSystem;

    @Body
    @NameInMap("ServiceType")
    @Validation(required = true)
    private String serviceType;

    @Body
    @NameInMap("StateType")
    private Integer stateType;

    @Body
    @NameInMap("Title")
    @Validation(required = true)
    private String title;

    @Body
    @NameInMap("UserRoles")
    private java.util.List < UserRoles> userRoles;

    private CreateAppRequest(Builder builder) {
        super(builder);
        this.bizCode = builder.bizCode;
        this.bizTitle = builder.bizTitle;
        this.description = builder.description;
        this.groupName = builder.groupName;
        this.language = builder.language;
        this.middleWareIdList = builder.middleWareIdList;
        this.namespace = builder.namespace;
        this.operatingSystem = builder.operatingSystem;
        this.serviceType = builder.serviceType;
        this.stateType = builder.stateType;
        this.title = builder.title;
        this.userRoles = builder.userRoles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizCode
     */
    public String getBizCode() {
        return this.bizCode;
    }

    /**
     * @return bizTitle
     */
    public String getBizTitle() {
        return this.bizTitle;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return middleWareIdList
     */
    public java.util.List < Integer > getMiddleWareIdList() {
        return this.middleWareIdList;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return operatingSystem
     */
    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return stateType
     */
    public Integer getStateType() {
        return this.stateType;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return userRoles
     */
    public java.util.List < UserRoles> getUserRoles() {
        return this.userRoles;
    }

    public static final class Builder extends Request.Builder<CreateAppRequest, Builder> {
        private String bizCode; 
        private String bizTitle; 
        private String description; 
        private String groupName; 
        private String language; 
        private java.util.List < Integer > middleWareIdList; 
        private String namespace; 
        private String operatingSystem; 
        private String serviceType; 
        private Integer stateType; 
        private String title; 
        private java.util.List < UserRoles> userRoles; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppRequest request) {
            super(request);
            this.bizCode = request.bizCode;
            this.bizTitle = request.bizTitle;
            this.description = request.description;
            this.groupName = request.groupName;
            this.language = request.language;
            this.middleWareIdList = request.middleWareIdList;
            this.namespace = request.namespace;
            this.operatingSystem = request.operatingSystem;
            this.serviceType = request.serviceType;
            this.stateType = request.stateType;
            this.title = request.title;
            this.userRoles = request.userRoles;
        } 

        /**
         * BizCode.
         */
        public Builder bizCode(String bizCode) {
            this.putBodyParameter("BizCode", bizCode);
            this.bizCode = bizCode;
            return this;
        }

        /**
         * BizTitle.
         */
        public Builder bizTitle(String bizTitle) {
            this.putBodyParameter("BizTitle", bizTitle);
            this.bizTitle = bizTitle;
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
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putBodyParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putBodyParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * MiddleWareIdList.
         */
        public Builder middleWareIdList(java.util.List < Integer > middleWareIdList) {
            this.putBodyParameter("MiddleWareIdList", middleWareIdList);
            this.middleWareIdList = middleWareIdList;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * OperatingSystem.
         */
        public Builder operatingSystem(String operatingSystem) {
            this.putBodyParameter("OperatingSystem", operatingSystem);
            this.operatingSystem = operatingSystem;
            return this;
        }

        /**
         * ServiceType.
         */
        public Builder serviceType(String serviceType) {
            this.putBodyParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        /**
         * StateType.
         */
        public Builder stateType(Integer stateType) {
            this.putBodyParameter("StateType", stateType);
            this.stateType = stateType;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * UserRoles.
         */
        public Builder userRoles(java.util.List < UserRoles> userRoles) {
            this.putBodyParameter("UserRoles", userRoles);
            this.userRoles = userRoles;
            return this;
        }

        @Override
        public CreateAppRequest build() {
            return new CreateAppRequest(this);
        } 

    } 

    public static class UserRoles extends TeaModel {
        @NameInMap("RoleName")
        @Validation(required = true)
        private String roleName;

        @NameInMap("UserId")
        @Validation(required = true)
        private String userId;

        @NameInMap("UserType")
        @Validation(required = true)
        private String userType;

        private UserRoles(Builder builder) {
            this.roleName = builder.roleName;
            this.userId = builder.userId;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserRoles create() {
            return builder().build();
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userType
         */
        public String getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private String roleName; 
            private String userId; 
            private String userType; 

            /**
             * RoleName.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserType.
             */
            public Builder userType(String userType) {
                this.userType = userType;
                return this;
            }

            public UserRoles build() {
                return new UserRoles(this);
            } 

        } 

    }
}
