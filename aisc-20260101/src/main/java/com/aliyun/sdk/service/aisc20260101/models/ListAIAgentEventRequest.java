// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisc20260101.models;

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
 * {@link ListAIAgentEventRequest} extends {@link RequestModel}
 *
 * <p>ListAIAgentEventRequest</p>
 */
public class ListAIAgentEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetName")
    private String assetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetType")
    private String assetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InfraInstanceId")
    private String infraInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InfraName")
    private String infraName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InfraRegionId")
    private String infraRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    private String riskLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskName")
    private String riskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusList")
    private java.util.List<String> statusList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendor")
    private String vendor;

    private ListAIAgentEventRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.assetName = builder.assetName;
        this.assetType = builder.assetType;
        this.currentPage = builder.currentPage;
        this.infraInstanceId = builder.infraInstanceId;
        this.infraName = builder.infraName;
        this.infraRegionId = builder.infraRegionId;
        this.lang = builder.lang;
        this.order = builder.order;
        this.orderBy = builder.orderBy;
        this.pageSize = builder.pageSize;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.riskLevel = builder.riskLevel;
        this.riskName = builder.riskName;
        this.source = builder.source;
        this.status = builder.status;
        this.statusList = builder.statusList;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAIAgentEventRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return assetName
     */
    public String getAssetName() {
        return this.assetName;
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
     * @return infraInstanceId
     */
    public String getInfraInstanceId() {
        return this.infraInstanceId;
    }

    /**
     * @return infraName
     */
    public String getInfraName() {
        return this.infraName;
    }

    /**
     * @return infraRegionId
     */
    public String getInfraRegionId() {
        return this.infraRegionId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return riskLevel
     */
    public String getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return riskName
     */
    public String getRiskName() {
        return this.riskName;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statusList
     */
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<ListAIAgentEventRequest, Builder> {
        private String appId; 
        private String appName; 
        private String assetName; 
        private String assetType; 
        private Integer currentPage; 
        private String infraInstanceId; 
        private String infraName; 
        private String infraRegionId; 
        private String lang; 
        private String order; 
        private String orderBy; 
        private Integer pageSize; 
        private Long resourceDirectoryAccountId; 
        private String riskLevel; 
        private String riskName; 
        private String source; 
        private String status; 
        private java.util.List<String> statusList; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(ListAIAgentEventRequest request) {
            super(request);
            this.appId = request.appId;
            this.appName = request.appName;
            this.assetName = request.assetName;
            this.assetType = request.assetType;
            this.currentPage = request.currentPage;
            this.infraInstanceId = request.infraInstanceId;
            this.infraName = request.infraName;
            this.infraRegionId = request.infraRegionId;
            this.lang = request.lang;
            this.order = request.order;
            this.orderBy = request.orderBy;
            this.pageSize = request.pageSize;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.riskLevel = request.riskLevel;
            this.riskName = request.riskName;
            this.source = request.source;
            this.status = request.status;
            this.statusList = request.statusList;
            this.vendor = request.vendor;
        } 

        /**
         * <p>The ID of the agent application.</p>
         * 
         * <strong>example:</strong>
         * <p>99f30e6b-8374-4a45-8830-439f178c5463</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>Filters the agent list by application name.</p>
         * 
         * <strong>example:</strong>
         * <p>erH</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The asset name.</p>
         * 
         * <strong>example:</strong>
         * <p>13.115.192.70</p>
         */
        public Builder assetName(String assetName) {
            this.putQueryParameter("AssetName", assetName);
            this.assetName = assetName;
            return this;
        }

        /**
         * <p>The type of the agent asset. Valid values:</p>
         * <ol>
         * <li>rag</li>
         * <li>internet</li>
         * <li>datasets</li>
         * <li>tool</li>
         * <li>model</li>
         * <li>skill</li>
         * <li>app</li>
         * <li>identity</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>identity</p>
         */
        public Builder assetType(String assetType) {
            this.putQueryParameter("AssetType", assetType);
            this.assetType = assetType;
            return this;
        }

        /**
         * <p>The current page number.</p>
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
         * <p>The infrastructure instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-test</p>
         */
        public Builder infraInstanceId(String infraInstanceId) {
            this.putQueryParameter("InfraInstanceId", infraInstanceId);
            this.infraInstanceId = infraInstanceId;
            return this;
        }

        /**
         * <p>The infrastructure name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder infraName(String infraName) {
            this.putQueryParameter("InfraName", infraName);
            this.infraName = infraName;
            return this;
        }

        /**
         * <p>The infrastructure region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder infraRegionId(String infraRegionId) {
            this.putQueryParameter("InfraRegionId", infraRegionId);
            this.infraRegionId = infraRegionId;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
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
         * <p>The sort order. Valid values: asc indicates ascending order. desc indicates descending order.</p>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The field by which to sort results. Currently, only sorting by check time is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>CheckTime</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ResourceDirectoryAccountId.
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The risk level of the check item to query. Valid values:</p>
         * <ul>
         * <li><strong>high</strong>: High.</li>
         * <li><strong>medium</strong>: Medium.</li>
         * <li><strong>low</strong>: Low.</li>
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
         * <p>The risk name. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>defense</p>
         */
        public Builder riskName(String riskName) {
            this.putQueryParameter("RiskName", riskName);
            this.riskName = riskName;
            return this;
        }

        /**
         * <p>The event source. Valid values:</p>
         * <ol>
         * <li>cspm</li>
         * <li>aiguard</li>
         * <li>SASE</li>
         * <li>SAS </li>
         * <li>Agent-Runtime-Guard</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>CSPM</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The event status. Valid values:</p>
         * <ol>
         * <li>unhandled: Pending.</li>
         * <li>handling: Being processed.</li>
         * <li>fixed: Fixed.</li>
         * <li>ignored: Ignored.</li>
         * <li>rescanned: Rescanned.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>fixed</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The list of statuses.</p>
         */
        public Builder statusList(java.util.List<String> statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        /**
         * <p>The cloud asset vendor. Valid values:</p>
         * <ul>
         * <li>** DIFY**: DIFY</li>
         * <li>** BAILIAN**: BAILIAN</li>
         * <li>** VOLCAI**: VOLCAI</li>
         * <li>** AGENTRUN**: AGENTRUN</li>
         * <li>** PAI**: PAI</li>
         * <li>** OpenClaw**: OpenClaw</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DIFY</p>
         */
        public Builder vendor(String vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public ListAIAgentEventRequest build() {
            return new ListAIAgentEventRequest(this);
        } 

    } 

}
