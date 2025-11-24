// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeGuestClusterNamespacesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGuestClusterNamespacesResponseBody</p>
 */
public class DescribeGuestClusterNamespacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NsLabels")
    private java.util.Map<String, ?> nsLabels;

    @com.aliyun.core.annotation.NameInMap("NsList")
    private java.util.List<String> nsList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeGuestClusterNamespacesResponseBody(Builder builder) {
        this.nsLabels = builder.nsLabels;
        this.nsList = builder.nsList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGuestClusterNamespacesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nsLabels
     */
    public java.util.Map<String, ?> getNsLabels() {
        return this.nsLabels;
    }

    /**
     * @return nsList
     */
    public java.util.List<String> getNsList() {
        return this.nsList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map<String, ?> nsLabels; 
        private java.util.List<String> nsList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeGuestClusterNamespacesResponseBody model) {
            this.nsLabels = model.nsLabels;
            this.nsList = model.nsList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The labels of the namespaces. Labels are returned only when <code>ShowNsLabels</code> is set to <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;default&quot;:{&quot;istio-injection&quot;:&quot;enabled&quot;}}</p>
         */
        public Builder nsLabels(java.util.Map<String, ?> nsLabels) {
            this.nsLabels = nsLabels;
            return this;
        }

        /**
         * <p>The names of the namespaces.</p>
         */
        public Builder nsList(java.util.List<String> nsList) {
            this.nsList = nsList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31d3a0f0-07ed-4f6e-9004-1804498c****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGuestClusterNamespacesResponseBody build() {
            return new DescribeGuestClusterNamespacesResponseBody(this);
        } 

    } 

}
