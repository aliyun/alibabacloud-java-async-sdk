// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMachineCanRebootResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMachineCanRebootResponseBody</p>
 */
public class DescribeMachineCanRebootResponseBody extends TeaModel {
    @NameInMap("CanReboot")
    private Boolean canReboot;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMachineCanRebootResponseBody(Builder builder) {
        this.canReboot = builder.canReboot;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMachineCanRebootResponseBody create() {
        return builder().build();
    }

    /**
     * @return canReboot
     */
    public Boolean getCanReboot() {
        return this.canReboot;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean canReboot; 
        private String requestId; 

        /**
         * CanReboot.
         */
        public Builder canReboot(Boolean canReboot) {
            this.canReboot = canReboot;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMachineCanRebootResponseBody build() {
            return new DescribeMachineCanRebootResponseBody(this);
        } 

    } 

}
