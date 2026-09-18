// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link ListRolesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRolesResponseBody</p>
 */
public class ListRolesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListRolesResponseBody model) {
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Role information.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Status code. A return value of 200 indicates that the request succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Status code description.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE338D98-9BD3-4413-B165</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListRolesResponseBody build() {
            return new ListRolesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRolesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuId")
        private Long buId;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RoleGroupId")
        private Long roleGroupId;

        @com.aliyun.core.annotation.NameInMap("RoleGroupName")
        private String roleGroupName;

        @com.aliyun.core.annotation.NameInMap("RoleId")
        private Long roleId;

        @com.aliyun.core.annotation.NameInMap("Title")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.buId = model.buId;
                this.code = model.code;
                this.createTime = model.createTime;
                this.description = model.description;
                this.roleGroupId = model.roleGroupId;
                this.roleGroupName = model.roleGroupName;
                this.roleId = model.roleId;
                this.title = model.title;
            } 

            /**
             * <p>Tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder buId(Long buId) {
                this.buId = buId;
                return this;
            }

            /**
             * <p>Role code.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>Creation Time. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2020-01-03T20:25:33Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Role description.</p>
             * 
             * <strong>example:</strong>
             * <p>Admin</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>ID of the group to which the role belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder roleGroupId(Long roleGroupId) {
                this.roleGroupId = roleGroupId;
                return this;
            }

            /**
             * <p>Name of the role group to which the role belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>角色组名称</p>
             */
            public Builder roleGroupName(String roleGroupName) {
                this.roleGroupName = roleGroupName;
                return this;
            }

            /**
             * <p>Role ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder roleId(Long roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * <p>Role name.</p>
             * 
             * <strong>example:</strong>
             * <p>企业管理员</p>
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
