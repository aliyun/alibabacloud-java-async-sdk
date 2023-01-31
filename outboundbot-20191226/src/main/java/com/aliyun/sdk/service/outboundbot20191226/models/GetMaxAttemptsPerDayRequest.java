// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMaxAttemptsPerDayRequest} extends {@link RequestModel}
 *
 * <p>GetMaxAttemptsPerDayRequest</p>
 */
public class GetMaxAttemptsPerDayRequest extends Request {
    @Query
    @NameInMap("EntryId")
    @Validation(required = true)
    private String entryId;

    @Query
    @NameInMap("StrategyLevel")
    private Integer strategyLevel;

    private GetMaxAttemptsPerDayRequest(Builder builder) {
        super(builder);
        this.entryId = builder.entryId;
        this.strategyLevel = builder.strategyLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMaxAttemptsPerDayRequest create() {
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
     * @return strategyLevel
     */
    public Integer getStrategyLevel() {
        return this.strategyLevel;
    }

    public static final class Builder extends Request.Builder<GetMaxAttemptsPerDayRequest, Builder> {
        private String entryId; 
        private Integer strategyLevel; 

        private Builder() {
            super();
        } 

        private Builder(GetMaxAttemptsPerDayRequest request) {
            super(request);
            this.entryId = request.entryId;
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
         * StrategyLevel.
         */
        public Builder strategyLevel(Integer strategyLevel) {
            this.putQueryParameter("StrategyLevel", strategyLevel);
            this.strategyLevel = strategyLevel;
            return this;
        }

        @Override
        public GetMaxAttemptsPerDayRequest build() {
            return new GetMaxAttemptsPerDayRequest(this);
        } 

    } 

}
