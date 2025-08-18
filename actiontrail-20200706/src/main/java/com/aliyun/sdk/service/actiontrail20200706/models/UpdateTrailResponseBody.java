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
 * {@link UpdateTrailResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateTrailResponseBody</p>
 */
public class UpdateTrailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EventRW")
    private String eventRW;

    @com.aliyun.core.annotation.NameInMap("HomeRegion")
    private String homeRegion;

    @com.aliyun.core.annotation.NameInMap("MaxComputeProjectArn")
    private String maxComputeProjectArn;

    @com.aliyun.core.annotation.NameInMap("MaxComputeWriteRoleArn")
    private String maxComputeWriteRoleArn;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OssBucketName")
    private String ossBucketName;

    @com.aliyun.core.annotation.NameInMap("OssKeyPrefix")
    private String ossKeyPrefix;

    @com.aliyun.core.annotation.NameInMap("OssWriteRoleArn")
    private String ossWriteRoleArn;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlsProjectArn")
    private String slsProjectArn;

    @com.aliyun.core.annotation.NameInMap("SlsWriteRoleArn")
    private String slsWriteRoleArn;

    @com.aliyun.core.annotation.NameInMap("TrailRegion")
    private String trailRegion;

    private UpdateTrailResponseBody(Builder builder) {
        this.eventRW = builder.eventRW;
        this.homeRegion = builder.homeRegion;
        this.maxComputeProjectArn = builder.maxComputeProjectArn;
        this.maxComputeWriteRoleArn = builder.maxComputeWriteRoleArn;
        this.name = builder.name;
        this.ossBucketName = builder.ossBucketName;
        this.ossKeyPrefix = builder.ossKeyPrefix;
        this.ossWriteRoleArn = builder.ossWriteRoleArn;
        this.requestId = builder.requestId;
        this.slsProjectArn = builder.slsProjectArn;
        this.slsWriteRoleArn = builder.slsWriteRoleArn;
        this.trailRegion = builder.trailRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTrailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return trailRegion
     */
    public String getTrailRegion() {
        return this.trailRegion;
    }

    public static final class Builder {
        private String eventRW; 
        private String homeRegion; 
        private String maxComputeProjectArn; 
        private String maxComputeWriteRoleArn; 
        private String name; 
        private String ossBucketName; 
        private String ossKeyPrefix; 
        private String ossWriteRoleArn; 
        private String requestId; 
        private String slsProjectArn; 
        private String slsWriteRoleArn; 
        private String trailRegion; 

        private Builder() {
        } 

        private Builder(UpdateTrailResponseBody model) {
            this.eventRW = model.eventRW;
            this.homeRegion = model.homeRegion;
            this.maxComputeProjectArn = model.maxComputeProjectArn;
            this.maxComputeWriteRoleArn = model.maxComputeWriteRoleArn;
            this.name = model.name;
            this.ossBucketName = model.ossBucketName;
            this.ossKeyPrefix = model.ossKeyPrefix;
            this.ossWriteRoleArn = model.ossWriteRoleArn;
            this.requestId = model.requestId;
            this.slsProjectArn = model.slsProjectArn;
            this.slsWriteRoleArn = model.slsWriteRoleArn;
            this.trailRegion = model.trailRegion;
        } 

        /**
         * <p>The read/write type of the events to be delivered.</p>
         * 
         * <strong>example:</strong>
         * <p>Write</p>
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
         * <p>ARN of the Big Data Compute Service project for tracking delivery.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:odps:cn-hangzhou:151266687691****:project/actiontrail_****</p>
         */
        public Builder maxComputeProjectArn(String maxComputeProjectArn) {
            this.maxComputeProjectArn = maxComputeProjectArn;
            return this;
        }

        /**
         * <p>The ARN of the role that Operation Audit assumes when delivering operation events to the Big Data Compute Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::151266687691****:role/aliyunserviceroleforactiontrail</p>
         */
        public Builder maxComputeWriteRoleArn(String maxComputeWriteRoleArn) {
            this.maxComputeWriteRoleArn = maxComputeWriteRoleArn;
            return this;
        }

        /**
         * <p>The name of the trail.</p>
         * 
         * <strong>example:</strong>
         * <p>trail-test</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>audit-log</p>
         */
        public Builder ossBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * <p>The prefix of the log files to be stored in the destination OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>at-product-account-audit-B</p>
         */
        public Builder ossKeyPrefix(String ossKeyPrefix) {
            this.ossKeyPrefix = ossKeyPrefix;
            return this;
        }

        /**
         * <p>The ARN of the RAM role that is assumed by ActionTrail to deliver events to the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::***:role/aliyunserviceroleforactiontrail</p>
         */
        public Builder ossWriteRoleArn(String ossWriteRoleArn) {
            this.ossWriteRoleArn = ossWriteRoleArn;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2599A180-5236-44D8-9490-50B6F4F8BA35</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ARN of the Log Service project to which events are to be delivered.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:log:cn-hangzhou:151266687691****:project/test-project</p>
         */
        public Builder slsProjectArn(String slsProjectArn) {
            this.slsProjectArn = slsProjectArn;
            return this;
        }

        /**
         * <p>The ARN of the RAM role that is assumed by ActionTrail is to deliver events to the Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::***:role/aliyunserviceroleforactiontrail</p>
         */
        public Builder slsWriteRoleArn(String slsWriteRoleArn) {
            this.slsWriteRoleArn = slsWriteRoleArn;
            return this;
        }

        /**
         * <p>The one or more regions from which the trail delivers events.</p>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        public Builder trailRegion(String trailRegion) {
            this.trailRegion = trailRegion;
            return this;
        }

        public UpdateTrailResponseBody build() {
            return new UpdateTrailResponseBody(this);
        } 

    } 

}
