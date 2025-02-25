// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetEdgeContainerAppStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetEdgeContainerAppStatusResponseBody</p>
 */
public class GetEdgeContainerAppStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppStatus")
    private AppStatus appStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetEdgeContainerAppStatusResponseBody(Builder builder) {
        this.appStatus = builder.appStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEdgeContainerAppStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return appStatus
     */
    public AppStatus getAppStatus() {
        return this.appStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AppStatus appStatus; 
        private String requestId; 

        /**
         * <p>The status of the application.</p>
         */
        public Builder appStatus(AppStatus appStatus) {
            this.appStatus = appStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247B78</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEdgeContainerAppStatusResponseBody build() {
            return new GetEdgeContainerAppStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEdgeContainerAppStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetEdgeContainerAppStatusResponseBody</p>
     */
    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Region")
        private java.util.List<String> region;

        private Regions(Builder builder) {
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return region
         */
        public java.util.List<String> getRegion() {
            return this.region;
        }

        public static final class Builder {
            private java.util.List<String> region; 

            /**
             * Region.
             */
            public Builder region(java.util.List<String> region) {
                this.region = region;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEdgeContainerAppStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetEdgeContainerAppStatusResponseBody</p>
     */
    public static class AppStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaseLineVersion")
        private String baseLineVersion;

        @com.aliyun.core.annotation.NameInMap("DeployStatus")
        private String deployStatus;

        @com.aliyun.core.annotation.NameInMap("DeployTime")
        private String deployTime;

        @com.aliyun.core.annotation.NameInMap("DeployedVersion")
        private String deployedVersion;

        @com.aliyun.core.annotation.NameInMap("ExpectPercentage")
        private Integer expectPercentage;

        @com.aliyun.core.annotation.NameInMap("FullRelease")
        private Boolean fullRelease;

        @com.aliyun.core.annotation.NameInMap("PublishEnv")
        private String publishEnv;

        @com.aliyun.core.annotation.NameInMap("PublishPercentage")
        private Integer publishPercentage;

        @com.aliyun.core.annotation.NameInMap("PublishStatus")
        private String publishStatus;

        @com.aliyun.core.annotation.NameInMap("PublishTime")
        private String publishTime;

        @com.aliyun.core.annotation.NameInMap("PublishType")
        private String publishType;

        @com.aliyun.core.annotation.NameInMap("PublishingVersion")
        private String publishingVersion;

        @com.aliyun.core.annotation.NameInMap("Regions")
        private Regions regions;

        @com.aliyun.core.annotation.NameInMap("RollbackTime")
        private String rollbackTime;

        @com.aliyun.core.annotation.NameInMap("UnDeployTime")
        private String unDeployTime;

        private AppStatus(Builder builder) {
            this.baseLineVersion = builder.baseLineVersion;
            this.deployStatus = builder.deployStatus;
            this.deployTime = builder.deployTime;
            this.deployedVersion = builder.deployedVersion;
            this.expectPercentage = builder.expectPercentage;
            this.fullRelease = builder.fullRelease;
            this.publishEnv = builder.publishEnv;
            this.publishPercentage = builder.publishPercentage;
            this.publishStatus = builder.publishStatus;
            this.publishTime = builder.publishTime;
            this.publishType = builder.publishType;
            this.publishingVersion = builder.publishingVersion;
            this.regions = builder.regions;
            this.rollbackTime = builder.rollbackTime;
            this.unDeployTime = builder.unDeployTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppStatus create() {
            return builder().build();
        }

        /**
         * @return baseLineVersion
         */
        public String getBaseLineVersion() {
            return this.baseLineVersion;
        }

        /**
         * @return deployStatus
         */
        public String getDeployStatus() {
            return this.deployStatus;
        }

        /**
         * @return deployTime
         */
        public String getDeployTime() {
            return this.deployTime;
        }

        /**
         * @return deployedVersion
         */
        public String getDeployedVersion() {
            return this.deployedVersion;
        }

        /**
         * @return expectPercentage
         */
        public Integer getExpectPercentage() {
            return this.expectPercentage;
        }

        /**
         * @return fullRelease
         */
        public Boolean getFullRelease() {
            return this.fullRelease;
        }

        /**
         * @return publishEnv
         */
        public String getPublishEnv() {
            return this.publishEnv;
        }

        /**
         * @return publishPercentage
         */
        public Integer getPublishPercentage() {
            return this.publishPercentage;
        }

        /**
         * @return publishStatus
         */
        public String getPublishStatus() {
            return this.publishStatus;
        }

        /**
         * @return publishTime
         */
        public String getPublishTime() {
            return this.publishTime;
        }

        /**
         * @return publishType
         */
        public String getPublishType() {
            return this.publishType;
        }

        /**
         * @return publishingVersion
         */
        public String getPublishingVersion() {
            return this.publishingVersion;
        }

        /**
         * @return regions
         */
        public Regions getRegions() {
            return this.regions;
        }

        /**
         * @return rollbackTime
         */
        public String getRollbackTime() {
            return this.rollbackTime;
        }

        /**
         * @return unDeployTime
         */
        public String getUnDeployTime() {
            return this.unDeployTime;
        }

        public static final class Builder {
            private String baseLineVersion; 
            private String deployStatus; 
            private String deployTime; 
            private String deployedVersion; 
            private Integer expectPercentage; 
            private Boolean fullRelease; 
            private String publishEnv; 
            private Integer publishPercentage; 
            private String publishStatus; 
            private String publishTime; 
            private String publishType; 
            private String publishingVersion; 
            private Regions regions; 
            private String rollbackTime; 
            private String unDeployTime; 

            /**
             * <p>The base version of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>ver-123123123123****</p>
             */
            public Builder baseLineVersion(String baseLineVersion) {
                this.baseLineVersion = baseLineVersion;
                return this;
            }

            /**
             * <p>The deployment status of the application.</p>
             * <ul>
             * <li><strong>undeploy</strong>: The application is not deployed.</li>
             * <li><strong>deploying</strong>: The application is being deployed.</li>
             * <li><strong>deployed</strong>: The application is deployed.</li>
             * <li><strong>undeploying</strong>: The deployment is being canceled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>undeploy</p>
             */
            public Builder deployStatus(String deployStatus) {
                this.deployStatus = deployStatus;
                return this;
            }

            /**
             * <p>The time when the application was deployed. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-25T05:58:05Z</p>
             */
            public Builder deployTime(String deployTime) {
                this.deployTime = deployTime;
                return this;
            }

            /**
             * <p>The release version of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>ver-123123123123****</p>
             */
            public Builder deployedVersion(String deployedVersion) {
                this.deployedVersion = deployedVersion;
                return this;
            }

            /**
             * <p>The expected release percentage of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>50%</p>
             */
            public Builder expectPercentage(Integer expectPercentage) {
                this.expectPercentage = expectPercentage;
                return this;
            }

            /**
             * <p>Specifies whether to fully release the version. This parameter takes effect only when PublishType is set to region.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder fullRelease(Boolean fullRelease) {
                this.fullRelease = fullRelease;
                return this;
            }

            /**
             * <p>The environment to which the application was released. Valid values:</p>
             * <ul>
             * <li><strong>prod</strong>: the production environment.</li>
             * <li><strong>staging</strong>: the staging environment.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>prod</p>
             */
            public Builder publishEnv(String publishEnv) {
                this.publishEnv = publishEnv;
                return this;
            }

            /**
             * <p>The release percentage of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>50%</p>
             */
            public Builder publishPercentage(Integer publishPercentage) {
                this.publishPercentage = publishPercentage;
                return this;
            }

            /**
             * <p>The release status of the application. Valid values:</p>
             * <ul>
             * <li><strong>publishing</strong></li>
             * <li><strong>published</strong></li>
             * <li><strong>rollbacking</strong></li>
             * <li><strong>rollbacked</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pubishing</p>
             */
            public Builder publishStatus(String publishStatus) {
                this.publishStatus = publishStatus;
                return this;
            }

            /**
             * <p>The time when the application was released. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-25T05:58:05Z</p>
             */
            public Builder publishTime(String publishTime) {
                this.publishTime = publishTime;
                return this;
            }

            /**
             * <p>Specifies how the version is released. Valid values:</p>
             * <ul>
             * <li>percentage: releases the version by percentage.</li>
             * <li>region: releases the version by region.</li>
             * </ul>
             * <p>If you do not specify this parameter, the version is released by percentage by default.</p>
             * 
             * <strong>example:</strong>
             * <p>percentage</p>
             */
            public Builder publishType(String publishType) {
                this.publishType = publishType;
                return this;
            }

            /**
             * <p>The release version of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>ver-123123123123****</p>
             */
            public Builder publishingVersion(String publishingVersion) {
                this.publishingVersion = publishingVersion;
                return this;
            }

            /**
             * <p>The regions to which the version is released.</p>
             */
            public Builder regions(Regions regions) {
                this.regions = regions;
                return this;
            }

            /**
             * <p>The time when the last rollback was performed.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-25T05:58:05Z</p>
             */
            public Builder rollbackTime(String rollbackTime) {
                this.rollbackTime = rollbackTime;
                return this;
            }

            /**
             * <p>The time when the application deployment was canceled. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-25T05:58:05Z</p>
             */
            public Builder unDeployTime(String unDeployTime) {
                this.unDeployTime = unDeployTime;
                return this;
            }

            public AppStatus build() {
                return new AppStatus(this);
            } 

        } 

    }
}
