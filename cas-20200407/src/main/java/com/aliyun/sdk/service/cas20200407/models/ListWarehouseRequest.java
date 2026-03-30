// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link ListWarehouseRequest} extends {@link RequestModel}
 *
 * <p>ListWarehouseRequest</p>
 */
public class ListWarehouseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WarehouseInstanceIds")
    private java.util.List<String> warehouseInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WarehouseTypes")
    private java.util.List<String> warehouseTypes;

    private ListWarehouseRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.warehouseInstanceIds = builder.warehouseInstanceIds;
        this.warehouseTypes = builder.warehouseTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWarehouseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return warehouseInstanceIds
     */
    public java.util.List<String> getWarehouseInstanceIds() {
        return this.warehouseInstanceIds;
    }

    /**
     * @return warehouseTypes
     */
    public java.util.List<String> getWarehouseTypes() {
        return this.warehouseTypes;
    }

    public static final class Builder extends Request.Builder<ListWarehouseRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<String> warehouseInstanceIds; 
        private java.util.List<String> warehouseTypes; 

        private Builder() {
            super();
        } 

        private Builder(ListWarehouseRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.warehouseInstanceIds = request.warehouseInstanceIds;
            this.warehouseTypes = request.warehouseTypes;
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
         * WarehouseInstanceIds.
         */
        public Builder warehouseInstanceIds(java.util.List<String> warehouseInstanceIds) {
            String warehouseInstanceIdsShrink = shrink(warehouseInstanceIds, "WarehouseInstanceIds", "json");
            this.putQueryParameter("WarehouseInstanceIds", warehouseInstanceIdsShrink);
            this.warehouseInstanceIds = warehouseInstanceIds;
            return this;
        }

        /**
         * WarehouseTypes.
         */
        public Builder warehouseTypes(java.util.List<String> warehouseTypes) {
            String warehouseTypesShrink = shrink(warehouseTypes, "WarehouseTypes", "json");
            this.putQueryParameter("WarehouseTypes", warehouseTypesShrink);
            this.warehouseTypes = warehouseTypes;
            return this;
        }

        @Override
        public ListWarehouseRequest build() {
            return new ListWarehouseRequest(this);
        } 

    } 

}
