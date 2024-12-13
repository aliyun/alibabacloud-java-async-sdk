// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSCIMSynchronizationStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetSCIMSynchronizationStatusResponseBody</p>
 */
public class GetSCIMSynchronizationStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SCIMSynchronizationStatus")
    private String SCIMSynchronizationStatus;

    private GetSCIMSynchronizationStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.SCIMSynchronizationStatus = builder.SCIMSynchronizationStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSCIMSynchronizationStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SCIMSynchronizationStatus
     */
    public String getSCIMSynchronizationStatus() {
        return this.SCIMSynchronizationStatus;
    }

    public static final class Builder {
        private String requestId; 
        private String SCIMSynchronizationStatus; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7C086C2F-1C66-57B3-B14E-2C1DA70727CD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of SCIM synchronization. Valid values:</p>
         * <ul>
         * <li>Enabled</li>
         * <li>Disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder SCIMSynchronizationStatus(String SCIMSynchronizationStatus) {
            this.SCIMSynchronizationStatus = SCIMSynchronizationStatus;
            return this;
        }

        public GetSCIMSynchronizationStatusResponseBody build() {
            return new GetSCIMSynchronizationStatusResponseBody(this);
        } 

    } 

}
