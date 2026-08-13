// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ListAuthorizedUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthorizedUsersResponseBody</p>
 */
public class ListAuthorizedUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authMode")
    private String authMode;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListAuthorizedUsersResponseBody(Builder builder) {
        this.authMode = builder.authMode;
        this.code = builder.code;
        this.items = builder.items;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorizedUsersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authMode
     */
    public String getAuthMode() {
        return this.authMode;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String authMode; 
        private String code; 
        private java.util.List<Items> items; 
        private String message; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListAuthorizedUsersResponseBody model) {
            this.authMode = model.authMode;
            this.code = model.code;
            this.items = model.items;
            this.message = model.message;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>授权模式：SPECIFIED_USERS / ALL_USERS</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder authMode(String authMode) {
            this.authMode = authMode;
            return this;
        }

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>已授权对象列表</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>授权记录总数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListAuthorizedUsersResponseBody build() {
            return new ListAuthorizedUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAuthorizedUsersResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorizedUsersResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expireDate")
        private Long expireDate;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("grantedBy")
        private Long grantedBy;

        @com.aliyun.core.annotation.NameInMap("granteeId")
        private String granteeId;

        @com.aliyun.core.annotation.NameInMap("granteeType")
        private String granteeType;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("memberCount")
        private Long memberCount;

        @com.aliyun.core.annotation.NameInMap("permissions")
        private java.util.List<String> permissions;

        @com.aliyun.core.annotation.NameInMap("userGroupId")
        private String userGroupId;

        @com.aliyun.core.annotation.NameInMap("userGroupName")
        private String userGroupName;

        @com.aliyun.core.annotation.NameInMap("userId")
        private Long userId;

        @com.aliyun.core.annotation.NameInMap("userName")
        private String userName;

        private Items(Builder builder) {
            this.expireDate = builder.expireDate;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.grantedBy = builder.grantedBy;
            this.granteeId = builder.granteeId;
            this.granteeType = builder.granteeType;
            this.id = builder.id;
            this.memberCount = builder.memberCount;
            this.permissions = builder.permissions;
            this.userGroupId = builder.userGroupId;
            this.userGroupName = builder.userGroupName;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return expireDate
         */
        public Long getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return grantedBy
         */
        public Long getGrantedBy() {
            return this.grantedBy;
        }

        /**
         * @return granteeId
         */
        public String getGranteeId() {
            return this.granteeId;
        }

        /**
         * @return granteeType
         */
        public String getGranteeType() {
            return this.granteeType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return memberCount
         */
        public Long getMemberCount() {
            return this.memberCount;
        }

        /**
         * @return permissions
         */
        public java.util.List<String> getPermissions() {
            return this.permissions;
        }

        /**
         * @return userGroupId
         */
        public String getUserGroupId() {
            return this.userGroupId;
        }

        /**
         * @return userGroupName
         */
        public String getUserGroupName() {
            return this.userGroupName;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Long expireDate; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long grantedBy; 
            private String granteeId; 
            private String granteeType; 
            private Long id; 
            private Long memberCount; 
            private java.util.List<String> permissions; 
            private String userGroupId; 
            private String userGroupName; 
            private Long userId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.expireDate = model.expireDate;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.grantedBy = model.grantedBy;
                this.granteeId = model.granteeId;
                this.granteeType = model.granteeType;
                this.id = model.id;
                this.memberCount = model.memberCount;
                this.permissions = model.permissions;
                this.userGroupId = model.userGroupId;
                this.userGroupName = model.userGroupName;
                this.userId = model.userId;
                this.userName = model.userName;
            } 

            /**
             * <p>授权截止时间戳（毫秒）</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder expireDate(Long expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * <p>创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>最后修改时间</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>授权人用户 ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder grantedBy(Long grantedBy) {
                this.grantedBy = grantedBy;
                return this;
            }

            /**
             * <p>被授权对象 ID</p>
             * 
             * <strong>example:</strong>
             * <p>exampleGranteeId</p>
             */
            public Builder granteeId(String granteeId) {
                this.granteeId = granteeId;
                return this;
            }

            /**
             * <p>被授权对象类型：USER / USER_GROUP</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder granteeType(String granteeType) {
                this.granteeType = granteeType;
                return this;
            }

            /**
             * <p>授权记录 ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>用户组成员数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder memberCount(Long memberCount) {
                this.memberCount = memberCount;
                return this;
            }

            /**
             * <p>已授权的权限列表</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder permissions(java.util.List<String> permissions) {
                this.permissions = permissions;
                return this;
            }

            /**
             * <p>用户组 ID（granteeType=USER_GROUP 时有值）</p>
             * 
             * <strong>example:</strong>
             * <p>exampleUserGroupId</p>
             */
            public Builder userGroupId(String userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            /**
             * <p>用户组名</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder userGroupName(String userGroupName) {
                this.userGroupName = userGroupName;
                return this;
            }

            /**
             * <p>用户 ID（granteeType=USER 时有值）</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>用户名</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
