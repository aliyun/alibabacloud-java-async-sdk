// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SearchMediaByFaceRequest} extends {@link RequestModel}
 *
 * <p>SearchMediaByFaceRequest</p>
 */
public class SearchMediaByFaceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityId")
    private String entityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaceSearchToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String faceSearchToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaType")
    private String mediaType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PersonImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String personImageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchLibName")
    private String searchLibName;

    private SearchMediaByFaceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.entityId = builder.entityId;
        this.faceSearchToken = builder.faceSearchToken;
        this.mediaType = builder.mediaType;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.personImageUrl = builder.personImageUrl;
        this.searchLibName = builder.searchLibName;
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
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
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

    /**
     * @return searchLibName
     */
    public String getSearchLibName() {
        return this.searchLibName;
    }

    public static final class Builder extends Request.Builder<SearchMediaByFaceRequest, Builder> {
        private String regionId; 
        private String entityId; 
        private String faceSearchToken; 
        private String mediaType; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String personImageUrl; 
        private String searchLibName; 

        private Builder() {
            super();
        } 

        private Builder(SearchMediaByFaceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.entityId = request.entityId;
            this.faceSearchToken = request.faceSearchToken;
            this.mediaType = request.mediaType;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.personImageUrl = request.personImageUrl;
            this.searchLibName = request.searchLibName;
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
         * <p>The ID of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>2d3bf1e35a1e42b5ab338d701efa****</p>
         */
        public Builder entityId(String entityId) {
            this.putQueryParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * <p>The token that is used to identify the query. You can use this parameter in the SearchMediaClipByFace operation to specify the same query conditions.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>zxtest-huangxuan-2023-3-7-V1</p>
         */
        public Builder faceSearchToken(String faceSearchToken) {
            this.putQueryParameter("FaceSearchToken", faceSearchToken);
            this.faceSearchToken = faceSearchToken;
            return this;
        }

        /**
         * <p>The type of the media asset. Valid values:</p>
         * <ul>
         * <li>image</li>
         * <li>video</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        public Builder mediaType(String mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The URL of the face image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>https://<strong><strong>.oss-cn-shanghai.aliyuncs.com/input/huangxuan</strong></strong>.jpg</p>
         */
        public Builder personImageUrl(String personImageUrl) {
            this.putQueryParameter("PersonImageUrl", personImageUrl);
            this.personImageUrl = personImageUrl;
            return this;
        }

        /**
         * <p>The name of the search library.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder searchLibName(String searchLibName) {
            this.putQueryParameter("SearchLibName", searchLibName);
            this.searchLibName = searchLibName;
            return this;
        }

        @Override
        public SearchMediaByFaceRequest build() {
            return new SearchMediaByFaceRequest(this);
        } 

    } 

}
