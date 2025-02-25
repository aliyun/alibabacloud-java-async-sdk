// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

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
 * {@link DescribeRecordingRequest} extends {@link RequestModel}
 *
 * <p>DescribeRecordingRequest</p>
 */
public class DescribeRecordingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String conversationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedVoiceSliceRecording")
    private Boolean needVoiceSliceRecording;

    private DescribeRecordingRequest(Builder builder) {
        super(builder);
        this.conversationId = builder.conversationId;
        this.instanceId = builder.instanceId;
        this.needVoiceSliceRecording = builder.needVoiceSliceRecording;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecordingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return needVoiceSliceRecording
     */
    public Boolean getNeedVoiceSliceRecording() {
        return this.needVoiceSliceRecording;
    }

    public static final class Builder extends Request.Builder<DescribeRecordingRequest, Builder> {
        private String conversationId; 
        private String instanceId; 
        private Boolean needVoiceSliceRecording; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRecordingRequest request) {
            super(request);
            this.conversationId = request.conversationId;
            this.instanceId = request.instanceId;
            this.needVoiceSliceRecording = request.needVoiceSliceRecording;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abb4aa26-3a8e-43dd-82f8-0c3898c9c67f</p>
         */
        public Builder conversationId(String conversationId) {
            this.putQueryParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7cefbff0-8d50-4d6f-b93c-73cee23c1555</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NeedVoiceSliceRecording.
         */
        public Builder needVoiceSliceRecording(Boolean needVoiceSliceRecording) {
            this.putQueryParameter("NeedVoiceSliceRecording", needVoiceSliceRecording);
            this.needVoiceSliceRecording = needVoiceSliceRecording;
            return this;
        }

        @Override
        public DescribeRecordingRequest build() {
            return new DescribeRecordingRequest(this);
        } 

    } 

}
