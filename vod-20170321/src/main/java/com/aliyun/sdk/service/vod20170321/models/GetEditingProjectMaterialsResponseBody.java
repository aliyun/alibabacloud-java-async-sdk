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
 * {@link GetEditingProjectMaterialsResponseBody} extends {@link TeaModel}
 *
 * <p>GetEditingProjectMaterialsResponseBody</p>
 */
public class GetEditingProjectMaterialsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaterialList")
    private MaterialList materialList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetEditingProjectMaterialsResponseBody(Builder builder) {
        this.materialList = builder.materialList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEditingProjectMaterialsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return materialList
     */
    public MaterialList getMaterialList() {
        return this.materialList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MaterialList materialList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetEditingProjectMaterialsResponseBody model) {
            this.materialList = model.materialList;
            this.requestId = model.requestId;
        } 

        /**
         * MaterialList.
         */
        public Builder materialList(MaterialList materialList) {
            this.materialList = materialList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>746FFA07-8BBB-46B1-3E94E3B2915E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEditingProjectMaterialsResponseBody build() {
            return new GetEditingProjectMaterialsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEditingProjectMaterialsResponseBody} extends {@link TeaModel}
     *
     * <p>GetEditingProjectMaterialsResponseBody</p>
     */
    public static class Snapshots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Snapshot")
        private java.util.List<String> snapshot;

        private Snapshots(Builder builder) {
            this.snapshot = builder.snapshot;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Snapshots create() {
            return builder().build();
        }

        /**
         * @return snapshot
         */
        public java.util.List<String> getSnapshot() {
            return this.snapshot;
        }

        public static final class Builder {
            private java.util.List<String> snapshot; 

            private Builder() {
            } 

            private Builder(Snapshots model) {
                this.snapshot = model.snapshot;
            } 

            /**
             * Snapshot.
             */
            public Builder snapshot(java.util.List<String> snapshot) {
                this.snapshot = snapshot;
                return this;
            }

            public Snapshots build() {
                return new Snapshots(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEditingProjectMaterialsResponseBody} extends {@link TeaModel}
     *
     * <p>GetEditingProjectMaterialsResponseBody</p>
     */
    public static class Sprites extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Sprite")
        private java.util.List<String> sprite;

        private Sprites(Builder builder) {
            this.sprite = builder.sprite;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sprites create() {
            return builder().build();
        }

        /**
         * @return sprite
         */
        public java.util.List<String> getSprite() {
            return this.sprite;
        }

        public static final class Builder {
            private java.util.List<String> sprite; 

            private Builder() {
            } 

            private Builder(Sprites model) {
                this.sprite = model.sprite;
            } 

            /**
             * Sprite.
             */
            public Builder sprite(java.util.List<String> sprite) {
                this.sprite = sprite;
                return this;
            }

            public Sprites build() {
                return new Sprites(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEditingProjectMaterialsResponseBody} extends {@link TeaModel}
     *
     * <p>GetEditingProjectMaterialsResponseBody</p>
     */
    public static class Material extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CateId")
        private Integer cateId;

        @com.aliyun.core.annotation.NameInMap("CateName")
        private String cateName;

        @com.aliyun.core.annotation.NameInMap("CoverURL")
        private String coverURL;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Float duration;

        @com.aliyun.core.annotation.NameInMap("MaterialId")
        private String materialId;

        @com.aliyun.core.annotation.NameInMap("MaterialType")
        private String materialType;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Snapshots")
        private Snapshots snapshots;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SpriteConfig")
        private String spriteConfig;

        @com.aliyun.core.annotation.NameInMap("Sprites")
        private Sprites sprites;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Material(Builder builder) {
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
            this.coverURL = builder.coverURL;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.duration = builder.duration;
            this.materialId = builder.materialId;
            this.materialType = builder.materialType;
            this.modifiedTime = builder.modifiedTime;
            this.size = builder.size;
            this.snapshots = builder.snapshots;
            this.source = builder.source;
            this.spriteConfig = builder.spriteConfig;
            this.sprites = builder.sprites;
            this.status = builder.status;
            this.tags = builder.tags;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Material create() {
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
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
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
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
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
        public Snapshots getSnapshots() {
            return this.snapshots;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
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
        public Sprites getSprites() {
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
            private String creationTime; 
            private String description; 
            private Float duration; 
            private String materialId; 
            private String materialType; 
            private String modifiedTime; 
            private Long size; 
            private Snapshots snapshots; 
            private String source; 
            private String spriteConfig; 
            private Sprites sprites; 
            private String status; 
            private String tags; 
            private String title; 

            private Builder() {
            } 

            private Builder(Material model) {
                this.cateId = model.cateId;
                this.cateName = model.cateName;
                this.coverURL = model.coverURL;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.duration = model.duration;
                this.materialId = model.materialId;
                this.materialType = model.materialType;
                this.modifiedTime = model.modifiedTime;
                this.size = model.size;
                this.snapshots = model.snapshots;
                this.source = model.source;
                this.spriteConfig = model.spriteConfig;
                this.sprites = model.sprites;
                this.status = model.status;
                this.tags = model.tags;
                this.title = model.title;
            } 

            /**
             * CateId.
             */
            public Builder cateId(Integer cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * CateName.
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * CoverURL.
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * MaterialId.
             */
            public Builder materialId(String materialId) {
                this.materialId = materialId;
                return this;
            }

            /**
             * MaterialType.
             */
            public Builder materialType(String materialType) {
                this.materialType = materialType;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * Snapshots.
             */
            public Builder snapshots(Snapshots snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * SpriteConfig.
             */
            public Builder spriteConfig(String spriteConfig) {
                this.spriteConfig = spriteConfig;
                return this;
            }

            /**
             * Sprites.
             */
            public Builder sprites(Sprites sprites) {
                this.sprites = sprites;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Material build() {
                return new Material(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEditingProjectMaterialsResponseBody} extends {@link TeaModel}
     *
     * <p>GetEditingProjectMaterialsResponseBody</p>
     */
    public static class MaterialList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Material")
        private java.util.List<Material> material;

        private MaterialList(Builder builder) {
            this.material = builder.material;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MaterialList create() {
            return builder().build();
        }

        /**
         * @return material
         */
        public java.util.List<Material> getMaterial() {
            return this.material;
        }

        public static final class Builder {
            private java.util.List<Material> material; 

            private Builder() {
            } 

            private Builder(MaterialList model) {
                this.material = model.material;
            } 

            /**
             * Material.
             */
            public Builder material(java.util.List<Material> material) {
                this.material = material;
                return this;
            }

            public MaterialList build() {
                return new MaterialList(this);
            } 

        } 

    }
}
