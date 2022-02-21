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
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    private LabelBuildRequest(Builder builder) {
        super(builder);
        this.mode = builder.mode;
        this.sceneId = builder.sceneId;
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
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<LabelBuildRequest, Builder> {
        private String mode; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(LabelBuildRequest response) {
            super(response);
            this.mode = response.mode;
            this.sceneId = response.sceneId;
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
         * 场景ID
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public LabelBuildRequest build() {
            return new LabelBuildRequest(this);
        } 

    } 

}
