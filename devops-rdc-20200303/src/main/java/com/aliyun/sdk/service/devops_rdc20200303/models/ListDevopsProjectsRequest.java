// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDevopsProjectsRequest} extends {@link RequestModel}
 *
 * <p>ListDevopsProjectsRequest</p>
 */
public class ListDevopsProjectsRequest extends Request {
    @Body
    @NameInMap("OrderBy")
    @Validation(required = true)
    private String orderBy;

    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("PageToken")
    private String pageToken;

    @Body
    @NameInMap("SelectBy")
    private String selectBy;

    private ListDevopsProjectsRequest(Builder builder) {
        super(builder);
        this.orderBy = builder.orderBy;
        this.orgId = builder.orgId;
        this.pageSize = builder.pageSize;
        this.pageToken = builder.pageToken;
        this.selectBy = builder.selectBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDevopsProjectsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pageToken
     */
    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * @return selectBy
     */
    public String getSelectBy() {
        return this.selectBy;
    }

    public static final class Builder extends Request.Builder<ListDevopsProjectsRequest, Builder> {
        private String orderBy; 
        private String orgId; 
        private Integer pageSize; 
        private String pageToken; 
        private String selectBy; 

        private Builder() {
            super();
        } 

        private Builder(ListDevopsProjectsRequest response) {
            super(response);
            this.orderBy = response.orderBy;
            this.orgId = response.orgId;
            this.pageSize = response.pageSize;
            this.pageToken = response.pageToken;
            this.selectBy = response.selectBy;
        } 

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putBodyParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * OrgId.
         */
        public Builder orgId(String orgId) {
            this.putBodyParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PageToken.
         */
        public Builder pageToken(String pageToken) {
            this.putBodyParameter("PageToken", pageToken);
            this.pageToken = pageToken;
            return this;
        }

        /**
         * SelectBy.
         */
        public Builder selectBy(String selectBy) {
            this.putBodyParameter("SelectBy", selectBy);
            this.selectBy = selectBy;
            return this;
        }

        @Override
        public ListDevopsProjectsRequest build() {
            return new ListDevopsProjectsRequest(this);
        } 

    } 

}
