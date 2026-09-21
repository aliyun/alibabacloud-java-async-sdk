// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link GetServiceResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceResponseBody</p>
 */
public class GetServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CrInstanceId")
    private String crInstanceId;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EngineConfigId")
    private String engineConfigId;

    @com.aliyun.core.annotation.NameInMap("GmtReleasedTime")
    private String gmtReleasedTime;

    @com.aliyun.core.annotation.NameInMap("ImageAuth")
    private String imageAuth;

    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    @com.aliyun.core.annotation.NameInMap("LatestProdReleaseOrder")
    private LatestProdReleaseOrder latestProdReleaseOrder;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("RepositoryId")
    private String repositoryId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SceneId")
    private String sceneId;

    @com.aliyun.core.annotation.NameInMap("ServiceConfig")
    private String serviceConfig;

    @com.aliyun.core.annotation.NameInMap("ServiceResourceUri")
    private String serviceResourceUri;

    private GetServiceResponseBody(Builder builder) {
        this.crInstanceId = builder.crInstanceId;
        this.description = builder.description;
        this.engineConfigId = builder.engineConfigId;
        this.gmtReleasedTime = builder.gmtReleasedTime;
        this.imageAuth = builder.imageAuth;
        this.imageName = builder.imageName;
        this.latestProdReleaseOrder = builder.latestProdReleaseOrder;
        this.name = builder.name;
        this.region = builder.region;
        this.repositoryId = builder.repositoryId;
        this.requestId = builder.requestId;
        this.sceneId = builder.sceneId;
        this.serviceConfig = builder.serviceConfig;
        this.serviceResourceUri = builder.serviceResourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crInstanceId
     */
    public String getCrInstanceId() {
        return this.crInstanceId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return engineConfigId
     */
    public String getEngineConfigId() {
        return this.engineConfigId;
    }

    /**
     * @return gmtReleasedTime
     */
    public String getGmtReleasedTime() {
        return this.gmtReleasedTime;
    }

    /**
     * @return imageAuth
     */
    public String getImageAuth() {
        return this.imageAuth;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return latestProdReleaseOrder
     */
    public LatestProdReleaseOrder getLatestProdReleaseOrder() {
        return this.latestProdReleaseOrder;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return repositoryId
     */
    public String getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return serviceConfig
     */
    public String getServiceConfig() {
        return this.serviceConfig;
    }

    /**
     * @return serviceResourceUri
     */
    public String getServiceResourceUri() {
        return this.serviceResourceUri;
    }

    public static final class Builder {
        private String crInstanceId; 
        private String description; 
        private String engineConfigId; 
        private String gmtReleasedTime; 
        private String imageAuth; 
        private String imageName; 
        private LatestProdReleaseOrder latestProdReleaseOrder; 
        private String name; 
        private String region; 
        private String repositoryId; 
        private String requestId; 
        private String sceneId; 
        private String serviceConfig; 
        private String serviceResourceUri; 

        private Builder() {
        } 

        private Builder(GetServiceResponseBody model) {
            this.crInstanceId = model.crInstanceId;
            this.description = model.description;
            this.engineConfigId = model.engineConfigId;
            this.gmtReleasedTime = model.gmtReleasedTime;
            this.imageAuth = model.imageAuth;
            this.imageName = model.imageName;
            this.latestProdReleaseOrder = model.latestProdReleaseOrder;
            this.name = model.name;
            this.region = model.region;
            this.repositoryId = model.repositoryId;
            this.requestId = model.requestId;
            this.sceneId = model.sceneId;
            this.serviceConfig = model.serviceConfig;
            this.serviceResourceUri = model.serviceResourceUri;
        } 

        /**
         * <p>The instance ID of the Container Registry Enterprise instance selected when a non-official image is used.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-xxx</p>
         */
        public Builder crInstanceId(String crInstanceId) {
            this.crInstanceId = crInstanceId;
            return this;
        }

        /**
         * <p>The service description.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a test rec engine</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The engine configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder engineConfigId(String engineConfigId) {
            this.engineConfigId = engineConfigId;
            return this;
        }

        /**
         * <p>The time of the most recent production publish.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        public Builder gmtReleasedTime(String gmtReleasedTime) {
            this.gmtReleasedTime = gmtReleasedTime;
            return this;
        }

        /**
         * <p>The image secret.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder imageAuth(String imageAuth) {
            this.imageAuth = imageAuth;
            return this;
        }

        /**
         * <p>The image name.</p>
         */
        public Builder imageName(String imageName) {
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>The most recent production publish record.</p>
         */
        public Builder latestProdReleaseOrder(LatestProdReleaseOrder latestProdReleaseOrder) {
            this.latestProdReleaseOrder = latestProdReleaseOrder;
            return this;
        }

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_rec</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The region where the service is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * <p>The ID of the Container Registry Enterprise Edition repository selected when a non-official image is used.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-xxx</p>
         */
        public Builder repositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D75C43DC-3D3A-5CC8-9AAC-8C77306C433B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>The configuration used to publish the service, such as the Elastic Algorithm Service (EAS) service configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Port&quot;:8080}</p>
         */
        public Builder serviceConfig(String serviceConfig) {
            this.serviceConfig = serviceConfig;
            return this;
        }

        /**
         * <p>The resource address used to publish the service, such as the EAS resource group name.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-resource-xxx</p>
         */
        public Builder serviceResourceUri(String serviceResourceUri) {
            this.serviceResourceUri = serviceResourceUri;
            return this;
        }

        public GetServiceResponseBody build() {
            return new GetServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class LatestProdReleaseOrder extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ImageVersion")
        private String imageVersion;

        @com.aliyun.core.annotation.NameInMap("ReleaseInfo")
        private String releaseInfo;

        @com.aliyun.core.annotation.NameInMap("ReleaseOrderId")
        private String releaseOrderId;

        @com.aliyun.core.annotation.NameInMap("Releaser")
        private String releaser;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        private LatestProdReleaseOrder(Builder builder) {
            this.content = builder.content;
            this.imageVersion = builder.imageVersion;
            this.releaseInfo = builder.releaseInfo;
            this.releaseOrderId = builder.releaseOrderId;
            this.releaser = builder.releaser;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LatestProdReleaseOrder create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return imageVersion
         */
        public String getImageVersion() {
            return this.imageVersion;
        }

        /**
         * @return releaseInfo
         */
        public String getReleaseInfo() {
            return this.releaseInfo;
        }

        /**
         * @return releaseOrderId
         */
        public String getReleaseOrderId() {
            return this.releaseOrderId;
        }

        /**
         * @return releaser
         */
        public String getReleaser() {
            return this.releaser;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private String content; 
            private String imageVersion; 
            private String releaseInfo; 
            private String releaseOrderId; 
            private String releaser; 
            private String topic; 

            private Builder() {
            } 

            private Builder(LatestProdReleaseOrder model) {
                this.content = model.content;
                this.imageVersion = model.imageVersion;
                this.releaseInfo = model.releaseInfo;
                this.releaseOrderId = model.releaseOrderId;
                this.releaser = model.releaser;
                this.topic = model.topic;
            } 

            /**
             * <p>The publish content.</p>
             * 
             * <strong>example:</strong>
             * <p>update golang version to 1.22</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The image version.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0.0</p>
             */
            public Builder imageVersion(String imageVersion) {
                this.imageVersion = imageVersion;
                return this;
            }

            /**
             * <p>The publish information.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;Pre&quot;: {
             *     &quot;Status&quot;: &quot;Released&quot;,
             *     &quot;GmtReleasedTime&quot; : &quot;2021-12-15T23:24:33.132+08:00&quot;,
             *   },
             *   &quot;Prod&quot;: {
             *     &quot;Status&quot;: &quot;Released&quot;,
             *     &quot;GmtReleasedTime&quot; : &quot;2021-12-15T23:24:33.132+08:00&quot;,
             *   }
             * }</p>
             */
            public Builder releaseInfo(String releaseInfo) {
                this.releaseInfo = releaseInfo;
                return this;
            }

            /**
             * <p>The publish order ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder releaseOrderId(String releaseOrderId) {
                this.releaseOrderId = releaseOrderId;
                return this;
            }

            /**
             * <p>The publisher, including the name and UID of the Resource Access Management (RAM) users.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:E-xxx.xxx-@xxx.onaliyun.com">E-xxx.xxx-@xxx.onaliyun.com</a></p>
             */
            public Builder releaser(String releaser) {
                this.releaser = releaser;
                return this;
            }

            /**
             * <p>The publish title.</p>
             * 
             * <strong>example:</strong>
             * <p>update version</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public LatestProdReleaseOrder build() {
                return new LatestProdReleaseOrder(this);
            } 

        } 

    }
}
