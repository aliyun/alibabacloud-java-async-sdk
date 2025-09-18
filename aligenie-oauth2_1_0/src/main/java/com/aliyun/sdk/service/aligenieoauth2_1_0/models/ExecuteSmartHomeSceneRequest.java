// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieoauth2_1_0.models;

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
 * {@link ExecuteSmartHomeSceneRequest} extends {@link RequestModel}
 *
 * <p>ExecuteSmartHomeSceneRequest</p>
 */
public class ExecuteSmartHomeSceneRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FamilyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String familyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneId;

    private ExecuteSmartHomeSceneRequest(Builder builder) {
        super(builder);
        this.familyId = builder.familyId;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteSmartHomeSceneRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return familyId
     */
    public String getFamilyId() {
        return this.familyId;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<ExecuteSmartHomeSceneRequest, Builder> {
        private String familyId; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteSmartHomeSceneRequest request) {
            super(request);
            this.familyId = request.familyId;
            this.sceneId = request.sceneId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2iS1AH5eo8qrw1PYBL/Ulq==</p>
         */
        public Builder familyId(String familyId) {
            this.putBodyParameter("FamilyId", familyId);
            this.familyId = familyId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Y1lCALepjYmTEouxsTrkjB==</p>
         */
        public Builder sceneId(String sceneId) {
            this.putBodyParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public ExecuteSmartHomeSceneRequest build() {
            return new ExecuteSmartHomeSceneRequest(this);
        } 

    } 

}
