// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadScriptRecordingRequest} extends {@link RequestModel}
 *
 * <p>DownloadScriptRecordingRequest</p>
 */
public class DownloadScriptRecordingRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ScriptId")
    @Validation(required = true)
    private String scriptId;

    @Query
    @NameInMap("Uuid")
    @Validation(required = true)
    private String uuid;

    private DownloadScriptRecordingRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.scriptId = builder.scriptId;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadScriptRecordingRequest create() {
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
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<DownloadScriptRecordingRequest, Builder> {
        private String instanceId; 
        private String scriptId; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DownloadScriptRecordingRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.scriptId = request.scriptId;
            this.uuid = request.uuid;
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
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DownloadScriptRecordingRequest build() {
            return new DownloadScriptRecordingRequest(this);
        } 

    } 

}
