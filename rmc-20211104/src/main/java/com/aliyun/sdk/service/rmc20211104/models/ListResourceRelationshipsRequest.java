// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rmc20211104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceRelationshipsRequest} extends {@link RequestModel}
 *
 * <p>ListResourceRelationshipsRequest</p>
 */
public class ListResourceRelationshipsRequest extends Request {
    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("SourceRegionId")
    @Validation(required = true)
    private String sourceRegionId;

    @Query
    @NameInMap("SourceResourceId")
    @Validation(required = true)
    private java.util.List < String > sourceResourceId;

    @Query
    @NameInMap("SourceResourceType")
    @Validation(required = true)
    private String sourceResourceType;

    @Query
    @NameInMap("TargetResourceType")
    private java.util.List < String > targetResourceType;

    private ListResourceRelationshipsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.sourceRegionId = builder.sourceRegionId;
        this.sourceResourceId = builder.sourceResourceId;
        this.sourceResourceType = builder.sourceResourceType;
        this.targetResourceType = builder.targetResourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceRelationshipsRequest create() {
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
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return sourceResourceId
     */
    public java.util.List < String > getSourceResourceId() {
        return this.sourceResourceId;
    }

    /**
     * @return sourceResourceType
     */
    public String getSourceResourceType() {
        return this.sourceResourceType;
    }

    /**
     * @return targetResourceType
     */
    public java.util.List < String > getTargetResourceType() {
        return this.targetResourceType;
    }

    public static final class Builder extends Request.Builder<ListResourceRelationshipsRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String sourceRegionId; 
        private java.util.List < String > sourceResourceId; 
        private String sourceResourceType; 
        private java.util.List < String > targetResourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceRelationshipsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.sourceRegionId = request.sourceRegionId;
            this.sourceResourceId = request.sourceResourceId;
            this.sourceResourceType = request.sourceResourceType;
            this.targetResourceType = request.targetResourceType;
        } 

        /**
         * The maximum number of entries to return on each page.
         * <p>
         * 
         * Valid values: 1 to 100.
         * 
         * Default value: 20.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is used to initiate the next request.
         * <p>
         * 
         * If the total number of entries returned for the current request exceeds the value of the `MaxResults` parameter, the entries are truncated. In this case, you can use the token to initiate another request and obtain the remaining entries.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The region ID of the resource whose associated resources you want to query.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putQueryParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * The IDs of the resource whose associated resources you want to query.
         * <p>
         * 
         * You can specify a maximum of 10 resource IDs.
         */
        public Builder sourceResourceId(java.util.List < String > sourceResourceId) {
            this.putQueryParameter("SourceResourceId", sourceResourceId);
            this.sourceResourceId = sourceResourceId;
            return this;
        }

        /**
         * The type of the resource whose associated resources you want to query.
         */
        public Builder sourceResourceType(String sourceResourceType) {
            this.putQueryParameter("SourceResourceType", sourceResourceType);
            this.sourceResourceType = sourceResourceType;
            return this;
        }

        /**
         * The types of the associated resources that you want to query.
         * <p>
         * 
         * You can specify a maximum of 10 resource types.
         */
        public Builder targetResourceType(java.util.List < String > targetResourceType) {
            this.putQueryParameter("TargetResourceType", targetResourceType);
            this.targetResourceType = targetResourceType;
            return this;
        }

        @Override
        public ListResourceRelationshipsRequest build() {
            return new ListResourceRelationshipsRequest(this);
        } 

    } 

}
