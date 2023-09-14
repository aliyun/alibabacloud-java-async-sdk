// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDoctorHBaseRegionRequest} extends {@link RequestModel}
 *
 * <p>GetDoctorHBaseRegionRequest</p>
 */
public class GetDoctorHBaseRegionRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DateTime")
    @Validation(required = true)
    private String dateTime;

    @Query
    @NameInMap("HbaseRegionId")
    @Validation(required = true)
    private String hbaseRegionId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetDoctorHBaseRegionRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.dateTime = builder.dateTime;
        this.hbaseRegionId = builder.hbaseRegionId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDoctorHBaseRegionRequest create() {
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
     * @return hbaseRegionId
     */
    public String getHbaseRegionId() {
        return this.hbaseRegionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetDoctorHBaseRegionRequest, Builder> {
        private String clusterId; 
        private String dateTime; 
        private String hbaseRegionId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetDoctorHBaseRegionRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.dateTime = request.dateTime;
            this.hbaseRegionId = request.hbaseRegionId;
            this.regionId = request.regionId;
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
         * Region ID。
         */
        public Builder hbaseRegionId(String hbaseRegionId) {
            this.putQueryParameter("HbaseRegionId", hbaseRegionId);
            this.hbaseRegionId = hbaseRegionId;
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

        @Override
        public GetDoctorHBaseRegionRequest build() {
            return new GetDoctorHBaseRegionRequest(this);
        } 

    } 

}
