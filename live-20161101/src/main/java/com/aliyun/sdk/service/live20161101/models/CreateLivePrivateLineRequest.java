// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link CreateLivePrivateLineRequest} extends {@link RequestModel}
 *
 * <p>CreateLivePrivateLineRequest</p>
 */
public class CreateLivePrivateLineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccelerationArea")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accelerationArea;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccelerationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accelerationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxBandwidth")
    private String maxBandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reuse")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reuse;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String streamName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoCenter")
    @com.aliyun.core.annotation.Validation(required = true)
    private String videoCenter;

    private CreateLivePrivateLineRequest(Builder builder) {
        super(builder);
        this.accelerationArea = builder.accelerationArea;
        this.accelerationType = builder.accelerationType;
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.instanceId = builder.instanceId;
        this.maxBandwidth = builder.maxBandwidth;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.reuse = builder.reuse;
        this.streamName = builder.streamName;
        this.videoCenter = builder.videoCenter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLivePrivateLineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accelerationArea
     */
    public String getAccelerationArea() {
        return this.accelerationArea;
    }

    /**
     * @return accelerationType
     */
    public String getAccelerationType() {
        return this.accelerationType;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maxBandwidth
     */
    public String getMaxBandwidth() {
        return this.maxBandwidth;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return reuse
     */
    public String getReuse() {
        return this.reuse;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    /**
     * @return videoCenter
     */
    public String getVideoCenter() {
        return this.videoCenter;
    }

    public static final class Builder extends Request.Builder<CreateLivePrivateLineRequest, Builder> {
        private String accelerationArea; 
        private String accelerationType; 
        private String appName; 
        private String domainName; 
        private String instanceId; 
        private String maxBandwidth; 
        private Long ownerId; 
        private String regionId; 
        private String reuse; 
        private String streamName; 
        private String videoCenter; 

        private Builder() {
            super();
        } 

        private Builder(CreateLivePrivateLineRequest request) {
            super(request);
            this.accelerationArea = request.accelerationArea;
            this.accelerationType = request.accelerationType;
            this.appName = request.appName;
            this.domainName = request.domainName;
            this.instanceId = request.instanceId;
            this.maxBandwidth = request.maxBandwidth;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.reuse = request.reuse;
            this.streamName = request.streamName;
            this.videoCenter = request.videoCenter;
        } 

        /**
         * <p>The acceleration channel.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-1</p>
         */
        public Builder accelerationArea(String accelerationArea) {
            this.putQueryParameter("AccelerationArea", accelerationArea);
            this.accelerationArea = accelerationArea;
            return this;
        }

        /**
         * <p>The acceleration type. Valid values:</p>
         * <ul>
         * <li>play: streaming acceleration</li>
         * <li>publish: stream ingest acceleration</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>play</p>
         */
        public Builder accelerationType(String accelerationType) {
            this.putQueryParameter("AccelerationType", accelerationType);
            this.accelerationType = accelerationType;
            return this;
        }

        /**
         * <p>The name of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>live</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The main streaming domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo.aliyundoc.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The acceleration channel that you want to reuse. This parameter is required if Reuse is set to yes.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1iovsdpf01ym9su****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The accelerated bandwidth. Unit: Mbit/s. This parameter is required if Reuse is set to no.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder maxBandwidth(String maxBandwidth) {
            this.putQueryParameter("MaxBandwidth", maxBandwidth);
            this.maxBandwidth = maxBandwidth;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to reuse an existing acceleration channel. Valid values:</p>
         * <ul>
         * <li>yes: reuses an existing acceleration channel.</li>
         * <li>no: creates a new acceleration channel.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>no</p>
         */
        public Builder reuse(String reuse) {
            this.putQueryParameter("Reuse", reuse);
            this.reuse = reuse;
            return this;
        }

        /**
         * <p>The name of the live stream.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testStream</p>
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        /**
         * <p>The live center. Valid values: cn-beijing, cn-shanghai, cn-shenzhen, cn-qingdao, ap-northeast-1, ap-southeast-5, eu-central-1, and ap-southeast-1, which indicate China (Beijing), China (Shanghai), China (Shenzhen), China (Qingdao), Japan (Tokyo), Indonesia (Jakarta), Germany (Frankfurt), and Singapore, respectively.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder videoCenter(String videoCenter) {
            this.putQueryParameter("VideoCenter", videoCenter);
            this.videoCenter = videoCenter;
            return this;
        }

        @Override
        public CreateLivePrivateLineRequest build() {
            return new CreateLivePrivateLineRequest(this);
        } 

    } 

}
