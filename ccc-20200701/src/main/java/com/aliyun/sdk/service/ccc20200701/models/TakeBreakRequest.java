// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link TakeBreakRequest} extends {@link RequestModel}
 *
 * <p>TakeBreakRequest</p>
 */
public class TakeBreakRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private TakeBreakRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.deviceId = builder.deviceId;
        this.instanceId = builder.instanceId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TakeBreakRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<TakeBreakRequest, Builder> {
        private String code; 
        private String deviceId; 
        private String instanceId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(TakeBreakRequest request) {
            super(request);
            this.code = request.code;
            this.deviceId = request.deviceId;
            this.instanceId = request.instanceId;
            this.userId = request.userId;
        } 

        /**
         * <p>Break status code. Customers can define any custom break status.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lunchtime</p>
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>Device ID. This parameter is meaningless and can be filled with any value.</p>
         * 
         * <strong>example:</strong>
         * <p>device</p>
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * <p>Instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Agent ID. If not specified, the agent mapped to the current RAM account is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public TakeBreakRequest build() {
            return new TakeBreakRequest(this);
        } 

    } 

}
