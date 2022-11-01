// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCardSmsLinkResponseBody} extends {@link TeaModel}
 *
 * <p>GetCardSmsLinkResponseBody</p>
 */
public class GetCardSmsLinkResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

        public GetCardSmsLinkResponseBody build() {
            return new GetCardSmsLinkResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CardPhoneNumbers")
        private String cardPhoneNumbers;

        @NameInMap("CardSignNames")
        private String cardSignNames;

        @NameInMap("CardSmsLinks")
        private String cardSmsLinks;

        @NameInMap("CardTmpState")
        private Integer cardTmpState;

        @NameInMap("NotMediaMobiles")
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
             * CardPhoneNumbers.
             */
            public Builder cardPhoneNumbers(String cardPhoneNumbers) {
                this.cardPhoneNumbers = cardPhoneNumbers;
                return this;
            }

            /**
             * CardSignNames.
             */
            public Builder cardSignNames(String cardSignNames) {
                this.cardSignNames = cardSignNames;
                return this;
            }

            /**
             * CardSmsLinks.
             */
            public Builder cardSmsLinks(String cardSmsLinks) {
                this.cardSmsLinks = cardSmsLinks;
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
