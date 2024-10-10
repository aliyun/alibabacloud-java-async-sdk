// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListCheckResultRequest} extends {@link RequestModel}
 *
 * <p>ListCheckResultRequest</p>
 */
public class ListCheckResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckIds")
    private java.util.List < Long > checkIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckKey")
    private String checkKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomParam")
    private Boolean customParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypes")
    private java.util.List < String > instanceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationTypes")
    private java.util.List < String > operationTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequirementIds")
    private java.util.List < Long > requirementIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevels")
    private java.util.List < String > riskLevels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortTypes")
    private java.util.List < String > sortTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandardIds")
    private java.util.List < Long > standardIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Statuses")
    private java.util.List < String > statuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Types")
    private java.util.List < String > types;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendors")
    private java.util.List < String > vendors;

    private ListCheckResultRequest(Builder builder) {
        super(builder);
        this.checkIds = builder.checkIds;
        this.checkKey = builder.checkKey;
        this.currentPage = builder.currentPage;
        this.customParam = builder.customParam;
        this.instanceIds = builder.instanceIds;
        this.instanceTypes = builder.instanceTypes;
        this.lang = builder.lang;
        this.operationTypes = builder.operationTypes;
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
     * @return checkIds
     */
    public java.util.List < Long > getCheckIds() {
        return this.checkIds;
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
     * @return operationTypes
     */
    public java.util.List < String > getOperationTypes() {
        return this.operationTypes;
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
        private java.util.List < Long > checkIds; 
        private String checkKey; 
        private Integer currentPage; 
        private Boolean customParam; 
        private java.util.List < String > instanceIds; 
        private java.util.List < String > instanceTypes; 
        private String lang; 
        private java.util.List < String > operationTypes; 
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
            this.checkIds = request.checkIds;
            this.checkKey = request.checkKey;
            this.currentPage = request.currentPage;
            this.customParam = request.customParam;
            this.instanceIds = request.instanceIds;
            this.instanceTypes = request.instanceTypes;
            this.lang = request.lang;
            this.operationTypes = request.operationTypes;
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
         * CheckIds.
         */
        public Builder checkIds(java.util.List < Long > checkIds) {
            this.putQueryParameter("CheckIds", checkIds);
            this.checkIds = checkIds;
            return this;
        }

        /**
         * <p>The key that you want to use to search for check items in fuzzy match mode.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder checkKey(String checkKey) {
            this.putQueryParameter("CheckKey", checkKey);
            this.checkKey = checkKey;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Specifies whether the check item supports custom parameters. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder customParam(Boolean customParam) {
            this.putQueryParameter("CustomParam", customParam);
            this.customParam = customParam;
            return this;
        }

        /**
         * <p>The instance IDs of the cloud services that you want to query. Separate multiple IDs with commas (,).</p>
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The asset type of the cloud services. Valid values:</p>
         * <ul>
         * <li><strong>ECS</strong>: Elastic Compute Service (ECS)</li>
         * <li><strong>SLB</strong>: Server Load Balancer (SLB)</li>
         * <li><strong>RDS</strong>: ApsaraDB RDS</li>
         * <li><strong>MONGODB</strong>: ApsaraDB for MongoDB (MongoDB)</li>
         * <li><strong>KVSTORE</strong>: ApsaraDB for Redis (Redis)</li>
         * <li><strong>ACR</strong>: Container Registry</li>
         * <li><strong>CSK</strong>: Container Service for Kubernetes (ACK)</li>
         * <li><strong>VPC</strong>: Virtual Private Cloud (VPC)</li>
         * <li><strong>ACTIONTRAIL</strong>: ActionTrail</li>
         * <li><strong>CDN</strong>: Alibaba Cloud CDN (CDN)</li>
         * <li><strong>CAS</strong>: Certificate Management Service (formerly SSL Certificates Service)</li>
         * <li><strong>RDC</strong>: Apsara Devops</li>
         * <li><strong>RAM</strong>: Resource Access Management (RAM)</li>
         * <li><strong>DDOS</strong>: Anti-DDoS</li>
         * <li><strong>WAF</strong>: Web Application Firewall (WAF)</li>
         * <li><strong>OSS</strong>: Object Storage Service (OSS)</li>
         * <li><strong>POLARDB</strong>: PolarDB</li>
         * <li><strong>POSTGRESQL</strong>: ApsaraDB RDS for PostgreSQL</li>
         * <li><strong>MSE</strong>: Microservices Engine (MSE)</li>
         * <li><strong>NAS</strong>: Apsara File Storage NAS (NAS)</li>
         * <li><strong>SDDP</strong>: Sensitive Data Discovery and Protection (SDDP)</li>
         * <li><strong>EIP</strong>: Elastic IP Address (EIP)</li>
         * </ul>
         */
        public Builder instanceTypes(java.util.List < String > instanceTypes) {
            this.putQueryParameter("InstanceTypes", instanceTypes);
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * OperationTypes.
         */
        public Builder operationTypes(java.util.List < String > operationTypes) {
            this.putQueryParameter("OperationTypes", operationTypes);
            this.operationTypes = operationTypes;
            return this;
        }

        /**
         * <p>The number of entries per page. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the instance. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong>: International</li>
         * <li><strong>ap-southeast-1</strong>: Singapore</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The IDs of requirement items.</p>
         */
        public Builder requirementIds(java.util.List < Long > requirementIds) {
            this.putQueryParameter("RequirementIds", requirementIds);
            this.requirementIds = requirementIds;
            return this;
        }

        /**
         * <p>The risk levels of check items. Separate multiple risk levels with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>HIGH</strong></li>
         * <li><strong>MEDIUM</strong></li>
         * <li><strong>LOW</strong></li>
         * </ul>
         */
        public Builder riskLevels(java.util.List < String > riskLevels) {
            this.putQueryParameter("RiskLevels", riskLevels);
            this.riskLevels = riskLevels;
            return this;
        }

        /**
         * <p>The types of the conditions based on which check items are sorted. Valid values:</p>
         * <ul>
         * <li><strong>RISK_LEVEL</strong>: risk level</li>
         * <li><strong>STATUS</strong>: status</li>
         * </ul>
         */
        public Builder sortTypes(java.util.List < String > sortTypes) {
            this.putQueryParameter("SortTypes", sortTypes);
            this.sortTypes = sortTypes;
            return this;
        }

        /**
         * <p>The IDs of standards.</p>
         */
        public Builder standardIds(java.util.List < Long > standardIds) {
            this.putQueryParameter("StandardIds", standardIds);
            this.standardIds = standardIds;
            return this;
        }

        /**
         * <p>The statuses of check items. Separate multiple statuses with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>PASS</strong></li>
         * <li><strong>NOT_PASS</strong></li>
         * <li><strong>CHECKING</strong></li>
         * <li><strong>NOT_CHECK</strong></li>
         * <li><strong>WHITELIST</strong></li>
         * </ul>
         */
        public Builder statuses(java.util.List < String > statuses) {
            this.putQueryParameter("Statuses", statuses);
            this.statuses = statuses;
            return this;
        }

        /**
         * <p>The types of check standards.</p>
         */
        public Builder types(java.util.List < String > types) {
            this.putQueryParameter("Types", types);
            this.types = types;
            return this;
        }

        /**
         * <p>The cloud service providers. Valid value:</p>
         * <ul>
         * <li><strong>ALIYUN</strong>: Alibaba Cloud</li>
         * </ul>
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
