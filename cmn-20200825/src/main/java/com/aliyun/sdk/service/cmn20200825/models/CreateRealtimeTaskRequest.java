// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRealtimeTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateRealtimeTaskRequest</p>
 */
public class CreateRealtimeTaskRequest extends Request {
    @Body
    @NameInMap("CheckDuplicatePolicy")
    private String checkDuplicatePolicy;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("DeviceId")
    private String deviceId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("ItemName")
    private String itemName;

    @Body
    @NameInMap("Script")
    private String script;

    private CreateRealtimeTaskRequest(Builder builder) {
        super(builder);
        this.checkDuplicatePolicy = builder.checkDuplicatePolicy;
        this.clientToken = builder.clientToken;
        this.deviceId = builder.deviceId;
        this.instanceId = builder.instanceId;
        this.itemName = builder.itemName;
        this.script = builder.script;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRealtimeTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkDuplicatePolicy
     */
    public String getCheckDuplicatePolicy() {
        return this.checkDuplicatePolicy;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return itemName
     */
    public String getItemName() {
        return this.itemName;
    }

    /**
     * @return script
     */
    public String getScript() {
        return this.script;
    }

    public static final class Builder extends Request.Builder<CreateRealtimeTaskRequest, Builder> {
        private String checkDuplicatePolicy; 
        private String clientToken; 
        private String deviceId; 
        private String instanceId; 
        private String itemName; 
        private String script; 

        private Builder() {
            super();
        } 

        private Builder(CreateRealtimeTaskRequest request) {
            super(request);
            this.checkDuplicatePolicy = request.checkDuplicatePolicy;
            this.clientToken = request.clientToken;
            this.deviceId = request.deviceId;
            this.instanceId = request.instanceId;
            this.itemName = request.itemName;
            this.script = request.script;
        } 

        /**
         * 检查策略，是否进行已有设备ID和巡检项的检查。
         * <p>
         * - ERROR：不忽略，如果有运行中则报错。
         * - IGNORE：忽略重复检查。
         * - CURRENT：不忽略，如果有运行中则返回运行中。
         */
        public Builder checkDuplicatePolicy(String checkDuplicatePolicy) {
            this.putBodyParameter("CheckDuplicatePolicy", checkDuplicatePolicy);
            this.checkDuplicatePolicy = checkDuplicatePolicy;
            return this;
        }

        /**
         * 幂等校验 token。
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putBodyParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * 实例ID。
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 巡检项名字。
         */
        public Builder itemName(String itemName) {
            this.putBodyParameter("ItemName", itemName);
            this.itemName = itemName;
            return this;
        }

        /**
         * Script.
         */
        public Builder script(String script) {
            this.putBodyParameter("Script", script);
            this.script = script;
            return this;
        }

        @Override
        public CreateRealtimeTaskRequest build() {
            return new CreateRealtimeTaskRequest(this);
        } 

    } 

}
