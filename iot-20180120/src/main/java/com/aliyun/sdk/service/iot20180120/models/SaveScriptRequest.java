// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link SaveScriptRequest} extends {@link RequestModel}
 *
 * <p>SaveScriptRequest</p>
 */
public class SaveScriptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParserId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 99999999)
    private Long parserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptDraft")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder parserId(Long parserId) {
            this.putQueryParameter("ParserId", parserId);
            this.parserId = parserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>var data = payload(&quot;json&quot;)</p>
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
