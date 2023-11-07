// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTrailRequest} extends {@link RequestModel}
 *
 * <p>UpdateTrailRequest</p>
 */
public class UpdateTrailRequest extends Request {
    @Query
    @NameInMap("EventRW")
    private String eventRW;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("OssBucketName")
    private String ossBucketName;

    @Query
    @NameInMap("OssKeyPrefix")
    private String ossKeyPrefix;

    @Query
    @NameInMap("OssWriteRoleArn")
    private String ossWriteRoleArn;

    @Query
    @NameInMap("SlsProjectArn")
    private String slsProjectArn;

    @Query
    @NameInMap("SlsWriteRoleArn")
    private String slsWriteRoleArn;

    @Query
    @NameInMap("TrailRegion")
    private String trailRegion;

    private UpdateTrailRequest(Builder builder) {
        super(builder);
        this.eventRW = builder.eventRW;
        this.name = builder.name;
        this.ossBucketName = builder.ossBucketName;
        this.ossKeyPrefix = builder.ossKeyPrefix;
        this.ossWriteRoleArn = builder.ossWriteRoleArn;
        this.slsProjectArn = builder.slsProjectArn;
        this.slsWriteRoleArn = builder.slsWriteRoleArn;
        this.trailRegion = builder.trailRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTrailRequest create() {
        return builder().build();
    }

    @Override
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

    public static final class Builder extends Request.Builder<UpdateTrailRequest, Builder> {
        private String eventRW; 
        private String name; 
        private String ossBucketName; 
        private String ossKeyPrefix; 
        private String ossWriteRoleArn; 
        private String slsProjectArn; 
        private String slsWriteRoleArn; 
        private String trailRegion; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTrailRequest request) {
            super(request);
            this.eventRW = request.eventRW;
            this.name = request.name;
            this.ossBucketName = request.ossBucketName;
            this.ossKeyPrefix = request.ossKeyPrefix;
            this.ossWriteRoleArn = request.ossWriteRoleArn;
            this.slsProjectArn = request.slsProjectArn;
            this.slsWriteRoleArn = request.slsWriteRoleArn;
            this.trailRegion = request.trailRegion;
        } 

        /**
         * The read/write type of the events to be delivered. Valid values:
         * <p>
         * 
         * *   Write: write events. It is the default value.
         * *   Read: read events.
         * *   All: read and write events.
         */
        public Builder eventRW(String eventRW) {
            this.putQueryParameter("EventRW", eventRW);
            this.eventRW = eventRW;
            return this;
        }

        /**
         * The name of the trail whose configurations you want to update.
         * <p>
         * 
         * The name must be 6 to 36 characters in length and can contain lowercase letters, digits, hyphens (-), and underscores (\_). It must start with a lowercase letter.
         * 
         * >  The name must be unique within an Alibaba Cloud account.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The name of the Object Storage Service (OSS) bucket to which you want to deliver events.
         * <p>
         * 
         * The name must be 3 to 63 characters in length. The name must start with a lowercase letter or a digit and can contain lowercase letters, digits, and hyphens (-).
         * 
         * >  Make sure that the bucket exists before you update the configuration of the trail.
         */
        public Builder ossBucketName(String ossBucketName) {
            this.putQueryParameter("OssBucketName", ossBucketName);
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * The prefix of the files that are stored in the OSS bucket.
         * <p>
         * 
         * The prefix must be 6 to 32 characters in length. The prefix must start with a letter and can contain letters, digits, hyphens (-), forward slashes (/), and underscores (\_).
         */
        public Builder ossKeyPrefix(String ossKeyPrefix) {
            this.putQueryParameter("OssKeyPrefix", ossKeyPrefix);
            this.ossKeyPrefix = ossKeyPrefix;
            return this;
        }

        /**
         * The Alibaba Cloud Resource Name (ARN) of the RAM role that is assumed by ActionTrail to deliver events to the OSS bucket.
         * <p>
         * 
         * *   If you do not specify this parameter, ActionTrail creates a service-linked role to create the required resources. For more information, see [Manage the service-linked role](~~169244~~).
         * *   If you specify this parameter, you must grant the permissions of the service-linked role that is assumed by ActionTrail to the RAM role before you can deliver events to your Alibaba Cloud account. If you need to deliver events to other Alibaba Cloud accounts, you must attach the permission policy that is used to grant permissions related to event delivery to the RAM role. For more information about how to deliver events across Alibaba Cloud accounts, see [Deliver events across Alibaba Cloud accounts](~~207462~~).
         */
        public Builder ossWriteRoleArn(String ossWriteRoleArn) {
            this.putQueryParameter("OssWriteRoleArn", ossWriteRoleArn);
            this.ossWriteRoleArn = ossWriteRoleArn;
            return this;
        }

        /**
         * The ARN of the Log Service project to which you want to deliver events.
         */
        public Builder slsProjectArn(String slsProjectArn) {
            this.putQueryParameter("SlsProjectArn", slsProjectArn);
            this.slsProjectArn = slsProjectArn;
            return this;
        }

        /**
         * The ARN of the RAM role that is assumed by ActionTrail to deliver events to the Log Service project.
         * <p>
         * 
         * *   If you do not specify this parameter, ActionTrail creates a service-linked role to create the corresponding resource. For more information, see [Manage the service-linked role](~~169244~~).
         * *   If you specify this parameter, you must grant the permissions of the service-linked role that is assumed by ActionTrail to the RAM role before you can deliver events to your Alibaba Cloud account. If you need to deliver events to other Alibaba Cloud accounts, you must attach the permission policy that is used to grant permissions related to event delivery to the RAM role. For more information about how to deliver events across Alibaba Cloud accounts, see [Deliver events across Alibaba Cloud accounts](~~207462~~).
         */
        public Builder slsWriteRoleArn(String slsWriteRoleArn) {
            this.putQueryParameter("SlsWriteRoleArn", slsWriteRoleArn);
            this.slsWriteRoleArn = slsWriteRoleArn;
            return this;
        }

        /**
         * The region of the trail.
         * <p>
         * 
         * *   The default value is All, which indicates that the trail delivers events from all regions.
         * 
         * You can also specify specific regions. You can call the [DescribeRegions](~~213597~~) operation to query all the supported regions.
         */
        public Builder trailRegion(String trailRegion) {
            this.putQueryParameter("TrailRegion", trailRegion);
            this.trailRegion = trailRegion;
            return this;
        }

        @Override
        public UpdateTrailRequest build() {
            return new UpdateTrailRequest(this);
        } 

    } 

}
