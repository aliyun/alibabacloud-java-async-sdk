// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

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
 * {@link UpdateInstanceServerlessSwitchRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceServerlessSwitchRequest</p>
 */
public class UpdateInstanceServerlessSwitchRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerlessSwitch")
    private Boolean serverlessSwitch;

    private UpdateInstanceServerlessSwitchRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.serverlessSwitch = builder.serverlessSwitch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceServerlessSwitchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return serverlessSwitch
     */
    public Boolean getServerlessSwitch() {
        return this.serverlessSwitch;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceServerlessSwitchRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String instanceId; 
        private Boolean serverlessSwitch; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceServerlessSwitchRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.serverlessSwitch = request.serverlessSwitch;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amqp-cn-v0h1kb9nu***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ServerlessSwitch.
         */
        public Builder serverlessSwitch(Boolean serverlessSwitch) {
            this.putQueryParameter("ServerlessSwitch", serverlessSwitch);
            this.serverlessSwitch = serverlessSwitch;
            return this;
        }

        @Override
        public UpdateInstanceServerlessSwitchRequest build() {
            return new UpdateInstanceServerlessSwitchRequest(this);
        } 

    } 

}
