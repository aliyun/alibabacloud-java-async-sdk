// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetUserGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserGroupResponseBody</p>
 */
public class GetUserGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("UserGroupInfo")
    private UserGroupInfo userGroupInfo;

    private GetUserGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.userGroupInfo = builder.userGroupInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return userGroupInfo
     */
    public UserGroupInfo getUserGroupInfo() {
        return this.userGroupInfo;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private UserGroupInfo userGroupInfo; 

        private Builder() {
        } 

        private Builder(GetUserGroupResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.userGroupInfo = model.userGroupInfo;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * UserGroupInfo.
         */
        public Builder userGroupInfo(UserGroupInfo userGroupInfo) {
            this.userGroupInfo = userGroupInfo;
            return this;
        }

        public GetUserGroupResponseBody build() {
            return new GetUserGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserGroupResponseBody</p>
     */
    public static class AdminList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        private AdminList(Builder builder) {
            this.accountName = builder.accountName;
            this.displayName = builder.displayName;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdminList create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String accountName; 
            private String displayName; 
            private String id; 

            private Builder() {
            } 

            private Builder(AdminList model) {
                this.accountName = model.accountName;
                this.displayName = model.displayName;
                this.id = model.id;
            } 

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public AdminList build() {
                return new AdminList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetUserGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserGroupResponseBody</p>
     */
    public static class UserGroupInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Active")
        private Boolean active;

        @com.aliyun.core.annotation.NameInMap("AdminList")
        private java.util.List<AdminList> adminList;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MyRole")
        private String myRole;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private UserGroupInfo(Builder builder) {
            this.active = builder.active;
            this.adminList = builder.adminList;
            this.description = builder.description;
            this.id = builder.id;
            this.myRole = builder.myRole;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserGroupInfo create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
        }

        /**
         * @return adminList
         */
        public java.util.List<AdminList> getAdminList() {
            return this.adminList;
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
        public String getId() {
            return this.id;
        }

        /**
         * @return myRole
         */
        public String getMyRole() {
            return this.myRole;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Boolean active; 
            private java.util.List<AdminList> adminList; 
            private String description; 
            private String id; 
            private String myRole; 
            private String name; 

            private Builder() {
            } 

            private Builder(UserGroupInfo model) {
                this.active = model.active;
                this.adminList = model.adminList;
                this.description = model.description;
                this.id = model.id;
                this.myRole = model.myRole;
                this.name = model.name;
            } 

            /**
             * Active.
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * AdminList.
             */
            public Builder adminList(java.util.List<AdminList> adminList) {
                this.adminList = adminList;
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MyRole.
             */
            public Builder myRole(String myRole) {
                this.myRole = myRole;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public UserGroupInfo build() {
                return new UserGroupInfo(this);
            } 

        } 

    }
}
