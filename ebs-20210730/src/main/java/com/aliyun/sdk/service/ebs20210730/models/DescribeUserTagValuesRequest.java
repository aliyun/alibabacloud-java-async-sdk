// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link DescribeUserTagValuesRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserTagValuesRequest</p>
 */
public class DescribeUserTagValuesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagFilterValue")
    private String tagFilterValue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagKey")
    private String tagKey;

    private DescribeUserTagValuesRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.tagFilterValue = builder.tagFilterValue;
        this.tagKey = builder.tagKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserTagValuesRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tagFilterValue
     */
    public String getTagFilterValue() {
        return this.tagFilterValue;
    }

    /**
     * @return tagKey
     */
    public String getTagKey() {
        return this.tagKey;
    }

    public static final class Builder extends Request.Builder<DescribeUserTagValuesRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String tagFilterValue; 
        private String tagKey; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserTagValuesRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.tagFilterValue = request.tagFilterValue;
            this.tagKey = request.tagKey;
        } 

        /**
         * <p>Number of items per page in a paginated query. The maximum value is 100.</p>
         * <p>Default value:</p>
         * <ul>
         * <li><p>If no value is set or the set value is less than 10, the default value is 10.</p>
         * </li>
         * <li><p>If the set value is greater than 100, the default value is 100.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Query token (Token). The value should be the NextToken parameter value from the previous call to this interface. This parameter is not required for the initial call. If NextToken is set, the PageSize and PageNumber request parameters become invalid, and the TotalCount in the response data is also invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region ID of the consistency replication group.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Tag content filter</p>
         * 
         * <strong>example:</strong>
         * <p>keyValue</p>
         */
        public Builder tagFilterValue(String tagFilterValue) {
            this.putBodyParameter("TagFilterValue", tagFilterValue);
            this.tagFilterValue = tagFilterValue;
            return this;
        }

        /**
         * <p>Tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        public Builder tagKey(String tagKey) {
            this.putBodyParameter("TagKey", tagKey);
            this.tagKey = tagKey;
            return this;
        }

        @Override
        public DescribeUserTagValuesRequest build() {
            return new DescribeUserTagValuesRequest(this);
        } 

    } 

}
