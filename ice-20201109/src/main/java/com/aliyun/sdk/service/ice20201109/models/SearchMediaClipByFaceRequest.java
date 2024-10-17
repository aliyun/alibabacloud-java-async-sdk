// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SearchMediaClipByFaceRequest} extends {@link RequestModel}
 *
 * <p>SearchMediaClipByFaceRequest</p>
 */
public class SearchMediaClipByFaceRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("MediaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchLibName")
    private String searchLibName;

    private SearchMediaClipByFaceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.entityId = builder.entityId;
        this.faceSearchToken = builder.faceSearchToken;
        this.mediaId = builder.mediaId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.searchLibName = builder.searchLibName;
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

    /**
     * @return searchLibName
     */
    public String getSearchLibName() {
        return this.searchLibName;
    }

    public static final class Builder extends Request.Builder<SearchMediaClipByFaceRequest, Builder> {
        private String regionId; 
        private String entityId; 
        private String faceSearchToken; 
        private String mediaId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String searchLibName; 

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
         * <p>The value of this parameter is the same as that of the FaceSearchToken parameter in the SearchMediaByFace request. This specifies to return media asset clips that meet the same query conditions.</p>
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
         * <p>The ID of the media asset.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3b187b3620c8490886cfc2a9578c****</p>
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
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
        public SearchMediaClipByFaceRequest build() {
            return new SearchMediaClipByFaceRequest(this);
        } 

    } 

}
