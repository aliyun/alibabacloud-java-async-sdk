// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceRequest</p>
 */
public class UpdateInstanceRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("clientToken")
    private String clientToken;

    @Query
    @NameInMap("ignoreStatus")
    private Boolean ignoreStatus;

    @Query
    @NameInMap("orderActionType")
    private String orderActionType;

    private UpdateInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clientToken = builder.clientToken;
        this.ignoreStatus = builder.ignoreStatus;
        this.orderActionType = builder.orderActionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ignoreStatus
     */
    public Boolean getIgnoreStatus() {
        return this.ignoreStatus;
    }

    /**
     * @return orderActionType
     */
    public String getOrderActionType() {
        return this.orderActionType;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceRequest, Builder> {
        private String instanceId; 
        private String clientToken; 
        private Boolean ignoreStatus; 
        private String orderActionType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.clientToken = response.clientToken;
            this.ignoreStatus = response.ignoreStatus;
            this.orderActionType = response.orderActionType;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ignoreStatus.
         */
        public Builder ignoreStatus(Boolean ignoreStatus) {
            this.putQueryParameter("ignoreStatus", ignoreStatus);
            this.ignoreStatus = ignoreStatus;
            return this;
        }

        /**
         * orderActionType.
         */
        public Builder orderActionType(String orderActionType) {
            this.putQueryParameter("orderActionType", orderActionType);
            this.orderActionType = orderActionType;
            return this;
        }

        @Override
        public UpdateInstanceRequest build() {
            return new UpdateInstanceRequest(this);
        } 

    } 

}
