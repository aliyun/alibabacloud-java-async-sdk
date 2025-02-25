// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloneEngineConfigResponseBody} extends {@link TeaModel}
 *
 * <p>CloneEngineConfigResponseBody</p>
 */
public class CloneEngineConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EngineConfigId")
    private String engineConfigId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CloneEngineConfigResponseBody(Builder builder) {
        this.engineConfigId = builder.engineConfigId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneEngineConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return engineConfigId
     */
    public String getEngineConfigId() {
        return this.engineConfigId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String engineConfigId; 
        private String requestId; 

        /**
         * EngineConfigId.
         */
        public Builder engineConfigId(String engineConfigId) {
            this.engineConfigId = engineConfigId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CloneEngineConfigResponseBody build() {
            return new CloneEngineConfigResponseBody(this);
        } 

    } 

}
