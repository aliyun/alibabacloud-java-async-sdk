// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveEffectiveDaysRequest} extends {@link RequestModel}
 *
 * <p>SaveEffectiveDaysRequest</p>
 */
public class SaveEffectiveDaysRequest extends Request {
    @Query
    @NameInMap("EffectiveDays")
    private Integer effectiveDays;

    @Query
    @NameInMap("EntryId")
    @Validation(required = true)
    private String entryId;

    @Query
    @NameInMap("StrategyLevel")
    private Integer strategyLevel;

    private SaveEffectiveDaysRequest(Builder builder) {
        super(builder);
        this.effectiveDays = builder.effectiveDays;
        this.entryId = builder.entryId;
        this.strategyLevel = builder.strategyLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveEffectiveDaysRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return effectiveDays
     */
    public Integer getEffectiveDays() {
        return this.effectiveDays;
    }

    /**
     * @return entryId
     */
    public String getEntryId() {
        return this.entryId;
    }

    /**
     * @return strategyLevel
     */
    public Integer getStrategyLevel() {
        return this.strategyLevel;
    }

    public static final class Builder extends Request.Builder<SaveEffectiveDaysRequest, Builder> {
        private Integer effectiveDays; 
        private String entryId; 
        private Integer strategyLevel; 

        private Builder() {
            super();
        } 

        private Builder(SaveEffectiveDaysRequest request) {
            super(request);
            this.effectiveDays = request.effectiveDays;
            this.entryId = request.entryId;
            this.strategyLevel = request.strategyLevel;
        } 

        /**
         * EffectiveDays.
         */
        public Builder effectiveDays(Integer effectiveDays) {
            this.putQueryParameter("EffectiveDays", effectiveDays);
            this.effectiveDays = effectiveDays;
            return this;
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
         * StrategyLevel.
         */
        public Builder strategyLevel(Integer strategyLevel) {
            this.putQueryParameter("StrategyLevel", strategyLevel);
            this.strategyLevel = strategyLevel;
            return this;
        }

        @Override
        public SaveEffectiveDaysRequest build() {
            return new SaveEffectiveDaysRequest(this);
        } 

    } 

}
