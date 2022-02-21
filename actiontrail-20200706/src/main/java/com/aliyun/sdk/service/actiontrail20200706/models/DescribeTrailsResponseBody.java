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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TrailList.
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EventRW.
             */
            public Builder eventRW(String eventRW) {
                this.eventRW = eventRW;
                return this;
            }

            /**
             * HomeRegion.
             */
            public Builder homeRegion(String homeRegion) {
                this.homeRegion = homeRegion;
                return this;
            }

            /**
             * IsOrganizationTrail.
             */
            public Builder isOrganizationTrail(Boolean isOrganizationTrail) {
                this.isOrganizationTrail = isOrganizationTrail;
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
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * OssBucketLocation.
             */
            public Builder ossBucketLocation(String ossBucketLocation) {
                this.ossBucketLocation = ossBucketLocation;
                return this;
            }

            /**
             * OssBucketName.
             */
            public Builder ossBucketName(String ossBucketName) {
                this.ossBucketName = ossBucketName;
                return this;
            }

            /**
             * OssKeyPrefix.
             */
            public Builder ossKeyPrefix(String ossKeyPrefix) {
                this.ossKeyPrefix = ossKeyPrefix;
                return this;
            }

            /**
             * OssWriteRoleArn.
             */
            public Builder ossWriteRoleArn(String ossWriteRoleArn) {
                this.ossWriteRoleArn = ossWriteRoleArn;
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
             * SlsProjectArn.
             */
            public Builder slsProjectArn(String slsProjectArn) {
                this.slsProjectArn = slsProjectArn;
                return this;
            }

            /**
             * SlsWriteRoleArn.
             */
            public Builder slsWriteRoleArn(String slsWriteRoleArn) {
                this.slsWriteRoleArn = slsWriteRoleArn;
                return this;
            }

            /**
             * StartLoggingTime.
             */
            public Builder startLoggingTime(String startLoggingTime) {
                this.startLoggingTime = startLoggingTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StopLoggingTime.
             */
            public Builder stopLoggingTime(String stopLoggingTime) {
                this.stopLoggingTime = stopLoggingTime;
                return this;
            }

            /**
             * TrailArn.
             */
            public Builder trailArn(String trailArn) {
                this.trailArn = trailArn;
                return this;
            }

            /**
             * TrailRegion.
             */
            public Builder trailRegion(String trailRegion) {
                this.trailRegion = trailRegion;
                return this;
            }

            /**
             * UpdateTime.
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
