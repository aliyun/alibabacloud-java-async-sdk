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
 * {@link GetAccountForAppResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountForAppResponseBody</p>
 */
public class GetAccountForAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RetCode")
    private Integer retCode;

    @com.aliyun.core.annotation.NameInMap("RetMsg")
    private String retMsg;

    @com.aliyun.core.annotation.NameInMap("RetValue")
    private RetValue retValue;

    private GetAccountForAppResponseBody(Builder builder) {
        this.retCode = builder.retCode;
        this.retMsg = builder.retMsg;
        this.retValue = builder.retValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountForAppResponseBody create() {
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

        private Builder(GetAccountForAppResponseBody model) {
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

        public GetAccountForAppResponseBody build() {
            return new GetAccountForAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAccountForAppResponseBody} extends {@link TeaModel}
     *
     * <p>GetAccountForAppResponseBody</p>
     */
    public static class RetValue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsVip")
        private Boolean isVip;

        @com.aliyun.core.annotation.NameInMap("StrVipExpire")
        private String strVipExpire;

        @com.aliyun.core.annotation.NameInMap("VipExpireAt")
        private Long vipExpireAt;

        private RetValue(Builder builder) {
            this.isVip = builder.isVip;
            this.strVipExpire = builder.strVipExpire;
            this.vipExpireAt = builder.vipExpireAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetValue create() {
            return builder().build();
        }

        /**
         * @return isVip
         */
        public Boolean getIsVip() {
            return this.isVip;
        }

        /**
         * @return strVipExpire
         */
        public String getStrVipExpire() {
            return this.strVipExpire;
        }

        /**
         * @return vipExpireAt
         */
        public Long getVipExpireAt() {
            return this.vipExpireAt;
        }

        public static final class Builder {
            private Boolean isVip; 
            private String strVipExpire; 
            private Long vipExpireAt; 

            private Builder() {
            } 

            private Builder(RetValue model) {
                this.isVip = model.isVip;
                this.strVipExpire = model.strVipExpire;
                this.vipExpireAt = model.vipExpireAt;
            } 

            /**
             * IsVip.
             */
            public Builder isVip(Boolean isVip) {
                this.isVip = isVip;
                return this;
            }

            /**
             * StrVipExpire.
             */
            public Builder strVipExpire(String strVipExpire) {
                this.strVipExpire = strVipExpire;
                return this;
            }

            /**
             * VipExpireAt.
             */
            public Builder vipExpireAt(Long vipExpireAt) {
                this.vipExpireAt = vipExpireAt;
                return this;
            }

            public RetValue build() {
                return new RetValue(this);
            } 

        } 

    }
}
