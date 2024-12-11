// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListInstancePackageStatesRequest} extends {@link RequestModel}
 *
 * <p>ListInstancePackageStatesRequest</p>
 */
public class ListInstancePackageStatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateNames")
    private String templateNames;

    private ListInstancePackageStatesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.templateNames = builder.templateNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancePackageStatesRequest create() {
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
     * @return templateNames
     */
    public String getTemplateNames() {
        return this.templateNames;
    }

    public static final class Builder extends Request.Builder<ListInstancePackageStatesRequest, Builder> {
        private String instanceId; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String templateNames; 

        private Builder() {
            super();
        } 

        private Builder(ListInstancePackageStatesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.templateNames = request.templateNames;
        } 

        /**
         * <p>ECS instance ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1cpoxxxwxxxxxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Page size.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>MTRBMDc0NjAtRUJFNy00N0NBLTk3NTctzxxxxxxx</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>List of extension names</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;template1&quot;,&quot;template2&quot;]</p>
         */
        public Builder templateNames(String templateNames) {
            this.putQueryParameter("TemplateNames", templateNames);
            this.templateNames = templateNames;
            return this;
        }

        @Override
        public ListInstancePackageStatesRequest build() {
            return new ListInstancePackageStatesRequest(this);
        } 

    } 

}
