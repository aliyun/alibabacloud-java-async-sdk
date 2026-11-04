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
 * {@link ListFileSystemsRequest} extends {@link RequestModel}
 *
 * <p>ListFileSystemsRequest</p>
 */
public class ListFileSystemsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

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

    private ListFileSystemsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
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

    public static ListFileSystemsRequest create() {
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

    public static final class Builder extends Request.Builder<ListFileSystemsRequest, Builder> {
        private String regionId; 
        private String inputRegionId; 
        private Integer limit; 
        private String nextToken; 
        private String orderBy; 
        private String orderType; 
        private Integer startOffset; 

        private Builder() {
            super();
        } 

        private Builder(ListFileSystemsRequest request) {
            super(request);
            this.regionId = request.regionId;
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
         * <p>The number of entries to return on each page. Default value: 10.</p>
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
         * <p>The pagination token. If a query does not return all directories, a non-empty NextToken is returned. You can specify the NextToken in the next request to continue the query.</p>
         * 
         * <strong>example:</strong>
         * <p>tCSKxtX5z_fW0-Q0ug8Df1oSXGiamAjmrtaDFAj6sZW-YhN1lRC7TEIkcFfMuj-6uR9wSW4b_PS2ze70k269qy8bMVHDfRW0Tvhmyh-****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The field by which to sort the returned results. Valid values:</p>
         * <ul>
         * <li>CreateTime: Sorts the results by creation time. This is the default value.</li>
         * <li>FileSystemName: Sorts the results by file system name.</li>
         * <li>SpaceCapacity: Sorts the results by file system capacity budget.</li>
         * <li>UsedSpaceSize: Sorts the results by file system used space.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreateTime</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The order in which to sort the returned results. Valid values:</p>
         * <ul>
         * <li>ASC: Ascending order. This is the default value.</li>
         * <li>DESC: Descending order.</li>
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
         * <p>Specifies the starting position of the query. Default value: 1.</p>
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
        public ListFileSystemsRequest build() {
            return new ListFileSystemsRequest(this);
        } 

    } 

}
