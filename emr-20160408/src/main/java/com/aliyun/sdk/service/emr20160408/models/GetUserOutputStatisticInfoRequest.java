// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserOutputStatisticInfoRequest} extends {@link RequestModel}
 *
 * <p>GetUserOutputStatisticInfoRequest</p>
 */
public class GetUserOutputStatisticInfoRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("FromDatetime")
    @Validation(required = true)
    private String fromDatetime;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ToDatetime")
    @Validation(required = true)
    private String toDatetime;

    private GetUserOutputStatisticInfoRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.fromDatetime = builder.fromDatetime;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.toDatetime = builder.toDatetime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserOutputStatisticInfoRequest create() {
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
     * @return fromDatetime
     */
    public String getFromDatetime() {
        return this.fromDatetime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return toDatetime
     */
    public String getToDatetime() {
        return this.toDatetime;
    }

    public static final class Builder extends Request.Builder<GetUserOutputStatisticInfoRequest, Builder> {
        private String clusterId; 
        private String fromDatetime; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String toDatetime; 

        private Builder() {
            super();
        } 

        private Builder(GetUserOutputStatisticInfoRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.fromDatetime = response.fromDatetime;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.toDatetime = response.toDatetime;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * FromDatetime.
         */
        public Builder fromDatetime(String fromDatetime) {
            this.putQueryParameter("FromDatetime", fromDatetime);
            this.fromDatetime = fromDatetime;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * ToDatetime.
         */
        public Builder toDatetime(String toDatetime) {
            this.putQueryParameter("ToDatetime", toDatetime);
            this.toDatetime = toDatetime;
            return this;
        }

        @Override
        public GetUserOutputStatisticInfoRequest build() {
            return new GetUserOutputStatisticInfoRequest(this);
        } 

    } 

}
