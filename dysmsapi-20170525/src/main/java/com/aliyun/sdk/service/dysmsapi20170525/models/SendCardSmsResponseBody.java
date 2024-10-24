// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The response code.</p>
         * <ul>
         * <li>If OK is returned, the request is successful.</li>
         * <li>Other values indicate that the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</li>
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
         * <p>F655A8D5-B967-440B-8683-DAD6FF8D28D0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
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

        public SendCardSmsResponseBody build() {
            return new SendCardSmsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SendCardSmsResponseBody} extends {@link TeaModel}
     *
     * <p>SendCardSmsResponseBody</p>
     */
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
             * <p>The ID of the card message.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder bizCardId(String bizCardId) {
                this.bizCardId = bizCardId;
                return this;
            }

            /**
             * <p>The ID of the digital message.</p>
             * 
             * <strong>example:</strong>
             * <p>232</p>
             */
            public Builder bizDigitalId(String bizDigitalId) {
                this.bizDigitalId = bizDigitalId;
                return this;
            }

            /**
             * <p>The ID of the text message.</p>
             * 
             * <strong>example:</strong>
             * <p>524</p>
             */
            public Builder bizSmsId(String bizSmsId) {
                this.bizSmsId = bizSmsId;
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
             * <p>The mobile phone number from which the card message is sent.</p>
             * 
             * <strong>example:</strong>
             * <p>1390000****</p>
             */
            public Builder mediaMobiles(String mediaMobiles) {
                this.mediaMobiles = mediaMobiles;
                return this;
            }

            /**
             * <p>The mobile phone number whose card message is rolled back.</p>
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
