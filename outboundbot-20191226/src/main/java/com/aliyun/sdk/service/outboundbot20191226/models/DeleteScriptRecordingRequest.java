// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteScriptRecordingRequest} extends {@link RequestModel}
 *
 * <p>DeleteScriptRecordingRequest</p>
 */
public class DeleteScriptRecordingRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ScriptId")
    @Validation(required = true)
    private String scriptId;

    @Query
    @NameInMap("UuidsJson")
    private String uuidsJson;

    private DeleteScriptRecordingRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.scriptId = builder.scriptId;
        this.uuidsJson = builder.uuidsJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteScriptRecordingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return uuidsJson
     */
    public String getUuidsJson() {
        return this.uuidsJson;
    }

    public static final class Builder extends Request.Builder<DeleteScriptRecordingRequest, Builder> {
        private String instanceId; 
        private String scriptId; 
        private String uuidsJson; 

        private Builder() {
            super();
        } 

        private Builder(DeleteScriptRecordingRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.scriptId = request.scriptId;
            this.uuidsJson = request.uuidsJson;
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

        /**
         * UuidsJson.
         */
        public Builder uuidsJson(String uuidsJson) {
            this.putQueryParameter("UuidsJson", uuidsJson);
            this.uuidsJson = uuidsJson;
            return this;
        }

        @Override
        public DeleteScriptRecordingRequest build() {
            return new DeleteScriptRecordingRequest(this);
        } 

    } 

}
