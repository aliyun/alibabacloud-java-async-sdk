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
         * <p>The index configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder indexConfig(String indexConfig) {
            this.putQueryParameter("IndexConfig", indexConfig);
            this.indexConfig = indexConfig;
            return this;
        }

        /**
         * <p>The index status. Default value: Active. Valid values:</p>
         * <ul>
         * <li>Active: activated.</li>
         * <li>Deactive: deactivated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder indexStatus(String indexStatus) {
            this.putQueryParameter("IndexStatus", indexStatus);
            this.indexStatus = indexStatus;
            return this;
        }

        /**
         * <p>The index type. Valid values:</p>
         * <ul>
         * <li>mm: large model visual state. Used to describe complex visual features and actions in videos. This type helps identify and search for specific actions, movements, and events in videos, such as a soccer player scoring a goal or a basketball player getting injured.<blockquote>
         * <p>The shared instance type supports up to 1,000 hours of video. After the limit is exceeded, the system no longer performs large model visual state analysis.</p>
         * </blockquote>
         * </li>
         * <li>face: automatic face recognition. Used to describe facial features in videos. Through face recognition technology, faces in videos can be automatically tagged and searched.<blockquote>
         * <p>The shared instance type supports up to 1,000,000 face analyses. After the limit is exceeded, the system no longer performs face analysis.</p>
         * </blockquote>
         * </li>
         * <li>aiLabel: intelligent tagging. The intelligent tagging index type is used to describe subtitles, speech, and other content in videos. Through text and speech recognition technology, language information such as subtitles and dialogues in videos can be automatically extracted for tagging and searching. This helps users quickly search for and locate content related to specific topics or keywords in videos.</li>
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
         * <p>The name of the search library.</p>
         * <ul>
         * <li>If you do not specify a search library name, the search index is created in the default IMS search library. Default value: ims-default-search-lib.</li>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/2584455.html">QuerySearchLib</a> operation to query information about existing search libraries.</li>
         * </ul>
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
        public CreateSearchIndexRequest build() {
            return new CreateSearchIndexRequest(this);
        } 

    } 

}
