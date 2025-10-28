// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ListK8sNamespacesRequest} extends {@link RequestModel}
 *
 * <p>ListK8sNamespacesRequest</p>
 */
public class ListK8sNamespacesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    private ListK8sNamespacesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListK8sNamespacesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    public static final class Builder extends Request.Builder<ListK8sNamespacesRequest, Builder> {
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(ListK8sNamespacesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
        } 

        /**
         * <p>The ID of the cluster in Enterprise Distributed Application Service (EDAS).</p>
         * 
         * <strong>example:</strong>
         * <p>5b2b4ab4-efbc-4a81-9c45-xxxxxxxxxxxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public ListK8sNamespacesRequest build() {
            return new ListK8sNamespacesRequest(this);
        } 

    } 

}
