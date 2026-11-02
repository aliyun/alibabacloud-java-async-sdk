// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link SearchMediaByFaceRequest} extends {@link RequestModel}
 *
 * <p>SearchMediaByFaceRequest</p>
 */
public class SearchMediaByFaceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomFilters")
    private String customFilters;

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
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UtcCreate")
    private String utcCreate;

    private SearchMediaByFaceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.customFilters = builder.customFilters;
        this.entityId = builder.entityId;
        this.faceSearchToken = builder.faceSearchToken;
        this.mediaType = builder.mediaType;
        this.namespace = builder.namespace;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.personImageUrl = builder.personImageUrl;
        this.searchLibName = builder.searchLibName;
        this.utcCreate = builder.utcCreate;
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
     * @return customFilters
     */
    public String getCustomFilters() {
        return this.customFilters;
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
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
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

    /**
     * @return utcCreate
     */
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public static final class Builder extends Request.Builder<SearchMediaByFaceRequest, Builder> {
        private String regionId; 
        private String customFilters; 
        private String entityId; 
        private String faceSearchToken; 
        private String mediaType; 
        private String namespace; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String personImageUrl; 
        private String searchLibName; 
        private String utcCreate; 

        private Builder() {
            super();
        } 

        private Builder(SearchMediaByFaceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.customFilters = request.customFilters;
            this.entityId = request.entityId;
            this.faceSearchToken = request.faceSearchToken;
            this.mediaType = request.mediaType;
            this.namespace = request.namespace;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.personImageUrl = request.personImageUrl;
            this.searchLibName = request.searchLibName;
            this.utcCreate = request.utcCreate;
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
         * <p>The custom filter. JSON string. Supported fields include integer field intField1 and string fields strField1 and strField2. Each field supports only one matching mode. Filters on different fields are combined with an AND relationship.</p>
         * <ul>
         * <li>Exact match, such as {&quot;intField1&quot;:12,&quot;strField1&quot;:&quot;abc&quot;}</li>
         * <li>Multi-value match, such as {&quot;intField1&quot;:[12,13],&quot;strField1&quot;:[&quot;abc&quot;,&quot;cd&quot;]}</li>
         * <li>Range match, such as {&quot;intField1&quot;:{&quot;gte&quot;:12,&quot;lte&quot;:13}}</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;intField1&quot;:{&quot;gte&quot;:12,&quot;lte&quot;:13},&quot;strField2&quot;:[&quot;cd&quot;,&quot;de&quot;],&quot;strField1&quot;:&quot;abc&quot;}</p>
         */
        public Builder customFilters(String customFilters) {
            this.putQueryParameter("CustomFilters", customFilters);
            this.customFilters = customFilters;
            return this;
        }

        /**
         * <p>The entity ID.</p>
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
         * <p>The token used to identify paginated results under the same search condition. Use this parameter together with the FaceSearchToken parameter in the <a href="https://help.aliyun.com/document_detail/612891.html">refined search operation</a>.</p>
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
         * <p>The media asset type. Valid values:</p>
         * <ul>
         * <li>image: image</li>
         * <li>video: video</li>
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
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>name-1</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
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

        /**
         * <p>The creation time, in millisecond-precision timestamp. gte specifies greater than or equal to, and lte specifies less than or equal to.</p>
         * <ul>
         * <li>Range, such as {&quot;gte&quot;:1761205662998,&quot;lte&quot;:1771205662998}</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;gte&quot;:1761205662998,&quot;lte&quot;:1771205662998}</p>
         */
        public Builder utcCreate(String utcCreate) {
            this.putQueryParameter("UtcCreate", utcCreate);
            this.utcCreate = utcCreate;
            return this;
        }

        @Override
        public SearchMediaByFaceRequest build() {
            return new SearchMediaByFaceRequest(this);
        } 

    } 

}
