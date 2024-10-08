// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppInfosResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppInfosResponseBody</p>
 */
public class GetAppInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppInfoList")
    private java.util.List < AppInfoList> appInfoList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("NonExistAppIds")
    private java.util.List < String > nonExistAppIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAppInfosResponseBody(Builder builder) {
        this.appInfoList = builder.appInfoList;
        this.code = builder.code;
        this.nonExistAppIds = builder.nonExistAppIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppInfosResponseBody create() {
        return builder().build();
    }

    /**
     * @return appInfoList
     */
    public java.util.List < AppInfoList> getAppInfoList() {
        return this.appInfoList;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return nonExistAppIds
     */
    public java.util.List < String > getNonExistAppIds() {
        return this.nonExistAppIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AppInfoList> appInfoList; 
        private String code; 
        private java.util.List < String > nonExistAppIds; 
        private String requestId; 

        /**
         * The details of each application.
         */
        public Builder appInfoList(java.util.List < AppInfoList> appInfoList) {
            this.appInfoList = appInfoList;
            return this;
        }

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The IDs of applications that do not exist.
         */
        public Builder nonExistAppIds(java.util.List < String > nonExistAppIds) {
            this.nonExistAppIds = nonExistAppIds;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAppInfosResponseBody build() {
            return new GetAppInfosResponseBody(this);
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

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

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
            this.resourceGroupId = builder.resourceGroupId;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
            private String resourceGroupId; 
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
             * The time when the application was created. The time is in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
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
             * The last time when the application was modified. The time is in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
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
