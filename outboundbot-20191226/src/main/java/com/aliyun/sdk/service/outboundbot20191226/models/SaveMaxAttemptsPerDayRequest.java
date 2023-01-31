// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveMaxAttemptsPerDayRequest} extends {@link RequestModel}
 *
 * <p>SaveMaxAttemptsPerDayRequest</p>
 */
public class SaveMaxAttemptsPerDayRequest extends Request {
    @Query
    @NameInMap("EntryId")
    @Validation(required = true)
    private String entryId;

    @Query
    @NameInMap("MaxAttemptsPerDay")
    private Integer maxAttemptsPerDay;

    @Query
    @NameInMap("StrategyLevel")
    private Integer strategyLevel;

    private SaveMaxAttemptsPerDayRequest(Builder builder) {
        super(builder);
        this.entryId = builder.entryId;
        this.maxAttemptsPerDay = builder.maxAttemptsPerDay;
        this.strategyLevel = builder.strategyLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveMaxAttemptsPerDayRequest create() {
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
     * @return maxAttemptsPerDay
     */
    public Integer getMaxAttemptsPerDay() {
        return this.maxAttemptsPerDay;
    }

    /**
     * @return strategyLevel
     */
    public Integer getStrategyLevel() {
        return this.strategyLevel;
    }

    public static final class Builder extends Request.Builder<SaveMaxAttemptsPerDayRequest, Builder> {
        private String entryId; 
        private Integer maxAttemptsPerDay; 
        private Integer strategyLevel; 

        private Builder() {
            super();
        } 

        private Builder(SaveMaxAttemptsPerDayRequest request) {
            super(request);
            this.entryId = request.entryId;
            this.maxAttemptsPerDay = request.maxAttemptsPerDay;
            this.strategyLevel = request.strategyLevel;
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
         * MaxAttemptsPerDay.
         */
        public Builder maxAttemptsPerDay(Integer maxAttemptsPerDay) {
            this.putQueryParameter("MaxAttemptsPerDay", maxAttemptsPerDay);
            this.maxAttemptsPerDay = maxAttemptsPerDay;
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

        @Override
        public SaveMaxAttemptsPerDayRequest build() {
            return new SaveMaxAttemptsPerDayRequest(this);
        } 

    } 

}
