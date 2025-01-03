// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link ListChangeRequestWorkflowExecutionsRequest} extends {@link RequestModel}
 *
 * <p>ListChangeRequestWorkflowExecutionsRequest</p>
 */
public class ListChangeRequestWorkflowExecutionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("perPage")
    private Long perPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("releaseStageSn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String releaseStageSn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("releaseWorkflowSn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String releaseWorkflowSn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sort")
    private String sort;

    private ListChangeRequestWorkflowExecutionsRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.sn = builder.sn;
        this.orderBy = builder.orderBy;
        this.organizationId = builder.organizationId;
        this.page = builder.page;
        this.perPage = builder.perPage;
        this.releaseStageSn = builder.releaseStageSn;
        this.releaseWorkflowSn = builder.releaseWorkflowSn;
        this.sort = builder.sort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChangeRequestWorkflowExecutionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return sn
     */
    public String getSn() {
        return this.sn;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return perPage
     */
    public Long getPerPage() {
        return this.perPage;
    }

    /**
     * @return releaseStageSn
     */
    public String getReleaseStageSn() {
        return this.releaseStageSn;
    }

    /**
     * @return releaseWorkflowSn
     */
    public String getReleaseWorkflowSn() {
        return this.releaseWorkflowSn;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    public static final class Builder extends Request.Builder<ListChangeRequestWorkflowExecutionsRequest, Builder> {
        private String appName; 
        private String sn; 
        private String orderBy; 
        private String organizationId; 
        private Long page; 
        private Long perPage; 
        private String releaseStageSn; 
        private String releaseWorkflowSn; 
        private String sort; 

        private Builder() {
            super();
        } 

        private Builder(ListChangeRequestWorkflowExecutionsRequest request) {
            super(request);
            this.appName = request.appName;
            this.sn = request.sn;
            this.orderBy = request.orderBy;
            this.organizationId = request.organizationId;
            this.page = request.page;
            this.perPage = request.perPage;
            this.releaseStageSn = request.releaseStageSn;
            this.releaseWorkflowSn = request.releaseWorkflowSn;
            this.sort = request.sort;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        public Builder appName(String appName) {
            this.putPathParameter("appName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ce51b31b996246ecaf874736838360b2</p>
         */
        public Builder sn(String sn) {
            this.putPathParameter("sn", sn);
            this.sn = sn;
            return this;
        }

        /**
         * orderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("orderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Long page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * perPage.
         */
        public Builder perPage(Long perPage) {
            this.putQueryParameter("perPage", perPage);
            this.perPage = perPage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e173f3c11db5445eb426ca33c92207c8</p>
         */
        public Builder releaseStageSn(String releaseStageSn) {
            this.putQueryParameter("releaseStageSn", releaseStageSn);
            this.releaseStageSn = releaseStageSn;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ce51b31b996246ecaf874736838360b2</p>
         */
        public Builder releaseWorkflowSn(String releaseWorkflowSn) {
            this.putQueryParameter("releaseWorkflowSn", releaseWorkflowSn);
            this.releaseWorkflowSn = releaseWorkflowSn;
            return this;
        }

        /**
         * sort.
         */
        public Builder sort(String sort) {
            this.putQueryParameter("sort", sort);
            this.sort = sort;
            return this;
        }

        @Override
        public ListChangeRequestWorkflowExecutionsRequest build() {
            return new ListChangeRequestWorkflowExecutionsRequest(this);
        } 

    } 

}
