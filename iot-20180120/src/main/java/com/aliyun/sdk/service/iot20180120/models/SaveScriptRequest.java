// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveScriptRequest} extends {@link RequestModel}
 *
 * <p>SaveScriptRequest</p>
 */
public class SaveScriptRequest extends Request {
    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("ParserId")
    @Validation(required = true, maximum = 99999999)
    private Long parserId;

    @Query
    @NameInMap("ScriptDraft")
    @Validation(required = true)
    private String scriptDraft;

    private SaveScriptRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.parserId = builder.parserId;
        this.scriptDraft = builder.scriptDraft;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveScriptRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return parserId
     */
    public Long getParserId() {
        return this.parserId;
    }

    /**
     * @return scriptDraft
     */
    public String getScriptDraft() {
        return this.scriptDraft;
    }

    public static final class Builder extends Request.Builder<SaveScriptRequest, Builder> {
        private String iotInstanceId; 
        private Long parserId; 
        private String scriptDraft; 

        private Builder() {
            super();
        } 

        private Builder(SaveScriptRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.parserId = request.parserId;
            this.scriptDraft = request.scriptDraft;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * ParserId.
         */
        public Builder parserId(Long parserId) {
            this.putQueryParameter("ParserId", parserId);
            this.parserId = parserId;
            return this;
        }

        /**
         * ScriptDraft.
         */
        public Builder scriptDraft(String scriptDraft) {
            this.putQueryParameter("ScriptDraft", scriptDraft);
            this.scriptDraft = scriptDraft;
            return this;
        }

        @Override
        public SaveScriptRequest build() {
            return new SaveScriptRequest(this);
        } 

    } 

}
