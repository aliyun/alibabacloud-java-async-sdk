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
 * {@link DescribeGlobalDesktopsRequest} extends {@link RequestModel}
 *
 * <p>DescribeGlobalDesktopsRequest</p>
 */
public class DescribeGlobalDesktopsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopAccessType")
    private String desktopAccessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    private java.util.List<String> desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopName")
    private String desktopName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopStatus")
    private String desktopStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

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
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryFotaUpdate")
    private Boolean queryFotaUpdate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchRegionId")
    private String searchRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortType")
    private String sortType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithoutLatency")
    private Boolean withoutLatency;

    private DescribeGlobalDesktopsRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.desktopAccessType = builder.desktopAccessType;
        this.desktopId = builder.desktopId;
        this.desktopName = builder.desktopName;
        this.desktopStatus = builder.desktopStatus;
        this.directoryId = builder.directoryId;
        this.keyword = builder.keyword;
        this.language = builder.language;
        this.loginRegionId = builder.loginRegionId;
        this.loginToken = builder.loginToken;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.officeSiteId = builder.officeSiteId;
        this.orderBy = builder.orderBy;
        this.queryFotaUpdate = builder.queryFotaUpdate;
        this.regionId = builder.regionId;
        this.searchRegionId = builder.searchRegionId;
        this.sessionId = builder.sessionId;
        this.sortType = builder.sortType;
        this.withoutLatency = builder.withoutLatency;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGlobalDesktopsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return desktopAccessType
     */
    public String getDesktopAccessType() {
        return this.desktopAccessType;
    }

    /**
     * @return desktopId
     */
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return desktopName
     */
    public String getDesktopName() {
        return this.desktopName;
    }

    /**
     * @return desktopStatus
     */
    public String getDesktopStatus() {
        return this.desktopStatus;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
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
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return queryFotaUpdate
     */
    public Boolean getQueryFotaUpdate() {
        return this.queryFotaUpdate;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    /**
     * @return withoutLatency
     */
    public Boolean getWithoutLatency() {
        return this.withoutLatency;
    }

    public static final class Builder extends Request.Builder<DescribeGlobalDesktopsRequest, Builder> {
        private String clientId; 
        private String desktopAccessType; 
        private java.util.List<String> desktopId; 
        private String desktopName; 
        private String desktopStatus; 
        private String directoryId; 
        private String keyword; 
        private String language; 
        private String loginRegionId; 
        private String loginToken; 
        private Integer maxResults; 
        private String nextToken; 
        private String officeSiteId; 
        private String orderBy; 
        private Boolean queryFotaUpdate; 
        private String regionId; 
        private String searchRegionId; 
        private String sessionId; 
        private String sortType; 
        private Boolean withoutLatency; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGlobalDesktopsRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.desktopAccessType = request.desktopAccessType;
            this.desktopId = request.desktopId;
            this.desktopName = request.desktopName;
            this.desktopStatus = request.desktopStatus;
            this.directoryId = request.directoryId;
            this.keyword = request.keyword;
            this.language = request.language;
            this.loginRegionId = request.loginRegionId;
            this.loginToken = request.loginToken;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.officeSiteId = request.officeSiteId;
            this.orderBy = request.orderBy;
            this.queryFotaUpdate = request.queryFotaUpdate;
            this.regionId = request.regionId;
            this.searchRegionId = request.searchRegionId;
            this.sessionId = request.sessionId;
            this.sortType = request.sortType;
            this.withoutLatency = request.withoutLatency;
        } 

        /**
         * <p>The unique ID generated by the client.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c213150d-7ac3-432c-b749-6e1e090b****</p>
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The method that is used to connect cloud computers that reside in the office network from WUYING clients.</p>
         * <blockquote>
         * <p> The VPC connection method depends on Alibaba Cloud PrivateLink. You can use PrivateLink for free. If you set this parameter to VPC or Any, the system automatically enables PrivateLink.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>INTERNET (default): End users connect to cloud computers from clients over the Internet.</li>
         * <li>VPC: End users connect to cloud computers from clients over a virtual private cloud (VPC).</li>
         * <li>Any: End users connect to cloud computers from clients over the Internet or a VPC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INTERNET</p>
         */
        public Builder desktopAccessType(String desktopAccessType) {
            this.putQueryParameter("DesktopAccessType", desktopAccessType);
            this.desktopAccessType = desktopAccessType;
            return this;
        }

        /**
         * <p>The cloud computer ID. You can specify one or more cloud computer IDs. Valid values: 1 to 20.</p>
         */
        public Builder desktopId(java.util.List<String> desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The cloud computer name.</p>
         * 
         * <strong>example:</strong>
         * <p>DesktopTest</p>
         */
        public Builder desktopName(String desktopName) {
            this.putQueryParameter("DesktopName", desktopName);
            this.desktopName = desktopName;
            return this;
        }

        /**
         * <p>The cloud computer status.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>Stopped</li>
         * <li>Starting.</li>
         * <li>Rebuilding</li>
         * <li>Running:.</li>
         * <li>Stopping:.</li>
         * <li>Expired</li>
         * <li>Deleted</li>
         * <li>Pending: The resource is still being prepared.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder desktopStatus(String desktopStatus) {
            this.putQueryParameter("DesktopStatus", desktopStatus);
            this.desktopStatus = desktopStatus;
            return this;
        }

        /**
         * <p>The office network IDs.</p>
         * <blockquote>
         * <p> This parameter is about to be disabled. Use <code>OfficeSiteId</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-880841****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The keyword. Fuzzy search is supported for cloud computer IDs, cloud computer names, and end user custom cloud computer names.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The ID of the region where the office network resides. This parameter is left empty when you log on with an organization ID.</p>
         * <ul>
         * <li>This parameter is required when you log on by using the office network ID.</li>
         * <li>If you log on by using an organization ID, this parameter can be left empty.</li>
         * </ul>
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
         * <p>The logon token. You can call the GetLoginToken operation to obtain the token. You can also call the UpdateToken operation to obtain the token RefreshLoginToken. Response parameter: LoginToken.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v147c9114a180489f89691663893169****</p>
         */
        public Builder loginToken(String loginToken) {
            this.putQueryParameter("LoginToken", loginToken);
            this.loginToken = loginToken;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <ul>
         * <li>Maximum value: 500.</li>
         * <li>and the default value is 10.</li>
         * </ul>
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
         * <p>The token used to start the next query. If NextToken is empty, it indicates that there is no next query.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJkZWZhdWx0IjpbIjk2MjEy****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The office network IDs.</p>
         * <blockquote>
         * <p> <code>DirectoryId</code> the parameter is about to be retired, use this field.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-880841****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The field used for sorting. If you do not specify this option, the system is sorted in descending order of creation time.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>AssignTime: sort by allocation time.</li>
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
         * <p>Specifies whether to query information about the image update.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder queryFotaUpdate(Boolean queryFotaUpdate) {
            this.putQueryParameter("QueryFotaUpdate", queryFotaUpdate);
            this.queryFotaUpdate = queryFotaUpdate;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>cn-shanghai: China (Shanghai)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the searched region. You can specify this parameter to filter cloud computers in specific regions.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder searchRegionId(String searchRegionId) {
            this.putQueryParameter("SearchRegionId", searchRegionId);
            this.searchRegionId = searchRegionId;
            return this;
        }

        /**
         * <p>The session ID. You can call the GetLoginToken operation to query the value of the SessionId parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>5c456a41-1e65-4e72-ab4d-5dcfff52****</p>
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

        /**
         * <p>Whether to query real-time cloud computer information. The cloud computer status information in the current interface has a delay of 1 to 3 seconds. If you need accurate information, set this value to <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder withoutLatency(Boolean withoutLatency) {
            this.putQueryParameter("WithoutLatency", withoutLatency);
            this.withoutLatency = withoutLatency;
            return this;
        }

        @Override
        public DescribeGlobalDesktopsRequest build() {
            return new DescribeGlobalDesktopsRequest(this);
        } 

    } 

}
