// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListGroupsResponseBody</p>
 */
public class ListGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListGroupsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the applications.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListGroupsResponseBody build() {
            return new ListGroupsResponseBody(this);
        } 

    } 

    public static class AppGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppGroupId")
        private Long appGroupId;

        @com.aliyun.core.annotation.NameInMap("AppKey")
        private String appKey;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private AppGroups(Builder builder) {
            this.appGroupId = builder.appGroupId;
            this.appKey = builder.appKey;
            this.appName = builder.appName;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppGroups create() {
            return builder().build();
        }

        /**
         * @return appGroupId
         */
        public Long getAppGroupId() {
            return this.appGroupId;
        }

        /**
         * @return appKey
         */
        public String getAppKey() {
            return this.appKey;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long appGroupId; 
            private String appKey; 
            private String appName; 
            private String description; 
            private String groupId; 
            private Integer version; 

            /**
             * The application group ID.
             */
            public Builder appGroupId(Long appGroupId) {
                this.appGroupId = appGroupId;
                return this;
            }

            /**
             * The AppKey for the application.
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The description of the application.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The application ID.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public AppGroups build() {
                return new AppGroups(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppGroups")
        private java.util.List < AppGroups> appGroups;

        private Data(Builder builder) {
            this.appGroups = builder.appGroups;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appGroups
         */
        public java.util.List < AppGroups> getAppGroups() {
            return this.appGroups;
        }

        public static final class Builder {
            private java.util.List < AppGroups> appGroups; 

            /**
             * The applications and their details.
             */
            public Builder appGroups(java.util.List < AppGroups> appGroups) {
                this.appGroups = appGroups;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
