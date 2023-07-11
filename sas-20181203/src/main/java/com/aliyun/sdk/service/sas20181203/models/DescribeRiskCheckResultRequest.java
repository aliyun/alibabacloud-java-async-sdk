// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskCheckResultRequest} extends {@link RequestModel}
 *
 * <p>DescribeRiskCheckResultRequest</p>
 */
public class DescribeRiskCheckResultRequest extends Request {
    @Query
    @NameInMap("AssetType")
    private String assetType;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("GroupId")
    private Long groupId;

    @Query
    @NameInMap("ItemIds")
    private java.util.List < String > itemIds;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("QueryFlag")
    private String queryFlag;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RiskLevel")
    private String riskLevel;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Status")
    private String status;

    private DescribeRiskCheckResultRequest(Builder builder) {
        super(builder);
        this.assetType = builder.assetType;
        this.currentPage = builder.currentPage;
        this.groupId = builder.groupId;
        this.itemIds = builder.itemIds;
        this.lang = builder.lang;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.queryFlag = builder.queryFlag;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.riskLevel = builder.riskLevel;
        this.sourceIp = builder.sourceIp;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskCheckResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetType
     */
    public String getAssetType() {
        return this.assetType;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return itemIds
     */
    public java.util.List < String > getItemIds() {
        return this.itemIds;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryFlag
     */
    public String getQueryFlag() {
        return this.queryFlag;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return riskLevel
     */
    public String getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeRiskCheckResultRequest, Builder> {
        private String assetType; 
        private Integer currentPage; 
        private Long groupId; 
        private java.util.List < String > itemIds; 
        private String lang; 
        private String name; 
        private Integer pageSize; 
        private String queryFlag; 
        private Long resourceOwnerId; 
        private String riskLevel; 
        private String sourceIp; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRiskCheckResultRequest request) {
            super(request);
            this.assetType = request.assetType;
            this.currentPage = request.currentPage;
            this.groupId = request.groupId;
            this.itemIds = request.itemIds;
            this.lang = request.lang;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.queryFlag = request.queryFlag;
            this.resourceOwnerId = request.resourceOwnerId;
            this.riskLevel = request.riskLevel;
            this.sourceIp = request.sourceIp;
            this.status = request.status;
        } 

        /**
         * The cloud service whose configuration check results you want to query. For more information about the check items for the cloud service, see the check item table in the "Response parameters" section of this topic.
         */
        public Builder assetType(String assetType) {
            this.putQueryParameter("AssetType", assetType);
            this.assetType = assetType;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The type of the check item that you want to query. Valid values:
         * <p>
         * 
         * *   **1**: identity authentication and permissions
         * *   **2**: network access control
         * *   **3**: log audit
         * *   **4**: data security
         * *   **5**: monitoring and alerting
         * *   **6**: basic security protection
         * 
         * > If you do not specify this parameter, all types of check items are queried.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the check item. For more information about the check item, see the check item table in the "Response parameters" section of this topic.
         */
        public Builder itemIds(java.util.List < String > itemIds) {
            this.putQueryParameter("ItemIds", itemIds);
            this.itemIds = itemIds;
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
         * The name of the check item. For more information about the check item, see the check item table in the "Response parameters" section of this topic.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **20**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Specifies whether the check item is supported by the edition of Security Center that you purchase. Valid values:
         * <p>
         * 
         * *   **enabled**: yes
         * *   **disabled**: no
         */
        public Builder queryFlag(String queryFlag) {
            this.putQueryParameter("QueryFlag", queryFlag);
            this.queryFlag = queryFlag;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The risk level of the check item that you want to query. Valid values:
         * <p>
         * 
         * *   **high**
         * *   **medium**
         * *   **low**
         */
        public Builder riskLevel(String riskLevel) {
            this.putQueryParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The status of the check results. Valid values:
         * <p>
         * 
         * *   **pass**
         * *   **failed**
         * *   **running**
         * *   **waiting**
         * *   **ignored**
         * *   **falsePositive**
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeRiskCheckResultRequest build() {
            return new DescribeRiskCheckResultRequest(this);
        } 

    } 

}
