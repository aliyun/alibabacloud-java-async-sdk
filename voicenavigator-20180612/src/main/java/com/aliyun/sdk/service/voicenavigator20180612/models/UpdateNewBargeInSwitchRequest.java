// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNewBargeInSwitchRequest} extends {@link RequestModel}
 *
 * <p>UpdateNewBargeInSwitchRequest</p>
 */
public class UpdateNewBargeInSwitchRequest extends Request {
    @Query
    @NameInMap("Enable")
    private Boolean enable;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    private UpdateNewBargeInSwitchRequest(Builder builder) {
        super(builder);
        this.enable = builder.enable;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNewBargeInSwitchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<UpdateNewBargeInSwitchRequest, Builder> {
        private Boolean enable; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNewBargeInSwitchRequest response) {
            super(response);
            this.enable = response.enable;
            this.instanceId = response.instanceId;
        } 

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public UpdateNewBargeInSwitchRequest build() {
            return new UpdateNewBargeInSwitchRequest(this);
        } 

    } 

}
