// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppInfoResponseBody</p>
 */
public class ListAppInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppInfoList")
    private java.util.List < AppInfoList> appInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListAppInfoResponseBody(Builder builder) {
        this.appInfoList = builder.appInfoList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return appInfoList
     */
    public java.util.List < AppInfoList> getAppInfoList() {
        return this.appInfoList;
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
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < AppInfoList> appInfoList; 
        private String requestId; 
        private Integer total; 

        /**
         * The details of each application.
         */
        public Builder appInfoList(java.util.List < AppInfoList> appInfoList) {
            this.appInfoList = appInfoList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListAppInfoResponseBody build() {
            return new ListAppInfoResponseBody(this);
        } 

    } 

    public static class AppInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ModificationTime")
        private String modificationTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private AppInfoList(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.modificationTime = builder.modificationTime;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppInfoList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String creationTime; 
            private String description; 
            private String modificationTime; 
            private String status; 
            private String type; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
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
             * The time when the application was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * The last time when the application was modified. The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * The status of the application. Valid values:
             * <p>
             * 
             * *   **Normal**
             * *   **Disable**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the application. Valid values:
             * <p>
             * 
             * *   **System**
             * *   **Custom**
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AppInfoList build() {
                return new AppInfoList(this);
            } 

        } 

    }
}
