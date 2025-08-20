// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieiap_1_0.models;

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
 * {@link CheckThirdRightSendPlanResponseBody} extends {@link TeaModel}
 *
 * <p>CheckThirdRightSendPlanResponseBody</p>
 */
public class CheckThirdRightSendPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RetCode")
    private Integer retCode;

    @com.aliyun.core.annotation.NameInMap("RetMsg")
    private String retMsg;

    @com.aliyun.core.annotation.NameInMap("RetValue")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CheckThirdRightSendPlanResponseBody model) {
            this.retCode = model.retCode;
            this.retMsg = model.retMsg;
            this.retValue = model.retValue;
        } 

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

    /**
     * 
     * {@link CheckThirdRightSendPlanResponseBody} extends {@link TeaModel}
     *
     * <p>CheckThirdRightSendPlanResponseBody</p>
     */
    public static class RetValue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivateDate")
        private String activateDate;

        @com.aliyun.core.annotation.NameInMap("CardType")
        private Integer cardType;

        @com.aliyun.core.annotation.NameInMap("ChannelCode")
        private String channelCode;

        @com.aliyun.core.annotation.NameInMap("ChannelName")
        private String channelName;

        @com.aliyun.core.annotation.NameInMap("ExtendInfo")
        private java.util.Map<String, ?> extendInfo;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("RightsExpiredDate")
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
        public java.util.Map<String, ?> getExtendInfo() {
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
            private java.util.Map<String, ?> extendInfo; 
            private String requestId; 
            private String rightsExpiredDate; 

            private Builder() {
            } 

            private Builder(RetValue model) {
                this.activateDate = model.activateDate;
                this.cardType = model.cardType;
                this.channelCode = model.channelCode;
                this.channelName = model.channelName;
                this.extendInfo = model.extendInfo;
                this.requestId = model.requestId;
                this.rightsExpiredDate = model.rightsExpiredDate;
            } 

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
            public Builder extendInfo(java.util.Map<String, ?> extendInfo) {
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
