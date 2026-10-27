// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

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
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Concurrency")
    private Integer concurrency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    private String scriptId;

    private UpdateScriptRequest(Builder builder) {
        super(builder);
        this.concurrency = builder.concurrency;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.scriptId = builder.scriptId;
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
     * @return concurrency
     */
    public Integer getConcurrency() {
        return this.concurrency;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    public static final class Builder extends Request.Builder<UpdateScriptRequest, Builder> {
        private Integer concurrency; 
        private String description; 
        private String instanceId; 
        private String name; 
        private String scriptId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateScriptRequest request) {
            super(request);
            this.concurrency = request.concurrency;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.scriptId = request.scriptId;
        } 

        /**
         * <p>The concurrency.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder concurrency(Integer concurrency) {
            this.putBodyParameter("Concurrency", concurrency);
            this.concurrency = concurrency;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>For testing</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>19ac2375-53e3-477f-abe9-6cd334227981</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The scenario name.</p>
         * 
         * <strong>example:</strong>
         * <p>Navigation test scenario</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>64241e64-190c-45d1-af66-06f51c07b090</p>
         */
        public Builder scriptId(String scriptId) {
            this.putBodyParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        @Override
        public UpdateScriptRequest build() {
            return new UpdateScriptRequest(this);
        } 

    } 

}
