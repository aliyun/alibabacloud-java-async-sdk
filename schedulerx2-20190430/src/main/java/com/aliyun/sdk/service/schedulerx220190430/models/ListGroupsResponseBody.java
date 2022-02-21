// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListGroupsResponseBody</p>
 */
public class ListGroupsResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public ListGroupsResponseBody build() {
            return new ListGroupsResponseBody(this);
        } 

    } 

    public static class AppGroups extends TeaModel {
        @NameInMap("AppKey")
        private String appKey;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("Description")
        private String description;

        @NameInMap("GroupId")
        private String groupId;

        private AppGroups(Builder builder) {
            this.appKey = builder.appKey;
            this.appName = builder.appName;
            this.description = builder.description;
            this.groupId = builder.groupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppGroups create() {
            return builder().build();
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

        public static final class Builder {
            private String appKey; 
            private String appName; 
            private String description; 
            private String groupId; 

            /**
             * AppKey.
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
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
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            public AppGroups build() {
                return new AppGroups(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AppGroups")
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
             * AppGroups.
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
