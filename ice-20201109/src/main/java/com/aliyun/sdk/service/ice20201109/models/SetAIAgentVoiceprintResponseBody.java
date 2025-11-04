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
 * {@link SetAIAgentVoiceprintResponseBody} extends {@link TeaModel}
 *
 * <p>SetAIAgentVoiceprintResponseBody</p>
 */
public class SetAIAgentVoiceprintResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VoiceprintId")
    private String voiceprintId;

    private SetAIAgentVoiceprintResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.voiceprintId = builder.voiceprintId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAIAgentVoiceprintResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return voiceprintId
     */
    public String getVoiceprintId() {
        return this.voiceprintId;
    }

    public static final class Builder {
        private String requestId; 
        private String voiceprintId; 

        private Builder() {
        } 

        private Builder(SetAIAgentVoiceprintResponseBody model) {
            this.requestId = model.requestId;
            this.voiceprintId = model.voiceprintId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400********55440000</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the registered voiceprint.</p>
         * 
         * <strong>example:</strong>
         * <p>vp_1699123456_8527</p>
         */
        public Builder voiceprintId(String voiceprintId) {
            this.voiceprintId = voiceprintId;
            return this;
        }

        public SetAIAgentVoiceprintResponseBody build() {
            return new SetAIAgentVoiceprintResponseBody(this);
        } 

    } 

}
