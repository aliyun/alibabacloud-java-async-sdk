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
 * {@link QueryMediaIndexJobRequest} extends {@link RequestModel}
 *
 * <p>QueryMediaIndexJobRequest</p>
 */
public class QueryMediaIndexJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchLibName")
    private String searchLibName;

    private QueryMediaIndexJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.mediaId = builder.mediaId;
        this.searchLibName = builder.searchLibName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMediaIndexJobRequest create() {
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
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return searchLibName
     */
    public String getSearchLibName() {
        return this.searchLibName;
    }

    public static final class Builder extends Request.Builder<QueryMediaIndexJobRequest, Builder> {
        private String regionId; 
        private String mediaId; 
        private String searchLibName; 

        private Builder() {
            super();
        } 

        private Builder(QueryMediaIndexJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.mediaId = request.mediaId;
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
         * <p>The ID of the media asset.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c2e77390f75271ec802f0674a2ce6***</p>
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The name of the search library. Default value: ims-default-search-lib.</p>
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
        public QueryMediaIndexJobRequest build() {
            return new QueryMediaIndexJobRequest(this);
        } 

    } 

}
