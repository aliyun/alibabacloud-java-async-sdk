// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link MigrateClusterRequest} extends {@link RequestModel}
 *
 * <p>MigrateClusterRequest</p>
 */
public class MigrateClusterRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("oss_bucket_endpoint")
    private String ossBucketEndpoint;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("oss_bucket_name")
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
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c21e0591548ba4c10bdb535d6572b****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The endpoint of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>*******.oss-cn-hangzhou.aliyuncs.com</p>
         */
        public Builder ossBucketEndpoint(String ossBucketEndpoint) {
            this.putBodyParameter("oss_bucket_endpoint", ossBucketEndpoint);
            this.ossBucketEndpoint = ossBucketEndpoint;
            return this;
        }

        /**
         * <p>The name of the Object Storage Service (OSS) bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>bucket-****</p>
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
