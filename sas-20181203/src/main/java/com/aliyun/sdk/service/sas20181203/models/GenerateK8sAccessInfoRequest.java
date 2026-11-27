// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GenerateK8sAccessInfoRequest} extends {@link RequestModel}
 *
 * <p>GenerateK8sAccessInfoRequest</p>
 */
public class GenerateK8sAccessInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunYundunGatewayApiName")
    private String aliyunYundunGatewayApiName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunYundunGatewayPopName")
    private String aliyunYundunGatewayPopName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunYundunGatewayProjectName")
    private String aliyunYundunGatewayProjectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditLogStore")
    private String auditLogStore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditProject")
    private String auditProject;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditRegionId")
    private String auditRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuArch")
    private String cpuArch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentProfileCodes")
    private java.util.List<String> deploymentProfileCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long expireDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstallPolicyVersion")
    private String installPolicyVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendor")
    private String vendor;

    private GenerateK8sAccessInfoRequest(Builder builder) {
        super(builder);
        this.aliyunYundunGatewayApiName = builder.aliyunYundunGatewayApiName;
        this.aliyunYundunGatewayPopName = builder.aliyunYundunGatewayPopName;
        this.aliyunYundunGatewayProjectName = builder.aliyunYundunGatewayProjectName;
        this.auditLogStore = builder.auditLogStore;
        this.auditProject = builder.auditProject;
        this.auditRegionId = builder.auditRegionId;
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.cpuArch = builder.cpuArch;
        this.deploymentProfileCodes = builder.deploymentProfileCodes;
        this.expireDate = builder.expireDate;
        this.groupId = builder.groupId;
        this.installPolicyVersion = builder.installPolicyVersion;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateK8sAccessInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunYundunGatewayApiName
     */
    public String getAliyunYundunGatewayApiName() {
        return this.aliyunYundunGatewayApiName;
    }

    /**
     * @return aliyunYundunGatewayPopName
     */
    public String getAliyunYundunGatewayPopName() {
        return this.aliyunYundunGatewayPopName;
    }

    /**
     * @return aliyunYundunGatewayProjectName
     */
    public String getAliyunYundunGatewayProjectName() {
        return this.aliyunYundunGatewayProjectName;
    }

    /**
     * @return auditLogStore
     */
    public String getAuditLogStore() {
        return this.auditLogStore;
    }

    /**
     * @return auditProject
     */
    public String getAuditProject() {
        return this.auditProject;
    }

    /**
     * @return auditRegionId
     */
    public String getAuditRegionId() {
        return this.auditRegionId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return cpuArch
     */
    public String getCpuArch() {
        return this.cpuArch;
    }

    /**
     * @return deploymentProfileCodes
     */
    public java.util.List<String> getDeploymentProfileCodes() {
        return this.deploymentProfileCodes;
    }

    /**
     * @return expireDate
     */
    public Long getExpireDate() {
        return this.expireDate;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return installPolicyVersion
     */
    public String getInstallPolicyVersion() {
        return this.installPolicyVersion;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<GenerateK8sAccessInfoRequest, Builder> {
        private String aliyunYundunGatewayApiName; 
        private String aliyunYundunGatewayPopName; 
        private String aliyunYundunGatewayProjectName; 
        private String auditLogStore; 
        private String auditProject; 
        private String auditRegionId; 
        private String clusterId; 
        private String clusterName; 
        private String cpuArch; 
        private java.util.List<String> deploymentProfileCodes; 
        private Long expireDate; 
        private Long groupId; 
        private String installPolicyVersion; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(GenerateK8sAccessInfoRequest request) {
            super(request);
            this.aliyunYundunGatewayApiName = request.aliyunYundunGatewayApiName;
            this.aliyunYundunGatewayPopName = request.aliyunYundunGatewayPopName;
            this.aliyunYundunGatewayProjectName = request.aliyunYundunGatewayProjectName;
            this.auditLogStore = request.auditLogStore;
            this.auditProject = request.auditProject;
            this.auditRegionId = request.auditRegionId;
            this.clusterId = request.clusterId;
            this.clusterName = request.clusterName;
            this.cpuArch = request.cpuArch;
            this.deploymentProfileCodes = request.deploymentProfileCodes;
            this.expireDate = request.expireDate;
            this.groupId = request.groupId;
            this.installPolicyVersion = request.installPolicyVersion;
            this.vendor = request.vendor;
        } 

        /**
         * <p><strong>[Deprecated]</strong> This parameter is deprecated and can be ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder aliyunYundunGatewayApiName(String aliyunYundunGatewayApiName) {
            this.putQueryParameter("AliyunYundunGatewayApiName", aliyunYundunGatewayApiName);
            this.aliyunYundunGatewayApiName = aliyunYundunGatewayApiName;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> This parameter is deprecated and can be ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder aliyunYundunGatewayPopName(String aliyunYundunGatewayPopName) {
            this.putQueryParameter("AliyunYundunGatewayPopName", aliyunYundunGatewayPopName);
            this.aliyunYundunGatewayPopName = aliyunYundunGatewayPopName;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> This parameter is deprecated and can be ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder aliyunYundunGatewayProjectName(String aliyunYundunGatewayProjectName) {
            this.putQueryParameter("AliyunYundunGatewayProjectName", aliyunYundunGatewayProjectName);
            this.aliyunYundunGatewayProjectName = aliyunYundunGatewayProjectName;
            return this;
        }

        /**
         * <p>The SLS Logstore for the audit log.</p>
         * 
         * <strong>example:</strong>
         * <p>audit-cf6baf6afa106eca665296fdf68b65bf</p>
         */
        public Builder auditLogStore(String auditLogStore) {
            this.putQueryParameter("AuditLogStore", auditLogStore);
            this.auditLogStore = auditLogStore;
            return this;
        }

        /**
         * <p>The Simple Log Service (SLS) project for the audit log.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-log-custom-huxintest1018-2</p>
         */
        public Builder auditProject(String auditProject) {
            this.putQueryParameter("AuditProject", auditProject);
            this.auditProject = auditProject;
            return this;
        }

        /**
         * <p>The region of the audit log.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder auditRegionId(String auditRegionId) {
            this.putQueryParameter("AuditRegionId", auditRegionId);
            this.auditRegionId = auditRegionId;
            return this;
        }

        /**
         * <p>The multi-cloud cluster ID generated synchronously by the server. This parameter is optional. If provided, the cluster must belong to the current trusted tenant and remain valid.</p>
         * 
         * <strong>example:</strong>
         * <p>cf3824769c85441b4bf3****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The name of the Kubernetes cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>The CPU architecture, which can be the ARM architecture or the x86 architecture.</p>
         * 
         * <strong>example:</strong>
         * <p>arm</p>
         */
        public Builder cpuArch(String cpuArch) {
            this.putQueryParameter("CpuArch", cpuArch);
            this.cpuArch = cpuArch;
            return this;
        }

        /**
         * <p>The expected deployment profiles. The server re-verifies the authorization, directory, and actual capabilities.</p>
         */
        public Builder deploymentProfileCodes(java.util.List<String> deploymentProfileCodes) {
            this.putQueryParameter("DeploymentProfileCodes", deploymentProfileCodes);
            this.deploymentProfileCodes = deploymentProfileCodes;
            return this;
        }

        /**
         * <p>The expiration time for container access. The value is a UNIX timestamp in milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1711951508388</p>
         */
        public Builder expireDate(Long expireDate) {
            this.putQueryParameter("ExpireDate", expireDate);
            this.expireDate = expireDate;
            return this;
        }

        /**
         * <p>The ID of the host group.</p>
         * 
         * <strong>example:</strong>
         * <p>11341690</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The new multi-cloud policy cloud-k8s-install-v2. If omitted, the historical behavior is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud-k8s-install-v2</p>
         */
        public Builder installPolicyVersion(String installPolicyVersion) {
            this.putQueryParameter("InstallPolicyVersion", installPolicyVersion);
            this.installPolicyVersion = installPolicyVersion;
            return this;
        }

        /**
         * <p>The cloud asset provider. Valid values:</p>
         * <ul>
         * <li><strong>Tencent</strong></li>
         * <li><strong>HUAWEICLOUD</strong></li>
         * <li><strong>Azure</strong></li>
         * <li><strong>AWS</strong> </li>
         * <li><strong>Other cloud assets</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Tencent</p>
         */
        public Builder vendor(String vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public GenerateK8sAccessInfoRequest build() {
            return new GenerateK8sAccessInfoRequest(this);
        } 

    } 

}
