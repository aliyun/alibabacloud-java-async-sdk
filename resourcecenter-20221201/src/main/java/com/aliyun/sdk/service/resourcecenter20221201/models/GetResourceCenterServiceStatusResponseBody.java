// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceCenterServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceCenterServiceStatusResponseBody</p>
 */
public class GetResourceCenterServiceStatusResponseBody extends TeaModel {
    @NameInMap("InitialStatus")
    private String initialStatus;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceStatus")
    private String serviceStatus;

    private GetResourceCenterServiceStatusResponseBody(Builder builder) {
        this.initialStatus = builder.initialStatus;
        this.requestId = builder.requestId;
        this.serviceStatus = builder.serviceStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceCenterServiceStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return initialStatus
     */
    public String getInitialStatus() {
        return this.initialStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceStatus
     */
    public String getServiceStatus() {
        return this.serviceStatus;
    }

    public static final class Builder {
        private String initialStatus; 
        private String requestId; 
        private String serviceStatus; 

        /**
         * InitialStatus.
         */
        public Builder initialStatus(String initialStatus) {
            this.initialStatus = initialStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceStatus.
         */
        public Builder serviceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }

        public GetResourceCenterServiceStatusResponseBody build() {
            return new GetResourceCenterServiceStatusResponseBody(this);
        } 

    } 

}
