// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link AddEditingProjectMaterialsResponseBody} extends {@link TeaModel}
 *
 * <p>AddEditingProjectMaterialsResponseBody</p>
 */
public class AddEditingProjectMaterialsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaterialList")
    private java.util.List<MaterialList> materialList;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return materialList
     */
    public java.util.List<MaterialList> getMaterialList() {
        return this.materialList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<MaterialList> materialList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AddEditingProjectMaterialsResponseBody model) {
            this.materialList = model.materialList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The materials.</p>
         */
        public Builder materialList(java.util.List<MaterialList> materialList) {
            this.materialList = materialList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>85237CDA-0B54-5CED-BA10-A8A71AA13C1A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddEditingProjectMaterialsResponseBody build() {
            return new AddEditingProjectMaterialsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddEditingProjectMaterialsResponseBody} extends {@link TeaModel}
     *
     * <p>AddEditingProjectMaterialsResponseBody</p>
     */
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
        private java.util.List<String> snapshots;

        @com.aliyun.core.annotation.NameInMap("SpriteConfig")
        private String spriteConfig;

        @com.aliyun.core.annotation.NameInMap("Sprites")
        private java.util.List<String> sprites;

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
        public java.util.List<String> getSnapshots() {
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
        public java.util.List<String> getSprites() {
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
            private java.util.List<String> snapshots; 
            private String spriteConfig; 
            private java.util.List<String> sprites; 
            private String status; 
            private String tags; 
            private String title; 

            private Builder() {
            } 

            private Builder(MaterialList model) {
                this.cateId = model.cateId;
                this.cateName = model.cateName;
                this.coverURL = model.coverURL;
                this.createTime = model.createTime;
                this.customerId = model.customerId;
                this.description = model.description;
                this.duration = model.duration;
                this.materialId = model.materialId;
                this.materialType = model.materialType;
                this.modifyTime = model.modifyTime;
                this.size = model.size;
                this.snapshots = model.snapshots;
                this.spriteConfig = model.spriteConfig;
                this.sprites = model.sprites;
                this.status = model.status;
                this.tags = model.tags;
                this.title = model.title;
            } 

            /**
             * <p>The ID of the category.</p>
             * 
             * <strong>example:</strong>
             * <p>1000487543</p>
             */
            public Builder cateId(Integer cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * <p>The category name of the material.</p>
             * 
             * <strong>example:</strong>
             * <p>cate1</p>
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * <p>The thumbnail URL.</p>
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * <p>The time when the material was created. The time follows the ISO 8601 standard in the <em>YYYY-MM-DD**Thh:mm:ss</em> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-10-02T08:26Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>1234751840694470</p>
             */
            public Builder customerId(Long customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * <p>The description of the material.</p>
             * 
             * <strong>example:</strong>
             * <p>test material</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The duration of the material. Unit: seconds. The value is accurate to four decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>3690.2332</p>
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The ID of the material.</p>
             * 
             * <strong>example:</strong>
             * <p>85befc4118b84c6723e53b80b1****</p>
             */
            public Builder materialId(String materialId) {
                this.materialId = materialId;
                return this;
            }

            /**
             * <p>The type of the material. Valid values:</p>
             * <ul>
             * <li><strong>video</strong></li>
             * <li><strong>audio</strong></li>
             * <li><strong>image</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>video</p>
             */
            public Builder materialType(String materialType) {
                this.materialType = materialType;
                return this;
            }

            /**
             * <p>The time when the material was last updated. The time follows the ISO 8601 standard in the <em>YYYY-MM-DD**Thh:mm:ss</em> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-25T07:28:34Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The size of the material.</p>
             * 
             * <strong>example:</strong>
             * <p>1682694</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The URLs of snapshots.</p>
             */
            public Builder snapshots(java.util.List<String> snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * <p>The configuration of the sprite snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder spriteConfig(String spriteConfig) {
                this.spriteConfig = spriteConfig;
                return this;
            }

            /**
             * <p>The URLs of sprite snapshots.</p>
             */
            public Builder sprites(java.util.List<String> sprites) {
                this.sprites = sprites;
                return this;
            }

            /**
             * <p>The status of the material. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong></li>
             * <li><strong>Uploading</strong></li>
             * <li><strong>UploadFail</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tag of the material. Multiple tags are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>tag1,tag2</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The title of the material.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
