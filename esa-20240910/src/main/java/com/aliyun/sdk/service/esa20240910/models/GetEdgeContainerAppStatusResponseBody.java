// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
         * AppStatus.
         */
        public Builder appStatus(AppStatus appStatus) {
            this.appStatus = appStatus;
            return this;
        }

        /**
         * RequestId.
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
        private java.util.List < String > region;

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
        public java.util.List < String > getRegion() {
            return this.region;
        }

        public static final class Builder {
            private java.util.List < String > region; 

            /**
             * Region.
             */
            public Builder region(java.util.List < String > region) {
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
             * BaseLineVersion.
             */
            public Builder baseLineVersion(String baseLineVersion) {
                this.baseLineVersion = baseLineVersion;
                return this;
            }

            /**
             * DeployStatus.
             */
            public Builder deployStatus(String deployStatus) {
                this.deployStatus = deployStatus;
                return this;
            }

            /**
             * DeployTime.
             */
            public Builder deployTime(String deployTime) {
                this.deployTime = deployTime;
                return this;
            }

            /**
             * DeployedVersion.
             */
            public Builder deployedVersion(String deployedVersion) {
                this.deployedVersion = deployedVersion;
                return this;
            }

            /**
             * ExpectPercentage.
             */
            public Builder expectPercentage(Integer expectPercentage) {
                this.expectPercentage = expectPercentage;
                return this;
            }

            /**
             * FullRelease.
             */
            public Builder fullRelease(Boolean fullRelease) {
                this.fullRelease = fullRelease;
                return this;
            }

            /**
             * PublishEnv.
             */
            public Builder publishEnv(String publishEnv) {
                this.publishEnv = publishEnv;
                return this;
            }

            /**
             * PublishPercentage.
             */
            public Builder publishPercentage(Integer publishPercentage) {
                this.publishPercentage = publishPercentage;
                return this;
            }

            /**
             * PublishStatus.
             */
            public Builder publishStatus(String publishStatus) {
                this.publishStatus = publishStatus;
                return this;
            }

            /**
             * PublishTime.
             */
            public Builder publishTime(String publishTime) {
                this.publishTime = publishTime;
                return this;
            }

            /**
             * PublishType.
             */
            public Builder publishType(String publishType) {
                this.publishType = publishType;
                return this;
            }

            /**
             * PublishingVersion.
             */
            public Builder publishingVersion(String publishingVersion) {
                this.publishingVersion = publishingVersion;
                return this;
            }

            /**
             * Regions.
             */
            public Builder regions(Regions regions) {
                this.regions = regions;
                return this;
            }

            /**
             * RollbackTime.
             */
            public Builder rollbackTime(String rollbackTime) {
                this.rollbackTime = rollbackTime;
                return this;
            }

            /**
             * UnDeployTime.
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
