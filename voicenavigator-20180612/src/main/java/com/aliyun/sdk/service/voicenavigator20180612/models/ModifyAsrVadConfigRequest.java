// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAsrVadConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyAsrVadConfigRequest</p>
 */
public class ModifyAsrVadConfigRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("SpeechNoiseThreshold")
    @Validation(required = true)
    private String speechNoiseThreshold;

    private ModifyAsrVadConfigRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.speechNoiseThreshold = builder.speechNoiseThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAsrVadConfigRequest create() {
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
     * @return speechNoiseThreshold
     */
    public String getSpeechNoiseThreshold() {
        return this.speechNoiseThreshold;
    }

    public static final class Builder extends Request.Builder<ModifyAsrVadConfigRequest, Builder> {
        private String instanceId; 
        private String speechNoiseThreshold; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAsrVadConfigRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.speechNoiseThreshold = response.speechNoiseThreshold;
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
         * SpeechNoiseThreshold.
         */
        public Builder speechNoiseThreshold(String speechNoiseThreshold) {
            this.putQueryParameter("SpeechNoiseThreshold", speechNoiseThreshold);
            this.speechNoiseThreshold = speechNoiseThreshold;
            return this;
        }

        @Override
        public ModifyAsrVadConfigRequest build() {
            return new ModifyAsrVadConfigRequest(this);
        } 

    } 

}
