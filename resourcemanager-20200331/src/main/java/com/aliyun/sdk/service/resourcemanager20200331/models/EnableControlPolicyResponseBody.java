// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link EnableControlPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>EnableControlPolicyResponseBody</p>
 */
public class EnableControlPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EnablementStatus")
    private String enablementStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private EnableControlPolicyResponseBody(Builder builder) {
        this.enablementStatus = builder.enablementStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableControlPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(EnableControlPolicyResponseBody model) {
            this.enablementStatus = model.enablementStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status of the control policy feature. Valid values:</p>
         * <ul>
         * <li>Enabled: Enabled.</li>
         * <li>PendingEnable: Being enabled.</li>
         * <li>Disabled: Disabled.</li>
         * <li>PendingDisable: Being disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PendingEnable</p>
         */
        public Builder enablementStatus(String enablementStatus) {
            this.enablementStatus = enablementStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8CE7BD95-EFFA-4911-A1E0-BD4412697FEB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnableControlPolicyResponseBody build() {
            return new EnableControlPolicyResponseBody(this);
        } 

    } 

}
