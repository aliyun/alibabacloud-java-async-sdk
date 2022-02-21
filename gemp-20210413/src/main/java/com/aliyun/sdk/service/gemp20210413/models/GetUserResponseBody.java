// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserResponseBody</p>
 */
public class GetUserResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private GetUserResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * 用户
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetUserResponseBody build() {
            return new GetUserResponseBody(this);
        } 

    } 

    public static class ServiceGroups extends TeaModel {
        @NameInMap("name")
        private String name;

        @NameInMap("serviceGroupId")
        private Long serviceGroupId;

        private ServiceGroups(Builder builder) {
            this.name = builder.name;
            this.serviceGroupId = builder.serviceGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceGroups create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return serviceGroupId
         */
        public Long getServiceGroupId() {
            return this.serviceGroupId;
        }

        public static final class Builder {
            private String name; 
            private Long serviceGroupId; 

            /**
             * 服务组名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 服务组ID
             */
            public Builder serviceGroupId(Long serviceGroupId) {
                this.serviceGroupId = serviceGroupId;
                return this;
            }

            public ServiceGroups build() {
                return new ServiceGroups(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("accountType")
        private String accountType;

        @NameInMap("createTime")
        private String createTime;

        @NameInMap("email")
        private String email;

        @NameInMap("isEditableUser")
        private Boolean isEditableUser;

        @NameInMap("isRelated")
        private String isRelated;

        @NameInMap("phone")
        private String phone;

        @NameInMap("ramId")
        private String ramId;

        @NameInMap("serviceGroups")
        private java.util.List < ServiceGroups> serviceGroups;

        @NameInMap("userId")
        private Long userId;

        @NameInMap("username")
        private String username;

        private Data(Builder builder) {
            this.accountType = builder.accountType;
            this.createTime = builder.createTime;
            this.email = builder.email;
            this.isEditableUser = builder.isEditableUser;
            this.isRelated = builder.isRelated;
            this.phone = builder.phone;
            this.ramId = builder.ramId;
            this.serviceGroups = builder.serviceGroups;
            this.userId = builder.userId;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return isEditableUser
         */
        public Boolean getIsEditableUser() {
            return this.isEditableUser;
        }

        /**
         * @return isRelated
         */
        public String getIsRelated() {
            return this.isRelated;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return ramId
         */
        public String getRamId() {
            return this.ramId;
        }

        /**
         * @return serviceGroups
         */
        public java.util.List < ServiceGroups> getServiceGroups() {
            return this.serviceGroups;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String accountType; 
            private String createTime; 
            private String email; 
            private Boolean isEditableUser; 
            private String isRelated; 
            private String phone; 
            private String ramId; 
            private java.util.List < ServiceGroups> serviceGroups; 
            private Long userId; 
            private String username; 

            /**
             * CUSTOMER:主账号，SUB:子账号
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
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
             * email
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * 是否可编辑
             */
            public Builder isEditableUser(Boolean isEditableUser) {
                this.isEditableUser = isEditableUser;
                return this;
            }

            /**
             * 是否关联
             */
            public Builder isRelated(String isRelated) {
                this.isRelated = isRelated;
                return this;
            }

            /**
             * 用户手机号
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * ramId
             */
            public Builder ramId(String ramId) {
                this.ramId = ramId;
                return this;
            }

            /**
             * 所属服务组
             */
            public Builder serviceGroups(java.util.List < ServiceGroups> serviceGroups) {
                this.serviceGroups = serviceGroups;
                return this;
            }

            /**
             * 用户ID
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * 用户昵称
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
