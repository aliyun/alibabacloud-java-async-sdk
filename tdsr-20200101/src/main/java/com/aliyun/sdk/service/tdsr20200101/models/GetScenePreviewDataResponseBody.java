// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScenePreviewDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetScenePreviewDataResponseBody</p>
 */
public class GetScenePreviewDataResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetScenePreviewDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScenePreviewDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * 返回码
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 错误消息
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 是否请求成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetScenePreviewDataResponseBody build() {
            return new GetScenePreviewDataResponseBody(this);
        } 

    } 

    public static class Position extends TeaModel {
        @NameInMap("Rotation")
        private java.util.List < Double > rotation;

        @NameInMap("Spot")
        private java.util.List < Double > spot;

        @NameInMap("Viewpoint")
        private java.util.List < Double > viewpoint;

        private Position(Builder builder) {
            this.rotation = builder.rotation;
            this.spot = builder.spot;
            this.viewpoint = builder.viewpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Position create() {
            return builder().build();
        }

        /**
         * @return rotation
         */
        public java.util.List < Double > getRotation() {
            return this.rotation;
        }

        /**
         * @return spot
         */
        public java.util.List < Double > getSpot() {
            return this.spot;
        }

        /**
         * @return viewpoint
         */
        public java.util.List < Double > getViewpoint() {
            return this.viewpoint;
        }

        public static final class Builder {
            private java.util.List < Double > rotation; 
            private java.util.List < Double > spot; 
            private java.util.List < Double > viewpoint; 

            /**
             * 当前点位在场景中的旋转四元素
             */
            public Builder rotation(java.util.List < Double > rotation) {
                this.rotation = rotation;
                return this;
            }

            /**
             * 当前点位在场景中的坐标
             */
            public Builder spot(java.util.List < Double > spot) {
                this.spot = spot;
                return this;
            }

            /**
             * 当前子场景名标签在场景中的坐标
             */
            public Builder viewpoint(java.util.List < Double > viewpoint) {
                this.viewpoint = viewpoint;
                return this;
            }

            public Position build() {
                return new Position(this);
            } 

        } 

    }
    public static class PanoList extends TeaModel {
        @NameInMap("CurRoomPicList")
        private java.util.List < String > curRoomPicList;

        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("FloorIdx")
        private String floorIdx;

        @NameInMap("Id")
        private String id;

        @NameInMap("MainImage")
        private Boolean mainImage;

        @NameInMap("Neighbours")
        private java.util.List < String > neighbours;

        @NameInMap("Position")
        private Position position;

        @NameInMap("RawName")
        private String rawName;

        @NameInMap("Resource")
        private String resource;

        @NameInMap("RoomIdx")
        private String roomIdx;

        @NameInMap("SubSceneId")
        private String subSceneId;

        @NameInMap("Token")
        private String token;

        @NameInMap("VirtualId")
        private String virtualId;

        @NameInMap("VirtualName")
        private String virtualName;

        private PanoList(Builder builder) {
            this.curRoomPicList = builder.curRoomPicList;
            this.enabled = builder.enabled;
            this.floorIdx = builder.floorIdx;
            this.id = builder.id;
            this.mainImage = builder.mainImage;
            this.neighbours = builder.neighbours;
            this.position = builder.position;
            this.rawName = builder.rawName;
            this.resource = builder.resource;
            this.roomIdx = builder.roomIdx;
            this.subSceneId = builder.subSceneId;
            this.token = builder.token;
            this.virtualId = builder.virtualId;
            this.virtualName = builder.virtualName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PanoList create() {
            return builder().build();
        }

        /**
         * @return curRoomPicList
         */
        public java.util.List < String > getCurRoomPicList() {
            return this.curRoomPicList;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return floorIdx
         */
        public String getFloorIdx() {
            return this.floorIdx;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mainImage
         */
        public Boolean getMainImage() {
            return this.mainImage;
        }

        /**
         * @return neighbours
         */
        public java.util.List < String > getNeighbours() {
            return this.neighbours;
        }

        /**
         * @return position
         */
        public Position getPosition() {
            return this.position;
        }

        /**
         * @return rawName
         */
        public String getRawName() {
            return this.rawName;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return roomIdx
         */
        public String getRoomIdx() {
            return this.roomIdx;
        }

        /**
         * @return subSceneId
         */
        public String getSubSceneId() {
            return this.subSceneId;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        /**
         * @return virtualId
         */
        public String getVirtualId() {
            return this.virtualId;
        }

        /**
         * @return virtualName
         */
        public String getVirtualName() {
            return this.virtualName;
        }

        public static final class Builder {
            private java.util.List < String > curRoomPicList; 
            private Boolean enabled; 
            private String floorIdx; 
            private String id; 
            private Boolean mainImage; 
            private java.util.List < String > neighbours; 
            private Position position; 
            private String rawName; 
            private String resource; 
            private String roomIdx; 
            private String subSceneId; 
            private String token; 
            private String virtualId; 
            private String virtualName; 

            /**
             * 当前房间的所有点位
             */
            public Builder curRoomPicList(java.util.List < String > curRoomPicList) {
                this.curRoomPicList = curRoomPicList;
                return this;
            }

            /**
             * 当前点位是否渲染，false不渲染，场景无法跳转
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * 楼层号
             */
            public Builder floorIdx(String floorIdx) {
                this.floorIdx = floorIdx;
                return this;
            }

            /**
             * 点位ID
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 单房间多图情况下，是否为主图，默认true
             */
            public Builder mainImage(Boolean mainImage) {
                this.mainImage = mainImage;
                return this;
            }

            /**
             * 当前房间邻近可视的点位id
             */
            public Builder neighbours(java.util.List < String > neighbours) {
                this.neighbours = neighbours;
                return this;
            }

            /**
             * 位置数据
             */
            public Builder position(Position position) {
                this.position = position;
                return this;
            }

            /**
             * 一个名称，无实际意义
             */
            public Builder rawName(String rawName) {
                this.rawName = rawName;
                return this;
            }

            /**
             * 全景贴图路径
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * 房间号
             */
            public Builder roomIdx(String roomIdx) {
                this.roomIdx = roomIdx;
                return this;
            }

            /**
             * 子场景ID
             */
            public Builder subSceneId(String subSceneId) {
                this.subSceneId = subSceneId;
                return this;
            }

            /**
             * token
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * 图片虚拟ID
             */
            public Builder virtualId(String virtualId) {
                this.virtualId = virtualId;
                return this;
            }

            /**
             * 图片名称
             */
            public Builder virtualName(String virtualName) {
                this.virtualName = virtualName;
                return this;
            }

            public PanoList build() {
                return new PanoList(this);
            } 

        } 

    }
    public static class Model extends TeaModel {
        @NameInMap("ModelPath")
        private String modelPath;

        @NameInMap("PanoList")
        private java.util.List < PanoList> panoList;

        @NameInMap("TextureModelPath")
        private String textureModelPath;

        @NameInMap("TexturePanoPath")
        private String texturePanoPath;

        private Model(Builder builder) {
            this.modelPath = builder.modelPath;
            this.panoList = builder.panoList;
            this.textureModelPath = builder.textureModelPath;
            this.texturePanoPath = builder.texturePanoPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return modelPath
         */
        public String getModelPath() {
            return this.modelPath;
        }

        /**
         * @return panoList
         */
        public java.util.List < PanoList> getPanoList() {
            return this.panoList;
        }

        /**
         * @return textureModelPath
         */
        public String getTextureModelPath() {
            return this.textureModelPath;
        }

        /**
         * @return texturePanoPath
         */
        public String getTexturePanoPath() {
            return this.texturePanoPath;
        }

        public static final class Builder {
            private String modelPath; 
            private java.util.List < PanoList> panoList; 
            private String textureModelPath; 
            private String texturePanoPath; 

            /**
             * 模型地址
             */
            public Builder modelPath(String modelPath) {
                this.modelPath = modelPath;
                return this;
            }

            /**
             * 点位数据
             */
            public Builder panoList(java.util.List < PanoList> panoList) {
                this.panoList = panoList;
                return this;
            }

            /**
             * 模型的贴图路径
             */
            public Builder textureModelPath(String textureModelPath) {
                this.textureModelPath = textureModelPath;
                return this;
            }

            /**
             * 漫游后预览图片路径
             */
            public Builder texturePanoPath(String texturePanoPath) {
                this.texturePanoPath = texturePanoPath;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
    public static class ButtonConfig extends TeaModel {
        @NameInMap("CustomText")
        private String customText;

        @NameInMap("Type")
        private String type;

        private ButtonConfig(Builder builder) {
            this.customText = builder.customText;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ButtonConfig create() {
            return builder().build();
        }

        /**
         * @return customText
         */
        public String getCustomText() {
            return this.customText;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String customText; 
            private String type; 

            /**
             * CustomText.
             */
            public Builder customText(String customText) {
                this.customText = customText;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ButtonConfig build() {
                return new ButtonConfig(this);
            } 

        } 

    }
    public static class Config extends TeaModel {
        @NameInMap("BackgroundColor")
        private String backgroundColor;

        @NameInMap("ButtonConfig")
        private ButtonConfig buttonConfig;

        @NameInMap("Content")
        private String content;

        @NameInMap("FormImgSize")
        private java.util.List < Long > formImgSize;

        @NameInMap("FormJumpType")
        private Boolean formJumpType;

        @NameInMap("FormSelectImgType")
        private String formSelectImgType;

        @NameInMap("Images")
        private java.util.List < String > images;

        @NameInMap("IsTagVisibleBy3d")
        private Boolean isTagVisibleBy3d;

        @NameInMap("Link")
        private String link;

        @NameInMap("PanoId")
        private String panoId;

        @NameInMap("Position")
        private java.util.List < Double > position;

        @NameInMap("PositionPanoCube")
        private java.util.List < Double > positionPanoCube;

        @NameInMap("RelatedPanoIds")
        private java.util.List < String > relatedPanoIds;

        @NameInMap("SceneId")
        private Long sceneId;

        @NameInMap("Title")
        private String title;

        @NameInMap("Video")
        private String video;

        private Config(Builder builder) {
            this.backgroundColor = builder.backgroundColor;
            this.buttonConfig = builder.buttonConfig;
            this.content = builder.content;
            this.formImgSize = builder.formImgSize;
            this.formJumpType = builder.formJumpType;
            this.formSelectImgType = builder.formSelectImgType;
            this.images = builder.images;
            this.isTagVisibleBy3d = builder.isTagVisibleBy3d;
            this.link = builder.link;
            this.panoId = builder.panoId;
            this.position = builder.position;
            this.positionPanoCube = builder.positionPanoCube;
            this.relatedPanoIds = builder.relatedPanoIds;
            this.sceneId = builder.sceneId;
            this.title = builder.title;
            this.video = builder.video;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return backgroundColor
         */
        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        /**
         * @return buttonConfig
         */
        public ButtonConfig getButtonConfig() {
            return this.buttonConfig;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return formImgSize
         */
        public java.util.List < Long > getFormImgSize() {
            return this.formImgSize;
        }

        /**
         * @return formJumpType
         */
        public Boolean getFormJumpType() {
            return this.formJumpType;
        }

        /**
         * @return formSelectImgType
         */
        public String getFormSelectImgType() {
            return this.formSelectImgType;
        }

        /**
         * @return images
         */
        public java.util.List < String > getImages() {
            return this.images;
        }

        /**
         * @return isTagVisibleBy3d
         */
        public Boolean getIsTagVisibleBy3d() {
            return this.isTagVisibleBy3d;
        }

        /**
         * @return link
         */
        public String getLink() {
            return this.link;
        }

        /**
         * @return panoId
         */
        public String getPanoId() {
            return this.panoId;
        }

        /**
         * @return position
         */
        public java.util.List < Double > getPosition() {
            return this.position;
        }

        /**
         * @return positionPanoCube
         */
        public java.util.List < Double > getPositionPanoCube() {
            return this.positionPanoCube;
        }

        /**
         * @return relatedPanoIds
         */
        public java.util.List < String > getRelatedPanoIds() {
            return this.relatedPanoIds;
        }

        /**
         * @return sceneId
         */
        public Long getSceneId() {
            return this.sceneId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return video
         */
        public String getVideo() {
            return this.video;
        }

        public static final class Builder {
            private String backgroundColor; 
            private ButtonConfig buttonConfig; 
            private String content; 
            private java.util.List < Long > formImgSize; 
            private Boolean formJumpType; 
            private String formSelectImgType; 
            private java.util.List < String > images; 
            private Boolean isTagVisibleBy3d; 
            private String link; 
            private String panoId; 
            private java.util.List < Double > position; 
            private java.util.List < Double > positionPanoCube; 
            private java.util.List < String > relatedPanoIds; 
            private Long sceneId; 
            private String title; 
            private String video; 

            /**
             * 背景色
             */
            public Builder backgroundColor(String backgroundColor) {
                this.backgroundColor = backgroundColor;
                return this;
            }

            /**
             * 按钮配置
             */
            public Builder buttonConfig(ButtonConfig buttonConfig) {
                this.buttonConfig = buttonConfig;
                return this;
            }

            /**
             * 内容
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * FormImgSize.
             */
            public Builder formImgSize(java.util.List < Long > formImgSize) {
                this.formImgSize = formImgSize;
                return this;
            }

            /**
             * FormJumpType.
             */
            public Builder formJumpType(Boolean formJumpType) {
                this.formJumpType = formJumpType;
                return this;
            }

            /**
             * FormSelectImgType.
             */
            public Builder formSelectImgType(String formSelectImgType) {
                this.formSelectImgType = formSelectImgType;
                return this;
            }

            /**
             * 图片链接
             */
            public Builder images(java.util.List < String > images) {
                this.images = images;
                return this;
            }

            /**
             * 是否在鸟瞰模式下显示
             */
            public Builder isTagVisibleBy3d(Boolean isTagVisibleBy3d) {
                this.isTagVisibleBy3d = isTagVisibleBy3d;
                return this;
            }

            /**
             * 超链接
             */
            public Builder link(String link) {
                this.link = link;
                return this;
            }

            /**
             * 点位ID
             */
            public Builder panoId(String panoId) {
                this.panoId = panoId;
                return this;
            }

            /**
             * 坐标
             */
            public Builder position(java.util.List < Double > position) {
                this.position = position;
                return this;
            }

            /**
             * PositionPanoCube.
             */
            public Builder positionPanoCube(java.util.List < Double > positionPanoCube) {
                this.positionPanoCube = positionPanoCube;
                return this;
            }

            /**
             * RelatedPanoIds.
             */
            public Builder relatedPanoIds(java.util.List < String > relatedPanoIds) {
                this.relatedPanoIds = relatedPanoIds;
                return this;
            }

            /**
             * 场景ID
             */
            public Builder sceneId(Long sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * 标题
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * 视频链接
             */
            public Builder video(String video) {
                this.video = video;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Config")
        private Config config;

        @NameInMap("Id")
        private String id;

        @NameInMap("Position")
        private java.util.List < Double > position;

        @NameInMap("PositionPanoCube")
        private java.util.List < Double > positionPanoCube;

        @NameInMap("Type")
        private String type;

        private Tags(Builder builder) {
            this.config = builder.config;
            this.id = builder.id;
            this.position = builder.position;
            this.positionPanoCube = builder.positionPanoCube;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return position
         */
        public java.util.List < Double > getPosition() {
            return this.position;
        }

        /**
         * @return positionPanoCube
         */
        public java.util.List < Double > getPositionPanoCube() {
            return this.positionPanoCube;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Config config; 
            private String id; 
            private java.util.List < Double > position; 
            private java.util.List < Double > positionPanoCube; 
            private String type; 

            /**
             * 配置
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * 标签ID
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 坐标
             */
            public Builder position(java.util.List < Double > position) {
                this.position = position;
                return this;
            }

            /**
             * PositionPanoCube.
             */
            public Builder positionPanoCube(java.util.List < Double > positionPanoCube) {
                this.positionPanoCube = positionPanoCube;
                return this;
            }

            /**
             * 热点类型
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Model")
        private Model model;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        private Data(Builder builder) {
            this.model = builder.model;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return model
         */
        public Model getModel() {
            return this.model;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Model model; 
            private java.util.List < Tags> tags; 

            /**
             * 模型数据
             */
            public Builder model(Model model) {
                this.model = model;
                return this;
            }

            /**
             * 热点数据
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
