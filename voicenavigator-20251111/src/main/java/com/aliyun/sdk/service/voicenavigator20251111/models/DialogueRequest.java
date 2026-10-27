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
 * {@link DialogueRequest} extends {@link RequestModel}
 *
 * <p>DialogueRequest</p>
 */
public class DialogueRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extras")
    private String extras;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    private String scriptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Utterance")
    private String utterance;

    private DialogueRequest(Builder builder) {
        super(builder);
        this.extras = builder.extras;
        this.instanceId = builder.instanceId;
        this.scriptId = builder.scriptId;
        this.sessionId = builder.sessionId;
        this.utterance = builder.utterance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DialogueRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extras
     */
    public String getExtras() {
        return this.extras;
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
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return utterance
     */
    public String getUtterance() {
        return this.utterance;
    }

    public static final class Builder extends Request.Builder<DialogueRequest, Builder> {
        private String extras; 
        private String instanceId; 
        private String scriptId; 
        private String sessionId; 
        private String utterance; 

        private Builder() {
            super();
        } 

        private Builder(DialogueRequest request) {
            super(request);
            this.extras = request.extras;
            this.instanceId = request.instanceId;
            this.scriptId = request.scriptId;
            this.sessionId = request.sessionId;
            this.utterance = request.utterance;
        } 

        /**
         * <p>Extras.
         * For example, a silence timeout: [{&quot;dataType&quot;:&quot;Silence&quot;}]</p>
         * <blockquote>
         * <p>Notice: Valid values for <code>dataType</code>: <code>DTMF</code>, <code>Silence</code>, or <code>RuntimePrompts</code>.</p>
         * </blockquote>
         * <blockquote>
         * <ul>
         * <li><p>If <code>dataType</code> is <code>DTMF</code>, use the format: <code>[{&quot;dataType&quot;:&quot;DTMF&quot;,&quot;dtmf&quot;:&quot;xxxx&quot;}]</code></p>
         * </li>
         * <li><p>If <code>dataType</code> is <code>Silence</code>, use the format: <code>[{&quot;dataType&quot;:&quot;Silence&quot;}]</code></p>
         * </li>
         * <li><p>If <code>dataType</code> is <code>RuntimePrompts</code>, use the format: <code>[{&quot;dataType&quot;:&quot;RuntimePrompts&quot;,&quot;prompts&quot;:&quot;xxxx&quot;,&quot;persistent&quot;:false/true}]</code></p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{
         *     &quot;dataType&quot;: &quot;Silence&quot;
         * }]</p>
         */
        public Builder extras(String extras) {
            this.putQueryParameter("Extras", extras);
            this.extras = extras;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36e9a4cd-a821-4f78-86fa-a9a4aefeea2e</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The script ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0a88e269-01f5-49ac-97af-5830f0ccb271</p>
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>07d72ea0-6e38-48d4-8371-14deaaba996f</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The user\&quot;s input for the conversational turn.</p>
         * 
         * <strong>example:</strong>
         * <p>行吧，那我就不打扰您了，再见。</p>
         */
        public Builder utterance(String utterance) {
            this.putQueryParameter("Utterance", utterance);
            this.utterance = utterance;
            return this;
        }

        @Override
        public DialogueRequest build() {
            return new DialogueRequest(this);
        } 

    } 

}
