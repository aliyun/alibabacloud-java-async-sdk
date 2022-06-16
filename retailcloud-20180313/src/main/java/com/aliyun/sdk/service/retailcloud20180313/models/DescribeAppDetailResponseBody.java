// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppDetailResponseBody</p>
 */
public class DescribeAppDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private DescribeAppDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.errMessage = builder.errMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private Long code; 
        private String errMessage; 
        private String requestId; 
        private Result result; 

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeAppDetailResponseBody build() {
            return new DescribeAppDetailResponseBody(this);
        } 

    } 

    public static class MiddleWareInfoList extends TeaModel {
        @NameInMap("AppId")
        private Long appId;

        @NameInMap("Code")
        private Integer code;

        @NameInMap("Name")
        private String name;

        private MiddleWareInfoList(Builder builder) {
            this.appId = builder.appId;
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MiddleWareInfoList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long appId; 
            private Integer code; 
            private String name; 

            /**
             * AppId.
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public MiddleWareInfoList build() {
                return new MiddleWareInfoList(this);
            } 

        } 

    }
    public static class UserRoles extends TeaModel {
        @NameInMap("RealName")
        private String realName;

        @NameInMap("RoleName")
        private String roleName;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserType")
        private String userType;

        private UserRoles(Builder builder) {
            this.realName = builder.realName;
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
         * @return realName
         */
        public String getRealName() {
            return this.realName;
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
            private String realName; 
            private String roleName; 
            private String userId; 
            private String userType; 

            /**
             * RealName.
             */
            public Builder realName(String realName) {
                this.realName = realName;
                return this;
            }

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
    public static class Result extends TeaModel {
        @NameInMap("AppId")
        private Long appId;

        @NameInMap("AppStateType")
        private String appStateType;

        @NameInMap("BizName")
        private String bizName;

        @NameInMap("BizTitle")
        private String bizTitle;

        @NameInMap("DeployType")
        private String deployType;

        @NameInMap("Description")
        private String description;

        @NameInMap("Language")
        private String language;

        @NameInMap("MiddleWareInfoList")
        private java.util.List < MiddleWareInfoList> middleWareInfoList;

        @NameInMap("OperatingSystem")
        private String operatingSystem;

        @NameInMap("ServiceType")
        private String serviceType;

        @NameInMap("Title")
        private String title;

        @NameInMap("UserRoles")
        private java.util.List < UserRoles> userRoles;

        private Result(Builder builder) {
            this.appId = builder.appId;
            this.appStateType = builder.appStateType;
            this.bizName = builder.bizName;
            this.bizTitle = builder.bizTitle;
            this.deployType = builder.deployType;
            this.description = builder.description;
            this.language = builder.language;
            this.middleWareInfoList = builder.middleWareInfoList;
            this.operatingSystem = builder.operatingSystem;
            this.serviceType = builder.serviceType;
            this.title = builder.title;
            this.userRoles = builder.userRoles;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return appStateType
         */
        public String getAppStateType() {
            return this.appStateType;
        }

        /**
         * @return bizName
         */
        public String getBizName() {
            return this.bizName;
        }

        /**
         * @return bizTitle
         */
        public String getBizTitle() {
            return this.bizTitle;
        }

        /**
         * @return deployType
         */
        public String getDeployType() {
            return this.deployType;
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
         * @return middleWareInfoList
         */
        public java.util.List < MiddleWareInfoList> getMiddleWareInfoList() {
            return this.middleWareInfoList;
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

        public static final class Builder {
            private Long appId; 
            private String appStateType; 
            private String bizName; 
            private String bizTitle; 
            private String deployType; 
            private String description; 
            private String language; 
            private java.util.List < MiddleWareInfoList> middleWareInfoList; 
            private String operatingSystem; 
            private String serviceType; 
            private String title; 
            private java.util.List < UserRoles> userRoles; 

            /**
             * AppId.
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppStateType.
             */
            public Builder appStateType(String appStateType) {
                this.appStateType = appStateType;
                return this;
            }

            /**
             * BizName.
             */
            public Builder bizName(String bizName) {
                this.bizName = bizName;
                return this;
            }

            /**
             * BizTitle.
             */
            public Builder bizTitle(String bizTitle) {
                this.bizTitle = bizTitle;
                return this;
            }

            /**
             * DeployType.
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * MiddleWareInfoList.
             */
            public Builder middleWareInfoList(java.util.List < MiddleWareInfoList> middleWareInfoList) {
                this.middleWareInfoList = middleWareInfoList;
                return this;
            }

            /**
             * OperatingSystem.
             */
            public Builder operatingSystem(String operatingSystem) {
                this.operatingSystem = operatingSystem;
                return this;
            }

            /**
             * ServiceType.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * UserRoles.
             */
            public Builder userRoles(java.util.List < UserRoles> userRoles) {
                this.userRoles = userRoles;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
