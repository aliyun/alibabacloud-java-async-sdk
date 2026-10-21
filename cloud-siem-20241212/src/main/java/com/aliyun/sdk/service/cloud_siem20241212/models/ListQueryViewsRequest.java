// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListQueryViewsRequest} extends {@link RequestModel}
 *
 * <p>ListQueryViewsRequest</p>
 */
public class ListQueryViewsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueryViewScene")
    private String queryViewScene;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueryViewType")
    private String queryViewType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Integer roleType;

    private ListQueryViewsRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.queryViewScene = builder.queryViewScene;
        this.queryViewType = builder.queryViewType;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQueryViewsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
     * @return queryViewScene
     */
    public String getQueryViewScene() {
        return this.queryViewScene;
    }

    /**
     * @return queryViewType
     */
    public String getQueryViewType() {
        return this.queryViewType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public Integer getRoleType() {
        return this.roleType;
    }

    public static final class Builder extends Request.Builder<ListQueryViewsRequest, Builder> {
        private String lang; 
        private Integer maxResults; 
        private String nextToken; 
        private String queryViewScene; 
        private String queryViewType; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 

        private Builder() {
            super();
        } 

        private Builder(ListQueryViewsRequest request) {
            super(request);
            this.lang = request.lang;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.queryViewScene = request.queryViewScene;
            this.queryViewType = request.queryViewType;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.
         * Note: This parameter is required in practice. If you do not specify this parameter, the API returns a 400 error: &quot;The specified Lang can not be empty.&quot; You must explicitly pass zh or en.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The maximum number of results to return when you use the NextToken-based pagination method. Valid values: 1 to 100. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request or if no more results exist. Set this parameter to the NextToken value returned in the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The scene to which the query view belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Alert</p>
         */
        public Builder queryViewScene(String queryViewScene) {
            this.putBodyParameter("QueryViewScene", queryViewScene);
            this.queryViewScene = queryViewScene;
            return this;
        }

        /**
         * <p>The view type. If this parameter is left empty, all views are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>preset</p>
         */
        public Builder queryViewType(String queryViewType) {
            this.putBodyParameter("QueryViewType", queryViewType);
            this.queryViewType = queryViewType;
            return this;
        }

        /**
         * <p>The region where the Cloud Threat Detection and Response (CTDR) data management center resides. Specify this parameter based on the region of your assets. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Your assets belong to the Chinese mainland or Hong Kong (China).</li>
         * <li>ap-southeast-1: Your assets belong to regions outside China.</li>
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
         * <p>The user ID of the member to which the administrator switches the view.</p>
         * 
         * <strong>example:</strong>
         * <p>113091674488****</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * <p>The view type.</p>
         * <ul>
         * <li>0: The view of the current Alibaba Cloud account.</li>
         * <li>1: The view of all accounts in the enterprise.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        @Override
        public ListQueryViewsRequest build() {
            return new ListQueryViewsRequest(this);
        } 

    } 

}
