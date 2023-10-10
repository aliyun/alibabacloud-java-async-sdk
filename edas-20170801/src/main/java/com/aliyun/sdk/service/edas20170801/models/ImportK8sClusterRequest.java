// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportK8sClusterRequest} extends {@link RequestModel}
 *
 * <p>ImportK8sClusterRequest</p>
 */
public class ImportK8sClusterRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("EnableAsm")
    private Boolean enableAsm;

    @Query
    @NameInMap("Mode")
    private Integer mode;

    @Query
    @NameInMap("NamespaceId")
    private String namespaceId;

    private ImportK8sClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.enableAsm = builder.enableAsm;
        this.mode = builder.mode;
        this.namespaceId = builder.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportK8sClusterRequest create() {
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
     * @return enableAsm
     */
    public Boolean getEnableAsm() {
        return this.enableAsm;
    }

    /**
     * @return mode
     */
    public Integer getMode() {
        return this.mode;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public static final class Builder extends Request.Builder<ImportK8sClusterRequest, Builder> {
        private String clusterId; 
        private Boolean enableAsm; 
        private Integer mode; 
        private String namespaceId; 

        private Builder() {
            super();
        } 

        private Builder(ImportK8sClusterRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.enableAsm = request.enableAsm;
            this.mode = request.mode;
            this.namespaceId = request.namespaceId;
        } 

        /**
         * The ID of the ACK cluster or serverless Kubernetes cluster. You can obtain the cluster ID by calling the GetK8sCluster operation. For more information, see [GetK8sCluster](~~181437~~).
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Specifies whether to enable the integration with Alibaba Cloud Service Mesh (ASM). Valid values:
         * <p>
         * 
         * *   true: Enables the integration with ASM.
         * *   false: Disables the integration with ASM.
         */
        public Builder enableAsm(Boolean enableAsm) {
            this.putQueryParameter("EnableAsm", enableAsm);
            this.enableAsm = enableAsm;
            return this;
        }

        /**
         * You can ignore this parameter.
         */
        public Builder mode(Integer mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * The ID of the namespace. It is in the format of `Region ID:Identifier of the microservices namespace`. Example: `cn-hangzhou:doc`.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        @Override
        public ImportK8sClusterRequest build() {
            return new ImportK8sClusterRequest(this);
        } 

    } 

}
