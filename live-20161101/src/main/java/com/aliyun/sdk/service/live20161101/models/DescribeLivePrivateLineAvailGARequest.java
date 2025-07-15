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
 * {@link DescribeLivePrivateLineAvailGARequest} extends {@link RequestModel}
 *
 * <p>DescribeLivePrivateLineAvailGARequest</p>
 */
public class DescribeLivePrivateLineAvailGARequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccelerationArea")
    private String accelerationArea;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsGaInstance")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isGaInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    private String streamName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoCenter")
    private String videoCenter;

    private DescribeLivePrivateLineAvailGARequest(Builder builder) {
        super(builder);
        this.accelerationArea = builder.accelerationArea;
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.isGaInstance = builder.isGaInstance;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.streamName = builder.streamName;
        this.videoCenter = builder.videoCenter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLivePrivateLineAvailGARequest create() {
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
     * @return isGaInstance
     */
    public String getIsGaInstance() {
        return this.isGaInstance;
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

    public static final class Builder extends Request.Builder<DescribeLivePrivateLineAvailGARequest, Builder> {
        private String accelerationArea; 
        private String appName; 
        private String domainName; 
        private String isGaInstance; 
        private Long ownerId; 
        private String regionId; 
        private String streamName; 
        private String videoCenter; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLivePrivateLineAvailGARequest request) {
            super(request);
            this.accelerationArea = request.accelerationArea;
            this.appName = request.appName;
            this.domainName = request.domainName;
            this.isGaInstance = request.isGaInstance;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.streamName = request.streamName;
            this.videoCenter = request.videoCenter;
        } 

        /**
         * <p>The acceleration channel.</p>
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
         * <p>The name of the application.</p>
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
         * <p>Specifies whether to query Global Accelerator (GA) instances. Valid values:</p>
         * <ul>
         * <li>yes: queries the status of GA instances.</li>
         * <li>no: queries the binding information between GA instances and acceleration circuits.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>no</p>
         */
        public Builder isGaInstance(String isGaInstance) {
            this.putQueryParameter("IsGaInstance", isGaInstance);
            this.isGaInstance = isGaInstance;
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
         * <p>The name of the live stream.</p>
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
         * <p>The live center. Valid values: cn-beijing, cn-shanghai, cn-shenzhen, cn-qingdao, ap-northeast-1, ap-southeast-5, eu-central-1, ap-southeast-1, and ap-south-1. cn-beijing indicates China (Beijing). cn-shanghai indicates China (Shanghai). cn-shenzhen indicates China (Shenzhen). cn-qingdao indicates China (Qingdao). ap-northeast-1 indicates Japan (Tokyo). ap-southeast-5 indicates Indonesia (Jakarta). eu-central-1 indicates Germany (Frankfurt). ap-southeast-1 indicates Singapore.</p>
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
        public DescribeLivePrivateLineAvailGARequest build() {
            return new DescribeLivePrivateLineAvailGARequest(this);
        } 

    } 

}
