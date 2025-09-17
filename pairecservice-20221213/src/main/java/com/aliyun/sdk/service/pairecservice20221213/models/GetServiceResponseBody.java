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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceConfig")
    private String serviceConfig;

    @com.aliyun.core.annotation.NameInMap("ServiceResourceUri")
    private String serviceResourceUri;

    private GetServiceResponseBody(Builder builder) {
        this.description = builder.description;
        this.engineConfigId = builder.engineConfigId;
        this.gmtReleasedTime = builder.gmtReleasedTime;
        this.imageAuth = builder.imageAuth;
        this.imageName = builder.imageName;
        this.latestProdReleaseOrder = builder.latestProdReleaseOrder;
        this.name = builder.name;
        this.region = builder.region;
        this.requestId = builder.requestId;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String description; 
        private String engineConfigId; 
        private String gmtReleasedTime; 
        private String imageAuth; 
        private String imageName; 
        private LatestProdReleaseOrder latestProdReleaseOrder; 
        private String name; 
        private String region; 
        private String requestId; 
        private String serviceConfig; 
        private String serviceResourceUri; 

        private Builder() {
        } 

        private Builder(GetServiceResponseBody model) {
            this.description = model.description;
            this.engineConfigId = model.engineConfigId;
            this.gmtReleasedTime = model.gmtReleasedTime;
            this.imageAuth = model.imageAuth;
            this.imageName = model.imageName;
            this.latestProdReleaseOrder = model.latestProdReleaseOrder;
            this.name = model.name;
            this.region = model.region;
            this.requestId = model.requestId;
            this.serviceConfig = model.serviceConfig;
            this.serviceResourceUri = model.serviceResourceUri;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * EngineConfigId.
         */
        public Builder engineConfigId(String engineConfigId) {
            this.engineConfigId = engineConfigId;
            return this;
        }

        /**
         * GmtReleasedTime.
         */
        public Builder gmtReleasedTime(String gmtReleasedTime) {
            this.gmtReleasedTime = gmtReleasedTime;
            return this;
        }

        /**
         * ImageAuth.
         */
        public Builder imageAuth(String imageAuth) {
            this.imageAuth = imageAuth;
            return this;
        }

        /**
         * ImageName.
         */
        public Builder imageName(String imageName) {
            this.imageName = imageName;
            return this;
        }

        /**
         * LatestProdReleaseOrder.
         */
        public Builder latestProdReleaseOrder(LatestProdReleaseOrder latestProdReleaseOrder) {
            this.latestProdReleaseOrder = latestProdReleaseOrder;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.region = region;
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
         * ServiceConfig.
         */
        public Builder serviceConfig(String serviceConfig) {
            this.serviceConfig = serviceConfig;
            return this;
        }

        /**
         * ServiceResourceUri.
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
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ImageVersion.
             */
            public Builder imageVersion(String imageVersion) {
                this.imageVersion = imageVersion;
                return this;
            }

            /**
             * ReleaseInfo.
             */
            public Builder releaseInfo(String releaseInfo) {
                this.releaseInfo = releaseInfo;
                return this;
            }

            /**
             * ReleaseOrderId.
             */
            public Builder releaseOrderId(String releaseOrderId) {
                this.releaseOrderId = releaseOrderId;
                return this;
            }

            /**
             * Releaser.
             */
            public Builder releaser(String releaser) {
                this.releaser = releaser;
                return this;
            }

            /**
             * Topic.
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
