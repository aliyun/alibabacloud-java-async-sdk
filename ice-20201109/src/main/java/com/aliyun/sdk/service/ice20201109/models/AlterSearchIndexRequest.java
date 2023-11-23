// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AlterSearchIndexRequest} extends {@link RequestModel}
 *
 * <p>AlterSearchIndexRequest</p>
 */
public class AlterSearchIndexRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("IndexConfig")
    private String indexConfig;

    @Query
    @NameInMap("IndexStatus")
    private String indexStatus;

    @Query
    @NameInMap("IndexType")
    @Validation(required = true)
    private String indexType;

    @Query
    @NameInMap("SearchLibName")
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
         * IndexType.
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
        public AlterSearchIndexRequest build() {
            return new AlterSearchIndexRequest(this);
        } 

    } 

}
