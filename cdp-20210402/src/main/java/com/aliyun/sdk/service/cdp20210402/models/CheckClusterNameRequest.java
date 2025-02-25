// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckClusterNameRequest} extends {@link RequestModel}
 *
 * <p>CheckClusterNameRequest</p>
 */
public class CheckClusterNameRequest extends Request {
    @Query
    @NameInMap("ClusterName")
    @Validation(required = true)
    private String clusterName;

    private CheckClusterNameRequest(Builder builder) {
        super(builder);
        this.clusterName = builder.clusterName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckClusterNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    public static final class Builder extends Request.Builder<CheckClusterNameRequest, Builder> {
        private String clusterName; 

        private Builder() {
            super();
        } 

        private Builder(CheckClusterNameRequest request) {
            super(request);
            this.clusterName = request.clusterName;
        } 

        /**
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        @Override
        public CheckClusterNameRequest build() {
            return new CheckClusterNameRequest(this);
        } 

    } 

}
