// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link InsertK8sApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>InsertK8sApplicationResponseBody</p>
 */
public class InsertK8sApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationInfo")
    private ApplicationInfo applicationInfo;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(InsertK8sApplicationResponseBody model) {
            this.applicationInfo = model.applicationInfo;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the application.</p>
         */
        public Builder applicationInfo(ApplicationInfo applicationInfo) {
            this.applicationInfo = applicationInfo;
            return this;
        }

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>b197-40ab-9155-****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InsertK8sApplicationResponseBody build() {
            return new InsertK8sApplicationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InsertK8sApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>InsertK8sApplicationResponseBody</p>
     */
    public static class ApplicationInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ChangeOrderId")
        private String changeOrderId;

        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private Integer clusterType;

        @com.aliyun.core.annotation.NameInMap("Dockerize")
        private Boolean dockerize;

        @com.aliyun.core.annotation.NameInMap("EdasId")
        private String edasId;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("UserId")
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

            private Builder() {
            } 

            private Builder(ApplicationInfo model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.changeOrderId = model.changeOrderId;
                this.clusterType = model.clusterType;
                this.dockerize = model.dockerize;
                this.edasId = model.edasId;
                this.owner = model.owner;
                this.regionId = model.regionId;
                this.userId = model.userId;
            } 

            /**
             * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>e83acea6-<strong><strong>-47e1-96ae-c0e95377</strong></strong></p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The ID of the change process. You can call the GetChangeOrderInfo operation to query the change process ID. For more information, see <a href="https://help.aliyun.com/document_detail/62072.html">GetChangeOrderInfo</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cd65b247-****-475b-ad4b-7039040d625c</p>
             */
            public Builder changeOrderId(String changeOrderId) {
                this.changeOrderId = changeOrderId;
                return this;
            }

            /**
             * <p>The type of the cluster. Valid values:</p>
             * <ul>
             * <li>0: regular Docker cluster</li>
             * <li>1: Swarm cluster (discontinued)</li>
             * <li>2: Elastic Compute Service (ECS) cluster</li>
             * <li>3: self-managed Kubernetes cluster in EDAS (discontinued)</li>
             * <li>4: cluster in which Pandora automatically registers applications</li>
             * <li>5: ACK cluster and serverless Kubernetes cluster</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder clusterType(Integer clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>Indicates whether the application is a Docker application.</p>
             * <ul>
             * <li>true: The application is a Docker application.</li>
             * <li>false: The application is not a Docker application.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dockerize(Boolean dockerize) {
                this.dockerize = dockerize;
                return this;
            }

            /**
             * <p>The ID of the user to which the application belongs. This ID is generated by EDAS.</p>
             * 
             * <strong>example:</strong>
             * <p>1172<strong><strong>6608</strong></strong></p>
             */
            public Builder edasId(String edasId) {
                this.edasId = edasId;
                return this;
            }

            /**
             * <p>The owner of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>zp</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the application belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>edas_test****@aliyun****.com</p>
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
