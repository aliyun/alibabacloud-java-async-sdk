// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeAckClusterNamespacesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAckClusterNamespacesResponseBody</p>
 */
public class DescribeAckClusterNamespacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AckNamespaces")
    private java.util.List<String> ackNamespaces;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAckClusterNamespacesResponseBody(Builder builder) {
        this.ackNamespaces = builder.ackNamespaces;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAckClusterNamespacesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ackNamespaces
     */
    public java.util.List<String> getAckNamespaces() {
        return this.ackNamespaces;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> ackNamespaces; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAckClusterNamespacesResponseBody model) {
            this.ackNamespaces = model.ackNamespaces;
            this.requestId = model.requestId;
        } 

        /**
         * AckNamespaces.
         */
        public Builder ackNamespaces(java.util.List<String> ackNamespaces) {
            this.ackNamespaces = ackNamespaces;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAckClusterNamespacesResponseBody build() {
            return new DescribeAckClusterNamespacesResponseBody(this);
        } 

    } 

}
