// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCampaignTrendingReportRequest} extends {@link RequestModel}
 *
 * <p>ListCampaignTrendingReportRequest</p>
 */
public class ListCampaignTrendingReportRequest extends Request {
    @Query
    @NameInMap("CampaignId")
    @Validation(required = true)
    private String campaignId;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    private ListCampaignTrendingReportRequest(Builder builder) {
        super(builder);
        this.campaignId = builder.campaignId;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCampaignTrendingReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return campaignId
     */
    public String getCampaignId() {
        return this.campaignId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListCampaignTrendingReportRequest, Builder> {
        private String campaignId; 
        private Long endTime; 
        private String instanceId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListCampaignTrendingReportRequest request) {
            super(request);
            this.campaignId = request.campaignId;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.startTime = request.startTime;
        } 

        /**
         * 活动ID
         */
        public Builder campaignId(String campaignId) {
            this.putQueryParameter("CampaignId", campaignId);
            this.campaignId = campaignId;
            return this;
        }

        /**
         * 结束时间
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 开始时间
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListCampaignTrendingReportRequest build() {
            return new ListCampaignTrendingReportRequest(this);
        } 

    } 

}
