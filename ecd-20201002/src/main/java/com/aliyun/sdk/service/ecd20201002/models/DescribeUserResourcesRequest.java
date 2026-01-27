// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

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
 * {@link DescribeUserResourcesRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserResourcesRequest</p>
 */
public class DescribeUserResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessType")
    private String accessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRefresh")
    private Boolean autoRefresh;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    private Integer categoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryType")
    private Integer categoryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientType")
    private String clientType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientVersion")
    private String clientVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DualCenterForward")
    @Deprecated
    private Boolean dualCenterForward;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginRegionId")
    private String loginRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loginToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteIds")
    private java.util.List<String> officeSiteIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductTypes")
    private java.util.List<String> productTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtocolType")
    private String protocolType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryDesktopDurationList")
    private Boolean queryDesktopDurationList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryDesktopTimers")
    private Boolean queryDesktopTimers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryFotaUpdate")
    private Boolean queryFotaUpdate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RefreshFotaUpdate")
    private Boolean refreshFotaUpdate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private java.util.List<String> resourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceName")
    private String resourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceTypes")
    private java.util.List<String> resourceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scene")
    private String scene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchRegionId")
    private String searchRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortType")
    private String sortType;

    private DescribeUserResourcesRequest(Builder builder) {
        super(builder);
        this.accessType = builder.accessType;
        this.autoRefresh = builder.autoRefresh;
        this.categoryId = builder.categoryId;
        this.categoryType = builder.categoryType;
        this.clientId = builder.clientId;
        this.clientType = builder.clientType;
        this.clientVersion = builder.clientVersion;
        this.dualCenterForward = builder.dualCenterForward;
        this.language = builder.language;
        this.loginRegionId = builder.loginRegionId;
        this.loginToken = builder.loginToken;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.officeSiteIds = builder.officeSiteIds;
        this.orderBy = builder.orderBy;
        this.productTypes = builder.productTypes;
        this.protocolType = builder.protocolType;
        this.queryDesktopDurationList = builder.queryDesktopDurationList;
        this.queryDesktopTimers = builder.queryDesktopTimers;
        this.queryFotaUpdate = builder.queryFotaUpdate;
        this.refreshFotaUpdate = builder.refreshFotaUpdate;
        this.resourceIds = builder.resourceIds;
        this.resourceName = builder.resourceName;
        this.resourceTypes = builder.resourceTypes;
        this.scene = builder.scene;
        this.searchRegionId = builder.searchRegionId;
        this.sessionId = builder.sessionId;
        this.sortType = builder.sortType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserResourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessType
     */
    public String getAccessType() {
        return this.accessType;
    }

    /**
     * @return autoRefresh
     */
    public Boolean getAutoRefresh() {
        return this.autoRefresh;
    }

    /**
     * @return categoryId
     */
    public Integer getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return categoryType
     */
    public Integer getCategoryType() {
        return this.categoryType;
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return clientType
     */
    public String getClientType() {
        return this.clientType;
    }

    /**
     * @return clientVersion
     */
    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * @return dualCenterForward
     */
    public Boolean getDualCenterForward() {
        return this.dualCenterForward;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return loginRegionId
     */
    public String getLoginRegionId() {
        return this.loginRegionId;
    }

    /**
     * @return loginToken
     */
    public String getLoginToken() {
        return this.loginToken;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return officeSiteIds
     */
    public java.util.List<String> getOfficeSiteIds() {
        return this.officeSiteIds;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return productTypes
     */
    public java.util.List<String> getProductTypes() {
        return this.productTypes;
    }

    /**
     * @return protocolType
     */
    public String getProtocolType() {
        return this.protocolType;
    }

    /**
     * @return queryDesktopDurationList
     */
    public Boolean getQueryDesktopDurationList() {
        return this.queryDesktopDurationList;
    }

    /**
     * @return queryDesktopTimers
     */
    public Boolean getQueryDesktopTimers() {
        return this.queryDesktopTimers;
    }

    /**
     * @return queryFotaUpdate
     */
    public Boolean getQueryFotaUpdate() {
        return this.queryFotaUpdate;
    }

    /**
     * @return refreshFotaUpdate
     */
    public Boolean getRefreshFotaUpdate() {
        return this.refreshFotaUpdate;
    }

    /**
     * @return resourceIds
     */
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return resourceTypes
     */
    public java.util.List<String> getResourceTypes() {
        return this.resourceTypes;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return searchRegionId
     */
    public String getSearchRegionId() {
        return this.searchRegionId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return sortType
     */
    public String getSortType() {
        return this.sortType;
    }

    public static final class Builder extends Request.Builder<DescribeUserResourcesRequest, Builder> {
        private String accessType; 
        private Boolean autoRefresh; 
        private Integer categoryId; 
        private Integer categoryType; 
        private String clientId; 
        private String clientType; 
        private String clientVersion; 
        private Boolean dualCenterForward; 
        private String language; 
        private String loginRegionId; 
        private String loginToken; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<String> officeSiteIds; 
        private String orderBy; 
        private java.util.List<String> productTypes; 
        private String protocolType; 
        private Boolean queryDesktopDurationList; 
        private Boolean queryDesktopTimers; 
        private Boolean queryFotaUpdate; 
        private Boolean refreshFotaUpdate; 
        private java.util.List<String> resourceIds; 
        private String resourceName; 
        private java.util.List<String> resourceTypes; 
        private String scene; 
        private String searchRegionId; 
        private String sessionId; 
        private String sortType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserResourcesRequest request) {
            super(request);
            this.accessType = request.accessType;
            this.autoRefresh = request.autoRefresh;
            this.categoryId = request.categoryId;
            this.categoryType = request.categoryType;
            this.clientId = request.clientId;
            this.clientType = request.clientType;
            this.clientVersion = request.clientVersion;
            this.dualCenterForward = request.dualCenterForward;
            this.language = request.language;
            this.loginRegionId = request.loginRegionId;
            this.loginToken = request.loginToken;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.officeSiteIds = request.officeSiteIds;
            this.orderBy = request.orderBy;
            this.productTypes = request.productTypes;
            this.protocolType = request.protocolType;
            this.queryDesktopDurationList = request.queryDesktopDurationList;
            this.queryDesktopTimers = request.queryDesktopTimers;
            this.queryFotaUpdate = request.queryFotaUpdate;
            this.refreshFotaUpdate = request.refreshFotaUpdate;
            this.resourceIds = request.resourceIds;
            this.resourceName = request.resourceName;
            this.resourceTypes = request.resourceTypes;
            this.scene = request.scene;
            this.searchRegionId = request.searchRegionId;
            this.sessionId = request.sessionId;
            this.sortType = request.sortType;
        } 

        /**
         * <p>The access type. If you leave this parameter empty, both types will be displayed.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>INTERNET: access over the Internet.</li>
         * <li>VPC: access over an enterprise virtual private cloud (VPC).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INTERNET</p>
         */
        public Builder accessType(String accessType) {
            this.putQueryParameter("AccessType", accessType);
            this.accessType = accessType;
            return this;
        }

        /**
         * <p>Specifies whether to enable the immediate refresh feature.</p>
         * <blockquote>
         * <p> To ensure the operation response speed, we recommend that you set the value to <code>false</code>.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>false</li>
         * <li>true</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRefresh(Boolean autoRefresh) {
            this.putQueryParameter("AutoRefresh", autoRefresh);
            this.autoRefresh = autoRefresh;
            return this;
        }

        /**
         * <p>The level-2 resource category.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder categoryId(Integer categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * <p>The level-1 resource category.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder categoryType(Integer categoryType) {
            this.putQueryParameter("CategoryType", categoryType);
            this.categoryType = categoryType;
            return this;
        }

        /**
         * <p>The client ID. The system generates a unique ID for each client. This parameter is non-sensitive and does not need encryption.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>54c17e1d-2d72-4b87-aa33-25f3b3f2****</p>
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The client type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>html5: the web client.</li>
         * <li>android: the Android client.</li>
         * <li>windows: the Windows client.</li>
         * <li>ios: the iOS client.</li>
         * <li>macos: the macOS client.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        public Builder clientType(String clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * <p>The client version.</p>
         * 
         * <strong>example:</strong>
         * <p>7.6.0-R-20241112.222305</p>
         */
        public Builder clientVersion(String clientVersion) {
            this.putQueryParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * <p>Specifies whether to enable geo-redundant forwarding. Set the value to <code>false</code>.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>false: disables geo-redundant forwarding.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dualCenterForward(Boolean dualCenterForward) {
            this.putQueryParameter("DualCenterForward", dualCenterForward);
            this.dualCenterForward = dualCenterForward;
            return this;
        }

        /**
         * <p>The client language.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>en_US: English.</li>
         * <li>zh_CN: Simplified Chinese.</li>
         * <li>ja_JP: Japanese.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The ID of the region where end users log on to clients. This parameter applies to office network ID-based logons. For organization ID-based logons, you can leave this parameter empty.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder loginRegionId(String loginRegionId) {
            this.putQueryParameter("LoginRegionId", loginRegionId);
            this.loginRegionId = loginRegionId;
            return this;
        }

        /**
         * <p>The logon token. You can call the <code>GetLoginToken</code> or <code>RefreshLoginToken</code> operation to retrieve the logon token.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v18101ac6a9e69c66b04a163031680463660b4b216cd758f34b60b9ad6a7c7f7334b83dd8f75eef4209c68f9f1080b****</p>
         */
        public Builder loginToken(String loginToken) {
            this.putQueryParameter("LoginToken", loginToken);
            this.loginToken = loginToken;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 500.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The office network IDs. This parameter is required for logons by using enterprise Active Directory (AD) accounts.</p>
         */
        public Builder officeSiteIds(java.util.List<String> officeSiteIds) {
            this.putQueryParameter("OfficeSiteIds", officeSiteIds);
            this.officeSiteIds = officeSiteIds;
            return this;
        }

        /**
         * <p>The sorting field. If you do not specify this parameter, resources are sorted by creation time by default.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>CreateTime: the time when resources are created.</li>
         * <li>AssignTime: the time when resources are assigned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AssignTime</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The service types. If you leave this parameter empty, services of all supported types will be queried.</p>
         */
        public Builder productTypes(java.util.List<String> productTypes) {
            this.putQueryParameter("ProductTypes", productTypes);
            this.productTypes = productTypes;
            return this;
        }

        /**
         * <p>The protocol type. You can specify this parameter to filter cloud computers.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>HDX: High-definition Experience (HDX).</li>
         * <li>ASP: Adaptive Streaming Protocol (ASP).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        public Builder protocolType(String protocolType) {
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * <p>是否查询云桌面套餐包信息，默认为true。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder queryDesktopDurationList(Boolean queryDesktopDurationList) {
            this.putQueryParameter("QueryDesktopDurationList", queryDesktopDurationList);
            this.queryDesktopDurationList = queryDesktopDurationList;
            return this;
        }

        /**
         * <p>是否查询云电脑定时任务信息，默认为true。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder queryDesktopTimers(Boolean queryDesktopTimers) {
            this.putQueryParameter("QueryDesktopTimers", queryDesktopTimers);
            this.queryDesktopTimers = queryDesktopTimers;
            return this;
        }

        /**
         * <p>Specifies whether to return the image version information of cloud computers.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder queryFotaUpdate(Boolean queryFotaUpdate) {
            this.putQueryParameter("QueryFotaUpdate", queryFotaUpdate);
            this.queryFotaUpdate = queryFotaUpdate;
            return this;
        }

        /**
         * <p>Specifies whether to refresh over-the-air (OTA) information in real time.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder refreshFotaUpdate(Boolean refreshFotaUpdate) {
            this.putQueryParameter("RefreshFotaUpdate", refreshFotaUpdate);
            this.refreshFotaUpdate = refreshFotaUpdate;
            return this;
        }

        /**
         * <p>The resource IDs. You can specify up to 100 resource IDs.</p>
         */
        public Builder resourceIds(java.util.List<String> resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * <p>The resource name. Fuzzy search is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder resourceName(String resourceName) {
            this.putQueryParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * <p>The resource types. If you leave this parameter empty, resources of all supported types will be queried.</p>
         */
        public Builder resourceTypes(java.util.List<String> resourceTypes) {
            this.putQueryParameter("ResourceTypes", resourceTypes);
            this.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * <p>The client usage scenario. Set the value to <code>desktop</code>.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>desktop: cloud computers.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desktop</p>
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * <p>The ID of the searched region. You can specify this parameter to filter cloud resources in specific regions.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder searchRegionId(String searchRegionId) {
            this.putQueryParameter("SearchRegionId", searchRegionId);
            this.searchRegionId = searchRegionId;
            return this;
        }

        /**
         * <p>The session ID. You can call the <code>GetLoginToken</code> operation to retrieve the session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cd45e873-650d-4d70-acb9-f996187a****</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The sorting method.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>ASC (default): the ascending order.</li>
         * <li>DESC: the descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASC</p>
         */
        public Builder sortType(String sortType) {
            this.putQueryParameter("SortType", sortType);
            this.sortType = sortType;
            return this;
        }

        @Override
        public DescribeUserResourcesRequest build() {
            return new DescribeUserResourcesRequest(this);
        } 

    } 

}
