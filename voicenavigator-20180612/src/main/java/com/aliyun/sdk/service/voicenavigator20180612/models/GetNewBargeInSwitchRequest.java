// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNewBargeInSwitchRequest} extends {@link RequestModel}
 *
 * <p>GetNewBargeInSwitchRequest</p>
 */
public class GetNewBargeInSwitchRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    private GetNewBargeInSwitchRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNewBargeInSwitchRequest create() {
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

    public static final class Builder extends Request.Builder<GetNewBargeInSwitchRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetNewBargeInSwitchRequest response) {
            super(response);
            this.instanceId = response.instanceId;
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
        public GetNewBargeInSwitchRequest build() {
            return new GetNewBargeInSwitchRequest(this);
        } 

    } 

}
