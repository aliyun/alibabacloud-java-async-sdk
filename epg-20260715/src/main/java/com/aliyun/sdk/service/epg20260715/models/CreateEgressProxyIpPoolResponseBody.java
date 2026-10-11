// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.epg20260715.models;

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
 * {@link CreateEgressProxyIpPoolResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEgressProxyIpPoolResponseBody</p>
 */
public class CreateEgressProxyIpPoolResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EgressProxyIpPoolId")
    private String egressProxyIpPoolId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateEgressProxyIpPoolResponseBody(Builder builder) {
        this.egressProxyIpPoolId = builder.egressProxyIpPoolId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEgressProxyIpPoolResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return egressProxyIpPoolId
     */
    public String getEgressProxyIpPoolId() {
        return this.egressProxyIpPoolId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String egressProxyIpPoolId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateEgressProxyIpPoolResponseBody model) {
            this.egressProxyIpPoolId = model.egressProxyIpPoolId;
            this.requestId = model.requestId;
        } 

        /**
         * EgressProxyIpPoolId.
         */
        public Builder egressProxyIpPoolId(String egressProxyIpPoolId) {
            this.egressProxyIpPoolId = egressProxyIpPoolId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateEgressProxyIpPoolResponseBody build() {
            return new CreateEgressProxyIpPoolResponseBody(this);
        } 

    } 

}
