// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetSCIMSynchronizationStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetSCIMSynchronizationStatusResponseBody</p>
 */
public class GetSCIMSynchronizationStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SCIMSynchronizationStatus")
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
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>SCIMSynchronizationStatus.</p>
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
