// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveSingleTaskForDeletingDnsHostRequest} extends {@link RequestModel}
 *
 * <p>SaveSingleTaskForDeletingDnsHostRequest</p>
 */
public class SaveSingleTaskForDeletingDnsHostRequest extends Request {
    @Query
    @NameInMap("DnsName")
    @Validation(required = true)
    private String dnsName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Ip")
    @Validation(required = true)
    private java.util.List < String > ip;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private SaveSingleTaskForDeletingDnsHostRequest(Builder builder) {
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

    public static SaveSingleTaskForDeletingDnsHostRequest create() {
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

    public static final class Builder extends Request.Builder<SaveSingleTaskForDeletingDnsHostRequest, Builder> {
        private String dnsName; 
        private String instanceId; 
        private java.util.List < String > ip; 
        private String lang; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveSingleTaskForDeletingDnsHostRequest request) {
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
        public SaveSingleTaskForDeletingDnsHostRequest build() {
            return new SaveSingleTaskForDeletingDnsHostRequest(this);
        } 

    } 

}
