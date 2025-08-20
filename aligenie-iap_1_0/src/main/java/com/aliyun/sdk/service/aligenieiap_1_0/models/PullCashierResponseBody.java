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
 * {@link PullCashierResponseBody} extends {@link TeaModel}
 *
 * <p>PullCashierResponseBody</p>
 */
public class PullCashierResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RetCode")
    private Integer retCode;

    @com.aliyun.core.annotation.NameInMap("RetMsg")
    private String retMsg;

    @com.aliyun.core.annotation.NameInMap("RetValue")
    private Boolean retValue;

    private PullCashierResponseBody(Builder builder) {
        this.retCode = builder.retCode;
        this.retMsg = builder.retMsg;
        this.retValue = builder.retValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PullCashierResponseBody create() {
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
    public Boolean getRetValue() {
        return this.retValue;
    }

    public static final class Builder {
        private Integer retCode; 
        private String retMsg; 
        private Boolean retValue; 

        private Builder() {
        } 

        private Builder(PullCashierResponseBody model) {
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
        public Builder retValue(Boolean retValue) {
            this.retValue = retValue;
            return this;
        }

        public PullCashierResponseBody build() {
            return new PullCashierResponseBody(this);
        } 

    } 

}
