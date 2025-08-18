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
 * {@link UpdateTrailRequest} extends {@link RequestModel}
 *
 * <p>UpdateTrailRequest</p>
 */
public class UpdateTrailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventRW")
    private String eventRW;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxComputeProjectArn")
    private String maxComputeProjectArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxComputeWriteRoleArn")
    private String maxComputeWriteRoleArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssBucketName")
    private String ossBucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssKeyPrefix")
    private String ossKeyPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssWriteRoleArn")
    private String ossWriteRoleArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlsProjectArn")
    private String slsProjectArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlsWriteRoleArn")
    private String slsWriteRoleArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrailRegion")
    private String trailRegion;

    private UpdateTrailRequest(Builder builder) {
        super(builder);
        this.eventRW = builder.eventRW;
        this.maxComputeProjectArn = builder.maxComputeProjectArn;
        this.maxComputeWriteRoleArn = builder.maxComputeWriteRoleArn;
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
        private String maxComputeProjectArn; 
        private String maxComputeWriteRoleArn; 
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
            this.maxComputeProjectArn = request.maxComputeProjectArn;
            this.maxComputeWriteRoleArn = request.maxComputeWriteRoleArn;
            this.name = request.name;
            this.ossBucketName = request.ossBucketName;
            this.ossKeyPrefix = request.ossKeyPrefix;
            this.ossWriteRoleArn = request.ossWriteRoleArn;
            this.slsProjectArn = request.slsProjectArn;
            this.slsWriteRoleArn = request.slsWriteRoleArn;
            this.trailRegion = request.trailRegion;
        } 

        /**
         * <p>The read/write type of the events to be delivered. Valid values:</p>
         * <ul>
         * <li>Write: write events. It is the default value.</li>
         * <li>Read: read events.</li>
         * <li>All: read and write events.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        public Builder eventRW(String eventRW) {
            this.putQueryParameter("EventRW", eventRW);
            this.eventRW = eventRW;
            return this;
        }

        /**
         * <p>The ARN of the MaxCompute project to which you want to deliver events.</p>
         * <blockquote>
         * <p> The name of the MaxCompute project must be prefixed with actiontrail_.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>acs:odps:cn-hangzhou:、151277687691****:project/actiontrail_****</p>
         */
        public Builder maxComputeProjectArn(String maxComputeProjectArn) {
            this.putQueryParameter("MaxComputeProjectArn", maxComputeProjectArn);
            this.maxComputeProjectArn = maxComputeProjectArn;
            return this;
        }

        /**
         * <p>The ARN of the role that is assumed by ActionTrail to deliver events to the destination Simple Log Service project.</p>
         * <ul>
         * <li>If you do not specify this parameter, ActionTrail creates a service-linked role to create the required resources. For more information, see <a href="https://help.aliyun.com/document_detail/169244.html">Manage the service-linked role</a>.</li>
         * <li>If you specify this parameter and deliver events to the current account, you must grant the RAM role the permissions on the service-linked role for ActionTrail. If you want to deliver events to other accounts, you must attach a system policy to the RAM role. For more information about how to deliver events across Alibaba Cloud accounts, see <a href="https://help.aliyun.com/document_detail/207462.html">Deliver events across Alibaba Cloud accounts</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::151277687691****:role/aliyunserviceroleforactiontrail</p>
         */
        public Builder maxComputeWriteRoleArn(String maxComputeWriteRoleArn) {
            this.putQueryParameter("MaxComputeWriteRoleArn", maxComputeWriteRoleArn);
            this.maxComputeWriteRoleArn = maxComputeWriteRoleArn;
            return this;
        }

        /**
         * <p>The name of the trail whose configurations you want to update.</p>
         * <p>The name must be 6 to 36 characters in length and can contain lowercase letters, digits, hyphens (-), and underscores (_). It must start with a lowercase letter.</p>
         * <blockquote>
         * <p> The name must be unique within an Alibaba Cloud account.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>trail-test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The name of the Object Storage Service (OSS) bucket to which you want to deliver events.</p>
         * <p>The name must be 3 to 63 characters in length. The name must start with a lowercase letter or a digit and can contain lowercase letters, digits, and hyphens (-).</p>
         * <blockquote>
         * <p> Make sure that the bucket exists before you update the configuration of the trail.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>audit-log</p>
         */
        public Builder ossBucketName(String ossBucketName) {
            this.putQueryParameter("OssBucketName", ossBucketName);
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * <p>The prefix of the files that are stored in the OSS bucket.</p>
         * <p>The prefix must be 6 to 32 characters in length. The prefix must start with a letter and can contain letters, digits, hyphens (-), forward slashes (/), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>at-product-account-audit-B</p>
         */
        public Builder ossKeyPrefix(String ossKeyPrefix) {
            this.putQueryParameter("OssKeyPrefix", ossKeyPrefix);
            this.ossKeyPrefix = ossKeyPrefix;
            return this;
        }

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role that is assumed by ActionTrail to deliver events to the OSS bucket.</p>
         * <ul>
         * <li>If you do not specify this parameter, ActionTrail creates a service-linked role to create the required resources. For more information, see <a href="https://help.aliyun.com/document_detail/169244.html">Manage the service-linked role</a>.</li>
         * <li>If you specify this parameter, you must grant the permissions of the service-linked role that is assumed by ActionTrail to the RAM role before you can deliver events to your Alibaba Cloud account. If you need to deliver events to other Alibaba Cloud accounts, you must attach the permission policy that is used to grant permissions related to event delivery to the RAM role. For more information about how to deliver events across Alibaba Cloud accounts, see <a href="https://help.aliyun.com/document_detail/207462.html">Deliver events across Alibaba Cloud accounts</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::***:role/aliyunserviceroleforactiontrail</p>
         */
        public Builder ossWriteRoleArn(String ossWriteRoleArn) {
            this.putQueryParameter("OssWriteRoleArn", ossWriteRoleArn);
            this.ossWriteRoleArn = ossWriteRoleArn;
            return this;
        }

        /**
         * <p>The ARN of the Log Service project to which you want to deliver events.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:log:cn-shanghai::project/***</p>
         */
        public Builder slsProjectArn(String slsProjectArn) {
            this.putQueryParameter("SlsProjectArn", slsProjectArn);
            this.slsProjectArn = slsProjectArn;
            return this;
        }

        /**
         * <p>The ARN of the RAM role that is assumed by ActionTrail to deliver events to the Log Service project.</p>
         * <ul>
         * <li>If you do not specify this parameter, ActionTrail creates a service-linked role to create the corresponding resource. For more information, see <a href="https://help.aliyun.com/document_detail/169244.html">Manage the service-linked role</a>.</li>
         * <li>If you specify this parameter, you must grant the permissions of the service-linked role that is assumed by ActionTrail to the RAM role before you can deliver events to your Alibaba Cloud account. If you need to deliver events to other Alibaba Cloud accounts, you must attach the permission policy that is used to grant permissions related to event delivery to the RAM role. For more information about how to deliver events across Alibaba Cloud accounts, see <a href="https://help.aliyun.com/document_detail/207462.html">Deliver events across Alibaba Cloud accounts</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::***:role/aliyunserviceroleforactiontrail</p>
         */
        public Builder slsWriteRoleArn(String slsWriteRoleArn) {
            this.putQueryParameter("SlsWriteRoleArn", slsWriteRoleArn);
            this.slsWriteRoleArn = slsWriteRoleArn;
            return this;
        }

        /**
         * <p>The region of the trail.</p>
         * <ul>
         * <li>The default value is All, which indicates that the trail delivers events from all regions.</li>
         * </ul>
         * <p>You can also specify specific regions. You can call the <a href="https://help.aliyun.com/document_detail/213597.html">DescribeRegions</a> operation to query all the supported regions.</p>
         * 
         * <strong>example:</strong>
         * <p>All</p>
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
