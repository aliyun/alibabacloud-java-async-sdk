// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPublicPatchBaselinesRequest} extends {@link RequestModel}
 *
 * <p>ListPublicPatchBaselinesRequest</p>
 */
public class ListPublicPatchBaselinesRequest extends Request {
    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OperationSystem")
    private String operationSystem;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ShareType")
    private String shareType;

    private ListPublicPatchBaselinesRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.operationSystem = builder.operationSystem;
        this.regionId = builder.regionId;
        this.shareType = builder.shareType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPublicPatchBaselinesRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return operationSystem
     */
    public String getOperationSystem() {
        return this.operationSystem;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return shareType
     */
    public String getShareType() {
        return this.shareType;
    }

    public static final class Builder extends Request.Builder<ListPublicPatchBaselinesRequest, Builder> {
        private Integer maxResults; 
        private String name; 
        private String nextToken; 
        private String operationSystem; 
        private String regionId; 
        private String shareType; 

        private Builder() {
            super();
        } 

        private Builder(ListPublicPatchBaselinesRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.name = request.name;
            this.nextToken = request.nextToken;
            this.operationSystem = request.operationSystem;
            this.regionId = request.regionId;
            this.shareType = request.shareType;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * OperationSystem.
         */
        public Builder operationSystem(String operationSystem) {
            this.putQueryParameter("OperationSystem", operationSystem);
            this.operationSystem = operationSystem;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ShareType.
         */
        public Builder shareType(String shareType) {
            this.putQueryParameter("ShareType", shareType);
            this.shareType = shareType;
            return this;
        }

        @Override
        public ListPublicPatchBaselinesRequest build() {
            return new ListPublicPatchBaselinesRequest(this);
        } 

    } 

}
