// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CancelClusterUpgradeRequest} extends {@link RequestModel}
 *
 * <p>CancelClusterUpgradeRequest</p>
 */
public class CancelClusterUpgradeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    private CancelClusterUpgradeRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelClusterUpgradeRequest create() {
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

    public static final class Builder extends Request.Builder<CancelClusterUpgradeRequest, Builder> {
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(CancelClusterUpgradeRequest request) {
            super(request);
            this.clusterId = request.clusterId;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c106f377e16f34eb1808d6b9362c9****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public CancelClusterUpgradeRequest build() {
            return new CancelClusterUpgradeRequest(this);
        } 

    } 

}
