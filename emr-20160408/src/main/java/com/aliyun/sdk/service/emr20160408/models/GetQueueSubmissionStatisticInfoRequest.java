// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQueueSubmissionStatisticInfoRequest} extends {@link RequestModel}
 *
 * <p>GetQueueSubmissionStatisticInfoRequest</p>
 */
public class GetQueueSubmissionStatisticInfoRequest extends Request {
    @Query
    @NameInMap("ApplicationType")
    private String applicationType;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("FinalStatus")
    private String finalStatus;

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

    private GetQueueSubmissionStatisticInfoRequest(Builder builder) {
        super(builder);
        this.applicationType = builder.applicationType;
        this.clusterId = builder.clusterId;
        this.finalStatus = builder.finalStatus;
        this.fromDatetime = builder.fromDatetime;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.toDatetime = builder.toDatetime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQueueSubmissionStatisticInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationType
     */
    public String getApplicationType() {
        return this.applicationType;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return finalStatus
     */
    public String getFinalStatus() {
        return this.finalStatus;
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

    public static final class Builder extends Request.Builder<GetQueueSubmissionStatisticInfoRequest, Builder> {
        private String applicationType; 
        private String clusterId; 
        private String finalStatus; 
        private String fromDatetime; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String toDatetime; 

        private Builder() {
            super();
        } 

        private Builder(GetQueueSubmissionStatisticInfoRequest response) {
            super(response);
            this.applicationType = response.applicationType;
            this.clusterId = response.clusterId;
            this.finalStatus = response.finalStatus;
            this.fromDatetime = response.fromDatetime;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.toDatetime = response.toDatetime;
        } 

        /**
         * ApplicationType.
         */
        public Builder applicationType(String applicationType) {
            this.putQueryParameter("ApplicationType", applicationType);
            this.applicationType = applicationType;
            return this;
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
         * FinalStatus.
         */
        public Builder finalStatus(String finalStatus) {
            this.putQueryParameter("FinalStatus", finalStatus);
            this.finalStatus = finalStatus;
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
        public GetQueueSubmissionStatisticInfoRequest build() {
            return new GetQueueSubmissionStatisticInfoRequest(this);
        } 

    } 

}
