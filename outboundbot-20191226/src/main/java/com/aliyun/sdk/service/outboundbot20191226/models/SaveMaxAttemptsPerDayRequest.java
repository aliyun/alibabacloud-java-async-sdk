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
 * {@link SaveMaxAttemptsPerDayRequest} extends {@link RequestModel}
 *
 * <p>SaveMaxAttemptsPerDayRequest</p>
 */
public class SaveMaxAttemptsPerDayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String entryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxAttemptsPerDay")
    private Integer maxAttemptsPerDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyLevel")
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c8bf820a-6a8a-47bc-99bf-97593df8faa8</p>
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
