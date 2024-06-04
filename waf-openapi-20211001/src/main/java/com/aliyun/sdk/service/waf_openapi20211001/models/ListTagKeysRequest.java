// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagKeysRequest} extends {@link RequestModel}
 *
 * <p>ListTagKeysRequest</p>
 */
public class ListTagKeysRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

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

    private ListTagKeysRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagKeysRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder<ListTagKeysRequest, Builder> {
        private String instanceId; 
        private String nextToken; 
        private String regionId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListTagKeysRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.resourceType = request.resourceType;
        } 

        /**
         * The ID of the WAF instance.
         * <p>
         * 
         * >  You can call the [DescribeInstance](~~433756~~) operation to query the ID of the WAF instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
        public ListTagKeysRequest build() {
            return new ListTagKeysRequest(this);
        } 

    } 

}
