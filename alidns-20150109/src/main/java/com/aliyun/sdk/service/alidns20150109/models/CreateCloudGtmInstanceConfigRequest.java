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
 * {@link CreateCloudGtmInstanceConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateCloudGtmInstanceConfigRequest</p>
 */
public class CreateCloudGtmInstanceConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableStatus")
    private String enableStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleHostname")
    private String scheduleHostname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleRrType")
    private String scheduleRrType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleZoneMode")
    private String scheduleZoneMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleZoneName")
    private String scheduleZoneName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ttl")
    private Integer ttl;

    private CreateCloudGtmInstanceConfigRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clientToken = builder.clientToken;
        this.enableStatus = builder.enableStatus;
        this.instanceId = builder.instanceId;
        this.remark = builder.remark;
        this.scheduleHostname = builder.scheduleHostname;
        this.scheduleRrType = builder.scheduleRrType;
        this.scheduleZoneMode = builder.scheduleZoneMode;
        this.scheduleZoneName = builder.scheduleZoneName;
        this.ttl = builder.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudGtmInstanceConfigRequest create() {
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

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return scheduleHostname
     */
    public String getScheduleHostname() {
        return this.scheduleHostname;
    }

    /**
     * @return scheduleRrType
     */
    public String getScheduleRrType() {
        return this.scheduleRrType;
    }

    /**
     * @return scheduleZoneMode
     */
    public String getScheduleZoneMode() {
        return this.scheduleZoneMode;
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

    public static final class Builder extends Request.Builder<CreateCloudGtmInstanceConfigRequest, Builder> {
        private String acceptLanguage; 
        private String clientToken; 
        private String enableStatus; 
        private String instanceId; 
        private String remark; 
        private String scheduleHostname; 
        private String scheduleRrType; 
        private String scheduleZoneMode; 
        private String scheduleZoneName; 
        private Integer ttl; 

        private Builder() {
            super();
        } 

        private Builder(CreateCloudGtmInstanceConfigRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clientToken = request.clientToken;
            this.enableStatus = request.enableStatus;
            this.instanceId = request.instanceId;
            this.remark = request.remark;
            this.scheduleHostname = request.scheduleHostname;
            this.scheduleRrType = request.scheduleRrType;
            this.scheduleZoneMode = request.scheduleZoneMode;
            this.scheduleZoneName = request.scheduleZoneName;
            this.ttl = request.ttl;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh-CN: Chinese</li>
         * <li>en-US: English</li>
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
         * <p>The client token that is used to ensure the idempotence of the request. You can specify a custom value for this parameter, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
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
         * <p>The enabling state of the access domain name. Valid values:</p>
         * <ul>
         * <li>enable: The access domain name is enabled and the intelligent scheduling policy of the corresponding GTM instance takes effect.</li>
         * <li>disable: The access domain name is disabled and the intelligent scheduling policy of the corresponding GTM instance is unavailable.</li>
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
         * <p>The ID of the Global Traffic Manager (GTM) 3.0 instance. This ID uniquely identifies a GTM 3.0 instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gtm-cn-jmp3qnw**03</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The description of the access domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The hostname of the access domain name.</p>
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
         * <p>The type of the Domain Name System (DNS) record configured for the access domain name. Valid values:</p>
         * <ul>
         * <li>A: IPv4 address</li>
         * <li>AAAA: IPv6 address</li>
         * <li>CNAME: domain name</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        public Builder scheduleRrType(String scheduleRrType) {
            this.putQueryParameter("ScheduleRrType", scheduleRrType);
            this.scheduleRrType = scheduleRrType;
            return this;
        }

        /**
         * <p>The configuration mode of the access domain name. Valid values:</p>
         * <ul>
         * <li>sys_assign: system allocation. This mode is not supported.</li>
         * <li>custom: custom allocation. You must select a zone within the account to which the instance belongs and enter a hostname to generate an access domain name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder scheduleZoneMode(String scheduleZoneMode) {
            this.putQueryParameter("ScheduleZoneMode", scheduleZoneMode);
            this.scheduleZoneMode = scheduleZoneMode;
            return this;
        }

        /**
         * <p>The name of the parent zone for the access domain name configured in GTM. In most cases, the value of this parameter is the name of a zone hosted by Alibaba Cloud DNS. This zone belongs to the account to which the GTM instance belongs. You can specify the name of a zone or subzone.</p>
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
         * <p>The global time to live (TTL) period. Unit: seconds. The global TTL period affects how long the DNS records that map the access domain name to the addresses in the address pools are cached in the local DNS servers of Internet service providers (ISPs). You can specify a custom value.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder ttl(Integer ttl) {
            this.putQueryParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        @Override
        public CreateCloudGtmInstanceConfigRequest build() {
            return new CreateCloudGtmInstanceConfigRequest(this);
        } 

    } 

}
