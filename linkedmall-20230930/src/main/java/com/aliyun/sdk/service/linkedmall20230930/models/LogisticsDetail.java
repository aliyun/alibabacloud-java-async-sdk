// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LogisticsDetail} extends {@link TeaModel}
 *
 * <p>LogisticsDetail</p>
 */
public class LogisticsDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ocurrTimeStr")
    private String ocurrTimeStr;

    @com.aliyun.core.annotation.NameInMap("standerdDesc")
    private String standerdDesc;

    private LogisticsDetail(Builder builder) {
        this.ocurrTimeStr = builder.ocurrTimeStr;
        this.standerdDesc = builder.standerdDesc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogisticsDetail create() {
        return builder().build();
    }

    /**
     * @return ocurrTimeStr
     */
    public String getOcurrTimeStr() {
        return this.ocurrTimeStr;
    }

    /**
     * @return standerdDesc
     */
    public String getStanderdDesc() {
        return this.standerdDesc;
    }

    public static final class Builder {
        private String ocurrTimeStr; 
        private String standerdDesc; 

        /**
         * ocurrTimeStr.
         */
        public Builder ocurrTimeStr(String ocurrTimeStr) {
            this.ocurrTimeStr = ocurrTimeStr;
            return this;
        }

        /**
         * standerdDesc.
         */
        public Builder standerdDesc(String standerdDesc) {
            this.standerdDesc = standerdDesc;
            return this;
        }

        public LogisticsDetail build() {
            return new LogisticsDetail(this);
        } 

    } 

}
