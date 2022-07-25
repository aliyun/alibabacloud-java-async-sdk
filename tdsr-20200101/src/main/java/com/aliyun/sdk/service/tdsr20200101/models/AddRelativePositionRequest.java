// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddRelativePositionRequest} extends {@link RequestModel}
 *
 * <p>AddRelativePositionRequest</p>
 */
public class AddRelativePositionRequest extends Request {
    @Query
    @NameInMap("RelativePosition")
    @Validation(required = true)
    private String relativePosition;

    @Query
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    private AddRelativePositionRequest(Builder builder) {
        super(builder);
        this.relativePosition = builder.relativePosition;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddRelativePositionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return relativePosition
     */
    public String getRelativePosition() {
        return this.relativePosition;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<AddRelativePositionRequest, Builder> {
        private String relativePosition; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(AddRelativePositionRequest request) {
            super(request);
            this.relativePosition = request.relativePosition;
            this.sceneId = request.sceneId;
        } 

        /**
         * 相对位置信息
         */
        public Builder relativePosition(String relativePosition) {
            this.putQueryParameter("RelativePosition", relativePosition);
            this.relativePosition = relativePosition;
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
        public AddRelativePositionRequest build() {
            return new AddRelativePositionRequest(this);
        } 

    } 

}
