// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSearchIndexRequest} extends {@link RequestModel}
 *
 * <p>CreateSearchIndexRequest</p>
 */
public class CreateSearchIndexRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

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

    private CreateSearchIndexRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
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
        private String indexStatus; 
        private String indexType; 
        private String searchLibName; 

        private Builder() {
            super();
        } 

        private Builder(CreateSearchIndexRequest request) {
            super(request);
            this.regionId = request.regionId;
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
        public CreateSearchIndexRequest build() {
            return new CreateSearchIndexRequest(this);
        } 

    } 

}
