// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDedicatedHostPasswordResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDedicatedHostPasswordResponseBody</p>
 */
public class ModifyDedicatedHostPasswordResponseBody extends TeaModel {
    @NameInMap("DedicatedHostName")
    private String dedicatedHostName;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyDedicatedHostPasswordResponseBody(Builder builder) {
        this.dedicatedHostName = builder.dedicatedHostName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDedicatedHostPasswordResponseBody create() {
        return builder().build();
    }

    /**
     * @return dedicatedHostName
     */
    public String getDedicatedHostName() {
        return this.dedicatedHostName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dedicatedHostName; 
        private String requestId; 

        /**
         * DedicatedHostName.
         */
        public Builder dedicatedHostName(String dedicatedHostName) {
            this.dedicatedHostName = dedicatedHostName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDedicatedHostPasswordResponseBody build() {
            return new ModifyDedicatedHostPasswordResponseBody(this);
        } 

    } 

}
