// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>InsertApplicationResponseBody</p>
 */
public class InsertApplicationResponseBody extends TeaModel {
    @NameInMap("ApplicationInfo")
    private ApplicationInfo applicationInfo;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private InsertApplicationResponseBody(Builder builder) {
        this.applicationInfo = builder.applicationInfo;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertApplicationResponseBody create() {
        return builder().build();
    }

    /**
     * @return applicationInfo
     */
    public ApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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

    public static final class Builder {
        private ApplicationInfo applicationInfo; 
        private Integer code; 
        private String message; 
        private String requestId; 

        /**
         * The information about the created application.
         */
        public Builder applicationInfo(ApplicationInfo applicationInfo) {
            this.applicationInfo = applicationInfo;
            return this;
        }

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The message that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InsertApplicationResponseBody build() {
            return new InsertApplicationResponseBody(this);
        } 

    } 

    public static class ApplicationInfo extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("ChangeOrderId")
        private String changeOrderId;

        @NameInMap("Dockerize")
        private Boolean dockerize;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("RegionName")
        private String regionName;

        @NameInMap("UserId")
        private String userId;

        private ApplicationInfo(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.changeOrderId = builder.changeOrderId;
            this.dockerize = builder.dockerize;
            this.owner = builder.owner;
            this.port = builder.port;
            this.regionName = builder.regionName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationInfo create() {
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
         * @return changeOrderId
         */
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        /**
         * @return dockerize
         */
        public Boolean getDockerize() {
            return this.dockerize;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String changeOrderId; 
            private Boolean dockerize; 
            private String owner; 
            private Integer port; 
            private String regionName; 
            private String userId; 

            /**
             * The ID of the application. The ID is the unique identifier of the application in EDAS.
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
             * The ID of the change process.
             */
            public Builder changeOrderId(String changeOrderId) {
                this.changeOrderId = changeOrderId;
                return this;
            }

            /**
             * Indicates whether the application is a Docker application. Valid values:
             * <p>
             * 
             * *   **true**: The application is a Docker application.
             * *   **false**: The application is not a Docker application.
             */
            public Builder dockerize(Boolean dockerize) {
                this.dockerize = dockerize;
                return this;
            }

            /**
             * The owner of the application. The owner is the user who created the application.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The port used by the created application. Default value: 8080. You can call the UpdateContainerConfiguration operation to change the port. For more information, see [UpdateContainerConfiguration](~~149403~~).
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The name of the region.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * The ID of the user who created the application.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ApplicationInfo build() {
                return new ApplicationInfo(this);
            } 

        } 

    }
}
