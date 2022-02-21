// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRolesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRolesResponseBody</p>
 */
public class ListRolesResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListRolesResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRolesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
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

    public static final class Builder {
        private java.util.List < Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * data
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListRolesResponseBody build() {
            return new ListRolesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BuId")
        private Long buId;

        @NameInMap("Code")
        private String code;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("RoleGroupId")
        private Long roleGroupId;

        @NameInMap("RoleGroupName")
        private String roleGroupName;

        @NameInMap("RoleId")
        private Long roleId;

        @NameInMap("Title")
        private String title;

        private Data(Builder builder) {
            this.buId = builder.buId;
            this.code = builder.code;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.roleGroupId = builder.roleGroupId;
            this.roleGroupName = builder.roleGroupName;
            this.roleId = builder.roleId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return buId
         */
        public Long getBuId() {
            return this.buId;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return roleGroupId
         */
        public Long getRoleGroupId() {
            return this.roleGroupId;
        }

        /**
         * @return roleGroupName
         */
        public String getRoleGroupName() {
            return this.roleGroupName;
        }

        /**
         * @return roleId
         */
        public Long getRoleId() {
            return this.roleId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Long buId; 
            private String code; 
            private String createTime; 
            private String description; 
            private Long roleGroupId; 
            private String roleGroupName; 
            private Long roleId; 
            private String title; 

            /**
             * 租户id
             */
            public Builder buId(Long buId) {
                this.buId = buId;
                return this;
            }

            /**
             * 角色code
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 角色描述
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 所属角色组id
             */
            public Builder roleGroupId(Long roleGroupId) {
                this.roleGroupId = roleGroupId;
                return this;
            }

            /**
             * 所属角色组名称
             */
            public Builder roleGroupName(String roleGroupName) {
                this.roleGroupName = roleGroupName;
                return this;
            }

            /**
             * 角色id
             */
            public Builder roleId(Long roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * 角色名称
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
