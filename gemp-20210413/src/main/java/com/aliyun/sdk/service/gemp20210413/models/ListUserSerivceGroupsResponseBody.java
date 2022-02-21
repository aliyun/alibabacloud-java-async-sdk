// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserSerivceGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserSerivceGroupsResponseBody</p>
 */
public class ListUserSerivceGroupsResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private ListUserSerivceGroupsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserSerivceGroupsResponseBody create() {
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
         * data.
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

        public ListUserSerivceGroupsResponseBody build() {
            return new ListUserSerivceGroupsResponseBody(this);
        } 

    } 

    public static class ServiceGroups extends TeaModel {
        @NameInMap("serviceGroupDescription")
        private String serviceGroupDescription;

        @NameInMap("serviceGroupId")
        private Long serviceGroupId;

        @NameInMap("serviceGroupName")
        private String serviceGroupName;

        private ServiceGroups(Builder builder) {
            this.serviceGroupDescription = builder.serviceGroupDescription;
            this.serviceGroupId = builder.serviceGroupId;
            this.serviceGroupName = builder.serviceGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceGroups create() {
            return builder().build();
        }

        /**
         * @return serviceGroupDescription
         */
        public String getServiceGroupDescription() {
            return this.serviceGroupDescription;
        }

        /**
         * @return serviceGroupId
         */
        public Long getServiceGroupId() {
            return this.serviceGroupId;
        }

        /**
         * @return serviceGroupName
         */
        public String getServiceGroupName() {
            return this.serviceGroupName;
        }

        public static final class Builder {
            private String serviceGroupDescription; 
            private Long serviceGroupId; 
            private String serviceGroupName; 

            /**
             * 服务组描述
             */
            public Builder serviceGroupDescription(String serviceGroupDescription) {
                this.serviceGroupDescription = serviceGroupDescription;
                return this;
            }

            /**
             * 服务组id
             */
            public Builder serviceGroupId(Long serviceGroupId) {
                this.serviceGroupId = serviceGroupId;
                return this;
            }

            /**
             * 服务组名称
             */
            public Builder serviceGroupName(String serviceGroupName) {
                this.serviceGroupName = serviceGroupName;
                return this;
            }

            public ServiceGroups build() {
                return new ServiceGroups(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("email")
        private String email;

        @NameInMap("phone")
        private String phone;

        @NameInMap("ramId")
        private Long ramId;

        @NameInMap("serviceGroups")
        private java.util.List < ServiceGroups> serviceGroups;

        @NameInMap("userId")
        private Long userId;

        @NameInMap("username")
        private String username;

        private Data(Builder builder) {
            this.email = builder.email;
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
         * @return email
         */
        public String getEmail() {
            return this.email;
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
        public Long getRamId() {
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
            private String email; 
            private String phone; 
            private Long ramId; 
            private java.util.List < ServiceGroups> serviceGroups; 
            private Long userId; 
            private String username; 

            /**
             * 邮箱
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * 手机号
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * RAM子账号ID
             */
            public Builder ramId(Long ramId) {
                this.ramId = ramId;
                return this;
            }

            /**
             * 人员所属服务组
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
