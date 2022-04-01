// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreStop} extends {@link TeaModel}
 *
 * <p>PreStop</p>
 */
public class PreStop extends TeaModel {
    @NameInMap("handler")
    private String handler;

    @NameInMap("timeout")
    private Integer timeout;

    private PreStop(Builder builder) {
        this.handler = builder.handler;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreStop create() {
        return builder().build();
    }

    /**
     * @return handler
     */
    public String getHandler() {
        return this.handler;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    public static final class Builder {
        private String handler; 
        private Integer timeout; 

        /**
         * PreStop handler
         */
        public Builder handler(String handler) {
            this.handler = handler;
            return this;
        }

        /**
         * PreStop hander timeout
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public PreStop build() {
            return new PreStop(this);
        } 

    } 

}
