// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieiap_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AppUseTimeReportResponseBody} extends {@link TeaModel}
 *
 * <p>AppUseTimeReportResponseBody</p>
 */
public class AppUseTimeReportResponseBody extends TeaModel {
    @NameInMap("RetCode")
    private Integer retCode;

    @NameInMap("RetMsg")
    private String retMsg;

    @NameInMap("RetValue")
    private Boolean retValue;

    private AppUseTimeReportResponseBody(Builder builder) {
        this.retCode = builder.retCode;
        this.retMsg = builder.retMsg;
        this.retValue = builder.retValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppUseTimeReportResponseBody create() {
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
    public Boolean getRetValue() {
        return this.retValue;
    }

    public static final class Builder {
        private Integer retCode; 
        private String retMsg; 
        private Boolean retValue; 

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

        public AppUseTimeReportResponseBody build() {
            return new AppUseTimeReportResponseBody(this);
        } 

    } 

}
