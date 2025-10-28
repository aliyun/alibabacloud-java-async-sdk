// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ImportK8sClusterRequest} extends {@link RequestModel}
 *
 * <p>ImportK8sClusterRequest</p>
 */
public class ImportK8sClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAsm")
    private Boolean enableAsm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private Integer mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
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
         * <p>The ID of the ACK cluster or serverless Kubernetes cluster. You can obtain the cluster ID by calling the GetK8sCluster operation. For more information, see <a href="https://help.aliyun.com/document_detail/181437.html">GetK8sCluster</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9c28bbb9-****-44b3-b953-54ef8a2d0be2</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the integration with Alibaba Cloud Service Mesh (ASM). Valid values:</p>
         * <ul>
         * <li>true: Enables the integration with ASM.</li>
         * <li>false: Disables the integration with ASM.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAsm(Boolean enableAsm) {
            this.putQueryParameter("EnableAsm", enableAsm);
            this.enableAsm = enableAsm;
            return this;
        }

        /**
         * <p>You can ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder mode(Integer mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The ID of the namespace. It is in the format of <code>Region ID:Identifier of the microservices namespace</code>. Example: <code>cn-hangzhou:doc</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:doc</p>
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
