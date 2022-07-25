// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LabelBuildRequest} extends {@link RequestModel}
 *
 * <p>LabelBuildRequest</p>
 */
public class LabelBuildRequest extends Request {
    @Query
    @NameInMap("Mode")
    private String mode;

    @Query
    @NameInMap("ModelStyle")
    private String modelStyle;

    @Query
    @NameInMap("OptimizeWallWidth")
    private String optimizeWallWidth;

    @Query
    @NameInMap("PlanStyle")
    private String planStyle;

    @Query
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    @Query
    @NameInMap("WallHeight")
    private Long wallHeight;

    private LabelBuildRequest(Builder builder) {
        super(builder);
        this.mode = builder.mode;
        this.modelStyle = builder.modelStyle;
        this.optimizeWallWidth = builder.optimizeWallWidth;
        this.planStyle = builder.planStyle;
        this.sceneId = builder.sceneId;
        this.wallHeight = builder.wallHeight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LabelBuildRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return modelStyle
     */
    public String getModelStyle() {
        return this.modelStyle;
    }

    /**
     * @return optimizeWallWidth
     */
    public String getOptimizeWallWidth() {
        return this.optimizeWallWidth;
    }

    /**
     * @return planStyle
     */
    public String getPlanStyle() {
        return this.planStyle;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return wallHeight
     */
    public Long getWallHeight() {
        return this.wallHeight;
    }

    public static final class Builder extends Request.Builder<LabelBuildRequest, Builder> {
        private String mode; 
        private String modelStyle; 
        private String optimizeWallWidth; 
        private String planStyle; 
        private String sceneId; 
        private Long wallHeight; 

        private Builder() {
            super();
        } 

        private Builder(LabelBuildRequest request) {
            super(request);
            this.mode = request.mode;
            this.modelStyle = request.modelStyle;
            this.optimizeWallWidth = request.optimizeWallWidth;
            this.planStyle = request.planStyle;
            this.sceneId = request.sceneId;
            this.wallHeight = request.wallHeight;
        } 

        /**
         * 重建模式：MANUAL：手动（云端），默认，SEMI_AUTOMATIC：半自动（移动端）
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * 模型效果 PATCH：切片模型（默认） DEPTH：深度模型 VIRTUAL：虚拟模型 MOBILE：移动重建模型
         */
        public Builder modelStyle(String modelStyle) {
            this.putQueryParameter("ModelStyle", modelStyle);
            this.modelStyle = modelStyle;
            return this;
        }

        /**
         * 墙宽优化，OFF:关闭（默认） NORMAL：标准 ENHANCED：加强
         */
        public Builder optimizeWallWidth(String optimizeWallWidth) {
            this.putQueryParameter("OptimizeWallWidth", optimizeWallWidth);
            this.optimizeWallWidth = optimizeWallWidth;
            return this;
        }

        /**
         * 户型图，DEFAULT（默认），STANDARD（标准）
         */
        public Builder planStyle(String planStyle) {
            this.putQueryParameter("PlanStyle", planStyle);
            this.planStyle = planStyle;
            return this;
        }

        /**
         * 场景ID
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * 墙高，默认0不设置，范围200-1000. 单位cm
         */
        public Builder wallHeight(Long wallHeight) {
            this.putQueryParameter("WallHeight", wallHeight);
            this.wallHeight = wallHeight;
            return this;
        }

        @Override
        public LabelBuildRequest build() {
            return new LabelBuildRequest(this);
        } 

    } 

}
