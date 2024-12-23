// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link UpdateScriptRequest} extends {@link RequestModel}
 *
 * <p>UpdateScriptRequest</p>
 */
public class UpdateScriptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Script")
    @com.aliyun.core.annotation.Validation(required = true)
    private Script script;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptType;

    private UpdateScriptRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.regionId = builder.regionId;
        this.script = builder.script;
        this.scriptId = builder.scriptId;
        this.scriptType = builder.scriptType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateScriptRequest create() {
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
     * @return script
     */
    public Script getScript() {
        return this.script;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return scriptType
     */
    public String getScriptType() {
        return this.scriptType;
    }

    public static final class Builder extends Request.Builder<UpdateScriptRequest, Builder> {
        private String clusterId; 
        private String regionId; 
        private Script script; 
        private String scriptId; 
        private String scriptType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateScriptRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.regionId = request.regionId;
            this.script = request.script;
            this.scriptId = request.scriptId;
            this.scriptType = request.scriptType;
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
         * <p>The script.</p>
         * <p>This parameter is required.</p>
         */
        public Builder script(Script script) {
            String scriptShrink = shrink(script, "Script", "json");
            this.putQueryParameter("Script", scriptShrink);
            this.script = script;
            return this;
        }

        /**
         * <p>The script ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-da7476a7679a4d4c9cede62ebe09****</p>
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
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

        @Override
        public UpdateScriptRequest build() {
            return new UpdateScriptRequest(this);
        } 

    } 

}
