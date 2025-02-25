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
 * {@link ListHostGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListHostGroupsRequest</p>
 */
public class ListHostGroupsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createEndTime")
    private Long createEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createStartTime")
    private Long createStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("creatorAccountIds")
    private String creatorAccountIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ids")
    private String ids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageOrder")
    private String pageOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSort")
    private String pageSort;

    private ListHostGroupsRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.createEndTime = builder.createEndTime;
        this.createStartTime = builder.createStartTime;
        this.creatorAccountIds = builder.creatorAccountIds;
        this.ids = builder.ids;
        this.maxResults = builder.maxResults;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.pageOrder = builder.pageOrder;
        this.pageSort = builder.pageSort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostGroupsRequest create() {
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
     * @return createEndTime
     */
    public Long getCreateEndTime() {
        return this.createEndTime;
    }

    /**
     * @return createStartTime
     */
    public Long getCreateStartTime() {
        return this.createStartTime;
    }

    /**
     * @return creatorAccountIds
     */
    public String getCreatorAccountIds() {
        return this.creatorAccountIds;
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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

    public static final class Builder extends Request.Builder<ListHostGroupsRequest, Builder> {
        private String organizationId; 
        private Long createEndTime; 
        private Long createStartTime; 
        private String creatorAccountIds; 
        private String ids; 
        private Long maxResults; 
        private String name; 
        private String nextToken; 
        private String pageOrder; 
        private String pageSort; 

        private Builder() {
            super();
        } 

        private Builder(ListHostGroupsRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.createEndTime = request.createEndTime;
            this.createStartTime = request.createStartTime;
            this.creatorAccountIds = request.creatorAccountIds;
            this.ids = request.ids;
            this.maxResults = request.maxResults;
            this.name = request.name;
            this.nextToken = request.nextToken;
            this.pageOrder = request.pageOrder;
            this.pageSort = request.pageSort;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ebbc0228123212b59xxxxx</p>
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * createEndTime.
         */
        public Builder createEndTime(Long createEndTime) {
            this.putQueryParameter("createEndTime", createEndTime);
            this.createEndTime = createEndTime;
            return this;
        }

        /**
         * createStartTime.
         */
        public Builder createStartTime(Long createStartTime) {
            this.putQueryParameter("createStartTime", createStartTime);
            this.createStartTime = createStartTime;
            return this;
        }

        /**
         * creatorAccountIds.
         */
        public Builder creatorAccountIds(String creatorAccountIds) {
            this.putQueryParameter("creatorAccountIds", creatorAccountIds);
            this.creatorAccountIds = creatorAccountIds;
            return this;
        }

        /**
         * ids.
         */
        public Builder ids(String ids) {
            this.putQueryParameter("ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * pageOrder.
         */
        public Builder pageOrder(String pageOrder) {
            this.putQueryParameter("pageOrder", pageOrder);
            this.pageOrder = pageOrder;
            return this;
        }

        /**
         * pageSort.
         */
        public Builder pageSort(String pageSort) {
            this.putQueryParameter("pageSort", pageSort);
            this.pageSort = pageSort;
            return this;
        }

        @Override
        public ListHostGroupsRequest build() {
            return new ListHostGroupsRequest(this);
        } 

    } 

}
