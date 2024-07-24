// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePrometheusRemoteWriteRequest} extends {@link RequestModel}
 *
 * <p>DeletePrometheusRemoteWriteRequest</p>
 */
public class DeletePrometheusRemoteWriteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoteWriteNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String remoteWriteNames;

    private DeletePrometheusRemoteWriteRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.regionId = builder.regionId;
        this.remoteWriteNames = builder.remoteWriteNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePrometheusRemoteWriteRequest create() {
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remoteWriteNames
     */
    public String getRemoteWriteNames() {
        return this.remoteWriteNames;
    }

    public static final class Builder extends Request.Builder<DeletePrometheusRemoteWriteRequest, Builder> {
        private String clusterId; 
        private String regionId; 
        private String remoteWriteNames; 

        private Builder() {
            super();
        } 

        private Builder(DeletePrometheusRemoteWriteRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.regionId = request.regionId;
            this.remoteWriteNames = request.remoteWriteNames;
        } 

        /**
         * The ID of the Prometheus instance.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The names of the remote write configuration items that you want to delete. Separate configuration items with commas (,).
         */
        public Builder remoteWriteNames(String remoteWriteNames) {
            this.putQueryParameter("RemoteWriteNames", remoteWriteNames);
            this.remoteWriteNames = remoteWriteNames;
            return this;
        }

        @Override
        public DeletePrometheusRemoteWriteRequest build() {
            return new DeletePrometheusRemoteWriteRequest(this);
        } 

    } 

}
