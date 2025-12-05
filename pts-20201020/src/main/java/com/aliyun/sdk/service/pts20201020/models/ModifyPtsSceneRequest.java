// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

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
 * {@link ModifyPtsSceneRequest} extends {@link RequestModel}
 *
 * <p>ModifyPtsSceneRequest</p>
 */
public class ModifyPtsSceneRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Scene")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scene;

    private ModifyPtsSceneRequest(Builder builder) {
        super(builder);
        this.scene = builder.scene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPtsSceneRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    public static final class Builder extends Request.Builder<ModifyPtsSceneRequest, Builder> {
        private String scene; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPtsSceneRequest request) {
            super(request);
            this.scene = request.scene;
        } 

        /**
         * <p>null</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SD6YZCI</p>
         */
        public Builder scene(String scene) {
            this.putBodyParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        @Override
        public ModifyPtsSceneRequest build() {
            return new ModifyPtsSceneRequest(this);
        } 

    } 

}
