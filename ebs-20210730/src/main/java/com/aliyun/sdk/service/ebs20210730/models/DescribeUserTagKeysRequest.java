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
 * {@link DescribeUserTagKeysRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserTagKeysRequest</p>
 */
public class DescribeUserTagKeysRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("TagFilterKey")
    private String tagFilterKey;

    private DescribeUserTagKeysRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.tagFilterKey = builder.tagFilterKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserTagKeysRequest create() {
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
     * @return tagFilterKey
     */
    public String getTagFilterKey() {
        return this.tagFilterKey;
    }

    public static final class Builder extends Request.Builder<DescribeUserTagKeysRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String tagFilterKey; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserTagKeysRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.tagFilterKey = request.tagFilterKey;
        } 

        /**
         * <p>Number of items per page in paginated queries. The maximum value is 100.</p>
         * <p>Default value:</p>
         * <ul>
         * <li><p>If no value is set or the set value is less than 10, the default is 10.</p>
         * </li>
         * <li><p>If the set value is greater than 100, the default is 100.</p>
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
         * <p>The query token returned by this call (Token).</p>
         * 
         * <strong>example:</strong>
         * <p>f07b150eadfa1d7a</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the region to which the resource belongs. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to view the latest list of Alibaba Cloud regions.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The tagKey for filtering the query.</p>
         * 
         * <strong>example:</strong>
         * <p>tagKey</p>
         */
        public Builder tagFilterKey(String tagFilterKey) {
            this.putBodyParameter("TagFilterKey", tagFilterKey);
            this.tagFilterKey = tagFilterKey;
            return this;
        }

        @Override
        public DescribeUserTagKeysRequest build() {
            return new DescribeUserTagKeysRequest(this);
        } 

    } 

}
