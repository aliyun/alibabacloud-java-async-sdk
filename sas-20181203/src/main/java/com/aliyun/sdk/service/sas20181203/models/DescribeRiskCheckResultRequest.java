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
 * {@link DescribeRiskCheckResultRequest} extends {@link RequestModel}
 *
 * <p>DescribeRiskCheckResultRequest</p>
 */
public class DescribeRiskCheckResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetType")
    private String assetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ItemIds")
    private java.util.List<String> itemIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryFlag")
    private String queryFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    private String riskLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
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
    public java.util.List<String> getItemIds() {
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
        private java.util.List<String> itemIds; 
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
         * <p>The cloud service whose configuration check results you want to query. For more information about the check items for the cloud service, see the check item table in the &quot;Response parameters&quot; section of this topic.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder assetType(String assetType) {
            this.putQueryParameter("AssetType", assetType);
            this.assetType = assetType;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The type of the check item that you want to query. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: identity authentication and permissions</li>
         * <li><strong>2</strong>: network access control</li>
         * <li><strong>3</strong>: log audit</li>
         * <li><strong>4</strong>: data security</li>
         * <li><strong>5</strong>: monitoring and alerting</li>
         * <li><strong>6</strong>: basic security protection</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, all types of check items are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>An array that consists of the IDs of check items. For more information about the check item, see the check item table in the &quot;Response parameters&quot; section of this topic.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder itemIds(java.util.List<String> itemIds) {
            this.putQueryParameter("ItemIds", itemIds);
            this.itemIds = itemIds;
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
         * <p>The name of the check item. For more information about the check item, see the check item table in the &quot;Response parameters&quot; section of this topic.</p>
         * 
         * <strong>example:</strong>
         * <p>ALB_NetWorkAccessControl</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Specifies whether the check item is supported by the edition of Security Center that you purchase. Valid values:</p>
         * <ul>
         * <li><strong>enabled</strong>: yes</li>
         * <li><strong>disabled</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
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
         * <p>The risk level of the check item that you want to query. Valid values:</p>
         * <ul>
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        public Builder riskLevel(String riskLevel) {
            this.putQueryParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The status of the check results. Valid values:</p>
         * <ul>
         * <li><strong>pass</strong></li>
         * <li><strong>failed</strong></li>
         * <li><strong>running</strong></li>
         * <li><strong>waiting</strong></li>
         * <li><strong>ignored</strong></li>
         * <li><strong>falsePositive</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
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
