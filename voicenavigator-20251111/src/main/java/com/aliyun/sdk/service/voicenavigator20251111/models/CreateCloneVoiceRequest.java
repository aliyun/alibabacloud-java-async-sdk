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
 * {@link CreateCloneVoiceRequest} extends {@link RequestModel}
 *
 * <p>CreateCloneVoiceRequest</p>
 */
public class CreateCloneVoiceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileKey")
    private String fileKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    private CreateCloneVoiceRequest(Builder builder) {
        super(builder);
        this.fileKey = builder.fileKey;
        this.instanceId = builder.instanceId;
        this.model = builder.model;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloneVoiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileKey
     */
    public String getFileKey() {
        return this.fileKey;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    public static final class Builder extends Request.Builder<CreateCloneVoiceRequest, Builder> {
        private String fileKey; 
        private String instanceId; 
        private String model; 

        private Builder() {
            super();
        } 

        private Builder(CreateCloneVoiceRequest request) {
            super(request);
            this.fileKey = request.fileKey;
            this.instanceId = request.instanceId;
            this.model = request.model;
        } 

        /**
         * FileKey.
         */
        public Builder fileKey(String fileKey) {
            this.putBodyParameter("FileKey", fileKey);
            this.fileKey = fileKey;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        @Override
        public CreateCloneVoiceRequest build() {
            return new CreateCloneVoiceRequest(this);
        } 

    } 

}
