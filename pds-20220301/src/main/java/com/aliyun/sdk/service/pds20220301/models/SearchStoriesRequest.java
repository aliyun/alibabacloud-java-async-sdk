// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link SearchStoriesRequest} extends {@link RequestModel}
 *
 * <p>SearchStoriesRequest</p>
 */
public class SearchStoriesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cover_image_thumbnail_process")
    @Deprecated
    private String coverImageThumbnailProcess;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cover_video_thumbnail_process")
    @Deprecated
    private String coverVideoThumbnailProcess;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("create_time_range")
    private CreateTimeRange createTimeRange;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("custom_labels")
    @Deprecated
    private String customLabels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("face_group_ids")
    private java.util.List<String> faceGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("limit")
    private Long limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("marker")
    private String marker;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order")
    private String order;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sort")
    private String sort;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("story_end_time_range")
    private StoryEndTimeRange storyEndTimeRange;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("story_id")
    private String storyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("story_name")
    private String storyName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("story_start_time_range")
    private StoryStartTimeRange storyStartTimeRange;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("story_type")
    private String storyType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("url_expire_sec")
    @Deprecated
    @com.aliyun.core.annotation.Validation(maximum = 86400, minimum = 10)
    private Long urlExpireSec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("with_empty_stories")
    private Boolean withEmptyStories;

    private SearchStoriesRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.coverImageThumbnailProcess = builder.coverImageThumbnailProcess;
        this.coverVideoThumbnailProcess = builder.coverVideoThumbnailProcess;
        this.createTimeRange = builder.createTimeRange;
        this.customLabels = builder.customLabels;
        this.driveId = builder.driveId;
        this.faceGroupIds = builder.faceGroupIds;
        this.limit = builder.limit;
        this.marker = builder.marker;
        this.order = builder.order;
        this.sort = builder.sort;
        this.storyEndTimeRange = builder.storyEndTimeRange;
        this.storyId = builder.storyId;
        this.storyName = builder.storyName;
        this.storyStartTimeRange = builder.storyStartTimeRange;
        this.storyType = builder.storyType;
        this.urlExpireSec = builder.urlExpireSec;
        this.withEmptyStories = builder.withEmptyStories;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchStoriesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return coverImageThumbnailProcess
     */
    public String getCoverImageThumbnailProcess() {
        return this.coverImageThumbnailProcess;
    }

    /**
     * @return coverVideoThumbnailProcess
     */
    public String getCoverVideoThumbnailProcess() {
        return this.coverVideoThumbnailProcess;
    }

    /**
     * @return createTimeRange
     */
    public CreateTimeRange getCreateTimeRange() {
        return this.createTimeRange;
    }

    /**
     * @return customLabels
     */
    public String getCustomLabels() {
        return this.customLabels;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return faceGroupIds
     */
    public java.util.List<String> getFaceGroupIds() {
        return this.faceGroupIds;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return storyEndTimeRange
     */
    public StoryEndTimeRange getStoryEndTimeRange() {
        return this.storyEndTimeRange;
    }

    /**
     * @return storyId
     */
    public String getStoryId() {
        return this.storyId;
    }

    /**
     * @return storyName
     */
    public String getStoryName() {
        return this.storyName;
    }

    /**
     * @return storyStartTimeRange
     */
    public StoryStartTimeRange getStoryStartTimeRange() {
        return this.storyStartTimeRange;
    }

    /**
     * @return storyType
     */
    public String getStoryType() {
        return this.storyType;
    }

    /**
     * @return urlExpireSec
     */
    public Long getUrlExpireSec() {
        return this.urlExpireSec;
    }

    /**
     * @return withEmptyStories
     */
    public Boolean getWithEmptyStories() {
        return this.withEmptyStories;
    }

    public static final class Builder extends Request.Builder<SearchStoriesRequest, Builder> {
        private String domainId; 
        private String coverImageThumbnailProcess; 
        private String coverVideoThumbnailProcess; 
        private CreateTimeRange createTimeRange; 
        private String customLabels; 
        private String driveId; 
        private java.util.List<String> faceGroupIds; 
        private Long limit; 
        private String marker; 
        private String order; 
        private String sort; 
        private StoryEndTimeRange storyEndTimeRange; 
        private String storyId; 
        private String storyName; 
        private StoryStartTimeRange storyStartTimeRange; 
        private String storyType; 
        private Long urlExpireSec; 
        private Boolean withEmptyStories; 

        private Builder() {
            super();
        } 

        private Builder(SearchStoriesRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.coverImageThumbnailProcess = request.coverImageThumbnailProcess;
            this.coverVideoThumbnailProcess = request.coverVideoThumbnailProcess;
            this.createTimeRange = request.createTimeRange;
            this.customLabels = request.customLabels;
            this.driveId = request.driveId;
            this.faceGroupIds = request.faceGroupIds;
            this.limit = request.limit;
            this.marker = request.marker;
            this.order = request.order;
            this.sort = request.sort;
            this.storyEndTimeRange = request.storyEndTimeRange;
            this.storyId = request.storyId;
            this.storyName = request.storyName;
            this.storyStartTimeRange = request.storyStartTimeRange;
            this.storyType = request.storyType;
            this.urlExpireSec = request.urlExpireSec;
            this.withEmptyStories = request.withEmptyStories;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * cover_image_thumbnail_process.
         */
        public Builder coverImageThumbnailProcess(String coverImageThumbnailProcess) {
            this.putBodyParameter("cover_image_thumbnail_process", coverImageThumbnailProcess);
            this.coverImageThumbnailProcess = coverImageThumbnailProcess;
            return this;
        }

        /**
         * cover_video_thumbnail_process.
         */
        public Builder coverVideoThumbnailProcess(String coverVideoThumbnailProcess) {
            this.putBodyParameter("cover_video_thumbnail_process", coverVideoThumbnailProcess);
            this.coverVideoThumbnailProcess = coverVideoThumbnailProcess;
            return this;
        }

        /**
         * create_time_range.
         */
        public Builder createTimeRange(CreateTimeRange createTimeRange) {
            this.putBodyParameter("create_time_range", createTimeRange);
            this.createTimeRange = createTimeRange;
            return this;
        }

        /**
         * custom_labels.
         */
        public Builder customLabels(String customLabels) {
            this.putBodyParameter("custom_labels", customLabels);
            this.customLabels = customLabels;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * face_group_ids.
         */
        public Builder faceGroupIds(java.util.List<String> faceGroupIds) {
            this.putBodyParameter("face_group_ids", faceGroupIds);
            this.faceGroupIds = faceGroupIds;
            return this;
        }

        /**
         * limit.
         */
        public Builder limit(Long limit) {
            this.putBodyParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * marker.
         */
        public Builder marker(String marker) {
            this.putBodyParameter("marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * order.
         */
        public Builder order(String order) {
            this.putBodyParameter("order", order);
            this.order = order;
            return this;
        }

        /**
         * sort.
         */
        public Builder sort(String sort) {
            this.putBodyParameter("sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * story_end_time_range.
         */
        public Builder storyEndTimeRange(StoryEndTimeRange storyEndTimeRange) {
            this.putBodyParameter("story_end_time_range", storyEndTimeRange);
            this.storyEndTimeRange = storyEndTimeRange;
            return this;
        }

        /**
         * story_id.
         */
        public Builder storyId(String storyId) {
            this.putBodyParameter("story_id", storyId);
            this.storyId = storyId;
            return this;
        }

        /**
         * story_name.
         */
        public Builder storyName(String storyName) {
            this.putBodyParameter("story_name", storyName);
            this.storyName = storyName;
            return this;
        }

        /**
         * story_start_time_range.
         */
        public Builder storyStartTimeRange(StoryStartTimeRange storyStartTimeRange) {
            this.putBodyParameter("story_start_time_range", storyStartTimeRange);
            this.storyStartTimeRange = storyStartTimeRange;
            return this;
        }

        /**
         * story_type.
         */
        public Builder storyType(String storyType) {
            this.putBodyParameter("story_type", storyType);
            this.storyType = storyType;
            return this;
        }

        /**
         * url_expire_sec.
         */
        public Builder urlExpireSec(Long urlExpireSec) {
            this.putBodyParameter("url_expire_sec", urlExpireSec);
            this.urlExpireSec = urlExpireSec;
            return this;
        }

        /**
         * with_empty_stories.
         */
        public Builder withEmptyStories(Boolean withEmptyStories) {
            this.putBodyParameter("with_empty_stories", withEmptyStories);
            this.withEmptyStories = withEmptyStories;
            return this;
        }

        @Override
        public SearchStoriesRequest build() {
            return new SearchStoriesRequest(this);
        } 

    } 

    /**
     * 
     * {@link SearchStoriesRequest} extends {@link TeaModel}
     *
     * <p>SearchStoriesRequest</p>
     */
    public static class CreateTimeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("end")
        private String end;

        @com.aliyun.core.annotation.NameInMap("start")
        private String start;

        private CreateTimeRange(Builder builder) {
            this.end = builder.end;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateTimeRange create() {
            return builder().build();
        }

        /**
         * @return end
         */
        public String getEnd() {
            return this.end;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String end; 
            private String start; 

            private Builder() {
            } 

            private Builder(CreateTimeRange model) {
                this.end = model.end;
                this.start = model.start;
            } 

            /**
             * end.
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * start.
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public CreateTimeRange build() {
                return new CreateTimeRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchStoriesRequest} extends {@link TeaModel}
     *
     * <p>SearchStoriesRequest</p>
     */
    public static class StoryEndTimeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("end")
        private String end;

        @com.aliyun.core.annotation.NameInMap("start")
        private String start;

        private StoryEndTimeRange(Builder builder) {
            this.end = builder.end;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StoryEndTimeRange create() {
            return builder().build();
        }

        /**
         * @return end
         */
        public String getEnd() {
            return this.end;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String end; 
            private String start; 

            private Builder() {
            } 

            private Builder(StoryEndTimeRange model) {
                this.end = model.end;
                this.start = model.start;
            } 

            /**
             * end.
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * start.
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public StoryEndTimeRange build() {
                return new StoryEndTimeRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchStoriesRequest} extends {@link TeaModel}
     *
     * <p>SearchStoriesRequest</p>
     */
    public static class StoryStartTimeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("end")
        private String end;

        @com.aliyun.core.annotation.NameInMap("start")
        private String start;

        private StoryStartTimeRange(Builder builder) {
            this.end = builder.end;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StoryStartTimeRange create() {
            return builder().build();
        }

        /**
         * @return end
         */
        public String getEnd() {
            return this.end;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String end; 
            private String start; 

            private Builder() {
            } 

            private Builder(StoryStartTimeRange model) {
                this.end = model.end;
                this.start = model.start;
            } 

            /**
             * end.
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * start.
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public StoryStartTimeRange build() {
                return new StoryStartTimeRange(this);
            } 

        } 

    }
}
