// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateK8sAccessInfoRequest} extends {@link RequestModel}
 *
 * <p>GenerateK8sAccessInfoRequest</p>
 */
public class GenerateK8sAccessInfoRequest extends Request {
    @Query
    @NameInMap("AliyunYundunGatewayApiName")
    private String aliyunYundunGatewayApiName;

    @Query
    @NameInMap("AliyunYundunGatewayPopName")
    private String aliyunYundunGatewayPopName;

    @Query
    @NameInMap("AliyunYundunGatewayProjectName")
    private String aliyunYundunGatewayProjectName;

    @Query
    @NameInMap("AuditLogStore")
    private String auditLogStore;

    @Query
    @NameInMap("AuditProject")
    private String auditProject;

    @Query
    @NameInMap("AuditRegionId")
    private String auditRegionId;

    @Query
    @NameInMap("ClusterName")
    @Validation(required = true)
    private String clusterName;

    @Query
    @NameInMap("ExpireDate")
    @Validation(required = true)
    private Long expireDate;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private Long groupId;

    @Query
    @NameInMap("Vendor")
    @Validation(required = true)
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
         * AliyunYundunGatewayApiName.
         */
        public Builder aliyunYundunGatewayApiName(String aliyunYundunGatewayApiName) {
            this.putQueryParameter("AliyunYundunGatewayApiName", aliyunYundunGatewayApiName);
            this.aliyunYundunGatewayApiName = aliyunYundunGatewayApiName;
            return this;
        }

        /**
         * AliyunYundunGatewayPopName.
         */
        public Builder aliyunYundunGatewayPopName(String aliyunYundunGatewayPopName) {
            this.putQueryParameter("AliyunYundunGatewayPopName", aliyunYundunGatewayPopName);
            this.aliyunYundunGatewayPopName = aliyunYundunGatewayPopName;
            return this;
        }

        /**
         * AliyunYundunGatewayProjectName.
         */
        public Builder aliyunYundunGatewayProjectName(String aliyunYundunGatewayProjectName) {
            this.putQueryParameter("AliyunYundunGatewayProjectName", aliyunYundunGatewayProjectName);
            this.aliyunYundunGatewayProjectName = aliyunYundunGatewayProjectName;
            return this;
        }

        /**
         * AuditLogStore.
         */
        public Builder auditLogStore(String auditLogStore) {
            this.putQueryParameter("AuditLogStore", auditLogStore);
            this.auditLogStore = auditLogStore;
            return this;
        }

        /**
         * AuditProject.
         */
        public Builder auditProject(String auditProject) {
            this.putQueryParameter("AuditProject", auditProject);
            this.auditProject = auditProject;
            return this;
        }

        /**
         * AuditRegionId.
         */
        public Builder auditRegionId(String auditRegionId) {
            this.putQueryParameter("AuditRegionId", auditRegionId);
            this.auditRegionId = auditRegionId;
            return this;
        }

        /**
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * ExpireDate.
         */
        public Builder expireDate(Long expireDate) {
            this.putQueryParameter("ExpireDate", expireDate);
            this.expireDate = expireDate;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * Vendor.
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
