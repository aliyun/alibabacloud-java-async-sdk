// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetEdgeContainerResponseBody} extends {@link TeaModel}
 *
 * <p>GetEdgeContainerResponseBody</p>
 */
public class GetEdgeContainerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BillingMode")
    private String billingMode;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private GetEdgeContainerResponseBody(Builder builder) {
        this.billingMode = builder.billingMode;
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEdgeContainerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billingMode
     */
    public String getBillingMode() {
        return this.billingMode;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String billingMode; 
        private String instanceId; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(GetEdgeContainerResponseBody model) {
            this.billingMode = model.billingMode;
            this.instanceId = model.instanceId;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * BillingMode.
         */
        public Builder billingMode(String billingMode) {
            this.billingMode = billingMode;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetEdgeContainerResponseBody build() {
            return new GetEdgeContainerResponseBody(this);
        } 

    } 

}
