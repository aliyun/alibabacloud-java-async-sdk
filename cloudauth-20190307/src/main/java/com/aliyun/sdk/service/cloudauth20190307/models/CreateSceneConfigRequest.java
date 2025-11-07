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
 * {@link CreateSceneConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateSceneConfigRequest</p>
 */
public class CreateSceneConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sceneId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateSceneConfigRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.sceneId = builder.sceneId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSceneConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return sceneId
     */
    public Long getSceneId() {
        return this.sceneId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateSceneConfigRequest, Builder> {
        private String config; 
        private Long sceneId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateSceneConfigRequest request) {
            super(request);
            this.config = request.config;
            this.sceneId = request.sceneId;
            this.type = request.type;
        } 

        /**
         * <p>Intention authentication configuration, as a JSON string.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;faceCompareMode&quot;:&quot;AUTHORITY&quot;,&quot;certConfigs&quot;:[{&quot;index&quot;:0,&quot;openVoiceCompare&quot;:true,&quot;openCustomizedContent&quot;:true,&quot;model&quot;:&quot;FOLLOW&quot;}],&quot;screenEvidence&quot;:false}</p>
         */
        public Builder config(String config) {
            this.putBodyParameter("config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>Scene ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000014084</p>
         */
        public Builder sceneId(Long sceneId) {
            this.putBodyParameter("sceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>Configuration type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VOLUNTARY</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateSceneConfigRequest build() {
            return new CreateSceneConfigRequest(this);
        } 

    } 

}
