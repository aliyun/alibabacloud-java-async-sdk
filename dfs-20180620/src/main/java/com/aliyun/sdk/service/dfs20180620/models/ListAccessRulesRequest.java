// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

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
 * {@link ListAccessRulesRequest} extends {@link RequestModel}
 *
 * <p>ListAccessRulesRequest</p>
 */
public class ListAccessRulesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartOffset")
    @com.aliyun.core.annotation.Validation(maximum = 100000, minimum = 1)
    private Integer startOffset;

    private ListAccessRulesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.accessGroupId = builder.accessGroupId;
        this.inputRegionId = builder.inputRegionId;
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
        this.orderBy = builder.orderBy;
        this.orderType = builder.orderType;
        this.startOffset = builder.startOffset;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccessRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return accessGroupId
     */
    public String getAccessGroupId() {
        return this.accessGroupId;
    }

    /**
     * @return inputRegionId
     */
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return startOffset
     */
    public Integer getStartOffset() {
        return this.startOffset;
    }

    public static final class Builder extends Request.Builder<ListAccessRulesRequest, Builder> {
        private String regionId; 
        private String accessGroupId; 
        private String inputRegionId; 
        private Integer limit; 
        private String nextToken; 
        private String orderBy; 
        private String orderType; 
        private Integer startOffset; 

        private Builder() {
            super();
        } 

        private Builder(ListAccessRulesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.accessGroupId = request.accessGroupId;
            this.inputRegionId = request.inputRegionId;
            this.limit = request.limit;
            this.nextToken = request.nextToken;
            this.orderBy = request.orderBy;
            this.orderType = request.orderType;
            this.startOffset = request.startOffset;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the access group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acg-e3755fb0-358d-4286-9942-8d461048****</p>
         */
        public Builder accessGroupId(String accessGroupId) {
            this.putQueryParameter("AccessGroupId", accessGroupId);
            this.accessGroupId = accessGroupId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder inputRegionId(String inputRegionId) {
            this.putQueryParameter("InputRegionId", inputRegionId);
            this.inputRegionId = inputRegionId;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * <p>Default value: 10</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The token for the next page.</p>
         * <p>If a single query does not return all entries, a non-empty NextToken is returned. You can specify the NextToken in a subsequent query to continue the query.</p>
         * 
         * <strong>example:</strong>
         * <p>MYR6sz6qkmauspAy8oxjHP-tOLtD4KSv3DzI7G6iywTx1ZCExO50GtSuiTB9z0JppvYQ2iUa8s4HbcFanMQfDIlds4da87_Ax4UJMva****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The field by which to sort the returned results.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Priority (default): sort by priority</li>
         * <li>CreateTime: sort by creation time</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Priority</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The sort order of the returned results.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>ASC (default): ascending order</li>
         * <li>DESC: descending order</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASC</p>
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * <p>Specifies the starting position of the query.</p>
         * <p>Default value: 1</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder startOffset(Integer startOffset) {
            this.putQueryParameter("StartOffset", startOffset);
            this.startOffset = startOffset;
            return this;
        }

        @Override
        public ListAccessRulesRequest build() {
            return new ListAccessRulesRequest(this);
        } 

    } 

}
