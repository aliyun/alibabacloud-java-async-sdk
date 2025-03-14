// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
 * {@link DescribeSecurityAgentStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityAgentStatusResponseBody</p>
 */
public class DescribeSecurityAgentStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClientStatus")
    private String clientStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSecurityAgentStatusResponseBody(Builder builder) {
        this.clientStatus = builder.clientStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityAgentStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientStatus
     */
    public String getClientStatus() {
        return this.clientStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clientStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeSecurityAgentStatusResponseBody model) {
            this.clientStatus = model.clientStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status of the Security Center agent. Valid values:</p>
         * <ul>
         * <li>pause: The Security Center agent suspends protection for your server.</li>
         * <li>online: The Security Center agent is protecting your server.</li>
         * <li>offline: The Security Center agent does not protect your server.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        public Builder clientStatus(String clientStatus) {
            this.clientStatus = clientStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSecurityAgentStatusResponseBody build() {
            return new DescribeSecurityAgentStatusResponseBody(this);
        } 

    } 

}
