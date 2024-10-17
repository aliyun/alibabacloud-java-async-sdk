// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SearchIndexJobRerunRequest} extends {@link RequestModel}
 *
 * <p>SearchIndexJobRerunRequest</p>
 */
public class SearchIndexJobRerunRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchLibName")
    private String searchLibName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Task")
    private String task;

    private SearchIndexJobRerunRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.mediaIds = builder.mediaIds;
        this.searchLibName = builder.searchLibName;
        this.task = builder.task;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchIndexJobRerunRequest create() {
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
     * @return mediaIds
     */
    public String getMediaIds() {
        return this.mediaIds;
    }

    /**
     * @return searchLibName
     */
    public String getSearchLibName() {
        return this.searchLibName;
    }

    /**
     * @return task
     */
    public String getTask() {
        return this.task;
    }

    public static final class Builder extends Request.Builder<SearchIndexJobRerunRequest, Builder> {
        private String regionId; 
        private String mediaIds; 
        private String searchLibName; 
        private String task; 

        private Builder() {
            super();
        } 

        private Builder(SearchIndexJobRerunRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.mediaIds = request.mediaIds;
            this.searchLibName = request.searchLibName;
            this.task = request.task;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>b48fb04483915d4f2cd8</strong></strong></strong>,<strong><strong><strong>c48fb37407365d4f2cd8</strong></strong></strong></p>
         */
        public Builder mediaIds(String mediaIds) {
            this.putQueryParameter("MediaIds", mediaIds);
            this.mediaIds = mediaIds;
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

        /**
         * Task.
         */
        public Builder task(String task) {
            this.putQueryParameter("Task", task);
            this.task = task;
            return this;
        }

        @Override
        public SearchIndexJobRerunRequest build() {
            return new SearchIndexJobRerunRequest(this);
        } 

    } 

}
