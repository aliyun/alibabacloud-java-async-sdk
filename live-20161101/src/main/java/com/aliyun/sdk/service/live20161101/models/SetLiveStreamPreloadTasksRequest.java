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
 * {@link SetLiveStreamPreloadTasksRequest} extends {@link RequestModel}
 *
 * <p>SetLiveStreamPreloadTasksRequest</p>
 */
public class SetLiveStreamPreloadTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Area")
    private String area;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlayUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String playUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreloadedEndTime")
    private String preloadedEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreloadedStartTime")
    private String preloadedStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private SetLiveStreamPreloadTasksRequest(Builder builder) {
        super(builder);
        this.area = builder.area;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.playUrl = builder.playUrl;
        this.preloadedEndTime = builder.preloadedEndTime;
        this.preloadedStartTime = builder.preloadedStartTime;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLiveStreamPreloadTasksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return area
     */
    public String getArea() {
        return this.area;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return playUrl
     */
    public String getPlayUrl() {
        return this.playUrl;
    }

    /**
     * @return preloadedEndTime
     */
    public String getPreloadedEndTime() {
        return this.preloadedEndTime;
    }

    /**
     * @return preloadedStartTime
     */
    public String getPreloadedStartTime() {
        return this.preloadedStartTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SetLiveStreamPreloadTasksRequest, Builder> {
        private String area; 
        private String domainName; 
        private Long ownerId; 
        private String playUrl; 
        private String preloadedEndTime; 
        private String preloadedStartTime; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SetLiveStreamPreloadTasksRequest request) {
            super(request);
            this.area = request.area;
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.playUrl = request.playUrl;
            this.preloadedEndTime = request.preloadedEndTime;
            this.preloadedStartTime = request.preloadedStartTime;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The acceleration region where you want to prefetch the live content. Valid values:</p>
         * <ul>
         * <li>domestic: regions in the Chinese mainland.</li>
         * <li>overseas: regions outside the Chinese mainland.</li>
         * <li>global: regions in and outside the Chinese mainland.</li>
         * </ul>
         * <p>If you do not specify this parameter, the acceleration region configured for the domain name is used.</p>
         * 
         * <strong>example:</strong>
         * <p>domestic</p>
         */
        public Builder area(String area) {
            this.putQueryParameter("Area", area);
            this.area = area;
            return this;
        }

        /**
         * <p>The streaming domain name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
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
         * <p>The streaming URL. You can specify up to 100 streaming URLs in a request. Separate multiple streaming URLs with commas (,).</p>
         * <p>This parameter is required.</p>
         */
        public Builder playUrl(String playUrl) {
            this.putQueryParameter("PlayUrl", playUrl);
            this.playUrl = playUrl;
            return this;
        }

        /**
         * <p>The end time of the prefetch task. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. Example: 2016-06-30T19:00:00Z. The interval between the start time and end time cannot exceed 6 hours.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-06-30T19:00:00Z</p>
         */
        public Builder preloadedEndTime(String preloadedEndTime) {
            this.putQueryParameter("PreloadedEndTime", preloadedEndTime);
            this.preloadedEndTime = preloadedEndTime;
            return this;
        }

        /**
         * <p>The start time of the prefetch task. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. Example: 2016-06-29T19:00:00Z. If you do not specify this parameter, the prefetch task runs for 1 hour by default.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-06-29T19:00:00Z</p>
         */
        public Builder preloadedStartTime(String preloadedStartTime) {
            this.putQueryParameter("PreloadedStartTime", preloadedStartTime);
            this.preloadedStartTime = preloadedStartTime;
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

        @Override
        public SetLiveStreamPreloadTasksRequest build() {
            return new SetLiveStreamPreloadTasksRequest(this);
        } 

    } 

}
