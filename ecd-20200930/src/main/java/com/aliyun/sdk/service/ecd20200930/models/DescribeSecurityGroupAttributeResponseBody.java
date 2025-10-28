// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeSecurityGroupAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityGroupAttributeResponseBody</p>
 */
public class DescribeSecurityGroupAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EgressPermissions")
    private java.util.List<Permission> egressPermissions;

    @com.aliyun.core.annotation.NameInMap("IngressPermissions")
    private java.util.List<Permission> ingressPermissions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSecurityGroupAttributeResponseBody(Builder builder) {
        this.egressPermissions = builder.egressPermissions;
        this.ingressPermissions = builder.ingressPermissions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityGroupAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return egressPermissions
     */
    public java.util.List<Permission> getEgressPermissions() {
        return this.egressPermissions;
    }

    /**
     * @return ingressPermissions
     */
    public java.util.List<Permission> getIngressPermissions() {
        return this.ingressPermissions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Permission> egressPermissions; 
        private java.util.List<Permission> ingressPermissions; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeSecurityGroupAttributeResponseBody model) {
            this.egressPermissions = model.egressPermissions;
            this.ingressPermissions = model.ingressPermissions;
            this.requestId = model.requestId;
        } 

        /**
         * EgressPermissions.
         */
        public Builder egressPermissions(java.util.List<Permission> egressPermissions) {
            this.egressPermissions = egressPermissions;
            return this;
        }

        /**
         * IngressPermissions.
         */
        public Builder ingressPermissions(java.util.List<Permission> ingressPermissions) {
            this.ingressPermissions = ingressPermissions;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSecurityGroupAttributeResponseBody build() {
            return new DescribeSecurityGroupAttributeResponseBody(this);
        } 

    } 

}
