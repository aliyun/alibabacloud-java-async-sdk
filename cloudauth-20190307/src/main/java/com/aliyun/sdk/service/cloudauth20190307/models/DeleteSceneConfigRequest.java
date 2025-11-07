// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DeleteSceneConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteSceneConfigRequest</p>
 */
public class DeleteSceneConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sceneConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sceneConfigId;

    private DeleteSceneConfigRequest(Builder builder) {
        super(builder);
        this.sceneConfigId = builder.sceneConfigId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSceneConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sceneConfigId
     */
    public Long getSceneConfigId() {
        return this.sceneConfigId;
    }

    public static final class Builder extends Request.Builder<DeleteSceneConfigRequest, Builder> {
        private Long sceneConfigId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSceneConfigRequest request) {
            super(request);
            this.sceneConfigId = request.sceneConfigId;
        } 

        /**
         * <p>ID of the intent authentication configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>559</p>
         */
        public Builder sceneConfigId(Long sceneConfigId) {
            this.putBodyParameter("sceneConfigId", sceneConfigId);
            this.sceneConfigId = sceneConfigId;
            return this;
        }

        @Override
        public DeleteSceneConfigRequest build() {
            return new DeleteSceneConfigRequest(this);
        } 

    } 

}
