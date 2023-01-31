// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveBaseStrategyPeriodRequest} extends {@link RequestModel}
 *
 * <p>SaveBaseStrategyPeriodRequest</p>
 */
public class SaveBaseStrategyPeriodRequest extends Request {
    @Query
    @NameInMap("EntryId")
    @Validation(required = true)
    private String entryId;

    @Query
    @NameInMap("OnlyWeekdays")
    private Boolean onlyWeekdays;

    @Query
    @NameInMap("StrategyLevel")
    private Integer strategyLevel;

    @Query
    @NameInMap("WorkingTime")
    private java.util.List < String > workingTime;

    @Query
    @NameInMap("WorkingTimeFramesJson")
    private String workingTimeFramesJson;

    private SaveBaseStrategyPeriodRequest(Builder builder) {
        super(builder);
        this.entryId = builder.entryId;
        this.onlyWeekdays = builder.onlyWeekdays;
        this.strategyLevel = builder.strategyLevel;
        this.workingTime = builder.workingTime;
        this.workingTimeFramesJson = builder.workingTimeFramesJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveBaseStrategyPeriodRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entryId
     */
    public String getEntryId() {
        return this.entryId;
    }

    /**
     * @return onlyWeekdays
     */
    public Boolean getOnlyWeekdays() {
        return this.onlyWeekdays;
    }

    /**
     * @return strategyLevel
     */
    public Integer getStrategyLevel() {
        return this.strategyLevel;
    }

    /**
     * @return workingTime
     */
    public java.util.List < String > getWorkingTime() {
        return this.workingTime;
    }

    /**
     * @return workingTimeFramesJson
     */
    public String getWorkingTimeFramesJson() {
        return this.workingTimeFramesJson;
    }

    public static final class Builder extends Request.Builder<SaveBaseStrategyPeriodRequest, Builder> {
        private String entryId; 
        private Boolean onlyWeekdays; 
        private Integer strategyLevel; 
        private java.util.List < String > workingTime; 
        private String workingTimeFramesJson; 

        private Builder() {
            super();
        } 

        private Builder(SaveBaseStrategyPeriodRequest request) {
            super(request);
            this.entryId = request.entryId;
            this.onlyWeekdays = request.onlyWeekdays;
            this.strategyLevel = request.strategyLevel;
            this.workingTime = request.workingTime;
            this.workingTimeFramesJson = request.workingTimeFramesJson;
        } 

        /**
         * EntryId.
         */
        public Builder entryId(String entryId) {
            this.putQueryParameter("EntryId", entryId);
            this.entryId = entryId;
            return this;
        }

        /**
         * OnlyWeekdays.
         */
        public Builder onlyWeekdays(Boolean onlyWeekdays) {
            this.putQueryParameter("OnlyWeekdays", onlyWeekdays);
            this.onlyWeekdays = onlyWeekdays;
            return this;
        }

        /**
         * StrategyLevel.
         */
        public Builder strategyLevel(Integer strategyLevel) {
            this.putQueryParameter("StrategyLevel", strategyLevel);
            this.strategyLevel = strategyLevel;
            return this;
        }

        /**
         * WorkingTime.
         */
        public Builder workingTime(java.util.List < String > workingTime) {
            this.putQueryParameter("WorkingTime", workingTime);
            this.workingTime = workingTime;
            return this;
        }

        /**
         * WorkingTimeFramesJson.
         */
        public Builder workingTimeFramesJson(String workingTimeFramesJson) {
            this.putQueryParameter("WorkingTimeFramesJson", workingTimeFramesJson);
            this.workingTimeFramesJson = workingTimeFramesJson;
            return this;
        }

        @Override
        public SaveBaseStrategyPeriodRequest build() {
            return new SaveBaseStrategyPeriodRequest(this);
        } 

    } 

}
