// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

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
 * {@link GetResourceCenterServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceCenterServiceStatusResponseBody</p>
 */
public class GetResourceCenterServiceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InitialStatus")
    private String initialStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceStatus")
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
         * <p>The initialization status of the service. Valid values:</p>
         * <ul>
         * <li>Pending: The service is being initialized.</li>
         * <li>Finished: The service is initialized.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        public Builder initialStatus(String initialStatus) {
            this.initialStatus = initialStatus;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>AD5F848D-CCDC-5464-93E1-4BA50A4826DD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the service. Valid values:</p>
         * <ul>
         * <li>Enabled: The service is activated.</li>
         * <li>Disabled: The service is deactivated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
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
