// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGlobalDesktopsRequest} extends {@link RequestModel}
 *
 * <p>DescribeGlobalDesktopsRequest</p>
 */
public class DescribeGlobalDesktopsRequest extends Request {
    @Query
    @NameInMap("ClientId")
    @Validation(required = true)
    private String clientId;

    @Query
    @NameInMap("DesktopAccessType")
    private String desktopAccessType;

    @Query
    @NameInMap("DesktopId")
    private java.util.List < String > desktopId;

    @Query
    @NameInMap("DesktopName")
    private String desktopName;

    @Query
    @NameInMap("DesktopStatus")
    private String desktopStatus;

    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("LoginToken")
    @Validation(required = true)
    private String loginToken;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OfficeSiteId")
    private String officeSiteId;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("QueryFotaUpdate")
    private Boolean queryFotaUpdate;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SearchRegionId")
    private String searchRegionId;

    @Query
    @NameInMap("SessionId")
    private String sessionId;

    @Query
    @NameInMap("SortType")
    private String sortType;

    @Query
    @NameInMap("WithoutLatency")
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
    public java.util.List < String > getDesktopId() {
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
        private java.util.List < String > desktopId; 
        private String desktopName; 
        private String desktopStatus; 
        private String directoryId; 
        private String keyword; 
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
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * DesktopAccessType.
         */
        public Builder desktopAccessType(String desktopAccessType) {
            this.putQueryParameter("DesktopAccessType", desktopAccessType);
            this.desktopAccessType = desktopAccessType;
            return this;
        }

        /**
         * DesktopId.
         */
        public Builder desktopId(java.util.List < String > desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * DesktopName.
         */
        public Builder desktopName(String desktopName) {
            this.putQueryParameter("DesktopName", desktopName);
            this.desktopName = desktopName;
            return this;
        }

        /**
         * DesktopStatus.
         */
        public Builder desktopStatus(String desktopStatus) {
            this.putQueryParameter("DesktopStatus", desktopStatus);
            this.desktopStatus = desktopStatus;
            return this;
        }

        /**
         * DirectoryId.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * LoginToken.
         */
        public Builder loginToken(String loginToken) {
            this.putQueryParameter("LoginToken", loginToken);
            this.loginToken = loginToken;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OfficeSiteId.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * QueryFotaUpdate.
         */
        public Builder queryFotaUpdate(Boolean queryFotaUpdate) {
            this.putQueryParameter("QueryFotaUpdate", queryFotaUpdate);
            this.queryFotaUpdate = queryFotaUpdate;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SearchRegionId.
         */
        public Builder searchRegionId(String searchRegionId) {
            this.putQueryParameter("SearchRegionId", searchRegionId);
            this.searchRegionId = searchRegionId;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * SortType.
         */
        public Builder sortType(String sortType) {
            this.putQueryParameter("SortType", sortType);
            this.sortType = sortType;
            return this;
        }

        /**
         * WithoutLatency.
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
