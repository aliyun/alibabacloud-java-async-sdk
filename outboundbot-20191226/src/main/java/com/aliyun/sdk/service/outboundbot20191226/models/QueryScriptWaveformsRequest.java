// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryScriptWaveformsRequest} extends {@link RequestModel}
 *
 * <p>QueryScriptWaveformsRequest</p>
 */
public class QueryScriptWaveformsRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ScriptContent")
    @Validation(required = true)
    private String scriptContent;

    @Query
    @NameInMap("ScriptId")
    @Validation(required = true)
    private String scriptId;

    private QueryScriptWaveformsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.scriptContent = builder.scriptContent;
        this.scriptId = builder.scriptId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryScriptWaveformsRequest create() {
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
     * @return scriptContent
     */
    public String getScriptContent() {
        return this.scriptContent;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    public static final class Builder extends Request.Builder<QueryScriptWaveformsRequest, Builder> {
        private String instanceId; 
        private String scriptContent; 
        private String scriptId; 

        private Builder() {
            super();
        } 

        private Builder(QueryScriptWaveformsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.scriptContent = request.scriptContent;
            this.scriptId = request.scriptId;
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
         * ScriptContent.
         */
        public Builder scriptContent(String scriptContent) {
            this.putQueryParameter("ScriptContent", scriptContent);
            this.scriptContent = scriptContent;
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
        public QueryScriptWaveformsRequest build() {
            return new QueryScriptWaveformsRequest(this);
        } 

    } 

}
