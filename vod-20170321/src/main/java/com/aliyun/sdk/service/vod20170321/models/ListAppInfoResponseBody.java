// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppInfoResponseBody</p>
 */
public class ListAppInfoResponseBody extends TeaModel {
    @NameInMap("AppInfoList")
    private java.util.List < AppInfoList> appInfoList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
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
         * The status of the application. After an application is created, it enters the **Normal** state. Valid values:
         * <p>
         * 
         * *   **Normal**
         * *   **Disable**
         */
        public Builder appInfoList(java.util.List < AppInfoList> appInfoList) {
            this.appInfoList = appInfoList;
            return this;
        }

        /**
         * The last time when the application was modified. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the application. Valid values:
         * <p>
         * 
         * *   **Normal**
         * *   **Disable**
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
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ModificationTime")
        private String modificationTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
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
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * Queries the applications that you are authorized to manage based on query conditions.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * WB01210940
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ModificationTime.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * The time when the application was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the application.
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
