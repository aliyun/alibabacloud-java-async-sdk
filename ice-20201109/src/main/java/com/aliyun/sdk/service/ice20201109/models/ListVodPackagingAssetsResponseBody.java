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
 * {@link ListVodPackagingAssetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVodPackagingAssetsResponseBody</p>
 */
public class ListVodPackagingAssetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Assets")
    private java.util.List<Assets> assets;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListVodPackagingAssetsResponseBody(Builder builder) {
        this.assets = builder.assets;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.sortBy = builder.sortBy;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVodPackagingAssetsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assets
     */
    public java.util.List<Assets> getAssets() {
        return this.assets;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Assets> assets; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private String sortBy; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListVodPackagingAssetsResponseBody model) {
            this.assets = model.assets;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.sortBy = model.sortBy;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The VOD packaging assets.</p>
         */
        public Builder assets(java.util.List<Assets> assets) {
            this.assets = assets;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The sorting order of the assets based on the time when they were ingested. Valid values:</p>
         * <ul>
         * <li>desc: descending order.</li>
         * <li>asc: ascending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder sortBy(String sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListVodPackagingAssetsResponseBody build() {
            return new ListVodPackagingAssetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVodPackagingAssetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVodPackagingAssetsResponseBody</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Input(Builder builder) {
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private String type; 

            private Builder() {
            } 

            private Builder(Input model) {
                this.media = model.media;
                this.type = model.type;
            } 

            /**
             * <p>The URL of the media file. Only M3U8 files stored in OSS are supported.</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The input type. Only Object Storage Service (OSS) is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVodPackagingAssetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVodPackagingAssetsResponseBody</p>
     */
    public static class Assets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetName")
        private String assetName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Input")
        private Input input;

        private Assets(Builder builder) {
            this.assetName = builder.assetName;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.groupName = builder.groupName;
            this.input = builder.input;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Assets create() {
            return builder().build();
        }

        /**
         * @return assetName
         */
        public String getAssetName() {
            return this.assetName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return input
         */
        public Input getInput() {
            return this.input;
        }

        public static final class Builder {
            private String assetName; 
            private String createTime; 
            private String description; 
            private String groupName; 
            private Input input; 

            private Builder() {
            } 

            private Builder(Assets model) {
                this.assetName = model.assetName;
                this.createTime = model.createTime;
                this.description = model.description;
                this.groupName = model.groupName;
                this.input = model.input;
            } 

            /**
             * <p>The name of the VOD packaging asset.</p>
             * 
             * <strong>example:</strong>
             * <p>30min_movie</p>
             */
            public Builder assetName(String assetName) {
                this.assetName = assetName;
                return this;
            }

            /**
             * <p>The time when the asset was ingested. It follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-21T06:45:32Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The asset description.</p>
             * 
             * <strong>example:</strong>
             * <p>movie 30min</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the packaging group.</p>
             * 
             * <strong>example:</strong>
             * <p>vod_hls</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The asset input configurations.</p>
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            public Assets build() {
                return new Assets(this);
            } 

        } 

    }
}
