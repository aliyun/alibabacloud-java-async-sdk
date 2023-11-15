// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserGroupsMappingsRequest} extends {@link RequestModel}
 *
 * <p>ListUserGroupsMappingsRequest</p>
 */
public class ListUserGroupsMappingsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("FilesystemId")
    @Validation(required = true)
    private String filesystemId;

    @Query
    @NameInMap("InputRegionId")
    @Validation(required = true)
    private String inputRegionId;

    @Query
    @NameInMap("Limit")
    private Integer limit;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    private ListUserGroupsMappingsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.filesystemId = builder.filesystemId;
        this.inputRegionId = builder.inputRegionId;
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserGroupsMappingsRequest create() {
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
     * @return filesystemId
     */
    public String getFilesystemId() {
        return this.filesystemId;
    }

    /**
     * @return inputRegionId
     */
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListUserGroupsMappingsRequest, Builder> {
        private String regionId; 
        private String filesystemId; 
        private String inputRegionId; 
        private Integer limit; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListUserGroupsMappingsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.filesystemId = request.filesystemId;
            this.inputRegionId = request.inputRegionId;
            this.limit = request.limit;
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
         * FilesystemId.
         */
        public Builder filesystemId(String filesystemId) {
            this.putQueryParameter("FilesystemId", filesystemId);
            this.filesystemId = filesystemId;
            return this;
        }

        /**
         * InputRegionId.
         */
        public Builder inputRegionId(String inputRegionId) {
            this.putQueryParameter("InputRegionId", inputRegionId);
            this.inputRegionId = inputRegionId;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
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

        @Override
        public ListUserGroupsMappingsRequest build() {
            return new ListUserGroupsMappingsRequest(this);
        } 

    } 

}
