// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListAssetDirectoriesRequest} extends {@link RequestModel}
 *
 * <p>ListAssetDirectoriesRequest</p>
 */
public class ListAssetDirectoriesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private ListQuery listQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private ListAssetDirectoriesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssetDirectoriesRequest create() {
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
     * @return listQuery
     */
    public ListQuery getListQuery() {
        return this.listQuery;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    public static final class Builder extends Request.Builder<ListAssetDirectoriesRequest, Builder> {
        private String regionId; 
        private ListQuery listQuery; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(ListAssetDirectoriesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.listQuery = request.listQuery;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
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
         */
        public Builder listQuery(ListQuery listQuery) {
            String listQueryShrink = shrink(listQuery, "ListQuery", "json");
            this.putBodyParameter("ListQuery", listQueryShrink);
            this.listQuery = listQuery;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        @Override
        public ListAssetDirectoriesRequest build() {
            return new ListAssetDirectoriesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListAssetDirectoriesRequest} extends {@link TeaModel}
     *
     * <p>ListAssetDirectoriesRequest</p>
     */
    public static class ListQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Keyword")
        private String keyword;

        @com.aliyun.core.annotation.NameInMap("MaxLevel")
        private Integer maxLevel;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("ParentDirectoryId")
        private Long parentDirectoryId;

        @com.aliyun.core.annotation.NameInMap("TopicId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long topicId;

        private ListQuery(Builder builder) {
            this.keyword = builder.keyword;
            this.maxLevel = builder.maxLevel;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.parentDirectoryId = builder.parentDirectoryId;
            this.topicId = builder.topicId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListQuery create() {
            return builder().build();
        }

        /**
         * @return keyword
         */
        public String getKeyword() {
            return this.keyword;
        }

        /**
         * @return maxLevel
         */
        public Integer getMaxLevel() {
            return this.maxLevel;
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return parentDirectoryId
         */
        public Long getParentDirectoryId() {
            return this.parentDirectoryId;
        }

        /**
         * @return topicId
         */
        public Long getTopicId() {
            return this.topicId;
        }

        public static final class Builder {
            private String keyword; 
            private Integer maxLevel; 
            private Integer page; 
            private Integer pageSize; 
            private Long parentDirectoryId; 
            private Long topicId; 

            private Builder() {
            } 

            private Builder(ListQuery model) {
                this.keyword = model.keyword;
                this.maxLevel = model.maxLevel;
                this.page = model.page;
                this.pageSize = model.pageSize;
                this.parentDirectoryId = model.parentDirectoryId;
                this.topicId = model.topicId;
            } 

            /**
             * Keyword.
             */
            public Builder keyword(String keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * MaxLevel.
             */
            public Builder maxLevel(Integer maxLevel) {
                this.maxLevel = maxLevel;
                return this;
            }

            /**
             * Page.
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * ParentDirectoryId.
             */
            public Builder parentDirectoryId(Long parentDirectoryId) {
                this.parentDirectoryId = parentDirectoryId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>796027234512</p>
             */
            public Builder topicId(Long topicId) {
                this.topicId = topicId;
                return this;
            }

            public ListQuery build() {
                return new ListQuery(this);
            } 

        } 

    }
}
