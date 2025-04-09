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
 * {@link ModifyEmptyNumberNoMoreCallsInfoRequest} extends {@link RequestModel}
 *
 * <p>ModifyEmptyNumberNoMoreCallsInfoRequest</p>
 */
public class ModifyEmptyNumberNoMoreCallsInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmptyNumberNoMoreCalls")
    private Boolean emptyNumberNoMoreCalls;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String entryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyLevel")
    private Integer strategyLevel;

    private ModifyEmptyNumberNoMoreCallsInfoRequest(Builder builder) {
        super(builder);
        this.emptyNumberNoMoreCalls = builder.emptyNumberNoMoreCalls;
        this.entryId = builder.entryId;
        this.strategyLevel = builder.strategyLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyEmptyNumberNoMoreCallsInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return emptyNumberNoMoreCalls
     */
    public Boolean getEmptyNumberNoMoreCalls() {
        return this.emptyNumberNoMoreCalls;
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

    public static final class Builder extends Request.Builder<ModifyEmptyNumberNoMoreCallsInfoRequest, Builder> {
        private Boolean emptyNumberNoMoreCalls; 
        private String entryId; 
        private Integer strategyLevel; 

        private Builder() {
            super();
        } 

        private Builder(ModifyEmptyNumberNoMoreCallsInfoRequest request) {
            super(request);
            this.emptyNumberNoMoreCalls = request.emptyNumberNoMoreCalls;
            this.entryId = request.entryId;
            this.strategyLevel = request.strategyLevel;
        } 

        /**
         * EmptyNumberNoMoreCalls.
         */
        public Builder emptyNumberNoMoreCalls(Boolean emptyNumberNoMoreCalls) {
            this.putQueryParameter("EmptyNumberNoMoreCalls", emptyNumberNoMoreCalls);
            this.emptyNumberNoMoreCalls = emptyNumberNoMoreCalls;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6cc9f5ca-2cb6-4cc7-a46b-2bbfd3e61b22</p>
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
        public ModifyEmptyNumberNoMoreCallsInfoRequest build() {
            return new ModifyEmptyNumberNoMoreCallsInfoRequest(this);
        } 

    } 

}
