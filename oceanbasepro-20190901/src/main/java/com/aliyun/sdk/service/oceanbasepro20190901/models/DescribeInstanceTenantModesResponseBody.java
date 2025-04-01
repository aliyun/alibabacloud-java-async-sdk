// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeInstanceTenantModesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceTenantModesResponseBody</p>
 */
public class DescribeInstanceTenantModesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceModes")
    private java.util.List<String> instanceModes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceModes
     */
    public java.util.List<String> getInstanceModes() {
        return this.instanceModes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> instanceModes; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInstanceTenantModesResponseBody model) {
            this.instanceModes = model.instanceModes;
            this.requestId = model.requestId;
        } 

        /**
         * InstanceModes.
         */
        public Builder instanceModes(java.util.List<String> instanceModes) {
            this.instanceModes = instanceModes;
            return this;
        }

        /**
         * RequestId.
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
