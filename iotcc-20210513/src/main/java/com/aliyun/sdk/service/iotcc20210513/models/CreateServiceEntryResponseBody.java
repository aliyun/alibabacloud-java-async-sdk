// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceEntryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServiceEntryResponseBody</p>
 */
public class CreateServiceEntryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceEntryId")
    private String serviceEntryId;

    private CreateServiceEntryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceEntryId = builder.serviceEntryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceEntryResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceEntryId
     */
    public String getServiceEntryId() {
        return this.serviceEntryId;
    }

    public static final class Builder {
        private String requestId; 
        private String serviceEntryId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceEntryId.
         */
        public Builder serviceEntryId(String serviceEntryId) {
            this.serviceEntryId = serviceEntryId;
            return this;
        }

        public CreateServiceEntryResponseBody build() {
            return new CreateServiceEntryResponseBody(this);
        } 

    } 

}
