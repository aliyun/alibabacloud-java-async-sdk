// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeClusterNodepoolRequest} extends {@link RequestModel}
 *
 * <p>UpgradeClusterNodepoolRequest</p>
 */
public class UpgradeClusterNodepoolRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("NodepoolId")
    @Validation(required = true)
    private String nodepoolId;

    @Body
    @NameInMap("image_id")
    private String imageId;

    @Body
    @NameInMap("kubernetes_version")
    private String kubernetesVersion;

    @Body
    @NameInMap("runtime_version")
    private String runtimeVersion;

    private UpgradeClusterNodepoolRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodepoolId = builder.nodepoolId;
        this.imageId = builder.imageId;
        this.kubernetesVersion = builder.kubernetesVersion;
        this.runtimeVersion = builder.runtimeVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeClusterNodepoolRequest create() {
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
     * @return nodepoolId
     */
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return kubernetesVersion
     */
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * @return runtimeVersion
     */
    public String getRuntimeVersion() {
        return this.runtimeVersion;
    }

    public static final class Builder extends Request.Builder<UpgradeClusterNodepoolRequest, Builder> {
        private String clusterId; 
        private String nodepoolId; 
        private String imageId; 
        private String kubernetesVersion; 
        private String runtimeVersion; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeClusterNodepoolRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodepoolId = request.nodepoolId;
            this.imageId = request.imageId;
            this.kubernetesVersion = request.kubernetesVersion;
            this.runtimeVersion = request.runtimeVersion;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * NodepoolId.
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putPathParameter("NodepoolId", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * 节点系统镜像ID。
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("image_id", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * 节点Kubernetes版本。
         */
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.putBodyParameter("kubernetes_version", kubernetesVersion);
            this.kubernetesVersion = kubernetesVersion;
            return this;
        }

        /**
         * 节点运行时版本。
         */
        public Builder runtimeVersion(String runtimeVersion) {
            this.putBodyParameter("runtime_version", runtimeVersion);
            this.runtimeVersion = runtimeVersion;
            return this;
        }

        @Override
        public UpgradeClusterNodepoolRequest build() {
            return new UpgradeClusterNodepoolRequest(this);
        } 

    } 

}
