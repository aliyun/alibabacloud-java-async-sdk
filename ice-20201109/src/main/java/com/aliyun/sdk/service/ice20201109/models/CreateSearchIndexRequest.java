// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateSearchIndexRequest} extends {@link RequestModel}
 *
 * <p>CreateSearchIndexRequest</p>
 */
public class CreateSearchIndexRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IndexConfig")
    private String indexConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IndexStatus")
    private String indexStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IndexType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String indexType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchLibName")
    private String searchLibName;

    private CreateSearchIndexRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.indexConfig = builder.indexConfig;
        this.indexStatus = builder.indexStatus;
        this.indexType = builder.indexType;
        this.searchLibName = builder.searchLibName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSearchIndexRequest create() {
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
     * @return indexConfig
     */
    public String getIndexConfig() {
        return this.indexConfig;
    }

    /**
     * @return indexStatus
     */
    public String getIndexStatus() {
        return this.indexStatus;
    }

    /**
     * @return indexType
     */
    public String getIndexType() {
        return this.indexType;
    }

    /**
     * @return searchLibName
     */
    public String getSearchLibName() {
        return this.searchLibName;
    }

    public static final class Builder extends Request.Builder<CreateSearchIndexRequest, Builder> {
        private String regionId; 
        private String indexConfig; 
        private String indexStatus; 
        private String indexType; 
        private String searchLibName; 

        private Builder() {
            super();
        } 

        private Builder(CreateSearchIndexRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.indexConfig = request.indexConfig;
            this.indexStatus = request.indexStatus;
            this.indexType = request.indexType;
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
         * IndexConfig.
         */
        public Builder indexConfig(String indexConfig) {
            this.putQueryParameter("IndexConfig", indexConfig);
            this.indexConfig = indexConfig;
            return this;
        }

        /**
         * IndexStatus.
         */
        public Builder indexStatus(String indexStatus) {
            this.putQueryParameter("IndexStatus", indexStatus);
            this.indexStatus = indexStatus;
            return this;
        }

        /**
         * <p>The category of the index. Valid values:</p>
         * <ul>
         * <li>mm: large visual model. You can use this model to describe complex visual features and identify and search for specific actions, movements, and events in videos, such as when athletes score a goal or get injured.</li>
         * </ul>
         * <blockquote>
         * <p> This feature is in the public preview phase. You can use this feature for free for 1,000 hours of videos.</p>
         * </blockquote>
         * <ul>
         * <li>face: face recognition. You can use the face recognition technology to describe face characteristics and automatically mark or search for faces in videos.</li>
         * <li>aiLabel: smart tagging. The smart tagging category is used to describe content such as subtitles and audio in videos. You can use the speech recognition technology to automatically extract, mark, and search for subtitles and dialog content from videos. This helps you quickly locate the video content that is related to specific topics or keywords.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mm</p>
         */
        public Builder indexType(String indexType) {
            this.putQueryParameter("IndexType", indexType);
            this.indexType = indexType;
            return this;
        }

        /**
         * SearchLibName.
         */
        public Builder searchLibName(String searchLibName) {
            this.putQueryParameter("SearchLibName", searchLibName);
            this.searchLibName = searchLibName;
            return this;
        }

        @Override
        public CreateSearchIndexRequest build() {
            return new CreateSearchIndexRequest(this);
        } 

    } 

}
