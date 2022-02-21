// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPatchBaselinesRequest} extends {@link RequestModel}
 *
 * <p>ListPatchBaselinesRequest</p>
 */
public class ListPatchBaselinesRequest extends Request {
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

    private ListPatchBaselinesRequest(Builder builder) {
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

    public static ListPatchBaselinesRequest create() {
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

    public static final class Builder extends Request.Builder<ListPatchBaselinesRequest, Builder> {
        private Integer maxResults; 
        private String name; 
        private String nextToken; 
        private String operationSystem; 
        private String regionId; 
        private String shareType; 

        private Builder() {
            super();
        } 

        private Builder(ListPatchBaselinesRequest response) {
            super(response);
            this.maxResults = response.maxResults;
            this.name = response.name;
            this.nextToken = response.nextToken;
            this.operationSystem = response.operationSystem;
            this.regionId = response.regionId;
            this.shareType = response.shareType;
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
        public ListPatchBaselinesRequest build() {
            return new ListPatchBaselinesRequest(this);
        } 

    } 

}
