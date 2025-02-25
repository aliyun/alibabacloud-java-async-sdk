// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link CreatePhysicalConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePhysicalConnectionResponseBody</p>
 */
public class CreatePhysicalConnectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PhysicalConnectionId")
    private String physicalConnectionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreatePhysicalConnectionResponseBody(Builder builder) {
        this.physicalConnectionId = builder.physicalConnectionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePhysicalConnectionResponseBody create() {
        return builder().build();
    }

    /**
     * @return physicalConnectionId
     */
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String physicalConnectionId; 
        private String requestId; 

        /**
         * PhysicalConnectionId.
         */
        public Builder physicalConnectionId(String physicalConnectionId) {
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePhysicalConnectionResponseBody build() {
            return new CreatePhysicalConnectionResponseBody(this);
        } 

    } 

}
