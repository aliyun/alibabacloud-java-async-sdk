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
 * {@link FaceGroup} extends {@link TeaModel}
 *
 * <p>FaceGroup</p>
 */
public class FaceGroup extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("created_at")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("group_cover_face_boundary")
    private GroupCoverFaceBoundary groupCoverFaceBoundary;

    @com.aliyun.core.annotation.NameInMap("group_cover_file_id")
    private String groupCoverFileId;

    @com.aliyun.core.annotation.NameInMap("group_cover_height")
    private Long groupCoverHeight;

    @com.aliyun.core.annotation.NameInMap("group_cover_url")
    private String groupCoverUrl;

    @com.aliyun.core.annotation.NameInMap("group_cover_width")
    private Long groupCoverWidth;

    @com.aliyun.core.annotation.NameInMap("group_id")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("group_name")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("image_count")
    private Long imageCount;

    @com.aliyun.core.annotation.NameInMap("remarks")
    private String remarks;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private String updatedAt;

    private FaceGroup(Builder builder) {
        this.createdAt = builder.createdAt;
        this.groupCoverFaceBoundary = builder.groupCoverFaceBoundary;
        this.groupCoverFileId = builder.groupCoverFileId;
        this.groupCoverHeight = builder.groupCoverHeight;
        this.groupCoverUrl = builder.groupCoverUrl;
        this.groupCoverWidth = builder.groupCoverWidth;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.imageCount = builder.imageCount;
        this.remarks = builder.remarks;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FaceGroup create() {
        return builder().build();
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return groupCoverFaceBoundary
     */
    public GroupCoverFaceBoundary getGroupCoverFaceBoundary() {
        return this.groupCoverFaceBoundary;
    }

    /**
     * @return groupCoverFileId
     */
    public String getGroupCoverFileId() {
        return this.groupCoverFileId;
    }

    /**
     * @return groupCoverHeight
     */
    public Long getGroupCoverHeight() {
        return this.groupCoverHeight;
    }

    /**
     * @return groupCoverUrl
     */
    public String getGroupCoverUrl() {
        return this.groupCoverUrl;
    }

    /**
     * @return groupCoverWidth
     */
    public Long getGroupCoverWidth() {
        return this.groupCoverWidth;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return imageCount
     */
    public Long getImageCount() {
        return this.imageCount;
    }

    /**
     * @return remarks
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private String createdAt; 
        private GroupCoverFaceBoundary groupCoverFaceBoundary; 
        private String groupCoverFileId; 
        private Long groupCoverHeight; 
        private String groupCoverUrl; 
        private Long groupCoverWidth; 
        private String groupId; 
        private String groupName; 
        private Long imageCount; 
        private String remarks; 
        private String updatedAt; 

        /**
         * created_at.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * group_cover_face_boundary.
         */
        public Builder groupCoverFaceBoundary(GroupCoverFaceBoundary groupCoverFaceBoundary) {
            this.groupCoverFaceBoundary = groupCoverFaceBoundary;
            return this;
        }

        /**
         * group_cover_file_id.
         */
        public Builder groupCoverFileId(String groupCoverFileId) {
            this.groupCoverFileId = groupCoverFileId;
            return this;
        }

        /**
         * group_cover_height.
         */
        public Builder groupCoverHeight(Long groupCoverHeight) {
            this.groupCoverHeight = groupCoverHeight;
            return this;
        }

        /**
         * group_cover_url.
         */
        public Builder groupCoverUrl(String groupCoverUrl) {
            this.groupCoverUrl = groupCoverUrl;
            return this;
        }

        /**
         * group_cover_width.
         */
        public Builder groupCoverWidth(Long groupCoverWidth) {
            this.groupCoverWidth = groupCoverWidth;
            return this;
        }

        /**
         * group_id.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * group_name.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * image_count.
         */
        public Builder imageCount(Long imageCount) {
            this.imageCount = imageCount;
            return this;
        }

        /**
         * remarks.
         */
        public Builder remarks(String remarks) {
            this.remarks = remarks;
            return this;
        }

        /**
         * updated_at.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public FaceGroup build() {
            return new FaceGroup(this);
        } 

    } 

    /**
     * 
     * {@link FaceGroup} extends {@link TeaModel}
     *
     * <p>FaceGroup</p>
     */
    public static class GroupCoverFaceBoundary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("Left")
        private Integer left;

        @com.aliyun.core.annotation.NameInMap("Top")
        private Integer top;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private GroupCoverFaceBoundary(Builder builder) {
            this.height = builder.height;
            this.left = builder.left;
            this.top = builder.top;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupCoverFaceBoundary create() {
            return builder().build();
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return left
         */
        public Integer getLeft() {
            return this.left;
        }

        /**
         * @return top
         */
        public Integer getTop() {
            return this.top;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer height; 
            private Integer left; 
            private Integer top; 
            private Integer width; 

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Left.
             */
            public Builder left(Integer left) {
                this.left = left;
                return this;
            }

            /**
             * Top.
             */
            public Builder top(Integer top) {
                this.top = top;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public GroupCoverFaceBoundary build() {
                return new GroupCoverFaceBoundary(this);
            } 

        } 

    }
}
