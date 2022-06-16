// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppRequest</p>
 */
public class UpdateAppRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Body
    @NameInMap("BizTitle")
    private String bizTitle;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Language")
    private String language;

    @Body
    @NameInMap("MiddleWareIdList")
    private java.util.List < Integer > middleWareIdList;

    @Body
    @NameInMap("OperatingSystem")
    private String operatingSystem;

    @Body
    @NameInMap("ServiceType")
    private String serviceType;

    @Body
    @NameInMap("UserRoles")
    private java.util.List < UserRoles> userRoles;

    private UpdateAppRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.bizTitle = builder.bizTitle;
        this.description = builder.description;
        this.language = builder.language;
        this.middleWareIdList = builder.middleWareIdList;
        this.operatingSystem = builder.operatingSystem;
        this.serviceType = builder.serviceType;
        this.userRoles = builder.userRoles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
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
     * @return userRoles
     */
    public java.util.List < UserRoles> getUserRoles() {
        return this.userRoles;
    }

    public static final class Builder extends Request.Builder<UpdateAppRequest, Builder> {
        private Long appId; 
        private String bizTitle; 
        private String description; 
        private String language; 
        private java.util.List < Integer > middleWareIdList; 
        private String operatingSystem; 
        private String serviceType; 
        private java.util.List < UserRoles> userRoles; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppRequest request) {
            super(request);
            this.appId = request.appId;
            this.bizTitle = request.bizTitle;
            this.description = request.description;
            this.language = request.language;
            this.middleWareIdList = request.middleWareIdList;
            this.operatingSystem = request.operatingSystem;
            this.serviceType = request.serviceType;
            this.userRoles = request.userRoles;
        } 

        /**
         * AppId.
         */
        public Builder appId(Long appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
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
         * UserRoles.
         */
        public Builder userRoles(java.util.List < UserRoles> userRoles) {
            this.putBodyParameter("UserRoles", userRoles);
            this.userRoles = userRoles;
            return this;
        }

        @Override
        public UpdateAppRequest build() {
            return new UpdateAppRequest(this);
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
