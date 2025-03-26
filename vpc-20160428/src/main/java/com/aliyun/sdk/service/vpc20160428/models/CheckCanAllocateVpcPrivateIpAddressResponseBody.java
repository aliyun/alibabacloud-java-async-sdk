// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link CheckCanAllocateVpcPrivateIpAddressResponseBody} extends {@link TeaModel}
 *
 * <p>CheckCanAllocateVpcPrivateIpAddressResponseBody</p>
 */
public class CheckCanAllocateVpcPrivateIpAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CanAllocate")
    private Boolean canAllocate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckCanAllocateVpcPrivateIpAddressResponseBody(Builder builder) {
        this.canAllocate = builder.canAllocate;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckCanAllocateVpcPrivateIpAddressResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return canAllocate
     */
    public Boolean getCanAllocate() {
        return this.canAllocate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean canAllocate; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CheckCanAllocateVpcPrivateIpAddressResponseBody model) {
            this.canAllocate = model.canAllocate;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether the private IP address is available. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder canAllocate(Boolean canAllocate) {
            this.canAllocate = canAllocate;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>93360B0-2969-40BF-8542-EBB34FD358AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckCanAllocateVpcPrivateIpAddressResponseBody build() {
            return new CheckCanAllocateVpcPrivateIpAddressResponseBody(this);
        } 

    } 

}
