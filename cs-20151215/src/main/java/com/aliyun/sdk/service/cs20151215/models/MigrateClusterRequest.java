// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MigrateClusterRequest} extends {@link RequestModel}
 *
 * <p>MigrateClusterRequest</p>
 */
public class MigrateClusterRequest extends Request {
    @Path
    @NameInMap("cluster_id")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("oss_bucket_endpoint")
    private String ossBucketEndpoint;

    @Body
    @NameInMap("oss_bucket_name")
    private String ossBucketName;

    private MigrateClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.ossBucketEndpoint = builder.ossBucketEndpoint;
        this.ossBucketName = builder.ossBucketName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrateClusterRequest create() {
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
     * @return ossBucketEndpoint
     */
    public String getOssBucketEndpoint() {
        return this.ossBucketEndpoint;
    }

    /**
     * @return ossBucketName
     */
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public static final class Builder extends Request.Builder<MigrateClusterRequest, Builder> {
        private String clusterId; 
        private String ossBucketEndpoint; 
        private String ossBucketName; 

        private Builder() {
            super();
        } 

        private Builder(MigrateClusterRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.ossBucketEndpoint = request.ossBucketEndpoint;
            this.ossBucketName = request.ossBucketName;
        } 

        /**
         * cluster_id.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * oss_bucket_endpoint.
         */
        public Builder ossBucketEndpoint(String ossBucketEndpoint) {
            this.putBodyParameter("oss_bucket_endpoint", ossBucketEndpoint);
            this.ossBucketEndpoint = ossBucketEndpoint;
            return this;
        }

        /**
         * oss_bucket_name.
         */
        public Builder ossBucketName(String ossBucketName) {
            this.putBodyParameter("oss_bucket_name", ossBucketName);
            this.ossBucketName = ossBucketName;
            return this;
        }

        @Override
        public MigrateClusterRequest build() {
            return new MigrateClusterRequest(this);
        } 

    } 

}
