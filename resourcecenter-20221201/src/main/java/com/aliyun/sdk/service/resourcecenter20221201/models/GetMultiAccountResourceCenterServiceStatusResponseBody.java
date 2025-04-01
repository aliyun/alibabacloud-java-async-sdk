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
 * {@link GetMultiAccountResourceCenterServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetMultiAccountResourceCenterServiceStatusResponseBody</p>
 */
public class GetMultiAccountResourceCenterServiceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InitialStatus")
    private String initialStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceStatus")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetMultiAccountResourceCenterServiceStatusResponseBody model) {
            this.initialStatus = model.initialStatus;
            this.requestId = model.requestId;
            this.serviceStatus = model.serviceStatus;
        } 

        /**
         * <p>The initialization status of the feature. Valid values:</p>
         * <ul>
         * <li>Pending: The feature is being initialized.</li>
         * <li>Finished: The feature is initialized.</li>
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
         * <p>81671397-1425-51F1-A144-4799E01BEBFF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the feature. Valid values:</p>
         * <ul>
         * <li>Enabled: The feature is enabled.</li>
         * <li>Disabled: The feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
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
