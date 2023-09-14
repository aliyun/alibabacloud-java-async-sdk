// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDoctorHBaseRegionServerRequest} extends {@link RequestModel}
 *
 * <p>GetDoctorHBaseRegionServerRequest</p>
 */
public class GetDoctorHBaseRegionServerRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DateTime")
    @Validation(required = true)
    private String dateTime;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RegionServerHost")
    @Validation(required = true)
    private String regionServerHost;

    private GetDoctorHBaseRegionServerRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.dateTime = builder.dateTime;
        this.regionId = builder.regionId;
        this.regionServerHost = builder.regionServerHost;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDoctorHBaseRegionServerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return dateTime
     */
    public String getDateTime() {
        return this.dateTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return regionServerHost
     */
    public String getRegionServerHost() {
        return this.regionServerHost;
    }

    public static final class Builder extends Request.Builder<GetDoctorHBaseRegionServerRequest, Builder> {
        private String clusterId; 
        private String dateTime; 
        private String regionId; 
        private String regionServerHost; 

        private Builder() {
            super();
        } 

        private Builder(GetDoctorHBaseRegionServerRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.dateTime = request.dateTime;
            this.regionId = request.regionId;
            this.regionServerHost = request.regionServerHost;
        } 

        /**
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * DateTime.
         */
        public Builder dateTime(String dateTime) {
            this.putQueryParameter("DateTime", dateTime);
            this.dateTime = dateTime;
            return this;
        }

        /**
         * 区域ID。
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RegionServerHost.
         */
        public Builder regionServerHost(String regionServerHost) {
            this.putQueryParameter("RegionServerHost", regionServerHost);
            this.regionServerHost = regionServerHost;
            return this;
        }

        @Override
        public GetDoctorHBaseRegionServerRequest build() {
            return new GetDoctorHBaseRegionServerRequest(this);
        } 

    } 

}
