// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertK8sApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>InsertK8sApplicationResponseBody</p>
 */
public class InsertK8sApplicationResponseBody extends TeaModel {
    @NameInMap("ApplicationInfo")
    private ApplicationInfo applicationInfo;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private InsertK8sApplicationResponseBody(Builder builder) {
        this.applicationInfo = builder.applicationInfo;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertK8sApplicationResponseBody create() {
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
         * The details of the application.
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
         * The additional information that is returned.
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

        public InsertK8sApplicationResponseBody build() {
            return new InsertK8sApplicationResponseBody(this);
        } 

    } 

    public static class ApplicationInfo extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("ChangeOrderId")
        private String changeOrderId;

        @NameInMap("ClusterType")
        private Integer clusterType;

        @NameInMap("Dockerize")
        private Boolean dockerize;

        @NameInMap("EdasId")
        private String edasId;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("UserId")
        private String userId;

        private ApplicationInfo(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.changeOrderId = builder.changeOrderId;
            this.clusterType = builder.clusterType;
            this.dockerize = builder.dockerize;
            this.edasId = builder.edasId;
            this.owner = builder.owner;
            this.regionId = builder.regionId;
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
         * @return clusterType
         */
        public Integer getClusterType() {
            return this.clusterType;
        }

        /**
         * @return dockerize
         */
        public Boolean getDockerize() {
            return this.dockerize;
        }

        /**
         * @return edasId
         */
        public String getEdasId() {
            return this.edasId;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
            private Integer clusterType; 
            private Boolean dockerize; 
            private String edasId; 
            private String owner; 
            private String regionId; 
            private String userId; 

            /**
             * The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](~~149390~~).
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
             * The ID of the change process. You can call the GetChangeOrderInfo operation to query the change process ID. For more information, see [GetChangeOrderInfo](~~62072~~).
             */
            public Builder changeOrderId(String changeOrderId) {
                this.changeOrderId = changeOrderId;
                return this;
            }

            /**
             * The type of the cluster. Valid values:
             * <p>
             * 
             * *   0: regular Docker cluster
             * *   1: Swarm cluster (discontinued)
             * *   2: Elastic Compute Service (ECS) cluster
             * *   3: self-managed Kubernetes cluster in EDAS (discontinued)
             * *   4: cluster in which Pandora automatically registers applications
             * *   5: ACK cluster and serverless Kubernetes cluster
             */
            public Builder clusterType(Integer clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * Indicates whether the application is a Docker application.
             * <p>
             * 
             * *   true: The application is a Docker application.
             * *   false: The application is not a Docker application.
             */
            public Builder dockerize(Boolean dockerize) {
                this.dockerize = dockerize;
                return this;
            }

            /**
             * The ID of the user to which the application belongs. This ID is generated by EDAS.
             */
            public Builder edasId(String edasId) {
                this.edasId = edasId;
                return this;
            }

            /**
             * The owner of the application.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the application belongs.
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
