// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckTrademarkNameRequest} extends {@link RequestModel}
 *
 * <p>CheckTrademarkNameRequest</p>
 */
public class CheckTrademarkNameRequest extends Request {
    @Query
    @NameInMap("EventSceneType")
    private Integer eventSceneType;

    @Query
    @NameInMap("TrademarkName")
    @Validation(required = true)
    private String trademarkName;

    private CheckTrademarkNameRequest(Builder builder) {
        super(builder);
        this.eventSceneType = builder.eventSceneType;
        this.trademarkName = builder.trademarkName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckTrademarkNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventSceneType
     */
    public Integer getEventSceneType() {
        return this.eventSceneType;
    }

    /**
     * @return trademarkName
     */
    public String getTrademarkName() {
        return this.trademarkName;
    }

    public static final class Builder extends Request.Builder<CheckTrademarkNameRequest, Builder> {
        private Integer eventSceneType; 
        private String trademarkName; 

        private Builder() {
            super();
        } 

        private Builder(CheckTrademarkNameRequest request) {
            super(request);
            this.eventSceneType = request.eventSceneType;
            this.trademarkName = request.trademarkName;
        } 

        /**
         * EventSceneType.
         */
        public Builder eventSceneType(Integer eventSceneType) {
            this.putQueryParameter("EventSceneType", eventSceneType);
            this.eventSceneType = eventSceneType;
            return this;
        }

        /**
         * TrademarkName.
         */
        public Builder trademarkName(String trademarkName) {
            this.putQueryParameter("TrademarkName", trademarkName);
            this.trademarkName = trademarkName;
            return this;
        }

        @Override
        public CheckTrademarkNameRequest build() {
            return new CheckTrademarkNameRequest(this);
        } 

    } 

}
