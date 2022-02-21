// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private SaveSingleTaskForDeletingDnsHostRequest(Builder builder) {
        super(builder);
        this.dnsName = builder.dnsName;
        this.instanceId = builder.instanceId;
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
        private String lang; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveSingleTaskForDeletingDnsHostRequest response) {
            super(response);
            this.dnsName = response.dnsName;
            this.instanceId = response.instanceId;
            this.lang = response.lang;
            this.userClientIp = response.userClientIp;
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
