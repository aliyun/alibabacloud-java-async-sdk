// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectWorkitemTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectWorkitemTypesResponseBody</p>
 */
public class ListProjectWorkitemTypesResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("workitemTypes")
    private java.util.List < WorkitemTypes> workitemTypes;

    private ListProjectWorkitemTypesResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.workitemTypes = builder.workitemTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectWorkitemTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return workitemTypes
     */
    public java.util.List < WorkitemTypes> getWorkitemTypes() {
        return this.workitemTypes;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private java.util.List < WorkitemTypes> workitemTypes; 

        /**
         * 错误返回码
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误返回信息
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * openapi平台的request id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 接口是否正常返回
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * 工作项类型
         */
        public Builder workitemTypes(java.util.List < WorkitemTypes> workitemTypes) {
            this.workitemTypes = workitemTypes;
            return this;
        }

        public ListProjectWorkitemTypesResponseBody build() {
            return new ListProjectWorkitemTypesResponseBody(this);
        } 

    } 

    public static class WorkitemTypes extends TeaModel {
        @NameInMap("addUser")
        private String addUser;

        @NameInMap("categoryIdentifier")
        private String categoryIdentifier;

        @NameInMap("creator")
        private String creator;

        @NameInMap("defaultType")
        private Boolean defaultType;

        @NameInMap("description")
        private String description;

        @NameInMap("enable")
        private Boolean enable;

        @NameInMap("gmtAdd")
        private Long gmtAdd;

        @NameInMap("gmtCreate")
        private Long gmtCreate;

        @NameInMap("identifier")
        private String identifier;

        @NameInMap("name")
        private String name;

        @NameInMap("nameEn")
        private String nameEn;

        @NameInMap("systemDefault")
        private Boolean systemDefault;

        private WorkitemTypes(Builder builder) {
            this.addUser = builder.addUser;
            this.categoryIdentifier = builder.categoryIdentifier;
            this.creator = builder.creator;
            this.defaultType = builder.defaultType;
            this.description = builder.description;
            this.enable = builder.enable;
            this.gmtAdd = builder.gmtAdd;
            this.gmtCreate = builder.gmtCreate;
            this.identifier = builder.identifier;
            this.name = builder.name;
            this.nameEn = builder.nameEn;
            this.systemDefault = builder.systemDefault;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkitemTypes create() {
            return builder().build();
        }

        /**
         * @return addUser
         */
        public String getAddUser() {
            return this.addUser;
        }

        /**
         * @return categoryIdentifier
         */
        public String getCategoryIdentifier() {
            return this.categoryIdentifier;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return defaultType
         */
        public Boolean getDefaultType() {
            return this.defaultType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return gmtAdd
         */
        public Long getGmtAdd() {
            return this.gmtAdd;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameEn
         */
        public String getNameEn() {
            return this.nameEn;
        }

        /**
         * @return systemDefault
         */
        public Boolean getSystemDefault() {
            return this.systemDefault;
        }

        public static final class Builder {
            private String addUser; 
            private String categoryIdentifier; 
            private String creator; 
            private Boolean defaultType; 
            private String description; 
            private Boolean enable; 
            private Long gmtAdd; 
            private Long gmtCreate; 
            private String identifier; 
            private String name; 
            private String nameEn; 
            private Boolean systemDefault; 

            /**
             * 添加到项目中的添加人
             */
            public Builder addUser(String addUser) {
                this.addUser = addUser;
                return this;
            }

            /**
             * 工作项类型
             */
            public Builder categoryIdentifier(String categoryIdentifier) {
                this.categoryIdentifier = categoryIdentifier;
                return this;
            }

            /**
             * 工作项类型创建人
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * 在项目中是否为默认类型
             */
            public Builder defaultType(Boolean defaultType) {
                this.defaultType = defaultType;
                return this;
            }

            /**
             * 描述
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 是否启用
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * 添加到项目中的时间
             */
            public Builder gmtAdd(Long gmtAdd) {
                this.gmtAdd = gmtAdd;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * 工作项类型id
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * 工作项类型的名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 工作项类型的英文名称
             */
            public Builder nameEn(String nameEn) {
                this.nameEn = nameEn;
                return this;
            }

            /**
             * 是否系统默认
             */
            public Builder systemDefault(Boolean systemDefault) {
                this.systemDefault = systemDefault;
                return this;
            }

            public WorkitemTypes build() {
                return new WorkitemTypes(this);
            } 

        } 

    }
}
