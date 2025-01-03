// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
         * <p>The HTTP status code.</p>
         * <ul>
         * <li>The value OK indicates that the request was successful.</li>
         * <li>Other values indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CC89A90C-978F-46AC-B80D-54738371E7CA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetCardSmsLinkResponseBody build() {
            return new GetCardSmsLinkResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCardSmsLinkResponseBody} extends {@link TeaModel}
     *
     * <p>GetCardSmsLinkResponseBody</p>
     */
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
             * <p>The mobile phone numbers that support card messages.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;1390000****&quot;,&quot;1370000****&quot;]</p>
             */
            public Builder cardPhoneNumbers(String cardPhoneNumbers) {
                this.cardPhoneNumbers = cardPhoneNumbers;
                return this;
            }

            /**
             * <p>The signatures must correspond to the mobile numbers and short URLs in sequence.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;aliyun&quot;,&quot;aliyun2&quot;]</p>
             */
            public Builder cardSignNames(String cardSignNames) {
                this.cardSignNames = cardSignNames;
                return this;
            }

            /**
             * <p>The short URLs.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;mw2m.cn/LAaGGa&quot;,&quot;mw2m.cn/LAAaes&quot;]</p>
             */
            public Builder cardSmsLinks(String cardSmsLinks) {
                this.cardSmsLinks = cardSmsLinks;
                return this;
            }

            /**
             * <p>The review status of the card message template.</p>
             * <ul>
             * <li><strong>0</strong>: pending approval</li>
             * <li><strong>1</strong>: approved</li>
             * <li><strong>2</strong>: rejected</li>
             * </ul>
             * <blockquote>
             * <p>Unapproved card messages are rolled back.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cardTmpState(Integer cardTmpState) {
                this.cardTmpState = cardTmpState;
                return this;
            }

            /**
             * <p>The mobile phone numbers that do not support card messages.</p>
             * 
             * <strong>example:</strong>
             * <p>1390000****</p>
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
