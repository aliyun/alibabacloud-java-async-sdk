// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link UpdateCloudGtmInstanceConfigEnableStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateCloudGtmInstanceConfigEnableStatusRequest</p>
 */
public class UpdateCloudGtmInstanceConfigEnableStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private String configId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableStatus")
    private String enableStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private UpdateCloudGtmInstanceConfigEnableStatusRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clientToken = builder.clientToken;
        this.configId = builder.configId;
        this.enableStatus = builder.enableStatus;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCloudGtmInstanceConfigEnableStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return enableStatus
     */
    public String getEnableStatus() {
        return this.enableStatus;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<UpdateCloudGtmInstanceConfigEnableStatusRequest, Builder> {
        private String acceptLanguage; 
        private String clientToken; 
        private String configId; 
        private String enableStatus; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCloudGtmInstanceConfigEnableStatusRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clientToken = request.clientToken;
            this.configId = request.configId;
            this.enableStatus = request.enableStatus;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh-CN</strong>: Chinese</li>
         * <li><strong>en-US</strong> (default): English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The configuration ID of the access domain name. Two configuration IDs exist when the access domain name is bound to the same GTM instance but an A record and an AAAA record are configured for the access domain name. The configuration ID uniquely identifies a configuration.</p>
         * <p>You can call the <a href="~~ListCloudGtmInstanceConfigs~~">ListCloudGtmInstanceConfigs</a> operation to query the configuration ID of the access domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>Config-000**11</p>
         */
        public Builder configId(String configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * <p>The enabling state of the access domain name. Valid values:</p>
         * <ul>
         * <li>enable</li>
         * <li>disable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        public Builder enableStatus(String enableStatus) {
            this.putQueryParameter("EnableStatus", enableStatus);
            this.enableStatus = enableStatus;
            return this;
        }

        /**
         * <p>The ID of the Global Traffic Manager (GTM) 3.0 instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gtm-cn-wwo3a3hbz**</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public UpdateCloudGtmInstanceConfigEnableStatusRequest build() {
            return new UpdateCloudGtmInstanceConfigEnableStatusRequest(this);
        } 

    } 

}
