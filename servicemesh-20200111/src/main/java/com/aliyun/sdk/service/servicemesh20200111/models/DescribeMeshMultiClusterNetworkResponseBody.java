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
 * {@link DescribeMeshMultiClusterNetworkResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMeshMultiClusterNetworkResponseBody</p>
 */
public class DescribeMeshMultiClusterNetworkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MultiClusterNetworks")
    private java.util.Map<String, MultiClusterNetworksValue> multiClusterNetworks;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeMeshMultiClusterNetworkResponseBody(Builder builder) {
        this.multiClusterNetworks = builder.multiClusterNetworks;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeshMultiClusterNetworkResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return multiClusterNetworks
     */
    public java.util.Map<String, MultiClusterNetworksValue> getMultiClusterNetworks() {
        return this.multiClusterNetworks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map<String, MultiClusterNetworksValue> multiClusterNetworks; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeMeshMultiClusterNetworkResponseBody model) {
            this.multiClusterNetworks = model.multiClusterNetworks;
            this.requestId = model.requestId;
        } 

        /**
         * MultiClusterNetworks.
         */
        public Builder multiClusterNetworks(java.util.Map<String, MultiClusterNetworksValue> multiClusterNetworks) {
            this.multiClusterNetworks = multiClusterNetworks;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>71680038-8009-5073-B43E-C057E9******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMeshMultiClusterNetworkResponseBody build() {
            return new DescribeMeshMultiClusterNetworkResponseBody(this);
        } 

    } 

}
