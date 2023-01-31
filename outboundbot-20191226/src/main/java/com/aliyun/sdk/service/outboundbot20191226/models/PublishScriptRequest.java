// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishScriptRequest} extends {@link RequestModel}
 *
 * <p>PublishScriptRequest</p>
 */
public class PublishScriptRequest extends Request {
    @Query
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ScriptId")
    @Validation(required = true)
    private String scriptId;

    private PublishScriptRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.scriptId = builder.scriptId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishScriptRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    public static final class Builder extends Request.Builder<PublishScriptRequest, Builder> {
        private String description; 
        private String instanceId; 
        private String scriptId; 

        private Builder() {
            super();
        } 

        private Builder(PublishScriptRequest request) {
            super(request);
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.scriptId = request.scriptId;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ScriptId.
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        @Override
        public PublishScriptRequest build() {
            return new PublishScriptRequest(this);
        } 

    } 

}
