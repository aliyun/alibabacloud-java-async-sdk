// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchNetworkResponseBody} extends {@link TeaModel}
 *
 * <p>SwitchNetworkResponseBody</p>
 */
public class SwitchNetworkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
    private String taskId;

    private SwitchNetworkResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchNetworkResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String requestId; 
        private String taskId; 

        /**
         * Switches the network type of an ApsaraDB for Redis instance from classic network to Virtual Private Cloud (VPC).
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Specifies whether to retain the original endpoint for the classic network after you switch the instance from classic network to VPC. Valid values:
         * <p>
         * 
         * *   **True**: retains the original endpoint.
         * *   **False**: does not retain the original endpoint. This is the default value.
         * 
         * >  This parameter can be used only when the network type of the instance is classic network.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public SwitchNetworkResponseBody build() {
            return new SwitchNetworkResponseBody(this);
        } 

    } 

}
