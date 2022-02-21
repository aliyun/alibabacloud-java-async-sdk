// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDedicatedHostGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDedicatedHostGroupResponseBody</p>
 */
public class CreateDedicatedHostGroupResponseBody extends TeaModel {
    @NameInMap("DedicatedHostGroupId")
    private String dedicatedHostGroupId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDedicatedHostGroupResponseBody(Builder builder) {
        this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDedicatedHostGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return dedicatedHostGroupId
     */
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dedicatedHostGroupId; 
        private String requestId; 

        /**
         * DedicatedHostGroupId.
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDedicatedHostGroupResponseBody build() {
            return new CreateDedicatedHostGroupResponseBody(this);
        } 

    } 

}
