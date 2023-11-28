// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDeployMachineResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDeployMachineResponseBody</p>
 */
public class ModifyDeployMachineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Boolean result;

    private ModifyDeployMachineResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDeployMachineResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean result; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the ECS instances are changed. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public ModifyDeployMachineResponseBody build() {
            return new ModifyDeployMachineResponseBody(this);
        } 

    } 

}
