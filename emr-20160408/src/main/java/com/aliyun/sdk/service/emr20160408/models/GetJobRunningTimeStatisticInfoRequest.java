// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobRunningTimeStatisticInfoRequest} extends {@link RequestModel}
 *
 * <p>GetJobRunningTimeStatisticInfoRequest</p>
 */
public class GetJobRunningTimeStatisticInfoRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("FromDatetime")
    @Validation(required = true)
    private String fromDatetime;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

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

    private GetJobRunningTimeStatisticInfoRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.fromDatetime = builder.fromDatetime;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.toDatetime = builder.toDatetime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobRunningTimeStatisticInfoRequest create() {
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    public static final class Builder extends Request.Builder<GetJobRunningTimeStatisticInfoRequest, Builder> {
        private String clusterId; 
        private String fromDatetime; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String toDatetime; 

        private Builder() {
            super();
        } 

        private Builder(GetJobRunningTimeStatisticInfoRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.fromDatetime = response.fromDatetime;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
        public GetJobRunningTimeStatisticInfoRequest build() {
            return new GetJobRunningTimeStatisticInfoRequest(this);
        } 

    } 

}
