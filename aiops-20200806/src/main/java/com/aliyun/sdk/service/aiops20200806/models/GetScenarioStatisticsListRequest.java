// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScenarioStatisticsListRequest} extends {@link RequestModel}
 *
 * <p>GetScenarioStatisticsListRequest</p>
 */
public class GetScenarioStatisticsListRequest extends Request {
    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("ScenarioIds")
    private String scenarioIds;

    private GetScenarioStatisticsListRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.operaUid = builder.operaUid;
        this.scenarioIds = builder.scenarioIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScenarioStatisticsListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return scenarioIds
     */
    public String getScenarioIds() {
        return this.scenarioIds;
    }

    public static final class Builder extends Request.Builder<GetScenarioStatisticsListRequest, Builder> {
        private Long endTime; 
        private String operaUid; 
        private String scenarioIds; 

        private Builder() {
            super();
        } 

        private Builder(GetScenarioStatisticsListRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.operaUid = request.operaUid;
            this.scenarioIds = request.scenarioIds;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * ScenarioIds.
         */
        public Builder scenarioIds(String scenarioIds) {
            this.putQueryParameter("ScenarioIds", scenarioIds);
            this.scenarioIds = scenarioIds;
            return this;
        }

        @Override
        public GetScenarioStatisticsListRequest build() {
            return new GetScenarioStatisticsListRequest(this);
        } 

    } 

}
