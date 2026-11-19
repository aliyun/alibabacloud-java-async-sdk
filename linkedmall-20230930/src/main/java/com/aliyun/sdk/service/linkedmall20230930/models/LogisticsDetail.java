// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(LogisticsDetail model) {
            this.ocurrTimeStr = model.ocurrTimeStr;
            this.standerdDesc = model.standerdDesc;
        } 

        /**
         * <p>Time when the logistics event occurred</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-01 00:00:00</p>
         */
        public Builder ocurrTimeStr(String ocurrTimeStr) {
            this.ocurrTimeStr = ocurrTimeStr;
            return this;
        }

        /**
         * <p>Description of the logistics event</p>
         * 
         * <strong>example:</strong>
         * <p>已签收</p>
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
