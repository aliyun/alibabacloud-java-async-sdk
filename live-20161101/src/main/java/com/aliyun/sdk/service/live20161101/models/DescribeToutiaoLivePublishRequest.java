// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeToutiaoLivePublishRequest} extends {@link RequestModel}
 *
 * <p>DescribeToutiaoLivePublishRequest</p>
 */
public class DescribeToutiaoLivePublishRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("App")
    @Validation(required = true)
    private String app;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("Stream")
    @Validation(required = true)
    private String stream;

    private DescribeToutiaoLivePublishRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.app = builder.app;
        this.domain = builder.domain;
        this.endTime = builder.endTime;
        this.ownerId = builder.ownerId;
        this.startTime = builder.startTime;
        this.stream = builder.stream;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeToutiaoLivePublishRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return app
     */
    public String getApp() {
        return this.app;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return stream
     */
    public String getStream() {
        return this.stream;
    }

    public static final class Builder extends Request.Builder<DescribeToutiaoLivePublishRequest, Builder> {
        private String regionId; 
        private String app; 
        private String domain; 
        private String endTime; 
        private Long ownerId; 
        private String startTime; 
        private String stream; 

        private Builder() {
            super();
        } 

        private Builder(DescribeToutiaoLivePublishRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.app = request.app;
            this.domain = request.domain;
            this.endTime = request.endTime;
            this.ownerId = request.ownerId;
            this.startTime = request.startTime;
            this.stream = request.stream;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * App.
         */
        public Builder app(String app) {
            this.putQueryParameter("App", app);
            this.app = app;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Stream.
         */
        public Builder stream(String stream) {
            this.putQueryParameter("Stream", stream);
            this.stream = stream;
            return this;
        }

        @Override
        public DescribeToutiaoLivePublishRequest build() {
            return new DescribeToutiaoLivePublishRequest(this);
        } 

    } 

}
