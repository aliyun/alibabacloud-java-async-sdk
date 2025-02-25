// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDuplicateTrademarkRequest} extends {@link RequestModel}
 *
 * <p>CheckDuplicateTrademarkRequest</p>
 */
public class CheckDuplicateTrademarkRequest extends Request {
    @Query
    @NameInMap("Classification")
    @Validation(required = true)
    private String classification;

    @Query
    @NameInMap("EventSceneType")
    @Validation(maximum = 999, minimum = 1)
    private Integer eventSceneType;

    @Query
    @NameInMap("MaterialName")
    @Validation(required = true)
    private String materialName;

    @Query
    @NameInMap("TrademarkName")
    @Validation(required = true)
    private String trademarkName;

    private CheckDuplicateTrademarkRequest(Builder builder) {
        super(builder);
        this.classification = builder.classification;
        this.eventSceneType = builder.eventSceneType;
        this.materialName = builder.materialName;
        this.trademarkName = builder.trademarkName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDuplicateTrademarkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return classification
     */
    public String getClassification() {
        return this.classification;
    }

    /**
     * @return eventSceneType
     */
    public Integer getEventSceneType() {
        return this.eventSceneType;
    }

    /**
     * @return materialName
     */
    public String getMaterialName() {
        return this.materialName;
    }

    /**
     * @return trademarkName
     */
    public String getTrademarkName() {
        return this.trademarkName;
    }

    public static final class Builder extends Request.Builder<CheckDuplicateTrademarkRequest, Builder> {
        private String classification; 
        private Integer eventSceneType; 
        private String materialName; 
        private String trademarkName; 

        private Builder() {
            super();
        } 

        private Builder(CheckDuplicateTrademarkRequest request) {
            super(request);
            this.classification = request.classification;
            this.eventSceneType = request.eventSceneType;
            this.materialName = request.materialName;
            this.trademarkName = request.trademarkName;
        } 

        /**
         * Classification.
         */
        public Builder classification(String classification) {
            this.putQueryParameter("Classification", classification);
            this.classification = classification;
            return this;
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
         * MaterialName.
         */
        public Builder materialName(String materialName) {
            this.putQueryParameter("MaterialName", materialName);
            this.materialName = materialName;
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
        public CheckDuplicateTrademarkRequest build() {
            return new CheckDuplicateTrademarkRequest(this);
        } 

    } 

}
