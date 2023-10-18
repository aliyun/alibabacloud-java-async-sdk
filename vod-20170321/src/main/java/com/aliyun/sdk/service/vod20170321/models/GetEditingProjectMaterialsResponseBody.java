// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEditingProjectMaterialsResponseBody} extends {@link TeaModel}
 *
 * <p>GetEditingProjectMaterialsResponseBody</p>
 */
public class GetEditingProjectMaterialsResponseBody extends TeaModel {
    @NameInMap("MaterialList")
    private MaterialList materialList;

    @NameInMap("RequestId")
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

        /**
         * The materials.
         */
        public Builder materialList(MaterialList materialList) {
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

        public GetEditingProjectMaterialsResponseBody build() {
            return new GetEditingProjectMaterialsResponseBody(this);
        } 

    } 

    public static class Snapshots extends TeaModel {
        @NameInMap("Snapshot")
        private java.util.List < String > snapshot;

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
        public java.util.List < String > getSnapshot() {
            return this.snapshot;
        }

        public static final class Builder {
            private java.util.List < String > snapshot; 

            /**
             * Snapshot.
             */
            public Builder snapshot(java.util.List < String > snapshot) {
                this.snapshot = snapshot;
                return this;
            }

            public Snapshots build() {
                return new Snapshots(this);
            } 

        } 

    }
    public static class Sprites extends TeaModel {
        @NameInMap("Sprite")
        private java.util.List < String > sprite;

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
        public java.util.List < String > getSprite() {
            return this.sprite;
        }

        public static final class Builder {
            private java.util.List < String > sprite; 

            /**
             * Sprite.
             */
            public Builder sprite(java.util.List < String > sprite) {
                this.sprite = sprite;
                return this;
            }

            public Sprites build() {
                return new Sprites(this);
            } 

        } 

    }
    public static class Material extends TeaModel {
        @NameInMap("CateId")
        private Integer cateId;

        @NameInMap("CateName")
        private String cateName;

        @NameInMap("CoverURL")
        private String coverURL;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Duration")
        private Float duration;

        @NameInMap("MaterialId")
        private String materialId;

        @NameInMap("MaterialType")
        private String materialType;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Snapshots")
        private Snapshots snapshots;

        @NameInMap("Source")
        private String source;

        @NameInMap("SpriteConfig")
        private String spriteConfig;

        @NameInMap("Sprites")
        private Sprites sprites;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private String tags;

        @NameInMap("Title")
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

            /**
             * The category ID of the material.
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
             * The thumbnail URL of the material.
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * The time when the material was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * The duration of the material. The value is rounded to four decimal places. Unit: seconds.
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
             * The time when the material was last updated. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The size of the mezzanine file. Unit: byte.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The URLs of material snapshots. The value is an array.
             */
            public Builder snapshots(Snapshots snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * The source of the sprite.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The configuration of the sprite.
             */
            public Builder spriteConfig(String spriteConfig) {
                this.spriteConfig = spriteConfig;
                return this;
            }

            /**
             * The URLs of material sprites. The value is an array.
             */
            public Builder sprites(Sprites sprites) {
                this.sprites = sprites;
                return this;
            }

            /**
             * The status of the material. Valid values:
             * <p>
             * 
             * *   **Normal**: The material is in draft.
             * *   **Producing**: The material is being produced.
             * *   **Produced**: The material was produced.
             * *   **ProduceFailed**: The material failed to be produced.
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

            public Material build() {
                return new Material(this);
            } 

        } 

    }
    public static class MaterialList extends TeaModel {
        @NameInMap("Material")
        private java.util.List < Material> material;

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
        public java.util.List < Material> getMaterial() {
            return this.material;
        }

        public static final class Builder {
            private java.util.List < Material> material; 

            /**
             * Material.
             */
            public Builder material(java.util.List < Material> material) {
                this.material = material;
                return this;
            }

            public MaterialList build() {
                return new MaterialList(this);
            } 

        } 

    }
}
