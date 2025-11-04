// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ClearAIAgentVoiceprintRequest} extends {@link RequestModel}
 *
 * <p>ClearAIAgentVoiceprintRequest</p>
 */
public class ClearAIAgentVoiceprintRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoiceprintId")
    private String voiceprintId;

    private ClearAIAgentVoiceprintRequest(Builder builder) {
        super(builder);
        this.voiceprintId = builder.voiceprintId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClearAIAgentVoiceprintRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return voiceprintId
     */
    public String getVoiceprintId() {
        return this.voiceprintId;
    }

    public static final class Builder extends Request.Builder<ClearAIAgentVoiceprintRequest, Builder> {
        private String voiceprintId; 

        private Builder() {
            super();
        } 

        private Builder(ClearAIAgentVoiceprintRequest request) {
            super(request);
            this.voiceprintId = request.voiceprintId;
        } 

        /**
         * <p>The unique identifier for the voiceprint.</p>
         * 
         * <strong>example:</strong>
         * <p>vp_1699123456_8527</p>
         */
        public Builder voiceprintId(String voiceprintId) {
            this.putQueryParameter("VoiceprintId", voiceprintId);
            this.voiceprintId = voiceprintId;
            return this;
        }

        @Override
        public ClearAIAgentVoiceprintRequest build() {
            return new ClearAIAgentVoiceprintRequest(this);
        } 

    } 

}
