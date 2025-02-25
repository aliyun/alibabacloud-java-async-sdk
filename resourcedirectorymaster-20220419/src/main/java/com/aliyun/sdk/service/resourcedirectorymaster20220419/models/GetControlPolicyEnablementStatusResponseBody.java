// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
 * {@link GetControlPolicyEnablementStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetControlPolicyEnablementStatusResponseBody</p>
 */
public class GetControlPolicyEnablementStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EnablementStatus")
    private String enablementStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetControlPolicyEnablementStatusResponseBody(Builder builder) {
        this.enablementStatus = builder.enablementStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetControlPolicyEnablementStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return enablementStatus
     */
    public String getEnablementStatus() {
        return this.enablementStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String enablementStatus; 
        private String requestId; 

        /**
         * <p>The status of the Control Policy feature. Valid values:</p>
         * <ul>
         * <li>Enabled: The feature is enabled.</li>
         * <li>PendingEnable: The feature is being enabled.</li>
         * <li>Disabled: The feature is disabled.</li>
         * <li>PendingDisable: The feature is being disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        public Builder enablementStatus(String enablementStatus) {
            this.enablementStatus = enablementStatus;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1DC39A4E-3B52-4EFE-9F93-4897D7FFA0C4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetControlPolicyEnablementStatusResponseBody build() {
            return new GetControlPolicyEnablementStatusResponseBody(this);
        } 

    } 

}
