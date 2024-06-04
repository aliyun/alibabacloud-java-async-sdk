// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagValuesRequest} extends {@link RequestModel}
 *
 * <p>ListTagValuesRequest</p>
 */
public class ListTagValuesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    private ListTagValuesRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagValuesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
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
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<ListTagValuesRequest, Builder> {
        private String key; 
        private String nextToken; 
        private String regionId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListTagValuesRequest request) {
            super(request);
            this.key = request.key;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.resourceType = request.resourceType;
        } 

        /**
         * The tag key.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The region in which the Web Application Firewall (WAF) instance is deployed. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou**: Chinese mainland.
         * *   **ap-southeast-1**: outside the Chinese mainland.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The type of the resource. Set the value to ALIYUN::WAF::DEFENSERESOURCE.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public ListTagValuesRequest build() {
            return new ListTagValuesRequest(this);
        } 

    } 

}
