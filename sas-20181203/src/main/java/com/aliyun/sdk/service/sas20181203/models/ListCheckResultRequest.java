// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCheckResultRequest} extends {@link RequestModel}
 *
 * <p>ListCheckResultRequest</p>
 */
public class ListCheckResultRequest extends Request {
    @Query
    @NameInMap("CheckKey")
    private String checkKey;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("CustomParam")
    private Boolean customParam;

    @Query
    @NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @Query
    @NameInMap("InstanceTypes")
    private java.util.List < String > instanceTypes;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100)
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RequirementIds")
    private java.util.List < Long > requirementIds;

    @Query
    @NameInMap("RiskLevels")
    private java.util.List < String > riskLevels;

    @Query
    @NameInMap("SortTypes")
    private java.util.List < String > sortTypes;

    @Query
    @NameInMap("StandardIds")
    private java.util.List < Long > standardIds;

    @Query
    @NameInMap("Statuses")
    private java.util.List < String > statuses;

    @Query
    @NameInMap("Types")
    private java.util.List < String > types;

    @Query
    @NameInMap("Vendors")
    private java.util.List < String > vendors;

    private ListCheckResultRequest(Builder builder) {
        super(builder);
        this.checkKey = builder.checkKey;
        this.currentPage = builder.currentPage;
        this.customParam = builder.customParam;
        this.instanceIds = builder.instanceIds;
        this.instanceTypes = builder.instanceTypes;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.requirementIds = builder.requirementIds;
        this.riskLevels = builder.riskLevels;
        this.sortTypes = builder.sortTypes;
        this.standardIds = builder.standardIds;
        this.statuses = builder.statuses;
        this.types = builder.types;
        this.vendors = builder.vendors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCheckResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkKey
     */
    public String getCheckKey() {
        return this.checkKey;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return customParam
     */
    public Boolean getCustomParam() {
        return this.customParam;
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return instanceTypes
     */
    public java.util.List < String > getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requirementIds
     */
    public java.util.List < Long > getRequirementIds() {
        return this.requirementIds;
    }

    /**
     * @return riskLevels
     */
    public java.util.List < String > getRiskLevels() {
        return this.riskLevels;
    }

    /**
     * @return sortTypes
     */
    public java.util.List < String > getSortTypes() {
        return this.sortTypes;
    }

    /**
     * @return standardIds
     */
    public java.util.List < Long > getStandardIds() {
        return this.standardIds;
    }

    /**
     * @return statuses
     */
    public java.util.List < String > getStatuses() {
        return this.statuses;
    }

    /**
     * @return types
     */
    public java.util.List < String > getTypes() {
        return this.types;
    }

    /**
     * @return vendors
     */
    public java.util.List < String > getVendors() {
        return this.vendors;
    }

    public static final class Builder extends Request.Builder<ListCheckResultRequest, Builder> {
        private String checkKey; 
        private Integer currentPage; 
        private Boolean customParam; 
        private java.util.List < String > instanceIds; 
        private java.util.List < String > instanceTypes; 
        private String lang; 
        private Integer pageSize; 
        private String regionId; 
        private java.util.List < Long > requirementIds; 
        private java.util.List < String > riskLevels; 
        private java.util.List < String > sortTypes; 
        private java.util.List < Long > standardIds; 
        private java.util.List < String > statuses; 
        private java.util.List < String > types; 
        private java.util.List < String > vendors; 

        private Builder() {
            super();
        } 

        private Builder(ListCheckResultRequest request) {
            super(request);
            this.checkKey = request.checkKey;
            this.currentPage = request.currentPage;
            this.customParam = request.customParam;
            this.instanceIds = request.instanceIds;
            this.instanceTypes = request.instanceTypes;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.requirementIds = request.requirementIds;
            this.riskLevels = request.riskLevels;
            this.sortTypes = request.sortTypes;
            this.standardIds = request.standardIds;
            this.statuses = request.statuses;
            this.types = request.types;
            this.vendors = request.vendors;
        } 

        /**
         * The key that you want to use to search for check items in fuzzy match mode.
         */
        public Builder checkKey(String checkKey) {
            this.putQueryParameter("CheckKey", checkKey);
            this.checkKey = checkKey;
            return this;
        }

        /**
         * The page number.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Specifies whether the check item supports custom parameters. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder customParam(Boolean customParam) {
            this.putQueryParameter("CustomParam", customParam);
            this.customParam = customParam;
            return this;
        }

        /**
         * The instance IDs of the cloud services that you want to query. Separate multiple IDs with commas (,).
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The asset type of the cloud services. Valid values:
         * <p>
         * 
         * *   **ECS**: Elastic Compute Service (ECS)
         * *   **SLB**: Server Load Balancer (SLB)
         * *   **RDS**: ApsaraDB RDS
         * *   **MONGODB**: ApsaraDB for MongoDB (MongoDB)
         * *   **KVSTORE**: ApsaraDB for Redis (Redis)
         * *   **ACR**: Container Registry
         * *   **CSK**: Container Service for Kubernetes (ACK)
         * *   **VPC**: Virtual Private Cloud (VPC)
         * *   **ACTIONTRAIL**: ActionTrail
         * *   **CDN**: Alibaba Cloud CDN (CDN)
         * *   **CAS**: Certificate Management Service (formerly SSL Certificates Service)
         * *   **RDC**: Apsara Devops
         * *   **RAM**: Resource Access Management (RAM)
         * *   **DDOS**: Anti-DDoS
         * *   **WAF**: Web Application Firewall (WAF)
         * *   **OSS**: Object Storage Service (OSS)
         * *   **POLARDB**: PolarDB
         * *   **POSTGRESQL**: ApsaraDB RDS for PostgreSQL
         * *   **MSE**: Microservices Engine (MSE)
         * *   **NAS**: Apsara File Storage NAS (NAS)
         * *   **SDDP**: Sensitive Data Discovery and Protection (SDDP)
         * *   **EIP**: Elastic IP Address (EIP)
         */
        public Builder instanceTypes(java.util.List < String > instanceTypes) {
            this.putQueryParameter("InstanceTypes", instanceTypes);
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of entries per page. Maximum value : 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the instance. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou**: International
         * *   **ap-southeast-1**: Singapore
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The IDs of requirement items.
         */
        public Builder requirementIds(java.util.List < Long > requirementIds) {
            this.putQueryParameter("RequirementIds", requirementIds);
            this.requirementIds = requirementIds;
            return this;
        }

        /**
         * The risk levels of check items. Separate multiple risk levels with commas (,). Valid values:
         * <p>
         * 
         * *   **HIGH**
         * *   **MEDIUM**
         * *   **LOW**
         */
        public Builder riskLevels(java.util.List < String > riskLevels) {
            this.putQueryParameter("RiskLevels", riskLevels);
            this.riskLevels = riskLevels;
            return this;
        }

        /**
         * The types of the conditions based on which check items are sorted. Valid values:
         * <p>
         * 
         * *   **RISK_LEVEL**: risk level
         * *   **STATUS**: status
         */
        public Builder sortTypes(java.util.List < String > sortTypes) {
            this.putQueryParameter("SortTypes", sortTypes);
            this.sortTypes = sortTypes;
            return this;
        }

        /**
         * The IDs of standards.
         */
        public Builder standardIds(java.util.List < Long > standardIds) {
            this.putQueryParameter("StandardIds", standardIds);
            this.standardIds = standardIds;
            return this;
        }

        /**
         * The statuses of check items. Separate multiple statuses with commas (,). Valid values:
         * <p>
         * 
         * *   **PASS**
         * *   **NOT_PASS**
         * *   **CHECKING**
         * *   **NOT_CHECK**
         * *   **WHITELIST**
         */
        public Builder statuses(java.util.List < String > statuses) {
            this.putQueryParameter("Statuses", statuses);
            this.statuses = statuses;
            return this;
        }

        /**
         * The types of check standards.
         */
        public Builder types(java.util.List < String > types) {
            this.putQueryParameter("Types", types);
            this.types = types;
            return this;
        }

        /**
         * The cloud service providers. Valid value:
         * <p>
         * 
         * *   **ALIYUN**: Alibaba Cloud
         */
        public Builder vendors(java.util.List < String > vendors) {
            this.putQueryParameter("Vendors", vendors);
            this.vendors = vendors;
            return this;
        }

        @Override
        public ListCheckResultRequest build() {
            return new ListCheckResultRequest(this);
        } 

    } 

}
