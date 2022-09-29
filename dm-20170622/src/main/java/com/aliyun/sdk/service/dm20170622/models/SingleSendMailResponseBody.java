// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SingleSendMailResponseBody} extends {@link TeaModel}
 *
 * <p>SingleSendMailResponseBody</p>
 */
public class SingleSendMailResponseBody extends TeaModel {
    @NameInMap("EnvId")
    private String envId;

    @NameInMap("RequestId")
    private String requestId;

    private SingleSendMailResponseBody(Builder builder) {
        this.envId = builder.envId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SingleSendMailResponseBody create() {
        return builder().build();
    }

    /**
     * @return envId
     */
    public String getEnvId() {
        return this.envId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String envId; 
        private String requestId; 

        /**
         * EnvId.
         */
        public Builder envId(String envId) {
            this.envId = envId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SingleSendMailResponseBody build() {
            return new SingleSendMailResponseBody(this);
        } 

    } 

}
