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
 * {@link SearchPublicMediaInfoRequest} extends {@link RequestModel}
 *
 * <p>SearchPublicMediaInfoRequest</p>
 */
public class SearchPublicMediaInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Authorized")
    private Boolean authorized;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DynamicMetaDataMatchFields")
    private String dynamicMetaDataMatchFields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityId")
    private String entityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Favorite")
    private Boolean favorite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaIds")
    private String mediaIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    private SearchPublicMediaInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.authorized = builder.authorized;
        this.dynamicMetaDataMatchFields = builder.dynamicMetaDataMatchFields;
        this.entityId = builder.entityId;
        this.favorite = builder.favorite;
        this.mediaIds = builder.mediaIds;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchPublicMediaInfoRequest create() {
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
     * @return authorized
     */
    public Boolean getAuthorized() {
        return this.authorized;
    }

    /**
     * @return dynamicMetaDataMatchFields
     */
    public String getDynamicMetaDataMatchFields() {
        return this.dynamicMetaDataMatchFields;
    }

    /**
     * @return entityId
     */
    public String getEntityId() {
        return this.entityId;
    }

    /**
     * @return favorite
     */
    public Boolean getFavorite() {
        return this.favorite;
    }

    /**
     * @return mediaIds
     */
    public String getMediaIds() {
        return this.mediaIds;
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
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    public static final class Builder extends Request.Builder<SearchPublicMediaInfoRequest, Builder> {
        private String regionId; 
        private Boolean authorized; 
        private String dynamicMetaDataMatchFields; 
        private String entityId; 
        private Boolean favorite; 
        private String mediaIds; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String sortBy; 

        private Builder() {
            super();
        } 

        private Builder(SearchPublicMediaInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.authorized = request.authorized;
            this.dynamicMetaDataMatchFields = request.dynamicMetaDataMatchFields;
            this.entityId = request.entityId;
            this.favorite = request.favorite;
            this.mediaIds = request.mediaIds;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
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
         * <p>Specifies whether the user has purchased a resource plan that includes the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder authorized(Boolean authorized) {
            this.putQueryParameter("Authorized", authorized);
            this.authorized = authorized;
            return this;
        }

        /**
         * <p>The matching conditions for dynamic metadata search.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;ApprovalStatus=\&quot;Available\&quot;&amp;MaterialBags=\&quot;boutiquemusic\&quot;&amp;Mood=\&quot;Nervous\&quot;&quot;</p>
         */
        public Builder dynamicMetaDataMatchFields(String dynamicMetaDataMatchFields) {
            this.putQueryParameter("DynamicMetaDataMatchFields", dynamicMetaDataMatchFields);
            this.dynamicMetaDataMatchFields = dynamicMetaDataMatchFields;
            return this;
        }

        /**
         * <p>The entity ID, which is used to identify different types of public copyright media assets. Valid values:</p>
         * <ul>
         * <li>Copyright_Music: public copyright music.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Copyright_Music</p>
         */
        public Builder entityId(String entityId) {
            this.putQueryParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * <p>Specifies whether the user has added the media asset to their favorites.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder favorite(Boolean favorite) {
            this.putQueryParameter("Favorite", favorite);
            this.favorite = favorite;
            return this;
        }

        /**
         * <p>The IDs of the IMS media assets. Separate multiple IDs with commas.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong>,<strong><strong>15d4a4b0448391508f2cb486</strong></strong></p>
         */
        public Builder mediaIds(String mediaIds) {
            this.putQueryParameter("MediaIds", mediaIds);
            this.mediaIds = mediaIds;
            return this;
        }

        /**
         * <p>The page number.</p>
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
         * <p>The number of entries per page.</p>
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
         * <p>The sorting method for the results. Format: <field>:<order>. Valid values:</p>
         * <p>field:</p>
         * <ul>
         * <li>UsageCount: usage count.</li>
         * <li>UnitPrice: unit price.</li>
         * </ul>
         * <p>order:</p>
         * <ul>
         * <li>Desc: descending order.</li>
         * <li>Asc: ascending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UsageCount:Desc,UnitPrice:Asc</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        @Override
        public SearchPublicMediaInfoRequest build() {
            return new SearchPublicMediaInfoRequest(this);
        } 

    } 

}
