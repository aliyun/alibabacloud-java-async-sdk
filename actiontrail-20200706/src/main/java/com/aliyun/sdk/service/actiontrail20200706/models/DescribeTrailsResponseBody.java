// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link DescribeTrailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTrailsResponseBody</p>
 */
public class DescribeTrailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrailList")
    private java.util.List<TrailList> trailList;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<TrailList> getTrailList() {
        return this.trailList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TrailList> trailList; 

        private Builder() {
        } 

        private Builder(DescribeTrailsResponseBody model) {
            this.requestId = model.requestId;
            this.trailList = model.trailList;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ED8BC689-69DA-42AC-855E-3B06C1271194</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The trails.</p>
         */
        public Builder trailList(java.util.List<TrailList> trailList) {
            this.trailList = trailList;
            return this;
        }

        public DescribeTrailsResponseBody build() {
            return new DescribeTrailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTrailsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTrailsResponseBody</p>
     */
    public static class TrailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EventRW")
        private String eventRW;

        @com.aliyun.core.annotation.NameInMap("HomeRegion")
        private String homeRegion;

        @com.aliyun.core.annotation.NameInMap("IsOrganizationTrail")
        private Boolean isOrganizationTrail;

        @com.aliyun.core.annotation.NameInMap("MaxComputeProjectArn")
        private String maxComputeProjectArn;

        @com.aliyun.core.annotation.NameInMap("MaxComputeWriteRoleArn")
        private String maxComputeWriteRoleArn;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("OssBucketLocation")
        private String ossBucketLocation;

        @com.aliyun.core.annotation.NameInMap("OssBucketName")
        private String ossBucketName;

        @com.aliyun.core.annotation.NameInMap("OssKeyPrefix")
        private String ossKeyPrefix;

        @com.aliyun.core.annotation.NameInMap("OssWriteRoleArn")
        private String ossWriteRoleArn;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SlsProjectArn")
        private String slsProjectArn;

        @com.aliyun.core.annotation.NameInMap("SlsWriteRoleArn")
        private String slsWriteRoleArn;

        @com.aliyun.core.annotation.NameInMap("StartLoggingTime")
        private String startLoggingTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StopLoggingTime")
        private String stopLoggingTime;

        @com.aliyun.core.annotation.NameInMap("TrailArn")
        private String trailArn;

        @com.aliyun.core.annotation.NameInMap("TrailRegion")
        private String trailRegion;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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

            private Builder() {
            } 

            private Builder(TrailList model) {
                this.createTime = model.createTime;
                this.eventRW = model.eventRW;
                this.homeRegion = model.homeRegion;
                this.isOrganizationTrail = model.isOrganizationTrail;
                this.maxComputeProjectArn = model.maxComputeProjectArn;
                this.maxComputeWriteRoleArn = model.maxComputeWriteRoleArn;
                this.name = model.name;
                this.organizationId = model.organizationId;
                this.ossBucketLocation = model.ossBucketLocation;
                this.ossBucketName = model.ossBucketName;
                this.ossKeyPrefix = model.ossKeyPrefix;
                this.ossWriteRoleArn = model.ossWriteRoleArn;
                this.region = model.region;
                this.slsProjectArn = model.slsProjectArn;
                this.slsWriteRoleArn = model.slsWriteRoleArn;
                this.startLoggingTime = model.startLoggingTime;
                this.status = model.status;
                this.stopLoggingTime = model.stopLoggingTime;
                this.trailArn = model.trailArn;
                this.trailRegion = model.trailRegion;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The time when the trail was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-01T06:27:28Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The read/write type of the events that are delivered. Valid values:</p>
             * <ul>
             * <li>Write: write events. This is the default value.</li>
             * <li>Read: read events.</li>
             * <li>All: read and write events.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>All</p>
             */
            public Builder eventRW(String eventRW) {
                this.eventRW = eventRW;
                return this;
            }

            /**
             * <p>The home region of the trail.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder homeRegion(String homeRegion) {
                this.homeRegion = homeRegion;
                return this;
            }

            /**
             * <p>Indicates whether the trail is a multi-account trail. Valid values:</p>
             * <ul>
             * <li>false (default)</li>
             * <li>true</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isOrganizationTrail(Boolean isOrganizationTrail) {
                this.isOrganizationTrail = isOrganizationTrail;
                return this;
            }

            /**
             * <p>The ARN of the MaxCompute project.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:odps:cn-hangzhou:141266687691****:project/actiontrail_****</p>
             */
            public Builder maxComputeProjectArn(String maxComputeProjectArn) {
                this.maxComputeProjectArn = maxComputeProjectArn;
                return this;
            }

            /**
             * <p>The ARN of the role that is assumed by ActionTrail to deliver events to the MaxCompute project.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::141266687691****:role/aliyunserviceroleforactiontrail</p>
             */
            public Builder maxComputeWriteRoleArn(String maxComputeWriteRoleArn) {
                this.maxComputeWriteRoleArn = maxComputeWriteRoleArn;
                return this;
            }

            /**
             * <p>The name of the trail.</p>
             * 
             * <strong>example:</strong>
             * <p>test-4</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the resource directory.</p>
             * <blockquote>
             * <p> This parameter is returned only when the trail is a multi-account trail.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>rd-EV****</p>
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * <p>The region where the OSS bucket resides.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-hangzhou</p>
             */
            public Builder ossBucketLocation(String ossBucketLocation) {
                this.ossBucketLocation = ossBucketLocation;
                return this;
            }

            /**
             * <p>The name of the OSS bucket to which events are delivered.</p>
             * 
             * <strong>example:</strong>
             * <p>secloud</p>
             */
            public Builder ossBucketName(String ossBucketName) {
                this.ossBucketName = ossBucketName;
                return this;
            }

            /**
             * <p>The prefix of the files that are stored in the Object Storage Service (OSS) bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>trail1</p>
             */
            public Builder ossKeyPrefix(String ossKeyPrefix) {
                this.ossKeyPrefix = ossKeyPrefix;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role that is assumed by ActionTrail to deliver events to the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::***:role/aliyunserviceroleforactiontrail</p>
             */
            public Builder ossWriteRoleArn(String ossWriteRoleArn) {
                this.ossWriteRoleArn = ossWriteRoleArn;
                return this;
            }

            /**
             * <p>The region where the trail resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The ARN of the Log Service project to which events are delivered.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:log:cn-qingdao:159498693826****:project/zhengze-audit-log</p>
             */
            public Builder slsProjectArn(String slsProjectArn) {
                this.slsProjectArn = slsProjectArn;
                return this;
            }

            /**
             * <p>The ARN of the RAM role that is assumed by ActionTrail to deliver events to the Log Service project.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::159498693826****:role/aliyunserviceroleforactiontrail</p>
             */
            public Builder slsWriteRoleArn(String slsWriteRoleArn) {
                this.slsWriteRoleArn = slsWriteRoleArn;
                return this;
            }

            /**
             * <p>The time when the trail was last enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-06T02:08:38Z</p>
             */
            public Builder startLoggingTime(String startLoggingTime) {
                this.startLoggingTime = startLoggingTime;
                return this;
            }

            /**
             * <p>The status of the trail. Valid values:</p>
             * <ul>
             * <li>Disable: disabled.</li>
             * <li>Enable: enabled.</li>
             * <li>Fresh: The trail is created but is not enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the trail was last disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-06T02:09:04Z</p>
             */
            public Builder stopLoggingTime(String stopLoggingTime) {
                this.stopLoggingTime = stopLoggingTime;
                return this;
            }

            /**
             * <p>The ARN of the trail.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:actiontrail:cn-hangzhou:159498693826****:trail/test-delivery-other</p>
             */
            public Builder trailArn(String trailArn) {
                this.trailArn = trailArn;
                return this;
            }

            /**
             * <p>The region of the trail.</p>
             * 
             * <strong>example:</strong>
             * <p>All</p>
             */
            public Builder trailRegion(String trailRegion) {
                this.trailRegion = trailRegion;
                return this;
            }

            /**
             * <p>The time when the configurations of the trail were last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-06T02:16:24Z</p>
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
