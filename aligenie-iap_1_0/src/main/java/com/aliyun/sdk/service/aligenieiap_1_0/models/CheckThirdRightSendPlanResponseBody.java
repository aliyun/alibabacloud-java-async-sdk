// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieiap_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckThirdRightSendPlanResponseBody} extends {@link TeaModel}
 *
 * <p>CheckThirdRightSendPlanResponseBody</p>
 */
public class CheckThirdRightSendPlanResponseBody extends TeaModel {
    @NameInMap("RetCode")
    private Integer retCode;

    @NameInMap("RetMsg")
    private String retMsg;

    @NameInMap("RetValue")
    private RetValue retValue;

    private CheckThirdRightSendPlanResponseBody(Builder builder) {
        this.retCode = builder.retCode;
        this.retMsg = builder.retMsg;
        this.retValue = builder.retValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckThirdRightSendPlanResponseBody create() {
        return builder().build();
    }

    /**
     * @return retCode
     */
    public Integer getRetCode() {
        return this.retCode;
    }

    /**
     * @return retMsg
     */
    public String getRetMsg() {
        return this.retMsg;
    }

    /**
     * @return retValue
     */
    public RetValue getRetValue() {
        return this.retValue;
    }

    public static final class Builder {
        private Integer retCode; 
        private String retMsg; 
        private RetValue retValue; 

        /**
         * RetCode.
         */
        public Builder retCode(Integer retCode) {
            this.retCode = retCode;
            return this;
        }

        /**
         * RetMsg.
         */
        public Builder retMsg(String retMsg) {
            this.retMsg = retMsg;
            return this;
        }

        /**
         * RetValue.
         */
        public Builder retValue(RetValue retValue) {
            this.retValue = retValue;
            return this;
        }

        public CheckThirdRightSendPlanResponseBody build() {
            return new CheckThirdRightSendPlanResponseBody(this);
        } 

    } 

    public static class RetValue extends TeaModel {
        @NameInMap("ActivateDate")
        private String activateDate;

        @NameInMap("CardType")
        private Integer cardType;

        @NameInMap("ChannelCode")
        private String channelCode;

        @NameInMap("ChannelName")
        private String channelName;

        @NameInMap("ExtendInfo")
        private java.util.Map < String, ? > extendInfo;

        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("RightsExpiredDate")
        private String rightsExpiredDate;

        private RetValue(Builder builder) {
            this.activateDate = builder.activateDate;
            this.cardType = builder.cardType;
            this.channelCode = builder.channelCode;
            this.channelName = builder.channelName;
            this.extendInfo = builder.extendInfo;
            this.requestId = builder.requestId;
            this.rightsExpiredDate = builder.rightsExpiredDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetValue create() {
            return builder().build();
        }

        /**
         * @return activateDate
         */
        public String getActivateDate() {
            return this.activateDate;
        }

        /**
         * @return cardType
         */
        public Integer getCardType() {
            return this.cardType;
        }

        /**
         * @return channelCode
         */
        public String getChannelCode() {
            return this.channelCode;
        }

        /**
         * @return channelName
         */
        public String getChannelName() {
            return this.channelName;
        }

        /**
         * @return extendInfo
         */
        public java.util.Map < String, ? > getExtendInfo() {
            return this.extendInfo;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return rightsExpiredDate
         */
        public String getRightsExpiredDate() {
            return this.rightsExpiredDate;
        }

        public static final class Builder {
            private String activateDate; 
            private Integer cardType; 
            private String channelCode; 
            private String channelName; 
            private java.util.Map < String, ? > extendInfo; 
            private String requestId; 
            private String rightsExpiredDate; 

            /**
             * ActivateDate.
             */
            public Builder activateDate(String activateDate) {
                this.activateDate = activateDate;
                return this;
            }

            /**
             * CardType.
             */
            public Builder cardType(Integer cardType) {
                this.cardType = cardType;
                return this;
            }

            /**
             * ChannelCode.
             */
            public Builder channelCode(String channelCode) {
                this.channelCode = channelCode;
                return this;
            }

            /**
             * ChannelName.
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * ExtendInfo.
             */
            public Builder extendInfo(java.util.Map < String, ? > extendInfo) {
                this.extendInfo = extendInfo;
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
             * RightsExpiredDate.
             */
            public Builder rightsExpiredDate(String rightsExpiredDate) {
                this.rightsExpiredDate = rightsExpiredDate;
                return this;
            }

            public RetValue build() {
                return new RetValue(this);
            } 

        } 

    }
}
