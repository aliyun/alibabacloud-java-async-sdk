// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link GenerateTrafficControlTaskCodeResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateTrafficControlTaskCodeResponseBody</p>
 */
public class GenerateTrafficControlTaskCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("PreNeedConfig")
    private Boolean preNeedConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GenerateTrafficControlTaskCodeResponseBody(Builder builder) {
        this.code = builder.code;
        this.preNeedConfig = builder.preNeedConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateTrafficControlTaskCodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return preNeedConfig
     */
    public Boolean getPreNeedConfig() {
        return this.preNeedConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Boolean preNeedConfig; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * PreNeedConfig.
         */
        public Builder preNeedConfig(Boolean preNeedConfig) {
            this.preNeedConfig = preNeedConfig;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateTrafficControlTaskCodeResponseBody build() {
            return new GenerateTrafficControlTaskCodeResponseBody(this);
        } 

    } 

}
