// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScanClusterVulsRequest} extends {@link RequestModel}
 *
 * <p>ScanClusterVulsRequest</p>
 */
public class ScanClusterVulsRequest extends Request {
    @Path
    @NameInMap("cluster_id")
    private String clusterId;

    private ScanClusterVulsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScanClusterVulsRequest create() {
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

    public static final class Builder extends Request.Builder<ScanClusterVulsRequest, Builder> {
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(ScanClusterVulsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public ScanClusterVulsRequest build() {
            return new ScanClusterVulsRequest(this);
        } 

    } 

}
