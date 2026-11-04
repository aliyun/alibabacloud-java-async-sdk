// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link AddAgentDeviceRequest} extends {@link RequestModel}
 *
 * <p>AddAgentDeviceRequest</p>
 */
public class AddAgentDeviceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BrowserVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String browserVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientPort")
    private String clientPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private AddAgentDeviceRequest(Builder builder) {
        super(builder);
        this.browserVersion = builder.browserVersion;
        this.clientIp = builder.clientIp;
        this.clientPort = builder.clientPort;
        this.instanceId = builder.instanceId;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAgentDeviceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return browserVersion
     */
    public String getBrowserVersion() {
        return this.browserVersion;
    }

    /**
     * @return clientIp
     */
    public String getClientIp() {
        return this.clientIp;
    }

    /**
     * @return clientPort
     */
    public String getClientPort() {
        return this.clientPort;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<AddAgentDeviceRequest, Builder> {
        private String browserVersion; 
        private String clientIp; 
        private String clientPort; 
        private String instanceId; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(AddAgentDeviceRequest request) {
            super(request);
            this.browserVersion = request.browserVersion;
            this.clientIp = request.clientIp;
            this.clientPort = request.clientPort;
            this.instanceId = request.instanceId;
            this.remark = request.remark;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder browserVersion(String browserVersion) {
            this.putBodyParameter("BrowserVersion", browserVersion);
            this.browserVersion = browserVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder clientIp(String clientIp) {
            this.putQueryParameter("ClientIp", clientIp);
            this.clientIp = clientIp;
            return this;
        }

        /**
         * ClientPort.
         */
        public Builder clientPort(String clientPort) {
            this.putQueryParameter("ClientPort", clientPort);
            this.clientPort = clientPort;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putBodyParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public AddAgentDeviceRequest build() {
            return new AddAgentDeviceRequest(this);
        } 

    } 

}
