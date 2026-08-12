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
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

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
        this.pageSize = builder.pageSize;
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
        private Integer pageSize; 
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
            this.pageSize = request.pageSize;
            this.riskLevel = request.riskLevel;
            this.riskName = request.riskName;
            this.source = request.source;
            this.status = request.status;
            this.statusList = request.statusList;
            this.vendor = request.vendor;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AssetName.
         */
        public Builder assetName(String assetName) {
            this.putQueryParameter("AssetName", assetName);
            this.assetName = assetName;
            return this;
        }

        /**
         * AssetType.
         */
        public Builder assetType(String assetType) {
            this.putQueryParameter("AssetType", assetType);
            this.assetType = assetType;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * InfraInstanceId.
         */
        public Builder infraInstanceId(String infraInstanceId) {
            this.putQueryParameter("InfraInstanceId", infraInstanceId);
            this.infraInstanceId = infraInstanceId;
            return this;
        }

        /**
         * InfraName.
         */
        public Builder infraName(String infraName) {
            this.putQueryParameter("InfraName", infraName);
            this.infraName = infraName;
            return this;
        }

        /**
         * InfraRegionId.
         */
        public Builder infraRegionId(String infraRegionId) {
            this.putQueryParameter("InfraRegionId", infraRegionId);
            this.infraRegionId = infraRegionId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RiskLevel.
         */
        public Builder riskLevel(String riskLevel) {
            this.putQueryParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * RiskName.
         */
        public Builder riskName(String riskName) {
            this.putQueryParameter("RiskName", riskName);
            this.riskName = riskName;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * StatusList.
         */
        public Builder statusList(java.util.List<String> statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
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
        public ListAIAgentEventRequest build() {
            return new ListAIAgentEventRequest(this);
        } 

    } 

}
