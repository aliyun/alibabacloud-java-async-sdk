// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link AssignWuyingServerPrivateAddressesResponseBody} extends {@link TeaModel}
 *
 * <p>AssignWuyingServerPrivateAddressesResponseBody</p>
 */
public class AssignWuyingServerPrivateAddressesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssignedPrivateIpAddresses")
    private java.util.List<String> assignedPrivateIpAddresses;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AssignWuyingServerPrivateAddressesResponseBody(Builder builder) {
        this.assignedPrivateIpAddresses = builder.assignedPrivateIpAddresses;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssignWuyingServerPrivateAddressesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assignedPrivateIpAddresses
     */
    public java.util.List<String> getAssignedPrivateIpAddresses() {
        return this.assignedPrivateIpAddresses;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> assignedPrivateIpAddresses; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AssignWuyingServerPrivateAddressesResponseBody model) {
            this.assignedPrivateIpAddresses = model.assignedPrivateIpAddresses;
            this.requestId = model.requestId;
        } 

        /**
         * AssignedPrivateIpAddresses.
         */
        public Builder assignedPrivateIpAddresses(java.util.List<String> assignedPrivateIpAddresses) {
            this.assignedPrivateIpAddresses = assignedPrivateIpAddresses;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AssignWuyingServerPrivateAddressesResponseBody build() {
            return new AssignWuyingServerPrivateAddressesResponseBody(this);
        } 

    } 

}
