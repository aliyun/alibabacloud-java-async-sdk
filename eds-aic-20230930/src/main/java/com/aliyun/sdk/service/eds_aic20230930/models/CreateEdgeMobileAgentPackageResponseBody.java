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
 * {@link CreateEdgeMobileAgentPackageResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEdgeMobileAgentPackageResponseBody</p>
 */
public class CreateEdgeMobileAgentPackageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("PackageIds")
    private java.util.List<String> packageIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateEdgeMobileAgentPackageResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.packageIds = builder.packageIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEdgeMobileAgentPackageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return packageIds
     */
    public java.util.List<String> getPackageIds() {
        return this.packageIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long orderId; 
        private java.util.List<String> packageIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateEdgeMobileAgentPackageResponseBody model) {
            this.orderId = model.orderId;
            this.packageIds = model.packageIds;
            this.requestId = model.requestId;
        } 

        /**
         * OrderId.
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * PackageIds.
         */
        public Builder packageIds(java.util.List<String> packageIds) {
            this.packageIds = packageIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateEdgeMobileAgentPackageResponseBody build() {
            return new CreateEdgeMobileAgentPackageResponseBody(this);
        } 

    } 

}
