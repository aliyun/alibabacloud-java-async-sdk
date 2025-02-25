// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieiap_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBusAppConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetBusAppConfigResponseBody</p>
 */
public class GetBusAppConfigResponseBody extends TeaModel {
    @NameInMap("RetCode")
    private Integer retCode;

    @NameInMap("RetMsg")
    private String retMsg;

    @NameInMap("RetValue")
    private RetValue retValue;

    private GetBusAppConfigResponseBody(Builder builder) {
        this.retCode = builder.retCode;
        this.retMsg = builder.retMsg;
        this.retValue = builder.retValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBusAppConfigResponseBody create() {
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

        public GetBusAppConfigResponseBody build() {
            return new GetBusAppConfigResponseBody(this);
        } 

    } 

    public static class RetValue extends TeaModel {
        @NameInMap("Cashier")
        private String cashier;

        @NameInMap("ShoppingBar")
        private String shoppingBar;

        @NameInMap("ShoppingWindow")
        private String shoppingWindow;

        @NameInMap("VipLabel")
        private String vipLabel;

        private RetValue(Builder builder) {
            this.cashier = builder.cashier;
            this.shoppingBar = builder.shoppingBar;
            this.shoppingWindow = builder.shoppingWindow;
            this.vipLabel = builder.vipLabel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetValue create() {
            return builder().build();
        }

        /**
         * @return cashier
         */
        public String getCashier() {
            return this.cashier;
        }

        /**
         * @return shoppingBar
         */
        public String getShoppingBar() {
            return this.shoppingBar;
        }

        /**
         * @return shoppingWindow
         */
        public String getShoppingWindow() {
            return this.shoppingWindow;
        }

        /**
         * @return vipLabel
         */
        public String getVipLabel() {
            return this.vipLabel;
        }

        public static final class Builder {
            private String cashier; 
            private String shoppingBar; 
            private String shoppingWindow; 
            private String vipLabel; 

            /**
             * Cashier.
             */
            public Builder cashier(String cashier) {
                this.cashier = cashier;
                return this;
            }

            /**
             * ShoppingBar.
             */
            public Builder shoppingBar(String shoppingBar) {
                this.shoppingBar = shoppingBar;
                return this;
            }

            /**
             * ShoppingWindow.
             */
            public Builder shoppingWindow(String shoppingWindow) {
                this.shoppingWindow = shoppingWindow;
                return this;
            }

            /**
             * VipLabel.
             */
            public Builder vipLabel(String vipLabel) {
                this.vipLabel = vipLabel;
                return this;
            }

            public RetValue build() {
                return new RetValue(this);
            } 

        } 

    }
}
