// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveSingleTaskForCreatingDnsHostRequest} extends {@link RequestModel}
 *
 * <p>SaveSingleTaskForCreatingDnsHostRequest</p>
 */
public class SaveSingleTaskForCreatingDnsHostRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnsName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dnsName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private SaveSingleTaskForCreatingDnsHostRequest(Builder builder) {
        super(builder);
        this.dnsName = builder.dnsName;
        this.instanceId = builder.instanceId;
        this.ip = builder.ip;
        this.lang = builder.lang;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveSingleTaskForCreatingDnsHostRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dnsName
     */
    public String getDnsName() {
        return this.dnsName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ip
     */
    public java.util.List < String > getIp() {
        return this.ip;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<SaveSingleTaskForCreatingDnsHostRequest, Builder> {
        private String dnsName; 
        private String instanceId; 
        private java.util.List < String > ip; 
        private String lang; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveSingleTaskForCreatingDnsHostRequest request) {
            super(request);
            this.dnsName = request.dnsName;
            this.instanceId = request.instanceId;
            this.ip = request.ip;
            this.lang = request.lang;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * DnsName.
         */
        public Builder dnsName(String dnsName) {
            this.putQueryParameter("DnsName", dnsName);
            this.dnsName = dnsName;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Ip.
         */
        public Builder ip(java.util.List < String > ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public SaveSingleTaskForCreatingDnsHostRequest build() {
            return new SaveSingleTaskForCreatingDnsHostRequest(this);
        } 

    } 

}
