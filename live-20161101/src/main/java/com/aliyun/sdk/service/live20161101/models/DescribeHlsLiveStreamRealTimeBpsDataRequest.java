// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHlsLiveStreamRealTimeBpsDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeHlsLiveStreamRealTimeBpsDataRequest</p>
 */
public class DescribeHlsLiveStreamRealTimeBpsDataRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Time")
    @Validation(required = true)
    private String time;

    private DescribeHlsLiveStreamRealTimeBpsDataRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHlsLiveStreamRealTimeBpsDataRequest create() {
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
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder extends Request.Builder<DescribeHlsLiveStreamRealTimeBpsDataRequest, Builder> {
        private String regionId; 
        private String domainName; 
        private Long ownerId; 
        private String time; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHlsLiveStreamRealTimeBpsDataRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.time = request.time;
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
         * DomainName.
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
         * Time.
         */
        public Builder time(String time) {
            this.putQueryParameter("Time", time);
            this.time = time;
            return this;
        }

        @Override
        public DescribeHlsLiveStreamRealTimeBpsDataRequest build() {
            return new DescribeHlsLiveStreamRealTimeBpsDataRequest(this);
        } 

    } 

}
