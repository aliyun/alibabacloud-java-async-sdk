// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SingleSendMailV2ResponseBody} extends {@link TeaModel}
 *
 * <p>SingleSendMailV2ResponseBody</p>
 */
public class SingleSendMailV2ResponseBody extends TeaModel {
    @NameInMap("EnvId")
    private String envId;

    @NameInMap("RequestId")
    private String requestId;

    private SingleSendMailV2ResponseBody(Builder builder) {
        this.envId = builder.envId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SingleSendMailV2ResponseBody create() {
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

        public SingleSendMailV2ResponseBody build() {
            return new SingleSendMailV2ResponseBody(this);
        } 

    } 

}
