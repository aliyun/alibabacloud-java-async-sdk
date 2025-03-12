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
 * {@link LabelBuildRequest} extends {@link RequestModel}
 *
 * <p>LabelBuildRequest</p>
 */
public class LabelBuildRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelStyle")
    private String modelStyle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OptimizeWallWidth")
    private String optimizeWallWidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanStyle")
    private String planStyle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WallHeight")
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
         * Mode.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * ModelStyle.
         */
        public Builder modelStyle(String modelStyle) {
            this.putQueryParameter("ModelStyle", modelStyle);
            this.modelStyle = modelStyle;
            return this;
        }

        /**
         * OptimizeWallWidth.
         */
        public Builder optimizeWallWidth(String optimizeWallWidth) {
            this.putQueryParameter("OptimizeWallWidth", optimizeWallWidth);
            this.optimizeWallWidth = optimizeWallWidth;
            return this;
        }

        /**
         * PlanStyle.
         */
        public Builder planStyle(String planStyle) {
            this.putQueryParameter("PlanStyle", planStyle);
            this.planStyle = planStyle;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234****</p>
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * WallHeight.
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
