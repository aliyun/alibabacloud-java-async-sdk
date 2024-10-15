// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateScriptRequest} extends {@link RequestModel}
 *
 * <p>CreateScriptRequest</p>
 */
public class CreateScriptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scripts")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Script > scripts;

    private CreateScriptRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.regionId = builder.regionId;
        this.scriptType = builder.scriptType;
        this.scripts = builder.scripts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScriptRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scriptType
     */
    public String getScriptType() {
        return this.scriptType;
    }

    /**
     * @return scripts
     */
    public java.util.List < Script > getScripts() {
        return this.scripts;
    }

    public static final class Builder extends Request.Builder<CreateScriptRequest, Builder> {
        private String clusterId; 
        private String regionId; 
        private String scriptType; 
        private java.util.List < Script > scripts; 

        private Builder() {
            super();
        } 

        private Builder(CreateScriptRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.regionId = request.regionId;
            this.scriptType = request.scriptType;
            this.scripts = request.scripts;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b933c5aac8fe****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The type of the script. Valid values:</p>
         * <ul>
         * <li>BOOTSTRAP: indicates a bootstrap action of the Elastic Compute Service (ECS) instance.</li>
         * <li>NORMAL: indicates a common script.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BOOTSTRAP</p>
         */
        public Builder scriptType(String scriptType) {
            this.putQueryParameter("ScriptType", scriptType);
            this.scriptType = scriptType;
            return this;
        }

        /**
         * <p>The scripts.</p>
         * <p>This parameter is required.</p>
         */
        public Builder scripts(java.util.List < Script > scripts) {
            this.putQueryParameter("Scripts", scripts);
            this.scripts = scripts;
            return this;
        }

        @Override
        public CreateScriptRequest build() {
            return new CreateScriptRequest(this);
        } 

    } 

}
