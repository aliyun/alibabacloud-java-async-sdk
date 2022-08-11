// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeUpgradeClusterRequest} extends {@link RequestModel}
 *
 * <p>ResumeUpgradeClusterRequest</p>
 */
public class ResumeUpgradeClusterRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    private ResumeUpgradeClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResumeUpgradeClusterRequest create() {
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

    public static final class Builder extends Request.Builder<ResumeUpgradeClusterRequest, Builder> {
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(ResumeUpgradeClusterRequest request) {
            super(request);
            this.clusterId = request.clusterId;
        } 

        /**
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public ResumeUpgradeClusterRequest build() {
            return new ResumeUpgradeClusterRequest(this);
        } 

    } 

}
