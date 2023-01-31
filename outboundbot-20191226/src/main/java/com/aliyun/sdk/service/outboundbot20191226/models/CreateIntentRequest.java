// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIntentRequest} extends {@link RequestModel}
 *
 * <p>CreateIntentRequest</p>
 */
public class CreateIntentRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IntentDescription")
    private String intentDescription;

    @Query
    @NameInMap("IntentName")
    @Validation(required = true)
    private String intentName;

    @Query
    @NameInMap("Keywords")
    private String keywords;

    @Query
    @NameInMap("ScriptId")
    @Validation(required = true)
    private String scriptId;

    @Query
    @NameInMap("Utterances")
    @Validation(required = true)
    private String utterances;

    private CreateIntentRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.intentDescription = builder.intentDescription;
        this.intentName = builder.intentName;
        this.keywords = builder.keywords;
        this.scriptId = builder.scriptId;
        this.utterances = builder.utterances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIntentRequest create() {
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
     * @return intentDescription
     */
    public String getIntentDescription() {
        return this.intentDescription;
    }

    /**
     * @return intentName
     */
    public String getIntentName() {
        return this.intentName;
    }

    /**
     * @return keywords
     */
    public String getKeywords() {
        return this.keywords;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return utterances
     */
    public String getUtterances() {
        return this.utterances;
    }

    public static final class Builder extends Request.Builder<CreateIntentRequest, Builder> {
        private String instanceId; 
        private String intentDescription; 
        private String intentName; 
        private String keywords; 
        private String scriptId; 
        private String utterances; 

        private Builder() {
            super();
        } 

        private Builder(CreateIntentRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.intentDescription = request.intentDescription;
            this.intentName = request.intentName;
            this.keywords = request.keywords;
            this.scriptId = request.scriptId;
            this.utterances = request.utterances;
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
         * IntentDescription.
         */
        public Builder intentDescription(String intentDescription) {
            this.putQueryParameter("IntentDescription", intentDescription);
            this.intentDescription = intentDescription;
            return this;
        }

        /**
         * IntentName.
         */
        public Builder intentName(String intentName) {
            this.putQueryParameter("IntentName", intentName);
            this.intentName = intentName;
            return this;
        }

        /**
         * Keywords.
         */
        public Builder keywords(String keywords) {
            this.putQueryParameter("Keywords", keywords);
            this.keywords = keywords;
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
         * Utterances.
         */
        public Builder utterances(String utterances) {
            this.putQueryParameter("Utterances", utterances);
            this.utterances = utterances;
            return this;
        }

        @Override
        public CreateIntentRequest build() {
            return new CreateIntentRequest(this);
        } 

    } 

}
