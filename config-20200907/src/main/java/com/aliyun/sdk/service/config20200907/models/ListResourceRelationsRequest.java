// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link ListResourceRelationsRequest} extends {@link RequestModel}
 *
 * <p>ListResourceRelationsRequest</p>
 */
public class ListResourceRelationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelationType")
    private String relationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetResourceId")
    private String targetResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetResourceType")
    private String targetResourceType;

    private ListResourceRelationsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.region = builder.region;
        this.relationType = builder.relationType;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.targetResourceId = builder.targetResourceId;
        this.targetResourceType = builder.targetResourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceRelationsRequest create() {
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
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return relationType
     */
    public String getRelationType() {
        return this.relationType;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return targetResourceId
     */
    public String getTargetResourceId() {
        return this.targetResourceId;
    }

    /**
     * @return targetResourceType
     */
    public String getTargetResourceType() {
        return this.targetResourceType;
    }

    public static final class Builder extends Request.Builder<ListResourceRelationsRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String region; 
        private String relationType; 
        private String resourceId; 
        private String resourceType; 
        private String targetResourceId; 
        private String targetResourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceRelationsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.region = request.region;
            this.relationType = request.relationType;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
            this.targetResourceId = request.targetResourceId;
            this.targetResourceType = request.targetResourceType;
        } 

        /**
         * <p>The maximum number of entries to return for a single request. Valid values: 1 to 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
         * 
         * <strong>example:</strong>
         * <p>C2DjqMYSy0is7zSMGf21****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the region in which the resource resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The type of the relationship between the resource and the object.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>IsContained: The object is included as part of the resource.</li>
         * <li>IsAttachedTo: The object is added to the resource.</li>
         * <li>IsAssociatedIn: The object is associated with the resource.</li>
         * <li>Contains: The object contains the resource.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IsAttachedTo</p>
         */
        public Builder relationType(String relationType) {
            this.putQueryParameter("RelationType", relationType);
            this.relationType = relationType;
            return this;
        }

        /**
         * <p>The resource ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-j6cajg9yrfoh4sas****</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The type of the resource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The ID of the resource that is associated with the object.</p>
         * 
         * <strong>example:</strong>
         * <p>d-j6c8k731qbrc7fxi****</p>
         */
        public Builder targetResourceId(String targetResourceId) {
            this.putQueryParameter("TargetResourceId", targetResourceId);
            this.targetResourceId = targetResourceId;
            return this;
        }

        /**
         * <p>The type of the resource that is associated with the object.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Disk</p>
         */
        public Builder targetResourceType(String targetResourceType) {
            this.putQueryParameter("TargetResourceType", targetResourceType);
            this.targetResourceType = targetResourceType;
            return this;
        }

        @Override
        public ListResourceRelationsRequest build() {
            return new ListResourceRelationsRequest(this);
        } 

    } 

}
