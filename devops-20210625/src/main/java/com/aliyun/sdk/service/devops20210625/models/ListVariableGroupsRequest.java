// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVariableGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListVariableGroupsRequest</p>
 */
public class ListVariableGroupsRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("maxResults")
    private Integer maxResults;

    @Query
    @NameInMap("nextToken")
    private String nextToken;

    @Query
    @NameInMap("pageOrder")
    private String pageOrder;

    @Query
    @NameInMap("pageSort")
    private String pageSort;

    private ListVariableGroupsRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageOrder = builder.pageOrder;
        this.pageSort = builder.pageSort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVariableGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
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
     * @return pageOrder
     */
    public String getPageOrder() {
        return this.pageOrder;
    }

    /**
     * @return pageSort
     */
    public String getPageSort() {
        return this.pageSort;
    }

    public static final class Builder extends Request.Builder<ListVariableGroupsRequest, Builder> {
        private String organizationId; 
        private Integer maxResults; 
        private String nextToken; 
        private String pageOrder; 
        private String pageSort; 

        private Builder() {
            super();
        } 

        private Builder(ListVariableGroupsRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.pageOrder = response.pageOrder;
            this.pageSort = response.pageSort;
        } 

        /**
         * 企业标识，也称企业id，字符串形式，可在云效访问链接中获取，如  https:// devops.aliyun.com/organization/【OrgId】
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 最大返回数，默认30
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 分页token，上一次请求的出参nextToken
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 排序顺序
         */
        public Builder pageOrder(String pageOrder) {
            this.putQueryParameter("pageOrder", pageOrder);
            this.pageOrder = pageOrder;
            return this;
        }

        /**
         * 排序条件
         */
        public Builder pageSort(String pageSort) {
            this.putQueryParameter("pageSort", pageSort);
            this.pageSort = pageSort;
            return this;
        }

        @Override
        public ListVariableGroupsRequest build() {
            return new ListVariableGroupsRequest(this);
        } 

    } 

}
