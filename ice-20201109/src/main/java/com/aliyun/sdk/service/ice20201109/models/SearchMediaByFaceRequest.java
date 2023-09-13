// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchMediaByFaceRequest} extends {@link RequestModel}
 *
 * <p>SearchMediaByFaceRequest</p>
 */
public class SearchMediaByFaceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("EntityId")
    private String entityId;

    @Query
    @NameInMap("FaceSearchToken")
    @Validation(required = true)
    private String faceSearchToken;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("PersonImageUrl")
    @Validation(required = true)
    private String personImageUrl;

    private SearchMediaByFaceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.entityId = builder.entityId;
        this.faceSearchToken = builder.faceSearchToken;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.personImageUrl = builder.personImageUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchMediaByFaceRequest create() {
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
     * @return entityId
     */
    public String getEntityId() {
        return this.entityId;
    }

    /**
     * @return faceSearchToken
     */
    public String getFaceSearchToken() {
        return this.faceSearchToken;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return personImageUrl
     */
    public String getPersonImageUrl() {
        return this.personImageUrl;
    }

    public static final class Builder extends Request.Builder<SearchMediaByFaceRequest, Builder> {
        private String regionId; 
        private String entityId; 
        private String faceSearchToken; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String personImageUrl; 

        private Builder() {
            super();
        } 

        private Builder(SearchMediaByFaceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.entityId = request.entityId;
            this.faceSearchToken = request.faceSearchToken;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.personImageUrl = request.personImageUrl;
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
         * EntityId.
         */
        public Builder entityId(String entityId) {
            this.putQueryParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * FaceSearchToken.
         */
        public Builder faceSearchToken(String faceSearchToken) {
            this.putQueryParameter("FaceSearchToken", faceSearchToken);
            this.faceSearchToken = faceSearchToken;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PersonImageUrl.
         */
        public Builder personImageUrl(String personImageUrl) {
            this.putQueryParameter("PersonImageUrl", personImageUrl);
            this.personImageUrl = personImageUrl;
            return this;
        }

        @Override
        public SearchMediaByFaceRequest build() {
            return new SearchMediaByFaceRequest(this);
        } 

    } 

}
