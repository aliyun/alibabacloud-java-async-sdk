// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEffectiveDaysRequest} extends {@link RequestModel}
 *
 * <p>GetEffectiveDaysRequest</p>
 */
public class GetEffectiveDaysRequest extends Request {
    @Query
    @NameInMap("EntryId")
    @Validation(required = true)
    private String entryId;

    @Query
    @NameInMap("StrategyLevel")
    private Integer strategyLevel;

    private GetEffectiveDaysRequest(Builder builder) {
        super(builder);
        this.entryId = builder.entryId;
        this.strategyLevel = builder.strategyLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEffectiveDaysRequest create() {
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

    public static final class Builder extends Request.Builder<GetEffectiveDaysRequest, Builder> {
        private String entryId; 
        private Integer strategyLevel; 

        private Builder() {
            super();
        } 

        private Builder(GetEffectiveDaysRequest request) {
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
        public GetEffectiveDaysRequest build() {
            return new GetEffectiveDaysRequest(this);
        } 

    } 

}
