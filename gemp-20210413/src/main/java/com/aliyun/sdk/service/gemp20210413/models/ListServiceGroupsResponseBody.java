// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceGroupsResponseBody</p>
 */
public class ListServiceGroupsResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("pageNumber")
    private Long pageNumber;

    @NameInMap("pageSize")
    private Long pageSize;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("totalCount")
    private Long totalCount;

    private ListServiceGroupsResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListServiceGroupsResponseBody build() {
            return new ListServiceGroupsResponseBody(this);
        } 

    } 

    public static class Users extends TeaModel {
        @NameInMap("email")
        private String email;

        @NameInMap("isRelated")
        private Integer isRelated;

        @NameInMap("phone")
        private String phone;

        @NameInMap("serviceGroupId")
        private Long serviceGroupId;

        @NameInMap("userId")
        private Long userId;

        @NameInMap("userName")
        private String userName;

        private Users(Builder builder) {
            this.email = builder.email;
            this.isRelated = builder.isRelated;
            this.phone = builder.phone;
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
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return isRelated
         */
        public Integer getIsRelated() {
            return this.isRelated;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
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
            private String email; 
            private Integer isRelated; 
            private String phone; 
            private Long serviceGroupId; 
            private Long userId; 
            private String userName; 

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * isRelated.
             */
            public Builder isRelated(Integer isRelated) {
                this.isRelated = isRelated;
                return this;
            }

            /**
             * phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
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
        @NameInMap("enableWebhook")
        private String enableWebhook;

        @NameInMap("isScheduled")
        private Boolean isScheduled;

        @NameInMap("serviceGroupDescription")
        private String serviceGroupDescription;

        @NameInMap("serviceGroupId")
        private Long serviceGroupId;

        @NameInMap("serviceGroupName")
        private String serviceGroupName;

        @NameInMap("updateTime")
        private String updateTime;

        @NameInMap("users")
        private java.util.List < Users> users;

        @NameInMap("webhookLink")
        private String webhookLink;

        @NameInMap("webhookType")
        private String webhookType;

        private Data(Builder builder) {
            this.enableWebhook = builder.enableWebhook;
            this.isScheduled = builder.isScheduled;
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
         * @return enableWebhook
         */
        public String getEnableWebhook() {
            return this.enableWebhook;
        }

        /**
         * @return isScheduled
         */
        public Boolean getIsScheduled() {
            return this.isScheduled;
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
            private String enableWebhook; 
            private Boolean isScheduled; 
            private String serviceGroupDescription; 
            private Long serviceGroupId; 
            private String serviceGroupName; 
            private String updateTime; 
            private java.util.List < Users> users; 
            private String webhookLink; 
            private String webhookType; 

            /**
             * enableWebhook.
             */
            public Builder enableWebhook(String enableWebhook) {
                this.enableWebhook = enableWebhook;
                return this;
            }

            /**
             * isScheduled.
             */
            public Builder isScheduled(Boolean isScheduled) {
                this.isScheduled = isScheduled;
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
