// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SaveBaseStrategyPeriodRequest} extends {@link RequestModel}
 *
 * <p>SaveBaseStrategyPeriodRequest</p>
 */
public class SaveBaseStrategyPeriodRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String entryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OnlyWeekdays")
    private Boolean onlyWeekdays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OnlyWorkdays")
    private Boolean onlyWorkdays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyLevel")
    private Integer strategyLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkingTime")
    private java.util.List<String> workingTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkingTimeFramesJson")
    private String workingTimeFramesJson;

    private SaveBaseStrategyPeriodRequest(Builder builder) {
        super(builder);
        this.entryId = builder.entryId;
        this.onlyWeekdays = builder.onlyWeekdays;
        this.onlyWorkdays = builder.onlyWorkdays;
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
     * @return onlyWorkdays
     */
    public Boolean getOnlyWorkdays() {
        return this.onlyWorkdays;
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
    public java.util.List<String> getWorkingTime() {
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
        private Boolean onlyWorkdays; 
        private Integer strategyLevel; 
        private java.util.List<String> workingTime; 
        private String workingTimeFramesJson; 

        private Builder() {
            super();
        } 

        private Builder(SaveBaseStrategyPeriodRequest request) {
            super(request);
            this.entryId = request.entryId;
            this.onlyWeekdays = request.onlyWeekdays;
            this.onlyWorkdays = request.onlyWorkdays;
            this.strategyLevel = request.strategyLevel;
            this.workingTime = request.workingTime;
            this.workingTimeFramesJson = request.workingTimeFramesJson;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fe51eca2-a904-4b4d-b3ff-31be334b9500</p>
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
         * OnlyWorkdays.
         */
        public Builder onlyWorkdays(Boolean onlyWorkdays) {
            this.putQueryParameter("OnlyWorkdays", onlyWorkdays);
            this.onlyWorkdays = onlyWorkdays;
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
        public Builder workingTime(java.util.List<String> workingTime) {
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
