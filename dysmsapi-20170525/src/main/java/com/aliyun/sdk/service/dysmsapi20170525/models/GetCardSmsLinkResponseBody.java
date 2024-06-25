// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCardSmsLinkResponseBody} extends {@link TeaModel}
 *
 * <p>GetCardSmsLinkResponseBody</p>
 */
public class GetCardSmsLinkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetCardSmsLinkResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCardSmsLinkResponseBody create() {
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
         * The HTTP status code.
         * <p>
         * 
         * *   The value OK indicates that the request was successful.
         * *   Other values indicate that the request failed. For more information, see [Error codes](~~101346~~).
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
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetCardSmsLinkResponseBody build() {
            return new GetCardSmsLinkResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CardPhoneNumbers")
        private String cardPhoneNumbers;

        @com.aliyun.core.annotation.NameInMap("CardSignNames")
        private String cardSignNames;

        @com.aliyun.core.annotation.NameInMap("CardSmsLinks")
        private String cardSmsLinks;

        @com.aliyun.core.annotation.NameInMap("CardTmpState")
        private Integer cardTmpState;

        @com.aliyun.core.annotation.NameInMap("NotMediaMobiles")
        private String notMediaMobiles;

        private Data(Builder builder) {
            this.cardPhoneNumbers = builder.cardPhoneNumbers;
            this.cardSignNames = builder.cardSignNames;
            this.cardSmsLinks = builder.cardSmsLinks;
            this.cardTmpState = builder.cardTmpState;
            this.notMediaMobiles = builder.notMediaMobiles;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cardPhoneNumbers
         */
        public String getCardPhoneNumbers() {
            return this.cardPhoneNumbers;
        }

        /**
         * @return cardSignNames
         */
        public String getCardSignNames() {
            return this.cardSignNames;
        }

        /**
         * @return cardSmsLinks
         */
        public String getCardSmsLinks() {
            return this.cardSmsLinks;
        }

        /**
         * @return cardTmpState
         */
        public Integer getCardTmpState() {
            return this.cardTmpState;
        }

        /**
         * @return notMediaMobiles
         */
        public String getNotMediaMobiles() {
            return this.notMediaMobiles;
        }

        public static final class Builder {
            private String cardPhoneNumbers; 
            private String cardSignNames; 
            private String cardSmsLinks; 
            private Integer cardTmpState; 
            private String notMediaMobiles; 

            /**
             * The mobile phone numbers that support card messages.
             */
            public Builder cardPhoneNumbers(String cardPhoneNumbers) {
                this.cardPhoneNumbers = cardPhoneNumbers;
                return this;
            }

            /**
             * The signatures must correspond to the mobile numbers and short URLs in sequence.
             */
            public Builder cardSignNames(String cardSignNames) {
                this.cardSignNames = cardSignNames;
                return this;
            }

            /**
             * The short URLs.
             */
            public Builder cardSmsLinks(String cardSmsLinks) {
                this.cardSmsLinks = cardSmsLinks;
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
             * The mobile phone numbers that do not support card messages.
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
