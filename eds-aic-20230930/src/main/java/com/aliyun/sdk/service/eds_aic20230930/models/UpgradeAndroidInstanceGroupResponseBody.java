// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link UpgradeAndroidInstanceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>UpgradeAndroidInstanceGroupResponseBody</p>
 */
public class UpgradeAndroidInstanceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private String instanceIds;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpgradeAndroidInstanceGroupResponseBody(Builder builder) {
        this.instanceIds = builder.instanceIds;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeAndroidInstanceGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String instanceIds; 
        private String orderId; 
        private String requestId; 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;acp-3vzqq4y3f31f3z3df&quot;]</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>Order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>223684716098****</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>310A783E-CC46-5452-A8A3-71AE5DB59****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpgradeAndroidInstanceGroupResponseBody build() {
            return new UpgradeAndroidInstanceGroupResponseBody(this);
        } 

    } 

}
