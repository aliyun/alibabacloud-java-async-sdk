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
 * {@link SingleSendMailResponseBody} extends {@link TeaModel}
 *
 * <p>SingleSendMailResponseBody</p>
 */
public class SingleSendMailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EnvId")
    private String envId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(SingleSendMailResponseBody model) {
            this.envId = model.envId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Event ID</p>
         * 
         * <strong>example:</strong>
         * <p>600000xxxxxxxxxx642</p>
         */
        public Builder envId(String envId) {
            this.envId = envId;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>2D086F6-xxxx-xxxx-xxxx-006DED011A85</p>
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
