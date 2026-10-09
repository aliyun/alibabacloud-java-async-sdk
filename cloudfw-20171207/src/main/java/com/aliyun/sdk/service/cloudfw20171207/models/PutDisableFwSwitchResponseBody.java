// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link PutDisableFwSwitchResponseBody} extends {@link TeaModel}
 *
 * <p>PutDisableFwSwitchResponseBody</p>
 */
public class PutDisableFwSwitchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PutDisableFwSwitchResponseBody(Builder builder) {
        this.dryRun = builder.dryRun;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutDisableFwSwitchResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean dryRun; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PutDisableFwSwitchResponseBody model) {
            this.dryRun = model.dryRun;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether only a dry run was performed. If this parameter is true, the system performed pre-checks such as parameter validity, identity permissions, resource existence, quota limits, and dependency relationships without creating, updating, or deleting actual resources, triggering asynchronous traffic diversion tasks, or generating downstream side effects such as billing, notifications, or callbacks. If the dry run succeeded, DryRun=true is returned in the response, which can be distinguished from an actual call response. If the dry run failed, a machine-readable error code is returned (such as ErrorParamsInvalid for parameter errors, ErrorAuthentication for insufficient permissions, or ErrorInstanceOpenIpNumExceed for insufficient quota). A value of false (default) indicates that the request was initiated and the enable operation was performed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B2841452-CB8D-4F7D-B247-38E1CF7334F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PutDisableFwSwitchResponseBody build() {
            return new PutDisableFwSwitchResponseBody(this);
        } 

    } 

}
