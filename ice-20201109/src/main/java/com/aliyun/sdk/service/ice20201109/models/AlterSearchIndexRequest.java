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
 * {@link AlterSearchIndexRequest} extends {@link RequestModel}
 *
 * <p>AlterSearchIndexRequest</p>
 */
public class AlterSearchIndexRequest extends Request {
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

    private AlterSearchIndexRequest(Builder builder) {
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

    public static AlterSearchIndexRequest create() {
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

    public static final class Builder extends Request.Builder<AlterSearchIndexRequest, Builder> {
        private String regionId; 
        private String indexConfig; 
        private String indexStatus; 
        private String indexType; 
        private String searchLibName; 

        private Builder() {
            super();
        } 

        private Builder(AlterSearchIndexRequest request) {
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
         * <p>The configurations of the index.</p>
         * <blockquote>
         * <p> You must specify either IndexStatus or IndexConfig.</p>
         * </blockquote>
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
         * <p>The state of the index. Valid values:</p>
         * <ul>
         * <li>active (default): the index is enabled.</li>
         * <li>Deactive: the index is not enabled.</li>
         * </ul>
         * <blockquote>
         * <p> You must specify either IndexStatus or IndexConfig.</p>
         * </blockquote>
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
         * <p>The category of the index. Valid values:</p>
         * <ul>
         * <li>mm: large visual model.</li>
         * <li>face: face recognition.</li>
         * <li>aiLabel: smart tagging.</li>
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
         * <li>If you leave this parameter empty, the search index is created in the default search library of Intelligent Media Service (IMS). Default value: ims-default-search-lib.</li>
         * <li>To query information about an existing search library, call the <a href="https://help.aliyun.com/document_detail/2584455.html">QuerySearchLib</a> API operation.</li>
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
        public AlterSearchIndexRequest build() {
            return new AlterSearchIndexRequest(this);
        } 

    } 

}
