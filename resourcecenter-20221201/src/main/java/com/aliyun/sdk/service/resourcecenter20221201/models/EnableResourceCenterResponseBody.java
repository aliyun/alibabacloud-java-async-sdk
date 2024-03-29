// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableResourceCenterResponseBody} extends {@link TeaModel}
 *
 * <p>EnableResourceCenterResponseBody</p>
 */
public class EnableResourceCenterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private EnableResourceCenterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableResourceCenterResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private String status; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The activation status of the service. Valid values:
         * <p>
         * 
         * *   Pending: The service is being activated.
         * *   Enabled: The service is activated.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public EnableResourceCenterResponseBody build() {
            return new EnableResourceCenterResponseBody(this);
        } 

    } 

}
