// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDoctorHBaseRegionServerRequest} extends {@link RequestModel}
 *
 * <p>GetDoctorHBaseRegionServerRequest</p>
 */
public class GetDoctorHBaseRegionServerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DateTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionServerHost")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b933c5aac8fe****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The date.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-01</p>
         */
        public Builder dateTime(String dateTime) {
            this.putQueryParameter("DateTime", dateTime);
            this.dateTime = dateTime;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The host of the region server.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>emr-worker-4.cluster-20****</p>
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
