// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListClusterCnnfStatusDetailRequest} extends {@link RequestModel}
 *
 * <p>ListClusterCnnfStatusDetailRequest</p>
 */
public class ListClusterCnnfStatusDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterIds")
    private java.util.List<String> clusterIds;

    private ListClusterCnnfStatusDetailRequest(Builder builder) {
        super(builder);
        this.clusterIds = builder.clusterIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterCnnfStatusDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterIds
     */
    public java.util.List<String> getClusterIds() {
        return this.clusterIds;
    }

    public static final class Builder extends Request.Builder<ListClusterCnnfStatusDetailRequest, Builder> {
        private java.util.List<String> clusterIds; 

        private Builder() {
            super();
        } 

        private Builder(ListClusterCnnfStatusDetailRequest request) {
            super(request);
            this.clusterIds = request.clusterIds;
        } 

        /**
         * <p>An array that consists of the ID of the cluster.</p>
         */
        public Builder clusterIds(java.util.List<String> clusterIds) {
            this.putQueryParameter("ClusterIds", clusterIds);
            this.clusterIds = clusterIds;
            return this;
        }

        @Override
        public ListClusterCnnfStatusDetailRequest build() {
            return new ListClusterCnnfStatusDetailRequest(this);
        } 

    } 

}
