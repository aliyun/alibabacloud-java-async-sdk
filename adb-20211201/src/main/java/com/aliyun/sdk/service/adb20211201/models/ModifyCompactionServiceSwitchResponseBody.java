// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyCompactionServiceSwitchResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyCompactionServiceSwitchResponseBody</p>
 */
public class ModifyCompactionServiceSwitchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyCompactionServiceSwitchResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCompactionServiceSwitchResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>21ABF219-10E0-571B-94B8-9C9AE5022BF8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyCompactionServiceSwitchResponseBody build() {
            return new ModifyCompactionServiceSwitchResponseBody(this);
        } 

    } 

}
