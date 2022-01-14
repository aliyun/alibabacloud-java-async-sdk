// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link RpcUploadDemoRequest} extends {@link RequestModel}
 *
 * <p>RpcUploadDemoRequest</p>
 */
public class RpcUploadDemoRequest extends Request {
    @Body
    @NameInMap("cardData")
    private CardData cardData;

    @Body
    @NameInMap("outTrackId")
    private String outTrackId;

    @Body
    @NameInMap("privateData")
    private java.util.Map < String, String > privateData;


    private RpcUploadDemoRequest(Builder builder) {
        super(builder);
        this.cardData = builder.cardData;
        this.outTrackId = builder.outTrackId;
        this.privateData = builder.privateData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RpcUploadDemoRequest create() {
        return builder().build();
    }

    /**
     * @return cardData
     */
    public CardData getCardData() {
        return this.cardData;
    }

    /**
     * @return outTrackId
     */
    public String getOutTrackId() {
        return this.outTrackId;
    }

    /**
     * @return privateData
     */
    public java.util.Map < String, String > getPrivateData() {
        return this.privateData;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private CardData cardData; 
        private String outTrackId; 
        private java.util.Map < String, String > privateData; 

        /**
         * <p>cardData.</p>
         */
        public Builder cardData(CardData cardData) {
            this.putBodyParameter("cardData", cardData);
            this.cardData = cardData;
            return this;
        }

        /**
         * <p>outTrackId.</p>
         */
        public Builder outTrackId(String outTrackId) {
            this.putBodyParameter("outTrackId", outTrackId);
            this.outTrackId = outTrackId;
            return this;
        }

        /**
         * <p>privateData.</p>
         */
        public Builder privateData(java.util.Map < String, String > privateData) {
            this.putBodyParameter("privateData", privateData);
            this.privateData = privateData;
            return this;
        }

        public RpcUploadDemoRequest build() {
            return new RpcUploadDemoRequest(this);
        } 

    } 

    public static class CardData extends TeaModel {
        @NameInMap("cardMediaIdParamMap")
        private java.util.Map < String, String > cardMediaIdParamMap;

        @NameInMap("cardParamMap")
        private java.util.Map < String, String > cardParamMap;


        private CardData(Builder builder) {
            this.cardMediaIdParamMap = builder.cardMediaIdParamMap;
            this.cardParamMap = builder.cardParamMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CardData create() {
            return builder().build();
        }

        /**
         * @return cardMediaIdParamMap
         */
        public java.util.Map < String, String > getCardMediaIdParamMap() {
            return this.cardMediaIdParamMap;
        }

        /**
         * @return cardParamMap
         */
        public java.util.Map < String, String > getCardParamMap() {
            return this.cardParamMap;
        }

        public static final class Builder {
            private java.util.Map < String, String > cardMediaIdParamMap; 
            private java.util.Map < String, String > cardParamMap; 

            /**
             * <p>cardMediaIdParamMap.</p>
             */
            public Builder cardMediaIdParamMap(java.util.Map < String, String > cardMediaIdParamMap) {
                this.cardMediaIdParamMap = cardMediaIdParamMap;
                return this;
            }

            /**
             * <p>cardParamMap.</p>
             */
            public Builder cardParamMap(java.util.Map < String, String > cardParamMap) {
                this.cardParamMap = cardParamMap;
                return this;
            }

            public CardData build() {
                return new CardData(this);
            } 

        } 

    }
}
