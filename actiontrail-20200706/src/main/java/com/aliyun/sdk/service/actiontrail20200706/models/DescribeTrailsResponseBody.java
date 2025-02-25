// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTrailsResponseBody</p>
 */
public class DescribeTrailsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TrailList")
    private java.util.List < TrailList> trailList;

    private DescribeTrailsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trailList = builder.trailList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTrailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trailList
     */
    public java.util.List < TrailList> getTrailList() {
        return this.trailList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TrailList> trailList; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * A list of returned trails.
         */
        public Builder trailList(java.util.List < TrailList> trailList) {
            this.trailList = trailList;
            return this;
        }

        public DescribeTrailsResponseBody build() {
            return new DescribeTrailsResponseBody(this);
        } 

    } 

    public static class TrailList extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("EventRW")
        private String eventRW;

        @NameInMap("HomeRegion")
        private String homeRegion;

        @NameInMap("IsOrganizationTrail")
        private Boolean isOrganizationTrail;

        @NameInMap("MaxComputeProjectArn")
        private String maxComputeProjectArn;

        @NameInMap("MaxComputeWriteRoleArn")
        private String maxComputeWriteRoleArn;

        @NameInMap("Name")
        private String name;

        @NameInMap("OrganizationId")
        private String organizationId;

        @NameInMap("OssBucketLocation")
        private String ossBucketLocation;

        @NameInMap("OssBucketName")
        private String ossBucketName;

        @NameInMap("OssKeyPrefix")
        private String ossKeyPrefix;

        @NameInMap("OssWriteRoleArn")
        private String ossWriteRoleArn;

        @NameInMap("Region")
        private String region;

        @NameInMap("SlsProjectArn")
        private String slsProjectArn;

        @NameInMap("SlsWriteRoleArn")
        private String slsWriteRoleArn;

        @NameInMap("StartLoggingTime")
        private String startLoggingTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("StopLoggingTime")
        private String stopLoggingTime;

        @NameInMap("TrailArn")
        private String trailArn;

        @NameInMap("TrailRegion")
        private String trailRegion;

        @NameInMap("UpdateTime")
        private String updateTime;

        private TrailList(Builder builder) {
            this.createTime = builder.createTime;
            this.eventRW = builder.eventRW;
            this.homeRegion = builder.homeRegion;
            this.isOrganizationTrail = builder.isOrganizationTrail;
            this.maxComputeProjectArn = builder.maxComputeProjectArn;
            this.maxComputeWriteRoleArn = builder.maxComputeWriteRoleArn;
            this.name = builder.name;
            this.organizationId = builder.organizationId;
            this.ossBucketLocation = builder.ossBucketLocation;
            this.ossBucketName = builder.ossBucketName;
            this.ossKeyPrefix = builder.ossKeyPrefix;
            this.ossWriteRoleArn = builder.ossWriteRoleArn;
            this.region = builder.region;
            this.slsProjectArn = builder.slsProjectArn;
            this.slsWriteRoleArn = builder.slsWriteRoleArn;
            this.startLoggingTime = builder.startLoggingTime;
            this.status = builder.status;
            this.stopLoggingTime = builder.stopLoggingTime;
            this.trailArn = builder.trailArn;
            this.trailRegion = builder.trailRegion;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrailList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return eventRW
         */
        public String getEventRW() {
            return this.eventRW;
        }

        /**
         * @return homeRegion
         */
        public String getHomeRegion() {
            return this.homeRegion;
        }

        /**
         * @return isOrganizationTrail
         */
        public Boolean getIsOrganizationTrail() {
            return this.isOrganizationTrail;
        }

        /**
         * @return maxComputeProjectArn
         */
        public String getMaxComputeProjectArn() {
            return this.maxComputeProjectArn;
        }

        /**
         * @return maxComputeWriteRoleArn
         */
        public String getMaxComputeWriteRoleArn() {
            return this.maxComputeWriteRoleArn;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return ossBucketLocation
         */
        public String getOssBucketLocation() {
            return this.ossBucketLocation;
        }

        /**
         * @return ossBucketName
         */
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        /**
         * @return ossKeyPrefix
         */
        public String getOssKeyPrefix() {
            return this.ossKeyPrefix;
        }

        /**
         * @return ossWriteRoleArn
         */
        public String getOssWriteRoleArn() {
            return this.ossWriteRoleArn;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return slsProjectArn
         */
        public String getSlsProjectArn() {
            return this.slsProjectArn;
        }

        /**
         * @return slsWriteRoleArn
         */
        public String getSlsWriteRoleArn() {
            return this.slsWriteRoleArn;
        }

        /**
         * @return startLoggingTime
         */
        public String getStartLoggingTime() {
            return this.startLoggingTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return stopLoggingTime
         */
        public String getStopLoggingTime() {
            return this.stopLoggingTime;
        }

        /**
         * @return trailArn
         */
        public String getTrailArn() {
            return this.trailArn;
        }

        /**
         * @return trailRegion
         */
        public String getTrailRegion() {
            return this.trailRegion;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String eventRW; 
            private String homeRegion; 
            private Boolean isOrganizationTrail; 
            private String maxComputeProjectArn; 
            private String maxComputeWriteRoleArn; 
            private String name; 
            private String organizationId; 
            private String ossBucketLocation; 
            private String ossBucketName; 
            private String ossKeyPrefix; 
            private String ossWriteRoleArn; 
            private String region; 
            private String slsProjectArn; 
            private String slsWriteRoleArn; 
            private String startLoggingTime; 
            private String status; 
            private String stopLoggingTime; 
            private String trailArn; 
            private String trailRegion; 
            private String updateTime; 

            /**
             * The time when the trail was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The read/write type of the events that are delivered. Valid values:
             * <p>
             * 
             * *   Write: write events. This is the default value.
             * *   Read: read events.
             * *   All: read and write events.
             */
            public Builder eventRW(String eventRW) {
                this.eventRW = eventRW;
                return this;
            }

            /**
             * The home region of the trail.
             */
            public Builder homeRegion(String homeRegion) {
                this.homeRegion = homeRegion;
                return this;
            }

            /**
             * Indicates whether the trail is a multi-account trail. Valid values:
             * <p>
             * 
             * *   false (default)
             * *   true
             */
            public Builder isOrganizationTrail(Boolean isOrganizationTrail) {
                this.isOrganizationTrail = isOrganizationTrail;
                return this;
            }

            /**
             * MaxComputeProjectArn.
             */
            public Builder maxComputeProjectArn(String maxComputeProjectArn) {
                this.maxComputeProjectArn = maxComputeProjectArn;
                return this;
            }

            /**
             * MaxComputeWriteRoleArn.
             */
            public Builder maxComputeWriteRoleArn(String maxComputeWriteRoleArn) {
                this.maxComputeWriteRoleArn = maxComputeWriteRoleArn;
                return this;
            }

            /**
             * The name of the trail.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the resource directory.
             * <p>
             * 
             * >  This parameter is returned only when the trail is a multi-account trail.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * The region where the OSS bucket resides.
             */
            public Builder ossBucketLocation(String ossBucketLocation) {
                this.ossBucketLocation = ossBucketLocation;
                return this;
            }

            /**
             * The name of the OSS bucket to which events are delivered.
             */
            public Builder ossBucketName(String ossBucketName) {
                this.ossBucketName = ossBucketName;
                return this;
            }

            /**
             * The prefix of the files that are stored in the Object Storage Service (OSS) bucket.
             */
            public Builder ossKeyPrefix(String ossKeyPrefix) {
                this.ossKeyPrefix = ossKeyPrefix;
                return this;
            }

            /**
             * The Alibaba Cloud Resource Name (ARN) of the RAM role that is assumed by ActionTrail to deliver events to the OSS bucket.
             */
            public Builder ossWriteRoleArn(String ossWriteRoleArn) {
                this.ossWriteRoleArn = ossWriteRoleArn;
                return this;
            }

            /**
             * The region where the trail resides.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The ARN of the Log Service project to which events are delivered.
             */
            public Builder slsProjectArn(String slsProjectArn) {
                this.slsProjectArn = slsProjectArn;
                return this;
            }

            /**
             * The ARN of the RAM role that is assumed by ActionTrail to deliver events to the Log Service project.
             */
            public Builder slsWriteRoleArn(String slsWriteRoleArn) {
                this.slsWriteRoleArn = slsWriteRoleArn;
                return this;
            }

            /**
             * The time when the trail was last enabled.
             */
            public Builder startLoggingTime(String startLoggingTime) {
                this.startLoggingTime = startLoggingTime;
                return this;
            }

            /**
             * The status of the trail. Valid values:
             * <p>
             * 
             * *   Disable: disabled.
             * *   Enable: enabled.
             * *   Fresh: The trail is created but is not enabled.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time when the trail was last disabled.
             */
            public Builder stopLoggingTime(String stopLoggingTime) {
                this.stopLoggingTime = stopLoggingTime;
                return this;
            }

            /**
             * The ARN of the trail.
             */
            public Builder trailArn(String trailArn) {
                this.trailArn = trailArn;
                return this;
            }

            /**
             * The region of the trail.
             */
            public Builder trailRegion(String trailRegion) {
                this.trailRegion = trailRegion;
                return this;
            }

            /**
             * The time when the configurations of the trail were last updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public TrailList build() {
                return new TrailList(this);
            } 

        } 

    }
}
