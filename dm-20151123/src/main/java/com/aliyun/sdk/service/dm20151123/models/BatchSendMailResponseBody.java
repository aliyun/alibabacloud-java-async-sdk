// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link BatchSendMailResponseBody} extends {@link TeaModel}
 *
 * <p>BatchSendMailResponseBody</p>
 */
public class BatchSendMailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EnvId")
    private String envId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BatchSendMailResponseBody(Builder builder) {
        this.envId = builder.envId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSendMailResponseBody create() {
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

        public BatchSendMailResponseBody build() {
            return new BatchSendMailResponseBody(this);
        } 

    } 

}
