// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMultiAccountResourceCenterServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetMultiAccountResourceCenterServiceStatusResponseBody</p>
 */
public class GetMultiAccountResourceCenterServiceStatusResponseBody extends TeaModel {
    @NameInMap("InitialStatus")
    private String initialStatus;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceStatus")
    private String serviceStatus;

    private GetMultiAccountResourceCenterServiceStatusResponseBody(Builder builder) {
        this.initialStatus = builder.initialStatus;
        this.requestId = builder.requestId;
        this.serviceStatus = builder.serviceStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMultiAccountResourceCenterServiceStatusResponseBody create() {
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
         * The initialization status of the feature. Valid values:
         * <p>
         * 
         * *   Pending: The feature is being initialized.
         * *   Finished: The feature is initialized.
         */
        public Builder initialStatus(String initialStatus) {
            this.initialStatus = initialStatus;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the feature. Valid values:
         * <p>
         * 
         * *   Enabled: The feature is enabled.
         * *   Disabled: The feature is disabled.
         */
        public Builder serviceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }

        public GetMultiAccountResourceCenterServiceStatusResponseBody build() {
            return new GetMultiAccountResourceCenterServiceStatusResponseBody(this);
        } 

    } 

}
