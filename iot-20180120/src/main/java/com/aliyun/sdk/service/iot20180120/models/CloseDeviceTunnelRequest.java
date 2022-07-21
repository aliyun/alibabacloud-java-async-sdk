// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseDeviceTunnelRequest} extends {@link RequestModel}
 *
 * <p>CloseDeviceTunnelRequest</p>
 */
public class CloseDeviceTunnelRequest extends Request {
    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("TunnelId")
    @Validation(required = true)
    private String tunnelId;

    private CloseDeviceTunnelRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.tunnelId = builder.tunnelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloseDeviceTunnelRequest create() {
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
     * @return tunnelId
     */
    public String getTunnelId() {
        return this.tunnelId;
    }

    public static final class Builder extends Request.Builder<CloseDeviceTunnelRequest, Builder> {
        private String iotInstanceId; 
        private String tunnelId; 

        private Builder() {
            super();
        } 

        private Builder(CloseDeviceTunnelRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.tunnelId = request.tunnelId;
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
         * TunnelId.
         */
        public Builder tunnelId(String tunnelId) {
            this.putQueryParameter("TunnelId", tunnelId);
            this.tunnelId = tunnelId;
            return this;
        }

        @Override
        public CloseDeviceTunnelRequest build() {
            return new CloseDeviceTunnelRequest(this);
        } 

    } 

}
