// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeClusterVersionRequest} extends {@link RequestModel}
 *
 * <p>UpgradeClusterVersionRequest</p>
 */
public class UpgradeClusterVersionRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    private UpgradeClusterVersionRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeClusterVersionRequest create() {
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

    public static final class Builder extends Request.Builder<UpgradeClusterVersionRequest, Builder> {
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeClusterVersionRequest response) {
            super(response);
            this.clusterId = response.clusterId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public UpgradeClusterVersionRequest build() {
            return new UpgradeClusterVersionRequest(this);
        } 

    } 

}
