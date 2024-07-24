// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPrometheusRemoteWriteRequest} extends {@link RequestModel}
 *
 * <p>AddPrometheusRemoteWriteRequest</p>
 */
public class AddPrometheusRemoteWriteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemoteWriteYaml")
    @com.aliyun.core.annotation.Validation(required = true)
    private String remoteWriteYaml;

    private AddPrometheusRemoteWriteRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.regionId = builder.regionId;
        this.remoteWriteYaml = builder.remoteWriteYaml;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPrometheusRemoteWriteRequest create() {
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
     * @return remoteWriteYaml
     */
    public String getRemoteWriteYaml() {
        return this.remoteWriteYaml;
    }

    public static final class Builder extends Request.Builder<AddPrometheusRemoteWriteRequest, Builder> {
        private String clusterId; 
        private String regionId; 
        private String remoteWriteYaml; 

        private Builder() {
            super();
        } 

        private Builder(AddPrometheusRemoteWriteRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.regionId = request.regionId;
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
         * The details of the remote write configuration item. Specify the value in the YAML format.
         */
        public Builder remoteWriteYaml(String remoteWriteYaml) {
            this.putBodyParameter("RemoteWriteYaml", remoteWriteYaml);
            this.remoteWriteYaml = remoteWriteYaml;
            return this;
        }

        @Override
        public AddPrometheusRemoteWriteRequest build() {
            return new AddPrometheusRemoteWriteRequest(this);
        } 

    } 

}
