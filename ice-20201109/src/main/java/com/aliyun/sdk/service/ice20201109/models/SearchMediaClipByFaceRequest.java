// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchMediaClipByFaceRequest} extends {@link RequestModel}
 *
 * <p>SearchMediaClipByFaceRequest</p>
 */
public class SearchMediaClipByFaceRequest extends Request {
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
    @NameInMap("MediaId")
    @Validation(required = true)
    private String mediaId;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private SearchMediaClipByFaceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.entityId = builder.entityId;
        this.faceSearchToken = builder.faceSearchToken;
        this.mediaId = builder.mediaId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchMediaClipByFaceRequest create() {
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
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
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

    public static final class Builder extends Request.Builder<SearchMediaClipByFaceRequest, Builder> {
        private String regionId; 
        private String entityId; 
        private String faceSearchToken; 
        private String mediaId; 
        private Integer pageNo; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(SearchMediaClipByFaceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.entityId = request.entityId;
            this.faceSearchToken = request.faceSearchToken;
            this.mediaId = request.mediaId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
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
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
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

        @Override
        public SearchMediaClipByFaceRequest build() {
            return new SearchMediaClipByFaceRequest(this);
        } 

    } 

}
