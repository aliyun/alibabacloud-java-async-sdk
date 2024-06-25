// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendCardSmsResponseBody} extends {@link TeaModel}
 *
 * <p>SendCardSmsResponseBody</p>
 */
public class SendCardSmsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SendCardSmsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendCardSmsResponseBody create() {
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
         * The response code.
         * <p>
         * 
         * *   If OK is returned, the request is successful.
         * *   Other values indicate that the request fails. For more information, see [Error codes](~~101346~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SendCardSmsResponseBody build() {
            return new SendCardSmsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizCardId")
        private String bizCardId;

        @com.aliyun.core.annotation.NameInMap("BizDigitalId")
        private String bizDigitalId;

        @com.aliyun.core.annotation.NameInMap("BizSmsId")
        private String bizSmsId;

        @com.aliyun.core.annotation.NameInMap("CardTmpState")
        private Integer cardTmpState;

        @com.aliyun.core.annotation.NameInMap("MediaMobiles")
        private String mediaMobiles;

        @com.aliyun.core.annotation.NameInMap("NotMediaMobiles")
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
             * The ID of the card message.
             */
            public Builder bizCardId(String bizCardId) {
                this.bizCardId = bizCardId;
                return this;
            }

            /**
             * The ID of the digital message.
             */
            public Builder bizDigitalId(String bizDigitalId) {
                this.bizDigitalId = bizDigitalId;
                return this;
            }

            /**
             * The ID of the text message.
             */
            public Builder bizSmsId(String bizSmsId) {
                this.bizSmsId = bizSmsId;
                return this;
            }

            /**
             * The review status of the card message template.
             * <p>
             * 
             * *   **0**: pending approval
             * *   **1**: approved
             * *   **2**: rejected
             * 
             * > Unapproved card messages are rolled back.
             */
            public Builder cardTmpState(Integer cardTmpState) {
                this.cardTmpState = cardTmpState;
                return this;
            }

            /**
             * The mobile phone number from which the card message is sent.
             */
            public Builder mediaMobiles(String mediaMobiles) {
                this.mediaMobiles = mediaMobiles;
                return this;
            }

            /**
             * The mobile phone number whose card message is rolled back.
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
