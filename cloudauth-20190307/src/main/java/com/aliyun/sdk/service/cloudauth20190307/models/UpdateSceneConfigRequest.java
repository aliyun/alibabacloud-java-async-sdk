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
 * {@link UpdateSceneConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateSceneConfigRequest</p>
 */
public class UpdateSceneConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sceneId;

    private UpdateSceneConfigRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.id = builder.id;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSceneConfigRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return sceneId
     */
    public Long getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<UpdateSceneConfigRequest, Builder> {
        private String config; 
        private Long id; 
        private Long sceneId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSceneConfigRequest request) {
            super(request);
            this.config = request.config;
            this.id = request.id;
            this.sceneId = request.sceneId;
        } 

        /**
         * <p>Scene configuration information, in JSON format. For the specific structure definition, please refer to more information about the configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;faceCompareMode&quot;:&quot;AUTHORITY&quot;,&quot;certConfigs&quot;:[{&quot;index&quot;:0,&quot;model&quot;:&quot;ENROLL&quot;}],&quot;screenEvidence&quot;:false}</p>
         */
        public Builder config(String config) {
            this.putBodyParameter("config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>Willingness configuration ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>607</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>Selected authentication scene.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000012918</p>
         */
        public Builder sceneId(Long sceneId) {
            this.putBodyParameter("sceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public UpdateSceneConfigRequest build() {
            return new UpdateSceneConfigRequest(this);
        } 

    } 

}
