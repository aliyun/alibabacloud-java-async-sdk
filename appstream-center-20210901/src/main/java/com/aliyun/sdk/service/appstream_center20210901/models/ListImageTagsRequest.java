// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListImageTagsRequest} extends {@link RequestModel}
 *
 * <p>ListImageTagsRequest</p>
 */
public class ListImageTagsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    private ListImageTagsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.category = builder.category;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImageTagsRequest create() {
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
     * @return category
     */
    public String getCategory() {
        return this.category;
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

    public static final class Builder extends Request.Builder<ListImageTagsRequest, Builder> {
        private String regionId; 
        private String category; 
        private Integer maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListImageTagsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.category = request.category;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
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
         * <p>The tag categorization to query.</p>
         * 
         * <strong>example:</strong>
         * <p>Gpu</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>A compatibility field. The current version does not use this field to specify the number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token used to determine whether the next query is available. This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kEmoGlTNe3ekUrwnesWV1Vn+tWdc+4WoaoMP/kUNF7Gg==</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListImageTagsRequest build() {
            return new ListImageTagsRequest(this);
        } 

    } 

}
