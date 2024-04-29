// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long expireDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendor")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vendor;

    private GenerateK8sAccessInfoRequest(Builder builder) {
        super(builder);
        this.aliyunYundunGatewayApiName = builder.aliyunYundunGatewayApiName;
        this.aliyunYundunGatewayPopName = builder.aliyunYundunGatewayPopName;
        this.aliyunYundunGatewayProjectName = builder.aliyunYundunGatewayProjectName;
        this.auditLogStore = builder.auditLogStore;
        this.auditProject = builder.auditProject;
        this.auditRegionId = builder.auditRegionId;
        this.clusterName = builder.clusterName;
        this.expireDate = builder.expireDate;
        this.groupId = builder.groupId;
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
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
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
        private String clusterName; 
        private Long expireDate; 
        private Long groupId; 
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
            this.clusterName = request.clusterName;
            this.expireDate = request.expireDate;
            this.groupId = request.groupId;
            this.vendor = request.vendor;
        } 

        /**
         * This parameter is deprecated.
         */
        public Builder aliyunYundunGatewayApiName(String aliyunYundunGatewayApiName) {
            this.putQueryParameter("AliyunYundunGatewayApiName", aliyunYundunGatewayApiName);
            this.aliyunYundunGatewayApiName = aliyunYundunGatewayApiName;
            return this;
        }

        /**
         * This parameter is deprecated.
         */
        public Builder aliyunYundunGatewayPopName(String aliyunYundunGatewayPopName) {
            this.putQueryParameter("AliyunYundunGatewayPopName", aliyunYundunGatewayPopName);
            this.aliyunYundunGatewayPopName = aliyunYundunGatewayPopName;
            return this;
        }

        /**
         * This parameter is deprecated.
         */
        public Builder aliyunYundunGatewayProjectName(String aliyunYundunGatewayProjectName) {
            this.putQueryParameter("AliyunYundunGatewayProjectName", aliyunYundunGatewayProjectName);
            this.aliyunYundunGatewayProjectName = aliyunYundunGatewayProjectName;
            return this;
        }

        /**
         * The Simple Log Service Logstore that is used to store the audit logs.
         */
        public Builder auditLogStore(String auditLogStore) {
            this.putQueryParameter("AuditLogStore", auditLogStore);
            this.auditLogStore = auditLogStore;
            return this;
        }

        /**
         * The Simple Log Service project that is used to store the audit logs.
         */
        public Builder auditProject(String auditProject) {
            this.putQueryParameter("AuditProject", auditProject);
            this.auditProject = auditProject;
            return this;
        }

        /**
         * The ID of the region in which the audit logs are stored.
         */
        public Builder auditRegionId(String auditRegionId) {
            this.putQueryParameter("AuditRegionId", auditRegionId);
            this.auditRegionId = auditRegionId;
            return this;
        }

        /**
         * The name of the Kubernetes cluster.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * The time at which the container ends to be added.
         */
        public Builder expireDate(Long expireDate) {
            this.putQueryParameter("ExpireDate", expireDate);
            this.expireDate = expireDate;
            return this;
        }

        /**
         * The group ID.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The service provider of the cloud asset. Valid values:
         * <p>
         * 
         * *   **Tencent**
         * *   **HUAWEICLOUD**
         * *   **Azure**
         * *   **AWS**
         * *   **Others**
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
