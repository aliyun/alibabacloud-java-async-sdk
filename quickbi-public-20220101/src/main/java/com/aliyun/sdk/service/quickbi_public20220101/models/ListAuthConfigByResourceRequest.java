// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link ListAuthConfigByResourceRequest} extends {@link RequestModel}
 *
 * <p>ListAuthConfigByResourceRequest</p>
 */
public class ListAuthConfigByResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HasAuth")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean hasAuth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShareToType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer shareToType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorksType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String worksType;

    private ListAuthConfigByResourceRequest(Builder builder) {
        super(builder);
        this.hasAuth = builder.hasAuth;
        this.keyword = builder.keyword;
        this.resourceId = builder.resourceId;
        this.shareToType = builder.shareToType;
        this.worksType = builder.worksType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthConfigByResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hasAuth
     */
    public Boolean getHasAuth() {
        return this.hasAuth;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return shareToType
     */
    public Integer getShareToType() {
        return this.shareToType;
    }

    /**
     * @return worksType
     */
    public String getWorksType() {
        return this.worksType;
    }

    public static final class Builder extends Request.Builder<ListAuthConfigByResourceRequest, Builder> {
        private Boolean hasAuth; 
        private String keyword; 
        private String resourceId; 
        private Integer shareToType; 
        private String worksType; 

        private Builder() {
            super();
        } 

        private Builder(ListAuthConfigByResourceRequest request) {
            super(request);
            this.hasAuth = request.hasAuth;
            this.keyword = request.keyword;
            this.resourceId = request.resourceId;
            this.shareToType = request.shareToType;
            this.worksType = request.worksType;
        } 

        /**
         * <p>Specifies whether to query only records that have permissions.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasAuth(Boolean hasAuth) {
            this.putQueryParameter("HasAuth", hasAuth);
            this.hasAuth = hasAuth;
            return this;
        }

        /**
         * <p>The search keyword for the authorized object.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The ID of the resource to authorize.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>al*************7ufv</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The query granularity. Valid values:</p>
         * <ul>
         * <li>0: user</li>
         * <li>1: user group</li>
         * </ul>
         * <blockquote>
         * <p>Notice: Authorization records for organizations and workspaces are returned at the user granularity. Datasets and data sources can only be authorized to users.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder shareToType(Integer shareToType) {
            this.putQueryParameter("ShareToType", shareToType);
            this.shareToType = shareToType;
            return this;
        }

        /**
         * <p>The type of the authorization resource. Valid values:</p>
         * <ul>
         * <li>dashboard: dashboard</li>
         * <li>screen: data screen</li>
         * <li>report: electron</li>
         * <li>ANALYSIS: ad hoc analysis</li>
         * <li>dashboardOfflineQuery: self-service data retrieval</li>
         * <li>dataForm: data form</li>
         * <li>cube: dataset</li>
         * <li>datasource: data source</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>REPORT</p>
         */
        public Builder worksType(String worksType) {
            this.putQueryParameter("WorksType", worksType);
            this.worksType = worksType;
            return this;
        }

        @Override
        public ListAuthConfigByResourceRequest build() {
            return new ListAuthConfigByResourceRequest(this);
        } 

    } 

}
