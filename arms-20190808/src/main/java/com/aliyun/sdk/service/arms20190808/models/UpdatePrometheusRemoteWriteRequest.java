// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePrometheusRemoteWriteRequest} extends {@link RequestModel}
 *
 * <p>UpdatePrometheusRemoteWriteRequest</p>
 */
public class UpdatePrometheusRemoteWriteRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RemoteWriteName")
    @Validation(required = true)
    private String remoteWriteName;

    @Body
    @NameInMap("RemoteWriteYaml")
    @Validation(required = true)
    private String remoteWriteYaml;

    private UpdatePrometheusRemoteWriteRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.regionId = builder.regionId;
        this.remoteWriteName = builder.remoteWriteName;
        this.remoteWriteYaml = builder.remoteWriteYaml;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePrometheusRemoteWriteRequest create() {
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
     * @return remoteWriteName
     */
    public String getRemoteWriteName() {
        return this.remoteWriteName;
    }

    /**
     * @return remoteWriteYaml
     */
    public String getRemoteWriteYaml() {
        return this.remoteWriteYaml;
    }

    public static final class Builder extends Request.Builder<UpdatePrometheusRemoteWriteRequest, Builder> {
        private String clusterId; 
        private String regionId; 
        private String remoteWriteName; 
        private String remoteWriteYaml; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePrometheusRemoteWriteRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.regionId = request.regionId;
            this.remoteWriteName = request.remoteWriteName;
            this.remoteWriteYaml = request.remoteWriteYaml;
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
         * The name of the remote write configuration.
         */
        public Builder remoteWriteName(String remoteWriteName) {
            this.putQueryParameter("RemoteWriteName", remoteWriteName);
            this.remoteWriteName = remoteWriteName;
            return this;
        }

        /**
         * The remote write configuration. Specify the value in the YAML format.
         */
        public Builder remoteWriteYaml(String remoteWriteYaml) {
            this.putBodyParameter("RemoteWriteYaml", remoteWriteYaml);
            this.remoteWriteYaml = remoteWriteYaml;
            return this;
        }

        @Override
        public UpdatePrometheusRemoteWriteRequest build() {
            return new UpdatePrometheusRemoteWriteRequest(this);
        } 

    } 

}
