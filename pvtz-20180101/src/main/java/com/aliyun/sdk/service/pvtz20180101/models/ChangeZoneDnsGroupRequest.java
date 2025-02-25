// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ChangeZoneDnsGroupRequest} extends {@link RequestModel}
 *
 * <p>ChangeZoneDnsGroupRequest</p>
 */
public class ChangeZoneDnsGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnsGroup")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dnsGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private ChangeZoneDnsGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dnsGroup = builder.dnsGroup;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeZoneDnsGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dnsGroup
     */
    public String getDnsGroup() {
        return this.dnsGroup;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<ChangeZoneDnsGroupRequest, Builder> {
        private String clientToken; 
        private String dnsGroup; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(ChangeZoneDnsGroupRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dnsGroup = request.dnsGroup;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see How to ensure idempotence.</p>
         * 
         * <strong>example:</strong>
         * <p>85456erer657cfgfg3437</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The logical location of the built-in authoritative module in which the zone is added. Valid values:</p>
         * <ul>
         * <li>Normal zone: regular module</li>
         * <li>Fast Zone: acceleration module</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL_ZONE</p>
         */
        public Builder dnsGroup(String dnsGroup) {
            this.putQueryParameter("DnsGroup", dnsGroup);
            this.dnsGroup = dnsGroup;
            return this;
        }

        /**
         * <p>The global ID of the zone.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e0cff188756b1d4579b25e54b66cb830</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public ChangeZoneDnsGroupRequest build() {
            return new ChangeZoneDnsGroupRequest(this);
        } 

    } 

}
