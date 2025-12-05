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
 * {@link DeletePtsScenesRequest} extends {@link RequestModel}
 *
 * <p>DeletePtsScenesRequest</p>
 */
public class DeletePtsScenesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> sceneIds;

    private DeletePtsScenesRequest(Builder builder) {
        super(builder);
        this.sceneIds = builder.sceneIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePtsScenesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sceneIds
     */
    public java.util.List<String> getSceneIds() {
        return this.sceneIds;
    }

    public static final class Builder extends Request.Builder<DeletePtsScenesRequest, Builder> {
        private java.util.List<String> sceneIds; 

        private Builder() {
            super();
        } 

        private Builder(DeletePtsScenesRequest request) {
            super(request);
            this.sceneIds = request.sceneIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;XVB4DF&quot;,&quot;AFG3CV&quot;]</p>
         */
        public Builder sceneIds(java.util.List<String> sceneIds) {
            String sceneIdsShrink = shrink(sceneIds, "SceneIds", "json");
            this.putQueryParameter("SceneIds", sceneIdsShrink);
            this.sceneIds = sceneIds;
            return this;
        }

        @Override
        public DeletePtsScenesRequest build() {
            return new DeletePtsScenesRequest(this);
        } 

    } 

}
