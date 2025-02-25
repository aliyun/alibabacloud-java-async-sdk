// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceGroupResponseBody</p>
 */
public class GetServiceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetServiceGroupResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceGroupResponseBody create() {
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetServiceGroupResponseBody build() {
            return new GetServiceGroupResponseBody(this);
        } 

    } 

    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("roleNameList")
        private java.util.List < String > roleNameList;

        @com.aliyun.core.annotation.NameInMap("serviceGroupId")
        private Long serviceGroupId;

        @com.aliyun.core.annotation.NameInMap("userId")
        private Long userId;

        @com.aliyun.core.annotation.NameInMap("userName")
        private String userName;

        private Users(Builder builder) {
            this.phone = builder.phone;
            this.roleNameList = builder.roleNameList;
            this.serviceGroupId = builder.serviceGroupId;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return roleNameList
         */
        public java.util.List < String > getRoleNameList() {
            return this.roleNameList;
        }

        /**
         * @return serviceGroupId
         */
        public Long getServiceGroupId() {
            return this.serviceGroupId;
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
            private String phone; 
            private java.util.List < String > roleNameList; 
            private Long serviceGroupId; 
            private Long userId; 
            private String userName; 

            /**
             * phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * roleNameList.
             */
            public Builder roleNameList(java.util.List < String > roleNameList) {
                this.roleNameList = roleNameList;
                return this;
            }

            /**
             * serviceGroupId.
             */
            public Builder serviceGroupId(Long serviceGroupId) {
                this.serviceGroupId = serviceGroupId;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * userName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("enableWebhook")
        private String enableWebhook;

        @com.aliyun.core.annotation.NameInMap("serviceGroupDescription")
        private String serviceGroupDescription;

        @com.aliyun.core.annotation.NameInMap("serviceGroupId")
        private Long serviceGroupId;

        @com.aliyun.core.annotation.NameInMap("serviceGroupName")
        private String serviceGroupName;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("users")
        private java.util.List < Users> users;

        @com.aliyun.core.annotation.NameInMap("webhookLink")
        private String webhookLink;

        @com.aliyun.core.annotation.NameInMap("webhookType")
        private String webhookType;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.enableWebhook = builder.enableWebhook;
            this.serviceGroupDescription = builder.serviceGroupDescription;
            this.serviceGroupId = builder.serviceGroupId;
            this.serviceGroupName = builder.serviceGroupName;
            this.updateTime = builder.updateTime;
            this.users = builder.users;
            this.webhookLink = builder.webhookLink;
            this.webhookType = builder.webhookType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return enableWebhook
         */
        public String getEnableWebhook() {
            return this.enableWebhook;
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

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return users
         */
        public java.util.List < Users> getUsers() {
            return this.users;
        }

        /**
         * @return webhookLink
         */
        public String getWebhookLink() {
            return this.webhookLink;
        }

        /**
         * @return webhookType
         */
        public String getWebhookType() {
            return this.webhookType;
        }

        public static final class Builder {
            private String createTime; 
            private String enableWebhook; 
            private String serviceGroupDescription; 
            private Long serviceGroupId; 
            private String serviceGroupName; 
            private String updateTime; 
            private java.util.List < Users> users; 
            private String webhookLink; 
            private String webhookType; 

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * enableWebhook.
             */
            public Builder enableWebhook(String enableWebhook) {
                this.enableWebhook = enableWebhook;
                return this;
            }

            /**
             * serviceGroupDescription.
             */
            public Builder serviceGroupDescription(String serviceGroupDescription) {
                this.serviceGroupDescription = serviceGroupDescription;
                return this;
            }

            /**
             * serviceGroupId.
             */
            public Builder serviceGroupId(Long serviceGroupId) {
                this.serviceGroupId = serviceGroupId;
                return this;
            }

            /**
             * serviceGroupName.
             */
            public Builder serviceGroupName(String serviceGroupName) {
                this.serviceGroupName = serviceGroupName;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * users.
             */
            public Builder users(java.util.List < Users> users) {
                this.users = users;
                return this;
            }

            /**
             * webhookLink.
             */
            public Builder webhookLink(String webhookLink) {
                this.webhookLink = webhookLink;
                return this;
            }

            /**
             * webhookType.
             */
            public Builder webhookType(String webhookType) {
                this.webhookType = webhookType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
