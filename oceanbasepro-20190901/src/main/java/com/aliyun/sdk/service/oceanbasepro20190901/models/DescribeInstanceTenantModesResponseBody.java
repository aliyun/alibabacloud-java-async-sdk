// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceTenantModesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceTenantModesResponseBody</p>
 */
public class DescribeInstanceTenantModesResponseBody extends TeaModel {
    @NameInMap("InstanceModes")
    private java.util.List < String > instanceModes;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceTenantModesResponseBody(Builder builder) {
        this.instanceModes = builder.instanceModes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceTenantModesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceModes
     */
    public java.util.List < String > getInstanceModes() {
        return this.instanceModes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > instanceModes; 
        private String requestId; 

        /**
         * 租户模式列表。
         */
        public Builder instanceModes(java.util.List < String > instanceModes) {
            this.instanceModes = instanceModes;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceTenantModesResponseBody build() {
            return new DescribeInstanceTenantModesResponseBody(this);
        } 

    } 

}
