// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodeGroupConstraintsRequest} extends {@link RequestModel}
 *
 * <p>ListNodeGroupConstraintsRequest</p>
 */
public class ListNodeGroupConstraintsRequest extends Request {
    @Query
    @NameInMap("ClusterType")
    private String clusterType;

    private ListNodeGroupConstraintsRequest(Builder builder) {
        super(builder);
        this.clusterType = builder.clusterType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodeGroupConstraintsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    public static final class Builder extends Request.Builder<ListNodeGroupConstraintsRequest, Builder> {
        private String clusterType; 

        private Builder() {
            super();
        } 

        private Builder(ListNodeGroupConstraintsRequest request) {
            super(request);
            this.clusterType = request.clusterType;
        } 

        /**
         * ClusterType.
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        @Override
        public ListNodeGroupConstraintsRequest build() {
            return new ListNodeGroupConstraintsRequest(this);
        } 

    } 

}
