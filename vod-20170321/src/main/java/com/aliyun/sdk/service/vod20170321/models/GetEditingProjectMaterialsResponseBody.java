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
         * <p>The materials.</p>
         */
        public Builder materialList(MaterialList materialList) {
            this.materialList = materialList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
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

            /**
             * <p>The category ID of the material.</p>
             * 
             * <strong>example:</strong>
             * <p>100005****</p>
             */
            public Builder cateId(Integer cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * <p>The category name of the material.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * <p>The thumbnail URL of the material.</p>
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * <p>The time when the material was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-10-19 10:48:17</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the material.</p>
             * 
             * <strong>example:</strong>
             * <p>test2</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The duration of the material. The value is rounded to four decimal places. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>15.16</p>
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
             * <p>The time when the material was last updated. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-10-19 10:48:17</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The size of the mezzanine file. Unit: byte.</p>
             * 
             * <strong>example:</strong>
             * <p>1682694</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The URLs of material snapshots. The value is an array.</p>
             */
            public Builder snapshots(Snapshots snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * <p>The source of the sprite.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The configuration of the sprite.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder spriteConfig(String spriteConfig) {
                this.spriteConfig = spriteConfig;
                return this;
            }

            /**
             * <p>The URLs of material sprites. The value is an array.</p>
             */
            public Builder sprites(Sprites sprites) {
                this.sprites = sprites;
                return this;
            }

            /**
             * <p>The status of the material. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: The material is in draft.</li>
             * <li><strong>Producing</strong>: The material is being produced.</li>
             * <li><strong>Produced</strong>: The material was produced.</li>
             * <li><strong>ProduceFailed</strong>: The material failed to be produced.</li>
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
             * <p>editing test</p>
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
