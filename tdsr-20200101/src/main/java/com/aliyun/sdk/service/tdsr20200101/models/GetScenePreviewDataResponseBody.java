// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

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
 * {@link GetScenePreviewDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetScenePreviewDataResponseBody</p>
 */
public class GetScenePreviewDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetScenePreviewDataResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
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
     * @return accessDeniedDetail
     */
    public AccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        private AccessDeniedDetail accessDeniedDetail; 
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A8CD0AD9-8A92-455A-A984-A7E4B76FF387</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetScenePreviewDataResponseBody build() {
            return new GetScenePreviewDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetScenePreviewDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetScenePreviewDataResponseBody</p>
     */
    public static class AccessDeniedDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthAction")
        private String authAction;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalDisplayName")
        private String authPrincipalDisplayName;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalOwnerId")
        private String authPrincipalOwnerId;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalType")
        private String authPrincipalType;

        @com.aliyun.core.annotation.NameInMap("EncodedDiagnosticMessage")
        private String encodedDiagnosticMessage;

        @com.aliyun.core.annotation.NameInMap("NoPermissionType")
        private String noPermissionType;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        private AccessDeniedDetail(Builder builder) {
            this.authAction = builder.authAction;
            this.authPrincipalDisplayName = builder.authPrincipalDisplayName;
            this.authPrincipalOwnerId = builder.authPrincipalOwnerId;
            this.authPrincipalType = builder.authPrincipalType;
            this.encodedDiagnosticMessage = builder.encodedDiagnosticMessage;
            this.noPermissionType = builder.noPermissionType;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessDeniedDetail create() {
            return builder().build();
        }

        /**
         * @return authAction
         */
        public String getAuthAction() {
            return this.authAction;
        }

        /**
         * @return authPrincipalDisplayName
         */
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        /**
         * @return authPrincipalOwnerId
         */
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        /**
         * @return authPrincipalType
         */
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        /**
         * @return encodedDiagnosticMessage
         */
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        /**
         * @return noPermissionType
         */
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private String authAction; 
            private String authPrincipalDisplayName; 
            private String authPrincipalOwnerId; 
            private String authPrincipalType; 
            private String encodedDiagnosticMessage; 
            private String noPermissionType; 
            private String policyType; 

            /**
             * AuthAction.
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * AuthPrincipalDisplayName.
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * AuthPrincipalOwnerId.
             */
            public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
                this.authPrincipalOwnerId = authPrincipalOwnerId;
                return this;
            }

            /**
             * AuthPrincipalType.
             */
            public Builder authPrincipalType(String authPrincipalType) {
                this.authPrincipalType = authPrincipalType;
                return this;
            }

            /**
             * EncodedDiagnosticMessage.
             */
            public Builder encodedDiagnosticMessage(String encodedDiagnosticMessage) {
                this.encodedDiagnosticMessage = encodedDiagnosticMessage;
                return this;
            }

            /**
             * NoPermissionType.
             */
            public Builder noPermissionType(String noPermissionType) {
                this.noPermissionType = noPermissionType;
                return this;
            }

            /**
             * PolicyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public AccessDeniedDetail build() {
                return new AccessDeniedDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScenePreviewDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetScenePreviewDataResponseBody</p>
     */
    public static class Position extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rotation")
        private java.util.List<Double> rotation;

        @com.aliyun.core.annotation.NameInMap("Spot")
        private java.util.List<Double> spot;

        @com.aliyun.core.annotation.NameInMap("Viewpoint")
        private java.util.List<Double> viewpoint;

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
        public java.util.List<Double> getRotation() {
            return this.rotation;
        }

        /**
         * @return spot
         */
        public java.util.List<Double> getSpot() {
            return this.spot;
        }

        /**
         * @return viewpoint
         */
        public java.util.List<Double> getViewpoint() {
            return this.viewpoint;
        }

        public static final class Builder {
            private java.util.List<Double> rotation; 
            private java.util.List<Double> spot; 
            private java.util.List<Double> viewpoint; 

            /**
             * Rotation.
             */
            public Builder rotation(java.util.List<Double> rotation) {
                this.rotation = rotation;
                return this;
            }

            /**
             * Spot.
             */
            public Builder spot(java.util.List<Double> spot) {
                this.spot = spot;
                return this;
            }

            /**
             * Viewpoint.
             */
            public Builder viewpoint(java.util.List<Double> viewpoint) {
                this.viewpoint = viewpoint;
                return this;
            }

            public Position build() {
                return new Position(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetScenePreviewDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetScenePreviewDataResponseBody</p>
     */
    public static class PanoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurRoomPicList")
        private java.util.List<String> curRoomPicList;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("FloorIdx")
        private String floorIdx;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MainImage")
        private Boolean mainImage;

        @com.aliyun.core.annotation.NameInMap("Neighbours")
        private java.util.List<String> neighbours;

        @com.aliyun.core.annotation.NameInMap("Position")
        private Position position;

        @com.aliyun.core.annotation.NameInMap("RawName")
        private String rawName;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        @com.aliyun.core.annotation.NameInMap("RoomIdx")
        private String roomIdx;

        @com.aliyun.core.annotation.NameInMap("SubSceneId")
        private String subSceneId;

        @com.aliyun.core.annotation.NameInMap("Token")
        private String token;

        @com.aliyun.core.annotation.NameInMap("VirtualId")
        private String virtualId;

        @com.aliyun.core.annotation.NameInMap("VirtualName")
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
        public java.util.List<String> getCurRoomPicList() {
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
        public java.util.List<String> getNeighbours() {
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
            private java.util.List<String> curRoomPicList; 
            private Boolean enabled; 
            private String floorIdx; 
            private String id; 
            private Boolean mainImage; 
            private java.util.List<String> neighbours; 
            private Position position; 
            private String rawName; 
            private String resource; 
            private String roomIdx; 
            private String subSceneId; 
            private String token; 
            private String virtualId; 
            private String virtualName; 

            /**
             * CurRoomPicList.
             */
            public Builder curRoomPicList(java.util.List<String> curRoomPicList) {
                this.curRoomPicList = curRoomPicList;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * FloorIdx.
             */
            public Builder floorIdx(String floorIdx) {
                this.floorIdx = floorIdx;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MainImage.
             */
            public Builder mainImage(Boolean mainImage) {
                this.mainImage = mainImage;
                return this;
            }

            /**
             * Neighbours.
             */
            public Builder neighbours(java.util.List<String> neighbours) {
                this.neighbours = neighbours;
                return this;
            }

            /**
             * Position.
             */
            public Builder position(Position position) {
                this.position = position;
                return this;
            }

            /**
             * RawName.
             */
            public Builder rawName(String rawName) {
                this.rawName = rawName;
                return this;
            }

            /**
             * Resource.
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * RoomIdx.
             */
            public Builder roomIdx(String roomIdx) {
                this.roomIdx = roomIdx;
                return this;
            }

            /**
             * SubSceneId.
             */
            public Builder subSceneId(String subSceneId) {
                this.subSceneId = subSceneId;
                return this;
            }

            /**
             * <p>token</p>
             * 
             * <strong>example:</strong>
             * <p>sIPGWRGLJHEIQE****</p>
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * VirtualId.
             */
            public Builder virtualId(String virtualId) {
                this.virtualId = virtualId;
                return this;
            }

            /**
             * VirtualName.
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
    /**
     * 
     * {@link GetScenePreviewDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetScenePreviewDataResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModelPath")
        private String modelPath;

        @com.aliyun.core.annotation.NameInMap("PanoList")
        private java.util.List<PanoList> panoList;

        @com.aliyun.core.annotation.NameInMap("TextureModelPath")
        private String textureModelPath;

        @com.aliyun.core.annotation.NameInMap("TexturePanoPath")
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
        public java.util.List<PanoList> getPanoList() {
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
            private java.util.List<PanoList> panoList; 
            private String textureModelPath; 
            private String texturePanoPath; 

            /**
             * ModelPath.
             */
            public Builder modelPath(String modelPath) {
                this.modelPath = modelPath;
                return this;
            }

            /**
             * PanoList.
             */
            public Builder panoList(java.util.List<PanoList> panoList) {
                this.panoList = panoList;
                return this;
            }

            /**
             * TextureModelPath.
             */
            public Builder textureModelPath(String textureModelPath) {
                this.textureModelPath = textureModelPath;
                return this;
            }

            /**
             * TexturePanoPath.
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
    /**
     * 
     * {@link GetScenePreviewDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetScenePreviewDataResponseBody</p>
     */
    public static class ButtonConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomText")
        private String customText;

        @com.aliyun.core.annotation.NameInMap("Type")
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
    /**
     * 
     * {@link GetScenePreviewDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetScenePreviewDataResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackgroundColor")
        private String backgroundColor;

        @com.aliyun.core.annotation.NameInMap("ButtonConfig")
        private ButtonConfig buttonConfig;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("FormImgSize")
        private java.util.List<Long> formImgSize;

        @com.aliyun.core.annotation.NameInMap("FormJumpType")
        private Boolean formJumpType;

        @com.aliyun.core.annotation.NameInMap("FormSelectImgType")
        private String formSelectImgType;

        @com.aliyun.core.annotation.NameInMap("Images")
        private java.util.List<String> images;

        @com.aliyun.core.annotation.NameInMap("IsTagVisibleBy3d")
        private Boolean isTagVisibleBy3d;

        @com.aliyun.core.annotation.NameInMap("Link")
        private String link;

        @com.aliyun.core.annotation.NameInMap("PanoId")
        private String panoId;

        @com.aliyun.core.annotation.NameInMap("Position")
        private java.util.List<Double> position;

        @com.aliyun.core.annotation.NameInMap("PositionPanoCube")
        private java.util.List<Double> positionPanoCube;

        @com.aliyun.core.annotation.NameInMap("RelatedPanoIds")
        private java.util.List<String> relatedPanoIds;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private Long sceneId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Video")
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
        public java.util.List<Long> getFormImgSize() {
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
        public java.util.List<String> getImages() {
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
        public java.util.List<Double> getPosition() {
            return this.position;
        }

        /**
         * @return positionPanoCube
         */
        public java.util.List<Double> getPositionPanoCube() {
            return this.positionPanoCube;
        }

        /**
         * @return relatedPanoIds
         */
        public java.util.List<String> getRelatedPanoIds() {
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
            private java.util.List<Long> formImgSize; 
            private Boolean formJumpType; 
            private String formSelectImgType; 
            private java.util.List<String> images; 
            private Boolean isTagVisibleBy3d; 
            private String link; 
            private String panoId; 
            private java.util.List<Double> position; 
            private java.util.List<Double> positionPanoCube; 
            private java.util.List<String> relatedPanoIds; 
            private Long sceneId; 
            private String title; 
            private String video; 

            /**
             * BackgroundColor.
             */
            public Builder backgroundColor(String backgroundColor) {
                this.backgroundColor = backgroundColor;
                return this;
            }

            /**
             * ButtonConfig.
             */
            public Builder buttonConfig(ButtonConfig buttonConfig) {
                this.buttonConfig = buttonConfig;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * FormImgSize.
             */
            public Builder formImgSize(java.util.List<Long> formImgSize) {
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
             * Images.
             */
            public Builder images(java.util.List<String> images) {
                this.images = images;
                return this;
            }

            /**
             * IsTagVisibleBy3d.
             */
            public Builder isTagVisibleBy3d(Boolean isTagVisibleBy3d) {
                this.isTagVisibleBy3d = isTagVisibleBy3d;
                return this;
            }

            /**
             * Link.
             */
            public Builder link(String link) {
                this.link = link;
                return this;
            }

            /**
             * PanoId.
             */
            public Builder panoId(String panoId) {
                this.panoId = panoId;
                return this;
            }

            /**
             * Position.
             */
            public Builder position(java.util.List<Double> position) {
                this.position = position;
                return this;
            }

            /**
             * PositionPanoCube.
             */
            public Builder positionPanoCube(java.util.List<Double> positionPanoCube) {
                this.positionPanoCube = positionPanoCube;
                return this;
            }

            /**
             * RelatedPanoIds.
             */
            public Builder relatedPanoIds(java.util.List<String> relatedPanoIds) {
                this.relatedPanoIds = relatedPanoIds;
                return this;
            }

            /**
             * SceneId.
             */
            public Builder sceneId(Long sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Video.
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
    /**
     * 
     * {@link GetScenePreviewDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetScenePreviewDataResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Position")
        private java.util.List<Double> position;

        @com.aliyun.core.annotation.NameInMap("PositionPanoCube")
        private java.util.List<Double> positionPanoCube;

        @com.aliyun.core.annotation.NameInMap("Type")
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
        public java.util.List<Double> getPosition() {
            return this.position;
        }

        /**
         * @return positionPanoCube
         */
        public java.util.List<Double> getPositionPanoCube() {
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
            private java.util.List<Double> position; 
            private java.util.List<Double> positionPanoCube; 
            private String type; 

            /**
             * Config.
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Position.
             */
            public Builder position(java.util.List<Double> position) {
                this.position = position;
                return this;
            }

            /**
             * PositionPanoCube.
             */
            public Builder positionPanoCube(java.util.List<Double> positionPanoCube) {
                this.positionPanoCube = positionPanoCube;
                return this;
            }

            /**
             * Type.
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
    /**
     * 
     * {@link GetScenePreviewDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetScenePreviewDataResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Model")
        private Model model;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

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
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Model model; 
            private java.util.List<Tags> tags; 

            /**
             * Model.
             */
            public Builder model(Model model) {
                this.model = model;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
