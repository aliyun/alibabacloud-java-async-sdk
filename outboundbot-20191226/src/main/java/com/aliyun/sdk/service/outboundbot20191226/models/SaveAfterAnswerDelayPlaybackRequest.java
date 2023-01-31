// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveAfterAnswerDelayPlaybackRequest} extends {@link RequestModel}
 *
 * <p>SaveAfterAnswerDelayPlaybackRequest</p>
 */
public class SaveAfterAnswerDelayPlaybackRequest extends Request {
    @Query
    @NameInMap("AfterAnswerDelayPlayback")
    private Integer afterAnswerDelayPlayback;

    @Query
    @NameInMap("EntryId")
    @Validation(required = true)
    private String entryId;

    @Query
    @NameInMap("StrategyLevel")
    private Integer strategyLevel;

    private SaveAfterAnswerDelayPlaybackRequest(Builder builder) {
        super(builder);
        this.afterAnswerDelayPlayback = builder.afterAnswerDelayPlayback;
        this.entryId = builder.entryId;
        this.strategyLevel = builder.strategyLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveAfterAnswerDelayPlaybackRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return afterAnswerDelayPlayback
     */
    public Integer getAfterAnswerDelayPlayback() {
        return this.afterAnswerDelayPlayback;
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

    public static final class Builder extends Request.Builder<SaveAfterAnswerDelayPlaybackRequest, Builder> {
        private Integer afterAnswerDelayPlayback; 
        private String entryId; 
        private Integer strategyLevel; 

        private Builder() {
            super();
        } 

        private Builder(SaveAfterAnswerDelayPlaybackRequest request) {
            super(request);
            this.afterAnswerDelayPlayback = request.afterAnswerDelayPlayback;
            this.entryId = request.entryId;
            this.strategyLevel = request.strategyLevel;
        } 

        /**
         * AfterAnswerDelayPlayback.
         */
        public Builder afterAnswerDelayPlayback(Integer afterAnswerDelayPlayback) {
            this.putQueryParameter("AfterAnswerDelayPlayback", afterAnswerDelayPlayback);
            this.afterAnswerDelayPlayback = afterAnswerDelayPlayback;
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
        public SaveAfterAnswerDelayPlaybackRequest build() {
            return new SaveAfterAnswerDelayPlaybackRequest(this);
        } 

    } 

}
