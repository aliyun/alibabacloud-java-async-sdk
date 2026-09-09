// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetInstanceTrialStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceTrialStatusResponseBody</p>
 */
public class GetInstanceTrialStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrialStatus")
    private Boolean trialStatus;

    private GetInstanceTrialStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trialStatus = builder.trialStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceTrialStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trialStatus
     */
    public Boolean getTrialStatus() {
        return this.trialStatus;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean trialStatus; 

        private Builder() {
        } 

        private Builder(GetInstanceTrialStatusResponseBody model) {
            this.requestId = model.requestId;
            this.trialStatus = model.trialStatus;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The trial status of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder trialStatus(Boolean trialStatus) {
            this.trialStatus = trialStatus;
            return this;
        }

        public GetInstanceTrialStatusResponseBody build() {
            return new GetInstanceTrialStatusResponseBody(this);
        } 

    } 

}
