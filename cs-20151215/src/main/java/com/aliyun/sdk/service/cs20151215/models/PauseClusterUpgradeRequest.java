// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PauseClusterUpgradeRequest} extends {@link RequestModel}
 *
 * <p>PauseClusterUpgradeRequest</p>
 */
public class PauseClusterUpgradeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    private PauseClusterUpgradeRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PauseClusterUpgradeRequest create() {
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

    public static final class Builder extends Request.Builder<PauseClusterUpgradeRequest, Builder> {
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(PauseClusterUpgradeRequest request) {
            super(request);
            this.clusterId = request.clusterId;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public PauseClusterUpgradeRequest build() {
            return new PauseClusterUpgradeRequest(this);
        } 

    } 

}
