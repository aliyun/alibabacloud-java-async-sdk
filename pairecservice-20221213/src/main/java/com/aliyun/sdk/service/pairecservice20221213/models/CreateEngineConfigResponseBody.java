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
 * {@link CreateEngineConfigResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEngineConfigResponseBody</p>
 */
public class CreateEngineConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EngineConfigId")
    private String engineConfigId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateEngineConfigResponseBody(Builder builder) {
        this.engineConfigId = builder.engineConfigId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEngineConfigResponseBody create() {
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

        public CreateEngineConfigResponseBody build() {
            return new CreateEngineConfigResponseBody(this);
        } 

    } 

}
