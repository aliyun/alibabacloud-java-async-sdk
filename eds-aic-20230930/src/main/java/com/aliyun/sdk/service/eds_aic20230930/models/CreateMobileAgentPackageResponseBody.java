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
 * {@link CreateMobileAgentPackageResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMobileAgentPackageResponseBody</p>
 */
public class CreateMobileAgentPackageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MobileAgentPackageIds")
    private java.util.List<String> mobileAgentPackageIds;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateMobileAgentPackageResponseBody(Builder builder) {
        this.mobileAgentPackageIds = builder.mobileAgentPackageIds;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMobileAgentPackageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mobileAgentPackageIds
     */
    public java.util.List<String> getMobileAgentPackageIds() {
        return this.mobileAgentPackageIds;
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
        private java.util.List<String> mobileAgentPackageIds; 
        private String orderId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateMobileAgentPackageResponseBody model) {
            this.mobileAgentPackageIds = model.mobileAgentPackageIds;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
        } 

        /**
         * MobileAgentPackageIds.
         */
        public Builder mobileAgentPackageIds(java.util.List<String> mobileAgentPackageIds) {
            this.mobileAgentPackageIds = mobileAgentPackageIds;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMobileAgentPackageResponseBody build() {
            return new CreateMobileAgentPackageResponseBody(this);
        } 

    } 

}
