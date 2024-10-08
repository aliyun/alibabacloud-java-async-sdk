// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddEditingProjectMaterialsResponseBody} extends {@link TeaModel}
 *
 * <p>AddEditingProjectMaterialsResponseBody</p>
 */
public class AddEditingProjectMaterialsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaterialList")
    private java.util.List < MaterialList> materialList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddEditingProjectMaterialsResponseBody(Builder builder) {
        this.materialList = builder.materialList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddEditingProjectMaterialsResponseBody create() {
        return builder().build();
    }

    /**
     * @return materialList
     */
    public java.util.List < MaterialList> getMaterialList() {
        return this.materialList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < MaterialList> materialList; 
        private String requestId; 

        /**
         * The materials.
         */
        public Builder materialList(java.util.List < MaterialList> materialList) {
            this.materialList = materialList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddEditingProjectMaterialsResponseBody build() {
            return new AddEditingProjectMaterialsResponseBody(this);
        } 

    } 

    public static class MaterialList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CateId")
        private Integer cateId;

        @com.aliyun.core.annotation.NameInMap("CateName")
        private String cateName;

        @com.aliyun.core.annotation.NameInMap("CoverURL")
        private String coverURL;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CustomerId")
        private Long customerId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Float duration;

        @com.aliyun.core.annotation.NameInMap("MaterialId")
        private String materialId;

        @com.aliyun.core.annotation.NameInMap("MaterialType")
        private String materialType;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Snapshots")
        private java.util.List < String > snapshots;

        @com.aliyun.core.annotation.NameInMap("SpriteConfig")
        private String spriteConfig;

        @com.aliyun.core.annotation.NameInMap("Sprites")
        private java.util.List < String > sprites;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private MaterialList(Builder builder) {
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
            this.coverURL = builder.coverURL;
            this.createTime = builder.createTime;
            this.customerId = builder.customerId;
            this.description = builder.description;
            this.duration = builder.duration;
            this.materialId = builder.materialId;
            this.materialType = builder.materialType;
            this.modifyTime = builder.modifyTime;
            this.size = builder.size;
            this.snapshots = builder.snapshots;
            this.spriteConfig = builder.spriteConfig;
            this.sprites = builder.sprites;
            this.status = builder.status;
            this.tags = builder.tags;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MaterialList create() {
            return builder().build();
        }

        /**
         * @return cateId
         */
        public Integer getCateId() {
            return this.cateId;
        }

        /**
         * @return cateName
         */
        public String getCateName() {
            return this.cateName;
        }

        /**
         * @return coverURL
         */
        public String getCoverURL() {
            return this.coverURL;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return customerId
         */
        public Long getCustomerId() {
            return this.customerId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return duration
         */
        public Float getDuration() {
            return this.duration;
        }

        /**
         * @return materialId
         */
        public String getMaterialId() {
            return this.materialId;
        }

        /**
         * @return materialType
         */
        public String getMaterialType() {
            return this.materialType;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return snapshots
         */
        public java.util.List < String > getSnapshots() {
            return this.snapshots;
        }

        /**
         * @return spriteConfig
         */
        public String getSpriteConfig() {
            return this.spriteConfig;
        }

        /**
         * @return sprites
         */
        public java.util.List < String > getSprites() {
            return this.sprites;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Integer cateId; 
            private String cateName; 
            private String coverURL; 
            private String createTime; 
            private Long customerId; 
            private String description; 
            private Float duration; 
            private String materialId; 
            private String materialType; 
            private String modifyTime; 
            private Long size; 
            private java.util.List < String > snapshots; 
            private String spriteConfig; 
            private java.util.List < String > sprites; 
            private String status; 
            private String tags; 
            private String title; 

            /**
             * The ID of the category.
             */
            public Builder cateId(Integer cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * The category name of the material.
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * The thumbnail URL.
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * The time when the material was created. The time follows the ISO 8601 standard in the *YYYY-MM-DD**Thh:mm:ss* format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The user ID.
             */
            public Builder customerId(Long customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * The description of the material.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The duration of the material. Unit: seconds. The value is accurate to four decimal places.
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The ID of the material.
             */
            public Builder materialId(String materialId) {
                this.materialId = materialId;
                return this;
            }

            /**
             * The type of the material. Valid values:
             * <p>
             * 
             * *   **video**
             * *   **audio**
             * *   **image**
             */
            public Builder materialType(String materialType) {
                this.materialType = materialType;
                return this;
            }

            /**
             * The time when the material was last updated. The time follows the ISO 8601 standard in the *YYYY-MM-DD**Thh:mm:ss* format. The time is displayed in UTC.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The size of the material.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The URLs of snapshots.
             */
            public Builder snapshots(java.util.List < String > snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * The configuration of the sprite snapshot.
             */
            public Builder spriteConfig(String spriteConfig) {
                this.spriteConfig = spriteConfig;
                return this;
            }

            /**
             * The URLs of sprite snapshots.
             */
            public Builder sprites(java.util.List < String > sprites) {
                this.sprites = sprites;
                return this;
            }

            /**
             * The status of the material. Valid values:
             * <p>
             * 
             * *   **Normal**
             * *   **Uploading**
             * *   **UploadFail**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tag of the material. Multiple tags are separated by commas (,).
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The title of the material.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public MaterialList build() {
                return new MaterialList(this);
            } 

        } 

    }
}
