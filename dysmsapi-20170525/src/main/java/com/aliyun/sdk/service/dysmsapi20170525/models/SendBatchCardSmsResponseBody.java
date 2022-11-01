// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendBatchCardSmsResponseBody} extends {@link TeaModel}
 *
 * <p>SendBatchCardSmsResponseBody</p>
 */
public class SendBatchCardSmsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private SendBatchCardSmsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendBatchCardSmsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SendBatchCardSmsResponseBody build() {
            return new SendBatchCardSmsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BizCardId")
        private String bizCardId;

        @NameInMap("BizDigitalId")
        private String bizDigitalId;

        @NameInMap("BizSmsId")
        private String bizSmsId;

        @NameInMap("CardTmpState")
        private Integer cardTmpState;

        @NameInMap("MediaMobiles")
        private String mediaMobiles;

        @NameInMap("NotMediaMobiles")
        private String notMediaMobiles;

        private Data(Builder builder) {
            this.bizCardId = builder.bizCardId;
            this.bizDigitalId = builder.bizDigitalId;
            this.bizSmsId = builder.bizSmsId;
            this.cardTmpState = builder.cardTmpState;
            this.mediaMobiles = builder.mediaMobiles;
            this.notMediaMobiles = builder.notMediaMobiles;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizCardId
         */
        public String getBizCardId() {
            return this.bizCardId;
        }

        /**
         * @return bizDigitalId
         */
        public String getBizDigitalId() {
            return this.bizDigitalId;
        }

        /**
         * @return bizSmsId
         */
        public String getBizSmsId() {
            return this.bizSmsId;
        }

        /**
         * @return cardTmpState
         */
        public Integer getCardTmpState() {
            return this.cardTmpState;
        }

        /**
         * @return mediaMobiles
         */
        public String getMediaMobiles() {
            return this.mediaMobiles;
        }

        /**
         * @return notMediaMobiles
         */
        public String getNotMediaMobiles() {
            return this.notMediaMobiles;
        }

        public static final class Builder {
            private String bizCardId; 
            private String bizDigitalId; 
            private String bizSmsId; 
            private Integer cardTmpState; 
            private String mediaMobiles; 
            private String notMediaMobiles; 

            /**
             * BizCardId.
             */
            public Builder bizCardId(String bizCardId) {
                this.bizCardId = bizCardId;
                return this;
            }

            /**
             * BizDigitalId.
             */
            public Builder bizDigitalId(String bizDigitalId) {
                this.bizDigitalId = bizDigitalId;
                return this;
            }

            /**
             * BizSmsId.
             */
            public Builder bizSmsId(String bizSmsId) {
                this.bizSmsId = bizSmsId;
                return this;
            }

            /**
             * CardTmpState.
             */
            public Builder cardTmpState(Integer cardTmpState) {
                this.cardTmpState = cardTmpState;
                return this;
            }

            /**
             * MediaMobiles.
             */
            public Builder mediaMobiles(String mediaMobiles) {
                this.mediaMobiles = mediaMobiles;
                return this;
            }

            /**
             * NotMediaMobiles.
             */
            public Builder notMediaMobiles(String notMediaMobiles) {
                this.notMediaMobiles = notMediaMobiles;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
