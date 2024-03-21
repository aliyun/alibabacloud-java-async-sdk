// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDuplicateClassificationRequest} extends {@link RequestModel}
 *
 * <p>CheckDuplicateClassificationRequest</p>
 */
public class CheckDuplicateClassificationRequest extends Request {
    @Query
    @NameInMap("Classification")
    @Validation(required = true)
    private String classification;

    @Query
    @NameInMap("EventSceneType")
    private Integer eventSceneType;

    @Query
    @NameInMap("TrademarkName")
    @Validation(required = true)
    private String trademarkName;

    private CheckDuplicateClassificationRequest(Builder builder) {
        super(builder);
        this.classification = builder.classification;
        this.eventSceneType = builder.eventSceneType;
        this.trademarkName = builder.trademarkName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDuplicateClassificationRequest create() {
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
     * @return trademarkName
     */
    public String getTrademarkName() {
        return this.trademarkName;
    }

    public static final class Builder extends Request.Builder<CheckDuplicateClassificationRequest, Builder> {
        private String classification; 
        private Integer eventSceneType; 
        private String trademarkName; 

        private Builder() {
            super();
        } 

        private Builder(CheckDuplicateClassificationRequest request) {
            super(request);
            this.classification = request.classification;
            this.eventSceneType = request.eventSceneType;
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
         * TrademarkName.
         */
        public Builder trademarkName(String trademarkName) {
            this.putQueryParameter("TrademarkName", trademarkName);
            this.trademarkName = trademarkName;
            return this;
        }

        @Override
        public CheckDuplicateClassificationRequest build() {
            return new CheckDuplicateClassificationRequest(this);
        } 

    } 

}
