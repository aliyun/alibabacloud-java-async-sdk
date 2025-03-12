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
 * {@link AddRelativePositionRequest} extends {@link RequestModel}
 *
 * <p>AddRelativePositionRequest</p>
 */
public class AddRelativePositionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelativePosition")
    @com.aliyun.core.annotation.Validation(required = true)
    private String relativePosition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;：&quot;value&quot;}</p>
         */
        public Builder relativePosition(String relativePosition) {
            this.putQueryParameter("RelativePosition", relativePosition);
            this.relativePosition = relativePosition;
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

        @Override
        public AddRelativePositionRequest build() {
            return new AddRelativePositionRequest(this);
        } 

    } 

}
