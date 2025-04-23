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
 * {@link UpdateCloudGtmInstanceConfigBasicRequest} extends {@link RequestModel}
 *
 * <p>UpdateCloudGtmInstanceConfigBasicRequest</p>
 */
public class UpdateCloudGtmInstanceConfigBasicRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleHostname")
    private String scheduleHostname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleZoneName")
    private String scheduleZoneName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ttl")
    private Integer ttl;

    private UpdateCloudGtmInstanceConfigBasicRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clientToken = builder.clientToken;
        this.configId = builder.configId;
        this.instanceId = builder.instanceId;
        this.scheduleHostname = builder.scheduleHostname;
        this.scheduleZoneName = builder.scheduleZoneName;
        this.ttl = builder.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCloudGtmInstanceConfigBasicRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return scheduleHostname
     */
    public String getScheduleHostname() {
        return this.scheduleHostname;
    }

    /**
     * @return scheduleZoneName
     */
    public String getScheduleZoneName() {
        return this.scheduleZoneName;
    }

    /**
     * @return ttl
     */
    public Integer getTtl() {
        return this.ttl;
    }

    public static final class Builder extends Request.Builder<UpdateCloudGtmInstanceConfigBasicRequest, Builder> {
        private String acceptLanguage; 
        private String clientToken; 
        private String configId; 
        private String instanceId; 
        private String scheduleHostname; 
        private String scheduleZoneName; 
        private Integer ttl; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCloudGtmInstanceConfigBasicRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clientToken = request.clientToken;
            this.configId = request.configId;
            this.instanceId = request.instanceId;
            this.scheduleHostname = request.scheduleHostname;
            this.scheduleZoneName = request.scheduleZoneName;
            this.ttl = request.ttl;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh-CN</strong>: Chinese</li>
         * <li><strong>en-US</strong> (default): English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en-US</p>
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
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2797349.html">ListCloudGtmInstanceConfigs</a> operation to query the value of ConfigId for the access domain name.</p>
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
         * <p>The ID of the GTM 3.0 instance for which you want to modify the TTL configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>gtm-cn-wwo3a3hbz**</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Host record of the domain accessed by GTM.</p>
         * 
         * <strong>example:</strong>
         * <p>www</p>
         */
        public Builder scheduleHostname(String scheduleHostname) {
            this.putQueryParameter("ScheduleHostname", scheduleHostname);
            this.scheduleHostname = scheduleHostname;
            return this;
        }

        /**
         * <p>The zone (such as example.com) or subzone (such as a.example.com) of the GTM access domain name. In most cases, the zone or subzone is hosted in Authoritative DNS Resolution of the Alibaba Cloud DNS console within the account to which the GTM instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder scheduleZoneName(String scheduleZoneName) {
            this.putQueryParameter("ScheduleZoneName", scheduleZoneName);
            this.scheduleZoneName = scheduleZoneName;
            return this;
        }

        /**
         * <p>The global TTL value, in seconds. The global TTL value affects how long the DNS records that map the access domain name to the addresses in the address pools are cached in the local DNS servers of Internet service providers (ISPs).</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder ttl(Integer ttl) {
            this.putQueryParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        @Override
        public UpdateCloudGtmInstanceConfigBasicRequest build() {
            return new UpdateCloudGtmInstanceConfigBasicRequest(this);
        } 

    } 

}
