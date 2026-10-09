// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeNetworkInstanceRelationListRequest} extends {@link RequestModel}
 *
 * <p>DescribeNetworkInstanceRelationListRequest</p>
 */
public class DescribeNetworkInstanceRelationListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectType")
    private String connectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallConfigureStatus")
    private String firewallConfigureStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInstanceId")
    private String networkInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeerNetworkInstanceId")
    private String peerNetworkInstanceId;

    private DescribeNetworkInstanceRelationListRequest(Builder builder) {
        super(builder);
        this.connectType = builder.connectType;
        this.firewallConfigureStatus = builder.firewallConfigureStatus;
        this.lang = builder.lang;
        this.networkInstanceId = builder.networkInstanceId;
        this.peerNetworkInstanceId = builder.peerNetworkInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkInstanceRelationListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectType
     */
    public String getConnectType() {
        return this.connectType;
    }

    /**
     * @return firewallConfigureStatus
     */
    public String getFirewallConfigureStatus() {
        return this.firewallConfigureStatus;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return networkInstanceId
     */
    public String getNetworkInstanceId() {
        return this.networkInstanceId;
    }

    /**
     * @return peerNetworkInstanceId
     */
    public String getPeerNetworkInstanceId() {
        return this.peerNetworkInstanceId;
    }

    public static final class Builder extends Request.Builder<DescribeNetworkInstanceRelationListRequest, Builder> {
        private String connectType; 
        private String firewallConfigureStatus; 
        private String lang; 
        private String networkInstanceId; 
        private String peerNetworkInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNetworkInstanceRelationListRequest request) {
            super(request);
            this.connectType = request.connectType;
            this.firewallConfigureStatus = request.firewallConfigureStatus;
            this.lang = request.lang;
            this.networkInstanceId = request.networkInstanceId;
            this.peerNetworkInstanceId = request.peerNetworkInstanceId;
        } 

        /**
         * <p>The connection type.</p>
         * 
         * <strong>example:</strong>
         * <p>cen</p>
         */
        public Builder connectType(String connectType) {
            this.putQueryParameter("ConnectType", connectType);
            this.connectType = connectType;
            return this;
        }

        /**
         * <p>The configuration status of Cloud Firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>notconfigured</p>
         */
        public Builder firewallConfigureStatus(String firewallConfigureStatus) {
            this.putQueryParameter("FirewallConfigureStatus", firewallConfigureStatus);
            this.firewallConfigureStatus = firewallConfigureStatus;
            return this;
        }

        /**
         * <p>The language of the response.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The ID of the local network instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2vcwkr****</p>
         */
        public Builder networkInstanceId(String networkInstanceId) {
            this.putQueryParameter("NetworkInstanceId", networkInstanceId);
            this.networkInstanceId = networkInstanceId;
            return this;
        }

        /**
         * <p>The ID of the peer network instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-dsf232d****</p>
         */
        public Builder peerNetworkInstanceId(String peerNetworkInstanceId) {
            this.putQueryParameter("PeerNetworkInstanceId", peerNetworkInstanceId);
            this.peerNetworkInstanceId = peerNetworkInstanceId;
            return this;
        }

        @Override
        public DescribeNetworkInstanceRelationListRequest build() {
            return new DescribeNetworkInstanceRelationListRequest(this);
        } 

    } 

}
